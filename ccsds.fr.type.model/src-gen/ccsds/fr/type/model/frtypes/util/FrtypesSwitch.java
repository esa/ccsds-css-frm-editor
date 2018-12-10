/**
 */
package ccsds.fr.type.model.frtypes.util;

import ccsds.fr.type.model.frtypes.Asn1Writer;
import ccsds.fr.type.model.frtypes.BitString;
import ccsds.fr.type.model.frtypes.CharacterString;
import ccsds.fr.type.model.frtypes.Choice;
import ccsds.fr.type.model.frtypes.Constraint;
import ccsds.fr.type.model.frtypes.Element;
import ccsds.fr.type.model.frtypes.Enumerated;
import ccsds.fr.type.model.frtypes.FromModule;
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ccsds.fr.type.model.frtypes.FrtypesPackage
 * @generated
 */
public class FrtypesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FrtypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrtypesSwitch() {
		if (modelPackage == null) {
			modelPackage = FrtypesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case FrtypesPackage.TYPE_DEFINITION: {
			TypeDefinition typeDefinition = (TypeDefinition) theEObject;
			T result = caseTypeDefinition(typeDefinition);
			if (result == null)
				result = caseAsn1Writer(typeDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FrtypesPackage.TYPE: {
			Type type = (Type) theEObject;
			T result = caseType(type);
			if (result == null)
				result = caseAsn1Writer(type);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FrtypesPackage.SIMPLE_TYPE: {
			SimpleType simpleType = (SimpleType) theEObject;
			T result = caseSimpleType(simpleType);
			if (result == null)
				result = caseType(simpleType);
			if (result == null)
				result = caseAsn1Writer(simpleType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FrtypesPackage.STRUCTURED_TYPE: {
			StructuredType structuredType = (StructuredType) theEObject;
			T result = caseStructuredType(structuredType);
			if (result == null)
				result = caseType(structuredType);
			if (result == null)
				result = caseAsn1Writer(structuredType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FrtypesPackage.BOOLEAN: {
			ccsds.fr.type.model.frtypes.Boolean boolean_ = (ccsds.fr.type.model.frtypes.Boolean) theEObject;
			T result = caseBoolean(boolean_);
			if (result == null)
				result = caseSimpleType(boolean_);
			if (result == null)
				result = caseType(boolean_);
			if (result == null)
				result = caseAsn1Writer(boolean_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FrtypesPackage.INTEGER_TYPE: {
			IntegerType integerType = (IntegerType) theEObject;
			T result = caseIntegerType(integerType);
			if (result == null)
				result = caseSimpleRangeType(integerType);
			if (result == null)
				result = caseSimpleType(integerType);
			if (result == null)
				result = caseType(integerType);
			if (result == null)
				result = caseAsn1Writer(integerType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FrtypesPackage.BIT_STRING: {
			BitString bitString = (BitString) theEObject;
			T result = caseBitString(bitString);
			if (result == null)
				result = caseSimpleSizeConstrainedType(bitString);
			if (result == null)
				result = caseSimpleType(bitString);
			if (result == null)
				result = caseSizeConstrainedType(bitString);
			if (result == null)
				result = caseType(bitString);
			if (result == null)
				result = caseAsn1Writer(bitString);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FrtypesPackage.OCTET_STRING: {
			OctetString octetString = (OctetString) theEObject;
			T result = caseOctetString(octetString);
			if (result == null)
				result = caseSimpleSizeConstrainedType(octetString);
			if (result == null)
				result = caseSimpleType(octetString);
			if (result == null)
				result = caseSizeConstrainedType(octetString);
			if (result == null)
				result = caseType(octetString);
			if (result == null)
				result = caseAsn1Writer(octetString);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FrtypesPackage.REAL: {
			Real real = (Real) theEObject;
			T result = caseReal(real);
			if (result == null)
				result = caseSimpleRangeType(real);
			if (result == null)
				result = caseSimpleType(real);
			if (result == null)
				result = caseType(real);
			if (result == null)
				result = caseAsn1Writer(real);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FrtypesPackage.ENUMERATED: {
			Enumerated enumerated = (Enumerated) theEObject;
			T result = caseEnumerated(enumerated);
			if (result == null)
				result = caseSimpleType(enumerated);
			if (result == null)
				result = caseType(enumerated);
			if (result == null)
				result = caseAsn1Writer(enumerated);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FrtypesPackage.CHARACTER_STRING: {
			CharacterString characterString = (CharacterString) theEObject;
			T result = caseCharacterString(characterString);
			if (result == null)
				result = caseSimpleSizeConstrainedType(characterString);
			if (result == null)
				result = caseSimpleType(characterString);
			if (result == null)
				result = caseSizeConstrainedType(characterString);
			if (result == null)
				result = caseType(characterString);
			if (result == null)
				result = caseAsn1Writer(characterString);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FrtypesPackage.SEQUENCE: {
			Sequence sequence = (Sequence) theEObject;
			T result = caseSequence(sequence);
			if (result == null)
				result = caseStructuredDifferentType(sequence);
			if (result == null)
				result = caseStructuredType(sequence);
			if (result == null)
				result = caseType(sequence);
			if (result == null)
				result = caseAsn1Writer(sequence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FrtypesPackage.SEQUENCE_OF: {
			SequenceOf sequenceOf = (SequenceOf) theEObject;
			T result = caseSequenceOf(sequenceOf);
			if (result == null)
				result = caseStructuredSizeConstrainedType(sequenceOf);
			if (result == null)
				result = caseStructuredType(sequenceOf);
			if (result == null)
				result = caseSizeConstrainedType(sequenceOf);
			if (result == null)
				result = caseType(sequenceOf);
			if (result == null)
				result = caseAsn1Writer(sequenceOf);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FrtypesPackage.SET: {
			Set set = (Set) theEObject;
			T result = caseSet(set);
			if (result == null)
				result = caseStructuredDifferentType(set);
			if (result == null)
				result = caseStructuredType(set);
			if (result == null)
				result = caseType(set);
			if (result == null)
				result = caseAsn1Writer(set);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FrtypesPackage.SET_OF: {
			SetOf setOf = (SetOf) theEObject;
			T result = caseSetOf(setOf);
			if (result == null)
				result = caseStructuredSizeConstrainedType(setOf);
			if (result == null)
				result = caseStructuredType(setOf);
			if (result == null)
				result = caseSizeConstrainedType(setOf);
			if (result == null)
				result = caseType(setOf);
			if (result == null)
				result = caseAsn1Writer(setOf);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FrtypesPackage.CONSTRAINT: {
			Constraint constraint = (Constraint) theEObject;
			T result = caseConstraint(constraint);
			if (result == null)
				result = caseAsn1Writer(constraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FrtypesPackage.SIZE_CONSTRAINT: {
			SizeConstraint sizeConstraint = (SizeConstraint) theEObject;
			T result = caseSizeConstraint(sizeConstraint);
			if (result == null)
				result = caseConstraint(sizeConstraint);
			if (result == null)
				result = caseAsn1Writer(sizeConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FrtypesPackage.VALUE_RANGE_CONSTRAINT: {
			ValueRangeConstraint valueRangeConstraint = (ValueRangeConstraint) theEObject;
			T result = caseValueRangeConstraint(valueRangeConstraint);
			if (result == null)
				result = caseConstraint(valueRangeConstraint);
			if (result == null)
				result = caseAsn1Writer(valueRangeConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FrtypesPackage.SIMPLE_RANGE_TYPE: {
			SimpleRangeType simpleRangeType = (SimpleRangeType) theEObject;
			T result = caseSimpleRangeType(simpleRangeType);
			if (result == null)
				result = caseSimpleType(simpleRangeType);
			if (result == null)
				result = caseType(simpleRangeType);
			if (result == null)
				result = caseAsn1Writer(simpleRangeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FrtypesPackage.SIMPLE_SIZE_CONSTRAINED_TYPE: {
			SimpleSizeConstrainedType simpleSizeConstrainedType = (SimpleSizeConstrainedType) theEObject;
			T result = caseSimpleSizeConstrainedType(simpleSizeConstrainedType);
			if (result == null)
				result = caseSimpleType(simpleSizeConstrainedType);
			if (result == null)
				result = caseSizeConstrainedType(simpleSizeConstrainedType);
			if (result == null)
				result = caseType(simpleSizeConstrainedType);
			if (result == null)
				result = caseAsn1Writer(simpleSizeConstrainedType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FrtypesPackage.NAMED_VALUE: {
			NamedValue namedValue = (NamedValue) theEObject;
			T result = caseNamedValue(namedValue);
			if (result == null)
				result = caseAsn1Writer(namedValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FrtypesPackage.STRUCTURED_SIZE_CONSTRAINED_TYPE: {
			StructuredSizeConstrainedType structuredSizeConstrainedType = (StructuredSizeConstrainedType) theEObject;
			T result = caseStructuredSizeConstrainedType(structuredSizeConstrainedType);
			if (result == null)
				result = caseStructuredType(structuredSizeConstrainedType);
			if (result == null)
				result = caseSizeConstrainedType(structuredSizeConstrainedType);
			if (result == null)
				result = caseType(structuredSizeConstrainedType);
			if (result == null)
				result = caseAsn1Writer(structuredSizeConstrainedType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FrtypesPackage.CHOICE: {
			Choice choice = (Choice) theEObject;
			T result = caseChoice(choice);
			if (result == null)
				result = caseStructuredDifferentType(choice);
			if (result == null)
				result = caseStructuredType(choice);
			if (result == null)
				result = caseType(choice);
			if (result == null)
				result = caseAsn1Writer(choice);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FrtypesPackage.TYPE_REFERENCE_LOCAL: {
			TypeReferenceLocal typeReferenceLocal = (TypeReferenceLocal) theEObject;
			T result = caseTypeReferenceLocal(typeReferenceLocal);
			if (result == null)
				result = caseType(typeReferenceLocal);
			if (result == null)
				result = caseAsn1Writer(typeReferenceLocal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FrtypesPackage.SINGLE_VALUE_CONSTRAINT: {
			SingleValueConstraint singleValueConstraint = (SingleValueConstraint) theEObject;
			T result = caseSingleValueConstraint(singleValueConstraint);
			if (result == null)
				result = caseConstraint(singleValueConstraint);
			if (result == null)
				result = caseAsn1Writer(singleValueConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FrtypesPackage.PERMITTED_ALPHABET_CONSTRAINT: {
			PermittedAlphabetConstraint permittedAlphabetConstraint = (PermittedAlphabetConstraint) theEObject;
			T result = casePermittedAlphabetConstraint(permittedAlphabetConstraint);
			if (result == null)
				result = caseConstraint(permittedAlphabetConstraint);
			if (result == null)
				result = caseAsn1Writer(permittedAlphabetConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FrtypesPackage.MODULE: {
			Module module = (Module) theEObject;
			T result = caseModule(module);
			if (result == null)
				result = caseAsn1Writer(module);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FrtypesPackage.OBJECT_IDENTIFIER: {
			ObjectIdentifier objectIdentifier = (ObjectIdentifier) theEObject;
			T result = caseObjectIdentifier(objectIdentifier);
			if (result == null)
				result = caseSimpleType(objectIdentifier);
			if (result == null)
				result = caseType(objectIdentifier);
			if (result == null)
				result = caseAsn1Writer(objectIdentifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FrtypesPackage.ELEMENT: {
			Element element = (Element) theEObject;
			T result = caseElement(element);
			if (result == null)
				result = caseType(element);
			if (result == null)
				result = caseAsn1Writer(element);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FrtypesPackage.TYPE_REFERENCE_EXTERNAL: {
			TypeReferenceExternal typeReferenceExternal = (TypeReferenceExternal) theEObject;
			T result = caseTypeReferenceExternal(typeReferenceExternal);
			if (result == null)
				result = caseType(typeReferenceExternal);
			if (result == null)
				result = caseAsn1Writer(typeReferenceExternal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FrtypesPackage.NULL: {
			Null null_ = (Null) theEObject;
			T result = caseNull(null_);
			if (result == null)
				result = caseSimpleType(null_);
			if (result == null)
				result = caseType(null_);
			if (result == null)
				result = caseAsn1Writer(null_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FrtypesPackage.ASN1_WRITER: {
			Asn1Writer asn1Writer = (Asn1Writer) theEObject;
			T result = caseAsn1Writer(asn1Writer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FrtypesPackage.SIZE_CONSTRAINED_TYPE: {
			SizeConstrainedType sizeConstrainedType = (SizeConstrainedType) theEObject;
			T result = caseSizeConstrainedType(sizeConstrainedType);
			if (result == null)
				result = caseAsn1Writer(sizeConstrainedType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FrtypesPackage.STRUCTURED_DIFFERENT_TYPE: {
			StructuredDifferentType structuredDifferentType = (StructuredDifferentType) theEObject;
			T result = caseStructuredDifferentType(structuredDifferentType);
			if (result == null)
				result = caseStructuredType(structuredDifferentType);
			if (result == null)
				result = caseType(structuredDifferentType);
			if (result == null)
				result = caseAsn1Writer(structuredDifferentType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FrtypesPackage.FROM_MODULE: {
			FromModule fromModule = (FromModule) theEObject;
			T result = caseFromModule(fromModule);
			if (result == null)
				result = caseAsn1Writer(fromModule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDefinition(TypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleType(SimpleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredType(StructuredType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean(ccsds.fr.type.model.frtypes.Boolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerType(IntegerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitString(BitString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Octet String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Octet String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOctetString(OctetString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReal(Real object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerated</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerated</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerated(Enumerated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacterString(CharacterString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequence(Sequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceOf(SequenceOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSet(Set object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetOf(SetOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Size Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Size Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSizeConstraint(SizeConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Range Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Range Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueRangeConstraint(ValueRangeConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleRangeType(SimpleRangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Size Constrained Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Size Constrained Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleSizeConstrainedType(SimpleSizeConstrainedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedValue(NamedValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Size Constrained Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Size Constrained Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredSizeConstrainedType(StructuredSizeConstrainedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoice(Choice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Reference Local</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Reference Local</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeReferenceLocal(TypeReferenceLocal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Value Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Value Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleValueConstraint(SingleValueConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Permitted Alphabet Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Permitted Alphabet Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePermittedAlphabetConstraint(PermittedAlphabetConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectIdentifier(ObjectIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Reference External</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Reference External</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeReferenceExternal(TypeReferenceExternal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNull(Null object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asn1 Writer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asn1 Writer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsn1Writer(Asn1Writer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Size Constrained Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Size Constrained Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSizeConstrainedType(SizeConstrainedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Different Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Different Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredDifferentType(StructuredDifferentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>From Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>From Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFromModule(FromModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FrtypesSwitch
