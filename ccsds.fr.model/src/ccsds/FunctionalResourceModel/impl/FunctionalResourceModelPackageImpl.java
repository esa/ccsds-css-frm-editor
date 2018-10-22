/**
 */
package ccsds.FunctionalResourceModel.impl;

import ccsds.FunctionalResourceModel.AncillaryInterface;
import ccsds.FunctionalResourceModel.Directive;
import ccsds.FunctionalResourceModel.Event;
import ccsds.FunctionalResourceModel.FrModelElement;
import ccsds.FunctionalResourceModel.FunctionalResource;
import ccsds.FunctionalResourceModel.FunctionalResourceModel;
import ccsds.FunctionalResourceModel.FunctionalResourceModelFactory;
import ccsds.FunctionalResourceModel.FunctionalResourceModelPackage;
import ccsds.FunctionalResourceModel.FunctionalResourceSet;
import ccsds.FunctionalResourceModel.Oid;
import ccsds.FunctionalResourceModel.Parameter;
import ccsds.FunctionalResourceModel.Qualifier;
import ccsds.FunctionalResourceModel.ServiceAccessPoint;
import ccsds.FunctionalResourceModel.TypedElement;
import ccsds.FunctionalResourceModel.Value;
import ccsds.FunctionalResourceModel.util.FunctionalResourceModelValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionalResourceModelPackageImpl extends EPackageImpl implements FunctionalResourceModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalResourceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceAccessPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ancillaryInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalResourceSetEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FunctionalResourceModelPackageImpl() {
		super(eNS_URI, FunctionalResourceModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FunctionalResourceModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FunctionalResourceModelPackage init() {
		if (isInited) return (FunctionalResourceModelPackage)EPackage.Registry.INSTANCE.getEPackage(FunctionalResourceModelPackage.eNS_URI);

		// Obtain or create and register package
		FunctionalResourceModelPackageImpl theFunctionalResourceModelPackage = (FunctionalResourceModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FunctionalResourceModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FunctionalResourceModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theFunctionalResourceModelPackage.createPackageContents();

		// Initialize created meta-data
		theFunctionalResourceModelPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theFunctionalResourceModelPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return FunctionalResourceModelValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theFunctionalResourceModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FunctionalResourceModelPackage.eNS_URI, theFunctionalResourceModelPackage);
		return theFunctionalResourceModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalResourceModel() {
		return functionalResourceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalResourceModel_RootOid() {
		return (EReference)functionalResourceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalResourceModel_FunctionalResourceSet() {
		return (EReference)functionalResourceModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalResourceModel_FunctionalResource() {
		return (EReference)functionalResourceModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrModelElement() {
		return frModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrModelElement_SemanticDefinition() {
		return (EAttribute)frModelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrModelElement_StringIdentifier() {
		return (EAttribute)frModelElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrModelElement_Classifier() {
		return (EAttribute)frModelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrModelElement_OidBit() {
		return (EAttribute)frModelElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrModelElement_Oid() {
		return (EReference)frModelElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrModelElement_Deprecated() {
		return (EAttribute)frModelElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrModelElement_AuthorizingEntity() {
		return (EAttribute)frModelElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrModelElement_CreationDate() {
		return (EAttribute)frModelElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrModelElement_Version() {
		return (EAttribute)frModelElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOid() {
		return oidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOid_OidBit() {
		return (EAttribute)oidEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalResource() {
		return functionalResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalResource_Event() {
		return (EReference)functionalResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalResource_Directives() {
		return (EReference)functionalResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalResource_Uses() {
		return (EReference)functionalResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalResource_Parameter() {
		return (EReference)functionalResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalResource_ServiceAccesspoint() {
		return (EReference)functionalResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalResource_ProvidedAncillaryInterface() {
		return (EReference)functionalResourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_Value() {
		return (EReference)eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_ExternalOid() {
		return (EReference)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirective() {
		return directiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirective_GuardCondition() {
		return (EAttribute)directiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirective_Qualifier() {
		return (EReference)directiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Configured() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_GuardCondition() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_ExternalOid() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualifier() {
		return qualifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedElement() {
		return typedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypedElement_TypeDefinition() {
		return (EAttribute)typedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypedElement_EngineeringUnit() {
		return (EAttribute)typedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedElement_ExternalTypeOid() {
		return (EReference)typedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedElement_TypeOid() {
		return (EReference)typedElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceAccessPoint() {
		return serviceAccessPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceAccessPoint_Name() {
		return (EAttribute)serviceAccessPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceAccessPoint_MinAccessor() {
		return (EAttribute)serviceAccessPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceAccessPoint_MaxAccessor() {
		return (EAttribute)serviceAccessPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceAccessPoint_MinAccessed() {
		return (EAttribute)serviceAccessPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceAccessPoint_MaxAccessed() {
		return (EAttribute)serviceAccessPointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceAccessPoint_AccessingFunctionalResource() {
		return (EReference)serviceAccessPointEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceAccessPoint_AccessedFunctionalResource() {
		return (EReference)serviceAccessPointEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAncillaryInterface() {
		return ancillaryInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAncillaryInterface_Name() {
		return (EAttribute)ancillaryInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAncillaryInterface_ProvidingFunctionalResource() {
		return (EReference)ancillaryInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAncillaryInterface_RequiringFunctionalResource() {
		return (EReference)ancillaryInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalResourceSet() {
		return functionalResourceSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionalResourceSet_Name() {
		return (EAttribute)functionalResourceSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalResourceSet_FunctionalResource() {
		return (EReference)functionalResourceSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalResourceModelFactory getFunctionalResourceModelFactory() {
		return (FunctionalResourceModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		functionalResourceModelEClass = createEClass(FUNCTIONAL_RESOURCE_MODEL);
		createEReference(functionalResourceModelEClass, FUNCTIONAL_RESOURCE_MODEL__ROOT_OID);
		createEReference(functionalResourceModelEClass, FUNCTIONAL_RESOURCE_MODEL__FUNCTIONAL_RESOURCE_SET);
		createEReference(functionalResourceModelEClass, FUNCTIONAL_RESOURCE_MODEL__FUNCTIONAL_RESOURCE);

		functionalResourceSetEClass = createEClass(FUNCTIONAL_RESOURCE_SET);
		createEAttribute(functionalResourceSetEClass, FUNCTIONAL_RESOURCE_SET__NAME);
		createEReference(functionalResourceSetEClass, FUNCTIONAL_RESOURCE_SET__FUNCTIONAL_RESOURCE);

		frModelElementEClass = createEClass(FR_MODEL_ELEMENT);
		createEAttribute(frModelElementEClass, FR_MODEL_ELEMENT__SEMANTIC_DEFINITION);
		createEAttribute(frModelElementEClass, FR_MODEL_ELEMENT__CLASSIFIER);
		createEAttribute(frModelElementEClass, FR_MODEL_ELEMENT__STRING_IDENTIFIER);
		createEAttribute(frModelElementEClass, FR_MODEL_ELEMENT__VERSION);
		createEAttribute(frModelElementEClass, FR_MODEL_ELEMENT__CREATION_DATE);
		createEAttribute(frModelElementEClass, FR_MODEL_ELEMENT__AUTHORIZING_ENTITY);
		createEAttribute(frModelElementEClass, FR_MODEL_ELEMENT__OID_BIT);
		createEReference(frModelElementEClass, FR_MODEL_ELEMENT__OID);
		createEAttribute(frModelElementEClass, FR_MODEL_ELEMENT__DEPRECATED);

		oidEClass = createEClass(OID);
		createEAttribute(oidEClass, OID__OID_BIT);

		functionalResourceEClass = createEClass(FUNCTIONAL_RESOURCE);
		createEReference(functionalResourceEClass, FUNCTIONAL_RESOURCE__EVENT);
		createEReference(functionalResourceEClass, FUNCTIONAL_RESOURCE__DIRECTIVES);
		createEReference(functionalResourceEClass, FUNCTIONAL_RESOURCE__USES);
		createEReference(functionalResourceEClass, FUNCTIONAL_RESOURCE__PARAMETER);
		createEReference(functionalResourceEClass, FUNCTIONAL_RESOURCE__SERVICE_ACCESSPOINT);
		createEReference(functionalResourceEClass, FUNCTIONAL_RESOURCE__PROVIDED_ANCILLARY_INTERFACE);

		eventEClass = createEClass(EVENT);
		createEReference(eventEClass, EVENT__EXTERNAL_OID);
		createEReference(eventEClass, EVENT__VALUE);

		directiveEClass = createEClass(DIRECTIVE);
		createEReference(directiveEClass, DIRECTIVE__QUALIFIER);
		createEAttribute(directiveEClass, DIRECTIVE__GUARD_CONDITION);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__CONFIGURED);
		createEAttribute(parameterEClass, PARAMETER__GUARD_CONDITION);
		createEReference(parameterEClass, PARAMETER__EXTERNAL_OID);

		valueEClass = createEClass(VALUE);

		qualifierEClass = createEClass(QUALIFIER);

		typedElementEClass = createEClass(TYPED_ELEMENT);
		createEAttribute(typedElementEClass, TYPED_ELEMENT__TYPE_DEFINITION);
		createEAttribute(typedElementEClass, TYPED_ELEMENT__ENGINEERING_UNIT);
		createEReference(typedElementEClass, TYPED_ELEMENT__EXTERNAL_TYPE_OID);
		createEReference(typedElementEClass, TYPED_ELEMENT__TYPE_OID);

		serviceAccessPointEClass = createEClass(SERVICE_ACCESS_POINT);
		createEAttribute(serviceAccessPointEClass, SERVICE_ACCESS_POINT__NAME);
		createEAttribute(serviceAccessPointEClass, SERVICE_ACCESS_POINT__MIN_ACCESSOR);
		createEAttribute(serviceAccessPointEClass, SERVICE_ACCESS_POINT__MAX_ACCESSOR);
		createEAttribute(serviceAccessPointEClass, SERVICE_ACCESS_POINT__MIN_ACCESSED);
		createEAttribute(serviceAccessPointEClass, SERVICE_ACCESS_POINT__MAX_ACCESSED);
		createEReference(serviceAccessPointEClass, SERVICE_ACCESS_POINT__ACCESSED_FUNCTIONAL_RESOURCE);
		createEReference(serviceAccessPointEClass, SERVICE_ACCESS_POINT__ACCESSING_FUNCTIONAL_RESOURCE);

		ancillaryInterfaceEClass = createEClass(ANCILLARY_INTERFACE);
		createEAttribute(ancillaryInterfaceEClass, ANCILLARY_INTERFACE__NAME);
		createEReference(ancillaryInterfaceEClass, ANCILLARY_INTERFACE__PROVIDING_FUNCTIONAL_RESOURCE);
		createEReference(ancillaryInterfaceEClass, ANCILLARY_INTERFACE__REQUIRING_FUNCTIONAL_RESOURCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		functionalResourceEClass.getESuperTypes().add(this.getFrModelElement());
		eventEClass.getESuperTypes().add(this.getFrModelElement());
		directiveEClass.getESuperTypes().add(this.getFrModelElement());
		parameterEClass.getESuperTypes().add(this.getTypedElement());
		valueEClass.getESuperTypes().add(this.getTypedElement());
		qualifierEClass.getESuperTypes().add(this.getTypedElement());
		typedElementEClass.getESuperTypes().add(this.getFrModelElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(functionalResourceModelEClass, FunctionalResourceModel.class, "FunctionalResourceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionalResourceModel_RootOid(), this.getOid(), null, "rootOid", null, 1, 1, FunctionalResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalResourceModel_FunctionalResourceSet(), this.getFunctionalResourceSet(), null, "functionalResourceSet", null, 0, -1, FunctionalResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalResourceModel_FunctionalResource(), this.getFunctionalResource(), null, "functionalResource", null, 0, -1, FunctionalResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionalResourceSetEClass, FunctionalResourceSet.class, "FunctionalResourceSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionalResourceSet_Name(), ecorePackage.getEString(), "name", null, 1, 1, FunctionalResourceSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalResourceSet_FunctionalResource(), this.getFunctionalResource(), null, "functionalResource", null, 0, -1, FunctionalResourceSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(frModelElementEClass, FrModelElement.class, "FrModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFrModelElement_SemanticDefinition(), ecorePackage.getEString(), "SemanticDefinition", null, 1, 1, FrModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrModelElement_Classifier(), ecorePackage.getEString(), "classifier", null, 1, 1, FrModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrModelElement_StringIdentifier(), ecorePackage.getEString(), "stringIdentifier", null, 0, 1, FrModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrModelElement_Version(), ecorePackage.getEInt(), "version", "1", 1, 1, FrModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrModelElement_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 0, 1, FrModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrModelElement_AuthorizingEntity(), ecorePackage.getEString(), "authorizingEntity", null, 1, 1, FrModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrModelElement_OidBit(), ecorePackage.getEInt(), "oidBit", null, 1, 1, FrModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFrModelElement_Oid(), this.getOid(), null, "oid", null, 0, 1, FrModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrModelElement_Deprecated(), ecorePackage.getEBoolean(), "deprecated", null, 1, 1, FrModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oidEClass, Oid.class, "Oid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOid_OidBit(), ecorePackage.getEInt(), "oidBit", null, 0, -1, Oid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionalResourceEClass, FunctionalResource.class, "FunctionalResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionalResource_Event(), this.getEvent(), null, "event", null, 0, -1, FunctionalResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalResource_Directives(), this.getDirective(), null, "directives", null, 0, -1, FunctionalResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalResource_Uses(), this.getFunctionalResource(), null, "uses", null, 0, -1, FunctionalResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalResource_Parameter(), this.getParameter(), null, "parameter", null, 0, -1, FunctionalResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalResource_ServiceAccesspoint(), this.getServiceAccessPoint(), this.getServiceAccessPoint_AccessedFunctionalResource(), "serviceAccesspoint", null, 0, -1, FunctionalResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalResource_ProvidedAncillaryInterface(), this.getAncillaryInterface(), this.getAncillaryInterface_ProvidingFunctionalResource(), "providedAncillaryInterface", null, 0, -1, FunctionalResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvent_ExternalOid(), this.getOid(), null, "externalOid", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_Value(), this.getValue(), null, "value", null, 0, -1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(directiveEClass, Directive.class, "Directive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDirective_Qualifier(), this.getQualifier(), null, "qualifier", null, 0, -1, Directive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDirective_GuardCondition(), ecorePackage.getEString(), "guardCondition", null, 1, 1, Directive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Configured(), ecorePackage.getEBoolean(), "configured", "false", 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_GuardCondition(), ecorePackage.getEString(), "guardCondition", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_ExternalOid(), this.getOid(), null, "externalOid", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(qualifierEClass, Qualifier.class, "Qualifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typedElementEClass, TypedElement.class, "TypedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypedElement_TypeDefinition(), ecorePackage.getEString(), "typeDefinition", null, 1, 1, TypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypedElement_EngineeringUnit(), ecorePackage.getEString(), "engineeringUnit", null, 0, 1, TypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypedElement_ExternalTypeOid(), this.getOid(), null, "externalTypeOid", null, 0, 1, TypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypedElement_TypeOid(), this.getOid(), null, "typeOid", null, 1, 1, TypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceAccessPointEClass, ServiceAccessPoint.class, "ServiceAccessPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceAccessPoint_Name(), ecorePackage.getEString(), "name", "newSAP", 0, 1, ServiceAccessPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceAccessPoint_MinAccessor(), ecorePackage.getEInt(), "minAccessor", "1", 1, 1, ServiceAccessPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceAccessPoint_MaxAccessor(), ecorePackage.getEInt(), "maxAccessor", "1", 1, 1, ServiceAccessPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceAccessPoint_MinAccessed(), ecorePackage.getEInt(), "minAccessed", "1", 1, 1, ServiceAccessPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceAccessPoint_MaxAccessed(), ecorePackage.getEInt(), "maxAccessed", "1", 1, 1, ServiceAccessPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceAccessPoint_AccessedFunctionalResource(), this.getFunctionalResource(), this.getFunctionalResource_ServiceAccesspoint(), "accessedFunctionalResource", null, 1, 1, ServiceAccessPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceAccessPoint_AccessingFunctionalResource(), this.getFunctionalResource(), null, "accessingFunctionalResource", null, 1, 1, ServiceAccessPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ancillaryInterfaceEClass, AncillaryInterface.class, "AncillaryInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAncillaryInterface_Name(), ecorePackage.getEString(), "name", null, 0, 1, AncillaryInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAncillaryInterface_ProvidingFunctionalResource(), this.getFunctionalResource(), this.getFunctionalResource_ProvidedAncillaryInterface(), "providingFunctionalResource", null, 1, 1, AncillaryInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAncillaryInterface_RequiringFunctionalResource(), this.getFunctionalResource(), null, "requiringFunctionalResource", null, 1, 1, AncillaryInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (parameterEClass, 
		   source, 
		   new String[] {
			 "constraints", "GuardConditionInv"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (parameterEClass, 
		   source, 
		   new String[] {
			 "GuardConditionInv", "self.configured = true implies self.guardCondition->notEmpty()"
		   });
	}

} //FunctionalResourceModelPackageImpl
