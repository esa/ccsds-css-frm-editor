/**
 */
package ccsds.fr.type.model.frtypes;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Reference External</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsds.fr.type.model.frtypes.TypeReferenceExternal#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getTypeReferenceExternal()
 * @model
 * @generated
 */
public interface TypeReferenceExternal extends Type {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getTypeReferenceExternal_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ccsds.fr.type.model.frtypes.TypeReferenceExternal#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TypeReferenceExternal