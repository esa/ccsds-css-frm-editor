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

import ccsds.FunctionalResourceModel.Event;
import ccsds.FunctionalResourceModel.FunctionalResourceModelPackage;
import ccsds.FunctionalResourceModel.Oid;
import ccsds.FunctionalResourceModel.Value;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.EventImpl#getExternalOid <em>External Oid</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.EventImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends FrModelElementImpl implements Event {
	/**
	 * The cached value of the '{@link #getExternalOid() <em>External Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalOid()
	 * @generated
	 * @ordered
	 */
	protected Oid externalOid;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<Value> value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionalResourceModelPackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Value> getValue() {
		if (value == null) {
			value = new EObjectContainmentEList<Value>(Value.class, this, FunctionalResourceModelPackage.EVENT__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oid getExternalOid() {
		return externalOid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalOid(Oid newExternalOid, NotificationChain msgs) {
		Oid oldExternalOid = externalOid;
		externalOid = newExternalOid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.EVENT__EXTERNAL_OID, oldExternalOid, newExternalOid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalOid(Oid newExternalOid) {
		if (newExternalOid != externalOid) {
			NotificationChain msgs = null;
			if (externalOid != null)
				msgs = ((InternalEObject)externalOid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionalResourceModelPackage.EVENT__EXTERNAL_OID, null, msgs);
			if (newExternalOid != null)
				msgs = ((InternalEObject)newExternalOid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionalResourceModelPackage.EVENT__EXTERNAL_OID, null, msgs);
			msgs = basicSetExternalOid(newExternalOid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.EVENT__EXTERNAL_OID, newExternalOid, newExternalOid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionalResourceModelPackage.EVENT__EXTERNAL_OID:
				return basicSetExternalOid(null, msgs);
			case FunctionalResourceModelPackage.EVENT__VALUE:
				return ((InternalEList<?>)getValue()).basicRemove(otherEnd, msgs);
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
			case FunctionalResourceModelPackage.EVENT__EXTERNAL_OID:
				return getExternalOid();
			case FunctionalResourceModelPackage.EVENT__VALUE:
				return getValue();
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
			case FunctionalResourceModelPackage.EVENT__EXTERNAL_OID:
				setExternalOid((Oid)newValue);
				return;
			case FunctionalResourceModelPackage.EVENT__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends Value>)newValue);
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
			case FunctionalResourceModelPackage.EVENT__EXTERNAL_OID:
				setExternalOid((Oid)null);
				return;
			case FunctionalResourceModelPackage.EVENT__VALUE:
				getValue().clear();
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
			case FunctionalResourceModelPackage.EVENT__EXTERNAL_OID:
				return externalOid != null;
			case FunctionalResourceModelPackage.EVENT__VALUE:
				return value != null && !value.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EventImpl
