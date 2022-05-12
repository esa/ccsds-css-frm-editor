/**
 */
package ccsds.fr.type.model.frtypes;

/*-
 * #%L
 * CCSDS Functional Resource Type Model
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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Reference Local</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsds.fr.type.model.frtypes.TypeReferenceLocal#getTypeDefinition <em>Type Definition</em>}</li>
 * </ul>
 *
 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getTypeReferenceLocal()
 * @model
 * @generated
 */
public interface TypeReferenceLocal extends Type {
	/**
	 * Returns the value of the '<em><b>Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Definition</em>' reference.
	 * @see #setTypeDefinition(TypeDefinition)
	 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getTypeReferenceLocal_TypeDefinition()
	 * @model keys="name" required="true"
	 * @generated
	 */
	TypeDefinition getTypeDefinition();

	/**
	 * Sets the value of the '{@link ccsds.fr.type.model.frtypes.TypeReferenceLocal#getTypeDefinition <em>Type Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Definition</em>' reference.
	 * @see #getTypeDefinition()
	 * @generated
	 */
	void setTypeDefinition(TypeDefinition value);

} // TypeReferenceLocal
