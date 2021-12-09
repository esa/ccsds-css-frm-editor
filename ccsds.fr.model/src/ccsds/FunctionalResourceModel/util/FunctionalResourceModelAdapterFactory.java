/**
 */
package ccsds.FunctionalResourceModel.util;

import ccsds.FunctionalResourceModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage
 * @generated
 */
public class FunctionalResourceModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FunctionalResourceModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalResourceModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FunctionalResourceModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalResourceModelSwitch<Adapter> modelSwitch =
		new FunctionalResourceModelSwitch<Adapter>() {
			@Override
			public Adapter caseFunctionalResourceModel(FunctionalResourceModel object) {
				return createFunctionalResourceModelAdapter();
			}
			@Override
			public Adapter caseFunctionalResourceStratum(FunctionalResourceStratum object) {
				return createFunctionalResourceStratumAdapter();
			}
			@Override
			public Adapter caseFunctionalResourceSet(FunctionalResourceSet object) {
				return createFunctionalResourceSetAdapter();
			}
			@Override
			public Adapter caseFrModelElement(FrModelElement object) {
				return createFrModelElementAdapter();
			}
			@Override
			public Adapter caseOid(Oid object) {
				return createOidAdapter();
			}
			@Override
			public Adapter caseFunctionalResource(FunctionalResource object) {
				return createFunctionalResourceAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseDirective(Directive object) {
				return createDirectiveAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseQualifier(Qualifier object) {
				return createQualifierAdapter();
			}
			@Override
			public Adapter caseTypedElement(TypedElement object) {
				return createTypedElementAdapter();
			}
			@Override
			public Adapter caseServiceAccessPoint(ServiceAccessPoint object) {
				return createServiceAccessPointAdapter();
			}
			@Override
			public Adapter caseAncillaryInterface(AncillaryInterface object) {
				return createAncillaryInterfaceAdapter();
			}
			@Override
			public Adapter caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ccsds.FunctionalResourceModel.FunctionalResourceModel <em>Functional Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModel
	 * @generated
	 */
	public Adapter createFunctionalResourceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.FunctionalResourceModel.FrModelElement <em>Fr Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.FunctionalResourceModel.FrModelElement
	 * @generated
	 */
	public Adapter createFrModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.FunctionalResourceModel.Oid <em>Oid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.FunctionalResourceModel.Oid
	 * @generated
	 */
	public Adapter createOidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.FunctionalResourceModel.FunctionalResource <em>Functional Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.FunctionalResourceModel.FunctionalResource
	 * @generated
	 */
	public Adapter createFunctionalResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.FunctionalResourceModel.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.FunctionalResourceModel.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.FunctionalResourceModel.Directive <em>Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.FunctionalResourceModel.Directive
	 * @generated
	 */
	public Adapter createDirectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.FunctionalResourceModel.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.FunctionalResourceModel.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.FunctionalResourceModel.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.FunctionalResourceModel.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.FunctionalResourceModel.Qualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.FunctionalResourceModel.Qualifier
	 * @generated
	 */
	public Adapter createQualifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.FunctionalResourceModel.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.FunctionalResourceModel.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.FunctionalResourceModel.ServiceAccessPoint <em>Service Access Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.FunctionalResourceModel.ServiceAccessPoint
	 * @generated
	 */
	public Adapter createServiceAccessPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.FunctionalResourceModel.AncillaryInterface <em>Ancillary Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.FunctionalResourceModel.AncillaryInterface
	 * @generated
	 */
	public Adapter createAncillaryInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.FunctionalResourceModel.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.FunctionalResourceModel.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.FunctionalResourceModel.FunctionalResourceStratum <em>Functional Resource Stratum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceStratum
	 * @generated
	 */
	public Adapter createFunctionalResourceStratumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.FunctionalResourceModel.FunctionalResourceSet <em>Functional Resource Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceSet
	 * @generated
	 */
	public Adapter createFunctionalResourceSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FunctionalResourceModelAdapterFactory
