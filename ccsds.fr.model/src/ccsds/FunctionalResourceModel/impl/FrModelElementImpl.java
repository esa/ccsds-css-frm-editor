/**
 */
package ccsds.FunctionalResourceModel.impl;

import ccsds.FunctionalResourceModel.FrModelElement;
import ccsds.FunctionalResourceModel.FunctionalResourceModelPackage;
import ccsds.FunctionalResourceModel.Oid;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fr Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.FrModelElementImpl#getSemanticDefinition <em>Semantic Definition</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.FrModelElementImpl#getOidBit <em>Oid Bit</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.FrModelElementImpl#getOid <em>Oid</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.FrModelElementImpl#isDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.FrModelElementImpl#getAuthorizingEntity <em>Authorizing Entity</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.FrModelElementImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.FrModelElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.FrModelElementImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FrModelElementImpl extends MinimalEObjectImpl.Container implements FrModelElement {
	/**
	 * The default value of the '{@link #getSemanticDefinition() <em>Semantic Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final String SEMANTIC_DEFINITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSemanticDefinition() <em>Semantic Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticDefinition()
	 * @generated
	 * @ordered
	 */
	protected String semanticDefinition = SEMANTIC_DEFINITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOidBit() <em>Oid Bit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOidBit()
	 * @generated
	 * @ordered
	 */
	protected static final int OID_BIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOidBit() <em>Oid Bit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOidBit()
	 * @generated
	 * @ordered
	 */
	protected int oidBit = OID_BIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOid() <em>Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOid()
	 * @generated
	 * @ordered
	 */
	protected Oid oid;

	/**
	 * The default value of the '{@link #isDeprecated() <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeprecated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEPRECATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDeprecated() <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeprecated()
	 * @generated
	 * @ordered
	 */
	protected boolean deprecated = DEPRECATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthorizingEntity() <em>Authorizing Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizingEntity()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHORIZING_ENTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthorizingEntity() <em>Authorizing Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizingEntity()
	 * @generated
	 * @ordered
	 */
	protected String authorizingEntity = AUTHORIZING_ENTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Date creationDate = CREATION_DATE_EDEFAULT;

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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int VERSION_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected int version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionalResourceModelPackage.Literals.FR_MODEL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSemanticDefinition() {
		return semanticDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemanticDefinition(String newSemanticDefinition) {
		String oldSemanticDefinition = semanticDefinition;
		semanticDefinition = newSemanticDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.FR_MODEL_ELEMENT__SEMANTIC_DEFINITION, oldSemanticDefinition, semanticDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOidBit() {
		return oidBit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOidBit(int newOidBit) {
		int oldOidBit = oidBit;
		oidBit = newOidBit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.FR_MODEL_ELEMENT__OID_BIT, oldOidBit, oidBit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oid getOid() {
		return oid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOid(Oid newOid, NotificationChain msgs) {
		Oid oldOid = oid;
		oid = newOid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.FR_MODEL_ELEMENT__OID, oldOid, newOid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOid(Oid newOid) {
		if (newOid != oid) {
			NotificationChain msgs = null;
			if (oid != null)
				msgs = ((InternalEObject)oid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionalResourceModelPackage.FR_MODEL_ELEMENT__OID, null, msgs);
			if (newOid != null)
				msgs = ((InternalEObject)newOid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionalResourceModelPackage.FR_MODEL_ELEMENT__OID, null, msgs);
			msgs = basicSetOid(newOid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.FR_MODEL_ELEMENT__OID, newOid, newOid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDeprecated() {
		return deprecated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeprecated(boolean newDeprecated) {
		boolean oldDeprecated = deprecated;
		deprecated = newDeprecated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.FR_MODEL_ELEMENT__DEPRECATED, oldDeprecated, deprecated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthorizingEntity() {
		return authorizingEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorizingEntity(String newAuthorizingEntity) {
		String oldAuthorizingEntity = authorizingEntity;
		authorizingEntity = newAuthorizingEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.FR_MODEL_ELEMENT__AUTHORIZING_ENTITY, oldAuthorizingEntity, authorizingEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(Date newCreationDate) {
		Date oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.FR_MODEL_ELEMENT__CREATION_DATE, oldCreationDate, creationDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.FR_MODEL_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(int newVersion) {
		int oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.FR_MODEL_ELEMENT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__OID:
				return basicSetOid(null, msgs);
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
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__SEMANTIC_DEFINITION:
				return getSemanticDefinition();
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__OID_BIT:
				return getOidBit();
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__OID:
				return getOid();
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__DEPRECATED:
				return isDeprecated();
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__AUTHORIZING_ENTITY:
				return getAuthorizingEntity();
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__CREATION_DATE:
				return getCreationDate();
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__NAME:
				return getName();
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__VERSION:
				return getVersion();
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
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__SEMANTIC_DEFINITION:
				setSemanticDefinition((String)newValue);
				return;
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__OID_BIT:
				setOidBit((Integer)newValue);
				return;
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__OID:
				setOid((Oid)newValue);
				return;
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__DEPRECATED:
				setDeprecated((Boolean)newValue);
				return;
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__AUTHORIZING_ENTITY:
				setAuthorizingEntity((String)newValue);
				return;
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__CREATION_DATE:
				setCreationDate((Date)newValue);
				return;
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__VERSION:
				setVersion((Integer)newValue);
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
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__SEMANTIC_DEFINITION:
				setSemanticDefinition(SEMANTIC_DEFINITION_EDEFAULT);
				return;
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__OID_BIT:
				setOidBit(OID_BIT_EDEFAULT);
				return;
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__OID:
				setOid((Oid)null);
				return;
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__DEPRECATED:
				setDeprecated(DEPRECATED_EDEFAULT);
				return;
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__AUTHORIZING_ENTITY:
				setAuthorizingEntity(AUTHORIZING_ENTITY_EDEFAULT);
				return;
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__SEMANTIC_DEFINITION:
				return SEMANTIC_DEFINITION_EDEFAULT == null ? semanticDefinition != null : !SEMANTIC_DEFINITION_EDEFAULT.equals(semanticDefinition);
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__OID_BIT:
				return oidBit != OID_BIT_EDEFAULT;
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__OID:
				return oid != null;
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__DEPRECATED:
				return deprecated != DEPRECATED_EDEFAULT;
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__AUTHORIZING_ENTITY:
				return AUTHORIZING_ENTITY_EDEFAULT == null ? authorizingEntity != null : !AUTHORIZING_ENTITY_EDEFAULT.equals(authorizingEntity);
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__VERSION:
				return version != VERSION_EDEFAULT;
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
		result.append(" (SemanticDefinition: ");
		result.append(semanticDefinition);
		result.append(", oidBit: ");
		result.append(oidBit);
		result.append(", deprecated: ");
		result.append(deprecated);
		result.append(", authorizingEntity: ");
		result.append(authorizingEntity);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(", name: ");
		result.append(name);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //FrModelElementImpl