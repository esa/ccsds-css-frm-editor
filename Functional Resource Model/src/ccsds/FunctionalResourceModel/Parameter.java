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
 *   <li>{@link ccsds.FunctionalResourceModel.Parameter#getEngineeringUnit <em>Engineering Unit</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.Parameter#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.Parameter#getExternalTypeOid <em>External Type Oid</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.Parameter#isMonitored <em>Monitored</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.Parameter#isControlled <em>Controlled</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.Parameter#isConfiguration <em>Configuration</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.Parameter#getGuardCondition <em>Guard Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends FrModelElement {
	/**
	 * Returns the value of the '<em><b>Engineering Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Engineering Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engineering Unit</em>' attribute.
	 * @see #setEngineeringUnit(String)
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getParameter_EngineeringUnit()
	 * @model
	 * @generated
	 */
	String getEngineeringUnit();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.Parameter#getEngineeringUnit <em>Engineering Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engineering Unit</em>' attribute.
	 * @see #getEngineeringUnit()
	 * @generated
	 */
	void setEngineeringUnit(String value);

	/**
	 * Returns the value of the '<em><b>Type Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Definition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Definition</em>' attribute.
	 * @see #setTypeDefinition(String)
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getParameter_TypeDefinition()
	 * @model required="true"
	 * @generated
	 */
	String getTypeDefinition();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.Parameter#getTypeDefinition <em>Type Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Definition</em>' attribute.
	 * @see #getTypeDefinition()
	 * @generated
	 */
	void setTypeDefinition(String value);

	/**
	 * Returns the value of the '<em><b>External Type Oid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Type Oid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Type Oid</em>' containment reference.
	 * @see #setExternalTypeOid(Oid)
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getParameter_ExternalTypeOid()
	 * @model containment="true"
	 * @generated
	 */
	Oid getExternalTypeOid();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.Parameter#getExternalTypeOid <em>External Type Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Type Oid</em>' containment reference.
	 * @see #getExternalTypeOid()
	 * @generated
	 */
	void setExternalTypeOid(Oid value);

	/**
	 * Returns the value of the '<em><b>Monitored</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitored</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitored</em>' attribute.
	 * @see #setMonitored(boolean)
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getParameter_Monitored()
	 * @model default="true"
	 * @generated
	 */
	boolean isMonitored();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.Parameter#isMonitored <em>Monitored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitored</em>' attribute.
	 * @see #isMonitored()
	 * @generated
	 */
	void setMonitored(boolean value);

	/**
	 * Returns the value of the '<em><b>Controlled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controlled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlled</em>' attribute.
	 * @see #setControlled(boolean)
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getParameter_Controlled()
	 * @model default="false"
	 * @generated
	 */
	boolean isControlled();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.Parameter#isControlled <em>Controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controlled</em>' attribute.
	 * @see #isControlled()
	 * @generated
	 */
	void setControlled(boolean value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' attribute.
	 * @see #setConfiguration(boolean)
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getParameter_Configuration()
	 * @model default="false"
	 * @generated
	 */
	boolean isConfiguration();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.Parameter#isConfiguration <em>Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' attribute.
	 * @see #isConfiguration()
	 * @generated
	 */
	void setConfiguration(boolean value);

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

} // Parameter
