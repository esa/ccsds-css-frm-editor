/**
 */
package ccsds.fr.type.model.frtypes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsds.fr.type.model.frtypes.Module#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link ccsds.fr.type.model.frtypes.Module#getOid <em>Oid</em>}</li>
 *   <li>{@link ccsds.fr.type.model.frtypes.Module#getImports <em>Imports</em>}</li>
 *   <li>{@link ccsds.fr.type.model.frtypes.Module#getExports <em>Exports</em>}</li>
 *   <li>{@link ccsds.fr.type.model.frtypes.Module#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends Asn1Writer {
	/**
	 * Returns the value of the '<em><b>Type Definition</b></em>' containment reference list.
	 * The list contents are of type {@link ccsds.fr.type.model.frtypes.TypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Definition</em>' containment reference list.
	 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getModule_TypeDefinition()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeDefinition> getTypeDefinition();

	/**
	 * Returns the value of the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oid</em>' attribute.
	 * @see #setOid(String)
	 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getModule_Oid()
	 * @model
	 * @generated
	 */
	String getOid();

	/**
	 * Sets the value of the '{@link ccsds.fr.type.model.frtypes.Module#getOid <em>Oid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oid</em>' attribute.
	 * @see #getOid()
	 * @generated
	 */
	void setOid(String value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' attribute list.
	 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getModule_Imports()
	 * @model
	 * @generated
	 */
	EList<String> getImports();

	/**
	 * Returns the value of the '<em><b>Exports</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exports</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exports</em>' attribute list.
	 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getModule_Exports()
	 * @model
	 * @generated
	 */
	EList<String> getExports();

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
	 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getModule_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ccsds.fr.type.model.frtypes.Module#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Module
