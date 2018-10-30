/**
 */
package ccsds.fr.type.model.frtypes.util;

import ccsds.fr.type.model.frtypes.Asn1Writer;
import ccsds.fr.type.model.frtypes.BitString;
import ccsds.fr.type.model.frtypes.CharacterString;
import ccsds.fr.type.model.frtypes.Choice;
import ccsds.fr.type.model.frtypes.ComponentValue;
import ccsds.fr.type.model.frtypes.Constraint;
import ccsds.fr.type.model.frtypes.Enumerated;
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
import ccsds.fr.type.model.frtypes.StructuredDifferentType;
import ccsds.fr.type.model.frtypes.StructuredSizeConstrainedType;
import ccsds.fr.type.model.frtypes.StructuredType;
import ccsds.fr.type.model.frtypes.Type;
import ccsds.fr.type.model.frtypes.TypeDefinition;
import ccsds.fr.type.model.frtypes.TypeReferenceExternal;
import ccsds.fr.type.model.frtypes.TypeReferenceLocal;
import ccsds.fr.type.model.frtypes.ValueRangeConstraint;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ccsds.fr.type.model.frtypes.FrtypesPackage
 * @generated
 */
public class FrtypesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FrtypesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrtypesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FrtypesPackage.eINSTANCE;
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
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrtypesSwitch<Adapter> modelSwitch = new FrtypesSwitch<Adapter>() {
		@Override
		public Adapter caseTypeDefinition(TypeDefinition object) {
			return createTypeDefinitionAdapter();
		}

		@Override
		public Adapter caseType(Type object) {
			return createTypeAdapter();
		}

		@Override
		public Adapter caseSimpleType(SimpleType object) {
			return createSimpleTypeAdapter();
		}

		@Override
		public Adapter caseStructuredType(StructuredType object) {
			return createStructuredTypeAdapter();
		}

		@Override
		public Adapter caseBoolean(ccsds.fr.type.model.frtypes.Boolean object) {
			return createBooleanAdapter();
		}

		@Override
		public Adapter caseIntegerType(IntegerType object) {
			return createIntegerTypeAdapter();
		}

		@Override
		public Adapter caseBitString(BitString object) {
			return createBitStringAdapter();
		}

		@Override
		public Adapter caseOctetString(OctetString object) {
			return createOctetStringAdapter();
		}

		@Override
		public Adapter caseReal(Real object) {
			return createRealAdapter();
		}

		@Override
		public Adapter caseEnumerated(Enumerated object) {
			return createEnumeratedAdapter();
		}

		@Override
		public Adapter caseCharacterString(CharacterString object) {
			return createCharacterStringAdapter();
		}

		@Override
		public Adapter caseSequence(Sequence object) {
			return createSequenceAdapter();
		}

		@Override
		public Adapter caseSequenceOf(SequenceOf object) {
			return createSequenceOfAdapter();
		}

		@Override
		public Adapter caseSet(Set object) {
			return createSetAdapter();
		}

		@Override
		public Adapter caseSetOf(SetOf object) {
			return createSetOfAdapter();
		}

		@Override
		public Adapter caseConstraint(Constraint object) {
			return createConstraintAdapter();
		}

		@Override
		public Adapter caseSizeConstraint(SizeConstraint object) {
			return createSizeConstraintAdapter();
		}

		@Override
		public Adapter caseValueRangeConstraint(ValueRangeConstraint object) {
			return createValueRangeConstraintAdapter();
		}

		@Override
		public Adapter caseSimpleRangeType(SimpleRangeType object) {
			return createSimpleRangeTypeAdapter();
		}

		@Override
		public Adapter caseSimpleSizeConstrainedType(SimpleSizeConstrainedType object) {
			return createSimpleSizeConstrainedTypeAdapter();
		}

		@Override
		public Adapter caseNamedValue(NamedValue object) {
			return createNamedValueAdapter();
		}

		@Override
		public Adapter caseStructuredSizeConstrainedType(StructuredSizeConstrainedType object) {
			return createStructuredSizeConstrainedTypeAdapter();
		}

		@Override
		public Adapter caseChoice(Choice object) {
			return createChoiceAdapter();
		}

		@Override
		public Adapter caseTypeReferenceLocal(TypeReferenceLocal object) {
			return createTypeReferenceLocalAdapter();
		}

		@Override
		public Adapter caseSingleValueConstraint(SingleValueConstraint object) {
			return createSingleValueConstraintAdapter();
		}

		@Override
		public Adapter casePermittedAlphabetConstraint(PermittedAlphabetConstraint object) {
			return createPermittedAlphabetConstraintAdapter();
		}

		@Override
		public Adapter caseModule(Module object) {
			return createModuleAdapter();
		}

		@Override
		public Adapter caseObjectIdentifier(ObjectIdentifier object) {
			return createObjectIdentifierAdapter();
		}

		@Override
		public Adapter caseComponentValue(ComponentValue object) {
			return createComponentValueAdapter();
		}

		@Override
		public Adapter caseTypeReferenceExternal(TypeReferenceExternal object) {
			return createTypeReferenceExternalAdapter();
		}

		@Override
		public Adapter caseNull(Null object) {
			return createNullAdapter();
		}

		@Override
		public Adapter caseAsn1Writer(Asn1Writer object) {
			return createAsn1WriterAdapter();
		}

		@Override
		public Adapter caseSizeConstrainedType(SizeConstrainedType object) {
			return createSizeConstrainedTypeAdapter();
		}

		@Override
		public Adapter caseStructuredDifferentType(StructuredDifferentType object) {
			return createStructuredDifferentTypeAdapter();
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
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.fr.type.model.frtypes.TypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.fr.type.model.frtypes.TypeDefinition
	 * @generated
	 */
	public Adapter createTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.fr.type.model.frtypes.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.fr.type.model.frtypes.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.fr.type.model.frtypes.SimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.fr.type.model.frtypes.SimpleType
	 * @generated
	 */
	public Adapter createSimpleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.fr.type.model.frtypes.StructuredType <em>Structured Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.fr.type.model.frtypes.StructuredType
	 * @generated
	 */
	public Adapter createStructuredTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.fr.type.model.frtypes.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.fr.type.model.frtypes.Boolean
	 * @generated
	 */
	public Adapter createBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.fr.type.model.frtypes.IntegerType <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.fr.type.model.frtypes.IntegerType
	 * @generated
	 */
	public Adapter createIntegerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.fr.type.model.frtypes.BitString <em>Bit String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.fr.type.model.frtypes.BitString
	 * @generated
	 */
	public Adapter createBitStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.fr.type.model.frtypes.OctetString <em>Octet String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.fr.type.model.frtypes.OctetString
	 * @generated
	 */
	public Adapter createOctetStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.fr.type.model.frtypes.Real <em>Real</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.fr.type.model.frtypes.Real
	 * @generated
	 */
	public Adapter createRealAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.fr.type.model.frtypes.Enumerated <em>Enumerated</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.fr.type.model.frtypes.Enumerated
	 * @generated
	 */
	public Adapter createEnumeratedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.fr.type.model.frtypes.CharacterString <em>Character String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.fr.type.model.frtypes.CharacterString
	 * @generated
	 */
	public Adapter createCharacterStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.fr.type.model.frtypes.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.fr.type.model.frtypes.Sequence
	 * @generated
	 */
	public Adapter createSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.fr.type.model.frtypes.SequenceOf <em>Sequence Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.fr.type.model.frtypes.SequenceOf
	 * @generated
	 */
	public Adapter createSequenceOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.fr.type.model.frtypes.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.fr.type.model.frtypes.Set
	 * @generated
	 */
	public Adapter createSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.fr.type.model.frtypes.SetOf <em>Set Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.fr.type.model.frtypes.SetOf
	 * @generated
	 */
	public Adapter createSetOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.fr.type.model.frtypes.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.fr.type.model.frtypes.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.fr.type.model.frtypes.SizeConstraint <em>Size Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.fr.type.model.frtypes.SizeConstraint
	 * @generated
	 */
	public Adapter createSizeConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.fr.type.model.frtypes.ValueRangeConstraint <em>Value Range Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.fr.type.model.frtypes.ValueRangeConstraint
	 * @generated
	 */
	public Adapter createValueRangeConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.fr.type.model.frtypes.SimpleRangeType <em>Simple Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.fr.type.model.frtypes.SimpleRangeType
	 * @generated
	 */
	public Adapter createSimpleRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.fr.type.model.frtypes.SimpleSizeConstrainedType <em>Simple Size Constrained Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.fr.type.model.frtypes.SimpleSizeConstrainedType
	 * @generated
	 */
	public Adapter createSimpleSizeConstrainedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.fr.type.model.frtypes.NamedValue <em>Named Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.fr.type.model.frtypes.NamedValue
	 * @generated
	 */
	public Adapter createNamedValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.fr.type.model.frtypes.StructuredSizeConstrainedType <em>Structured Size Constrained Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.fr.type.model.frtypes.StructuredSizeConstrainedType
	 * @generated
	 */
	public Adapter createStructuredSizeConstrainedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.fr.type.model.frtypes.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.fr.type.model.frtypes.Choice
	 * @generated
	 */
	public Adapter createChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.fr.type.model.frtypes.TypeReferenceLocal <em>Type Reference Local</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.fr.type.model.frtypes.TypeReferenceLocal
	 * @generated
	 */
	public Adapter createTypeReferenceLocalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.fr.type.model.frtypes.SingleValueConstraint <em>Single Value Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.fr.type.model.frtypes.SingleValueConstraint
	 * @generated
	 */
	public Adapter createSingleValueConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.fr.type.model.frtypes.PermittedAlphabetConstraint <em>Permitted Alphabet Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.fr.type.model.frtypes.PermittedAlphabetConstraint
	 * @generated
	 */
	public Adapter createPermittedAlphabetConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.fr.type.model.frtypes.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.fr.type.model.frtypes.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.fr.type.model.frtypes.ObjectIdentifier <em>Object Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.fr.type.model.frtypes.ObjectIdentifier
	 * @generated
	 */
	public Adapter createObjectIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.fr.type.model.frtypes.ComponentValue <em>Component Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.fr.type.model.frtypes.ComponentValue
	 * @generated
	 */
	public Adapter createComponentValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.fr.type.model.frtypes.TypeReferenceExternal <em>Type Reference External</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.fr.type.model.frtypes.TypeReferenceExternal
	 * @generated
	 */
	public Adapter createTypeReferenceExternalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.fr.type.model.frtypes.Null <em>Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.fr.type.model.frtypes.Null
	 * @generated
	 */
	public Adapter createNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.fr.type.model.frtypes.Asn1Writer <em>Asn1 Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.fr.type.model.frtypes.Asn1Writer
	 * @generated
	 */
	public Adapter createAsn1WriterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.fr.type.model.frtypes.SizeConstrainedType <em>Size Constrained Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.fr.type.model.frtypes.SizeConstrainedType
	 * @generated
	 */
	public Adapter createSizeConstrainedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsds.fr.type.model.frtypes.StructuredDifferentType <em>Structured Different Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsds.fr.type.model.frtypes.StructuredDifferentType
	 * @generated
	 */
	public Adapter createStructuredDifferentTypeAdapter() {
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

} //FrtypesAdapterFactory
