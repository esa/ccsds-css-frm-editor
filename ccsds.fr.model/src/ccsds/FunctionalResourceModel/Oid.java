/**
 */
package ccsds.FunctionalResourceModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Oid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ccsds.FunctionalResourceModel.Oid#getOidBit <em>Oid Bit</em>}</li>
 * </ul>
 * </p>
 *
 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getOid()
 * @model
 * @generated
 */
public interface Oid extends EObject {
	/**
	 * Returns the value of the '<em><b>Oid Bit</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oid Bit</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oid Bit</em>' attribute list.
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getOid_OidBit()
	 * @model unique="false"
	 * @generated
	 */
	EList<Integer> getOidBit();

} // Oid
