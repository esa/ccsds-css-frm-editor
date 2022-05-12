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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsds.fr.type.model.frtypes.IntegerType#getNamedValues <em>Named Values</em>}</li>
 * </ul>
 *
 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getIntegerType()
 * @model
 * @generated
 */
public interface IntegerType extends SimpleRangeType {
	/**
	 * Returns the value of the '<em><b>Named Values</b></em>' containment reference list.
	 * The list contents are of type {@link ccsds.fr.type.model.frtypes.NamedValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Named Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Named Values</em>' containment reference list.
	 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getIntegerType_NamedValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<NamedValue> getNamedValues();

} // IntegerType
