package ccsds.handlers;

import ccsds.FunctionalResourceModel.FunctionalResource;
import ccsds.FunctionalResourceModel.Parameter;
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

	private final FunctionalResource fr;

	public FrXsdExportAdapter(FunctionalResource fr) {
		this.fr = fr;
	}

	@Override
	public void writeXsd(int indentLevel, StringBuffer output, ObjectIdentifier oid) {
		int myIndent = 0;
		XmlHelper.writeStartElement(output, indentLevel+myIndent++, XmlHelper.COMPLEX_TYPE, new XmlAttribute(XmlHelper.NAME, XmlHelper.getFrBaseType(fr.getClassifier())));
		XmlHelper.writeStartElement(output, indentLevel+myIndent++, XmlHelper.COMPLEX_CONTENT);
		XmlHelper.writeStartElement(output, indentLevel+myIndent++, XmlHelper.EXTENSION, new XmlAttribute(XmlHelper.BASE, CreateFrAsnXsdHandler.getXsdBaseType(this.fr)));
		XmlHelper.writeStartElement(output, indentLevel+myIndent++, XmlHelper.ALL);
		
		try {
			for( Parameter p : fr.getParameter()) {
				if(p.isConfigured() && p.getTypeDef() != null) {
					XmlHelper.writeElement(output, indentLevel+myIndent, XmlHelper.ELEMENT, new XmlAttribute(XmlHelper.NAME, XmlHelper.firstCharLowerCase(p.getClassifier())),
							new XmlAttribute(XmlHelper.TYPE, p.getTypeDef().getName()+XmlHelper.NAMED),
							new XmlAttribute(XmlHelper.MIN_OCCURS, "0"));
				}
			}
		} catch(Exception e) {
			output.append(XmlHelper.COMMENT_START + e.toString() + XmlHelper.COMMENT_END);
			e.printStackTrace();
		}
		
		myIndent--;
		XmlHelper.writeEndElement(output, indentLevel+myIndent--, XmlHelper.ALL);
		XmlHelper.writeEndElement(output, indentLevel+myIndent--, XmlHelper.EXTENSION);
		XmlHelper.writeEndElement(output, indentLevel+myIndent--, XmlHelper.COMPLEX_CONTENT);
		XmlHelper.writeEndElement(output, indentLevel, XmlHelper.COMPLEX_TYPE);
	}


}