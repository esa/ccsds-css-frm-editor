/**
 */
package ccsds.fr.type.model.frtypes.impl;

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

import ccsds.fr.type.model.frtypes.ExportWriter;
import ccsds.fr.type.model.frtypes.FrtypesPackage;
import ccsds.fr.type.model.frtypes.SetOf;
import ccsds.fr.type.model.frtypes.SizeConstraint;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SetOfImpl extends StructuredSizeConstrainedTypeImpl implements SetOf {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FrtypesPackage.Literals.SET_OF;
	}

	/**
	 * Write the SET OF
	 * @generated NOT
	 */
	@Override
	public void writeAsn1(int indentLevel, StringBuffer output) {
		output.append(ExportWriter.SET + ExportWriter.BLANK);

		for (SizeConstraint c : getSizeConstraint()) {
			c.writeAsn1(indentLevel, output);
		}

		output.append(ExportWriter.BLANK + ExportWriter.OF + ExportWriter.INDENT);

		super.writeAsn1(indentLevel, output);
	}

} //SetOfImpl
