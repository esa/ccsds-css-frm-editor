/**
 */
package ccsds.FunctionalResourceModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage
 * @generated
 */
public interface FunctionalResourceModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FunctionalResourceModelFactory eINSTANCE = ccsds.FunctionalResourceModel.impl.FunctionalResourceModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Functional Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Resource Model</em>'.
	 * @generated
	 */
	FunctionalResourceModel createFunctionalResourceModel();

	/**
	 * Returns a new object of class '<em>Fr Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fr Model Element</em>'.
	 * @generated
	 */
	FrModelElement createFrModelElement();

	/**
	 * Returns a new object of class '<em>Oid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Oid</em>'.
	 * @generated
	 */
	Oid createOid();

	/**
	 * Returns a new object of class '<em>Functional Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Resource</em>'.
	 * @generated
	 */
	FunctionalResource createFunctionalResource();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Directive</em>'.
	 * @generated
	 */
	Directive createDirective();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value</em>'.
	 * @generated
	 */
	Value createValue();

	/**
	 * Returns a new object of class '<em>Qualifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qualifier</em>'.
	 * @generated
	 */
	Qualifier createQualifier();

	/**
	 * Returns a new object of class '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Typed Element</em>'.
	 * @generated
	 */
	TypedElement createTypedElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FunctionalResourceModelPackage getFunctionalResourceModelPackage();

} //FunctionalResourceModelFactory
