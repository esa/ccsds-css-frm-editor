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
 *   <li>{@link ccsds.fr.type.model.frtypes.StructuredSizeConstrainedType#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getStructuredSizeConstrainedType()
 * @model abstract="true"
 * @generated
 */
public interface StructuredSizeConstrainedType extends StructuredType, SizeConstrainedType {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference.
	 * @see #setElements(Type)
	 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getStructuredSizeConstrainedType_Elements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Type getElements();

	/**
	 * Sets the value of the '{@link ccsds.fr.type.model.frtypes.StructuredSizeConstrainedType#getElements <em>Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elements</em>' containment reference.
	 * @see #getElements()
	 * @generated
	 */
	void setElements(Type value);

} // StructuredSizeConstrainedType
