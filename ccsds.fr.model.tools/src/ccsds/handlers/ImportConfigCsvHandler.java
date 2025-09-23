package ccsds.handlers;

/*-
 * #%L
 * CCSDS Functional Resource Model Tools
 * %%
 * Copyright (C) 2022 - 2025 European Space Agency
 * %%
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * #L%
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

import ccsds.FunctionalResourceModel.Annotation;
import ccsds.FunctionalResourceModel.FrModelElement;
import ccsds.FunctionalResourceModel.FunctionalResource;
import ccsds.FunctionalResourceModel.FunctionalResourceModel;
import ccsds.FunctionalResourceModel.FunctionalResourceModelFactory;
import ccsds.FunctionalResourceModel.FunctionalResourceModelPackage;
import ccsds.FunctionalResourceModel.Oid;
import ccsds.FunctionalResourceModel.Parameter;
import ccsds.FunctionalResourceModel.impl.OidImpl;
import ccsds.FunctionalResourceModel.presentation.FunctionalResourceModelEditor;
import ccsds.fr.type.model.frtypes.util.FrTypesUtil;
import ccsds.fr.utility.FrUtility;

/**
 * Imports from a CSV file configuration levels for parameters of an FRM loaded in the active editor 
 */
public class ImportConfigCsvHandler extends AbstractHandler implements IHandler {


	private static final String CONFIGURATION_LEVEL = "configuration-level";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
        Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();

        MessageDialog.openInformation(shell, "CSV Configuration Level import", "Usage: " + System.lineSeparator()
        	+ "Configuration levels must be seprated by '" + CsvRecord.CONFIG_LEVEL_SEPARATOR + "', example: 1/2/3/5"  + System.lineSeparator()
        	+ "The Element OID is read rom index " + CsvRecord.ELEMENT_OID_INDEX + System.lineSeparator()
        	+ "The Functional Resource Classifier is read from index " + CsvRecord.CLASSIFIER_INDEX + System.lineSeparator()        	
        	+ "The Configration Level are read rom index " + CsvRecord.CONFIG_LEVELS_INDEX);
        
        FileDialog dialog = new FileDialog(shell, SWT.OPEN);
        dialog.setText("Configuration level import. Select a CSV File");
        dialog.setFilterExtensions(new String[] { "*.csv" });

        String path = dialog.open();
        if (path != null) {
            System.out.println("User selected: " + path);
    		IEditorPart ep = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
    		
    		if(ep instanceof FunctionalResourceModelEditor) {
    			FunctionalResourceModelEditor editor = (FunctionalResourceModelEditor)ep;
    			FunctionalResourceModel frm = editor.getModel();
    			
    			String message = updateParamConfigLevels(frm, editor.getEditingDomain(), path);
    			
    			MessageDialog.openInformation(shell, "CSV Configuration Level import", message.toString());
    			FrTypesUtil.log(message.toString());
    				
    			editor.setFocus(); // enable undo: only when focus it set again to the editor 
    			
    		}            
            
        }
        
		return null;
	
	}
	
	/**
	 * Creates configuration level annotations from the given CSV file
	 * @param frm				The FRM to update
	 * @param editingDomain		The editing domain to perform the update
	 * @param csvFileName		The CSV file containing configuration level in a form 1/2/3/4 
	 * @return		 			A message summarizing the CSV import
	 */
	private String updateParamConfigLevels(FunctionalResourceModel frm, EditingDomain editingDomain, String csvFileName) {
		Map<Oid, CsvRecord> csvRecords = readCsvConfigRecords(csvFileName);
		
		CompoundCommand frmUpdateCompoundCmd = new CompoundCommand("Import configuration levels from CSV file " + csvFileName);
		int numUpdatedParams = 0;
		int addedConfigLevels = 0;
		
		for(FunctionalResource fr : FrUtility.getFunctionalResources(frm)) {
			for(Parameter p : fr.getParameter()) {
				CsvRecord c = csvRecords.get(p.getOid());
				if(c != null) {
					System.out.println("Found parameter " + p.getClassifier() + " of " + fr.getClassifier() + " to update with " + c);
					numUpdatedParams++;
					// create a command to add annotations to p
					for(String configLevel : c.getConfigLevels()) {
						if(annotationExists(p, CONFIGURATION_LEVEL, configLevel) == false) {
							Annotation newAnnotation = FunctionalResourceModelFactory.eINSTANCE.createAnnotation();
							newAnnotation.setName(CONFIGURATION_LEVEL);
							newAnnotation.setValue(configLevel);
							
							AddCommand addAnnotationCmd = new AddCommand(editingDomain, p, 
									p.eClass().getEStructuralFeature(FunctionalResourceModelPackage.TYPED_ELEMENT__ANNOTATION), newAnnotation);
							
							frmUpdateCompoundCmd.append(addAnnotationCmd);
							addedConfigLevels++;
						}
					}
				}
			}
		}
		
		if(frmUpdateCompoundCmd.isEmpty() == false) {
			editingDomain.getCommandStack().execute(frmUpdateCompoundCmd);
		}
		
		String message = "Updated " + numUpdatedParams + " parameters and added in total " + addedConfigLevels 
				+ " configuration annotations " + csvFileName;
		
		return message;
	}
	
	/**
	 * Returns true if the annotation with a given name and value exists
	 * @param e
	 * @param annotationName
	 * @param annotationValue
	 * @return
	 */
	private boolean annotationExists(FrModelElement e, String annotationName, String annotationValue) {
		for(Annotation a : e.getAnnotation()) {
			if(a.getName().equals(annotationName) && a.getValue().equals(annotationValue)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Creates from the given csvFile CsvRecords with Configuration Level information
	 * @param 	csvFile		The CSV file to process
	 * @return 				The created CSV records
	 */
	private Map<Oid, CsvRecord> readCsvConfigRecords(String csvFile) {
		Map<Oid, CsvRecord> csvRecords = new HashMap<>();
		
		try (BufferedReader reader = new BufferedReader(new FileReader(csvFile))) {
			String line = null;
			int lineNumber = 1;
			while((line = reader.readLine()) != null) {
				try {
					CsvRecord c = new CsvRecord(line, lineNumber);
					String[] levels = c.getConfigLevels(); 
					if(levels.length > 0 && levels[0].length() > 0) {
						FrTypesUtil.log("Line " + lineNumber + 
								" CSV record for configuration levels" + c);
						csvRecords.put(c.getElementOid(), c);
					}
				} catch(Exception e) {
					FrTypesUtil.log("Failed to process CSV line " 
							+ lineNumber + " " + line + " " + e);
				}
				lineNumber++;
			}
		} catch(Exception e) {
			
		}
		
		for(CsvRecord c : csvRecords.values()) {
			FrTypesUtil.log("CSV Record with configuration level: " + c);
		}
		
		FrTypesUtil.log("Read " + csvRecords.size() + 
				" CSV records with configuration levels from " + csvFile);
		return csvRecords;
	}

	/**
	 * Stores an Record as read from a CSV file with FRs and configuration levels 
	 */
	class CsvRecord {
		
		public static final String CONFIG_LEVEL_SEPARATOR = "/";
		private final String classifier;
		public static final int CLASSIFIER_INDEX = 2; 
				
		private final Oid elementOid;
		public static final int ELEMENT_OID_INDEX = 0;
		
		private final String[] configLevels;
		public static final int CONFIG_LEVELS_INDEX = 5;
		
		private final int lineNumber;
		
		
		/**
		 * Creates a CSV record from the given csvLine
		 * @param csvLine
		 * @param lineNumber 
		 * @throws Exception for parse errors
		 */
		public CsvRecord(String csvLine, int lineNumber) throws Exception {
			String[] values = csvLine.split(",");
			try {
				this.lineNumber = lineNumber;
				classifier = values[CLASSIFIER_INDEX];
				
				// TODO set value
				elementOid = OidImpl.fromString(values[ELEMENT_OID_INDEX]);
				if(getElementOid() == null) {
					throw new Exception("Failed to parse OID from " + 
							values[ELEMENT_OID_INDEX]);
				}
				
				configLevels = parseConfigLevels(values[CONFIG_LEVELS_INDEX]);
				
			} catch(Exception e) {
				//FrTypesUtil.log("Exception parsing " + csvLine + "  " + e);
				
				throw e;
			}			
		}


		private String[] parseConfigLevels(String levelString) throws Exception {
			String[] levels = levelString.split(CONFIG_LEVEL_SEPARATOR);
			
			// test if the level is numeric
			for(String level : levels) {
				try {
					if(level.length() > 0) {
						Integer.parseInt(level); // throws an exception if not numeric
					}
				} catch(NumberFormatException n) {
					throw new Exception("Problem parsing configuration level '" + level
							+ "' from '" + levelString + "' index " + CONFIG_LEVELS_INDEX);
				}
			}
			
			return levels;
		}


		public String getClassifier() {
			return classifier;
		}


		public String[] getConfigLevels() {
			return configLevels;
		}


		public Oid getElementOid() {
			return elementOid;
		}
		
		@Override
		public String toString() {
			return "CSV Record line " + lineNumber + ": classifier: " + classifier 
					+ " OID " + elementOid + " configuration levels: " + Arrays.stream(configLevels)
                    .collect(Collectors.joining(", "));
		}
	}
	
}
