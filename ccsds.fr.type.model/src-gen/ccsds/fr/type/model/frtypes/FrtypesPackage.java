/**
 */
package ccsds.fr.type.model.frtypes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see ccsds.fr.type.model.frtypes.FrtypesFactory
 * @model kind="package"
 * @generated
 */
public interface FrtypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "frtypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ccsds.fr/types";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "frtypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FrtypesPackage eINSTANCE = ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link ccsds.fr.type.model.frtypes.ExportWriter <em>Export Writer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.fr.type.model.frtypes.ExportWriter
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getExportWriter()
	 * @generated
	 */
	int EXPORT_WRITER = 31;

	/**
	 * The number of structural features of the '<em>Export Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_WRITER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Write Asn1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_WRITER___WRITE_ASN1__INT_STRINGBUFFER = 0;

	/**
	 * The operation id for the '<em>Write Xsd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_WRITER___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER = 1;

	/**
	 * The number of operations of the '<em>Export Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_WRITER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ccsds.fr.type.model.frtypes.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.fr.type.model.frtypes.impl.TypeDefinitionImpl
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getTypeDefinition()
	 * @generated
	 */
	int TYPE_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__NAME = EXPORT_WRITER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__TYPE = EXPORT_WRITER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__COMMENT = EXPORT_WRITER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_FEATURE_COUNT = EXPORT_WRITER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Write Asn1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION___WRITE_ASN1__INT_STRINGBUFFER = EXPORT_WRITER___WRITE_ASN1__INT_STRINGBUFFER;

	/**
	 * The operation id for the '<em>Write Xsd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER = EXPORT_WRITER___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER;

	/**
	 * The number of operations of the '<em>Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_OPERATION_COUNT = EXPORT_WRITER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsds.fr.type.model.frtypes.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.fr.type.model.frtypes.impl.TypeImpl
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 1;

	/**
	 * The feature id for the '<em><b>Single Value Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__SINGLE_VALUE_CONSTRAINT = EXPORT_WRITER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = EXPORT_WRITER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Write Asn1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___WRITE_ASN1__INT_STRINGBUFFER = EXPORT_WRITER___WRITE_ASN1__INT_STRINGBUFFER;

	/**
	 * The operation id for the '<em>Write Xsd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER = EXPORT_WRITER___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = EXPORT_WRITER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsds.fr.type.model.frtypes.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.fr.type.model.frtypes.impl.SimpleTypeImpl
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getSimpleType()
	 * @generated
	 */
	int SIMPLE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Single Value Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__SINGLE_VALUE_CONSTRAINT = TYPE__SINGLE_VALUE_CONSTRAINT;

	/**
	 * The number of structural features of the '<em>Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Write Asn1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE___WRITE_ASN1__INT_STRINGBUFFER = TYPE___WRITE_ASN1__INT_STRINGBUFFER;

	/**
	 * The operation id for the '<em>Write Xsd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER = TYPE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER;

	/**
	 * The number of operations of the '<em>Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsds.fr.type.model.frtypes.impl.StructuredTypeImpl <em>Structured Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.fr.type.model.frtypes.impl.StructuredTypeImpl
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getStructuredType()
	 * @generated
	 */
	int STRUCTURED_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Single Value Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TYPE__SINGLE_VALUE_CONSTRAINT = TYPE__SINGLE_VALUE_CONSTRAINT;

	/**
	 * The number of structural features of the '<em>Structured Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Write Asn1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TYPE___WRITE_ASN1__INT_STRINGBUFFER = TYPE___WRITE_ASN1__INT_STRINGBUFFER;

	/**
	 * The operation id for the '<em>Write Xsd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TYPE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER = TYPE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER;

	/**
	 * The number of operations of the '<em>Structured Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsds.fr.type.model.frtypes.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.fr.type.model.frtypes.impl.BooleanImpl
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 4;

	/**
	 * The feature id for the '<em><b>Single Value Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__SINGLE_VALUE_CONSTRAINT = SIMPLE_TYPE__SINGLE_VALUE_CONSTRAINT;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Write Asn1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN___WRITE_ASN1__INT_STRINGBUFFER = SIMPLE_TYPE___WRITE_ASN1__INT_STRINGBUFFER;

	/**
	 * The operation id for the '<em>Write Xsd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER = SIMPLE_TYPE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER;

	/**
	 * The number of operations of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_COUNT = SIMPLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsds.fr.type.model.frtypes.impl.SimpleRangeTypeImpl <em>Simple Range Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.fr.type.model.frtypes.impl.SimpleRangeTypeImpl
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getSimpleRangeType()
	 * @generated
	 */
	int SIMPLE_RANGE_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Single Value Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RANGE_TYPE__SINGLE_VALUE_CONSTRAINT = SIMPLE_TYPE__SINGLE_VALUE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Range Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RANGE_TYPE__RANGE_CONSTRAINT = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RANGE_TYPE_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Write Asn1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RANGE_TYPE___WRITE_ASN1__INT_STRINGBUFFER = SIMPLE_TYPE___WRITE_ASN1__INT_STRINGBUFFER;

	/**
	 * The operation id for the '<em>Write Xsd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RANGE_TYPE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER = SIMPLE_TYPE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER;

	/**
	 * The number of operations of the '<em>Simple Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RANGE_TYPE_OPERATION_COUNT = SIMPLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsds.fr.type.model.frtypes.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.fr.type.model.frtypes.impl.IntegerTypeImpl
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getIntegerType()
	 * @generated
	 */
	int INTEGER_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Single Value Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__SINGLE_VALUE_CONSTRAINT = SIMPLE_RANGE_TYPE__SINGLE_VALUE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Range Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__RANGE_CONSTRAINT = SIMPLE_RANGE_TYPE__RANGE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Named Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__NAMED_VALUES = SIMPLE_RANGE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE_FEATURE_COUNT = SIMPLE_RANGE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Write Asn1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE___WRITE_ASN1__INT_STRINGBUFFER = SIMPLE_RANGE_TYPE___WRITE_ASN1__INT_STRINGBUFFER;

	/**
	 * The operation id for the '<em>Write Xsd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER = SIMPLE_RANGE_TYPE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER;

	/**
	 * The number of operations of the '<em>Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE_OPERATION_COUNT = SIMPLE_RANGE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsds.fr.type.model.frtypes.impl.SimpleSizeConstrainedTypeImpl <em>Simple Size Constrained Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.fr.type.model.frtypes.impl.SimpleSizeConstrainedTypeImpl
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getSimpleSizeConstrainedType()
	 * @generated
	 */
	int SIMPLE_SIZE_CONSTRAINED_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Single Value Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SIZE_CONSTRAINED_TYPE__SINGLE_VALUE_CONSTRAINT = SIMPLE_TYPE__SINGLE_VALUE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Size Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SIZE_CONSTRAINED_TYPE__SIZE_CONSTRAINT = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Size Constrained Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SIZE_CONSTRAINED_TYPE_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Write Asn1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SIZE_CONSTRAINED_TYPE___WRITE_ASN1__INT_STRINGBUFFER = SIMPLE_TYPE___WRITE_ASN1__INT_STRINGBUFFER;

	/**
	 * The operation id for the '<em>Write Xsd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SIZE_CONSTRAINED_TYPE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER = SIMPLE_TYPE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER;

	/**
	 * The number of operations of the '<em>Simple Size Constrained Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SIZE_CONSTRAINED_TYPE_OPERATION_COUNT = SIMPLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsds.fr.type.model.frtypes.impl.BitStringImpl <em>Bit String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.fr.type.model.frtypes.impl.BitStringImpl
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getBitString()
	 * @generated
	 */
	int BIT_STRING = 6;

	/**
	 * The feature id for the '<em><b>Single Value Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_STRING__SINGLE_VALUE_CONSTRAINT = SIMPLE_SIZE_CONSTRAINED_TYPE__SINGLE_VALUE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Size Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_STRING__SIZE_CONSTRAINT = SIMPLE_SIZE_CONSTRAINED_TYPE__SIZE_CONSTRAINT;

	/**
	 * The number of structural features of the '<em>Bit String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_STRING_FEATURE_COUNT = SIMPLE_SIZE_CONSTRAINED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Write Asn1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_STRING___WRITE_ASN1__INT_STRINGBUFFER = SIMPLE_SIZE_CONSTRAINED_TYPE___WRITE_ASN1__INT_STRINGBUFFER;

	/**
	 * The operation id for the '<em>Write Xsd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_STRING___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER = SIMPLE_SIZE_CONSTRAINED_TYPE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER;

	/**
	 * The number of operations of the '<em>Bit String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_STRING_OPERATION_COUNT = SIMPLE_SIZE_CONSTRAINED_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsds.fr.type.model.frtypes.impl.OctetStringImpl <em>Octet String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.fr.type.model.frtypes.impl.OctetStringImpl
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getOctetString()
	 * @generated
	 */
	int OCTET_STRING = 7;

	/**
	 * The feature id for the '<em><b>Single Value Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET_STRING__SINGLE_VALUE_CONSTRAINT = SIMPLE_SIZE_CONSTRAINED_TYPE__SINGLE_VALUE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Size Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET_STRING__SIZE_CONSTRAINT = SIMPLE_SIZE_CONSTRAINED_TYPE__SIZE_CONSTRAINT;

	/**
	 * The number of structural features of the '<em>Octet String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET_STRING_FEATURE_COUNT = SIMPLE_SIZE_CONSTRAINED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Write Asn1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET_STRING___WRITE_ASN1__INT_STRINGBUFFER = SIMPLE_SIZE_CONSTRAINED_TYPE___WRITE_ASN1__INT_STRINGBUFFER;

	/**
	 * The operation id for the '<em>Write Xsd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET_STRING___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER = SIMPLE_SIZE_CONSTRAINED_TYPE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER;

	/**
	 * The number of operations of the '<em>Octet String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET_STRING_OPERATION_COUNT = SIMPLE_SIZE_CONSTRAINED_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsds.fr.type.model.frtypes.impl.RealImpl <em>Real</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.fr.type.model.frtypes.impl.RealImpl
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getReal()
	 * @generated
	 */
	int REAL = 8;

	/**
	 * The feature id for the '<em><b>Single Value Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL__SINGLE_VALUE_CONSTRAINT = SIMPLE_RANGE_TYPE__SINGLE_VALUE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Range Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL__RANGE_CONSTRAINT = SIMPLE_RANGE_TYPE__RANGE_CONSTRAINT;

	/**
	 * The number of structural features of the '<em>Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FEATURE_COUNT = SIMPLE_RANGE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Write Asn1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL___WRITE_ASN1__INT_STRINGBUFFER = SIMPLE_RANGE_TYPE___WRITE_ASN1__INT_STRINGBUFFER;

	/**
	 * The operation id for the '<em>Write Xsd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER = SIMPLE_RANGE_TYPE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER;

	/**
	 * The number of operations of the '<em>Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_OPERATION_COUNT = SIMPLE_RANGE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsds.fr.type.model.frtypes.impl.EnumeratedImpl <em>Enumerated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.fr.type.model.frtypes.impl.EnumeratedImpl
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getEnumerated()
	 * @generated
	 */
	int ENUMERATED = 9;

	/**
	 * The feature id for the '<em><b>Single Value Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED__SINGLE_VALUE_CONSTRAINT = SIMPLE_TYPE__SINGLE_VALUE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED__VALUES = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumerated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Write Asn1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED___WRITE_ASN1__INT_STRINGBUFFER = SIMPLE_TYPE___WRITE_ASN1__INT_STRINGBUFFER;

	/**
	 * The operation id for the '<em>Write Xsd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER = SIMPLE_TYPE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER;

	/**
	 * The number of operations of the '<em>Enumerated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_OPERATION_COUNT = SIMPLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsds.fr.type.model.frtypes.impl.CharacterStringImpl <em>Character String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.fr.type.model.frtypes.impl.CharacterStringImpl
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getCharacterString()
	 * @generated
	 */
	int CHARACTER_STRING = 10;

	/**
	 * The feature id for the '<em><b>Single Value Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_STRING__SINGLE_VALUE_CONSTRAINT = SIMPLE_SIZE_CONSTRAINED_TYPE__SINGLE_VALUE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Size Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_STRING__SIZE_CONSTRAINT = SIMPLE_SIZE_CONSTRAINED_TYPE__SIZE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Permitted Alphabet Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_STRING__PERMITTED_ALPHABET_CONSTRAINT = SIMPLE_SIZE_CONSTRAINED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_STRING__TYPE = SIMPLE_SIZE_CONSTRAINED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Character String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_STRING_FEATURE_COUNT = SIMPLE_SIZE_CONSTRAINED_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Write Asn1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_STRING___WRITE_ASN1__INT_STRINGBUFFER = SIMPLE_SIZE_CONSTRAINED_TYPE___WRITE_ASN1__INT_STRINGBUFFER;

	/**
	 * The operation id for the '<em>Write Xsd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_STRING___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER = SIMPLE_SIZE_CONSTRAINED_TYPE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER;

	/**
	 * The number of operations of the '<em>Character String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_STRING_OPERATION_COUNT = SIMPLE_SIZE_CONSTRAINED_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsds.fr.type.model.frtypes.impl.StructuredDifferentTypeImpl <em>Structured Different Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.fr.type.model.frtypes.impl.StructuredDifferentTypeImpl
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getStructuredDifferentType()
	 * @generated
	 */
	int STRUCTURED_DIFFERENT_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Single Value Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DIFFERENT_TYPE__SINGLE_VALUE_CONSTRAINT = STRUCTURED_TYPE__SINGLE_VALUE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DIFFERENT_TYPE__ELEMENTS = STRUCTURED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Structured Different Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DIFFERENT_TYPE_FEATURE_COUNT = STRUCTURED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Write Asn1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DIFFERENT_TYPE___WRITE_ASN1__INT_STRINGBUFFER = STRUCTURED_TYPE___WRITE_ASN1__INT_STRINGBUFFER;

	/**
	 * The operation id for the '<em>Write Xsd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DIFFERENT_TYPE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER = STRUCTURED_TYPE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER;

	/**
	 * The number of operations of the '<em>Structured Different Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DIFFERENT_TYPE_OPERATION_COUNT = STRUCTURED_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsds.fr.type.model.frtypes.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.fr.type.model.frtypes.impl.SequenceImpl
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 11;

	/**
	 * The feature id for the '<em><b>Single Value Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__SINGLE_VALUE_CONSTRAINT = STRUCTURED_DIFFERENT_TYPE__SINGLE_VALUE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ELEMENTS = STRUCTURED_DIFFERENT_TYPE__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = STRUCTURED_DIFFERENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Write Asn1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE___WRITE_ASN1__INT_STRINGBUFFER = STRUCTURED_DIFFERENT_TYPE___WRITE_ASN1__INT_STRINGBUFFER;

	/**
	 * The operation id for the '<em>Write Xsd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER = STRUCTURED_DIFFERENT_TYPE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER;

	/**
	 * The number of operations of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OPERATION_COUNT = STRUCTURED_DIFFERENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsds.fr.type.model.frtypes.impl.StructuredSizeConstrainedTypeImpl <em>Structured Size Constrained Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.fr.type.model.frtypes.impl.StructuredSizeConstrainedTypeImpl
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getStructuredSizeConstrainedType()
	 * @generated
	 */
	int STRUCTURED_SIZE_CONSTRAINED_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Single Value Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_SIZE_CONSTRAINED_TYPE__SINGLE_VALUE_CONSTRAINT = STRUCTURED_TYPE__SINGLE_VALUE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Size Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_SIZE_CONSTRAINED_TYPE__SIZE_CONSTRAINT = STRUCTURED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_SIZE_CONSTRAINED_TYPE__ELEMENTS = STRUCTURED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Structured Size Constrained Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_SIZE_CONSTRAINED_TYPE_FEATURE_COUNT = STRUCTURED_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Write Asn1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_SIZE_CONSTRAINED_TYPE___WRITE_ASN1__INT_STRINGBUFFER = STRUCTURED_TYPE___WRITE_ASN1__INT_STRINGBUFFER;

	/**
	 * The operation id for the '<em>Write Xsd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_SIZE_CONSTRAINED_TYPE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER = STRUCTURED_TYPE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER;

	/**
	 * The number of operations of the '<em>Structured Size Constrained Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_SIZE_CONSTRAINED_TYPE_OPERATION_COUNT = STRUCTURED_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsds.fr.type.model.frtypes.impl.SequenceOfImpl <em>Sequence Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.fr.type.model.frtypes.impl.SequenceOfImpl
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getSequenceOf()
	 * @generated
	 */
	int SEQUENCE_OF = 12;

	/**
	 * The feature id for the '<em><b>Single Value Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OF__SINGLE_VALUE_CONSTRAINT = STRUCTURED_SIZE_CONSTRAINED_TYPE__SINGLE_VALUE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Size Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OF__SIZE_CONSTRAINT = STRUCTURED_SIZE_CONSTRAINED_TYPE__SIZE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OF__ELEMENTS = STRUCTURED_SIZE_CONSTRAINED_TYPE__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Sequence Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OF_FEATURE_COUNT = STRUCTURED_SIZE_CONSTRAINED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Write Asn1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OF___WRITE_ASN1__INT_STRINGBUFFER = STRUCTURED_SIZE_CONSTRAINED_TYPE___WRITE_ASN1__INT_STRINGBUFFER;

	/**
	 * The operation id for the '<em>Write Xsd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OF___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER = STRUCTURED_SIZE_CONSTRAINED_TYPE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER;

	/**
	 * The number of operations of the '<em>Sequence Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OF_OPERATION_COUNT = STRUCTURED_SIZE_CONSTRAINED_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsds.fr.type.model.frtypes.impl.SetImpl <em>Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.fr.type.model.frtypes.impl.SetImpl
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getSet()
	 * @generated
	 */
	int SET = 13;

	/**
	 * The feature id for the '<em><b>Single Value Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__SINGLE_VALUE_CONSTRAINT = STRUCTURED_DIFFERENT_TYPE__SINGLE_VALUE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__ELEMENTS = STRUCTURED_DIFFERENT_TYPE__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_COUNT = STRUCTURED_DIFFERENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Write Asn1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET___WRITE_ASN1__INT_STRINGBUFFER = STRUCTURED_DIFFERENT_TYPE___WRITE_ASN1__INT_STRINGBUFFER;

	/**
	 * The operation id for the '<em>Write Xsd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER = STRUCTURED_DIFFERENT_TYPE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER;

	/**
	 * The number of operations of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPERATION_COUNT = STRUCTURED_DIFFERENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsds.fr.type.model.frtypes.impl.SetOfImpl <em>Set Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.fr.type.model.frtypes.impl.SetOfImpl
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getSetOf()
	 * @generated
	 */
	int SET_OF = 14;

	/**
	 * The feature id for the '<em><b>Single Value Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OF__SINGLE_VALUE_CONSTRAINT = STRUCTURED_SIZE_CONSTRAINED_TYPE__SINGLE_VALUE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Size Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OF__SIZE_CONSTRAINT = STRUCTURED_SIZE_CONSTRAINED_TYPE__SIZE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OF__ELEMENTS = STRUCTURED_SIZE_CONSTRAINED_TYPE__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Set Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OF_FEATURE_COUNT = STRUCTURED_SIZE_CONSTRAINED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Write Asn1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OF___WRITE_ASN1__INT_STRINGBUFFER = STRUCTURED_SIZE_CONSTRAINED_TYPE___WRITE_ASN1__INT_STRINGBUFFER;

	/**
	 * The operation id for the '<em>Write Xsd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OF___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER = STRUCTURED_SIZE_CONSTRAINED_TYPE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER;

	/**
	 * The number of operations of the '<em>Set Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OF_OPERATION_COUNT = STRUCTURED_SIZE_CONSTRAINED_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsds.fr.type.model.frtypes.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.fr.type.model.frtypes.impl.ConstraintImpl
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 15;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = EXPORT_WRITER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Write Asn1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___WRITE_ASN1__INT_STRINGBUFFER = EXPORT_WRITER___WRITE_ASN1__INT_STRINGBUFFER;

	/**
	 * The operation id for the '<em>Write Xsd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER = EXPORT_WRITER___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = EXPORT_WRITER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsds.fr.type.model.frtypes.impl.SizeConstraintImpl <em>Size Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.fr.type.model.frtypes.impl.SizeConstraintImpl
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getSizeConstraint()
	 * @generated
	 */
	int SIZE_CONSTRAINT = 16;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_CONSTRAINT__MIN = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_CONSTRAINT__MAX = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Size Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Write Asn1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_CONSTRAINT___WRITE_ASN1__INT_STRINGBUFFER = CONSTRAINT___WRITE_ASN1__INT_STRINGBUFFER;

	/**
	 * The operation id for the '<em>Write Xsd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_CONSTRAINT___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER = CONSTRAINT___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER;

	/**
	 * The number of operations of the '<em>Size Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsds.fr.type.model.frtypes.impl.ValueRangeConstraintImpl <em>Value Range Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.fr.type.model.frtypes.impl.ValueRangeConstraintImpl
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getValueRangeConstraint()
	 * @generated
	 */
	int VALUE_RANGE_CONSTRAINT = 17;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_CONSTRAINT__MIN = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_CONSTRAINT__MAX = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Value Range Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Write Asn1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_CONSTRAINT___WRITE_ASN1__INT_STRINGBUFFER = CONSTRAINT___WRITE_ASN1__INT_STRINGBUFFER;

	/**
	 * The operation id for the '<em>Write Xsd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_CONSTRAINT___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER = CONSTRAINT___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER;

	/**
	 * The number of operations of the '<em>Value Range Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsds.fr.type.model.frtypes.impl.NamedValueImpl <em>Named Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.fr.type.model.frtypes.impl.NamedValueImpl
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getNamedValue()
	 * @generated
	 */
	int NAMED_VALUE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_VALUE__NAME = EXPORT_WRITER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_VALUE__VALUE = EXPORT_WRITER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Named Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_VALUE_FEATURE_COUNT = EXPORT_WRITER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Write Asn1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_VALUE___WRITE_ASN1__INT_STRINGBUFFER = EXPORT_WRITER___WRITE_ASN1__INT_STRINGBUFFER;

	/**
	 * The operation id for the '<em>Write Xsd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_VALUE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER = EXPORT_WRITER___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER;

	/**
	 * The number of operations of the '<em>Named Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_VALUE_OPERATION_COUNT = EXPORT_WRITER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsds.fr.type.model.frtypes.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.fr.type.model.frtypes.impl.ChoiceImpl
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 22;

	/**
	 * The feature id for the '<em><b>Single Value Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__SINGLE_VALUE_CONSTRAINT = STRUCTURED_DIFFERENT_TYPE__SINGLE_VALUE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__ELEMENTS = STRUCTURED_DIFFERENT_TYPE__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = STRUCTURED_DIFFERENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Write Asn1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE___WRITE_ASN1__INT_STRINGBUFFER = STRUCTURED_DIFFERENT_TYPE___WRITE_ASN1__INT_STRINGBUFFER;

	/**
	 * The operation id for the '<em>Write Xsd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER = STRUCTURED_DIFFERENT_TYPE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER;

	/**
	 * The number of operations of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_OPERATION_COUNT = STRUCTURED_DIFFERENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsds.fr.type.model.frtypes.impl.TypeReferenceLocalImpl <em>Type Reference Local</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.fr.type.model.frtypes.impl.TypeReferenceLocalImpl
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getTypeReferenceLocal()
	 * @generated
	 */
	int TYPE_REFERENCE_LOCAL = 23;

	/**
	 * The feature id for the '<em><b>Single Value Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_LOCAL__SINGLE_VALUE_CONSTRAINT = TYPE__SINGLE_VALUE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_LOCAL__TYPE_DEFINITION = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Reference Local</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_LOCAL_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Write Asn1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_LOCAL___WRITE_ASN1__INT_STRINGBUFFER = TYPE___WRITE_ASN1__INT_STRINGBUFFER;

	/**
	 * The operation id for the '<em>Write Xsd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_LOCAL___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER = TYPE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER;

	/**
	 * The number of operations of the '<em>Type Reference Local</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_LOCAL_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsds.fr.type.model.frtypes.impl.SingleValueConstraintImpl <em>Single Value Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.fr.type.model.frtypes.impl.SingleValueConstraintImpl
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getSingleValueConstraint()
	 * @generated
	 */
	int SINGLE_VALUE_CONSTRAINT = 24;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUE_CONSTRAINT__VALUES = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Single Value Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Write Asn1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUE_CONSTRAINT___WRITE_ASN1__INT_STRINGBUFFER = CONSTRAINT___WRITE_ASN1__INT_STRINGBUFFER;

	/**
	 * The operation id for the '<em>Write Xsd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUE_CONSTRAINT___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER = CONSTRAINT___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER;

	/**
	 * The number of operations of the '<em>Single Value Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUE_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsds.fr.type.model.frtypes.impl.PermittedAlphabetConstraintImpl <em>Permitted Alphabet Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.fr.type.model.frtypes.impl.PermittedAlphabetConstraintImpl
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getPermittedAlphabetConstraint()
	 * @generated
	 */
	int PERMITTED_ALPHABET_CONSTRAINT = 25;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMITTED_ALPHABET_CONSTRAINT__VALUES = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMITTED_ALPHABET_CONSTRAINT__TYPE = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Permitted Alphabet Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMITTED_ALPHABET_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Write Asn1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMITTED_ALPHABET_CONSTRAINT___WRITE_ASN1__INT_STRINGBUFFER = CONSTRAINT___WRITE_ASN1__INT_STRINGBUFFER;

	/**
	 * The operation id for the '<em>Write Xsd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMITTED_ALPHABET_CONSTRAINT___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER = CONSTRAINT___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER;

	/**
	 * The number of operations of the '<em>Permitted Alphabet Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMITTED_ALPHABET_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsds.fr.type.model.frtypes.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.fr.type.model.frtypes.impl.ModuleImpl
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 26;

	/**
	 * The feature id for the '<em><b>Type Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__TYPE_DEFINITION = EXPORT_WRITER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__OID = EXPORT_WRITER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__EXPORTS = EXPORT_WRITER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = EXPORT_WRITER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__IMPORTS = EXPORT_WRITER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = EXPORT_WRITER_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Write Asn1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE___WRITE_ASN1__INT_STRINGBUFFER = EXPORT_WRITER___WRITE_ASN1__INT_STRINGBUFFER;

	/**
	 * The operation id for the '<em>Write Xsd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER = EXPORT_WRITER___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = EXPORT_WRITER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsds.fr.type.model.frtypes.impl.ObjectIdentifierImpl <em>Object Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.fr.type.model.frtypes.impl.ObjectIdentifierImpl
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getObjectIdentifier()
	 * @generated
	 */
	int OBJECT_IDENTIFIER = 27;

	/**
	 * The feature id for the '<em><b>Single Value Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_IDENTIFIER__SINGLE_VALUE_CONSTRAINT = SIMPLE_TYPE__SINGLE_VALUE_CONSTRAINT;

	/**
	 * The number of structural features of the '<em>Object Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_IDENTIFIER_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Write Asn1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_IDENTIFIER___WRITE_ASN1__INT_STRINGBUFFER = SIMPLE_TYPE___WRITE_ASN1__INT_STRINGBUFFER;

	/**
	 * The operation id for the '<em>Write Xsd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_IDENTIFIER___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER = SIMPLE_TYPE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER;

	/**
	 * The number of operations of the '<em>Object Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_IDENTIFIER_OPERATION_COUNT = SIMPLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsds.fr.type.model.frtypes.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.fr.type.model.frtypes.impl.ElementImpl
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 28;

	/**
	 * The feature id for the '<em><b>Single Value Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__SINGLE_VALUE_CONSTRAINT = TYPE__SINGLE_VALUE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TYPE = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TAG = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__OPTIONAL = TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__COMMENT = TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = TYPE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Write Asn1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___WRITE_ASN1__INT_STRINGBUFFER = TYPE___WRITE_ASN1__INT_STRINGBUFFER;

	/**
	 * The operation id for the '<em>Write Xsd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER = TYPE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsds.fr.type.model.frtypes.impl.TypeReferenceExternalImpl <em>Type Reference External</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.fr.type.model.frtypes.impl.TypeReferenceExternalImpl
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getTypeReferenceExternal()
	 * @generated
	 */
	int TYPE_REFERENCE_EXTERNAL = 29;

	/**
	 * The feature id for the '<em><b>Single Value Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_EXTERNAL__SINGLE_VALUE_CONSTRAINT = TYPE__SINGLE_VALUE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_EXTERNAL__NAME = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Complex Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_EXTERNAL__COMPLEX_TYPE = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Reference External</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_EXTERNAL_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Write Asn1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_EXTERNAL___WRITE_ASN1__INT_STRINGBUFFER = TYPE___WRITE_ASN1__INT_STRINGBUFFER;

	/**
	 * The operation id for the '<em>Write Xsd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_EXTERNAL___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER = TYPE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER;

	/**
	 * The number of operations of the '<em>Type Reference External</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_EXTERNAL_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsds.fr.type.model.frtypes.impl.NullImpl <em>Null</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.fr.type.model.frtypes.impl.NullImpl
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getNull()
	 * @generated
	 */
	int NULL = 30;

	/**
	 * The feature id for the '<em><b>Single Value Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL__SINGLE_VALUE_CONSTRAINT = SIMPLE_TYPE__SINGLE_VALUE_CONSTRAINT;

	/**
	 * The number of structural features of the '<em>Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Write Asn1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL___WRITE_ASN1__INT_STRINGBUFFER = SIMPLE_TYPE___WRITE_ASN1__INT_STRINGBUFFER;

	/**
	 * The operation id for the '<em>Write Xsd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER = SIMPLE_TYPE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER;

	/**
	 * The number of operations of the '<em>Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_OPERATION_COUNT = SIMPLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsds.fr.type.model.frtypes.SizeConstrainedType <em>Size Constrained Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.fr.type.model.frtypes.SizeConstrainedType
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getSizeConstrainedType()
	 * @generated
	 */
	int SIZE_CONSTRAINED_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Size Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_CONSTRAINED_TYPE__SIZE_CONSTRAINT = EXPORT_WRITER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Size Constrained Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_CONSTRAINED_TYPE_FEATURE_COUNT = EXPORT_WRITER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Write Asn1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_CONSTRAINED_TYPE___WRITE_ASN1__INT_STRINGBUFFER = EXPORT_WRITER___WRITE_ASN1__INT_STRINGBUFFER;

	/**
	 * The operation id for the '<em>Write Xsd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_CONSTRAINED_TYPE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER = EXPORT_WRITER___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER;

	/**
	 * The number of operations of the '<em>Size Constrained Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_CONSTRAINED_TYPE_OPERATION_COUNT = EXPORT_WRITER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsds.fr.type.model.frtypes.impl.FromModuleImpl <em>From Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.fr.type.model.frtypes.impl.FromModuleImpl
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getFromModule()
	 * @generated
	 */
	int FROM_MODULE = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_MODULE__NAME = EXPORT_WRITER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imported Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_MODULE__IMPORTED_TYPES = EXPORT_WRITER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>From Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_MODULE_FEATURE_COUNT = EXPORT_WRITER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Write Asn1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_MODULE___WRITE_ASN1__INT_STRINGBUFFER = EXPORT_WRITER___WRITE_ASN1__INT_STRINGBUFFER;

	/**
	 * The operation id for the '<em>Write Xsd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_MODULE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER = EXPORT_WRITER___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER;

	/**
	 * The number of operations of the '<em>From Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_MODULE_OPERATION_COUNT = EXPORT_WRITER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsds.fr.type.model.frtypes.StringType <em>String Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.fr.type.model.frtypes.StringType
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getStringType()
	 * @generated
	 */
	int STRING_TYPE = 35;

	/**
	 * The meta object id for the '{@link ccsds.fr.type.model.frtypes.ConstraintType <em>Constraint Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsds.fr.type.model.frtypes.ConstraintType
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getConstraintType()
	 * @generated
	 */
	int CONSTRAINT_TYPE = 36;

	/**
	 * The meta object id for the '<em>String Buffer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.StringBuffer
	 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getStringBuffer()
	 * @generated
	 */
	int STRING_BUFFER = 37;

	/**
	 * Returns the meta object for class '{@link ccsds.fr.type.model.frtypes.TypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Definition</em>'.
	 * @see ccsds.fr.type.model.frtypes.TypeDefinition
	 * @generated
	 */
	EClass getTypeDefinition();

	/**
	 * Returns the meta object for the attribute '{@link ccsds.fr.type.model.frtypes.TypeDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ccsds.fr.type.model.frtypes.TypeDefinition#getName()
	 * @see #getTypeDefinition()
	 * @generated
	 */
	EAttribute getTypeDefinition_Name();

	/**
	 * Returns the meta object for the containment reference '{@link ccsds.fr.type.model.frtypes.TypeDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see ccsds.fr.type.model.frtypes.TypeDefinition#getType()
	 * @see #getTypeDefinition()
	 * @generated
	 */
	EReference getTypeDefinition_Type();

	/**
	 * Returns the meta object for the attribute '{@link ccsds.fr.type.model.frtypes.TypeDefinition#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see ccsds.fr.type.model.frtypes.TypeDefinition#getComment()
	 * @see #getTypeDefinition()
	 * @generated
	 */
	EAttribute getTypeDefinition_Comment();

	/**
	 * Returns the meta object for class '{@link ccsds.fr.type.model.frtypes.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see ccsds.fr.type.model.frtypes.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the containment reference '{@link ccsds.fr.type.model.frtypes.Type#getSingleValueConstraint <em>Single Value Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Single Value Constraint</em>'.
	 * @see ccsds.fr.type.model.frtypes.Type#getSingleValueConstraint()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_SingleValueConstraint();

	/**
	 * Returns the meta object for class '{@link ccsds.fr.type.model.frtypes.SimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Type</em>'.
	 * @see ccsds.fr.type.model.frtypes.SimpleType
	 * @generated
	 */
	EClass getSimpleType();

	/**
	 * Returns the meta object for class '{@link ccsds.fr.type.model.frtypes.StructuredType <em>Structured Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Type</em>'.
	 * @see ccsds.fr.type.model.frtypes.StructuredType
	 * @generated
	 */
	EClass getStructuredType();

	/**
	 * Returns the meta object for class '{@link ccsds.fr.type.model.frtypes.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see ccsds.fr.type.model.frtypes.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for class '{@link ccsds.fr.type.model.frtypes.IntegerType <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Type</em>'.
	 * @see ccsds.fr.type.model.frtypes.IntegerType
	 * @generated
	 */
	EClass getIntegerType();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsds.fr.type.model.frtypes.IntegerType#getNamedValues <em>Named Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Named Values</em>'.
	 * @see ccsds.fr.type.model.frtypes.IntegerType#getNamedValues()
	 * @see #getIntegerType()
	 * @generated
	 */
	EReference getIntegerType_NamedValues();

	/**
	 * Returns the meta object for class '{@link ccsds.fr.type.model.frtypes.BitString <em>Bit String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit String</em>'.
	 * @see ccsds.fr.type.model.frtypes.BitString
	 * @generated
	 */
	EClass getBitString();

	/**
	 * Returns the meta object for class '{@link ccsds.fr.type.model.frtypes.OctetString <em>Octet String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Octet String</em>'.
	 * @see ccsds.fr.type.model.frtypes.OctetString
	 * @generated
	 */
	EClass getOctetString();

	/**
	 * Returns the meta object for class '{@link ccsds.fr.type.model.frtypes.Real <em>Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real</em>'.
	 * @see ccsds.fr.type.model.frtypes.Real
	 * @generated
	 */
	EClass getReal();

	/**
	 * Returns the meta object for class '{@link ccsds.fr.type.model.frtypes.Enumerated <em>Enumerated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumerated</em>'.
	 * @see ccsds.fr.type.model.frtypes.Enumerated
	 * @generated
	 */
	EClass getEnumerated();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsds.fr.type.model.frtypes.Enumerated#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see ccsds.fr.type.model.frtypes.Enumerated#getValues()
	 * @see #getEnumerated()
	 * @generated
	 */
	EReference getEnumerated_Values();

	/**
	 * Returns the meta object for class '{@link ccsds.fr.type.model.frtypes.CharacterString <em>Character String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character String</em>'.
	 * @see ccsds.fr.type.model.frtypes.CharacterString
	 * @generated
	 */
	EClass getCharacterString();

	/**
	 * Returns the meta object for the containment reference '{@link ccsds.fr.type.model.frtypes.CharacterString#getPermittedAlphabetConstraint <em>Permitted Alphabet Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Permitted Alphabet Constraint</em>'.
	 * @see ccsds.fr.type.model.frtypes.CharacterString#getPermittedAlphabetConstraint()
	 * @see #getCharacterString()
	 * @generated
	 */
	EReference getCharacterString_PermittedAlphabetConstraint();

	/**
	 * Returns the meta object for the attribute '{@link ccsds.fr.type.model.frtypes.CharacterString#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ccsds.fr.type.model.frtypes.CharacterString#getType()
	 * @see #getCharacterString()
	 * @generated
	 */
	EAttribute getCharacterString_Type();

	/**
	 * Returns the meta object for class '{@link ccsds.fr.type.model.frtypes.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see ccsds.fr.type.model.frtypes.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for class '{@link ccsds.fr.type.model.frtypes.SequenceOf <em>Sequence Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Of</em>'.
	 * @see ccsds.fr.type.model.frtypes.SequenceOf
	 * @generated
	 */
	EClass getSequenceOf();

	/**
	 * Returns the meta object for class '{@link ccsds.fr.type.model.frtypes.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set</em>'.
	 * @see ccsds.fr.type.model.frtypes.Set
	 * @generated
	 */
	EClass getSet();

	/**
	 * Returns the meta object for class '{@link ccsds.fr.type.model.frtypes.SetOf <em>Set Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Of</em>'.
	 * @see ccsds.fr.type.model.frtypes.SetOf
	 * @generated
	 */
	EClass getSetOf();

	/**
	 * Returns the meta object for class '{@link ccsds.fr.type.model.frtypes.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see ccsds.fr.type.model.frtypes.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link ccsds.fr.type.model.frtypes.SizeConstraint <em>Size Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Size Constraint</em>'.
	 * @see ccsds.fr.type.model.frtypes.SizeConstraint
	 * @generated
	 */
	EClass getSizeConstraint();

	/**
	 * Returns the meta object for the attribute '{@link ccsds.fr.type.model.frtypes.SizeConstraint#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see ccsds.fr.type.model.frtypes.SizeConstraint#getMin()
	 * @see #getSizeConstraint()
	 * @generated
	 */
	EAttribute getSizeConstraint_Min();

	/**
	 * Returns the meta object for the attribute '{@link ccsds.fr.type.model.frtypes.SizeConstraint#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see ccsds.fr.type.model.frtypes.SizeConstraint#getMax()
	 * @see #getSizeConstraint()
	 * @generated
	 */
	EAttribute getSizeConstraint_Max();

	/**
	 * Returns the meta object for class '{@link ccsds.fr.type.model.frtypes.ValueRangeConstraint <em>Value Range Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Range Constraint</em>'.
	 * @see ccsds.fr.type.model.frtypes.ValueRangeConstraint
	 * @generated
	 */
	EClass getValueRangeConstraint();

	/**
	 * Returns the meta object for the attribute '{@link ccsds.fr.type.model.frtypes.ValueRangeConstraint#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see ccsds.fr.type.model.frtypes.ValueRangeConstraint#getMin()
	 * @see #getValueRangeConstraint()
	 * @generated
	 */
	EAttribute getValueRangeConstraint_Min();

	/**
	 * Returns the meta object for the attribute '{@link ccsds.fr.type.model.frtypes.ValueRangeConstraint#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see ccsds.fr.type.model.frtypes.ValueRangeConstraint#getMax()
	 * @see #getValueRangeConstraint()
	 * @generated
	 */
	EAttribute getValueRangeConstraint_Max();

	/**
	 * Returns the meta object for class '{@link ccsds.fr.type.model.frtypes.SimpleRangeType <em>Simple Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Range Type</em>'.
	 * @see ccsds.fr.type.model.frtypes.SimpleRangeType
	 * @generated
	 */
	EClass getSimpleRangeType();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsds.fr.type.model.frtypes.SimpleRangeType#getRangeConstraint <em>Range Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Range Constraint</em>'.
	 * @see ccsds.fr.type.model.frtypes.SimpleRangeType#getRangeConstraint()
	 * @see #getSimpleRangeType()
	 * @generated
	 */
	EReference getSimpleRangeType_RangeConstraint();

	/**
	 * Returns the meta object for class '{@link ccsds.fr.type.model.frtypes.SimpleSizeConstrainedType <em>Simple Size Constrained Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Size Constrained Type</em>'.
	 * @see ccsds.fr.type.model.frtypes.SimpleSizeConstrainedType
	 * @generated
	 */
	EClass getSimpleSizeConstrainedType();

	/**
	 * Returns the meta object for class '{@link ccsds.fr.type.model.frtypes.NamedValue <em>Named Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Value</em>'.
	 * @see ccsds.fr.type.model.frtypes.NamedValue
	 * @generated
	 */
	EClass getNamedValue();

	/**
	 * Returns the meta object for the attribute '{@link ccsds.fr.type.model.frtypes.NamedValue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ccsds.fr.type.model.frtypes.NamedValue#getName()
	 * @see #getNamedValue()
	 * @generated
	 */
	EAttribute getNamedValue_Name();

	/**
	 * Returns the meta object for the attribute '{@link ccsds.fr.type.model.frtypes.NamedValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ccsds.fr.type.model.frtypes.NamedValue#getValue()
	 * @see #getNamedValue()
	 * @generated
	 */
	EAttribute getNamedValue_Value();

	/**
	 * Returns the meta object for class '{@link ccsds.fr.type.model.frtypes.StructuredSizeConstrainedType <em>Structured Size Constrained Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Size Constrained Type</em>'.
	 * @see ccsds.fr.type.model.frtypes.StructuredSizeConstrainedType
	 * @generated
	 */
	EClass getStructuredSizeConstrainedType();

	/**
	 * Returns the meta object for the containment reference '{@link ccsds.fr.type.model.frtypes.StructuredSizeConstrainedType#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elements</em>'.
	 * @see ccsds.fr.type.model.frtypes.StructuredSizeConstrainedType#getElements()
	 * @see #getStructuredSizeConstrainedType()
	 * @generated
	 */
	EReference getStructuredSizeConstrainedType_Elements();

	/**
	 * Returns the meta object for class '{@link ccsds.fr.type.model.frtypes.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see ccsds.fr.type.model.frtypes.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for class '{@link ccsds.fr.type.model.frtypes.TypeReferenceLocal <em>Type Reference Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Reference Local</em>'.
	 * @see ccsds.fr.type.model.frtypes.TypeReferenceLocal
	 * @generated
	 */
	EClass getTypeReferenceLocal();

	/**
	 * Returns the meta object for the reference '{@link ccsds.fr.type.model.frtypes.TypeReferenceLocal#getTypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Definition</em>'.
	 * @see ccsds.fr.type.model.frtypes.TypeReferenceLocal#getTypeDefinition()
	 * @see #getTypeReferenceLocal()
	 * @generated
	 */
	EReference getTypeReferenceLocal_TypeDefinition();

	/**
	 * Returns the meta object for class '{@link ccsds.fr.type.model.frtypes.SingleValueConstraint <em>Single Value Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Value Constraint</em>'.
	 * @see ccsds.fr.type.model.frtypes.SingleValueConstraint
	 * @generated
	 */
	EClass getSingleValueConstraint();

	/**
	 * Returns the meta object for the attribute list '{@link ccsds.fr.type.model.frtypes.SingleValueConstraint#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see ccsds.fr.type.model.frtypes.SingleValueConstraint#getValues()
	 * @see #getSingleValueConstraint()
	 * @generated
	 */
	EAttribute getSingleValueConstraint_Values();

	/**
	 * Returns the meta object for class '{@link ccsds.fr.type.model.frtypes.PermittedAlphabetConstraint <em>Permitted Alphabet Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permitted Alphabet Constraint</em>'.
	 * @see ccsds.fr.type.model.frtypes.PermittedAlphabetConstraint
	 * @generated
	 */
	EClass getPermittedAlphabetConstraint();

	/**
	 * Returns the meta object for the attribute list '{@link ccsds.fr.type.model.frtypes.PermittedAlphabetConstraint#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see ccsds.fr.type.model.frtypes.PermittedAlphabetConstraint#getValues()
	 * @see #getPermittedAlphabetConstraint()
	 * @generated
	 */
	EAttribute getPermittedAlphabetConstraint_Values();

	/**
	 * Returns the meta object for the attribute '{@link ccsds.fr.type.model.frtypes.PermittedAlphabetConstraint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ccsds.fr.type.model.frtypes.PermittedAlphabetConstraint#getType()
	 * @see #getPermittedAlphabetConstraint()
	 * @generated
	 */
	EAttribute getPermittedAlphabetConstraint_Type();

	/**
	 * Returns the meta object for class '{@link ccsds.fr.type.model.frtypes.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see ccsds.fr.type.model.frtypes.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsds.fr.type.model.frtypes.Module#getTypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Definition</em>'.
	 * @see ccsds.fr.type.model.frtypes.Module#getTypeDefinition()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_TypeDefinition();

	/**
	 * Returns the meta object for the attribute '{@link ccsds.fr.type.model.frtypes.Module#getOid <em>Oid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oid</em>'.
	 * @see ccsds.fr.type.model.frtypes.Module#getOid()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Oid();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsds.fr.type.model.frtypes.Module#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see ccsds.fr.type.model.frtypes.Module#getImports()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Imports();

	/**
	 * Returns the meta object for the attribute list '{@link ccsds.fr.type.model.frtypes.Module#getExports <em>Exports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Exports</em>'.
	 * @see ccsds.fr.type.model.frtypes.Module#getExports()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Exports();

	/**
	 * Returns the meta object for the attribute '{@link ccsds.fr.type.model.frtypes.Module#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ccsds.fr.type.model.frtypes.Module#getName()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Name();

	/**
	 * Returns the meta object for class '{@link ccsds.fr.type.model.frtypes.ObjectIdentifier <em>Object Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Identifier</em>'.
	 * @see ccsds.fr.type.model.frtypes.ObjectIdentifier
	 * @generated
	 */
	EClass getObjectIdentifier();

	/**
	 * Returns the meta object for class '{@link ccsds.fr.type.model.frtypes.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see ccsds.fr.type.model.frtypes.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link ccsds.fr.type.model.frtypes.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ccsds.fr.type.model.frtypes.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the containment reference '{@link ccsds.fr.type.model.frtypes.Element#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see ccsds.fr.type.model.frtypes.Element#getType()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Type();

	/**
	 * Returns the meta object for the attribute '{@link ccsds.fr.type.model.frtypes.Element#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see ccsds.fr.type.model.frtypes.Element#getTag()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Tag();

	/**
	 * Returns the meta object for the attribute '{@link ccsds.fr.type.model.frtypes.Element#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see ccsds.fr.type.model.frtypes.Element#isOptional()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Optional();

	/**
	 * Returns the meta object for the attribute '{@link ccsds.fr.type.model.frtypes.Element#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see ccsds.fr.type.model.frtypes.Element#getComment()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Comment();

	/**
	 * Returns the meta object for class '{@link ccsds.fr.type.model.frtypes.TypeReferenceExternal <em>Type Reference External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Reference External</em>'.
	 * @see ccsds.fr.type.model.frtypes.TypeReferenceExternal
	 * @generated
	 */
	EClass getTypeReferenceExternal();

	/**
	 * Returns the meta object for the attribute '{@link ccsds.fr.type.model.frtypes.TypeReferenceExternal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ccsds.fr.type.model.frtypes.TypeReferenceExternal#getName()
	 * @see #getTypeReferenceExternal()
	 * @generated
	 */
	EAttribute getTypeReferenceExternal_Name();

	/**
	 * Returns the meta object for the attribute '{@link ccsds.fr.type.model.frtypes.TypeReferenceExternal#isComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complex Type</em>'.
	 * @see ccsds.fr.type.model.frtypes.TypeReferenceExternal#isComplexType()
	 * @see #getTypeReferenceExternal()
	 * @generated
	 */
	EAttribute getTypeReferenceExternal_ComplexType();

	/**
	 * Returns the meta object for class '{@link ccsds.fr.type.model.frtypes.Null <em>Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null</em>'.
	 * @see ccsds.fr.type.model.frtypes.Null
	 * @generated
	 */
	EClass getNull();

	/**
	 * Returns the meta object for class '{@link ccsds.fr.type.model.frtypes.ExportWriter <em>Export Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Export Writer</em>'.
	 * @see ccsds.fr.type.model.frtypes.ExportWriter
	 * @generated
	 */
	EClass getExportWriter();

	/**
	 * Returns the meta object for the '{@link ccsds.fr.type.model.frtypes.ExportWriter#writeAsn1(int, java.lang.StringBuffer) <em>Write Asn1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Write Asn1</em>' operation.
	 * @see ccsds.fr.type.model.frtypes.ExportWriter#writeAsn1(int, java.lang.StringBuffer)
	 * @generated
	 */
	EOperation getExportWriter__WriteAsn1__int_StringBuffer();

	/**
	 * Returns the meta object for the '{@link ccsds.fr.type.model.frtypes.ExportWriter#writeXsd(int, java.lang.StringBuffer, ccsds.fr.type.model.frtypes.ObjectIdentifier) <em>Write Xsd</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Write Xsd</em>' operation.
	 * @see ccsds.fr.type.model.frtypes.ExportWriter#writeXsd(int, java.lang.StringBuffer, ccsds.fr.type.model.frtypes.ObjectIdentifier)
	 * @generated
	 */
	EOperation getExportWriter__WriteXsd__int_StringBuffer_ObjectIdentifier();

	/**
	 * Returns the meta object for class '{@link ccsds.fr.type.model.frtypes.SizeConstrainedType <em>Size Constrained Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Size Constrained Type</em>'.
	 * @see ccsds.fr.type.model.frtypes.SizeConstrainedType
	 * @generated
	 */
	EClass getSizeConstrainedType();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsds.fr.type.model.frtypes.SizeConstrainedType#getSizeConstraint <em>Size Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Size Constraint</em>'.
	 * @see ccsds.fr.type.model.frtypes.SizeConstrainedType#getSizeConstraint()
	 * @see #getSizeConstrainedType()
	 * @generated
	 */
	EReference getSizeConstrainedType_SizeConstraint();

	/**
	 * Returns the meta object for class '{@link ccsds.fr.type.model.frtypes.StructuredDifferentType <em>Structured Different Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Different Type</em>'.
	 * @see ccsds.fr.type.model.frtypes.StructuredDifferentType
	 * @generated
	 */
	EClass getStructuredDifferentType();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsds.fr.type.model.frtypes.StructuredDifferentType#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see ccsds.fr.type.model.frtypes.StructuredDifferentType#getElements()
	 * @see #getStructuredDifferentType()
	 * @generated
	 */
	EReference getStructuredDifferentType_Elements();

	/**
	 * Returns the meta object for class '{@link ccsds.fr.type.model.frtypes.FromModule <em>From Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From Module</em>'.
	 * @see ccsds.fr.type.model.frtypes.FromModule
	 * @generated
	 */
	EClass getFromModule();

	/**
	 * Returns the meta object for the attribute '{@link ccsds.fr.type.model.frtypes.FromModule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ccsds.fr.type.model.frtypes.FromModule#getName()
	 * @see #getFromModule()
	 * @generated
	 */
	EAttribute getFromModule_Name();

	/**
	 * Returns the meta object for the attribute list '{@link ccsds.fr.type.model.frtypes.FromModule#getImportedTypes <em>Imported Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Imported Types</em>'.
	 * @see ccsds.fr.type.model.frtypes.FromModule#getImportedTypes()
	 * @see #getFromModule()
	 * @generated
	 */
	EAttribute getFromModule_ImportedTypes();

	/**
	 * Returns the meta object for enum '{@link ccsds.fr.type.model.frtypes.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>String Type</em>'.
	 * @see ccsds.fr.type.model.frtypes.StringType
	 * @generated
	 */
	EEnum getStringType();

	/**
	 * Returns the meta object for enum '{@link ccsds.fr.type.model.frtypes.ConstraintType <em>Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Constraint Type</em>'.
	 * @see ccsds.fr.type.model.frtypes.ConstraintType
	 * @generated
	 */
	EEnum getConstraintType();

	/**
	 * Returns the meta object for data type '{@link java.lang.StringBuffer <em>String Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String Buffer</em>'.
	 * @see java.lang.StringBuffer
	 * @model instanceClass="java.lang.StringBuffer"
	 * @generated
	 */
	EDataType getStringBuffer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FrtypesFactory getFrtypesFactory();

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
		 * The meta object literal for the '{@link ccsds.fr.type.model.frtypes.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.fr.type.model.frtypes.impl.TypeDefinitionImpl
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getTypeDefinition()
		 * @generated
		 */
		EClass TYPE_DEFINITION = eINSTANCE.getTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DEFINITION__NAME = eINSTANCE.getTypeDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DEFINITION__TYPE = eINSTANCE.getTypeDefinition_Type();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DEFINITION__COMMENT = eINSTANCE.getTypeDefinition_Comment();

		/**
		 * The meta object literal for the '{@link ccsds.fr.type.model.frtypes.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.fr.type.model.frtypes.impl.TypeImpl
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Single Value Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__SINGLE_VALUE_CONSTRAINT = eINSTANCE.getType_SingleValueConstraint();

		/**
		 * The meta object literal for the '{@link ccsds.fr.type.model.frtypes.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.fr.type.model.frtypes.impl.SimpleTypeImpl
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getSimpleType()
		 * @generated
		 */
		EClass SIMPLE_TYPE = eINSTANCE.getSimpleType();

		/**
		 * The meta object literal for the '{@link ccsds.fr.type.model.frtypes.impl.StructuredTypeImpl <em>Structured Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.fr.type.model.frtypes.impl.StructuredTypeImpl
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getStructuredType()
		 * @generated
		 */
		EClass STRUCTURED_TYPE = eINSTANCE.getStructuredType();

		/**
		 * The meta object literal for the '{@link ccsds.fr.type.model.frtypes.impl.BooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.fr.type.model.frtypes.impl.BooleanImpl
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '{@link ccsds.fr.type.model.frtypes.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.fr.type.model.frtypes.impl.IntegerTypeImpl
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getIntegerType()
		 * @generated
		 */
		EClass INTEGER_TYPE = eINSTANCE.getIntegerType();

		/**
		 * The meta object literal for the '<em><b>Named Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_TYPE__NAMED_VALUES = eINSTANCE.getIntegerType_NamedValues();

		/**
		 * The meta object literal for the '{@link ccsds.fr.type.model.frtypes.impl.BitStringImpl <em>Bit String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.fr.type.model.frtypes.impl.BitStringImpl
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getBitString()
		 * @generated
		 */
		EClass BIT_STRING = eINSTANCE.getBitString();

		/**
		 * The meta object literal for the '{@link ccsds.fr.type.model.frtypes.impl.OctetStringImpl <em>Octet String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.fr.type.model.frtypes.impl.OctetStringImpl
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getOctetString()
		 * @generated
		 */
		EClass OCTET_STRING = eINSTANCE.getOctetString();

		/**
		 * The meta object literal for the '{@link ccsds.fr.type.model.frtypes.impl.RealImpl <em>Real</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.fr.type.model.frtypes.impl.RealImpl
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getReal()
		 * @generated
		 */
		EClass REAL = eINSTANCE.getReal();

		/**
		 * The meta object literal for the '{@link ccsds.fr.type.model.frtypes.impl.EnumeratedImpl <em>Enumerated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.fr.type.model.frtypes.impl.EnumeratedImpl
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getEnumerated()
		 * @generated
		 */
		EClass ENUMERATED = eINSTANCE.getEnumerated();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATED__VALUES = eINSTANCE.getEnumerated_Values();

		/**
		 * The meta object literal for the '{@link ccsds.fr.type.model.frtypes.impl.CharacterStringImpl <em>Character String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.fr.type.model.frtypes.impl.CharacterStringImpl
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getCharacterString()
		 * @generated
		 */
		EClass CHARACTER_STRING = eINSTANCE.getCharacterString();

		/**
		 * The meta object literal for the '<em><b>Permitted Alphabet Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTER_STRING__PERMITTED_ALPHABET_CONSTRAINT = eINSTANCE
				.getCharacterString_PermittedAlphabetConstraint();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_STRING__TYPE = eINSTANCE.getCharacterString_Type();

		/**
		 * The meta object literal for the '{@link ccsds.fr.type.model.frtypes.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.fr.type.model.frtypes.impl.SequenceImpl
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '{@link ccsds.fr.type.model.frtypes.impl.SequenceOfImpl <em>Sequence Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.fr.type.model.frtypes.impl.SequenceOfImpl
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getSequenceOf()
		 * @generated
		 */
		EClass SEQUENCE_OF = eINSTANCE.getSequenceOf();

		/**
		 * The meta object literal for the '{@link ccsds.fr.type.model.frtypes.impl.SetImpl <em>Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.fr.type.model.frtypes.impl.SetImpl
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getSet()
		 * @generated
		 */
		EClass SET = eINSTANCE.getSet();

		/**
		 * The meta object literal for the '{@link ccsds.fr.type.model.frtypes.impl.SetOfImpl <em>Set Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.fr.type.model.frtypes.impl.SetOfImpl
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getSetOf()
		 * @generated
		 */
		EClass SET_OF = eINSTANCE.getSetOf();

		/**
		 * The meta object literal for the '{@link ccsds.fr.type.model.frtypes.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.fr.type.model.frtypes.impl.ConstraintImpl
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link ccsds.fr.type.model.frtypes.impl.SizeConstraintImpl <em>Size Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.fr.type.model.frtypes.impl.SizeConstraintImpl
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getSizeConstraint()
		 * @generated
		 */
		EClass SIZE_CONSTRAINT = eINSTANCE.getSizeConstraint();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE_CONSTRAINT__MIN = eINSTANCE.getSizeConstraint_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE_CONSTRAINT__MAX = eINSTANCE.getSizeConstraint_Max();

		/**
		 * The meta object literal for the '{@link ccsds.fr.type.model.frtypes.impl.ValueRangeConstraintImpl <em>Value Range Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.fr.type.model.frtypes.impl.ValueRangeConstraintImpl
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getValueRangeConstraint()
		 * @generated
		 */
		EClass VALUE_RANGE_CONSTRAINT = eINSTANCE.getValueRangeConstraint();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_RANGE_CONSTRAINT__MIN = eINSTANCE.getValueRangeConstraint_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_RANGE_CONSTRAINT__MAX = eINSTANCE.getValueRangeConstraint_Max();

		/**
		 * The meta object literal for the '{@link ccsds.fr.type.model.frtypes.impl.SimpleRangeTypeImpl <em>Simple Range Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.fr.type.model.frtypes.impl.SimpleRangeTypeImpl
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getSimpleRangeType()
		 * @generated
		 */
		EClass SIMPLE_RANGE_TYPE = eINSTANCE.getSimpleRangeType();

		/**
		 * The meta object literal for the '<em><b>Range Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_RANGE_TYPE__RANGE_CONSTRAINT = eINSTANCE.getSimpleRangeType_RangeConstraint();

		/**
		 * The meta object literal for the '{@link ccsds.fr.type.model.frtypes.impl.SimpleSizeConstrainedTypeImpl <em>Simple Size Constrained Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.fr.type.model.frtypes.impl.SimpleSizeConstrainedTypeImpl
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getSimpleSizeConstrainedType()
		 * @generated
		 */
		EClass SIMPLE_SIZE_CONSTRAINED_TYPE = eINSTANCE.getSimpleSizeConstrainedType();

		/**
		 * The meta object literal for the '{@link ccsds.fr.type.model.frtypes.impl.NamedValueImpl <em>Named Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.fr.type.model.frtypes.impl.NamedValueImpl
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getNamedValue()
		 * @generated
		 */
		EClass NAMED_VALUE = eINSTANCE.getNamedValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_VALUE__NAME = eINSTANCE.getNamedValue_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_VALUE__VALUE = eINSTANCE.getNamedValue_Value();

		/**
		 * The meta object literal for the '{@link ccsds.fr.type.model.frtypes.impl.StructuredSizeConstrainedTypeImpl <em>Structured Size Constrained Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.fr.type.model.frtypes.impl.StructuredSizeConstrainedTypeImpl
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getStructuredSizeConstrainedType()
		 * @generated
		 */
		EClass STRUCTURED_SIZE_CONSTRAINED_TYPE = eINSTANCE.getStructuredSizeConstrainedType();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_SIZE_CONSTRAINED_TYPE__ELEMENTS = eINSTANCE.getStructuredSizeConstrainedType_Elements();

		/**
		 * The meta object literal for the '{@link ccsds.fr.type.model.frtypes.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.fr.type.model.frtypes.impl.ChoiceImpl
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '{@link ccsds.fr.type.model.frtypes.impl.TypeReferenceLocalImpl <em>Type Reference Local</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.fr.type.model.frtypes.impl.TypeReferenceLocalImpl
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getTypeReferenceLocal()
		 * @generated
		 */
		EClass TYPE_REFERENCE_LOCAL = eINSTANCE.getTypeReferenceLocal();

		/**
		 * The meta object literal for the '<em><b>Type Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_REFERENCE_LOCAL__TYPE_DEFINITION = eINSTANCE.getTypeReferenceLocal_TypeDefinition();

		/**
		 * The meta object literal for the '{@link ccsds.fr.type.model.frtypes.impl.SingleValueConstraintImpl <em>Single Value Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.fr.type.model.frtypes.impl.SingleValueConstraintImpl
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getSingleValueConstraint()
		 * @generated
		 */
		EClass SINGLE_VALUE_CONSTRAINT = eINSTANCE.getSingleValueConstraint();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_VALUE_CONSTRAINT__VALUES = eINSTANCE.getSingleValueConstraint_Values();

		/**
		 * The meta object literal for the '{@link ccsds.fr.type.model.frtypes.impl.PermittedAlphabetConstraintImpl <em>Permitted Alphabet Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.fr.type.model.frtypes.impl.PermittedAlphabetConstraintImpl
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getPermittedAlphabetConstraint()
		 * @generated
		 */
		EClass PERMITTED_ALPHABET_CONSTRAINT = eINSTANCE.getPermittedAlphabetConstraint();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMITTED_ALPHABET_CONSTRAINT__VALUES = eINSTANCE.getPermittedAlphabetConstraint_Values();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMITTED_ALPHABET_CONSTRAINT__TYPE = eINSTANCE.getPermittedAlphabetConstraint_Type();

		/**
		 * The meta object literal for the '{@link ccsds.fr.type.model.frtypes.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.fr.type.model.frtypes.impl.ModuleImpl
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Type Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__TYPE_DEFINITION = eINSTANCE.getModule_TypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Oid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__OID = eINSTANCE.getModule_Oid();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__IMPORTS = eINSTANCE.getModule_Imports();

		/**
		 * The meta object literal for the '<em><b>Exports</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__EXPORTS = eINSTANCE.getModule_Exports();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__NAME = eINSTANCE.getModule_Name();

		/**
		 * The meta object literal for the '{@link ccsds.fr.type.model.frtypes.impl.ObjectIdentifierImpl <em>Object Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.fr.type.model.frtypes.impl.ObjectIdentifierImpl
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getObjectIdentifier()
		 * @generated
		 */
		EClass OBJECT_IDENTIFIER = eINSTANCE.getObjectIdentifier();

		/**
		 * The meta object literal for the '{@link ccsds.fr.type.model.frtypes.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.fr.type.model.frtypes.impl.ElementImpl
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__TYPE = eINSTANCE.getElement_Type();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__TAG = eINSTANCE.getElement_Tag();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__OPTIONAL = eINSTANCE.getElement_Optional();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__COMMENT = eINSTANCE.getElement_Comment();

		/**
		 * The meta object literal for the '{@link ccsds.fr.type.model.frtypes.impl.TypeReferenceExternalImpl <em>Type Reference External</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.fr.type.model.frtypes.impl.TypeReferenceExternalImpl
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getTypeReferenceExternal()
		 * @generated
		 */
		EClass TYPE_REFERENCE_EXTERNAL = eINSTANCE.getTypeReferenceExternal();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_REFERENCE_EXTERNAL__NAME = eINSTANCE.getTypeReferenceExternal_Name();

		/**
		 * The meta object literal for the '<em><b>Complex Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_REFERENCE_EXTERNAL__COMPLEX_TYPE = eINSTANCE.getTypeReferenceExternal_ComplexType();

		/**
		 * The meta object literal for the '{@link ccsds.fr.type.model.frtypes.impl.NullImpl <em>Null</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.fr.type.model.frtypes.impl.NullImpl
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getNull()
		 * @generated
		 */
		EClass NULL = eINSTANCE.getNull();

		/**
		 * The meta object literal for the '{@link ccsds.fr.type.model.frtypes.ExportWriter <em>Export Writer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.fr.type.model.frtypes.ExportWriter
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getExportWriter()
		 * @generated
		 */
		EClass EXPORT_WRITER = eINSTANCE.getExportWriter();

		/**
		 * The meta object literal for the '<em><b>Write Asn1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPORT_WRITER___WRITE_ASN1__INT_STRINGBUFFER = eINSTANCE
				.getExportWriter__WriteAsn1__int_StringBuffer();

		/**
		 * The meta object literal for the '<em><b>Write Xsd</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPORT_WRITER___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER = eINSTANCE
				.getExportWriter__WriteXsd__int_StringBuffer_ObjectIdentifier();

		/**
		 * The meta object literal for the '{@link ccsds.fr.type.model.frtypes.SizeConstrainedType <em>Size Constrained Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.fr.type.model.frtypes.SizeConstrainedType
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getSizeConstrainedType()
		 * @generated
		 */
		EClass SIZE_CONSTRAINED_TYPE = eINSTANCE.getSizeConstrainedType();

		/**
		 * The meta object literal for the '<em><b>Size Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIZE_CONSTRAINED_TYPE__SIZE_CONSTRAINT = eINSTANCE.getSizeConstrainedType_SizeConstraint();

		/**
		 * The meta object literal for the '{@link ccsds.fr.type.model.frtypes.impl.StructuredDifferentTypeImpl <em>Structured Different Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.fr.type.model.frtypes.impl.StructuredDifferentTypeImpl
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getStructuredDifferentType()
		 * @generated
		 */
		EClass STRUCTURED_DIFFERENT_TYPE = eINSTANCE.getStructuredDifferentType();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_DIFFERENT_TYPE__ELEMENTS = eINSTANCE.getStructuredDifferentType_Elements();

		/**
		 * The meta object literal for the '{@link ccsds.fr.type.model.frtypes.impl.FromModuleImpl <em>From Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.fr.type.model.frtypes.impl.FromModuleImpl
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getFromModule()
		 * @generated
		 */
		EClass FROM_MODULE = eINSTANCE.getFromModule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM_MODULE__NAME = eINSTANCE.getFromModule_Name();

		/**
		 * The meta object literal for the '<em><b>Imported Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM_MODULE__IMPORTED_TYPES = eINSTANCE.getFromModule_ImportedTypes();

		/**
		 * The meta object literal for the '{@link ccsds.fr.type.model.frtypes.StringType <em>String Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.fr.type.model.frtypes.StringType
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getStringType()
		 * @generated
		 */
		EEnum STRING_TYPE = eINSTANCE.getStringType();

		/**
		 * The meta object literal for the '{@link ccsds.fr.type.model.frtypes.ConstraintType <em>Constraint Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsds.fr.type.model.frtypes.ConstraintType
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getConstraintType()
		 * @generated
		 */
		EEnum CONSTRAINT_TYPE = eINSTANCE.getConstraintType();

		/**
		 * The meta object literal for the '<em>String Buffer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.StringBuffer
		 * @see ccsds.fr.type.model.frtypes.impl.FrtypesPackageImpl#getStringBuffer()
		 * @generated
		 */
		EDataType STRING_BUFFER = eINSTANCE.getStringBuffer();

	}

} //FrtypesPackage
