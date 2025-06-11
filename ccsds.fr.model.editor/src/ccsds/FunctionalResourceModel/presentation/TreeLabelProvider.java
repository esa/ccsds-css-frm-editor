package ccsds.FunctionalResourceModel.presentation;

/*-
 * #%L
 * CCSDS Functional Resource Model Editor
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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.window.ToolTip;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;

import ccsds.FunctionalResourceModel.Annotation;
import ccsds.FunctionalResourceModel.DataUnit;
import ccsds.FunctionalResourceModel.FunctionalResource;
import ccsds.FunctionalResourceModel.FunctionalResourceModel;
import ccsds.FunctionalResourceModel.Oid;
import ccsds.fr.type.model.frtypes.ExportWriter;
import ccsds.fr.type.model.frtypes.TypeDefinition;
import ccsds.fr.type.model.frtypes.util.FrTypesUtil;
import ccsds.fr.utility.FrUtility;
import ccsds.oids.OidTree;

/**
 *  A simple wrapper of the emf class to provide tooltips for some 
 *  items in the tree.
 */
public class TreeLabelProvider extends ColumnLabelProvider {

	AdapterFactoryLabelProvider adapterFactory;

	private final Font tooltipFont = new Font(null,"Courier New",12, SWT.NONE);
	
	public TreeLabelProvider(AdapterFactoryLabelProvider af, ColumnViewer selectionViewer) {
		adapterFactory = af;
		ColumnViewerToolTipSupport.enableFor(selectionViewer, ToolTip.NO_RECREATE); // #hd# tooltip support
	}

	@Override
	public String getToolTipText(Object element) {		
		if(element instanceof Oid) {
			try {
				return OidTree.getInstance().getOidString(((Oid)element));
			} catch(Exception e) {
				e.printStackTrace();
			}
		} else if(element instanceof ExportWriter) {
			StringBuffer asn1Buffer = new StringBuffer("------------------------------------------------------------------------------------------------------------------------------\n");
			((ExportWriter)element).writeAsn1(0, asn1Buffer);
			
			return asn1Buffer.toString();
		} else if(element instanceof FunctionalResourceModel) {
			FunctionalResource[] frArray = FrUtility.getFunctionalResources((FunctionalResourceModel)element);
			StringBuffer frStringList = new StringBuffer(frArray.length + " Functional Resources" + System.lineSeparator());
			frStringList.append("-----------------------------" + System.lineSeparator() + System.lineSeparator());
			for(FunctionalResource fr: frArray) {
				frStringList.append(fr.getClassifier() + System.lineSeparator());
			}
			
			return frStringList.toString();
		} else if(element instanceof DataUnit) {			
			StringBuffer output = new StringBuffer();
			printDataUnit((DataUnit)element, output);
			
			return output.toString();
		} else if(element instanceof Annotation) {
			return "Use 'suppress' with a value of 'yes' for configuration parameter not exported to XSD";
		}
		return null;
	}
	
	/**
	 * Prints the given DataUnit to the given StringBuffer, types as ASN.1
	 * @param du		The DataUnit to print
	 * @param output	The output to print to
	 */
	private void printDataUnit(DataUnit du, StringBuffer output) {		
		if(du.getClassifier() != null) {
			output.append(FrTypesUtil.createAsnComment(du.getClassifier(), 0) 
					+ System.lineSeparator() + System.lineSeparator());
		}
		
		EList<TypeDefinition> tds = du.getTypeDefinition();
		for(TypeDefinition td : tds) {
			td.writeAsn1(0, output);
		}
		
		EList<DataUnit> dus = du.getSubDataUnit();
		for(DataUnit subDu : dus) {
			printDataUnit(subDu, output);
			output.append(System.lineSeparator());
		}
	}

	@Override
	public String getText(Object element) {		
		return adapterFactory.getText(element);
	}
	
	@Override
	public Image getImage(Object element) {		
		return adapterFactory.getImage(element);
	}
	
	@Override
	public Font getToolTipFont(Object object) {
		return this.tooltipFont;
	}
}
