package ccsds.handlers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import ccsds.FunctionalResourceModel.Directive;
import ccsds.FunctionalResourceModel.Event;
import ccsds.FunctionalResourceModel.FunctionalResource;
import ccsds.FunctionalResourceModel.FunctionalResourceModel;
import ccsds.FunctionalResourceModel.FunctionalResourceModelPackage;
import ccsds.FunctionalResourceModel.Oid;
import ccsds.FunctionalResourceModel.Parameter;
import ccsds.FunctionalResourceModel.Qualifier;
import ccsds.FunctionalResourceModel.TypedElement;
import ccsds.FunctionalResourceModel.Value;
import ccsds.FunctionalResourceModel.presentation.FunctionalResourceModelEditor;
import ccsds.fr.model.tools.Activator;
import ccsds.fr.model.tools.FrUtility;
import ccsds.fr.type.model.Asn1GenContext;
import ccsds.fr.type.model.frtypes.ExportWriter;
import ccsds.fr.type.model.frtypes.FrtypesFactory;
import ccsds.fr.type.model.frtypes.Module;
import ccsds.fr.type.model.frtypes.TypeDefinition;
import ccsds.fr.type.model.frtypes.impl.ObjectIdentifierImpl;
import ccsds.fr.type.model.frtypes.impl.TypeDefinitionImpl;
import ccsds.fr.type.model.frtypes.util.FrTypesUtil;

/**
 * Handler to create an ASN.1 module file from an FRM model active in an FRM editor. 
 *
 */
public class CreateFrAsnHandler extends AbstractHandler implements IHandler {

	private static final String VALUE = "Value";
	private static final String QUALIFIER = "Qualifier";
	private static final String EVENT = "Event";
	private static final String DIRECTIVE = "Directive";
	private static final String PARAM = "Param";
	private static final String FR = "Fr";	

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IEditorPart ep = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if(ep instanceof FunctionalResourceModelEditor) {
			
			// to avoid losing data in a text field with focus
			Control currentFocus = Display.getCurrent().getFocusControl();
			if(currentFocus!= null && currentFocus.getParent() != null && currentFocus.getParent().getParent() != null) {
				Control parent = currentFocus.getParent().getParent();
				parent.setFocus();
			}
			
			FunctionalResourceModelEditor editor = (FunctionalResourceModelEditor)ep;
			FunctionalResourceModel frm = editor.getModel();

			Module module = frm.getAsnTypeModule();
			
			if(module == null) {
				module = FrtypesFactory.eINSTANCE.createModule(); // some models may not have a module
			}
						
			CompoundCommand setTypeDefinitions = new MyCompoundCommand();

			Asn1GenContext.instance().setGeneration(true);
			Asn1GenContext.instance().setEditingDomain(editor.getEditingDomain());
			Asn1GenContext.instance().setCompoundCommand(setTypeDefinitions);
			try {
				// to correct names in the module write it to a temporary output...
				module.writeAsn1(0, new StringBuffer());
				
				createAsn1Module(EcoreUtil.copy(module), FrUtility.getFunctionalResources(frm), FrUtility.getProjectExplorerSelection(), setTypeDefinitions, editor.getEditingDomain());
				editor.getEditingDomain().getCommandStack().execute(setTypeDefinitions);
			} finally {
				Asn1GenContext.instance().setGeneration(false);
				Asn1GenContext.instance().setEditingDomain(null);
				Asn1GenContext.instance().setCompoundCommand(null);
			}
		}
		
		return null;
	}

	/**
	 * Creates an ASN.1 module from the FRM
	 * @param functionalResources		The frM to use
	 * @param frmFile					The file containing the FRM	
	 * @param editingDomain 
	 */
	private void createAsn1Module(Module module, FunctionalResource[] functionalResources, IFile frmFile, CompoundCommand cmdUpdateTypeDefinition, EditingDomain editingDomain) {
		
		StringBuffer asn1ModuleStr = new StringBuffer();
		List<String> exports = new LinkedList<String>();
		
		
		for(FunctionalResource fr : functionalResources) {
			// add an OID for the RF itslef
			module.getTypeDefinition().add(new TypeDefinitionProxy(fr.getClassifier() + FR, null, fr.getOid(), "", fr.getSemanticDefinition(), exports));
			
			addParamTypesAndOids(module, fr.getParameter(), exports, cmdUpdateTypeDefinition, editingDomain);
			addEventTypesAndOids(module, fr.getEvent(), exports, cmdUpdateTypeDefinition, editingDomain);
			addDirectiveTypesAndOids(module, fr.getDirectives(), exports, cmdUpdateTypeDefinition, editingDomain);
		}
		
		if(module.getName() == null || module.getName().length() == 0) {
			module.setName("CSTS-FUNCTIONAL-RESOURCE-TYPES");
		}
		
		checkDuplicates(exports);
		
		module.getExports().addAll(exports);
		module.writeAsn1(0, asn1ModuleStr);
		
		BufferedWriter writer = null;
		try {
			String fileName = frmFile.getLocation().removeFileExtension().toString() + ".asn";
			writer = new BufferedWriter(new FileWriter(fileName));
		    writer.write(asn1ModuleStr.toString());
		} catch(Exception e) {
			System.err.println("Error writing ASN.1 file " + e);
		} finally {
			if(writer != null) {
				try {
					Activator.getDefault().getLog().log(new Status(Status.INFO, Activator.PLUGIN_ID, "Created FRM ASN.1 module in file " + frmFile.getName()));
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		try {
			frmFile.getProject().refreshLocal(IResource.DEPTH_ONE, null);
		} catch (CoreException e) {
			e.printStackTrace();
		} 
	}

	/**
	 * Checks the duplicates in the given list and creates a warning for each duplicate
	 * @param l	The list to check
	 */
	private <T> void checkDuplicates(List<T> l) {	    
	    Set<T> uniques = new HashSet<T>();

	    for(T t : l) {
	        if(!uniques.add(t)) {
	        	warn("Duplicated type definition of " + t); 
	        }
	    }

	  
	}
	
	
	/**
	 * Adds ASN.1 type definitions for parameter types and the corresponding OID to the ASN.1 module
	 * @param module			The module to which the definitions are added
	 * @param frmParameters		The parameters for which the definitions are added to the module
	 * @param editingDomain 
	 * @param cmdUpdatetypeDefinition 
	 */
	private void addParamTypesAndOids(Module module, EList<Parameter> frmParameters, List<String> exports, CompoundCommand cmdUpdateTypeDefinitions, EditingDomain editingDomain) {
		for(Parameter param : frmParameters) {
			if(param.getTypeDef() != null) {
				module.getTypeDefinition().add(new TypeDefinitionProxy(param.getClassifier(), param.getTypeDef(), param.getTypeOid(), PARAM, param.getSemanticDefinition(), exports));
				updateTypeDefinitionString(param, cmdUpdateTypeDefinitions, editingDomain);
			}
		}
	}	
	
	/**
	 * Adds ASN.1 type definitions for directive/qualifier types and the corresponding OID to the ASN.1 module
	 * @param module			The module to which the definitions are added
	 * @param editingDomain 
	 * @param cmdUpdatetypeDefinition 
	 * @param frmParameters		The directives for which the definitions are added to the module
	 */
	private void addDirectiveTypesAndOids(Module module, EList<Directive> frmDirectives, List<String> exports, CompoundCommand cmdUpdateTypeDefinitions, EditingDomain editingDomain) {
		for(Directive directive : frmDirectives) {
			module.getTypeDefinition().add(new TypeDefinitionProxy(directive.getClassifier(), null, directive.getOid(), DIRECTIVE, directive.getSemanticDefinition(), exports));
			for(Qualifier qualifier : directive.getQualifier()) {
				if(qualifier.getTypeDef() != null) {
					module.getTypeDefinition().add(new TypeDefinitionProxy(qualifier.getClassifier(), qualifier.getTypeDef(), qualifier.getTypeOid(), QUALIFIER, qualifier.getSemanticDefinition(), exports));
					updateTypeDefinitionString(qualifier, cmdUpdateTypeDefinitions, editingDomain);
				}
			}
		}
	}

	/**
	 * Adds ASN.1 type definitions for events/values types and the corresponding OID to the ASN.1 module
	 * @param module			The module to which the definitions are added
	 * @param editingDomain 
	 * @param cmdUpdatetypeDefinition 
	 * @param frmParameters		The directives for which the definitions are added to the module
	 */
	private void addEventTypesAndOids(Module module, EList<Event> frmEvents, List<String> exports, CompoundCommand cmdUpdateTypeDefinitions, EditingDomain editingDomain) {
		for(Event event : frmEvents) {
			module.getTypeDefinition().add(new TypeDefinitionProxy(event.getClassifier(), null, event.getOid(), EVENT, event.getSemanticDefinition(), exports));
			for(Value value : event.getValue()) {
				if(value.getTypeDef() != null) {
					module.getTypeDefinition().add(new TypeDefinitionProxy(value.getClassifier(), value.getTypeDef(), value.getTypeOid(),VALUE, value.getSemanticDefinition(), exports));
					updateTypeDefinitionString(value, cmdUpdateTypeDefinitions, editingDomain);
				}
			}
		}
	}

	@Override
	public boolean isEnabled() {
		IEditorPart ep = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if(ep instanceof FunctionalResourceModelEditor) {
			return true;
		}
		return false;
	}	
	
	/**
	 * Adds a command to set the type definition property to the given compound command according to the ASN.1 generated from the
	 * given element if the type definition is empty.
	 * @param element					The element providing the ASN.1 
	 * @param cmdUpdateTypeDefinitions	The command to which the set command is eventually added
	 * @param editingDomain				The editing domain required to generate the set command
	 */
	private void updateTypeDefinitionString(TypedElement element, CompoundCommand cmdUpdateTypeDefinitions, EditingDomain editingDomain) {
		// update the type definition string unconditionally (overwrite)
		if(element.getTypeDef() != null) {
			// create the ASN.1
			StringBuffer output = new StringBuffer();
			element.getTypeDef().writeAsn1(0, output);
			
			if(element.getTypeDefinition() == null || element.getTypeDefinition().equals(output.toString()) == false) {
				
				SetCommand setTypeDefinition = new SetCommand(editingDomain, element,
						element.eClass().getEStructuralFeature(FunctionalResourceModelPackage.TYPED_ELEMENT__TYPE_DEFINITION),
						output.toString());
				
				cmdUpdateTypeDefinitions.append(setTypeDefinition);					
			}
		}
	}
	
	/**
	 * helper class to generate ASN.1 from the FRM.
	 */
	class TypeDefinitionProxy extends TypeDefinitionImpl {

		//private static final String TYPE_SUFFIX = "Type";
		private static final String OID_SUFFIX = "Oid";
		private final TypeDefinition definition;
		private final String comment;
		private final OidValue typeOid;

		/**
		 * Create a TypeDefinition proxy object with a type OID and a comment
		 * @param def
		 * @param typeOid
		 * @param comment
		 */
		public TypeDefinitionProxy(String typeName, TypeDefinition def, Oid typeOid, String oidSuffix, String comment, List<String> exports) {
			if(def != null) {
				//this.definition = EcoreUtil.copy(def); // why a copy?
				this.definition = def; 
				
				// #hd# always use the given type name to be consistent with the OID name
				//if(this.definition.getName() == null || this.definition.getName().length() == 0) {
					Asn1GenContext.instance().updateName(def, createTypeName(typeName, true));
					this.definition.setName(createTypeName(typeName, true));
				//}
				if(exports.contains(this.definition.getName()) == true) {
					warn("Duplicated type definition " + this.definition.getName());					
				}
				exports.add(this.definition.getName());
			} else {
				this.definition = null;
			}
			
			if(typeOid != null) {
				StringBuilder typeOidName = new StringBuilder(typeName);
				if(Character.isUpperCase(typeOidName.charAt(0))) {
					typeOidName.setCharAt(0, Character.toLowerCase(typeOidName.charAt(0)));
				}
				this.typeOid = new OidValue(createTypeName(typeOidName.toString(), false, oidSuffix + OID_SUFFIX), typeOid);

				if(exports.contains(this.typeOid.getName()) == true) {
					warn("Duplicated type OID definition " + this.typeOid.getName());
				}	
				
				exports.add(this.typeOid.getName());
				
			} else {
				this.typeOid = null;
			}
			
			
			
			if(comment != null) {
				this.comment = FrTypesUtil.createAsnComment(comment, 0);
			} else {
				this.comment = null;
			}
		}		

		@Override
		public
		void writeAsn1(int indentLevel, StringBuffer output) {
			if(this.comment != null) {
				output.append(System.lineSeparator() + System.lineSeparator() + this.comment);
			}
			
			output.append(System.lineSeparator());
			
			if(this.typeOid != null) { 
				typeOid.writeAsn1(indentLevel, output);
			} else {
				output.append(ExportWriter.COMMENT + " no type OID available");
			}
			
			output.append(System.lineSeparator() + System.lineSeparator());
			
			if(this.definition != null) {
				this.definition.writeAsn1(indentLevel, output);
			} else {
				//output.append(ExportWriter.COMMENT + " no type definition available" );
			}
		}
		
		/**
		 * Returns a constructed type name for the given FRM name.
		 * @param frmTypeName		The FRM type name
		 * @param startUpperCase	If true, the first character is converted to upper case		 
		 * @return
		 */
		private String createTypeName(String frmTypeName, boolean startUpperCase) {
			return createTypeName(frmTypeName, startUpperCase, "");
		}
		
		/**
		 * Returns a constructed type name for the given FRM name.
		 * @param frmTypeName		The FRM type name
		 * @param startUpperCase	If true, the first character is converted to upper case
		 * @param suffix			The appended suffix
		 * @return
		 */
		private String createTypeName(String frmTypeName, boolean startUpperCase, String suffix) {
			if(frmTypeName == null) {
				return "type name not set";
			}
			
			if(startUpperCase == true && frmTypeName.length() > 1) {
				return frmTypeName.substring(0, 1).toUpperCase() + frmTypeName.substring(1)  + suffix; 
			}
			
			return frmTypeName + suffix;
		}		
	}
	
	/**
	 * Helper to serialise an OID assignment with a value 
	 */
	class OidValue extends ObjectIdentifierImpl {
	
		private final String oidValue;
		private final String name;
		
		/**
		 * Construct an OID with the given value
		 * @param value
		 */
		public OidValue(String name, Oid value) {
			this.name = FrTypesUtil.getValidElementName(name, true);
			this.oidValue = ExportWriter.LCBRACE + ExportWriter.BLANK + value.toString().replace(".", " ") + ExportWriter.BLANK + ExportWriter.RCBRACE;
		}
		
		@Override
		public
		void writeAsn1(int indentLevel, StringBuffer output) {
			output.append(getName() + ExportWriter.INDENT);
			super.writeAsn1(indentLevel, output); // writes OBJECT IDENTIFIER
			output.append(ExportWriter.BLANK + ExportWriter.ASSIGN + ExportWriter.BLANK + this.getOidValue());
		}

		/**
		 * Returns the OID value
		 * @return
		 */
		public String getOidValue() {
			return oidValue;
		}
		
		/**
		 * @return The name of the OID
		 */
		public String getName() {
			return this.name;
		}
	}

	/**
	 * warning to the eclipse platform
	 * @param msg
	 */
	private void warn(String msg) {
		Activator.getDefault().getLog().log(new Status(Status.WARNING, Activator.PLUGIN_ID, msg));		
	}

}
