package ccsds.handlers;

/*-
 * #%L
 * CCSDS Functional Resource Model Tools
 * %%
 * Copyright (C) 2022 European Space Agency
 * %%
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * #L%
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

import ccsds.FunctionalResourceModel.Annotation;
import ccsds.FunctionalResourceModel.DataUnit;
import ccsds.FunctionalResourceModel.Directive;
import ccsds.FunctionalResourceModel.Event;
import ccsds.FunctionalResourceModel.FunctionalResource;
import ccsds.FunctionalResourceModel.FunctionalResourceModel;
import ccsds.FunctionalResourceModel.FunctionalResourceModelPackage;
import ccsds.FunctionalResourceModel.FunctionalResourceSet;
import ccsds.FunctionalResourceModel.FunctionalResourceStratum;
import ccsds.FunctionalResourceModel.Oid;
import ccsds.FunctionalResourceModel.Parameter;
import ccsds.FunctionalResourceModel.Qualifier;
import ccsds.FunctionalResourceModel.TypedElement;
import ccsds.FunctionalResourceModel.Value;
import ccsds.FunctionalResourceModel.presentation.FunctionalResourceModelEditor;
import ccsds.fr.model.tools.Activator;
import ccsds.fr.model.tools.preferences.FrPreferenceConstants;
import ccsds.fr.type.model.ExportWriterContext;
import ccsds.fr.type.model.NameTool;
import ccsds.fr.type.model.XmlAttribute;
import ccsds.fr.type.model.XmlHelper;
import ccsds.fr.type.model.frtypes.ExportWriter;
import ccsds.fr.type.model.frtypes.FromModule;
import ccsds.fr.type.model.frtypes.FrtypesFactory;
import ccsds.fr.type.model.frtypes.Module;
import ccsds.fr.type.model.frtypes.ObjectIdentifier;
import ccsds.fr.type.model.frtypes.TypeDefinition;
import ccsds.fr.type.model.frtypes.impl.ObjectIdentifierImpl;
import ccsds.fr.type.model.frtypes.impl.TypeDefinitionImpl;
import ccsds.fr.type.model.frtypes.util.FrTypesUtil;
import ccsds.fr.utility.FrUtility;

/**
 * Handler to create an ASN.1 module file from an FRM model active in an FRM editor. 
 *
 */
public class CreateFrAsnXsdHandler extends AbstractHandler implements IHandler {

	private static final String FILE_EXT_XSD = ".xsd";
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
						
			CompoundCommand frmUpdateCompoundCmd = new MyCompoundCommand();

			ExportWriterContext.instance().setGeneration(true);
			ExportWriterContext.instance().setEditingDomain(editor.getEditingDomain());
			ExportWriterContext.instance().setCompoundCommand(frmUpdateCompoundCmd);
			try {
				// to correct names in the module write it to a temporary output...
				module.writeAsn1(0, new StringBuffer());
				
				createXsdModule(EcoreUtil.copy(module), frm, FrUtility.getProjectExplorerSelection(), frmUpdateCompoundCmd, editor.getEditingDomain());
				createAsn1Module(EcoreUtil.copy(module), FrUtility.getFunctionalResources(frm), FrUtility.getProjectExplorerSelection(), frmUpdateCompoundCmd, editor.getEditingDomain());
				
				editor.getEditingDomain().getCommandStack().execute(frmUpdateCompoundCmd);
				
				refreshProjects();
			} finally {
				ExportWriterContext.instance().setGeneration(false);
				ExportWriterContext.instance().setEditingDomain(null);
				ExportWriterContext.instance().setCompoundCommand(null);
			}
		}
		
		return null;
	}

	/**
	 * Refreshes the projects of hte workspace to see the newly generated files and folders
	 */
	private void refreshProjects() {
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		if(projects != null) {
			for(IProject p : projects) {
				try {
					p.refreshLocal(IResource.DEPTH_INFINITE, null);
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		}		
	}
	
	/**
	 * Gets and creates the XSD directory for the given FR
	 * @param frmFile
	 * @return The name of the XSD directory
	 */
	private String getXsdDirectory(IFile frmFile) {
		String xsdDir = frmFile.getLocation().removeFileExtension().toString();
		IFolder dir = frmFile.getProject().getFolder(frmFile.getProjectRelativePath().removeFileExtension());
		
		if(dir.exists() == false) {
			try {
				dir.create(IResource.NONE, true, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		
		return xsdDir;
	}
	
	/**
	 * Write the given XSD module to the given file name
	 * @param fileName	The file name to write to 
	 * @param module	The module to be written
	 */
	private void writeXsdModule(String fileName, Module module) {
		BufferedWriter writer = null;
		try {
			StringBuffer xsdModuleStr = new StringBuffer();
			Map<String, String> properties = new HashMap<String, String>();
			properties.put("ecore:documentRoot", "Functional Resources");
			module.writeXsd(0, xsdModuleStr, null, properties);
			writer = new BufferedWriter(new FileWriter(fileName));
		    writer.write(xsdModuleStr.toString());
		} catch(Exception e) {
			System.err.println("Error writing XSD file " + e);
		} finally {
			if(writer != null) {
				try {
					Activator.getDefault().getLog().log(new Status(Status.INFO, Activator.PLUGIN_ID, "Created FRM XSD file " + fileName));
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}							
	}
	
	/**
	 * Writes an XSD file for the base types and Functional Resource Strata or FRIM types
	 * Each stratum is represented by and elment and a cimplex type, e.g.
	 * 	<xsd:element name="apertureStratumParameters" type="ApertureStratumType" abstract="true"/>
	 *  <xsd:complexType name="ApertureStratumType"/>
	 * @param fileName
	 * @param functionalResourceStratum
	 */
	private void writeXsdGeneralTypes(String fileName, EList<FunctionalResourceStratum> functionalResourceStratum) {
		BufferedWriter writer = null;
		int indentLevel = 0;
		try {
			StringBuffer output = new StringBuffer();
			output.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>");
			
			XmlHelper.writeStartElement(output, indentLevel, XmlHelper.SCHEMA,
			new XmlAttribute(XmlHelper.XMLNS, XmlHelper.getTargetNamespace()),
			new XmlAttribute(XmlHelper.XMLNS + XmlHelper.COLON + XmlHelper.NS_XSD_PREFIX, XmlHelper.XSD_NS),
			new XmlAttribute(XmlHelper.ECORE_NS_PREFIX, XmlHelper.ECORE_NS),
			new XmlAttribute(XmlHelper.targetNamespace, XmlHelper.getTargetNamespace()),
			new XmlAttribute(XmlHelper.elementFormDefault, XmlHelper.elementFormDefaultVal),
			new XmlAttribute(XmlHelper.attributeFormDefault, XmlHelper.attributeFormDefaultVal),
			new XmlAttribute(XmlHelper.version, XmlHelper.versionVal));

			XmlHelper.doBreakIndent(output, indentLevel+1);
			
				
			if(ExportWriterContext.instance().getGenerateFrim() == true) {
				writeFrimTypes(output, indentLevel);
			} else {
				// ParameterBaseType
				XmlHelper.writeElement(output, indentLevel+1, XmlHelper.COMPLEX_TYPE,
						new XmlAttribute(XmlHelper.NAME, XmlHelper.getParameterBaseType()));							

				XmlHelper.doBreakIndent(output, indentLevel+1);
				
				// base type for the stratum types
				final String stratumeBaseType = "StratumBaseType";
				
				XmlHelper.doBreakIndent(output, indentLevel+1);
				
				// StratumBaseType
				XmlHelper.writeElement(output, indentLevel+1, XmlHelper.COMPLEX_TYPE,
						new XmlAttribute(XmlHelper.NAME, stratumeBaseType));							

				
				for(FunctionalResourceStratum stratum : functionalResourceStratum) {
					XmlHelper.writeElement(output, indentLevel+1, XmlHelper.ELEMENT, 
							new XmlAttribute(XmlHelper.NAME, XmlHelper.getFrStratumElementName(stratum.getName())),
							new XmlAttribute(XmlHelper.TYPE, XmlHelper.getFrStratumType(stratum.getName())),
							new XmlAttribute(XmlHelper.ABSTRACT, "true"));
					
					XmlHelper.writeStartElement(output, indentLevel+1, XmlHelper.COMPLEX_TYPE, 
							new XmlAttribute(XmlHelper.NAME, XmlHelper.getFrStratumType(stratum.getName())));
	
					XmlHelper.writeStartElement(output, indentLevel+2, XmlHelper.COMPLEX_CONTENT);
					
					XmlHelper.writeElement(output, indentLevel+3, XmlHelper.EXTENSION, 
							new XmlAttribute(XmlHelper.BASE, stratumeBaseType));
	
					XmlHelper.writeEndElement(output, indentLevel+2, XmlHelper.COMPLEX_CONTENT);			
	
					XmlHelper.writeEndElement(output, indentLevel+1, XmlHelper.COMPLEX_TYPE);
					
					XmlHelper.doBreakIndent(output, indentLevel+1);
				}
			}
			
			XmlHelper.writeEndElement(output, indentLevel, XmlHelper.SCHEMA);
			
			writer = new BufferedWriter(new FileWriter(fileName));
		    writer.write(output.toString());	
		} catch(Exception e) {
			System.err.println("Error writing Strata XSD file " + e);
		} finally {
			if(writer != null) {
				try {
					Activator.getDefault().getLog().log(new Status(Status.INFO, Activator.PLUGIN_ID, "Created FRM Strata XSD file " + fileName));
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}			
	}

	/**
	 * Write the FRIM abstract element functionalResourceInstance and the
	 * type definitions FunctionalResourceInstance and FunctionalResourceGroup
	 * @param output
	 * @param indentLevel
	 * @generated NOT
	 */
	private void writeFrimTypes(StringBuffer output, int indentLevel) {
		final String EXPRESSION = "Expression";
		final String EXPRESSION_REF = "ExpressionReference";
		
		// ParameterBaseType
		XmlHelper.writeStartElement(output, ++indentLevel, XmlHelper.COMPLEX_TYPE,
				new XmlAttribute(XmlHelper.NAME, XmlHelper.getParameterBaseType()));							
		
		XmlHelper.writeStartElement(output, ++indentLevel, XmlHelper.SEQUENCE);

		XmlHelper.writeElement(output, ++indentLevel, XmlHelper.ELEMENT,
				new XmlAttribute(XmlHelper.NAME, "expressionReference"),
				new XmlAttribute(XmlHelper.TYPE, EXPRESSION_REF),
				new XmlAttribute(XmlHelper.MIN_OCCURS, XmlHelper.ZERO),
				new XmlAttribute(XmlHelper.MAX_OCCURS, XmlHelper.UNBOUNDED));
		
		XmlHelper.writeEndElement(output, --indentLevel, XmlHelper.SEQUENCE);
		
//		XmlHelper.writeElement(output, indentLevel--, XmlHelper.ATTRIBUTE,
//				new XmlAttribute(XmlHelper.NAME, "expression"),
//				new XmlAttribute(XmlHelper.TYPE, XmlHelper.STRING),
//				new XmlAttribute(XmlHelper.USE, XmlHelper.OPTIONAL));				

		XmlHelper.writeEndElement(output, --indentLevel, XmlHelper.COMPLEX_TYPE);
		
		XmlHelper.doBreakIndent(output, indentLevel);

		// Expression Reference: reference to the expression and dependencies		
		XmlHelper.writeStartElement(output, ++indentLevel, XmlHelper.COMPLEX_TYPE,
				new XmlAttribute(XmlHelper.NAME, EXPRESSION_REF));							
		XmlHelper.writeStartElement(output, ++indentLevel, XmlHelper.SEQUENCE);
		
		XmlHelper.writeElement(output, ++indentLevel, XmlHelper.ELEMENT,
				new XmlAttribute(XmlHelper.NAME, "dependency"),
				new XmlAttribute(XmlHelper.TYPE, "Dependency"),
				new XmlAttribute(XmlHelper.MAX_OCCURS, XmlHelper.UNBOUNDED));

		XmlHelper.writeEndElement(output, --indentLevel, XmlHelper.SEQUENCE);

		XmlHelper.writeElement(output, indentLevel, XmlHelper.ATTRIBUTE,
				new XmlAttribute(XmlHelper.NAME, "expression"),
				new XmlAttribute(XmlHelper.TYPE, XmlHelper.ANY_URI),
				new XmlAttribute(XmlHelper.ECORE_REFERENCE, EXPRESSION));					

		XmlHelper.writeEndElement(output, --indentLevel, XmlHelper.COMPLEX_TYPE);

		XmlHelper.doBreakIndent(output, indentLevel);
		
		
		// expression type (placeholder)
		XmlHelper.writeStartElement(output, ++indentLevel, XmlHelper.COMPLEX_TYPE,
				new XmlAttribute(XmlHelper.NAME, EXPRESSION));							
		
		XmlHelper.writeElement(output, ++indentLevel, XmlHelper.ATTRIBUTE, 
				new XmlAttribute(XmlHelper.NAME, XmlHelper.NAME),
				new XmlAttribute(XmlHelper.TYPE, XmlHelper.STRING));
		
		XmlHelper.writeElement(output, indentLevel, XmlHelper.ATTRIBUTE, 
				new XmlAttribute(XmlHelper.NAME, "expressionURL"),
				new XmlAttribute(XmlHelper.TYPE, XmlHelper.STRING));
		
		XmlHelper.writeEndElement(output, --indentLevel, XmlHelper.COMPLEX_TYPE);
		
		XmlHelper.doBreakIndent(output, indentLevel);
		
		// Dependency
		XmlHelper.writeStartElement(output, indentLevel++, XmlHelper.COMPLEX_TYPE,
				new XmlAttribute(XmlHelper.NAME, "Dependency"));
		XmlHelper.writeElement(output, indentLevel, XmlHelper.ATTRIBUTE,
				new XmlAttribute(XmlHelper.NAME, "target"),
				new XmlAttribute(XmlHelper.TYPE, XmlHelper.ANY_URI),
				new XmlAttribute(XmlHelper.ECORE_REFERENCE, XmlHelper.getParameterBaseType()));					
		XmlHelper.writeEndElement(output, --indentLevel, XmlHelper.COMPLEX_TYPE);
		
		XmlHelper.doBreakIndent(output, indentLevel);

		// Functional resource Instance Element
		XmlHelper.writeElement(output, indentLevel, XmlHelper.ELEMENT,
				new XmlAttribute(XmlHelper.NAME, XmlHelper.getFrimBaseElementName()),
				new XmlAttribute(XmlHelper.TYPE, XmlHelper.getFrimBaseType()));
		
		//XmlHelper.doBreakIndent(output, indentLevel);
		
		// FunctionalResourceInstance
		XmlHelper.writeStartElement(output, indentLevel++, XmlHelper.COMPLEX_TYPE,
				new XmlAttribute(XmlHelper.NAME, XmlHelper.getFrimBaseType()),
				new XmlAttribute(XmlHelper.ABSTRACT, "true"));
		
		XmlHelper.writeElement(output, indentLevel, XmlHelper.ATTRIBUTE, 
				new XmlAttribute(XmlHelper.NAME, XmlHelper.NAME),
				new XmlAttribute(XmlHelper.TYPE, XmlHelper.STRING));

		XmlHelper.writeElement(output, indentLevel, XmlHelper.ATTRIBUTE, 
				new XmlAttribute(XmlHelper.NAME, "instanceNumber"),
				new XmlAttribute(XmlHelper.TYPE, XmlHelper.INTEGER));

		XmlHelper.writeEndElement(output, --indentLevel, XmlHelper.COMPLEX_TYPE);		
		
		XmlHelper.doBreakIndent(output, indentLevel+1);
		
		// functionalResourceGroup element
		XmlHelper.writeElement(output, indentLevel++, XmlHelper.ELEMENT, 
				new XmlAttribute(XmlHelper.NAME, XmlHelper.firstCharLowerCase(XmlHelper.getFgName())),
				new XmlAttribute(XmlHelper.TYPE, XmlHelper.getFgName()));

		// FunctionalResourceGroup type		
		XmlHelper.writeStartElement(output, indentLevel++, XmlHelper.COMPLEX_TYPE,
				new XmlAttribute(XmlHelper.NAME, XmlHelper.getFgName()));		
		XmlHelper.writeStartElement(output, indentLevel, XmlHelper.SEQUENCE);
		
		XmlHelper.writeElement(output, ++indentLevel, XmlHelper.ELEMENT,
				new XmlAttribute(XmlHelper.REF, XmlHelper.getFrimBaseElementName()),				
				new XmlAttribute(XmlHelper.MIN_OCCURS, "0"),
				new XmlAttribute(XmlHelper.MAX_OCCURS, XmlHelper.UNBOUNDED));
		
		XmlHelper.writeElement(output, indentLevel, XmlHelper.ELEMENT,
				new XmlAttribute(XmlHelper.NAME, XmlHelper.firstCharLowerCase(XmlHelper.getFgName())),
				new XmlAttribute(XmlHelper.TYPE, XmlHelper.getFgName()),
				new XmlAttribute(XmlHelper.MIN_OCCURS, "0"),
				new XmlAttribute(XmlHelper.MAX_OCCURS, XmlHelper.UNBOUNDED));		
		
		XmlHelper.writeElement(output, indentLevel, XmlHelper.ELEMENT,
				new XmlAttribute(XmlHelper.NAME, XmlHelper.firstCharLowerCase(EXPRESSION)),
				new XmlAttribute(XmlHelper.TYPE, EXPRESSION),
				new XmlAttribute(XmlHelper.MIN_OCCURS, "0"),
				new XmlAttribute(XmlHelper.MAX_OCCURS, XmlHelper.UNBOUNDED));		
				
		XmlHelper.writeEndElement(output, --indentLevel, XmlHelper.SEQUENCE);
		
		XmlHelper.writeElement(output, indentLevel, XmlHelper.ATTRIBUTE, 
				new XmlAttribute(XmlHelper.NAME, XmlHelper.NAME),
				new XmlAttribute(XmlHelper.TYPE, XmlHelper.STRING));
		
		XmlHelper.writeEndElement(output, --indentLevel, XmlHelper.COMPLEX_TYPE);		
		
		XmlHelper.doBreakIndent(output, indentLevel);
		
		// <xsd:element abstract="true" name="frmConfigParameter" type="ParameterBaseType"/>
		if(ExportWriterContext.instance().getXsdSubstitutionGroup() != null && ExportWriterContext.instance().getXsdSubstitutionGroup().length() > 0)
		{			
			XmlHelper.writeElement(output, indentLevel++, XmlHelper.ELEMENT,
					new XmlAttribute(XmlHelper.ABSTRACT, "true"),
					new XmlAttribute(XmlHelper.NAME, ExportWriterContext.instance().getXsdSubstitutionGroup()),
					new XmlAttribute(XmlHelper.TYPE, XmlHelper.getParameterBaseType()));
		}
	}		
	
	/**
	 * Returns the base type for the FR. the base type is
	 * either the FR classifier or the name of the FR Stratum the FR is contained within
	 * @param fr	The FR for which the base type is queried
	 * @return		The base type t use for this FR or null if it has no base type
	 */
	public static String getXsdBaseType(FunctionalResource fr) {
		if(fr.eContainer() instanceof FunctionalResourceSet) {
			if(fr.eContainer().eContainer() instanceof FunctionalResourceStratum) {
				String name = ((FunctionalResourceStratum)fr.eContainer().eContainer()).getName();
				if(name != null && name.length() > 0) {
					return XmlHelper.getFrStratumType(name); // remove blanks					
				}				
			}
		}
		
		return null;
	}
	
	/**
	 * Returns the base type for the FR. the base type is
	 * either the FR classifier or the name of the FR Stratum the FR is contained within
	 * @param fr	The FR for which the base type is queried
	 * @return		The base type t use for this FR
	 */
	public static String getXsdStratumName(FunctionalResource fr) {
		if(fr.eContainer() instanceof FunctionalResourceSet) {
			if(fr.eContainer().eContainer() instanceof FunctionalResourceStratum) {
				String name = ((FunctionalResourceStratum)fr.eContainer().eContainer()).getName();
				if(name != null && name.length() > 0) {
					return XmlHelper.removeBlanks(name); // remove blanks					
				}				
			}
		}
		
		return XmlHelper.getFrType(fr.getClassifierWellFormed());
	}	
	
	/**
	 * Returns true if the given FR is contained in a FR Stratum
	 * @param fr
	 * @return
	 */
	private boolean isInStratum(FunctionalResource fr) {
		try {
			if(fr.eContainer().eContainer() instanceof FunctionalResourceStratum) {
				return true;
			}
		} catch(Exception e) {
		}
		
		return false;
	}
	/**
	 * Create XSD type modules for the FRM
	 * @param module						The general type module of the FRM
	 * @param frm							The FRM
	 * @param frmFile						The file containing the FRM
	 * @param cmdUpdateTypeDefinition		A compound command to perform updates to the FRM
	 * @param editingDomain					The editing domain of the FRM
	 */
	private void createXsdModule(Module module, FunctionalResourceModel frm, IFile frmFile, CompoundCommand cmdUpdateTypeDefinition, EditingDomain editingDomain) {
		List<String> xsdExports = new LinkedList<String>();
		List<String> xsdFiles = new LinkedList<String>();

		try {
			// create abstract types for each stratum
			for(FunctionalResourceStratum stratum : frm.getFunctionalResourceStratum()) {
				ExportWriterContext.instance().getAbstractTypes().add(XmlHelper.removeBlanks(stratum.getName()));
			}
			
			// initialize the context for FRIM generation based on the preferences
			IPreferenceStore store = Activator.getDefault().getPreferenceStore();			
			ExportWriterContext.instance().setGenerateFrim(store.getBoolean(FrPreferenceConstants.P_FRIM_GENERATION));
			ExportWriterContext.instance().setGenerateOnlyCfgParams(store.getBoolean(FrPreferenceConstants.P_GENERATE_CFGPARAMS_ONLY));
			ExportWriterContext.instance().setXsdSubstitutionGroup(store.getString(FrPreferenceConstants.P_PARAMS_SUBSTITUTION_GROUP));
			ExportWriterContext.instance().setTargetNsFrm(store.getString(FrPreferenceConstants.P_FRM_TARGET_NS));
			ExportWriterContext.instance().setTargetNsFrim(store.getString(FrPreferenceConstants.P_FRIM_TARGET_NS));
			
			// write the general XSD type module
			ExportWriterContext.instance().setCurrentBaseType(null);
			writeXsdModule(getXsdDirectory(frmFile) + File.separatorChar + XmlHelper.GENERAL_XSD, module);
			writeXsdGeneralTypes(getXsdDirectory(frmFile) + File.separatorChar + XmlHelper.ABSTRACT_FR_TYPES_XSD, frm.getFunctionalResourceStratum());
						
			Module frimModule = FrtypesFactory.eINSTANCE.createModule();
			FunctionalResource[] functionalResources = FrUtility.getFunctionalResources(frm);		
			// write one module / XSD per FR
			for(FunctionalResource fr : functionalResources) {
				try {
					Module frModule = FrtypesFactory.eINSTANCE.createModule();
					FromModule importGeneralXsd = FrtypesFactory.eINSTANCE.createFromModule();
					importGeneralXsd.setName(XmlHelper.GENERAL_XSD);
					frModule.getImports().add(importGeneralXsd);
					
					FromModule importStrataXsd = FrtypesFactory.eINSTANCE.createFromModule();
					importStrataXsd.setName(XmlHelper.ABSTRACT_FR_TYPES_XSD);
					frModule.getImports().add(importStrataXsd);
	
					// set the FR into the export context for XSD generation purposes				
					ExportWriterContext.instance().setInStratum(isInStratum(fr));
					//ExportWriterContext.instance().setCurrentBaseType(getXsdBaseType(fr)); // TODO set a different abstract base type for parameters
					ExportWriterContext.instance().setCurrentBaseType(XmlHelper.getParameterBaseType());
					ExportWriterContext.instance().setCurrentStratumElement(getXsdStratumName(fr));
					
					// add an OID for the RF itself
					frModule.getTypeDefinition().add(new TypeDefinitionProxy(fr.getClassifierWellFormed() + FR, null, fr.getOid(), "", fr.getSemanticDefinition(), xsdExports));
					
					frModule.getTypeDefinition().add(new FrXsdExportAdapter(fr)); // add the FR to be able to create an XSD type per FR
					addParamTypesAndOids(frModule, fr.getParameter(), xsdExports, cmdUpdateTypeDefinition, editingDomain);
					addEventTypesAndOids(frModule, fr.getEvent(), xsdExports, cmdUpdateTypeDefinition, editingDomain);
					addDirectiveTypesAndOids(frModule, fr.getDirectives(), xsdExports, cmdUpdateTypeDefinition, editingDomain);
					addDataUnits(frModule, fr.getDataUnit(), xsdExports, cmdUpdateTypeDefinition, editingDomain);
					
					final String frXsdFile = fr.getClassifierWellFormed() + FILE_EXT_XSD;
					writeXsdModule(getXsdDirectory(frmFile) + File.separatorChar + frXsdFile, frModule);
					xsdFiles.add(frXsdFile);
					
					// create an import for each created FR XSD
					final FromModule importFrXsd = FrtypesFactory.eINSTANCE.createFromModule();
					importFrXsd.setName(frXsdFile);
					frimModule.getImports().add(importFrXsd);
				} catch(Exception e) {
					Activator.getDefault().getLog().log(new Status(Status.WARNING, Activator.PLUGIN_ID, "Exception creating XSD for FR " 
							+ fr.getClassifier() + " " + e));
				}
			}
			
			createTopLevelXsd(getXsdDirectory(frmFile), xsdFiles);
			
			if(ExportWriterContext.instance().getGenerateFrim() == true) {
				writeXsdModule(getXsdDirectory(frmFile) + File.separatorChar + "frim.xsd", frimModule);
			}
			
		} catch(Exception e) {
			Activator.getDefault().getLog().log(new Status(Status.WARNING, Activator.PLUGIN_ID, "Exception creating XSD:" 
					+ " " + e));			
		} finally {
			ExportWriterContext.instance().getAbstractTypes().clear();
		}
	}

	/**
	 * Create an XSD to include all XSD files given as arguments
	 * @param xsdDirectory	The XSD files to include
	 * @param xsdFiles		The directory to hold the created file
	 */
	private void createTopLevelXsd(String xsdDirectory, List<String> xsdFiles) {
		try (Writer writer = new BufferedWriter(new FileWriter(xsdDirectory + File.separator + "AllFunctionaResources" + FILE_EXT_XSD))) {
			StringBuffer xsdTopLevelStr = new StringBuffer();
			Module topLevelModule = FrtypesFactory.eINSTANCE.createModule();
			
			for(String xsdFile : xsdFiles) {
				FromModule importedXsdModule = FrtypesFactory.eINSTANCE.createFromModule();
				importedXsdModule.setName(xsdFile);
				topLevelModule.getImports().add(importedXsdModule);
			}
			
			
			topLevelModule.writeXsd(2, xsdTopLevelStr, null, null);
			writer.write(xsdTopLevelStr.toString());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * Creates an ASN.1 module and an XSD from the FRM
	 * @param functionalResources		The frM to use
	 * @param frmFile					The file containing the FRM	
	 * @param editingDomain 
	 */
	private void createAsn1Module(Module module, FunctionalResource[] functionalResources, IFile frmFile, CompoundCommand cmdUpdateTypeDefinition, EditingDomain editingDomain) {		
		// prepare an ASN.1 module containing all type definitions of all FRs
		List<String> exports = new LinkedList<String>();
		for(FunctionalResource fr : functionalResources) {
			// add an OID for the RF itslef
			module.getTypeDefinition().add(new TypeDefinitionProxy(fr.getClassifier() + FR, null, fr.getOid(), "", fr.getSemanticDefinition(), exports));
			
			addParamTypesAndOids(module, fr.getParameter(), exports, cmdUpdateTypeDefinition, editingDomain);
			addEventTypesAndOids(module, fr.getEvent(), exports, cmdUpdateTypeDefinition, editingDomain);
			addDirectiveTypesAndOids(module, fr.getDirectives(), exports, cmdUpdateTypeDefinition, editingDomain);
			addDataUnits(module, fr.getDataUnit(), exports, cmdUpdateTypeDefinition, editingDomain);
		}
		
		if(module.getName() == null || module.getName().length() == 0) {
			module.setName("CSTS-FUNCTIONAL-RESOURCE-TYPES");
		}
		
		checkDuplicates(exports);

		// write ASN.1
		BufferedWriter writer = null;
		String fileName = "";
		try {
			StringBuffer asn1ModuleStr = new StringBuffer();
			module.getExports().addAll(exports);
			module.writeAsn1(0, asn1ModuleStr);
			fileName = frmFile.getLocation().removeFileExtension().toString() + ".asn";
			writer = new BufferedWriter(new FileWriter(fileName));
		    writer.write(asn1ModuleStr.toString());
		} catch(Exception e) {
			System.err.println("Error writing ASN.1 file " + e);
		} finally {
			if(writer != null) {
				try {
					Activator.getDefault().getLog().log(new Status(Status.INFO, Activator.PLUGIN_ID, "Created FRM ASN.1 module in file " + fileName));
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
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
				Map<String, String> properties = XmlHelper.putPropSemanticDef(param.getSemanticDefinition(), null);
				annotationsToProps(param.getAnnotation(), properties);
				Oid typeOid = param.getTypeOid();
				if(typeOid == null && param.getOid() != null) {
					typeOid = EcoreUtil.copy(param.getOid()); 
					typeOid.getOidBit().add(1); // fake a type oid..
				}
				module.getTypeDefinition().add(new TypeDefinitionProxy(param.getClassifier(), param.getTypeDef(), typeOid, PARAM, param.getSemanticDefinition(), exports, properties));
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
					Map<String, String> properties = annotationsToProps(qualifier.getAnnotation(), new HashMap<String, String>());
					module.getTypeDefinition().add(new TypeDefinitionProxy(qualifier.getClassifier(), qualifier.getTypeDef(), qualifier.getTypeOid(), QUALIFIER, qualifier.getSemanticDefinition(), exports, properties));
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
					Map<String, String> properties = annotationsToProps(value.getAnnotation(), new HashMap<String, String>());
					module.getTypeDefinition().add(new TypeDefinitionProxy(value.getClassifier(), value.getTypeDef(), value.getTypeOid(),VALUE, value.getSemanticDefinition(), exports, properties));
					updateTypeDefinitionString(value, cmdUpdateTypeDefinitions, editingDomain);
				}
			}
		}
	}

	/**
	 * Adds the type defintions of DataUnit objects to the given module
	 * @param module					The module to add the type definitions to 
	 * @param dataUnit					The list of data units, which type definitions shall be added to the module
	 * @param exports					The exports for 
	 * @param cmdUpdateTypeDefinition	A compound command to update the data unit 
	 * @param editingDomain
	 */
	private void addDataUnits(Module module, EList<DataUnit> dataUnits, List<String> exports,
			CompoundCommand cmdUpdateTypeDefinition, EditingDomain editingDomain) {
		for(DataUnit du : dataUnits) {
			for(TypeDefinition td : du.getTypeDefinition()) {
				module.getTypeDefinition().add(EcoreUtil.copy(td)); // copy, otherwise the tpye definition is removed from the original data unit
			}			
			addDataUnits(module, du.getSubDataUnit(), exports, cmdUpdateTypeDefinition, editingDomain); // add recursively the type definitions of the sub data units.					
		}
	}	
	
	/**
	 * Transfers the annotations into properties
	 * @param annotations	The annotations to be transferred
	 * @param properties	The properties holding the converted annotations
	 * @return 				The potentially modified properties
	 */
	private Map<String, String> annotationsToProps(EList<Annotation> annotations, Map<String, String> properties) {
		if(annotations == null || properties == null) {
			return properties;
		}
		
		annotations.forEach( a -> {properties.put(a.getName(), a.getValue());} );
		
		return properties;
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
	 * Helper class to generate ASN.1 and XSD from the FRM.
	 * The TypeDefinitionProxy combines the type definition with the corresponding OID and other information not part of the TypeDefinition
	 */
	class TypeDefinitionProxy extends TypeDefinitionImpl {

		//private static final String TYPE_SUFFIX = "Type";
		private static final String OID_SUFFIX = "Oid";
		private final TypeDefinition definition;
		private final String asn1Comment;
		private String xmlComment;
		private final OidValue typeOid;
		private Map<String, String> properties;
		
		/**
		 * Create a TypeDefinition proxy object with a type OID and a comment
		 * @param typeName
		 * @param def
		 * @param typeOid
		 * @param oidSuffix
		 * @param comment
		 * @param exports
		 */
		public TypeDefinitionProxy(String typeName, TypeDefinition def, Oid typeOid, String oidSuffix, String comment, List<String> exports) {
			this(typeName, def, typeOid, oidSuffix, comment, exports, new HashMap<String, String>());
		}
		
		/**
		 * Create a TypeDefinition proxy object with a type OID and a comment, exports and properties
		 * @param def
		 * @param typeOid
		 * @param comment
		 */
		public TypeDefinitionProxy(String typeName, TypeDefinition def, Oid typeOid, String oidSuffix, String comment, List<String> exports, Map<String, String> properties) {
			if(def != null) {
				//this.definition = EcoreUtil.copy(def); // why a copy?
				this.definition = def; 
				
				// #hd# always use the given type name to be consistent with the OID name
				//if(this.definition.getName() == null || this.definition.getName().length() == 0) {
					ExportWriterContext.instance().updateName(def, createTypeName(typeName, true));
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
				this.asn1Comment = FrTypesUtil.createAsnComment(comment, 0);
				this.xmlComment = FrTypesUtil.createXmlComment(comment, 0);
			} else {
				this.asn1Comment = null;
			}
			
			this.properties = properties;
		}		

		@Override
		public
		void writeAsn1(int indentLevel, StringBuffer output) {
			if(this.asn1Comment != null) {
				output.append(System.lineSeparator() + System.lineSeparator() + this.asn1Comment);
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
		
		@Override
		public void writeXsd(int indentLevel, StringBuffer output, ObjectIdentifier oid, Map<String, String> properties) {			
			OidValue oidForGeneration = this.typeOid;
			
			// suppress named element generation for non-configuraton parameter
			try {
				if(this.definition.eContainer() instanceof Parameter) {
					if(((Parameter)this.definition.eContainer()).isConfigured() == false &&
							ExportWriterContext.instance().getGenerateFrim() == false) {
						oidForGeneration = null; // no generation of named element, only the potentially referenced type
					} 
				} else {
					oidForGeneration = null; // no generation of named element, only the potentially referenced type
				}
				
			} catch(Exception e) {
				
			}
			
			if(this.xmlComment != null) {
				output.append(System.lineSeparator() + System.lineSeparator() + this.xmlComment);
			}
			
			//output.append(System.lineSeparator() + System.lineSeparator());
			
			if(this.definition != null) {
				this.definition.writeXsd(indentLevel, output, oidForGeneration, this.properties /* use the this.properties! */ ); // write type definition and OID together
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
			
			final String SLASH = "/";
			if(frmTypeName.contains(SLASH) == true) {	// /WSDS/DATAP/PDATA -> WsdsDatapPdata	
				frmTypeName = NameTool.wellFormed(frmTypeName.toLowerCase());
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
			this.oidValue = value.toString();
		}
		
		@Override
		public
		void writeAsn1(int indentLevel, StringBuffer output) {
			String asnOidString = this.oidValue.replace(".", " ");
			output.append(getName() + ExportWriter.INDENT);
			super.writeAsn1(indentLevel, output); // writes OBJECT IDENTIFIER
			String asn1OidValue = ExportWriter.LCBRACE + ExportWriter.BLANK + asnOidString + ExportWriter.BLANK + ExportWriter.RCBRACE;
			output.append(ExportWriter.BLANK + ExportWriter.ASSIGN + ExportWriter.BLANK + asn1OidValue);
		}

		@Override
		public void writeXsd(int indent, StringBuffer output, ObjectIdentifier oid, Map<String, String> properties) {
			XmlHelper.writeElement(output, indent, XmlHelper.ATTRIBUTE, 
					new XmlAttribute(XmlHelper.NAME, "oid"),
					new XmlAttribute(XmlHelper.TYPE, XmlHelper.OBJECT_IDENTIFIER),
					new XmlAttribute(XmlHelper.FIXED, oidValue));
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
