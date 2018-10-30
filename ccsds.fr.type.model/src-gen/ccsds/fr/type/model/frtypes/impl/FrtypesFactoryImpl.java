/**
 */
package ccsds.fr.type.model.frtypes.impl;

import ccsds.fr.type.model.frtypes.BitString;
import ccsds.fr.type.model.frtypes.CharacterString;
import ccsds.fr.type.model.frtypes.Choice;
import ccsds.fr.type.model.frtypes.ComponentValue;
import ccsds.fr.type.model.frtypes.ConstraintType;
import ccsds.fr.type.model.frtypes.Enumerated;
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
import ccsds.fr.type.model.frtypes.SingleValueConstraint;
import ccsds.fr.type.model.frtypes.SizeConstraint;
import ccsds.fr.type.model.frtypes.StringType;
import ccsds.fr.type.model.frtypes.TypeDefinition;
import ccsds.fr.type.model.frtypes.TypeReferenceExternal;
import ccsds.fr.type.model.frtypes.TypeReferenceLocal;
import ccsds.fr.type.model.frtypes.ValueRangeConstraint;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class FrtypesFactoryImpl extends EFactoryImpl implements FrtypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FrtypesFactory init() {
		try {
			FrtypesFactory theFrtypesFactory = (FrtypesFactory) EPackage.Registry.INSTANCE
					.getEFactory(FrtypesPackage.eNS_URI);
			if (theFrtypesFactory != null) {
				return theFrtypesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FrtypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrtypesFactoryImpl() {
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
		case FrtypesPackage.TYPE_DEFINITION:
			return createTypeDefinition();
		case FrtypesPackage.BOOLEAN:
			return createBoolean();
		case FrtypesPackage.INTEGER_TYPE:
			return createIntegerType();
		case FrtypesPackage.BIT_STRING:
			return createBitString();
		case FrtypesPackage.OCTET_STRING:
			return createOctetString();
		case FrtypesPackage.REAL:
			return createReal();
		case FrtypesPackage.ENUMERATED:
			return createEnumerated();
		case FrtypesPackage.CHARACTER_STRING:
			return createCharacterString();
		case FrtypesPackage.SEQUENCE:
			return createSequence();
		case FrtypesPackage.SEQUENCE_OF:
			return createSequenceOf();
		case FrtypesPackage.SET:
			return createSet();
		case FrtypesPackage.SET_OF:
			return createSetOf();
		case FrtypesPackage.SIZE_CONSTRAINT:
			return createSizeConstraint();
		case FrtypesPackage.VALUE_RANGE_CONSTRAINT:
			return createValueRangeConstraint();
		case FrtypesPackage.NAMED_VALUE:
			return createNamedValue();
		case FrtypesPackage.CHOICE:
			return createChoice();
		case FrtypesPackage.TYPE_REFERENCE_LOCAL:
			return createTypeReferenceLocal();
		case FrtypesPackage.SINGLE_VALUE_CONSTRAINT:
			return createSingleValueConstraint();
		case FrtypesPackage.PERMITTED_ALPHABET_CONSTRAINT:
			return createPermittedAlphabetConstraint();
		case FrtypesPackage.MODULE:
			return createModule();
		case FrtypesPackage.OBJECT_IDENTIFIER:
			return createObjectIdentifier();
		case FrtypesPackage.COMPONENT_VALUE:
			return createComponentValue();
		case FrtypesPackage.TYPE_REFERENCE_EXTERNAL:
			return createTypeReferenceExternal();
		case FrtypesPackage.NULL:
			return createNull();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case FrtypesPackage.STRING_TYPE:
			return createStringTypeFromString(eDataType, initialValue);
		case FrtypesPackage.CONSTRAINT_TYPE:
			return createConstraintTypeFromString(eDataType, initialValue);
		case FrtypesPackage.STRING_BUFFER:
			return createStringBufferFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case FrtypesPackage.STRING_TYPE:
			return convertStringTypeToString(eDataType, instanceValue);
		case FrtypesPackage.CONSTRAINT_TYPE:
			return convertConstraintTypeToString(eDataType, instanceValue);
		case FrtypesPackage.STRING_BUFFER:
			return convertStringBufferToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition createTypeDefinition() {
		TypeDefinitionImpl typeDefinition = new TypeDefinitionImpl();
		return typeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ccsds.fr.type.model.frtypes.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerType createIntegerType() {
		IntegerTypeImpl integerType = new IntegerTypeImpl();
		return integerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitString createBitString() {
		BitStringImpl bitString = new BitStringImpl();
		return bitString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OctetString createOctetString() {
		OctetStringImpl octetString = new OctetStringImpl();
		return octetString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Real createReal() {
		RealImpl real = new RealImpl();
		return real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerated createEnumerated() {
		EnumeratedImpl enumerated = new EnumeratedImpl();
		return enumerated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterString createCharacterString() {
		CharacterStringImpl characterString = new CharacterStringImpl();
		return characterString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceOf createSequenceOf() {
		SequenceOfImpl sequenceOf = new SequenceOfImpl();
		return sequenceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set createSet() {
		SetImpl set = new SetImpl();
		return set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetOf createSetOf() {
		SetOfImpl setOf = new SetOfImpl();
		return setOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeConstraint createSizeConstraint() {
		SizeConstraintImpl sizeConstraint = new SizeConstraintImpl();
		return sizeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueRangeConstraint createValueRangeConstraint() {
		ValueRangeConstraintImpl valueRangeConstraint = new ValueRangeConstraintImpl();
		return valueRangeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedValue createNamedValue() {
		NamedValueImpl namedValue = new NamedValueImpl();
		return namedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choice createChoice() {
		ChoiceImpl choice = new ChoiceImpl();
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReferenceLocal createTypeReferenceLocal() {
		TypeReferenceLocalImpl typeReferenceLocal = new TypeReferenceLocalImpl();
		return typeReferenceLocal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValueConstraint createSingleValueConstraint() {
		SingleValueConstraintImpl singleValueConstraint = new SingleValueConstraintImpl();
		return singleValueConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermittedAlphabetConstraint createPermittedAlphabetConstraint() {
		PermittedAlphabetConstraintImpl permittedAlphabetConstraint = new PermittedAlphabetConstraintImpl();
		return permittedAlphabetConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectIdentifier createObjectIdentifier() {
		ObjectIdentifierImpl objectIdentifier = new ObjectIdentifierImpl();
		return objectIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentValue createComponentValue() {
		ComponentValueImpl componentValue = new ComponentValueImpl();
		return componentValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReferenceExternal createTypeReferenceExternal() {
		TypeReferenceExternalImpl typeReferenceExternal = new TypeReferenceExternalImpl();
		return typeReferenceExternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Null createNull() {
		NullImpl null_ = new NullImpl();
		return null_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType createStringTypeFromString(EDataType eDataType, String initialValue) {
		StringType result = StringType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintType createConstraintTypeFromString(EDataType eDataType, String initialValue) {
		ConstraintType result = ConstraintType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstraintTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringBuffer createStringBufferFromString(EDataType eDataType, String initialValue) {
		return (StringBuffer) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringBufferToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrtypesPackage getFrtypesPackage() {
		return (FrtypesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FrtypesPackage getPackage() {
		return FrtypesPackage.eINSTANCE;
	}

} //FrtypesFactoryImpl
