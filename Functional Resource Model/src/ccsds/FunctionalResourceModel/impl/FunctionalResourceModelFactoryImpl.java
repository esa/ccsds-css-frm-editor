/**
 */
package ccsds.FunctionalResourceModel.impl;

import ccsds.FunctionalResourceModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionalResourceModelFactoryImpl extends EFactoryImpl implements FunctionalResourceModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FunctionalResourceModelFactory init() {
		try {
			FunctionalResourceModelFactory theFunctionalResourceModelFactory = (FunctionalResourceModelFactory)EPackage.Registry.INSTANCE.getEFactory(FunctionalResourceModelPackage.eNS_URI);
			if (theFunctionalResourceModelFactory != null) {
				return theFunctionalResourceModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FunctionalResourceModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalResourceModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_MODEL: return createFunctionalResourceModel();
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT: return createFrModelElement();
			case FunctionalResourceModelPackage.OID: return createOid();
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE: return createFunctionalResource();
			case FunctionalResourceModelPackage.EVENT: return createEvent();
			case FunctionalResourceModelPackage.DIRECTIVE: return createDirective();
			case FunctionalResourceModelPackage.PARAMETER: return createParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalResourceModel createFunctionalResourceModel() {
		FunctionalResourceModelImpl functionalResourceModel = new FunctionalResourceModelImpl();
		return functionalResourceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrModelElement createFrModelElement() {
		FrModelElementImpl frModelElement = new FrModelElementImpl();
		return frModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oid createOid() {
		OidImpl oid = new OidImpl();
		return oid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalResource createFunctionalResource() {
		FunctionalResourceImpl functionalResource = new FunctionalResourceImpl();
		return functionalResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Directive createDirective() {
		DirectiveImpl directive = new DirectiveImpl();
		return directive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalResourceModelPackage getFunctionalResourceModelPackage() {
		return (FunctionalResourceModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FunctionalResourceModelPackage getPackage() {
		return FunctionalResourceModelPackage.eINSTANCE;
	}

} //FunctionalResourceModelFactoryImpl
