/**
 */
package ccsds.fr.type.model.frtypes;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Character String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsds.fr.type.model.frtypes.CharacterString#getPermittedAlphabetConstraint <em>Permitted Alphabet Constraint</em>}</li>
 *   <li>{@link ccsds.fr.type.model.frtypes.CharacterString#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getCharacterString()
 * @model
 * @generated
 */
public interface CharacterString extends SimpleSizeConstrainedType {

	/**
	 * Returns the value of the '<em><b>Permitted Alphabet Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permitted Alphabet Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permitted Alphabet Constraint</em>' containment reference.
	 * @see #setPermittedAlphabetConstraint(PermittedAlphabetConstraint)
	 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getCharacterString_PermittedAlphabetConstraint()
	 * @model containment="true"
	 * @generated
	 */
	PermittedAlphabetConstraint getPermittedAlphabetConstraint();

	/**
	 * Sets the value of the '{@link ccsds.fr.type.model.frtypes.CharacterString#getPermittedAlphabetConstraint <em>Permitted Alphabet Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permitted Alphabet Constraint</em>' containment reference.
	 * @see #getPermittedAlphabetConstraint()
	 * @generated
	 */
	void setPermittedAlphabetConstraint(PermittedAlphabetConstraint value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"VisibleString"</code>.
	 * The literals are from the enumeration {@link ccsds.fr.type.model.frtypes.StringType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ccsds.fr.type.model.frtypes.StringType
	 * @see #setType(StringType)
	 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getCharacterString_Type()
	 * @model default="VisibleString"
	 * @generated
	 */
	StringType getType();

	/**
	 * Sets the value of the '{@link ccsds.fr.type.model.frtypes.CharacterString#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ccsds.fr.type.model.frtypes.StringType
	 * @see #getType()
	 * @generated
	 */
	void setType(StringType value);
} // CharacterString
