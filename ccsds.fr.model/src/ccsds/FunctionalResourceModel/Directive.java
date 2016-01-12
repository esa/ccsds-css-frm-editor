/**
 */
package ccsds.FunctionalResourceModel;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ccsds.FunctionalResourceModel.Directive#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.Directive#getGuardCondition <em>Guard Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getDirective()
 * @model
 * @generated
 */
public interface Directive extends FrModelElement {

	/**
	 * Returns the value of the '<em><b>Guard Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Condition</em>' attribute.
	 * @see #setGuardCondition(String)
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getDirective_GuardCondition()
	 * @model required="true"
	 * @generated
	 */
	String getGuardCondition();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.Directive#getGuardCondition <em>Guard Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Condition</em>' attribute.
	 * @see #getGuardCondition()
	 * @generated
	 */
	void setGuardCondition(String value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link ccsds.FunctionalResourceModel.Qualifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference list.
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getDirective_Qualifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Qualifier> getQualifier();
} // Directive
