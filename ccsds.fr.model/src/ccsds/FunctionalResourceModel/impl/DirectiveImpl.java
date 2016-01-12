/**
 */
package ccsds.FunctionalResourceModel.impl;

import ccsds.FunctionalResourceModel.Directive;
import ccsds.FunctionalResourceModel.FunctionalResourceModelPackage;
import ccsds.FunctionalResourceModel.Qualifier;
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
 * An implementation of the model object '<em><b>Directive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.DirectiveImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.DirectiveImpl#getGuardCondition <em>Guard Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DirectiveImpl extends FrModelElementImpl implements Directive {
	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Qualifier> qualifier;

	/**
	 * The default value of the '{@link #getGuardCondition() <em>Guard Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardCondition() <em>Guard Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardCondition()
	 * @generated
	 * @ordered
	 */
	protected String guardCondition = GUARD_CONDITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionalResourceModelPackage.Literals.DIRECTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardCondition() {
		return guardCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardCondition(String newGuardCondition) {
		String oldGuardCondition = guardCondition;
		guardCondition = newGuardCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalResourceModelPackage.DIRECTIVE__GUARD_CONDITION, oldGuardCondition, guardCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Qualifier> getQualifier() {
		if (qualifier == null) {
			qualifier = new EObjectContainmentEList<Qualifier>(Qualifier.class, this, FunctionalResourceModelPackage.DIRECTIVE__QUALIFIER);
		}
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionalResourceModelPackage.DIRECTIVE__QUALIFIER:
				return ((InternalEList<?>)getQualifier()).basicRemove(otherEnd, msgs);
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
			case FunctionalResourceModelPackage.DIRECTIVE__QUALIFIER:
				return getQualifier();
			case FunctionalResourceModelPackage.DIRECTIVE__GUARD_CONDITION:
				return getGuardCondition();
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
			case FunctionalResourceModelPackage.DIRECTIVE__QUALIFIER:
				getQualifier().clear();
				getQualifier().addAll((Collection<? extends Qualifier>)newValue);
				return;
			case FunctionalResourceModelPackage.DIRECTIVE__GUARD_CONDITION:
				setGuardCondition((String)newValue);
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
			case FunctionalResourceModelPackage.DIRECTIVE__QUALIFIER:
				getQualifier().clear();
				return;
			case FunctionalResourceModelPackage.DIRECTIVE__GUARD_CONDITION:
				setGuardCondition(GUARD_CONDITION_EDEFAULT);
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
			case FunctionalResourceModelPackage.DIRECTIVE__QUALIFIER:
				return qualifier != null && !qualifier.isEmpty();
			case FunctionalResourceModelPackage.DIRECTIVE__GUARD_CONDITION:
				return GUARD_CONDITION_EDEFAULT == null ? guardCondition != null : !GUARD_CONDITION_EDEFAULT.equals(guardCondition);
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
		result.append(" (guardCondition: ");
		result.append(guardCondition);
		result.append(')');
		return result.toString();
	}

} //DirectiveImpl
