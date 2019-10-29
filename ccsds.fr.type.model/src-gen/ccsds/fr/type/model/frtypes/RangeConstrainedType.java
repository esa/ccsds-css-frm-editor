/**
 */
package ccsds.fr.type.model.frtypes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Constrained Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsds.fr.type.model.frtypes.RangeConstrainedType#getRangeConstraint <em>Range Constraint</em>}</li>
 * </ul>
 *
 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getRangeConstrainedType()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface RangeConstrainedType extends ExportWriter {
	/**
	 * Returns the value of the '<em><b>Range Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link ccsds.fr.type.model.frtypes.ValueRangeConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range Constraint</em>' containment reference list.
	 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getRangeConstrainedType_RangeConstraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueRangeConstraint> getRangeConstraint();

} // RangeConstrainedType
