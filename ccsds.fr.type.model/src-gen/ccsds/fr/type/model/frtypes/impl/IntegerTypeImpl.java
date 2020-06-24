/**
 */
package ccsds.fr.type.model.frtypes.impl;

import ccsds.fr.type.model.XmlAttribute;
import ccsds.fr.type.model.XmlHelper;
import ccsds.fr.type.model.frtypes.Element;
import ccsds.fr.type.model.frtypes.ExportWriter;
import ccsds.fr.type.model.frtypes.FrtypesPackage;
import ccsds.fr.type.model.frtypes.IntegerType;
import ccsds.fr.type.model.frtypes.NamedValue;
import ccsds.fr.type.model.frtypes.ObjectIdentifier;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsds.fr.type.model.frtypes.impl.IntegerTypeImpl#getNamedValues <em>Named Values</em>}</li>
 * </ul>
 *
 * @generated
 */
@SuppressWarnings("unused")
public class IntegerTypeImpl extends SimpleRangeTypeImpl implements IntegerType {
	/**
	 * The cached value of the '{@link #getNamedValues() <em>Named Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedValues()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedValue> namedValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FrtypesPackage.Literals.INTEGER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedValue> getNamedValues() {
		if (namedValues == null) {
			namedValues = new EObjectContainmentEList<NamedValue>(NamedValue.class, this,
					FrtypesPackage.INTEGER_TYPE__NAMED_VALUES);
		}
		return namedValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FrtypesPackage.INTEGER_TYPE__NAMED_VALUES:
			return ((InternalEList<?>) getNamedValues()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FrtypesPackage.INTEGER_TYPE__NAMED_VALUES:
			return getNamedValues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FrtypesPackage.INTEGER_TYPE__NAMED_VALUES:
			getNamedValues().clear();
			getNamedValues().addAll((Collection<? extends NamedValue>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case FrtypesPackage.INTEGER_TYPE__NAMED_VALUES:
			getNamedValues().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case FrtypesPackage.INTEGER_TYPE__NAMED_VALUES:
			return namedValues != null && !namedValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * Write the INTEGER
	 * @generated NOT
	 */
	@Override
	public void writeAsn1(int indentLevel, StringBuffer output) {
		output.append(ExportWriter.INTEGER);
		output.append(ExportWriter.BLANK);
		super.writeAsn1(indentLevel, output); // write constraints

		if (getNamedValues().size() > 0) {
			//			output.append(System.lineSeparator());
			//			indent(indentLevel, output);
			output.append(System.lineSeparator() + ExportWriter.LCBRACE + System.lineSeparator());

			int idx = 0;
			for (NamedValue v : getNamedValues()) {
				indent(indentLevel + 1, output);
				v.writeAsn1(indentLevel + 1, output);
				idx++;

				output.append(System.lineSeparator());

				if (idx < getNamedValues().size()) {
					output.append(ExportWriter.SEP);
				}
			}

			output.append(ExportWriter.RCBRACE + System.lineSeparator());

		}
	}

	/**
	 * Write the integer to XSD
	 * @generated NOT
	 */
	@Override
	public void writeXsd(int indentLevel, StringBuffer output, ObjectIdentifier oid) {
		XmlHelper.writeComment(output, indentLevel, this);

		boolean hasConstraints = false;
		int typeIndent = indentLevel;
		StringBuffer typeOutput = new StringBuffer();

		XmlHelper.writeStartElement(typeOutput, typeIndent, XmlHelper.SIMPLE_TYPE, XmlHelper.getTypeNameAttr(this));

		if (getNamedValues() != null && getNamedValues().size() > 0) {
			hasConstraints = true;
			XmlHelper.doBreakIndent(output, indentLevel);

			XmlHelper.writeEnumRestrictions(typeOutput, typeIndent, getNamedValues());

		} else if (getSingleValueConstraint() != null && getSingleValueConstraint().getValues() != null
				&& getSingleValueConstraint().getValues().size() > 0) {
			hasConstraints = true;
			XmlHelper.writeSingleValueRestrictions(typeOutput, typeIndent, XmlHelper.INTEGER,
					getSingleValueConstraint().getValues());

		} else if (getRangeConstraint() != null && getRangeConstraint().size() > 0) {
			hasConstraints = true;
			XmlHelper.writeRangeConstraint(typeOutput, typeIndent, XmlHelper.INTEGER, getRangeConstraint());
		} else {
			XmlHelper.writeElement(typeOutput, typeIndent, XmlHelper.RESTRICTION,
					new XmlAttribute(XmlHelper.BASE, XmlHelper.INTEGER));
		}
		XmlHelper.writeEndElement(typeOutput, typeIndent, XmlHelper.SIMPLE_TYPE);

		if (oid != null) {
			XmlAttribute typeAttr = XmlHelper.getTypeNameAttr(this);
			if (hasConstraints == false) {
				typeAttr = new XmlAttribute(XmlHelper.NAME, XmlHelper.INTEGER);
			}

			XmlHelper.writeSimpleNamedType(indentLevel, output, XmlHelper.getNamedTypeNameAttr(this), typeAttr, oid,
					this);
		}

		XmlHelper.doBreakIndent(output, indentLevel);
		output.append(typeOutput);
	}
} //IntegerTypeImpl
