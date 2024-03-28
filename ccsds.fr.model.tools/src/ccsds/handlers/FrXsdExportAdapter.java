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

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import ccsds.FunctionalResourceModel.Annotation;
import ccsds.FunctionalResourceModel.FunctionalResource;
import ccsds.FunctionalResourceModel.Parameter;
import ccsds.fr.type.model.ExportWriterContext;
import ccsds.fr.type.model.XmlAttribute;
import ccsds.fr.type.model.XmlHelper;
import ccsds.fr.type.model.frtypes.ObjectIdentifier;
import ccsds.fr.type.model.frtypes.impl.TypeDefinitionImpl;

/**
 * For XSD export all configuration parameter shall be below an FR XSD type.
 * However, the type FunctionalResource is not from fr.type.model. So this adapter
 * actually adapts the FR as a type for XSD writing. 
 */
public class FrXsdExportAdapter extends TypeDefinitionImpl {

	private static final String YES = "yes";
	private static final String TRUE = "true";
	private static final String ANNOTATION_SUPPRESS = "suppress";
	private final FunctionalResource fr;

	public FrXsdExportAdapter(FunctionalResource fr) {
		this.fr = fr;
	}

	@Override
	public void writeXsd(int indentLevel, StringBuffer output, ObjectIdentifier oid, Map<String, String> properties) {
		if(ExportWriterContext.instance().getGenerateFrim() == true) {
			writeXsdFrim(indentLevel, output, oid);
		} else {
			writeXsdFrm(indentLevel, output, oid);
			writeXsdFrmElements(indentLevel, output, -1); // for CSSM element definitions are used to define individual parameters
		}
	}

	/**
	 * Write the FRM XSD
	 * @param indentLevel
	 * @param output
	 * @param oid
	 */
	private void writeXsdFrm(int indentLevel, StringBuffer output, ObjectIdentifier oid) {
		int myIndent = 0;
		
		final String currentStratum = ExportWriterContext.instance().getCurrentStratumElement();
		final String baseType = CreateFrAsnXsdHandler.getXsdBaseType(this.fr);

		if(baseType != null) {

			XmlHelper.writeElement(output, indentLevel+myIndent++, XmlHelper.ELEMENT,
					new XmlAttribute(XmlHelper.NAME, XmlHelper.getFrBaseElement(fr.getClassifierWellFormed())), // Marcin want something like AntennaElement
					new XmlAttribute(XmlHelper.TYPE, XmlHelper.getFrType(fr.getClassifierWellFormed())),
					new XmlAttribute(XmlHelper.SUBSTITUTION_GROUP, XmlHelper.getFrStratumElementName(currentStratum)));
		} else {
			XmlHelper.writeElement(output, indentLevel+myIndent++, XmlHelper.ELEMENT,
					new XmlAttribute(XmlHelper.NAME, XmlHelper.getFrBaseElement(fr.getClassifierWellFormed())), // Marcin want something like AntennaElement
					new XmlAttribute(XmlHelper.TYPE, XmlHelper.getFrType(fr.getClassifierWellFormed())));
			
		}
		
		XmlHelper.writeStartElement(output, indentLevel+myIndent++, XmlHelper.COMPLEX_TYPE, new XmlAttribute(XmlHelper.NAME, XmlHelper.getFrType(fr.getClassifierWellFormed())));
		
		
		if(baseType != null) {
			XmlHelper.writeStartElement(output, indentLevel+myIndent++, XmlHelper.COMPLEX_CONTENT);
			XmlHelper.writeStartElement(output, indentLevel+myIndent++, XmlHelper.EXTENSION, new XmlAttribute(XmlHelper.BASE, baseType));
		}
		XmlHelper.writeStartElement(output, indentLevel+myIndent++, XmlHelper.ALL);
		
		writeXsdFrmElements(indentLevel, output, 0);
		
		myIndent--;
		XmlHelper.writeEndElement(output, indentLevel+myIndent, XmlHelper.ALL);

		// Marcin want extra attributes for each FR type
		XmlHelper.writeElement(output, indentLevel+myIndent, XmlHelper.ATTRIBUTE,
				new XmlAttribute(XmlHelper.NAME, "frin"),
				new XmlAttribute(XmlHelper.TYPE, XmlHelper.STRING),
				new XmlAttribute(XmlHelper.USE, XmlHelper.OPTIONAL));

		String frTypeOid = "0"; // set a valid default
		if(fr.getOid() != null) {
			frTypeOid = fr.getOid().toString();
		}
		XmlHelper.writeElement(output, indentLevel+myIndent, XmlHelper.ATTRIBUTE,								
				new XmlAttribute(XmlHelper.NAME, "frTypeOid"),
				new XmlAttribute(XmlHelper.TYPE, XmlHelper.OBJECT_IDENTIFIER),
				new XmlAttribute(XmlHelper.FIXED, frTypeOid));
		
		XmlHelper.writeElement(output, indentLevel+myIndent, XmlHelper.ATTRIBUTE,
				new XmlAttribute(XmlHelper.NAME, "frNickname"),
				new XmlAttribute(XmlHelper.TYPE, XmlHelper.STRING),
				new XmlAttribute(XmlHelper.USE, XmlHelper.REQUIRED));		
		
		myIndent--;
		
		if(baseType != null) {
			XmlHelper.writeEndElement(output, indentLevel+myIndent--, XmlHelper.EXTENSION);
			XmlHelper.writeEndElement(output, indentLevel+myIndent--, XmlHelper.COMPLEX_CONTENT);
		}
		
		XmlHelper.writeEndElement(output, indentLevel, XmlHelper.COMPLEX_TYPE);		
	}
	
	/**
	 * Write for each FR configurable parameter an element
	 * @param indentLevel		Level of indentation
	 * @param output			The StringBuffer for the output
	 * @param minOccurs			A value for the minOccurs attribute, generated for values >= 0
	 */
	private void writeXsdFrmElements(int indentLevel, StringBuffer output, int minOccurs) {
		try {
			for( Parameter p : fr.getParameter()) {
				if((p.isConfigured() && suppressConfigParam(p.getAnnotation()) == false )  
						|| ExportWriterContext.instance().getGenerateFrim()) {
					if(p.getTypeDef() != null) {
						if(minOccurs >= 0) {
						XmlHelper.writeElement(output, indentLevel, XmlHelper.ELEMENT, new XmlAttribute(XmlHelper.NAME, XmlHelper.firstCharLowerCase(p.getClassifierWellFormed())),
								new XmlAttribute(XmlHelper.TYPE, p.getTypeDef().getName()+XmlHelper.NAMED),
								new XmlAttribute(XmlHelper.MIN_OCCURS, Integer.toString(minOccurs)));
						} else {
							XmlHelper.writeElement(output, indentLevel, XmlHelper.ELEMENT, new XmlAttribute(XmlHelper.NAME, XmlHelper.firstCharLowerCase(p.getClassifierWellFormed())),
								new XmlAttribute(XmlHelper.TYPE, p.getTypeDef().getName()+XmlHelper.NAMED));							
						}
					}
				}
			}
		} catch(Exception e) {
			output.append(XmlHelper.COMMENT_START + e.toString() + XmlHelper.COMMENT_END);
			e.printStackTrace();
		}		
	}
	
	/**
	 * Write the FR Instance Model FRIM XSD
	 * @param indentLevel
	 * @param output
	 * @param oid
	 */
	private void writeXsdFrim(int indentLevel, StringBuffer output, ObjectIdentifier oid) {
		int myIndent = 0;
						
//		XmlHelper.writeElement(output, indentLevel+myIndent++, XmlHelper.ELEMENT,
//				new XmlAttribute(XmlHelper.NAME, fr.getClassifierWellFormed()), 
//				new XmlAttribute(XmlHelper.TYPE, XmlHelper.getFrBaseType(fr.getClassifierWellFormed())),
//				new XmlAttribute(XmlHelper.SUBSTITUTION_GROUP, XmlHelper.getFrimBaseElementName()));		

		if(isDynamicFr(fr.getAnnotation()) == true) {		
			// write a container element
			XmlHelper.writeStartElement(output, indentLevel+myIndent++, XmlHelper.COMPLEX_TYPE, new XmlAttribute(XmlHelper.NAME, XmlHelper.getFrContainerType(fr.getClassifierWellFormed())));
			XmlHelper.writeStartElement(output, indentLevel+myIndent++, XmlHelper.COMPLEX_CONTENT);
			XmlHelper.writeStartElement(output, indentLevel+myIndent++, XmlHelper.EXTENSION, new XmlAttribute(XmlHelper.BASE, XmlHelper.getFrimBaseType()));
			XmlHelper.writeStartElement(output, indentLevel+myIndent++, XmlHelper.SEQUENCE);
			XmlHelper.writeElement(output, indentLevel+myIndent--, XmlHelper.ELEMENT, 
					new XmlAttribute(XmlHelper.NAME, XmlHelper.getFrType(fr.getClassifierWellFormed())),
					new XmlAttribute(XmlHelper.TYPE, XmlHelper.getFrType(fr.getClassifierWellFormed())),
					new XmlAttribute(XmlHelper.MIN_OCCURS, XmlHelper.ZERO),
					new XmlAttribute(XmlHelper.MAX_OCCURS, XmlHelper.UNBOUNDED));
			XmlHelper.writeEndElement(output, indentLevel+myIndent--, XmlHelper.SEQUENCE);
			XmlHelper.writeEndElement(output, indentLevel+myIndent--, XmlHelper.EXTENSION);
			XmlHelper.writeEndElement(output, indentLevel+myIndent--, XmlHelper.COMPLEX_CONTENT);
			XmlHelper.writeEndElement(output, indentLevel+myIndent, XmlHelper.COMPLEX_TYPE);		
			XmlHelper.doBreakIndent(output, indentLevel);
		}
		// write an FR element
		XmlHelper.writeStartElement(output, indentLevel+myIndent++, XmlHelper.COMPLEX_TYPE, new XmlAttribute(XmlHelper.NAME, XmlHelper.getFrType(fr.getClassifierWellFormed())));
		XmlHelper.writeStartElement(output, indentLevel+myIndent++, XmlHelper.COMPLEX_CONTENT);
		XmlHelper.writeStartElement(output, indentLevel+myIndent++, XmlHelper.EXTENSION, new XmlAttribute(XmlHelper.BASE, XmlHelper.getFrimBaseType()));
		XmlHelper.writeStartElement(output, indentLevel+myIndent++, XmlHelper.ALL);
		
		try {
			for( Parameter p : fr.getParameter()) {
				if((p.isConfigured() || ExportWriterContext.instance().getGenerateFrim()) && p.getTypeDef() != null) {
					XmlHelper.writeElement(output, indentLevel+myIndent, XmlHelper.ELEMENT, new XmlAttribute(XmlHelper.NAME, XmlHelper.firstCharLowerCase(p.getClassifierWellFormed())),
							new XmlAttribute(XmlHelper.TYPE, p.getTypeDef().getName()+XmlHelper.NAMED),
							new XmlAttribute(XmlHelper.MIN_OCCURS, "0"));
				}
			}
		} catch(Exception e) {
			output.append(XmlHelper.COMMENT_START + e.toString() + XmlHelper.COMMENT_END);
			e.printStackTrace();
		}
		
		myIndent--;
		XmlHelper.writeEndElement(output, indentLevel+myIndent, XmlHelper.ALL);

		// Marcin want extra attributes for each FR type
		XmlHelper.writeElement(output, indentLevel+myIndent, XmlHelper.ATTRIBUTE,
				new XmlAttribute(XmlHelper.NAME, "frin"),
				new XmlAttribute(XmlHelper.TYPE, XmlHelper.STRING),
				new XmlAttribute(XmlHelper.USE, XmlHelper.OPTIONAL));

		String frTypeOid = "0"; // Use a valid default
		if(fr.getOid() != null) {
			frTypeOid = fr.getOid().toString();
		}
		XmlHelper.writeElement(output, indentLevel+myIndent, XmlHelper.ATTRIBUTE,								
				new XmlAttribute(XmlHelper.NAME, "frTypeOid"),
				new XmlAttribute(XmlHelper.TYPE, XmlHelper.OBJECT_IDENTIFIER),
				new XmlAttribute(XmlHelper.FIXED, frTypeOid));
		
		XmlHelper.writeElement(output, indentLevel+myIndent, XmlHelper.ATTRIBUTE,
				new XmlAttribute(XmlHelper.NAME, "frNickname"),
				new XmlAttribute(XmlHelper.TYPE, XmlHelper.STRING),
				new XmlAttribute(XmlHelper.USE, XmlHelper.REQUIRED));		
		
		myIndent--;
		XmlHelper.writeEndElement(output, indentLevel+myIndent--, XmlHelper.EXTENSION);
		XmlHelper.writeEndElement(output, indentLevel+myIndent--, XmlHelper.COMPLEX_CONTENT);
		XmlHelper.writeEndElement(output, indentLevel, XmlHelper.COMPLEX_TYPE);		
	}

	/**
	 * Returns true if in the given annotations there is a annotations with
	 * 	name == dynamic
	 * 	value == true
	 * @param annotation
	 * @return 
	 * @return
	 */
	public static boolean isDynamicFr(EList<Annotation> annotation) {
		for(Annotation anno : annotation) {
			if(anno.getName().equalsIgnoreCase("dynamic") && 
					anno.getValue().equalsIgnoreCase(TRUE)) {
				return true;
			}
		}
		return false;
	}	
	
	/**
	 * Checks the given annotations if for an annotation 'suppress' which is set to 'true'
	 * @param annotation 	The annotations of a parameter
	 * @return 				Returns true if is the annotation 'suppress' which is set to 'true'
	 */
	private boolean suppressConfigParam(EList<Annotation> annotation) {
		try {
			for(Annotation a : annotation) {
				if(a.getName().equalsIgnoreCase(ANNOTATION_SUPPRESS) 
						&& (a.getValue().equalsIgnoreCase(TRUE) || a.getValue().equalsIgnoreCase(YES))) {
					return true;
				}
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}	
}
