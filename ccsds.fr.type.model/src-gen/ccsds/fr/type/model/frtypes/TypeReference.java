/**
 */
package ccsds.fr.type.model.frtypes;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsds.fr.type.model.frtypes.TypeReference#getTypeAssignment <em>Type Assignment</em>}</li>
 * </ul>
 *
 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getTypeReference()
 * @model
 * @generated
 */
public interface TypeReference extends Type {
	/**
	 * Returns the value of the '<em><b>Type Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Assignment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Assignment</em>' reference.
	 * @see #setTypeAssignment(TypeAssignment)
	 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getTypeReference_TypeAssignment()
	 * @model keys="name" required="true"
	 * @generated
	 */
	TypeAssignment getTypeAssignment();

	/**
	 * Sets the value of the '{@link ccsds.fr.type.model.frtypes.TypeReference#getTypeAssignment <em>Type Assignment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Assignment</em>' reference.
	 * @see #getTypeAssignment()
	 * @generated
	 */
	void setTypeAssignment(TypeAssignment value);

} // TypeReference
