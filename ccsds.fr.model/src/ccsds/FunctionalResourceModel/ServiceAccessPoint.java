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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Access Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsds.FunctionalResourceModel.ServiceAccessPoint#getName <em>Name</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.ServiceAccessPoint#getMinAccessor <em>Min Accessor</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.ServiceAccessPoint#getMaxAccessor <em>Max Accessor</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.ServiceAccessPoint#getMinAccessed <em>Min Accessed</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.ServiceAccessPoint#getMaxAccessed <em>Max Accessed</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.ServiceAccessPoint#getAccessedFunctionalResource <em>Accessed Functional Resource</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.ServiceAccessPoint#getAccessingFunctionalResource <em>Accessing Functional Resource</em>}</li>
 * </ul>
 *
 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getServiceAccessPoint()
 * @model
 * @generated
 */
public interface ServiceAccessPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"newSAP"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getServiceAccessPoint_Name()
	 * @model default="newSAP"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.ServiceAccessPoint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Min Accessor</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Accessor</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Accessor</em>' attribute.
	 * @see #setMinAccessor(int)
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getServiceAccessPoint_MinAccessor()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getMinAccessor();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.ServiceAccessPoint#getMinAccessor <em>Min Accessor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Accessor</em>' attribute.
	 * @see #getMinAccessor()
	 * @generated
	 */
	void setMinAccessor(int value);

	/**
	 * Returns the value of the '<em><b>Max Accessor</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Accessor</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Accessor</em>' attribute.
	 * @see #setMaxAccessor(int)
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getServiceAccessPoint_MaxAccessor()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getMaxAccessor();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.ServiceAccessPoint#getMaxAccessor <em>Max Accessor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Accessor</em>' attribute.
	 * @see #getMaxAccessor()
	 * @generated
	 */
	void setMaxAccessor(int value);

	/**
	 * Returns the value of the '<em><b>Min Accessed</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Accessed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Accessed</em>' attribute.
	 * @see #setMinAccessed(int)
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getServiceAccessPoint_MinAccessed()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getMinAccessed();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.ServiceAccessPoint#getMinAccessed <em>Min Accessed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Accessed</em>' attribute.
	 * @see #getMinAccessed()
	 * @generated
	 */
	void setMinAccessed(int value);

	/**
	 * Returns the value of the '<em><b>Max Accessed</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Accessed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Accessed</em>' attribute.
	 * @see #setMaxAccessed(int)
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getServiceAccessPoint_MaxAccessed()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getMaxAccessed();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.ServiceAccessPoint#getMaxAccessed <em>Max Accessed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Accessed</em>' attribute.
	 * @see #getMaxAccessed()
	 * @generated
	 */
	void setMaxAccessed(int value);

	/**
	 * Returns the value of the '<em><b>Accessing Functional Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accessing Functional Resource</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessing Functional Resource</em>' reference.
	 * @see #setAccessingFunctionalResource(FunctionalResource)
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getServiceAccessPoint_AccessingFunctionalResource()
	 * @model required="true"
	 * @generated
	 */
	FunctionalResource getAccessingFunctionalResource();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.ServiceAccessPoint#getAccessingFunctionalResource <em>Accessing Functional Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accessing Functional Resource</em>' reference.
	 * @see #getAccessingFunctionalResource()
	 * @generated
	 */
	void setAccessingFunctionalResource(FunctionalResource value);

	/**
	 * Returns the value of the '<em><b>Accessed Functional Resource</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ccsds.FunctionalResourceModel.FunctionalResource#getServiceAccesspoint <em>Service Accesspoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accessed Functional Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessed Functional Resource</em>' container reference.
	 * @see #setAccessedFunctionalResource(FunctionalResource)
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getServiceAccessPoint_AccessedFunctionalResource()
	 * @see ccsds.FunctionalResourceModel.FunctionalResource#getServiceAccesspoint
	 * @model opposite="serviceAccesspoint" required="true" transient="false"
	 * @generated
	 */
	FunctionalResource getAccessedFunctionalResource();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.ServiceAccessPoint#getAccessedFunctionalResource <em>Accessed Functional Resource</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accessed Functional Resource</em>' container reference.
	 * @see #getAccessedFunctionalResource()
	 * @generated
	 */
	void setAccessedFunctionalResource(FunctionalResource value);

} // ServiceAccessPoint
