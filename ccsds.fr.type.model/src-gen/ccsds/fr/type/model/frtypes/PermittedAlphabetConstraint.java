/**
 */
package ccsds.fr.type.model.frtypes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permitted Alphabet Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsds.fr.type.model.frtypes.PermittedAlphabetConstraint#getValues <em>Values</em>}</li>
 *   <li>{@link ccsds.fr.type.model.frtypes.PermittedAlphabetConstraint#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getPermittedAlphabetConstraint()
 * @model
 * @generated
 */
public interface PermittedAlphabetConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getPermittedAlphabetConstraint_Values()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getValues();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"RANGE"</code>.
	 * The literals are from the enumeration {@link ccsds.fr.type.model.frtypes.ConstraintType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ccsds.fr.type.model.frtypes.ConstraintType
	 * @see #setType(ConstraintType)
	 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getPermittedAlphabetConstraint_Type()
	 * @model default="RANGE"
	 * @generated
	 */
	ConstraintType getType();

	/**
	 * Sets the value of the '{@link ccsds.fr.type.model.frtypes.PermittedAlphabetConstraint#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ccsds.fr.type.model.frtypes.ConstraintType
	 * @see #getType()
	 * @generated
	 */
	void setType(ConstraintType value);

} // PermittedAlphabetConstraint
