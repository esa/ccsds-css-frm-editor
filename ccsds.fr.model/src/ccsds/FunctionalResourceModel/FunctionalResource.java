/**
 */
package ccsds.FunctionalResourceModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsds.FunctionalResourceModel.FunctionalResource#getParameter <em>Parameter</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.FunctionalResource#getEvent <em>Event</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.FunctionalResource#getDirectives <em>Directives</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.FunctionalResource#getUses <em>Uses</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.FunctionalResource#getServiceAccesspoint <em>Service Accesspoint</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.FunctionalResource#getProvidedAncillaryInterface <em>Provided Ancillary Interface</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.FunctionalResource#getDataUnit <em>Data Unit</em>}</li>
 * </ul>
 *
 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getFunctionalResource()
 * @model
 * @generated
 */
public interface FunctionalResource extends FrModelElement {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference list.
	 * The list contents are of type {@link ccsds.FunctionalResourceModel.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference list.
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getFunctionalResource_Event()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvent();

	/**
	 * Returns the value of the '<em><b>Directives</b></em>' containment reference list.
	 * The list contents are of type {@link ccsds.FunctionalResourceModel.Directive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directives</em>' containment reference list.
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getFunctionalResource_Directives()
	 * @model containment="true"
	 * @generated
	 */
	EList<Directive> getDirectives();

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference list.
	 * The list contents are of type {@link ccsds.FunctionalResourceModel.FunctionalResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' reference list.
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getFunctionalResource_Uses()
	 * @model
	 * @generated
	 */
	EList<FunctionalResource> getUses();

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link ccsds.FunctionalResourceModel.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getFunctionalResource_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Service Accesspoint</b></em>' containment reference list.
	 * The list contents are of type {@link ccsds.FunctionalResourceModel.ServiceAccessPoint}.
	 * It is bidirectional and its opposite is '{@link ccsds.FunctionalResourceModel.ServiceAccessPoint#getAccessedFunctionalResource <em>Accessed Functional Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Accesspoint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Accesspoint</em>' containment reference list.
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getFunctionalResource_ServiceAccesspoint()
	 * @see ccsds.FunctionalResourceModel.ServiceAccessPoint#getAccessedFunctionalResource
	 * @model opposite="accessedFunctionalResource" containment="true"
	 * @generated
	 */
	EList<ServiceAccessPoint> getServiceAccesspoint();

	/**
	 * Returns the value of the '<em><b>Provided Ancillary Interface</b></em>' containment reference list.
	 * The list contents are of type {@link ccsds.FunctionalResourceModel.AncillaryInterface}.
	 * It is bidirectional and its opposite is '{@link ccsds.FunctionalResourceModel.AncillaryInterface#getProvidingFunctionalResource <em>Providing Functional Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Ancillary Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Ancillary Interface</em>' containment reference list.
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getFunctionalResource_ProvidedAncillaryInterface()
	 * @see ccsds.FunctionalResourceModel.AncillaryInterface#getProvidingFunctionalResource
	 * @model opposite="providingFunctionalResource" containment="true"
	 * @generated
	 */
	EList<AncillaryInterface> getProvidedAncillaryInterface();

	/**
	 * Returns the value of the '<em><b>Data Unit</b></em>' containment reference list.
	 * The list contents are of type {@link ccsds.FunctionalResourceModel.DataUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Unit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Unit</em>' containment reference list.
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#getFunctionalResource_DataUnit()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataUnit> getDataUnit();

} // FunctionalResource
