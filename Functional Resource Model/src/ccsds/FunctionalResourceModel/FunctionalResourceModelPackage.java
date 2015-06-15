/**
 */
package ccsds.FunctionalResourceModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ccsds.FunctionalResourceModel.FunctionalResourceModelFactory
 * @model kind="package"
 * @generated
 */
public interface FunctionalResourceModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "FunctionalResourceModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iso.org.dod.ccsds";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fr";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FunctionalResourceModelPackage eINSTANCE = ccsds.FunctionalResourceModel.impl.FunctionalResourceModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link ccsds.FunctionalResourceModel.impl.FunctionalResourceModelImpl <em>Functional Resource Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.FunctionalResourceModel.impl.FunctionalResourceModelImpl
	 * @see ccsds.FunctionalResourceModel.impl.FunctionalResourceModelPackageImpl#getFunctionalResourceModel()
	 * @generated
	 */
	int FUNCTIONAL_RESOURCE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Root Oid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_RESOURCE_MODEL__ROOT_OID = 0;

	/**
	 * The feature id for the '<em><b>Functional Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_RESOURCE_MODEL__FUNCTIONAL_RESOURCE = 1;

	/**
	 * The number of structural features of the '<em>Functional Resource Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_RESOURCE_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Functional Resource Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_RESOURCE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ccsds.FunctionalResourceModel.impl.FrModelElementImpl <em>Fr Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.FunctionalResourceModel.impl.FrModelElementImpl
	 * @see ccsds.FunctionalResourceModel.impl.FunctionalResourceModelPackageImpl#getFrModelElement()
	 * @generated
	 */
	int FR_MODEL_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Semantic Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FR_MODEL_ELEMENT__SEMANTIC_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Oid Bit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FR_MODEL_ELEMENT__OID_BIT = 1;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FR_MODEL_ELEMENT__OID = 2;

	/**
	 * The feature id for the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FR_MODEL_ELEMENT__DEPRECATED = 3;

	/**
	 * The feature id for the '<em><b>Authorizing Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FR_MODEL_ELEMENT__AUTHORIZING_ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FR_MODEL_ELEMENT__CREATION_DATE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FR_MODEL_ELEMENT__NAME = 6;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FR_MODEL_ELEMENT__VERSION = 7;

	/**
	 * The number of structural features of the '<em>Fr Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FR_MODEL_ELEMENT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Fr Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FR_MODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ccsds.FunctionalResourceModel.impl.OidImpl <em>Oid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.FunctionalResourceModel.impl.OidImpl
	 * @see ccsds.FunctionalResourceModel.impl.FunctionalResourceModelPackageImpl#getOid()
	 * @generated
	 */
	int OID = 2;

	/**
	 * The feature id for the '<em><b>Oid Bit</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OID__OID_BIT = 0;

	/**
	 * The number of structural features of the '<em>Oid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OID_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Oid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ccsds.FunctionalResourceModel.impl.FunctionalResourceImpl <em>Functional Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.FunctionalResourceModel.impl.FunctionalResourceImpl
	 * @see ccsds.FunctionalResourceModel.impl.FunctionalResourceModelPackageImpl#getFunctionalResource()
	 * @generated
	 */
	int FUNCTIONAL_RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Semantic Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_RESOURCE__SEMANTIC_DEFINITION = FR_MODEL_ELEMENT__SEMANTIC_DEFINITION;

	/**
	 * The feature id for the '<em><b>Oid Bit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_RESOURCE__OID_BIT = FR_MODEL_ELEMENT__OID_BIT;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_RESOURCE__OID = FR_MODEL_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_RESOURCE__DEPRECATED = FR_MODEL_ELEMENT__DEPRECATED;

	/**
	 * The feature id for the '<em><b>Authorizing Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_RESOURCE__AUTHORIZING_ENTITY = FR_MODEL_ELEMENT__AUTHORIZING_ENTITY;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_RESOURCE__CREATION_DATE = FR_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_RESOURCE__NAME = FR_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_RESOURCE__VERSION = FR_MODEL_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_RESOURCE__EVENTS = FR_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Directives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_RESOURCE__DIRECTIVES = FR_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_RESOURCE__USES = FR_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_RESOURCE__PARAMETER = FR_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Functional Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_RESOURCE_FEATURE_COUNT = FR_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Functional Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_RESOURCE_OPERATION_COUNT = FR_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsds.FunctionalResourceModel.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.FunctionalResourceModel.impl.EventImpl
	 * @see ccsds.FunctionalResourceModel.impl.FunctionalResourceModelPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 4;

	/**
	 * The feature id for the '<em><b>Semantic Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__SEMANTIC_DEFINITION = FR_MODEL_ELEMENT__SEMANTIC_DEFINITION;

	/**
	 * The feature id for the '<em><b>Oid Bit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__OID_BIT = FR_MODEL_ELEMENT__OID_BIT;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__OID = FR_MODEL_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DEPRECATED = FR_MODEL_ELEMENT__DEPRECATED;

	/**
	 * The feature id for the '<em><b>Authorizing Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__AUTHORIZING_ENTITY = FR_MODEL_ELEMENT__AUTHORIZING_ENTITY;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CREATION_DATE = FR_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = FR_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__VERSION = FR_MODEL_ELEMENT__VERSION;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = FR_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = FR_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsds.FunctionalResourceModel.impl.DirectiveImpl <em>Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.FunctionalResourceModel.impl.DirectiveImpl
	 * @see ccsds.FunctionalResourceModel.impl.FunctionalResourceModelPackageImpl#getDirective()
	 * @generated
	 */
	int DIRECTIVE = 5;

	/**
	 * The feature id for the '<em><b>Semantic Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE__SEMANTIC_DEFINITION = FR_MODEL_ELEMENT__SEMANTIC_DEFINITION;

	/**
	 * The feature id for the '<em><b>Oid Bit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE__OID_BIT = FR_MODEL_ELEMENT__OID_BIT;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE__OID = FR_MODEL_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE__DEPRECATED = FR_MODEL_ELEMENT__DEPRECATED;

	/**
	 * The feature id for the '<em><b>Authorizing Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE__AUTHORIZING_ENTITY = FR_MODEL_ELEMENT__AUTHORIZING_ENTITY;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE__CREATION_DATE = FR_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE__NAME = FR_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE__VERSION = FR_MODEL_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE__PARAMETER = FR_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE_FEATURE_COUNT = FR_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE_OPERATION_COUNT = FR_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsds.FunctionalResourceModel.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.FunctionalResourceModel.impl.ParameterImpl
	 * @see ccsds.FunctionalResourceModel.impl.FunctionalResourceModelPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 6;

	/**
	 * The feature id for the '<em><b>Semantic Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__SEMANTIC_DEFINITION = FR_MODEL_ELEMENT__SEMANTIC_DEFINITION;

	/**
	 * The feature id for the '<em><b>Oid Bit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OID_BIT = FR_MODEL_ELEMENT__OID_BIT;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OID = FR_MODEL_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DEPRECATED = FR_MODEL_ELEMENT__DEPRECATED;

	/**
	 * The feature id for the '<em><b>Authorizing Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__AUTHORIZING_ENTITY = FR_MODEL_ELEMENT__AUTHORIZING_ENTITY;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CREATION_DATE = FR_MODEL_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = FR_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VERSION = FR_MODEL_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Engineering Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ENGINEERING_UNIT = FR_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE_DEFINITION = FR_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>External Type Oid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__EXTERNAL_TYPE_OID = FR_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Monitored</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MONITORED = FR_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Controlled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CONTROLLED = FR_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = FR_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = FR_MODEL_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ccsds.FunctionalResourceModel.FunctionalResourceModel <em>Functional Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Resource Model</em>'.
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModel
	 * @generated
	 */
	EClass getFunctionalResourceModel();

	/**
	 * Returns the meta object for the containment reference '{@link ccsds.FunctionalResourceModel.FunctionalResourceModel#getRootOid <em>Root Oid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root Oid</em>'.
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModel#getRootOid()
	 * @see #getFunctionalResourceModel()
	 * @generated
	 */
	EReference getFunctionalResourceModel_RootOid();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsds.FunctionalResourceModel.FunctionalResourceModel#getFunctionalResource <em>Functional Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functional Resource</em>'.
	 * @see ccsds.FunctionalResourceModel.FunctionalResourceModel#getFunctionalResource()
	 * @see #getFunctionalResourceModel()
	 * @generated
	 */
	EReference getFunctionalResourceModel_FunctionalResource();

	/**
	 * Returns the meta object for class '{@link ccsds.FunctionalResourceModel.FrModelElement <em>Fr Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fr Model Element</em>'.
	 * @see ccsds.FunctionalResourceModel.FrModelElement
	 * @generated
	 */
	EClass getFrModelElement();

	/**
	 * Returns the meta object for the attribute '{@link ccsds.FunctionalResourceModel.FrModelElement#getSemanticDefinition <em>Semantic Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantic Definition</em>'.
	 * @see ccsds.FunctionalResourceModel.FrModelElement#getSemanticDefinition()
	 * @see #getFrModelElement()
	 * @generated
	 */
	EAttribute getFrModelElement_SemanticDefinition();

	/**
	 * Returns the meta object for the attribute '{@link ccsds.FunctionalResourceModel.FrModelElement#getOidBit <em>Oid Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oid Bit</em>'.
	 * @see ccsds.FunctionalResourceModel.FrModelElement#getOidBit()
	 * @see #getFrModelElement()
	 * @generated
	 */
	EAttribute getFrModelElement_OidBit();

	/**
	 * Returns the meta object for the containment reference '{@link ccsds.FunctionalResourceModel.FrModelElement#getOid <em>Oid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Oid</em>'.
	 * @see ccsds.FunctionalResourceModel.FrModelElement#getOid()
	 * @see #getFrModelElement()
	 * @generated
	 */
	EReference getFrModelElement_Oid();

	/**
	 * Returns the meta object for the attribute '{@link ccsds.FunctionalResourceModel.FrModelElement#isDeprecated <em>Deprecated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deprecated</em>'.
	 * @see ccsds.FunctionalResourceModel.FrModelElement#isDeprecated()
	 * @see #getFrModelElement()
	 * @generated
	 */
	EAttribute getFrModelElement_Deprecated();

	/**
	 * Returns the meta object for the attribute '{@link ccsds.FunctionalResourceModel.FrModelElement#getAuthorizingEntity <em>Authorizing Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorizing Entity</em>'.
	 * @see ccsds.FunctionalResourceModel.FrModelElement#getAuthorizingEntity()
	 * @see #getFrModelElement()
	 * @generated
	 */
	EAttribute getFrModelElement_AuthorizingEntity();

	/**
	 * Returns the meta object for the attribute '{@link ccsds.FunctionalResourceModel.FrModelElement#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see ccsds.FunctionalResourceModel.FrModelElement#getCreationDate()
	 * @see #getFrModelElement()
	 * @generated
	 */
	EAttribute getFrModelElement_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link ccsds.FunctionalResourceModel.FrModelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ccsds.FunctionalResourceModel.FrModelElement#getName()
	 * @see #getFrModelElement()
	 * @generated
	 */
	EAttribute getFrModelElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link ccsds.FunctionalResourceModel.FrModelElement#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see ccsds.FunctionalResourceModel.FrModelElement#getVersion()
	 * @see #getFrModelElement()
	 * @generated
	 */
	EAttribute getFrModelElement_Version();

	/**
	 * Returns the meta object for class '{@link ccsds.FunctionalResourceModel.Oid <em>Oid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oid</em>'.
	 * @see ccsds.FunctionalResourceModel.Oid
	 * @generated
	 */
	EClass getOid();

	/**
	 * Returns the meta object for the attribute list '{@link ccsds.FunctionalResourceModel.Oid#getOidBit <em>Oid Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Oid Bit</em>'.
	 * @see ccsds.FunctionalResourceModel.Oid#getOidBit()
	 * @see #getOid()
	 * @generated
	 */
	EAttribute getOid_OidBit();

	/**
	 * Returns the meta object for class '{@link ccsds.FunctionalResourceModel.FunctionalResource <em>Functional Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Resource</em>'.
	 * @see ccsds.FunctionalResourceModel.FunctionalResource
	 * @generated
	 */
	EClass getFunctionalResource();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsds.FunctionalResourceModel.FunctionalResource#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see ccsds.FunctionalResourceModel.FunctionalResource#getEvents()
	 * @see #getFunctionalResource()
	 * @generated
	 */
	EReference getFunctionalResource_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsds.FunctionalResourceModel.FunctionalResource#getDirectives <em>Directives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Directives</em>'.
	 * @see ccsds.FunctionalResourceModel.FunctionalResource#getDirectives()
	 * @see #getFunctionalResource()
	 * @generated
	 */
	EReference getFunctionalResource_Directives();

	/**
	 * Returns the meta object for the reference list '{@link ccsds.FunctionalResourceModel.FunctionalResource#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses</em>'.
	 * @see ccsds.FunctionalResourceModel.FunctionalResource#getUses()
	 * @see #getFunctionalResource()
	 * @generated
	 */
	EReference getFunctionalResource_Uses();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsds.FunctionalResourceModel.FunctionalResource#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see ccsds.FunctionalResourceModel.FunctionalResource#getParameter()
	 * @see #getFunctionalResource()
	 * @generated
	 */
	EReference getFunctionalResource_Parameter();

	/**
	 * Returns the meta object for class '{@link ccsds.FunctionalResourceModel.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see ccsds.FunctionalResourceModel.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link ccsds.FunctionalResourceModel.Directive <em>Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directive</em>'.
	 * @see ccsds.FunctionalResourceModel.Directive
	 * @generated
	 */
	EClass getDirective();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsds.FunctionalResourceModel.Directive#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see ccsds.FunctionalResourceModel.Directive#getParameter()
	 * @see #getDirective()
	 * @generated
	 */
	EReference getDirective_Parameter();

	/**
	 * Returns the meta object for class '{@link ccsds.FunctionalResourceModel.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see ccsds.FunctionalResourceModel.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link ccsds.FunctionalResourceModel.Parameter#getEngineeringUnit <em>Engineering Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Engineering Unit</em>'.
	 * @see ccsds.FunctionalResourceModel.Parameter#getEngineeringUnit()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_EngineeringUnit();

	/**
	 * Returns the meta object for the attribute '{@link ccsds.FunctionalResourceModel.Parameter#getTypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Definition</em>'.
	 * @see ccsds.FunctionalResourceModel.Parameter#getTypeDefinition()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_TypeDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link ccsds.FunctionalResourceModel.Parameter#getExternalTypeOid <em>External Type Oid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Type Oid</em>'.
	 * @see ccsds.FunctionalResourceModel.Parameter#getExternalTypeOid()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_ExternalTypeOid();

	/**
	 * Returns the meta object for the attribute '{@link ccsds.FunctionalResourceModel.Parameter#isMonitored <em>Monitored</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitored</em>'.
	 * @see ccsds.FunctionalResourceModel.Parameter#isMonitored()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Monitored();

	/**
	 * Returns the meta object for the attribute '{@link ccsds.FunctionalResourceModel.Parameter#isControlled <em>Controlled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controlled</em>'.
	 * @see ccsds.FunctionalResourceModel.Parameter#isControlled()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Controlled();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FunctionalResourceModelFactory getFunctionalResourceModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ccsds.FunctionalResourceModel.impl.FunctionalResourceModelImpl <em>Functional Resource Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.FunctionalResourceModel.impl.FunctionalResourceModelImpl
		 * @see ccsds.FunctionalResourceModel.impl.FunctionalResourceModelPackageImpl#getFunctionalResourceModel()
		 * @generated
		 */
		EClass FUNCTIONAL_RESOURCE_MODEL = eINSTANCE.getFunctionalResourceModel();

		/**
		 * The meta object literal for the '<em><b>Root Oid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_RESOURCE_MODEL__ROOT_OID = eINSTANCE.getFunctionalResourceModel_RootOid();

		/**
		 * The meta object literal for the '<em><b>Functional Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_RESOURCE_MODEL__FUNCTIONAL_RESOURCE = eINSTANCE.getFunctionalResourceModel_FunctionalResource();

		/**
		 * The meta object literal for the '{@link ccsds.FunctionalResourceModel.impl.FrModelElementImpl <em>Fr Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.FunctionalResourceModel.impl.FrModelElementImpl
		 * @see ccsds.FunctionalResourceModel.impl.FunctionalResourceModelPackageImpl#getFrModelElement()
		 * @generated
		 */
		EClass FR_MODEL_ELEMENT = eINSTANCE.getFrModelElement();

		/**
		 * The meta object literal for the '<em><b>Semantic Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FR_MODEL_ELEMENT__SEMANTIC_DEFINITION = eINSTANCE.getFrModelElement_SemanticDefinition();

		/**
		 * The meta object literal for the '<em><b>Oid Bit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FR_MODEL_ELEMENT__OID_BIT = eINSTANCE.getFrModelElement_OidBit();

		/**
		 * The meta object literal for the '<em><b>Oid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FR_MODEL_ELEMENT__OID = eINSTANCE.getFrModelElement_Oid();

		/**
		 * The meta object literal for the '<em><b>Deprecated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FR_MODEL_ELEMENT__DEPRECATED = eINSTANCE.getFrModelElement_Deprecated();

		/**
		 * The meta object literal for the '<em><b>Authorizing Entity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FR_MODEL_ELEMENT__AUTHORIZING_ENTITY = eINSTANCE.getFrModelElement_AuthorizingEntity();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FR_MODEL_ELEMENT__CREATION_DATE = eINSTANCE.getFrModelElement_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FR_MODEL_ELEMENT__NAME = eINSTANCE.getFrModelElement_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FR_MODEL_ELEMENT__VERSION = eINSTANCE.getFrModelElement_Version();

		/**
		 * The meta object literal for the '{@link ccsds.FunctionalResourceModel.impl.OidImpl <em>Oid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.FunctionalResourceModel.impl.OidImpl
		 * @see ccsds.FunctionalResourceModel.impl.FunctionalResourceModelPackageImpl#getOid()
		 * @generated
		 */
		EClass OID = eINSTANCE.getOid();

		/**
		 * The meta object literal for the '<em><b>Oid Bit</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OID__OID_BIT = eINSTANCE.getOid_OidBit();

		/**
		 * The meta object literal for the '{@link ccsds.FunctionalResourceModel.impl.FunctionalResourceImpl <em>Functional Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.FunctionalResourceModel.impl.FunctionalResourceImpl
		 * @see ccsds.FunctionalResourceModel.impl.FunctionalResourceModelPackageImpl#getFunctionalResource()
		 * @generated
		 */
		EClass FUNCTIONAL_RESOURCE = eINSTANCE.getFunctionalResource();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_RESOURCE__EVENTS = eINSTANCE.getFunctionalResource_Events();

		/**
		 * The meta object literal for the '<em><b>Directives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_RESOURCE__DIRECTIVES = eINSTANCE.getFunctionalResource_Directives();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_RESOURCE__USES = eINSTANCE.getFunctionalResource_Uses();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_RESOURCE__PARAMETER = eINSTANCE.getFunctionalResource_Parameter();

		/**
		 * The meta object literal for the '{@link ccsds.FunctionalResourceModel.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.FunctionalResourceModel.impl.EventImpl
		 * @see ccsds.FunctionalResourceModel.impl.FunctionalResourceModelPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link ccsds.FunctionalResourceModel.impl.DirectiveImpl <em>Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.FunctionalResourceModel.impl.DirectiveImpl
		 * @see ccsds.FunctionalResourceModel.impl.FunctionalResourceModelPackageImpl#getDirective()
		 * @generated
		 */
		EClass DIRECTIVE = eINSTANCE.getDirective();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTIVE__PARAMETER = eINSTANCE.getDirective_Parameter();

		/**
		 * The meta object literal for the '{@link ccsds.FunctionalResourceModel.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.FunctionalResourceModel.impl.ParameterImpl
		 * @see ccsds.FunctionalResourceModel.impl.FunctionalResourceModelPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Engineering Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__ENGINEERING_UNIT = eINSTANCE.getParameter_EngineeringUnit();

		/**
		 * The meta object literal for the '<em><b>Type Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE_DEFINITION = eINSTANCE.getParameter_TypeDefinition();

		/**
		 * The meta object literal for the '<em><b>External Type Oid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__EXTERNAL_TYPE_OID = eINSTANCE.getParameter_ExternalTypeOid();

		/**
		 * The meta object literal for the '<em><b>Monitored</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__MONITORED = eINSTANCE.getParameter_Monitored();

		/**
		 * The meta object literal for the '<em><b>Controlled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__CONTROLLED = eINSTANCE.getParameter_Controlled();

	}

} //FunctionalResourceModelPackage
