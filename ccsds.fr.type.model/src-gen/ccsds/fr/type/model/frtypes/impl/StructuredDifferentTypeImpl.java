/**
 */
package ccsds.fr.type.model.frtypes.impl;

import ccsds.fr.type.model.frtypes.Asn1Writer;
import ccsds.fr.type.model.frtypes.FrtypesPackage;
import ccsds.fr.type.model.frtypes.StructuredDifferentType;
import ccsds.fr.type.model.frtypes.Type;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Different Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsds.fr.type.model.frtypes.impl.StructuredDifferentTypeImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StructuredDifferentTypeImpl extends StructuredTypeImpl implements StructuredDifferentType {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> elements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredDifferentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FrtypesPackage.Literals.STRUCTURED_DIFFERENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<Type>(Type.class, this,
					FrtypesPackage.STRUCTURED_DIFFERENT_TYPE__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FrtypesPackage.STRUCTURED_DIFFERENT_TYPE__ELEMENTS:
			return ((InternalEList<?>) getElements()).basicRemove(otherEnd, msgs);
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
		case FrtypesPackage.STRUCTURED_DIFFERENT_TYPE__ELEMENTS:
			return getElements();
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
		case FrtypesPackage.STRUCTURED_DIFFERENT_TYPE__ELEMENTS:
			getElements().clear();
			getElements().addAll((Collection<? extends Type>) newValue);
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
		case FrtypesPackage.STRUCTURED_DIFFERENT_TYPE__ELEMENTS:
			getElements().clear();
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
		case FrtypesPackage.STRUCTURED_DIFFERENT_TYPE__ELEMENTS:
			return elements != null && !elements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * Write the components of a structured type
	 * @generated NOT
	 */
	@Override
	public void writeAsn1(int indentLevel, StringBuffer output) {

		if (getElements().size() > 0) {
			output.append(System.lineSeparator() + getIndent(indentLevel) + Asn1Writer.LCBRACE);
			output.append(System.lineSeparator());
		}

		int idx = 0;
		int elementIndent = indentLevel + 1;
		for (Type t : getElements()) {			
			t.writeAsn1(elementIndent, output);
			idx++;

			if (idx < getElements().size()) {
				//output.append(System.lineSeparator() + getIndent(indentLevel) + Asn1Writer.SEP);
				output.append(System.lineSeparator() + Asn1Writer.SEP);
			}
		}

		if (getElements().size() > 0) {
			output.append(System.lineSeparator() + getIndent(indentLevel) + Asn1Writer.RCBRACE);
			output.append(System.lineSeparator());
		}
	}

} //StructuredDifferentTypeImpl
