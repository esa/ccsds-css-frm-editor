/**
 */
package ccsds.FunctionalResourceModel.impl;

import ccsds.FunctionalResourceModel.FunctionalResourceModelPackage;
import ccsds.FunctionalResourceModel.Oid;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Oid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.OidImpl#getOidBit <em>Oid Bit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OidImpl extends MinimalEObjectImpl.Container implements Oid {
	/**
	 * The cached value of the '{@link #getOidBit() <em>Oid Bit</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOidBit()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> oidBit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OidImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionalResourceModelPackage.Literals.OID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getOidBit() {
		if (oidBit == null) {
			oidBit = new EDataTypeEList<Integer>(Integer.class, this, FunctionalResourceModelPackage.OID__OID_BIT);
		}
		return oidBit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FunctionalResourceModelPackage.OID__OID_BIT:
				return getOidBit();
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
			case FunctionalResourceModelPackage.OID__OID_BIT:
				getOidBit().clear();
				getOidBit().addAll((Collection<? extends Integer>)newValue);
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
			case FunctionalResourceModelPackage.OID__OID_BIT:
				getOidBit().clear();
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
			case FunctionalResourceModelPackage.OID__OID_BIT:
				return oidBit != null && !oidBit.isEmpty();
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
		result.append(" (oidBit: ");
		result.append(oidBit);
		result.append(')');
		return result.toString();
	}

} //OidImpl
