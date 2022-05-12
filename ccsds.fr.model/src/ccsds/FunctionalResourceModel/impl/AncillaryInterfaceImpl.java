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

import ccsds.FunctionalResourceModel.AncillaryInterface;
import ccsds.FunctionalResourceModel.FunctionalResource;
import ccsds.FunctionalResourceModel.FunctionalResourceModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ancillary Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.AncillaryInterfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.AncillaryInterfaceImpl#getProvidingFunctionalResource <em>Providing Functional Resource</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.AncillaryInterfaceImpl#getRequiringFunctionalResource <em>Requiring Functional Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AncillaryInterfaceImpl extends MinimalEObjectImpl.Container implements AncillaryInterface {
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
	 * The cached value of the '{@link #getRequiringFunctionalResource() <em>Requiring Functional Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiringFunctionalResource()
	 * @generated
	 * @ordered
	 */
	protected FunctionalResource requiringFunctionalResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AncillaryInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionalResourceModelPackage.Literals.ANCILLARY_INTERFACE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.ANCILLARY_INTERFACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalResource getProvidingFunctionalResource() {
		if (eContainerFeatureID() != FunctionalResourceModelPackage.ANCILLARY_INTERFACE__PROVIDING_FUNCTIONAL_RESOURCE) return null;
		return (FunctionalResource)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvidingFunctionalResource(FunctionalResource newProvidingFunctionalResource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProvidingFunctionalResource, FunctionalResourceModelPackage.ANCILLARY_INTERFACE__PROVIDING_FUNCTIONAL_RESOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidingFunctionalResource(FunctionalResource newProvidingFunctionalResource) {
		if (newProvidingFunctionalResource != eInternalContainer() || (eContainerFeatureID() != FunctionalResourceModelPackage.ANCILLARY_INTERFACE__PROVIDING_FUNCTIONAL_RESOURCE && newProvidingFunctionalResource != null)) {
			if (EcoreUtil.isAncestor(this, newProvidingFunctionalResource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProvidingFunctionalResource != null)
				msgs = ((InternalEObject)newProvidingFunctionalResource).eInverseAdd(this, FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__PROVIDED_ANCILLARY_INTERFACE, FunctionalResource.class, msgs);
			msgs = basicSetProvidingFunctionalResource(newProvidingFunctionalResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.ANCILLARY_INTERFACE__PROVIDING_FUNCTIONAL_RESOURCE, newProvidingFunctionalResource, newProvidingFunctionalResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalResource getRequiringFunctionalResource() {
		if (requiringFunctionalResource != null && requiringFunctionalResource.eIsProxy()) {
			InternalEObject oldRequiringFunctionalResource = (InternalEObject)requiringFunctionalResource;
			requiringFunctionalResource = (FunctionalResource)eResolveProxy(oldRequiringFunctionalResource);
			if (requiringFunctionalResource != oldRequiringFunctionalResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionalResourceModelPackage.ANCILLARY_INTERFACE__REQUIRING_FUNCTIONAL_RESOURCE, oldRequiringFunctionalResource, requiringFunctionalResource));
			}
		}
		return requiringFunctionalResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalResource basicGetRequiringFunctionalResource() {
		return requiringFunctionalResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiringFunctionalResource(FunctionalResource newRequiringFunctionalResource) {
		FunctionalResource oldRequiringFunctionalResource = requiringFunctionalResource;
		requiringFunctionalResource = newRequiringFunctionalResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.ANCILLARY_INTERFACE__REQUIRING_FUNCTIONAL_RESOURCE, oldRequiringFunctionalResource, requiringFunctionalResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionalResourceModelPackage.ANCILLARY_INTERFACE__PROVIDING_FUNCTIONAL_RESOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProvidingFunctionalResource((FunctionalResource)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionalResourceModelPackage.ANCILLARY_INTERFACE__PROVIDING_FUNCTIONAL_RESOURCE:
				return basicSetProvidingFunctionalResource(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case FunctionalResourceModelPackage.ANCILLARY_INTERFACE__PROVIDING_FUNCTIONAL_RESOURCE:
				return eInternalContainer().eInverseRemove(this, FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__PROVIDED_ANCILLARY_INTERFACE, FunctionalResource.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FunctionalResourceModelPackage.ANCILLARY_INTERFACE__NAME:
				return getName();
			case FunctionalResourceModelPackage.ANCILLARY_INTERFACE__PROVIDING_FUNCTIONAL_RESOURCE:
				return getProvidingFunctionalResource();
			case FunctionalResourceModelPackage.ANCILLARY_INTERFACE__REQUIRING_FUNCTIONAL_RESOURCE:
				if (resolve) return getRequiringFunctionalResource();
				return basicGetRequiringFunctionalResource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FunctionalResourceModelPackage.ANCILLARY_INTERFACE__NAME:
				setName((String)newValue);
				return;
			case FunctionalResourceModelPackage.ANCILLARY_INTERFACE__PROVIDING_FUNCTIONAL_RESOURCE:
				setProvidingFunctionalResource((FunctionalResource)newValue);
				return;
			case FunctionalResourceModelPackage.ANCILLARY_INTERFACE__REQUIRING_FUNCTIONAL_RESOURCE:
				setRequiringFunctionalResource((FunctionalResource)newValue);
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
			case FunctionalResourceModelPackage.ANCILLARY_INTERFACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FunctionalResourceModelPackage.ANCILLARY_INTERFACE__PROVIDING_FUNCTIONAL_RESOURCE:
				setProvidingFunctionalResource((FunctionalResource)null);
				return;
			case FunctionalResourceModelPackage.ANCILLARY_INTERFACE__REQUIRING_FUNCTIONAL_RESOURCE:
				setRequiringFunctionalResource((FunctionalResource)null);
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
			case FunctionalResourceModelPackage.ANCILLARY_INTERFACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FunctionalResourceModelPackage.ANCILLARY_INTERFACE__PROVIDING_FUNCTIONAL_RESOURCE:
				return getProvidingFunctionalResource() != null;
			case FunctionalResourceModelPackage.ANCILLARY_INTERFACE__REQUIRING_FUNCTIONAL_RESOURCE:
				return requiringFunctionalResource != null;
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

} //AncillaryInterfaceImpl
