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
 * A representation of the model object '<em><b>Size Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsds.fr.type.model.frtypes.SizeConstraint#getMin <em>Min</em>}</li>
 *   <li>{@link ccsds.fr.type.model.frtypes.SizeConstraint#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getSizeConstraint()
 * @model
 * @generated
 */
public interface SizeConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(long)
	 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getSizeConstraint_Min()
	 * @model required="true"
	 * @generated
	 */
	long getMin();

	/**
	 * Sets the value of the '{@link ccsds.fr.type.model.frtypes.SizeConstraint#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(long value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(long)
	 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getSizeConstraint_Max()
	 * @model required="true"
	 * @generated
	 */
	long getMax();

	/**
	 * Sets the value of the '{@link ccsds.fr.type.model.frtypes.SizeConstraint#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(long value);

} // SizeConstraint
