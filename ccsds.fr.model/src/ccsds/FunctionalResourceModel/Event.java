/**
 */
package ccsds.FunctionalResourceModel;

import org.eclipse.emf.common.util.EList;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ccsds.FunctionalResourceModel.Event#getExternalOid <em>External Oid</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.Event#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends FrModelElement {

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link ccsds.FunctionalResourceModel.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getEvent_Value()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getValue();

	/**
	 * Returns the value of the '<em><b>External Oid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Oid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Oid</em>' containment reference.
	 * @see #setExternalOid(Oid)
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getEvent_ExternalOid()
	 * @model containment="true"
	 * @generated
	 */
	Oid getExternalOid();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.Event#getExternalOid <em>External Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Oid</em>' containment reference.
	 * @see #getExternalOid()
	 * @generated
	 */
	void setExternalOid(Oid value);
} // Event
