/**
 */
package ccsds.fr.type.model.frtypes.impl;

import ccsds.fr.type.model.XmlAttribute;
import ccsds.fr.type.model.XmlHelper;
import ccsds.fr.type.model.frtypes.ExportWriter;
import ccsds.fr.type.model.frtypes.FrtypesPackage;
import ccsds.fr.type.model.frtypes.ObjectIdentifier;
import ccsds.fr.type.model.frtypes.Real;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Real</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RealImpl extends SimpleRangeTypeImpl implements Real {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FrtypesPackage.Literals.REAL;
	}

	/**
	 * Write the REAL
	 * @generated NOT
	 */
	@Override
	public void writeAsn1(int indentLevel, StringBuffer output) {
		output.append(ExportWriter.REAL);
		super.writeAsn1(indentLevel, output); // write constraints
	}

	/**
	 * Write the integer to XSD
	 * @generated NOT
	 */
	@Override
	public void writeXsd(int indentLevel, StringBuffer output, ObjectIdentifier oid) {
		XmlHelper.writeComment(output, indentLevel, this);

		boolean hasConstraints = false;
		StringBuffer typeOutput = new StringBuffer();
		int typeIndent = indentLevel + 2;

		XmlHelper.writeStartElement(typeOutput, typeIndent, XmlHelper.SIMPLE_TYPE, XmlHelper.getTypeNameAttr(this));
		if (getSingleValueConstraint() != null && getSingleValueConstraint().getValues() != null
				&& getSingleValueConstraint().getValues().size() > 0) {
			hasConstraints = true;

			XmlHelper.writeSingleValueRestrictions(typeOutput, typeIndent, XmlHelper.DOUBLE,
					getSingleValueConstraint().getValues());
		} else if (getRangeConstraint() != null && getRangeConstraint().size() > 0) {
			hasConstraints = true;
			XmlHelper.writeRangeConstraint(typeOutput, typeIndent, XmlHelper.DOUBLE, getRangeConstraint());
		} else {
			XmlHelper.writeElement(typeOutput, typeIndent+1, XmlHelper.RESTRICTION,
					new XmlAttribute(XmlHelper.BASE, XmlHelper.DOUBLE));
		}
		XmlHelper.writeEndElement(typeOutput, typeIndent, XmlHelper.SIMPLE_TYPE);

		if (oid != null) {
			XmlAttribute typeAttr = XmlHelper.getTypeNameAttr(this);
			if (hasConstraints == false) {
				typeAttr = new XmlAttribute(XmlHelper.NAME, XmlHelper.DOUBLE);
			}

			XmlHelper.writeSimpleNamedType(indentLevel, output, XmlHelper.getNamedTypeNameAttr(this), typeAttr, oid,
					this);
		}

		XmlHelper.doBreakIndent(output, indentLevel);
		output.append(typeOutput);

	}

} //RealImpl
