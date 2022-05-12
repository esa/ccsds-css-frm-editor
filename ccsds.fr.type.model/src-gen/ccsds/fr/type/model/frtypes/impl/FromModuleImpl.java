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
import ccsds.fr.type.model.frtypes.FromModule;
import ccsds.fr.type.model.frtypes.FrtypesPackage;

import ccsds.fr.type.model.frtypes.ObjectIdentifier;
import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>From Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsds.fr.type.model.frtypes.impl.FromModuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link ccsds.fr.type.model.frtypes.impl.FromModuleImpl#getImportedTypes <em>Imported Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FromModuleImpl extends MinimalEObjectImpl.Container implements FromModule {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImportedTypes() <em>Imported Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> importedTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FromModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FrtypesPackage.Literals.FROM_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrtypesPackage.FROM_MODULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getImportedTypes() {
		if (importedTypes == null) {
			importedTypes = new EDataTypeUniqueEList<String>(String.class, this,
					FrtypesPackage.FROM_MODULE__IMPORTED_TYPES);
		}
		return importedTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void writeAsn1(int indentLevel, StringBuffer output) {
		if (getImportedTypes().size() == 0) {
			return;
		}

		output.append(System.lineSeparator() + ExportWriter.IMPORTS + ExportWriter.INDENT);

		int idx = 0;
		for (String importedType : getImportedTypes()) {
			output.append(importedType);
			idx++;
			if (idx < getImportedTypes().size()) {
				output.append(System.lineSeparator() + ExportWriter.SEP + ExportWriter.INDENT);
			}
		}

		output.append(
				System.lineSeparator() + ExportWriter.INDENT + ExportWriter.FROM + ExportWriter.BLANK + getName());
		output.append(System.lineSeparator() + ExportWriter.SEMI_COLON + System.lineSeparator());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void writeXsd(int indentLevel, StringBuffer output, ObjectIdentifier oid, Map<String, String> properties) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FrtypesPackage.FROM_MODULE__NAME:
			return getName();
		case FrtypesPackage.FROM_MODULE__IMPORTED_TYPES:
			return getImportedTypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FrtypesPackage.FROM_MODULE__NAME:
			setName((String) newValue);
			return;
		case FrtypesPackage.FROM_MODULE__IMPORTED_TYPES:
			getImportedTypes().clear();
			getImportedTypes().addAll((Collection<? extends String>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case FrtypesPackage.FROM_MODULE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case FrtypesPackage.FROM_MODULE__IMPORTED_TYPES:
			getImportedTypes().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case FrtypesPackage.FROM_MODULE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case FrtypesPackage.FROM_MODULE__IMPORTED_TYPES:
			return importedTypes != null && !importedTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case FrtypesPackage.FROM_MODULE___WRITE_ASN1__INT_STRINGBUFFER:
			writeAsn1((Integer) arguments.get(0), (StringBuffer) arguments.get(1));
			return null;
		case FrtypesPackage.FROM_MODULE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER_MAP:
			writeXsd((Integer) arguments.get(0), (StringBuffer) arguments.get(1), (ObjectIdentifier) arguments.get(2),
					(Map<String, String>) arguments.get(3));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", importedTypes: ");
		result.append(importedTypes);
		result.append(')');
		return result.toString();
	}

} //FromModuleImpl
