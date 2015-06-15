/**
 */
package ccsds.FunctionalResourceModel.impl;

import ccsds.FunctionalResourceModel.FunctionalResourceModelPackage;
import ccsds.FunctionalResourceModel.Oid;
import ccsds.FunctionalResourceModel.Parameter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.ParameterImpl#getEngineeringUnit <em>Engineering Unit</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.ParameterImpl#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.ParameterImpl#getExternalTypeOid <em>External Type Oid</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.ParameterImpl#isMonitored <em>Monitored</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.ParameterImpl#isControlled <em>Controlled</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterImpl extends FrModelElementImpl implements Parameter {
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
	 * The cached value of the '{@link #getExternalTypeOid() <em>External Type Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalTypeOid()
	 * @generated
	 * @ordered
	 */
	protected Oid externalTypeOid;

	/**
	 * The default value of the '{@link #isMonitored() <em>Monitored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMonitored()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MONITORED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isMonitored() <em>Monitored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMonitored()
	 * @generated
	 * @ordered
	 */
	protected boolean monitored = MONITORED_EDEFAULT;

	/**
	 * The default value of the '{@link #isControlled() <em>Controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isControlled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTROLLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isControlled() <em>Controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isControlled()
	 * @generated
	 * @ordered
	 */
	protected boolean controlled = CONTROLLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionalResourceModelPackage.Literals.PARAMETER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.PARAMETER__ENGINEERING_UNIT, oldEngineeringUnit, engineeringUnit));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.PARAMETER__TYPE_DEFINITION, oldTypeDefinition, typeDefinition));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.PARAMETER__EXTERNAL_TYPE_OID, oldExternalTypeOid, newExternalTypeOid);
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
				msgs = ((InternalEObject)externalTypeOid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionalResourceModelPackage.PARAMETER__EXTERNAL_TYPE_OID, null, msgs);
			if (newExternalTypeOid != null)
				msgs = ((InternalEObject)newExternalTypeOid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionalResourceModelPackage.PARAMETER__EXTERNAL_TYPE_OID, null, msgs);
			msgs = basicSetExternalTypeOid(newExternalTypeOid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.PARAMETER__EXTERNAL_TYPE_OID, newExternalTypeOid, newExternalTypeOid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMonitored() {
		return monitored;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitored(boolean newMonitored) {
		boolean oldMonitored = monitored;
		monitored = newMonitored;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.PARAMETER__MONITORED, oldMonitored, monitored));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isControlled() {
		return controlled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlled(boolean newControlled) {
		boolean oldControlled = controlled;
		controlled = newControlled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.PARAMETER__CONTROLLED, oldControlled, controlled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionalResourceModelPackage.PARAMETER__EXTERNAL_TYPE_OID:
				return basicSetExternalTypeOid(null, msgs);
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
			case FunctionalResourceModelPackage.PARAMETER__ENGINEERING_UNIT:
				return getEngineeringUnit();
			case FunctionalResourceModelPackage.PARAMETER__TYPE_DEFINITION:
				return getTypeDefinition();
			case FunctionalResourceModelPackage.PARAMETER__EXTERNAL_TYPE_OID:
				return getExternalTypeOid();
			case FunctionalResourceModelPackage.PARAMETER__MONITORED:
				return isMonitored();
			case FunctionalResourceModelPackage.PARAMETER__CONTROLLED:
				return isControlled();
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
			case FunctionalResourceModelPackage.PARAMETER__ENGINEERING_UNIT:
				setEngineeringUnit((String)newValue);
				return;
			case FunctionalResourceModelPackage.PARAMETER__TYPE_DEFINITION:
				setTypeDefinition((String)newValue);
				return;
			case FunctionalResourceModelPackage.PARAMETER__EXTERNAL_TYPE_OID:
				setExternalTypeOid((Oid)newValue);
				return;
			case FunctionalResourceModelPackage.PARAMETER__MONITORED:
				setMonitored((Boolean)newValue);
				return;
			case FunctionalResourceModelPackage.PARAMETER__CONTROLLED:
				setControlled((Boolean)newValue);
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
			case FunctionalResourceModelPackage.PARAMETER__ENGINEERING_UNIT:
				setEngineeringUnit(ENGINEERING_UNIT_EDEFAULT);
				return;
			case FunctionalResourceModelPackage.PARAMETER__TYPE_DEFINITION:
				setTypeDefinition(TYPE_DEFINITION_EDEFAULT);
				return;
			case FunctionalResourceModelPackage.PARAMETER__EXTERNAL_TYPE_OID:
				setExternalTypeOid((Oid)null);
				return;
			case FunctionalResourceModelPackage.PARAMETER__MONITORED:
				setMonitored(MONITORED_EDEFAULT);
				return;
			case FunctionalResourceModelPackage.PARAMETER__CONTROLLED:
				setControlled(CONTROLLED_EDEFAULT);
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
			case FunctionalResourceModelPackage.PARAMETER__ENGINEERING_UNIT:
				return ENGINEERING_UNIT_EDEFAULT == null ? engineeringUnit != null : !ENGINEERING_UNIT_EDEFAULT.equals(engineeringUnit);
			case FunctionalResourceModelPackage.PARAMETER__TYPE_DEFINITION:
				return TYPE_DEFINITION_EDEFAULT == null ? typeDefinition != null : !TYPE_DEFINITION_EDEFAULT.equals(typeDefinition);
			case FunctionalResourceModelPackage.PARAMETER__EXTERNAL_TYPE_OID:
				return externalTypeOid != null;
			case FunctionalResourceModelPackage.PARAMETER__MONITORED:
				return monitored != MONITORED_EDEFAULT;
			case FunctionalResourceModelPackage.PARAMETER__CONTROLLED:
				return controlled != CONTROLLED_EDEFAULT;
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
		result.append(" (engineeringUnit: ");
		result.append(engineeringUnit);
		result.append(", typeDefinition: ");
		result.append(typeDefinition);
		result.append(", monitored: ");
		result.append(monitored);
		result.append(", controlled: ");
		result.append(controlled);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
