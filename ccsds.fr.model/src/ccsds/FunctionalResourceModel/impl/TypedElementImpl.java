/**
 */
package ccsds.FunctionalResourceModel.impl;

import ccsds.FunctionalResourceModel.FunctionalResourceModelPackage;
import ccsds.FunctionalResourceModel.Oid;
import ccsds.FunctionalResourceModel.TypedElement;

import ccsds.fr.type.model.frtypes.TypeDefinition;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.TypedElementImpl#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.TypedElementImpl#getEngineeringUnit <em>Engineering Unit</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.TypedElementImpl#getExternalTypeOid <em>External Type Oid</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.TypedElementImpl#getTypeOid <em>Type Oid</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.TypedElementImpl#getTypeDef <em>Type Def</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypedElementImpl extends FrModelElementImpl implements TypedElement {
	/**
	 * The default value of the '{@link #getTypeDefinition() <em>Type Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_DEFINITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeDefinition() <em>Type Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefinition()
	 * @generated
	 * @ordered
	 */
	protected String typeDefinition = TYPE_DEFINITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEngineeringUnit() <em>Engineering Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineeringUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String ENGINEERING_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEngineeringUnit() <em>Engineering Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineeringUnit()
	 * @generated
	 * @ordered
	 */
	protected String engineeringUnit = ENGINEERING_UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExternalTypeOid() <em>External Type Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalTypeOid()
	 * @generated
	 * @ordered
	 */
	protected Oid externalTypeOid;

	/**
	 * The cached value of the '{@link #getTypeOid() <em>Type Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOid()
	 * @generated
	 * @ordered
	 */
	protected Oid typeOid;

	/**
	 * The cached value of the '{@link #getTypeDef() <em>Type Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDef()
	 * @generated
	 * @ordered
	 */
	protected TypeDefinition typeDef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionalResourceModelPackage.Literals.TYPED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeDefinition() {
		return typeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDefinition(String newTypeDefinition) {
		String oldTypeDefinition = typeDefinition;
		typeDefinition = newTypeDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.TYPED_ELEMENT__TYPE_DEFINITION, oldTypeDefinition, typeDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEngineeringUnit() {
		return engineeringUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngineeringUnit(String newEngineeringUnit) {
		String oldEngineeringUnit = engineeringUnit;
		engineeringUnit = newEngineeringUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.TYPED_ELEMENT__ENGINEERING_UNIT, oldEngineeringUnit, engineeringUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oid getExternalTypeOid() {
		return externalTypeOid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalTypeOid(Oid newExternalTypeOid, NotificationChain msgs) {
		Oid oldExternalTypeOid = externalTypeOid;
		externalTypeOid = newExternalTypeOid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.TYPED_ELEMENT__EXTERNAL_TYPE_OID, oldExternalTypeOid, newExternalTypeOid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalTypeOid(Oid newExternalTypeOid) {
		if (newExternalTypeOid != externalTypeOid) {
			NotificationChain msgs = null;
			if (externalTypeOid != null)
				msgs = ((InternalEObject)externalTypeOid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionalResourceModelPackage.TYPED_ELEMENT__EXTERNAL_TYPE_OID, null, msgs);
			if (newExternalTypeOid != null)
				msgs = ((InternalEObject)newExternalTypeOid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionalResourceModelPackage.TYPED_ELEMENT__EXTERNAL_TYPE_OID, null, msgs);
			msgs = basicSetExternalTypeOid(newExternalTypeOid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.TYPED_ELEMENT__EXTERNAL_TYPE_OID, newExternalTypeOid, newExternalTypeOid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oid getTypeOid() {
		return typeOid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeOid(Oid newTypeOid, NotificationChain msgs) {
		Oid oldTypeOid = typeOid;
		typeOid = newTypeOid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.TYPED_ELEMENT__TYPE_OID, oldTypeOid, newTypeOid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeOid(Oid newTypeOid) {
		if (newTypeOid != typeOid) {
			NotificationChain msgs = null;
			if (typeOid != null)
				msgs = ((InternalEObject)typeOid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionalResourceModelPackage.TYPED_ELEMENT__TYPE_OID, null, msgs);
			if (newTypeOid != null)
				msgs = ((InternalEObject)newTypeOid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionalResourceModelPackage.TYPED_ELEMENT__TYPE_OID, null, msgs);
			msgs = basicSetTypeOid(newTypeOid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.TYPED_ELEMENT__TYPE_OID, newTypeOid, newTypeOid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition getTypeDef() {
		return typeDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeDef(TypeDefinition newTypeDef, NotificationChain msgs) {
		TypeDefinition oldTypeDef = typeDef;
		typeDef = newTypeDef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.TYPED_ELEMENT__TYPE_DEF, oldTypeDef, newTypeDef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDef(TypeDefinition newTypeDef) {
		if (newTypeDef != typeDef) {
			NotificationChain msgs = null;
			if (typeDef != null)
				msgs = ((InternalEObject)typeDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionalResourceModelPackage.TYPED_ELEMENT__TYPE_DEF, null, msgs);
			if (newTypeDef != null)
				msgs = ((InternalEObject)newTypeDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionalResourceModelPackage.TYPED_ELEMENT__TYPE_DEF, null, msgs);
			msgs = basicSetTypeDef(newTypeDef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.TYPED_ELEMENT__TYPE_DEF, newTypeDef, newTypeDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionalResourceModelPackage.TYPED_ELEMENT__EXTERNAL_TYPE_OID:
				return basicSetExternalTypeOid(null, msgs);
			case FunctionalResourceModelPackage.TYPED_ELEMENT__TYPE_OID:
				return basicSetTypeOid(null, msgs);
			case FunctionalResourceModelPackage.TYPED_ELEMENT__TYPE_DEF:
				return basicSetTypeDef(null, msgs);
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
			case FunctionalResourceModelPackage.TYPED_ELEMENT__TYPE_DEFINITION:
				return getTypeDefinition();
			case FunctionalResourceModelPackage.TYPED_ELEMENT__ENGINEERING_UNIT:
				return getEngineeringUnit();
			case FunctionalResourceModelPackage.TYPED_ELEMENT__EXTERNAL_TYPE_OID:
				return getExternalTypeOid();
			case FunctionalResourceModelPackage.TYPED_ELEMENT__TYPE_OID:
				return getTypeOid();
			case FunctionalResourceModelPackage.TYPED_ELEMENT__TYPE_DEF:
				return getTypeDef();
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
			case FunctionalResourceModelPackage.TYPED_ELEMENT__TYPE_DEFINITION:
				setTypeDefinition((String)newValue);
				return;
			case FunctionalResourceModelPackage.TYPED_ELEMENT__ENGINEERING_UNIT:
				setEngineeringUnit((String)newValue);
				return;
			case FunctionalResourceModelPackage.TYPED_ELEMENT__EXTERNAL_TYPE_OID:
				setExternalTypeOid((Oid)newValue);
				return;
			case FunctionalResourceModelPackage.TYPED_ELEMENT__TYPE_OID:
				setTypeOid((Oid)newValue);
				return;
			case FunctionalResourceModelPackage.TYPED_ELEMENT__TYPE_DEF:
				setTypeDef((TypeDefinition)newValue);
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
			case FunctionalResourceModelPackage.TYPED_ELEMENT__TYPE_DEFINITION:
				setTypeDefinition(TYPE_DEFINITION_EDEFAULT);
				return;
			case FunctionalResourceModelPackage.TYPED_ELEMENT__ENGINEERING_UNIT:
				setEngineeringUnit(ENGINEERING_UNIT_EDEFAULT);
				return;
			case FunctionalResourceModelPackage.TYPED_ELEMENT__EXTERNAL_TYPE_OID:
				setExternalTypeOid((Oid)null);
				return;
			case FunctionalResourceModelPackage.TYPED_ELEMENT__TYPE_OID:
				setTypeOid((Oid)null);
				return;
			case FunctionalResourceModelPackage.TYPED_ELEMENT__TYPE_DEF:
				setTypeDef((TypeDefinition)null);
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
			case FunctionalResourceModelPackage.TYPED_ELEMENT__TYPE_DEFINITION:
				return TYPE_DEFINITION_EDEFAULT == null ? typeDefinition != null : !TYPE_DEFINITION_EDEFAULT.equals(typeDefinition);
			case FunctionalResourceModelPackage.TYPED_ELEMENT__ENGINEERING_UNIT:
				return ENGINEERING_UNIT_EDEFAULT == null ? engineeringUnit != null : !ENGINEERING_UNIT_EDEFAULT.equals(engineeringUnit);
			case FunctionalResourceModelPackage.TYPED_ELEMENT__EXTERNAL_TYPE_OID:
				return externalTypeOid != null;
			case FunctionalResourceModelPackage.TYPED_ELEMENT__TYPE_OID:
				return typeOid != null;
			case FunctionalResourceModelPackage.TYPED_ELEMENT__TYPE_DEF:
				return typeDef != null;
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
		result.append(" (typeDefinition: ");
		result.append(typeDefinition);
		result.append(", engineeringUnit: ");
		result.append(engineeringUnit);
		result.append(')');
		return result.toString();
	}

} //TypedElementImpl
