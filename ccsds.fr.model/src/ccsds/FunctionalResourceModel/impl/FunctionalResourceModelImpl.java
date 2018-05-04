/**
 */
package ccsds.FunctionalResourceModel.impl;

import ccsds.FunctionalResourceModel.FunctionalResource;
import ccsds.FunctionalResourceModel.FunctionalResourceModel;
import ccsds.FunctionalResourceModel.FunctionalResourceModelPackage;
import ccsds.FunctionalResourceModel.Oid;

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
 * An implementation of the model object '<em><b>Functional Resource Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.FunctionalResourceModelImpl#getRootOid <em>Root Oid</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.FunctionalResourceModelImpl#getFunctionalResource <em>Functional Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalResourceModelImpl extends MinimalEObjectImpl.Container implements FunctionalResourceModel {
	/**
	 * The cached value of the '{@link #getRootOid() <em>Root Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootOid()
	 * @generated
	 * @ordered
	 */
	protected Oid rootOid;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalResourceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionalResourceModelPackage.Literals.FUNCTIONAL_RESOURCE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oid getRootOid() {
		return rootOid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRootOid(Oid newRootOid, NotificationChain msgs) {
		Oid oldRootOid = rootOid;
		rootOid = newRootOid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_MODEL__ROOT_OID, oldRootOid, newRootOid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootOid(Oid newRootOid) {
		if (newRootOid != rootOid) {
			NotificationChain msgs = null;
			if (rootOid != null)
				msgs = ((InternalEObject)rootOid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_MODEL__ROOT_OID, null, msgs);
			if (newRootOid != null)
				msgs = ((InternalEObject)newRootOid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_MODEL__ROOT_OID, null, msgs);
			msgs = basicSetRootOid(newRootOid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_MODEL__ROOT_OID, newRootOid, newRootOid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalResource> getFunctionalResource() {
		if (functionalResource == null) {
			functionalResource = new EObjectContainmentEList<FunctionalResource>(FunctionalResource.class, this, FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_MODEL__FUNCTIONAL_RESOURCE);
		}
		return functionalResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_MODEL__ROOT_OID:
				return basicSetRootOid(null, msgs);
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_MODEL__FUNCTIONAL_RESOURCE:
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
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_MODEL__ROOT_OID:
				return getRootOid();
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_MODEL__FUNCTIONAL_RESOURCE:
				return getFunctionalResource();
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
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_MODEL__ROOT_OID:
				setRootOid((Oid)newValue);
				return;
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_MODEL__FUNCTIONAL_RESOURCE:
				getFunctionalResource().clear();
				getFunctionalResource().addAll((Collection<? extends FunctionalResource>)newValue);
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
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_MODEL__ROOT_OID:
				setRootOid((Oid)null);
				return;
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_MODEL__FUNCTIONAL_RESOURCE:
				getFunctionalResource().clear();
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
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_MODEL__ROOT_OID:
				return rootOid != null;
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_MODEL__FUNCTIONAL_RESOURCE:
				return functionalResource != null && !functionalResource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionalResourceModelImpl
