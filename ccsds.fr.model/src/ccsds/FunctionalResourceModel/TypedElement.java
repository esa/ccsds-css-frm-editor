/**
 */
package ccsds.FunctionalResourceModel;

import ccsds.fr.type.model.frtypes.TypeDefinition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsds.FunctionalResourceModel.TypedElement#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.TypedElement#getEngineeringUnit <em>Engineering Unit</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.TypedElement#getExternalTypeOid <em>External Type Oid</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.TypedElement#getTypeOid <em>Type Oid</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.TypedElement#getTypeDef <em>Type Def</em>}</li>
 * </ul>
 *
 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getTypedElement()
 * @model
 * @generated
 */
public interface TypedElement extends FrModelElement {
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
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getTypedElement_TypeDefinition()
	 * @model required="true"
	 * @generated
	 */
	String getTypeDefinition();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.TypedElement#getTypeDefinition <em>Type Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Definition</em>' attribute.
	 * @see #getTypeDefinition()
	 * @generated
	 */
	void setTypeDefinition(String value);

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
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getTypedElement_EngineeringUnit()
	 * @model
	 * @generated
	 */
	String getEngineeringUnit();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.TypedElement#getEngineeringUnit <em>Engineering Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engineering Unit</em>' attribute.
	 * @see #getEngineeringUnit()
	 * @generated
	 */
	void setEngineeringUnit(String value);

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
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getTypedElement_ExternalTypeOid()
	 * @model containment="true"
	 * @generated
	 */
	Oid getExternalTypeOid();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.TypedElement#getExternalTypeOid <em>External Type Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Type Oid</em>' containment reference.
	 * @see #getExternalTypeOid()
	 * @generated
	 */
	void setExternalTypeOid(Oid value);

	/**
	 * Returns the value of the '<em><b>Type Oid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CSTS WG decided to have a dedicated type OID to denote the OID of the ASN.1 type definition used for encoding.
	 * 
	 * The type OID is constructed by using the OID of the P/E/D and add a digit. This is necessary for Event/Vaues and Directive/Qualifiers which have a 1 - 0..n relationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Oid</em>' containment reference.
	 * @see #setTypeOid(Oid)
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getTypedElement_TypeOid()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Oid getTypeOid();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.TypedElement#getTypeOid <em>Type Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Oid</em>' containment reference.
	 * @see #getTypeOid()
	 * @generated
	 */
	void setTypeOid(Oid value);

	/**
	 * Returns the value of the '<em><b>Type Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Def</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Def</em>' containment reference.
	 * @see #setTypeDef(TypeDefinition)
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getTypedElement_TypeDef()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeDefinition getTypeDef();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.TypedElement#getTypeDef <em>Type Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Def</em>' containment reference.
	 * @see #getTypeDef()
	 * @generated
	 */
	void setTypeDef(TypeDefinition value);

} // TypedElement
