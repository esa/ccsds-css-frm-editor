/**
 */
package ccsds.FunctionalResourceModel.impl;

import ccsds.FunctionalResourceModel.FunctionalResource;
import ccsds.FunctionalResourceModel.FunctionalResourceModelPackage;
import ccsds.FunctionalResourceModel.ServiceAccessPoint;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Access Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.ServiceAccessPointImpl#getName <em>Name</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.ServiceAccessPointImpl#getMinAccessor <em>Min Accessor</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.ServiceAccessPointImpl#getMaxAccessor <em>Max Accessor</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.ServiceAccessPointImpl#getMinAccessed <em>Min Accessed</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.ServiceAccessPointImpl#getMaxAccessed <em>Max Accessed</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.ServiceAccessPointImpl#getAccessingFunctionalResource <em>Accessing Functional Resource</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.ServiceAccessPointImpl#getAccessedFunctionalResource <em>Accessed Functional Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceAccessPointImpl extends MinimalEObjectImpl.Container implements ServiceAccessPoint {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "newSAP";

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
	 * The default value of the '{@link #getMinAccessor() <em>Min Accessor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinAccessor()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_ACCESSOR_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMinAccessor() <em>Min Accessor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinAccessor()
	 * @generated
	 * @ordered
	 */
	protected int minAccessor = MIN_ACCESSOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxAccessor() <em>Max Accessor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAccessor()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_ACCESSOR_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMaxAccessor() <em>Max Accessor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAccessor()
	 * @generated
	 * @ordered
	 */
	protected int maxAccessor = MAX_ACCESSOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinAccessed() <em>Min Accessed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinAccessed()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_ACCESSED_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMinAccessed() <em>Min Accessed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinAccessed()
	 * @generated
	 * @ordered
	 */
	protected int minAccessed = MIN_ACCESSED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxAccessed() <em>Max Accessed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAccessed()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_ACCESSED_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMaxAccessed() <em>Max Accessed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAccessed()
	 * @generated
	 * @ordered
	 */
	protected int maxAccessed = MAX_ACCESSED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAccessedFunctionalResource() <em>Accessed Functional Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessedFunctionalResource()
	 * @generated
	 * @ordered
	 */
	protected FunctionalResource accessedFunctionalResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceAccessPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionalResourceModelPackage.Literals.SERVICE_ACCESS_POINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinAccessor() {
		return minAccessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinAccessor(int newMinAccessor) {
		int oldMinAccessor = minAccessor;
		minAccessor = newMinAccessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__MIN_ACCESSOR, oldMinAccessor, minAccessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxAccessor() {
		return maxAccessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxAccessor(int newMaxAccessor) {
		int oldMaxAccessor = maxAccessor;
		maxAccessor = newMaxAccessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__MAX_ACCESSOR, oldMaxAccessor, maxAccessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinAccessed() {
		return minAccessed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinAccessed(int newMinAccessed) {
		int oldMinAccessed = minAccessed;
		minAccessed = newMinAccessed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__MIN_ACCESSED, oldMinAccessed, minAccessed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxAccessed() {
		return maxAccessed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxAccessed(int newMaxAccessed) {
		int oldMaxAccessed = maxAccessed;
		maxAccessed = newMaxAccessed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__MAX_ACCESSED, oldMaxAccessed, maxAccessed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalResource getAccessingFunctionalResource() {
		if (eContainerFeatureID() != FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__ACCESSING_FUNCTIONAL_RESOURCE) return null;
		return (FunctionalResource)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccessingFunctionalResource(FunctionalResource newAccessingFunctionalResource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAccessingFunctionalResource, FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__ACCESSING_FUNCTIONAL_RESOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessingFunctionalResource(FunctionalResource newAccessingFunctionalResource) {
		if (newAccessingFunctionalResource != eInternalContainer() || (eContainerFeatureID() != FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__ACCESSING_FUNCTIONAL_RESOURCE && newAccessingFunctionalResource != null)) {
			if (EcoreUtil.isAncestor(this, newAccessingFunctionalResource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAccessingFunctionalResource != null)
				msgs = ((InternalEObject)newAccessingFunctionalResource).eInverseAdd(this, FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__SERVICE_ACCESSPOINT, FunctionalResource.class, msgs);
			msgs = basicSetAccessingFunctionalResource(newAccessingFunctionalResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__ACCESSING_FUNCTIONAL_RESOURCE, newAccessingFunctionalResource, newAccessingFunctionalResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalResource getAccessedFunctionalResource() {
		if (accessedFunctionalResource != null && accessedFunctionalResource.eIsProxy()) {
			InternalEObject oldAccessedFunctionalResource = (InternalEObject)accessedFunctionalResource;
			accessedFunctionalResource = (FunctionalResource)eResolveProxy(oldAccessedFunctionalResource);
			if (accessedFunctionalResource != oldAccessedFunctionalResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__ACCESSED_FUNCTIONAL_RESOURCE, oldAccessedFunctionalResource, accessedFunctionalResource));
			}
		}
		return accessedFunctionalResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalResource basicGetAccessedFunctionalResource() {
		return accessedFunctionalResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessedFunctionalResource(FunctionalResource newAccessedFunctionalResource) {
		FunctionalResource oldAccessedFunctionalResource = accessedFunctionalResource;
		accessedFunctionalResource = newAccessedFunctionalResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__ACCESSED_FUNCTIONAL_RESOURCE, oldAccessedFunctionalResource, accessedFunctionalResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__ACCESSING_FUNCTIONAL_RESOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAccessingFunctionalResource((FunctionalResource)otherEnd, msgs);
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
			case FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__ACCESSING_FUNCTIONAL_RESOURCE:
				return basicSetAccessingFunctionalResource(null, msgs);
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
			case FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__ACCESSING_FUNCTIONAL_RESOURCE:
				return eInternalContainer().eInverseRemove(this, FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__SERVICE_ACCESSPOINT, FunctionalResource.class, msgs);
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
			case FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__NAME:
				return getName();
			case FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__MIN_ACCESSOR:
				return getMinAccessor();
			case FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__MAX_ACCESSOR:
				return getMaxAccessor();
			case FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__MIN_ACCESSED:
				return getMinAccessed();
			case FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__MAX_ACCESSED:
				return getMaxAccessed();
			case FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__ACCESSING_FUNCTIONAL_RESOURCE:
				return getAccessingFunctionalResource();
			case FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__ACCESSED_FUNCTIONAL_RESOURCE:
				if (resolve) return getAccessedFunctionalResource();
				return basicGetAccessedFunctionalResource();
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
			case FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__NAME:
				setName((String)newValue);
				return;
			case FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__MIN_ACCESSOR:
				setMinAccessor((Integer)newValue);
				return;
			case FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__MAX_ACCESSOR:
				setMaxAccessor((Integer)newValue);
				return;
			case FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__MIN_ACCESSED:
				setMinAccessed((Integer)newValue);
				return;
			case FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__MAX_ACCESSED:
				setMaxAccessed((Integer)newValue);
				return;
			case FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__ACCESSING_FUNCTIONAL_RESOURCE:
				setAccessingFunctionalResource((FunctionalResource)newValue);
				return;
			case FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__ACCESSED_FUNCTIONAL_RESOURCE:
				setAccessedFunctionalResource((FunctionalResource)newValue);
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
			case FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__MIN_ACCESSOR:
				setMinAccessor(MIN_ACCESSOR_EDEFAULT);
				return;
			case FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__MAX_ACCESSOR:
				setMaxAccessor(MAX_ACCESSOR_EDEFAULT);
				return;
			case FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__MIN_ACCESSED:
				setMinAccessed(MIN_ACCESSED_EDEFAULT);
				return;
			case FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__MAX_ACCESSED:
				setMaxAccessed(MAX_ACCESSED_EDEFAULT);
				return;
			case FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__ACCESSING_FUNCTIONAL_RESOURCE:
				setAccessingFunctionalResource((FunctionalResource)null);
				return;
			case FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__ACCESSED_FUNCTIONAL_RESOURCE:
				setAccessedFunctionalResource((FunctionalResource)null);
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
			case FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__MIN_ACCESSOR:
				return minAccessor != MIN_ACCESSOR_EDEFAULT;
			case FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__MAX_ACCESSOR:
				return maxAccessor != MAX_ACCESSOR_EDEFAULT;
			case FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__MIN_ACCESSED:
				return minAccessed != MIN_ACCESSED_EDEFAULT;
			case FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__MAX_ACCESSED:
				return maxAccessed != MAX_ACCESSED_EDEFAULT;
			case FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__ACCESSING_FUNCTIONAL_RESOURCE:
				return getAccessingFunctionalResource() != null;
			case FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__ACCESSED_FUNCTIONAL_RESOURCE:
				return accessedFunctionalResource != null;
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
		result.append(", minAccessor: ");
		result.append(minAccessor);
		result.append(", maxAccessor: ");
		result.append(maxAccessor);
		result.append(", minAccessed: ");
		result.append(minAccessed);
		result.append(", maxAccessed: ");
		result.append(maxAccessed);
		result.append(')');
		return result.toString();
	}

} //ServiceAccessPointImpl
