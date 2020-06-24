/**
 */
package ccsds.fr.type.model.frtypes.impl;

import ccsds.fr.type.model.XmlAttribute;
import ccsds.fr.type.model.XmlHelper;
import ccsds.fr.type.model.frtypes.ExportWriter;
import ccsds.fr.type.model.frtypes.FrtypesPackage;
import ccsds.fr.type.model.frtypes.Null;
import ccsds.fr.type.model.frtypes.ObjectIdentifier;
import ccsds.fr.type.model.frtypes.SimpleType;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class SimpleTypeImpl extends TypeImpl implements SimpleType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FrtypesPackage.Literals.SIMPLE_TYPE;
	}

	/**
	 * Write the object identifier to XSD
	 * @generated NOT
	 */
	@Override
	public void writeXsd(int indentLevel, StringBuffer output, ObjectIdentifier oid) {
		XmlHelper.writeComment(output, indentLevel, this);

		String baseType = "unknownBaseType";
		if (this instanceof Null) {
			baseType = ExportWriter.NULL;
		} else if (this instanceof ccsds.fr.type.model.frtypes.Boolean) {
			baseType = XmlHelper.BOOLEAN;
		} else if (this instanceof ObjectIdentifier) {
			baseType = XmlHelper.OBJECT_IDENTIFIER;
		}

		boolean hasConstraints = false;
		int typeIndent = indentLevel;
		StringBuffer typeOutput = new StringBuffer();

		if (oid == null) {
			XmlHelper.writeStartElement(typeOutput, typeIndent, XmlHelper.SIMPLE_TYPE, XmlHelper.getTypeNameAttr(this));
		} else {
			typeIndent++;
			XmlHelper.writeStartElement(typeOutput, typeIndent, XmlHelper.SIMPLE_TYPE);
		}
		XmlHelper.writeElement(typeOutput, indentLevel, XmlHelper.RESTRICTION,
				new XmlAttribute(XmlHelper.BASE, baseType));
		XmlHelper.writeEndElement(typeOutput, typeIndent, XmlHelper.SIMPLE_TYPE);

		if (oid != null) {
			XmlAttribute typeAttr = XmlHelper.getTypeNameAttr(this);

			XmlHelper.writeStartElement(output, indentLevel, XmlHelper.COMPLEX_TYPE, typeAttr);
			if (hasConstraints == true) {
				XmlHelper.writeAttributeStart(output, indentLevel + 1, XmlHelper.VALUE, XmlHelper.REQUIRED);
				output.append(typeOutput);
				XmlHelper.writeAttributeEnd(output, indentLevel + 1);
			} else {
				XmlHelper.writeAttributeSpec(output, indentLevel + 1, XmlHelper.VALUE, XmlHelper.INTEGER,
						XmlHelper.REQUIRED);
			}
			XmlHelper.writeFixedStringAttributeSpec(output, indentLevel + 1, XmlHelper.CLASSIFIER, typeAttr.getValue());
			XmlHelper.writeOidAttribute(output, indentLevel + 1, oid);
			XmlHelper.writeEndElement(output, indentLevel, XmlHelper.COMPLEX_TYPE);
		} else {
			XmlHelper.doBreakIndent(output, indentLevel);
			output.append(typeOutput);
		}
	}
} //SimpleTypeImpl
