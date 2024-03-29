package ccsds.fr.type.model.frtypes.util;

/*-
 * #%L
 * CCSDS Functional Resource Type Model
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

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import ccsds.fr.type.model.ExportWriterContext;
import ccsds.fr.type.model.XmlHelper;
import ccsds.fr.type.model.frtypes.ExportWriter;

/**
 * Collection of utility functions for the FR Type Model
 * 
 * @generated NOT
 */
public class FrTypesUtil {

	private static final Bundle BUNDLE = FrameworkUtil.getBundle(FrTypesUtil.class);
	private static final ILog LOGGER = Platform.getLog(BUNDLE);
	private static String[] invalidChars  = {"\\", "_", "/"};
	
	/**
	 * log to the eclipse platform
	 * @param msg
	 */
	public static void log(String msg) {
		LOGGER.log(new Status(Status.INFO, BUNDLE.getSymbolicName(), msg));
	}
	
	/**
	 * warning to the eclipse platform
	 * @param msg
	 */
	public static void warn(String msg) {
		LOGGER.log(new Status(Status.WARNING, BUNDLE.getSymbolicName(), msg));
	}
	
	
	/**
	 * Get the editing domain for the given EObject
	 * @param object
	 * @return
	 * 
	 * @generated NOT
	 */
	static public EditingDomain getEditingDomainFor(EObject object) {
		Resource resource = object.eResource();
		if (resource != null) {
			IEditingDomainProvider editingDomainProvider =

					(IEditingDomainProvider) EcoreUtil.getExistingAdapter(resource, IEditingDomainProvider.class);
			if (editingDomainProvider != null) {
				return editingDomainProvider.getEditingDomain();
			} else {
				ResourceSet resourceSet = resource.getResourceSet();
				if (resourceSet instanceof IEditingDomainProvider) {
					EditingDomain editingDomain = ((IEditingDomainProvider) resourceSet).getEditingDomain();
					return editingDomain;
				} else if (resourceSet != null) {
					editingDomainProvider = (IEditingDomainProvider) EcoreUtil.getExistingAdapter(resourceSet,
							IEditingDomainProvider.class);
					if (editingDomainProvider != null) {
						return editingDomainProvider.getEditingDomain();
					}
				}
			}
		}

		return null;
	}
	
	/**
	 * Constructs a valid type name of the given type name by:
	 * 1) making first character lower case
	 * 2) remove invalid characters from the given typeName
	 * 
	 * @param typeName	The type name to be made valid
	 * @param logChange	If true, changed names are sent to the logger
	 * 
	 * @return The validated type name
	 */
	static public String getValidElementName(String typeName, boolean logChange) {
		if(typeName == null) {
			return null;
		}
		String orgTypeName = typeName;
		
		typeName = typeName.replace("/", "Over");
		typeName = typeName.replace(".", "Dot");
		typeName = typeName.replace("_", "-");
		typeName = typeName.replace("\"", "");
		typeName = typeName.replace(" ", "");
//		typeName = typeName.replace("1", "One");
//		typeName = typeName.replace("2", "Two");
//		typeName = typeName.replace("3", "Three");
//		typeName = typeName.replace("4", "Four");
//		typeName = typeName.replace("5", "Five");
//		typeName = typeName.replace("6", "Six");
//		typeName = typeName.replace("7", "Seven");
//		typeName = typeName.replace("8", "Eight");
//		typeName = typeName.replace("9", "Nine");
//		typeName = typeName.replace("0", "Zero");		
		
		
		StringBuilder validName = new StringBuilder(typeName);		
		
		// delete any invalid character
		for(int idx=0; idx<invalidChars.length; idx++) {
			int chIdx = -1;
			do {
				chIdx = validName.indexOf(invalidChars[idx]);
				if(chIdx != -1) {
					validName.deleteCharAt(chIdx);
				}
			} while(chIdx != -1);
		}
		
		// names can't start with a digit
		if(Character.isDigit(validName.charAt(0))) {
			validName.insert(0, "n");
		}
		
		// convert first character to lower case
		if(Character.isUpperCase(validName.charAt(0))) {
			validName.setCharAt(0, Character.toLowerCase(validName.charAt(0)));
		}
		
		if(logChange == true && ExportWriterContext.instance().getGenerating() == true && 
				validName.toString().equals(orgTypeName) == false) {
			FrTypesUtil.log("ASN.1 generation: Changed " + orgTypeName + " to " + validName);
		}
		
		return validName.toString();
	}
	
	/**
	 * Create a comment string which has the ASN.1 comment -- prepended for each line.
	 * In addition the comment is broken down into lines of length 80.
	 * @param commentString
	 * @param indentLevel 	The level of indentation when the comment has line breaks
	 * @return the ASN.1 comment string
	 */
	public static String createAsnComment(String commentString, int indentlevel) {
		if(commentString == null) {
			return null;
		}
		String indent = new String();
		for(int idx=0; idx<indentlevel; idx++) {
			indent += ExportWriter.INDENT;
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
		String comment = asnComment.toString().replace("\r\n", "\n"); // DOS2UNIX
		comment = comment.replace("\r", "\n"); // MAC
		comment = comment.replace("\n", "\n" + indent + ExportWriter.COMMENT + ExportWriter.BLANK); // UNIX
		
		
		return ExportWriter.COMMENT + ExportWriter.BLANK + comment;
	}	
	
	/**
	 * Create a comment string which has the XML comment
	 * In addition the comment is broken down into lines of length 80.
	 * @param commentString
	 * @param indentLevel 	The level of indentation when the comment has line breaks
	 * @return the XML comment string
	 */
	public static String createXmlComment(String commentString, int indentlevel) {
		if(commentString == null) {
			return null;
		}
				
		StringBuffer xmlComment = new StringBuffer(XmlHelper.COMMENT_START);
		xmlComment.append(System.lineSeparator());
		
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
			
			xmlComment.append(commentString.substring(idx, endIndex));
			
			if(endIndex != commentString.length()) {
				xmlComment.append(System.lineSeparator());
			}
			idx = endIndex;
		}
		
		xmlComment.append(System.lineSeparator());
		return xmlComment.toString() + XmlHelper.COMMENT_END;
	}		
	
}
