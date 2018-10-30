/**
 */
package ccsds.fr.type.model.frtypes;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Range Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsds.fr.type.model.frtypes.ValueRangeConstraint#getMin <em>Min</em>}</li>
 *   <li>{@link ccsds.fr.type.model.frtypes.ValueRangeConstraint#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getValueRangeConstraint()
 * @model
 * @generated
 */
public interface ValueRangeConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(long)
	 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getValueRangeConstraint_Min()
	 * @model required="true"
	 * @generated
	 */
	long getMin();

	/**
	 * Sets the value of the '{@link ccsds.fr.type.model.frtypes.ValueRangeConstraint#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(long value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(long)
	 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getValueRangeConstraint_Max()
	 * @model required="true"
	 * @generated
	 */
	long getMax();

	/**
	 * Sets the value of the '{@link ccsds.fr.type.model.frtypes.ValueRangeConstraint#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(long value);

} // ValueRangeConstraint
