/**
 */
package ccsds.fr.type.model.frtypes.impl;

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

import ccsds.fr.type.model.frtypes.FrtypesPackage;
import ccsds.fr.type.model.frtypes.SimpleSizeConstrainedType;
import ccsds.fr.type.model.frtypes.SizeConstrainedType;
import ccsds.fr.type.model.frtypes.SizeConstraint;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Size Constrained Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsds.fr.type.model.frtypes.impl.SimpleSizeConstrainedTypeImpl#getSizeConstraint <em>Size Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SimpleSizeConstrainedTypeImpl extends SimpleTypeImpl implements SimpleSizeConstrainedType {
	/**
	 * The cached value of the '{@link #getSizeConstraint() <em>Size Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<SizeConstraint> sizeConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleSizeConstrainedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FrtypesPackage.Literals.SIMPLE_SIZE_CONSTRAINED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SizeConstraint> getSizeConstraint() {
		if (sizeConstraint == null) {
			sizeConstraint = new EObjectContainmentEList<SizeConstraint>(SizeConstraint.class, this,
					FrtypesPackage.SIMPLE_SIZE_CONSTRAINED_TYPE__SIZE_CONSTRAINT);
		}
		return sizeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FrtypesPackage.SIMPLE_SIZE_CONSTRAINED_TYPE__SIZE_CONSTRAINT:
			return ((InternalEList<?>) getSizeConstraint()).basicRemove(otherEnd, msgs);
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
		case FrtypesPackage.SIMPLE_SIZE_CONSTRAINED_TYPE__SIZE_CONSTRAINT:
			return getSizeConstraint();
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
		case FrtypesPackage.SIMPLE_SIZE_CONSTRAINED_TYPE__SIZE_CONSTRAINT:
			getSizeConstraint().clear();
			getSizeConstraint().addAll((Collection<? extends SizeConstraint>) newValue);
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
		case FrtypesPackage.SIMPLE_SIZE_CONSTRAINED_TYPE__SIZE_CONSTRAINT:
			getSizeConstraint().clear();
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
		case FrtypesPackage.SIMPLE_SIZE_CONSTRAINED_TYPE__SIZE_CONSTRAINT:
			return sizeConstraint != null && !sizeConstraint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SizeConstrainedType.class) {
			switch (derivedFeatureID) {
			case FrtypesPackage.SIMPLE_SIZE_CONSTRAINED_TYPE__SIZE_CONSTRAINT:
				return FrtypesPackage.SIZE_CONSTRAINED_TYPE__SIZE_CONSTRAINT;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SizeConstrainedType.class) {
			switch (baseFeatureID) {
			case FrtypesPackage.SIZE_CONSTRAINED_TYPE__SIZE_CONSTRAINT:
				return FrtypesPackage.SIMPLE_SIZE_CONSTRAINED_TYPE__SIZE_CONSTRAINT;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * Write the ENUMERATED
	 * @generated NOT
	 */
	@Override
	public void writeAsn1(int indentLevel, StringBuffer output) {
		super.writeAsn1(indentLevel, output); // enable single value constraints
		for (SizeConstraint c : getSizeConstraint()) {
			c.writeAsn1(indentLevel, output);
		}
	}

} //SimpleSizeConstrainedTypeImpl
