/**
 */
package ccsds.FunctionalResourceModel;

/*-
 * #%L
 * CCSDS Functional Resource Model
 * %%
 * Copyright (C) 2022 European Space Agency
 * %%
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * #L%
 */

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fr Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsds.FunctionalResourceModel.FrModelElement#getSemanticDefinition <em>Semantic Definition</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.FrModelElement#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.FrModelElement#getStringIdentifier <em>String Identifier</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.FrModelElement#getVersion <em>Version</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.FrModelElement#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.FrModelElement#getAuthorizingEntity <em>Authorizing Entity</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.FrModelElement#getOidBit <em>Oid Bit</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.FrModelElement#getOid <em>Oid</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.FrModelElement#isDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.FrModelElement#getAnnotation <em>Annotation</em>}</li>
 * </ul>
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
	 * Returns the value of the '<em><b>String Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Identifier</em>' attribute.
	 * @see #setStringIdentifier(String)
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getFrModelElement_StringIdentifier()
	 * @model
	 * @generated
	 */
	String getStringIdentifier();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.FrModelElement#getStringIdentifier <em>String Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Identifier</em>' attribute.
	 * @see #getStringIdentifier()
	 * @generated
	 */
	void setStringIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier</em>' attribute.
	 * @see #setClassifier(String)
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getFrModelElement_Classifier()
	 * @model required="true"
	 * @generated
	 */
	String getClassifier();

	/**
	 * Get a classifier not 
	 * 
	 * @generated NOT
	 */
	String getClassifierWellFormed();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.FrModelElement#getClassifier <em>Classifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier</em>' attribute.
	 * @see #getClassifier()
	 * @generated
	 */
	void setClassifier(String value);
	
	

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
	 * @model containment="true"
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
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link ccsds.FunctionalResourceModel.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getFrModelElement_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getAnnotation();

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
