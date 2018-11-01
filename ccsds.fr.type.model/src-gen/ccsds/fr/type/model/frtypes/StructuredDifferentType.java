/**
 */
package ccsds.fr.type.model.frtypes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Different Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsds.fr.type.model.frtypes.StructuredDifferentType#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getStructuredDifferentType()
 * @model abstract="true"
 * @generated
 */
public interface StructuredDifferentType extends StructuredType {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link ccsds.fr.type.model.frtypes.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getStructuredDifferentType_Elements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Type> getElements();

} // StructuredDifferentType
