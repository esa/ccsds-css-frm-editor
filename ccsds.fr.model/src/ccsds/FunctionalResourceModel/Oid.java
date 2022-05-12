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
 * A representation of the model object '<em><b>Oid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsds.FunctionalResourceModel.Oid#getOidBit <em>Oid Bit</em>}</li>
 * </ul>
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
