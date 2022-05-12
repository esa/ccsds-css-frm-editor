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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Resource Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsds.FunctionalResourceModel.FunctionalResourceSet#getName <em>Name</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.FunctionalResourceSet#getFunctionalResource <em>Functional Resource</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.FunctionalResourceSet#getOidOffset <em>Oid Offset</em>}</li>
 * </ul>
 *
 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getFunctionalResourceSet()
 * @model
 * @generated
 */
public interface FunctionalResourceSet extends EObject {
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
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getFunctionalResourceSet_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.FunctionalResourceSet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getFunctionalResourceSet_FunctionalResource()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionalResource> getFunctionalResource();

	/**
	 * Returns the value of the '<em><b>Oid Offset</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oid Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oid Offset</em>' attribute.
	 * @see #setOidOffset(int)
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getFunctionalResourceSet_OidOffset()
	 * @model default="0"
	 * @generated
	 */
	int getOidOffset();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.FunctionalResourceSet#getOidOffset <em>Oid Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oid Offset</em>' attribute.
	 * @see #getOidOffset()
	 * @generated
	 */
	void setOidOffset(int value);

} // FunctionalResourceSet
