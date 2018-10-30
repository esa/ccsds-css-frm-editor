/**
 */
package ccsds.fr.type.model.frtypes;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Size Constrained Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsds.fr.type.model.frtypes.StructuredSizeConstrainedType#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getStructuredSizeConstrainedType()
 * @model abstract="true"
 * @generated
 */
public interface StructuredSizeConstrainedType extends StructuredType, SizeConstrainedType {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference.
	 * @see #setComponents(Type)
	 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getStructuredSizeConstrainedType_Components()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Type getComponents();

	/**
	 * Sets the value of the '{@link ccsds.fr.type.model.frtypes.StructuredSizeConstrainedType#getComponents <em>Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Components</em>' containment reference.
	 * @see #getComponents()
	 * @generated
	 */
	void setComponents(Type value);

} // StructuredSizeConstrainedType
