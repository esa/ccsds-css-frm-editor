/**
 */
package ccsds.FunctionalResourceModel;

import ccsds.fr.type.model.frtypes.TypeDefinition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsds.FunctionalResourceModel.DataUnit#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.DataUnit#getSubDataUnit <em>Sub Data Unit</em>}</li>
 * </ul>
 *
 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getDataUnit()
 * @model
 * @generated
 */
public interface DataUnit extends FrModelElement {
	/**
	 * Returns the value of the '<em><b>Type Definition</b></em>' containment reference list.
	 * The list contents are of type {@link ccsds.fr.type.model.frtypes.TypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Definition</em>' containment reference list.
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getDataUnit_TypeDefinition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TypeDefinition> getTypeDefinition();

	/**
	 * Returns the value of the '<em><b>Sub Data Unit</b></em>' containment reference list.
	 * The list contents are of type {@link ccsds.FunctionalResourceModel.DataUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Data Unit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Data Unit</em>' containment reference list.
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getDataUnit_SubDataUnit()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataUnit> getSubDataUnit();

} // DataUnit
