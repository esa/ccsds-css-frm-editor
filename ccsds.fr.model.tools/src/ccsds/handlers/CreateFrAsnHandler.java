package ccsds.handlers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

import ccsds.FunctionalResourceModel.Directive;
import ccsds.FunctionalResourceModel.Event;
import ccsds.FunctionalResourceModel.FunctionalResource;
import ccsds.FunctionalResourceModel.FunctionalResourceModel;
import ccsds.FunctionalResourceModel.Oid;
import ccsds.FunctionalResourceModel.Parameter;
import ccsds.FunctionalResourceModel.Qualifier;
import ccsds.FunctionalResourceModel.Value;
import ccsds.FunctionalResourceModel.presentation.FunctionalResourceModelEditor;
import ccsds.fr.model.tools.Activator;
import ccsds.fr.model.tools.FrUtility;
import ccsds.fr.type.model.frtypes.Asn1Writer;
import ccsds.fr.type.model.frtypes.Module;
import ccsds.fr.type.model.frtypes.TypeDefinition;
import ccsds.fr.type.model.frtypes.impl.ObjectIdentifierImpl;
import ccsds.fr.type.model.frtypes.impl.TypeDefinitionImpl;

/**
 * Handler to create an ASN.1 module file from an FRM model active in an FRM editor. 
 *
 */
public class CreateFrAsnHandler extends AbstractHandler implements IHandler {

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
		
			createAsn1Module(EcoreUtil.copy(frm.getAsnTypeModule()), FrUtility.getFunctionalResources(frm), FrUtility.getProjectExplorerSelection());
		}
		
		return null;
	}

	/**
	 * Creates an ASN.1 module from the FRM
	 * @param functionalResources		The frM to use
	 * @param frmFile					The file containing the FRM	
	 */
	private void createAsn1Module(Module module, FunctionalResource[] functionalResources, IFile frmFile) {
		StringBuffer asn1ModuleStr = new StringBuffer();
		List<String> exports = new LinkedList<String>();
		
		for(FunctionalResource fr : functionalResources) {
			addParamTypesAndOids(module, fr.getParameter(), exports);
			addEventTypesAndOids(module, fr.getEvent(), exports);
			addDirectiveTypesAndOids(module, fr.getDirectives(), exports);
		}
		
		if(module.getName() == null || module.getName().length() == 0) {
			module.setName("CSTS-FUNCTIONAL-RESOURCE-TYPES");
		}
		
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
	 * Adds ASN.1 type definitions for parameter types and the corresponding OID to the ASN.1 module
	 * @param module			The module to which the definitions are added
	 * @param frmParameters		The parameters for which the definitions are added to the module
	 */
	private void addParamTypesAndOids(Module module, EList<Parameter> frmParameters, List<String> exports) {
		for(Parameter param : frmParameters) {
			if(param.getTypeDef() != null) {
				module.getTypeDefinition().add(new TypeDefinitionProxy(param.getClassifier(), param.getTypeDef(), param.getTypeOid(), param.getSemanticDefinition(), exports));
			}
		}
	}	
	
	/**
	 * Adds ASN.1 type definitions for directive/qualifier types and the corresponding OID to the ASN.1 module
	 * @param module			The module to which the definitions are added
	 * @param frmParameters		The directives for which the definitions are added to the module
	 */
	private void addDirectiveTypesAndOids(Module module, EList<Directive> frmDirectives, List<String> exports) {
		for(Directive directive : frmDirectives) {
			for(Qualifier qualifier : directive.getQualifier()) {
				if(qualifier.getTypeDef() != null) {
					module.getTypeDefinition().add(new TypeDefinitionProxy(qualifier.getClassifier(), qualifier.getTypeDef(), qualifier.getTypeOid(), qualifier.getSemanticDefinition(), exports));
				}
			}
		}
	}

	/**
	 * Adds ASN.1 type definitions for events/values types and the corresponding OID to the ASN.1 module
	 * @param module			The module to which the definitions are added
	 * @param frmParameters		The directives for which the definitions are added to the module
	 */
	private void addEventTypesAndOids(Module module, EList<Event> frmEvents, List<String> exports) {
		for(Event event : frmEvents) {
			for(Value value : event.getValue()) {
				if(value.getTypeDef() != null) {
					module.getTypeDefinition().add(new TypeDefinitionProxy(value.getClassifier(), value.getTypeDef(), value.getTypeOid(), value.getSemanticDefinition(), exports));
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
	 * helper class to generate ASN.1 from the FRM.
	 */
	class TypeDefinitionProxy extends TypeDefinitionImpl {

		private static final String TYPE_SUFFIX = "Type";
		private final TypeDefinition definition;
		private final String comment;
		private final OidValue typeOid;

		/**
		 * Create a TypeDefinition proxy object with a type OID and a comment
		 * @param def
		 * @param typeOid
		 * @param comment
		 */
		public TypeDefinitionProxy(String typeName, TypeDefinition def, Oid typeOid, String comment, List<String> exports) {
			this.definition = EcoreUtil.copy(def);
			
			if(this.definition.getName() == null || this.definition.getName().length() == 0) {
				this.definition.setName(createTypeName(typeName, true));
			}
			exports.add(this.definition.getName());
			
			if(typeOid != null) {
				this.typeOid = new OidValue(createTypeName(typeName, false), typeOid);
				exports.add(this.typeOid.getName());
				
			} else {
				this.typeOid = null;
			}
			
			
			
			if(comment != null) {
				this.comment = createAsnComment(comment);
			} else {
				this.comment = null;
			}
		}		

		@Override
		public
		void writeAsn1(int indentLevel, StringBuffer output) {
			if(this.comment != null) {
				output.append(this.comment);
			}
			
			output.append(System.lineSeparator());
			
			if(this.typeOid != null) { 
				typeOid.writeAsn1(indentLevel, output);
			} else {
				output.append(Asn1Writer.COMMENT + " no type OID available");
			}
			
			output.append(System.lineSeparator() + System.lineSeparator());
			
			if(this.definition != null) {
				this.definition.writeAsn1(indentLevel, output);
			} else {
				output.append(Asn1Writer.COMMENT + " no type defintion available");
			}
		}

		/**
		 * Create a comment string which has the ASN.1 comment -- prepended for each line.
		 * In addition the comment is broken down into lines of length 80.
		 * @param commentString
		 * @return the ASN.1 comment string
		 */
		private String createAsnComment(String commentString) {
			if(commentString == null) {
				return null;
			}
			
			StringBuffer asnComment = new StringBuffer();
			
			// break in several lines
			final int lineLength = 80;
			int idx = 0;
			while(idx < commentString.length() && commentString.length() > 0) {
				int endIndex = idx + lineLength;
												
				if(endIndex >= commentString.length()) {
					endIndex = commentString.length();
				} else {
					endIndex = commentString.indexOf(" ", endIndex); // break the line at the next blank
					if(endIndex == -1 && commentString.length() > 0) {
						endIndex = commentString.length();
					}
				}
				
				asnComment.append(commentString.substring(idx, endIndex));
				
				if(endIndex != commentString.length()) {
					asnComment.append(System.lineSeparator());
				}
				idx = endIndex;
			}
			
			// prepend comments
			String comment = asnComment.toString().replaceAll("\r\n", "\n"); // DOS2UNIX
			comment = comment.replaceAll("\n", "\n" + Asn1Writer.COMMENT + Asn1Writer.BLANK);
			
			return Asn1Writer.COMMENT + Asn1Writer.BLANK + comment;
		}
		
		/**
		 * Returns a constructed type name for the given FRM name.
		 * @param frmTypeName		The FRM type name
		 * @param startUpperCase	If true, the first character is converted to upper case
		 * @return
		 */
		private String createTypeName(String frmTypeName, boolean startUpperCase) {
			if(frmTypeName == null) {
				return "type name not set";
			}
			
			if(startUpperCase == true && frmTypeName.length() > 1) {
				return frmTypeName.substring(0, 1).toUpperCase() + frmTypeName.substring(1)  + TYPE_SUFFIX; 
			}
			
			return frmTypeName + TYPE_SUFFIX;
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
			this.name = name;
			this.oidValue = Asn1Writer.LCBRACE + Asn1Writer.BLANK + value.toString().replace(".", " ") + Asn1Writer.BLANK + Asn1Writer.RCBRACE;
		}
		
		@Override
		public
		void writeAsn1(int indentLevel, StringBuffer output) {
			output.append(this.name + Asn1Writer.INDENT);
			super.writeAsn1(indentLevel, output); // writes OBJECT IDENTIFIER
			output.append(Asn1Writer.BLANK + Asn1Writer.ASSIGN + Asn1Writer.BLANK + this.getOidValue());
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

}
