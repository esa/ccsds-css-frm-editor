/**
 */
package ccsds.FunctionalResourceModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ccsds.FunctionalResourceModel.Parameter#isConfigured <em>Configured</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.Parameter#getGuardCondition <em>Guard Condition</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.Parameter#getExternalOid <em>External Oid</em>}</li>
 * </ul>
 * </p>
 *
 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getParameter()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='GuardConditionInv'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot GuardConditionInv='self.configured = true implies self.guardCondition->notEmpty()'"
 * @generated
 */
public interface Parameter extends TypedElement {
	/**
	 * Returns the value of the '<em><b>Configured</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configured</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configured</em>' attribute.
	 * @see #setConfigured(boolean)
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getParameter_Configured()
	 * @model default="false"
	 * @generated
	 */
	boolean isConfigured();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.Parameter#isConfigured <em>Configured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configured</em>' attribute.
	 * @see #isConfigured()
	 * @generated
	 */
	void setConfigured(boolean value);

	/**
	 * Returns the value of the '<em><b>Guard Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Condition</em>' attribute.
	 * @see #setGuardCondition(String)
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getParameter_GuardCondition()
	 * @model
	 * @generated
	 */
	String getGuardCondition();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.Parameter#getGuardCondition <em>Guard Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Condition</em>' attribute.
	 * @see #getGuardCondition()
	 * @generated
	 */
	void setGuardCondition(String value);

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
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getParameter_ExternalOid()
	 * @model containment="true"
	 * @generated
	 */
	Oid getExternalOid();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.Parameter#getExternalOid <em>External Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Oid</em>' containment reference.
	 * @see #getExternalOid()
	 * @generated
	 */
	void setExternalOid(Oid value);

} // Parameter
