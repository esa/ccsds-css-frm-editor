/**
 */
package ccsds.FunctionalResourceModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ancillary Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsds.FunctionalResourceModel.AncillaryInterface#getName <em>Name</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.AncillaryInterface#getProvidingFunctionalResource <em>Providing Functional Resource</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.AncillaryInterface#getRequiringFunctionalResource <em>Requiring Functional Resource</em>}</li>
 * </ul>
 *
 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getAncillaryInterface()
 * @model
 * @generated
 */
public interface AncillaryInterface extends EObject {
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
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getAncillaryInterface_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.AncillaryInterface#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Providing Functional Resource</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ccsds.FunctionalResourceModel.FunctionalResource#getProvidedAncillaryInterface <em>Provided Ancillary Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Providing Functional Resource</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providing Functional Resource</em>' container reference.
	 * @see #setProvidingFunctionalResource(FunctionalResource)
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getAncillaryInterface_ProvidingFunctionalResource()
	 * @see ccsds.FunctionalResourceModel.FunctionalResource#getProvidedAncillaryInterface
	 * @model opposite="providedAncillaryInterface" required="true" transient="false"
	 * @generated
	 */
	FunctionalResource getProvidingFunctionalResource();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.AncillaryInterface#getProvidingFunctionalResource <em>Providing Functional Resource</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Providing Functional Resource</em>' container reference.
	 * @see #getProvidingFunctionalResource()
	 * @generated
	 */
	void setProvidingFunctionalResource(FunctionalResource value);

	/**
	 * Returns the value of the '<em><b>Requiring Functional Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requiring Functional Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requiring Functional Resource</em>' reference.
	 * @see #setRequiringFunctionalResource(FunctionalResource)
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getAncillaryInterface_RequiringFunctionalResource()
	 * @model required="true"
	 * @generated
	 */
	FunctionalResource getRequiringFunctionalResource();

	/**
	 * Sets the value of the '{@link ccsds.FunctionalResourceModel.AncillaryInterface#getRequiringFunctionalResource <em>Requiring Functional Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requiring Functional Resource</em>' reference.
	 * @see #getRequiringFunctionalResource()
	 * @generated
	 */
	void setRequiringFunctionalResource(FunctionalResource value);

} // AncillaryInterface
