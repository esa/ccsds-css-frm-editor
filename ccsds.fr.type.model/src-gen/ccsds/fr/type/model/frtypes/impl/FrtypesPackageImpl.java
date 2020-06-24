/**
 */
package ccsds.fr.type.model.frtypes.impl;

import ccsds.fr.type.model.frtypes.ExportWriter;
import ccsds.fr.type.model.frtypes.BitString;
import ccsds.fr.type.model.frtypes.CharacterString;
import ccsds.fr.type.model.frtypes.Choice;
import ccsds.fr.type.model.frtypes.Constraint;
import ccsds.fr.type.model.frtypes.ConstraintType;
import ccsds.fr.type.model.frtypes.Element;
import ccsds.fr.type.model.frtypes.Enumerated;
import ccsds.fr.type.model.frtypes.FromModule;
import ccsds.fr.type.model.frtypes.FrtypesFactory;
import ccsds.fr.type.model.frtypes.FrtypesPackage;
import ccsds.fr.type.model.frtypes.IntegerType;
import ccsds.fr.type.model.frtypes.Module;
import ccsds.fr.type.model.frtypes.NamedValue;
import ccsds.fr.type.model.frtypes.Null;
import ccsds.fr.type.model.frtypes.ObjectIdentifier;
import ccsds.fr.type.model.frtypes.OctetString;
import ccsds.fr.type.model.frtypes.PermittedAlphabetConstraint;
import ccsds.fr.type.model.frtypes.Real;
import ccsds.fr.type.model.frtypes.Sequence;
import ccsds.fr.type.model.frtypes.SequenceOf;
import ccsds.fr.type.model.frtypes.Set;
import ccsds.fr.type.model.frtypes.SetOf;
import ccsds.fr.type.model.frtypes.SimpleRangeType;
import ccsds.fr.type.model.frtypes.SimpleSizeConstrainedType;
import ccsds.fr.type.model.frtypes.SimpleType;
import ccsds.fr.type.model.frtypes.SingleValueConstraint;
import ccsds.fr.type.model.frtypes.SizeConstrainedType;
import ccsds.fr.type.model.frtypes.SizeConstraint;
import ccsds.fr.type.model.frtypes.StringType;
import ccsds.fr.type.model.frtypes.StructuredDifferentType;
import ccsds.fr.type.model.frtypes.StructuredSizeConstrainedType;
import ccsds.fr.type.model.frtypes.StructuredType;
import ccsds.fr.type.model.frtypes.Type;
import ccsds.fr.type.model.frtypes.TypeDefinition;
import ccsds.fr.type.model.frtypes.TypeReferenceExternal;
import ccsds.fr.type.model.frtypes.TypeReferenceLocal;
import ccsds.fr.type.model.frtypes.ValueRangeConstraint;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FrtypesPackageImpl extends EPackageImpl implements FrtypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass octetStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumeratedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sizeConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueRangeConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleRangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleSizeConstrainedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredSizeConstrainedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeReferenceLocalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleValueConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permittedAlphabetConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectIdentifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeReferenceExternalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exportWriterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sizeConstrainedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredDifferentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fromModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stringTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum constraintTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringBufferEDataType = null;

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
	 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FrtypesPackageImpl() {
		super(eNS_URI, FrtypesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FrtypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FrtypesPackage init() {
		if (isInited)
			return (FrtypesPackage) EPackage.Registry.INSTANCE.getEPackage(FrtypesPackage.eNS_URI);

		// Obtain or create and register package
		FrtypesPackageImpl theFrtypesPackage = (FrtypesPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof FrtypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new FrtypesPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theFrtypesPackage.createPackageContents();

		// Initialize created meta-data
		theFrtypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFrtypesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FrtypesPackage.eNS_URI, theFrtypesPackage);
		return theFrtypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDefinition() {
		return typeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDefinition_Name() {
		return (EAttribute) typeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDefinition_Type() {
		return (EReference) typeDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDefinition_Comment() {
		return (EAttribute) typeDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_SingleValueConstraint() {
		return (EReference) typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleType() {
		return simpleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredType() {
		return structuredTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean() {
		return booleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerType() {
		return integerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerType_NamedValues() {
		return (EReference) integerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitString() {
		return bitStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOctetString() {
		return octetStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReal() {
		return realEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerated() {
		return enumeratedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerated_Values() {
		return (EReference) enumeratedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacterString() {
		return characterStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacterString_PermittedAlphabetConstraint() {
		return (EReference) characterStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterString_Type() {
		return (EAttribute) characterStringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequence() {
		return sequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceOf() {
		return sequenceOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSet() {
		return setEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetOf() {
		return setOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSizeConstraint() {
		return sizeConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSizeConstraint_Min() {
		return (EAttribute) sizeConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSizeConstraint_Max() {
		return (EAttribute) sizeConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueRangeConstraint() {
		return valueRangeConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueRangeConstraint_Min() {
		return (EAttribute) valueRangeConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueRangeConstraint_Max() {
		return (EAttribute) valueRangeConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleRangeType() {
		return simpleRangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleRangeType_RangeConstraint() {
		return (EReference) simpleRangeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleSizeConstrainedType() {
		return simpleSizeConstrainedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedValue() {
		return namedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedValue_Name() {
		return (EAttribute) namedValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedValue_Value() {
		return (EAttribute) namedValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredSizeConstrainedType() {
		return structuredSizeConstrainedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredSizeConstrainedType_Elements() {
		return (EReference) structuredSizeConstrainedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoice() {
		return choiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeReferenceLocal() {
		return typeReferenceLocalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeReferenceLocal_TypeDefinition() {
		return (EReference) typeReferenceLocalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleValueConstraint() {
		return singleValueConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleValueConstraint_Values() {
		return (EAttribute) singleValueConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPermittedAlphabetConstraint() {
		return permittedAlphabetConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPermittedAlphabetConstraint_Values() {
		return (EAttribute) permittedAlphabetConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPermittedAlphabetConstraint_Type() {
		return (EAttribute) permittedAlphabetConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_TypeDefinition() {
		return (EReference) moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Oid() {
		return (EAttribute) moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Imports() {
		return (EReference) moduleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Exports() {
		return (EAttribute) moduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Name() {
		return (EAttribute) moduleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectIdentifier() {
		return objectIdentifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Name() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Type() {
		return (EReference) elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Tag() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Optional() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Comment() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeReferenceExternal() {
		return typeReferenceExternalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeReferenceExternal_Name() {
		return (EAttribute) typeReferenceExternalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeReferenceExternal_ComplexType() {
		return (EAttribute) typeReferenceExternalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNull() {
		return nullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExportWriter() {
		return exportWriterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExportWriter__WriteAsn1__int_StringBuffer() {
		return exportWriterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExportWriter__WriteXsd__int_StringBuffer_ObjectIdentifier() {
		return exportWriterEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSizeConstrainedType() {
		return sizeConstrainedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSizeConstrainedType_SizeConstraint() {
		return (EReference) sizeConstrainedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredDifferentType() {
		return structuredDifferentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredDifferentType_Elements() {
		return (EReference) structuredDifferentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFromModule() {
		return fromModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFromModule_Name() {
		return (EAttribute) fromModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFromModule_ImportedTypes() {
		return (EAttribute) fromModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStringType() {
		return stringTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConstraintType() {
		return constraintTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStringBuffer() {
		return stringBufferEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrtypesFactory getFrtypesFactory() {
		return (FrtypesFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		typeDefinitionEClass = createEClass(TYPE_DEFINITION);
		createEAttribute(typeDefinitionEClass, TYPE_DEFINITION__NAME);
		createEReference(typeDefinitionEClass, TYPE_DEFINITION__TYPE);
		createEAttribute(typeDefinitionEClass, TYPE_DEFINITION__COMMENT);

		typeEClass = createEClass(TYPE);
		createEReference(typeEClass, TYPE__SINGLE_VALUE_CONSTRAINT);

		simpleTypeEClass = createEClass(SIMPLE_TYPE);

		structuredTypeEClass = createEClass(STRUCTURED_TYPE);

		booleanEClass = createEClass(BOOLEAN);

		integerTypeEClass = createEClass(INTEGER_TYPE);
		createEReference(integerTypeEClass, INTEGER_TYPE__NAMED_VALUES);

		bitStringEClass = createEClass(BIT_STRING);

		octetStringEClass = createEClass(OCTET_STRING);

		realEClass = createEClass(REAL);

		enumeratedEClass = createEClass(ENUMERATED);
		createEReference(enumeratedEClass, ENUMERATED__VALUES);

		characterStringEClass = createEClass(CHARACTER_STRING);
		createEReference(characterStringEClass, CHARACTER_STRING__PERMITTED_ALPHABET_CONSTRAINT);
		createEAttribute(characterStringEClass, CHARACTER_STRING__TYPE);

		sequenceEClass = createEClass(SEQUENCE);

		sequenceOfEClass = createEClass(SEQUENCE_OF);

		setEClass = createEClass(SET);

		setOfEClass = createEClass(SET_OF);

		constraintEClass = createEClass(CONSTRAINT);

		sizeConstraintEClass = createEClass(SIZE_CONSTRAINT);
		createEAttribute(sizeConstraintEClass, SIZE_CONSTRAINT__MIN);
		createEAttribute(sizeConstraintEClass, SIZE_CONSTRAINT__MAX);

		valueRangeConstraintEClass = createEClass(VALUE_RANGE_CONSTRAINT);
		createEAttribute(valueRangeConstraintEClass, VALUE_RANGE_CONSTRAINT__MIN);
		createEAttribute(valueRangeConstraintEClass, VALUE_RANGE_CONSTRAINT__MAX);

		simpleRangeTypeEClass = createEClass(SIMPLE_RANGE_TYPE);
		createEReference(simpleRangeTypeEClass, SIMPLE_RANGE_TYPE__RANGE_CONSTRAINT);

		simpleSizeConstrainedTypeEClass = createEClass(SIMPLE_SIZE_CONSTRAINED_TYPE);

		namedValueEClass = createEClass(NAMED_VALUE);
		createEAttribute(namedValueEClass, NAMED_VALUE__NAME);
		createEAttribute(namedValueEClass, NAMED_VALUE__VALUE);

		structuredSizeConstrainedTypeEClass = createEClass(STRUCTURED_SIZE_CONSTRAINED_TYPE);
		createEReference(structuredSizeConstrainedTypeEClass, STRUCTURED_SIZE_CONSTRAINED_TYPE__ELEMENTS);

		choiceEClass = createEClass(CHOICE);

		typeReferenceLocalEClass = createEClass(TYPE_REFERENCE_LOCAL);
		createEReference(typeReferenceLocalEClass, TYPE_REFERENCE_LOCAL__TYPE_DEFINITION);

		singleValueConstraintEClass = createEClass(SINGLE_VALUE_CONSTRAINT);
		createEAttribute(singleValueConstraintEClass, SINGLE_VALUE_CONSTRAINT__VALUES);

		permittedAlphabetConstraintEClass = createEClass(PERMITTED_ALPHABET_CONSTRAINT);
		createEAttribute(permittedAlphabetConstraintEClass, PERMITTED_ALPHABET_CONSTRAINT__VALUES);
		createEAttribute(permittedAlphabetConstraintEClass, PERMITTED_ALPHABET_CONSTRAINT__TYPE);

		moduleEClass = createEClass(MODULE);
		createEReference(moduleEClass, MODULE__TYPE_DEFINITION);
		createEAttribute(moduleEClass, MODULE__OID);
		createEAttribute(moduleEClass, MODULE__EXPORTS);
		createEAttribute(moduleEClass, MODULE__NAME);
		createEReference(moduleEClass, MODULE__IMPORTS);

		objectIdentifierEClass = createEClass(OBJECT_IDENTIFIER);

		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__NAME);
		createEReference(elementEClass, ELEMENT__TYPE);
		createEAttribute(elementEClass, ELEMENT__TAG);
		createEAttribute(elementEClass, ELEMENT__OPTIONAL);
		createEAttribute(elementEClass, ELEMENT__COMMENT);

		typeReferenceExternalEClass = createEClass(TYPE_REFERENCE_EXTERNAL);
		createEAttribute(typeReferenceExternalEClass, TYPE_REFERENCE_EXTERNAL__NAME);
		createEAttribute(typeReferenceExternalEClass, TYPE_REFERENCE_EXTERNAL__COMPLEX_TYPE);

		nullEClass = createEClass(NULL);

		exportWriterEClass = createEClass(EXPORT_WRITER);
		createEOperation(exportWriterEClass, EXPORT_WRITER___WRITE_ASN1__INT_STRINGBUFFER);
		createEOperation(exportWriterEClass, EXPORT_WRITER___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER);

		sizeConstrainedTypeEClass = createEClass(SIZE_CONSTRAINED_TYPE);
		createEReference(sizeConstrainedTypeEClass, SIZE_CONSTRAINED_TYPE__SIZE_CONSTRAINT);

		structuredDifferentTypeEClass = createEClass(STRUCTURED_DIFFERENT_TYPE);
		createEReference(structuredDifferentTypeEClass, STRUCTURED_DIFFERENT_TYPE__ELEMENTS);

		fromModuleEClass = createEClass(FROM_MODULE);
		createEAttribute(fromModuleEClass, FROM_MODULE__NAME);
		createEAttribute(fromModuleEClass, FROM_MODULE__IMPORTED_TYPES);

		// Create enums
		stringTypeEEnum = createEEnum(STRING_TYPE);
		constraintTypeEEnum = createEEnum(CONSTRAINT_TYPE);

		// Create data types
		stringBufferEDataType = createEDataType(STRING_BUFFER);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		typeDefinitionEClass.getESuperTypes().add(this.getExportWriter());
		typeEClass.getESuperTypes().add(this.getExportWriter());
		simpleTypeEClass.getESuperTypes().add(this.getType());
		structuredTypeEClass.getESuperTypes().add(this.getType());
		booleanEClass.getESuperTypes().add(this.getSimpleType());
		integerTypeEClass.getESuperTypes().add(this.getSimpleRangeType());
		bitStringEClass.getESuperTypes().add(this.getSimpleSizeConstrainedType());
		octetStringEClass.getESuperTypes().add(this.getSimpleSizeConstrainedType());
		realEClass.getESuperTypes().add(this.getSimpleRangeType());
		enumeratedEClass.getESuperTypes().add(this.getSimpleType());
		characterStringEClass.getESuperTypes().add(this.getSimpleSizeConstrainedType());
		sequenceEClass.getESuperTypes().add(this.getStructuredDifferentType());
		sequenceOfEClass.getESuperTypes().add(this.getStructuredSizeConstrainedType());
		setEClass.getESuperTypes().add(this.getStructuredDifferentType());
		setOfEClass.getESuperTypes().add(this.getStructuredSizeConstrainedType());
		constraintEClass.getESuperTypes().add(this.getExportWriter());
		sizeConstraintEClass.getESuperTypes().add(this.getConstraint());
		valueRangeConstraintEClass.getESuperTypes().add(this.getConstraint());
		simpleRangeTypeEClass.getESuperTypes().add(this.getSimpleType());
		simpleSizeConstrainedTypeEClass.getESuperTypes().add(this.getSimpleType());
		simpleSizeConstrainedTypeEClass.getESuperTypes().add(this.getSizeConstrainedType());
		namedValueEClass.getESuperTypes().add(this.getExportWriter());
		structuredSizeConstrainedTypeEClass.getESuperTypes().add(this.getStructuredType());
		structuredSizeConstrainedTypeEClass.getESuperTypes().add(this.getSizeConstrainedType());
		choiceEClass.getESuperTypes().add(this.getStructuredDifferentType());
		typeReferenceLocalEClass.getESuperTypes().add(this.getType());
		singleValueConstraintEClass.getESuperTypes().add(this.getConstraint());
		permittedAlphabetConstraintEClass.getESuperTypes().add(this.getConstraint());
		moduleEClass.getESuperTypes().add(this.getExportWriter());
		objectIdentifierEClass.getESuperTypes().add(this.getSimpleType());
		elementEClass.getESuperTypes().add(this.getType());
		typeReferenceExternalEClass.getESuperTypes().add(this.getType());
		nullEClass.getESuperTypes().add(this.getSimpleType());
		sizeConstrainedTypeEClass.getESuperTypes().add(this.getExportWriter());
		structuredDifferentTypeEClass.getESuperTypes().add(this.getStructuredType());
		fromModuleEClass.getESuperTypes().add(this.getExportWriter());

		// Initialize classes, features, and operations; add parameters
		initEClass(typeDefinitionEClass, TypeDefinition.class, "TypeDefinition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, TypeDefinition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeDefinition_Type(), this.getType(), null, "type", null, 1, 1, TypeDefinition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDefinition_Comment(), ecorePackage.getEString(), "comment", null, 0, 1,
				TypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getType_SingleValueConstraint(), this.getSingleValueConstraint(), null, "singleValueConstraint",
				null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleTypeEClass, SimpleType.class, "SimpleType", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(structuredTypeEClass, StructuredType.class, "StructuredType", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanEClass, ccsds.fr.type.model.frtypes.Boolean.class, "Boolean", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerTypeEClass, IntegerType.class, "IntegerType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegerType_NamedValues(), this.getNamedValue(), null, "namedValues", null, 0, -1,
				IntegerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bitStringEClass, BitString.class, "BitString", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(octetStringEClass, OctetString.class, "OctetString", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(realEClass, Real.class, "Real", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumeratedEClass, Enumerated.class, "Enumerated", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerated_Values(), this.getNamedValue(), null, "values", null, 1, -1, Enumerated.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(characterStringEClass, CharacterString.class, "CharacterString", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCharacterString_PermittedAlphabetConstraint(), this.getPermittedAlphabetConstraint(), null,
				"permittedAlphabetConstraint", null, 0, 1, CharacterString.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterString_Type(), this.getStringType(), "type", "VisibleString", 0, 1,
				CharacterString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(sequenceEClass, Sequence.class, "Sequence", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequenceOfEClass, SequenceOf.class, "SequenceOf", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(setEClass, Set.class, "Set", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setOfEClass, SetOf.class, "SetOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constraintEClass, Constraint.class, "Constraint", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(sizeConstraintEClass, SizeConstraint.class, "SizeConstraint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSizeConstraint_Min(), ecorePackage.getELong(), "min", null, 1, 1, SizeConstraint.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSizeConstraint_Max(), ecorePackage.getELong(), "max", null, 1, 1, SizeConstraint.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueRangeConstraintEClass, ValueRangeConstraint.class, "ValueRangeConstraint", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueRangeConstraint_Min(), ecorePackage.getEString(), "min", null, 1, 1,
				ValueRangeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueRangeConstraint_Max(), ecorePackage.getEString(), "max", null, 1, 1,
				ValueRangeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleRangeTypeEClass, SimpleRangeType.class, "SimpleRangeType", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleRangeType_RangeConstraint(), this.getValueRangeConstraint(), null, "rangeConstraint",
				null, 0, -1, SimpleRangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleSizeConstrainedTypeEClass, SimpleSizeConstrainedType.class, "SimpleSizeConstrainedType",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedValueEClass, NamedValue.class, "NamedValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedValue_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedValue_Value(), ecorePackage.getEInt(), "value", null, 0, 1, NamedValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structuredSizeConstrainedTypeEClass, StructuredSizeConstrainedType.class,
				"StructuredSizeConstrainedType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuredSizeConstrainedType_Elements(), this.getType(), null, "elements", null, 1, 1,
				StructuredSizeConstrainedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(choiceEClass, Choice.class, "Choice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeReferenceLocalEClass, TypeReferenceLocal.class, "TypeReferenceLocal", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeReferenceLocal_TypeDefinition(), this.getTypeDefinition(), null, "typeDefinition", null,
				1, 1, TypeReferenceLocal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getTypeReferenceLocal_TypeDefinition().getEKeys().add(this.getTypeDefinition_Name());

		initEClass(singleValueConstraintEClass, SingleValueConstraint.class, "SingleValueConstraint", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSingleValueConstraint_Values(), ecorePackage.getEString(), "values", null, 1, -1,
				SingleValueConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(permittedAlphabetConstraintEClass, PermittedAlphabetConstraint.class, "PermittedAlphabetConstraint",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPermittedAlphabetConstraint_Values(), ecorePackage.getEString(), "values", null, 1, -1,
				PermittedAlphabetConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPermittedAlphabetConstraint_Type(), this.getConstraintType(), "type", "RANGE", 0, 1,
				PermittedAlphabetConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModule_TypeDefinition(), this.getTypeDefinition(), null, "typeDefinition", null, 0, -1,
				Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_Oid(), ecorePackage.getEString(), "oid", null, 0, 1, Module.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_Exports(), ecorePackage.getEString(), "exports", null, 0, -1, Module.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_Name(), ecorePackage.getEString(), "name", null, 1, 1, Module.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Imports(), this.getFromModule(), null, "imports", null, 0, -1, Module.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectIdentifierEClass, ObjectIdentifier.class, "ObjectIdentifier", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, Element.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Type(), this.getType(), null, "type", null, 1, 1, Element.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getElement_Tag(), ecorePackage.getEString(), "tag", null, 0, 1, Element.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Optional(), ecorePackage.getEBoolean(), "optional", "false", 0, 1, Element.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Element.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeReferenceExternalEClass, TypeReferenceExternal.class, "TypeReferenceExternal", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeReferenceExternal_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				TypeReferenceExternal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeReferenceExternal_ComplexType(), ecorePackage.getEBoolean(), "complexType", "false", 0, 1,
				TypeReferenceExternal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nullEClass, Null.class, "Null", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exportWriterEClass, ExportWriter.class, "ExportWriter", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getExportWriter__WriteAsn1__int_StringBuffer(), null, "writeAsn1", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "indentLevel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStringBuffer(), "output", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExportWriter__WriteXsd__int_StringBuffer_ObjectIdentifier(), null, "writeXsd", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "indentLevel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStringBuffer(), "output", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObjectIdentifier(), "oid", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sizeConstrainedTypeEClass, SizeConstrainedType.class, "SizeConstrainedType", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSizeConstrainedType_SizeConstraint(), this.getSizeConstraint(), null, "sizeConstraint", null,
				0, -1, SizeConstrainedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structuredDifferentTypeEClass, StructuredDifferentType.class, "StructuredDifferentType", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuredDifferentType_Elements(), this.getType(), null, "elements", null, 1, -1,
				StructuredDifferentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fromModuleEClass, FromModule.class, "FromModule", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFromModule_Name(), ecorePackage.getEString(), "name", null, 0, 1, FromModule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFromModule_ImportedTypes(), ecorePackage.getEString(), "importedTypes", null, 0, -1,
				FromModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(stringTypeEEnum, StringType.class, "StringType");
		addEEnumLiteral(stringTypeEEnum, StringType.BMP_STRING);
		addEEnumLiteral(stringTypeEEnum, StringType.IA5_STRING);
		addEEnumLiteral(stringTypeEEnum, StringType.GENERAL_STRING);
		addEEnumLiteral(stringTypeEEnum, StringType.GRAPHIC_STRING);
		addEEnumLiteral(stringTypeEEnum, StringType.NUMERIC_STRING);
		addEEnumLiteral(stringTypeEEnum, StringType.PRINTABLE_STRING);
		addEEnumLiteral(stringTypeEEnum, StringType.TELETEX_STRING);
		addEEnumLiteral(stringTypeEEnum, StringType.UNIVARSAL_STRING);
		addEEnumLiteral(stringTypeEEnum, StringType.UTF8_STRING);
		addEEnumLiteral(stringTypeEEnum, StringType.VIDEOTEX_STRING);
		addEEnumLiteral(stringTypeEEnum, StringType.VISIBLE_STRING);

		initEEnum(constraintTypeEEnum, ConstraintType.class, "ConstraintType");
		addEEnumLiteral(constraintTypeEEnum, ConstraintType.RANGE);
		addEEnumLiteral(constraintTypeEEnum, ConstraintType.OR);

		// Initialize data types
		initEDataType(stringBufferEDataType, StringBuffer.class, "StringBuffer", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //FrtypesPackageImpl
