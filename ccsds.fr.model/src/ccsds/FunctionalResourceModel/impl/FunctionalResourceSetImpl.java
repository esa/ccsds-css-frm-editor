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

import ccsds.FunctionalResourceModel.FunctionalResource;
import ccsds.FunctionalResourceModel.FunctionalResourceModelPackage;
import ccsds.FunctionalResourceModel.FunctionalResourceSet;

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
 * An implementation of the model object '<em><b>Functional Resource Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.FunctionalResourceSetImpl#getName <em>Name</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.FunctionalResourceSetImpl#getFunctionalResource <em>Functional Resource</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.FunctionalResourceSetImpl#getOidOffset <em>Oid Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalResourceSetImpl extends MinimalEObjectImpl.Container implements FunctionalResourceSet {
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
	 * The cached value of the '{@link #getFunctionalResource() <em>Functional Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalResource()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalResource> functionalResource;

	/**
	 * The default value of the '{@link #getOidOffset() <em>Oid Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOidOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int OID_OFFSET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOidOffset() <em>Oid Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOidOffset()
	 * @generated
	 * @ordered
	 */
	protected int oidOffset = OID_OFFSET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalResourceSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionalResourceModelPackage.Literals.FUNCTIONAL_RESOURCE_SET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_SET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalResource> getFunctionalResource() {
		if (functionalResource == null) {
			functionalResource = new EObjectContainmentEList<FunctionalResource>(FunctionalResource.class, this, FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_SET__FUNCTIONAL_RESOURCE);
		}
		return functionalResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOidOffset() {
		return oidOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOidOffset(int newOidOffset) {
		int oldOidOffset = oidOffset;
		oidOffset = newOidOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_SET__OID_OFFSET, oldOidOffset, oidOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_SET__FUNCTIONAL_RESOURCE:
				return ((InternalEList<?>)getFunctionalResource()).basicRemove(otherEnd, msgs);
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
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_SET__NAME:
				return getName();
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_SET__FUNCTIONAL_RESOURCE:
				return getFunctionalResource();
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_SET__OID_OFFSET:
				return getOidOffset();
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
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_SET__NAME:
				setName((String)newValue);
				return;
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_SET__FUNCTIONAL_RESOURCE:
				getFunctionalResource().clear();
				getFunctionalResource().addAll((Collection<? extends FunctionalResource>)newValue);
				return;
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_SET__OID_OFFSET:
				setOidOffset((Integer)newValue);
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
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_SET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_SET__FUNCTIONAL_RESOURCE:
				getFunctionalResource().clear();
				return;
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_SET__OID_OFFSET:
				setOidOffset(OID_OFFSET_EDEFAULT);
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
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_SET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_SET__FUNCTIONAL_RESOURCE:
				return functionalResource != null && !functionalResource.isEmpty();
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_SET__OID_OFFSET:
				return oidOffset != OID_OFFSET_EDEFAULT;
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
		result.append(", oidOffset: ");
		result.append(oidOffset);
		result.append(')');
		return result.toString();
	}

} //FunctionalResourceSetImpl
