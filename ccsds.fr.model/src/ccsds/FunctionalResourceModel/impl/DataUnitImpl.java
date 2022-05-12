/**
 */
package ccsds.FunctionalResourceModel.impl;

/*-
 * #%L
 * CCSDS Functional Resource Model
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

import ccsds.FunctionalResourceModel.DataUnit;
import ccsds.FunctionalResourceModel.FunctionalResourceModelPackage;

import ccsds.fr.type.model.frtypes.TypeDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.DataUnitImpl#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.DataUnitImpl#getSubDataUnit <em>Sub Data Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataUnitImpl extends FrModelElementImpl implements DataUnit {
	/**
	 * The cached value of the '{@link #getTypeDefinition() <em>Type Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDefinition> typeDefinition;

	/**
	 * The cached value of the '{@link #getSubDataUnit() <em>Sub Data Unit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubDataUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<DataUnit> subDataUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionalResourceModelPackage.Literals.DATA_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDefinition> getTypeDefinition() {
		if (typeDefinition == null) {
			typeDefinition = new EObjectContainmentEList<TypeDefinition>(TypeDefinition.class, this, FunctionalResourceModelPackage.DATA_UNIT__TYPE_DEFINITION);
		}
		return typeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataUnit> getSubDataUnit() {
		if (subDataUnit == null) {
			subDataUnit = new EObjectContainmentEList<DataUnit>(DataUnit.class, this, FunctionalResourceModelPackage.DATA_UNIT__SUB_DATA_UNIT);
		}
		return subDataUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionalResourceModelPackage.DATA_UNIT__TYPE_DEFINITION:
				return ((InternalEList<?>)getTypeDefinition()).basicRemove(otherEnd, msgs);
			case FunctionalResourceModelPackage.DATA_UNIT__SUB_DATA_UNIT:
				return ((InternalEList<?>)getSubDataUnit()).basicRemove(otherEnd, msgs);
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
			case FunctionalResourceModelPackage.DATA_UNIT__TYPE_DEFINITION:
				return getTypeDefinition();
			case FunctionalResourceModelPackage.DATA_UNIT__SUB_DATA_UNIT:
				return getSubDataUnit();
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
			case FunctionalResourceModelPackage.DATA_UNIT__TYPE_DEFINITION:
				getTypeDefinition().clear();
				getTypeDefinition().addAll((Collection<? extends TypeDefinition>)newValue);
				return;
			case FunctionalResourceModelPackage.DATA_UNIT__SUB_DATA_UNIT:
				getSubDataUnit().clear();
				getSubDataUnit().addAll((Collection<? extends DataUnit>)newValue);
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
			case FunctionalResourceModelPackage.DATA_UNIT__TYPE_DEFINITION:
				getTypeDefinition().clear();
				return;
			case FunctionalResourceModelPackage.DATA_UNIT__SUB_DATA_UNIT:
				getSubDataUnit().clear();
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
			case FunctionalResourceModelPackage.DATA_UNIT__TYPE_DEFINITION:
				return typeDefinition != null && !typeDefinition.isEmpty();
			case FunctionalResourceModelPackage.DATA_UNIT__SUB_DATA_UNIT:
				return subDataUnit != null && !subDataUnit.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataUnitImpl
