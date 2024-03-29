/**
 */
package ccsds.FunctionalResourceModel.impl;

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
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_STRATUM: return createFunctionalResourceStratum();
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_SET: return createFunctionalResourceSet();
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT: return createFrModelElement();
			case FunctionalResourceModelPackage.OID: return createOid();
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE: return createFunctionalResource();
			case FunctionalResourceModelPackage.EVENT: return createEvent();
			case FunctionalResourceModelPackage.DIRECTIVE: return createDirective();
			case FunctionalResourceModelPackage.PARAMETER: return createParameter();
			case FunctionalResourceModelPackage.VALUE: return createValue();
			case FunctionalResourceModelPackage.QUALIFIER: return createQualifier();
			case FunctionalResourceModelPackage.TYPED_ELEMENT: return createTypedElement();
			case FunctionalResourceModelPackage.SERVICE_ACCESS_POINT: return createServiceAccessPoint();
			case FunctionalResourceModelPackage.ANCILLARY_INTERFACE: return createAncillaryInterface();
			case FunctionalResourceModelPackage.ANNOTATION: return createAnnotation();
			case FunctionalResourceModelPackage.DATA_UNIT: return createDataUnit();
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
	public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Qualifier createQualifier() {
		QualifierImpl qualifier = new QualifierImpl();
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedElement createTypedElement() {
		TypedElementImpl typedElement = new TypedElementImpl();
		return typedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceAccessPoint createServiceAccessPoint() {
		ServiceAccessPointImpl serviceAccessPoint = new ServiceAccessPointImpl();
		return serviceAccessPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AncillaryInterface createAncillaryInterface() {
		AncillaryInterfaceImpl ancillaryInterface = new AncillaryInterfaceImpl();
		return ancillaryInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataUnit createDataUnit() {
		DataUnitImpl dataUnit = new DataUnitImpl();
		return dataUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalResourceStratum createFunctionalResourceStratum() {
		FunctionalResourceStratumImpl functionalResourceStratum = new FunctionalResourceStratumImpl();
		return functionalResourceStratum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalResourceSet createFunctionalResourceSet() {
		FunctionalResourceSetImpl functionalResourceSet = new FunctionalResourceSetImpl();
		return functionalResourceSet;
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
