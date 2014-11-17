/**
 */
package ccsds.FunctionalResourceModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Resource Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ccsds.FunctionalResourceModel.FunctionalResourceModel#getRootOid <em>Root Oid</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.FunctionalResourceModel#getFunctionalResource <em>Functional Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getFunctionalResourceModel()
 * @model
 * @generated
 */
public interface FunctionalResourceModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Root Oid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Oid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Oid</em>' containment reference.
	 * @see #setRootOid(Oid)
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getFunctionalResourceModel_RootOid()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Oid getRootOid();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.FunctionalResourceModel#getRootOid <em>Root Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Oid</em>' containment reference.
	 * @see #getRootOid()
	 * @generated
	 */
	void setRootOid(Oid value);

	/**
	 * Returns the value of the '<em><b>Functional Resource</b></em>' containment reference list.
	 * The list contents are of type {@link ccsds.FunctionalResourceModel.FunctionalResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functional Resource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Resource</em>' containment reference list.
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getFunctionalResourceModel_FunctionalResource()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionalResource> getFunctionalResource();

} // FunctionalResourceModel
