/**
 */
package ccsds.fr.type.model.frtypes;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Size Range Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsds.fr.type.model.frtypes.SimpleSizeRangeType#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getSimpleSizeRangeType()
 * @model abstract="true"
 * @generated
 */
public interface SimpleSizeRangeType extends SimpleType {
	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(SizeRange)
	 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getSimpleSizeRangeType_Range()
	 * @model containment="true"
	 * @generated
	 */
	SizeRange getRange();

	/**
	 * Sets the value of the '{@link ccsds.fr.type.model.frtypes.SimpleSizeRangeType#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(SizeRange value);

} // SimpleSizeRangeType
