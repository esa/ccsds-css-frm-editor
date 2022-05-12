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
import ccsds.fr.type.model.XmlAttribute;
import ccsds.fr.type.model.XmlHelper;
import ccsds.fr.type.model.frtypes.BitString;
import ccsds.fr.type.model.frtypes.FrtypesPackage;
import ccsds.fr.type.model.frtypes.ObjectIdentifier;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bit String</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BitStringImpl extends SimpleSizeConstrainedTypeImpl implements BitString {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BitStringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FrtypesPackage.Literals.BIT_STRING;
	}

	/**
	 * Write the BIT STRING
	 * @generated NOT
	 */
	@Override
	public void writeAsn1(int indentLevel, StringBuffer output) {
		output.append(ExportWriter.BIT_STRING);
		super.writeAsn1(indentLevel, output); // write constraints		

	}

	/**
	 * Write the  bit string to XSD
	 * @generated NOT
	 */
	@Override
	public void writeXsd(int indentLevel, StringBuffer output, ObjectIdentifier oid, Map<String, String> properties) {
		XmlHelper.writeComment(output, indentLevel, this);

		boolean hasConstraints = false;
		StringBuffer typeOutput = new StringBuffer();
		int typeIndent = indentLevel;

		XmlHelper.writeStartElement(typeOutput, typeIndent, XmlHelper.SIMPLE_TYPE, XmlHelper.getTypeNameAttr(this));

		if (getSizeConstraint() != null && getSizeConstraint().size() > 0) {
			hasConstraints = true;
			XmlHelper.writeSizeConstraint(typeOutput, typeIndent, XmlHelper.BIT_STRING, getSizeConstraint());
		} else {
			XmlHelper.writeElement(typeOutput, typeIndent, XmlHelper.RESTRICTION,
					new XmlAttribute(XmlHelper.BASE, XmlHelper.BIT_STRING));
		}
		XmlHelper.writeEndElement(typeOutput, typeIndent, XmlHelper.SIMPLE_TYPE);

		if (oid != null) {
			XmlAttribute typeAttr = XmlHelper.getTypeNameAttr(this);
			if (hasConstraints == false) {
				typeAttr = new XmlAttribute(XmlHelper.NAME, XmlHelper.BIT_STRING);
			}

			XmlHelper.writeSimpleNamedType(indentLevel, output, XmlHelper.getNamedTypeNameAttr(this), typeAttr, oid,
					this, properties);
		}

		XmlHelper.doBreakIndent(output, indentLevel);
		output.append(typeOutput);
	}
} //BitStringImpl
