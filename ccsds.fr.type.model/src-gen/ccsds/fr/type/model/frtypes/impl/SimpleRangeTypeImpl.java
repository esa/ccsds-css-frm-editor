/**
 */
package ccsds.fr.type.model.frtypes.impl;

import ccsds.fr.type.model.frtypes.Asn1Writer;
import ccsds.fr.type.model.frtypes.FrtypesPackage;
import ccsds.fr.type.model.frtypes.SimpleRangeType;
import ccsds.fr.type.model.frtypes.ValueRangeConstraint;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Range Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsds.fr.type.model.frtypes.impl.SimpleRangeTypeImpl#getRangeConstraint <em>Range Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SimpleRangeTypeImpl extends SimpleTypeImpl implements SimpleRangeType {
	/**
	 * The cached value of the '{@link #getRangeConstraint() <em>Range Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueRangeConstraint> rangeConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleRangeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FrtypesPackage.Literals.SIMPLE_RANGE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueRangeConstraint> getRangeConstraint() {
		if (rangeConstraint == null) {
			rangeConstraint = new EObjectContainmentEList<ValueRangeConstraint>(ValueRangeConstraint.class, this,
					FrtypesPackage.SIMPLE_RANGE_TYPE__RANGE_CONSTRAINT);
		}
		return rangeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FrtypesPackage.SIMPLE_RANGE_TYPE__RANGE_CONSTRAINT:
			return ((InternalEList<?>) getRangeConstraint()).basicRemove(otherEnd, msgs);
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
		case FrtypesPackage.SIMPLE_RANGE_TYPE__RANGE_CONSTRAINT:
			return getRangeConstraint();
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
		case FrtypesPackage.SIMPLE_RANGE_TYPE__RANGE_CONSTRAINT:
			getRangeConstraint().clear();
			getRangeConstraint().addAll((Collection<? extends ValueRangeConstraint>) newValue);
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
		case FrtypesPackage.SIMPLE_RANGE_TYPE__RANGE_CONSTRAINT:
			getRangeConstraint().clear();
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
		case FrtypesPackage.SIMPLE_RANGE_TYPE__RANGE_CONSTRAINT:
			return rangeConstraint != null && !rangeConstraint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * Writes the constraints of this type
	 * @generated NOT
	 */
	public void writeAsn1(int indentLevel, StringBuffer output) {
		if (numSingleValueConstraint() > 0 && getRangeConstraint() != null && getRangeConstraint().size() > 0) {
			output.append(Asn1Writer.INDENT + Asn1Writer.LPAREN);
		}

		super.writeAsn1(0, output); // single value constraint ?

		if (numSingleValueConstraint() > 0 && getRangeConstraint().size() > 0) {
			output.append(Asn1Writer.OR);
		}

		if (getRangeConstraint().size() > 0) {
			int idx = 0;
			for (ValueRangeConstraint c : getRangeConstraint()) {
				c.writeAsn1(indentLevel, output);
				idx++;

				if (idx < getRangeConstraint().size()) {
					output.append(Asn1Writer.OR);
				}
			}
		}

		if (numSingleValueConstraint() > 0 && getRangeConstraint() != null && getRangeConstraint().size() > 0) {
			output.append(Asn1Writer.RPAREN);
		}
	}

} //SimpleRangeTypeImpl
