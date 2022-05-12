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

import ccsds.fr.type.model.frtypes.Module;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Resource Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsds.FunctionalResourceModel.FunctionalResourceModel#getRootOid <em>Root Oid</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.FunctionalResourceModel#getAsnTypeModule <em>Asn Type Module</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.FunctionalResourceModel#getFunctionalResourceStratum <em>Functional Resource Stratum</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.FunctionalResourceModel#getFunctionalResourceSet <em>Functional Resource Set</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.FunctionalResourceModel#getFunctionalResource <em>Functional Resource</em>}</li>
 * </ul>
 *
 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getFunctionalResourceModel()
 * @model
 * @generated
 */
public interface FunctionalResourceModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Root Oid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Oid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Oid</em>' containment reference.
	 * @see #setRootOid(Oid)
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getFunctionalResourceModel_RootOid()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Oid getRootOid();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.FunctionalResourceModel#getRootOid <em>Root Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Oid</em>' containment reference.
	 * @see #getRootOid()
	 * @generated
	 */
	void setRootOid(Oid value);

	/**
	 * Returns the value of the '<em><b>Asn Type Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asn Type Module</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asn Type Module</em>' containment reference.
	 * @see #setAsnTypeModule(Module)
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getFunctionalResourceModel_AsnTypeModule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Module getAsnTypeModule();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.FunctionalResourceModel#getAsnTypeModule <em>Asn Type Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asn Type Module</em>' containment reference.
	 * @see #getAsnTypeModule()
	 * @generated
	 */
	void setAsnTypeModule(Module value);

	/**
	 * Returns the value of the '<em><b>Functional Resource Stratum</b></em>' containment reference list.
	 * The list contents are of type {@link ccsds.FunctionalResourceModel.FunctionalResourceStratum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functional Resource Stratum</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Resource Stratum</em>' containment reference list.
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getFunctionalResourceModel_FunctionalResourceStratum()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionalResourceStratum> getFunctionalResourceStratum();

	/**
	 * Returns the value of the '<em><b>Functional Resource Set</b></em>' containment reference list.
	 * The list contents are of type {@link ccsds.FunctionalResourceModel.FunctionalResourceSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functional Resource Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Resource Set</em>' containment reference list.
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getFunctionalResourceModel_FunctionalResourceSet()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionalResourceSet> getFunctionalResourceSet();

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
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getFunctionalResourceModel_FunctionalResource()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionalResource> getFunctionalResource();

} // FunctionalResourceModel
