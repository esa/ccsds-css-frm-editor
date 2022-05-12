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

import ccsds.FunctionalResourceModel.FunctionalResourceModelPackage;
import ccsds.FunctionalResourceModel.FunctionalResourceSet;
import ccsds.FunctionalResourceModel.FunctionalResourceStratum;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Resource Stratum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.FunctionalResourceStratumImpl#getName <em>Name</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.FunctionalResourceStratumImpl#getFunctionalResourceSet <em>Functional Resource Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalResourceStratumImpl extends MinimalEObjectImpl.Container implements FunctionalResourceStratum {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFunctionalResourceSet() <em>Functional Resource Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalResourceSet()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalResourceSet> functionalResourceSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalResourceStratumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionalResourceModelPackage.Literals.FUNCTIONAL_RESOURCE_STRATUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_STRATUM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalResourceSet> getFunctionalResourceSet() {
		if (functionalResourceSet == null) {
			functionalResourceSet = new EObjectContainmentEList<FunctionalResourceSet>(FunctionalResourceSet.class, this, FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_STRATUM__FUNCTIONAL_RESOURCE_SET);
		}
		return functionalResourceSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_STRATUM__FUNCTIONAL_RESOURCE_SET:
				return ((InternalEList<?>)getFunctionalResourceSet()).basicRemove(otherEnd, msgs);
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
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_STRATUM__NAME:
				return getName();
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_STRATUM__FUNCTIONAL_RESOURCE_SET:
				return getFunctionalResourceSet();
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
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_STRATUM__NAME:
				setName((String)newValue);
				return;
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_STRATUM__FUNCTIONAL_RESOURCE_SET:
				getFunctionalResourceSet().clear();
				getFunctionalResourceSet().addAll((Collection<? extends FunctionalResourceSet>)newValue);
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
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_STRATUM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_STRATUM__FUNCTIONAL_RESOURCE_SET:
				getFunctionalResourceSet().clear();
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
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_STRATUM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_STRATUM__FUNCTIONAL_RESOURCE_SET:
				return functionalResourceSet != null && !functionalResourceSet.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FunctionalResourceStratumImpl
