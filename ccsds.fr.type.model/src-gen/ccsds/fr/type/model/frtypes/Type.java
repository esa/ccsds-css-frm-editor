/**
 */
package ccsds.fr.type.model.frtypes;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsds.fr.type.model.frtypes.Type#getSingleValueConstraint <em>Single Value Constraint</em>}</li>
 * </ul>
 *
 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getType()
 * @model abstract="true"
 * @generated
 */
public interface Type extends Asn1Writer {

	/**
	 * Returns the value of the '<em><b>Single Value Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Value Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Value Constraint</em>' containment reference.
	 * @see #setSingleValueConstraint(SingleValueConstraint)
	 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getType_SingleValueConstraint()
	 * @model containment="true"
	 * @generated
	 */
	SingleValueConstraint getSingleValueConstraint();

	/**
	 * Sets the value of the '{@link ccsds.fr.type.model.frtypes.Type#getSingleValueConstraint <em>Single Value Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Value Constraint</em>' containment reference.
	 * @see #getSingleValueConstraint()
	 * @generated
	 */
	void setSingleValueConstraint(SingleValueConstraint value);

	/**
	 * @return The number of single value constraints 
	 * @generated NOT
	 */
	public default int numSingleValueConstraint() {
		if (getSingleValueConstraint() != null) {
			return getSingleValueConstraint().getValues().size();
		}
		return 0;
	}
} // Type