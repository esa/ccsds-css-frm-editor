/**
 */
package ccsds.FunctionalResourceModel;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fr Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ccsds.FunctionalResourceModel.FrModelElement#getSemanticDefinition <em>Semantic Definition</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.FrModelElement#getName <em>Name</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.FrModelElement#getShortName <em>Short Name</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.FrModelElement#getVersion <em>Version</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.FrModelElement#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.FrModelElement#getAuthorizingEntity <em>Authorizing Entity</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.FrModelElement#getOidBit <em>Oid Bit</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.FrModelElement#getOid <em>Oid</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.FrModelElement#isDeprecated <em>Deprecated</em>}</li>
 * </ul>
 * </p>
 *
 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getFrModelElement()
 * @model
 * @generated
 */
public interface FrModelElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Semantic Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantic Definition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Definition</em>' attribute.
	 * @see #setSemanticDefinition(String)
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getFrModelElement_SemanticDefinition()
	 * @model required="true"
	 * @generated
	 */
	String getSemanticDefinition();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.FrModelElement#getSemanticDefinition <em>Semantic Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic Definition</em>' attribute.
	 * @see #getSemanticDefinition()
	 * @generated
	 */
	void setSemanticDefinition(String value);

	/**
	 * Returns the value of the '<em><b>Oid Bit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oid Bit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oid Bit</em>' attribute.
	 * @see #setOidBit(int)
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getFrModelElement_OidBit()
	 * @model required="true"
	 * @generated
	 */
	int getOidBit();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.FrModelElement#getOidBit <em>Oid Bit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oid Bit</em>' attribute.
	 * @see #getOidBit()
	 * @generated
	 */
	void setOidBit(int value);

	/**
	 * Returns the value of the '<em><b>Oid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oid</em>' containment reference.
	 * @see #setOid(Oid)
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getFrModelElement_Oid()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Oid getOid();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.FrModelElement#getOid <em>Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oid</em>' containment reference.
	 * @see #getOid()
	 * @generated
	 */
	void setOid(Oid value);

	/**
	 * Returns the value of the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deprecated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deprecated</em>' attribute.
	 * @see #setDeprecated(boolean)
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getFrModelElement_Deprecated()
	 * @model required="true"
	 * @generated
	 */
	boolean isDeprecated();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.FrModelElement#isDeprecated <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deprecated</em>' attribute.
	 * @see #isDeprecated()
	 * @generated
	 */
	void setDeprecated(boolean value);

	/**
	 * Returns the value of the '<em><b>Authorizing Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorizing Entity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorizing Entity</em>' attribute.
	 * @see #setAuthorizingEntity(String)
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getFrModelElement_AuthorizingEntity()
	 * @model required="true"
	 * @generated
	 */
	String getAuthorizingEntity();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.FrModelElement#getAuthorizingEntity <em>Authorizing Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorizing Entity</em>' attribute.
	 * @see #getAuthorizingEntity()
	 * @generated
	 */
	void setAuthorizingEntity(String value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(Date)
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getFrModelElement_CreationDate()
	 * @model
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.FrModelElement#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

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
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getFrModelElement_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.FrModelElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Name</em>' attribute.
	 * @see #setShortName(String)
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getFrModelElement_ShortName()
	 * @model
	 * @generated
	 */
	String getShortName();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.FrModelElement#getShortName <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Name</em>' attribute.
	 * @see #getShortName()
	 * @generated
	 */
	void setShortName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version will be, if present, appended to the OID of this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(int)
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getFrModelElement_Version()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getVersion();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.FrModelElement#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(int value);

} // FrModelElement
