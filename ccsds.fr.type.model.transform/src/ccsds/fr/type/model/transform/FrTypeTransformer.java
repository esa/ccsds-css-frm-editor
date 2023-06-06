package ccsds.fr.type.model.transform;

import ccsds.fr.type.model.frtypes.Element;
import ccsds.fr.type.model.frtypes.Enumerated;
import ccsds.fr.type.model.frtypes.IntegerType;
import ccsds.fr.type.model.frtypes.NamedValue;
import ccsds.fr.type.model.frtypes.Null;
import ccsds.fr.type.model.frtypes.Module;
import ccsds.fr.type.model.frtypes.ObjectIdentifier;
import ccsds.fr.type.model.frtypes.OctetString;
import ccsds.fr.type.model.frtypes.Real;
import ccsds.fr.type.model.frtypes.Sequence;
import ccsds.fr.type.model.frtypes.SequenceOf;
import ccsds.fr.type.model.frtypes.Set;
import ccsds.fr.type.model.frtypes.SetOf;
import ccsds.fr.type.model.frtypes.SimpleRangeType;
import ccsds.fr.type.model.frtypes.StructuredDifferentType;
import ccsds.fr.type.model.frtypes.StructuredSizeConstrainedType;
import ccsds.fr.type.model.frtypes.BitString;
import ccsds.fr.type.model.frtypes.Boolean;
import ccsds.fr.type.model.frtypes.CharacterString;
import ccsds.fr.type.model.frtypes.Choice;
import ccsds.fr.type.model.frtypes.Type;
import ccsds.fr.type.model.frtypes.TypeDefinition;
import ccsds.fr.type.model.frtypes.TypeReferenceLocal;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

/**
 * Support to convert FR Type instances to corresponding ecore types 
 */
public class FrTypeTransformer {
	
	public static final String HTTP_ISO_ORG_DOD_CCSDS_FRI = "http://iso.org.dod.ccsds.fri";

	private static final String MAX = "max";

	private static final String MIN = "min";

	public static final String DOT = ".";

	private static final String VALUE = "value";

	private static final String FR_COMMON_PACKAGE_DEFAULT = "frm";
	
	private final String ePackageUriPrefix = "http://iso.org.dod.ccsds.frm.types";

	private final EClass nullClass;
	
	private final EClass objectIdentifierClass;
	
	private final EClass octetStringClass;
	
	private final EPackage topLevelPackage;
	
	private final EClass nullType;

	private final EClass booleanType;
	
	private final EClass objectIdentifierType;

	private final EClass realType;		
	
	private final EClass integerType;
	
	private final EClass enumeratedType;
	
	private final EClass bitStringType;
	
	private final EClass octetStringType;
	
	private final EClass characterStringType;
	
	private final EClass sequenceType;
	
	private final EClass setType;
	
	private final EClass choiceType;
	
	private final EClass sequenceOfType;
	
	private final EClass setOfType;
	
	/**
	 * Store the EClassifiers created for the Type objects for handling of local type references
	 */
	private final Map<TypeDefinition, EClassifier> typeDefinitions = new HashMap<TypeDefinition, EClassifier>();
	
	private final Map<String, EPackage> packages = new HashMap<String, EPackage>();
	
	private final Map<String, EClassifier> createdTypes = new HashMap<String, EClassifier>();

	public FrTypeTransformer(EPackage topLevelPackage) {
		this.topLevelPackage = topLevelPackage;
		EPackage interfaces = EcoreFactory.eINSTANCE.createEPackage();		
		interfaces.setName("interfaces");
		interfaces.setNsPrefix("interfaces");
		interfaces.setNsURI(HTTP_ISO_ORG_DOD_CCSDS_FRI + DOT + "interfaces"); 
		topLevelPackage.getESubpackages().add(interfaces);

		this.nullType = EcoreFactory.eINSTANCE.createEClass();
		this.nullType.setAbstract(true);
		this.nullType.setName("NullType");
		interfaces.getEClassifiers().add(this.nullType);

		this.booleanType = EcoreFactory.eINSTANCE.createEClass();
		this.booleanType.setAbstract(true);
		this.booleanType.setName("BooleanType");
		interfaces.getEClassifiers().add(this.booleanType);

		this.objectIdentifierType = EcoreFactory.eINSTANCE.createEClass();
		this.objectIdentifierType.setAbstract(true);
		this.objectIdentifierType.setName("ObjectIdentifierType");
		interfaces.getEClassifiers().add(this.objectIdentifierType);

		this.realType = EcoreFactory.eINSTANCE.createEClass();
		this.realType.setAbstract(true);
		this.realType.setName("RealType");
		interfaces.getEClassifiers().add(this.realType);

		this.integerType = EcoreFactory.eINSTANCE.createEClass();
		this.integerType.setAbstract(true);
		this.integerType.setName("IntegerType");
		interfaces.getEClassifiers().add(this.integerType);
		
		this.enumeratedType = EcoreFactory.eINSTANCE.createEClass();
		this.enumeratedType.setAbstract(true);
		this.enumeratedType.setName("EnumeratedType");
		interfaces.getEClassifiers().add(this.enumeratedType);
		
		this.bitStringType = EcoreFactory.eINSTANCE.createEClass();
		this.bitStringType.setAbstract(true);
		this.bitStringType.setName("BitStringType");
		interfaces.getEClassifiers().add(this.bitStringType);

		this.octetStringType = EcoreFactory.eINSTANCE.createEClass();
		this.octetStringType.setAbstract(true);
		this.octetStringType.setName("OctetStringType");
		interfaces.getEClassifiers().add(this.octetStringType);

		this.characterStringType = EcoreFactory.eINSTANCE.createEClass();
		this.characterStringType.setAbstract(true);
		this.characterStringType.setName("CharacterStringType");
		interfaces.getEClassifiers().add(this.characterStringType);

		this.sequenceType = EcoreFactory.eINSTANCE.createEClass();
		this.sequenceType.setAbstract(true);
		this.sequenceType.setName("SequenceType");
		interfaces.getEClassifiers().add(this.sequenceType);
		
		this.setType = EcoreFactory.eINSTANCE.createEClass();
		this.setType.setAbstract(true);
		this.setType.setName("SetType");
		interfaces.getEClassifiers().add(this.setType);
		
		this.choiceType = EcoreFactory.eINSTANCE.createEClass();
		this.choiceType.setAbstract(true);
		this.choiceType.setName("ChoiceType");
		interfaces.getEClassifiers().add(this.choiceType);
		
		this.sequenceOfType = EcoreFactory.eINSTANCE.createEClass();
		this.sequenceOfType.setAbstract(true);
		this.sequenceOfType.setName("SequenceOfType");
		interfaces.getEClassifiers().add(this.sequenceOfType);
		
		this.setOfType = EcoreFactory.eINSTANCE.createEClass();
		this.setOfType.setAbstract(true);
		this.setOfType.setName("SetOfType");
		interfaces.getEClassifiers().add(this.setOfType);				
		
		// create a Null class
		this.nullClass = EcoreFactory.eINSTANCE.createEClass();
		this.nullClass.setName("Null");
		this.nullClass.getESuperTypes().add(nullType);
		interfaces.getEClassifiers().add(nullClass);
		
		// create an Object Identifier Class
		this.objectIdentifierClass = EcoreFactory.eINSTANCE.createEClass();
		this.objectIdentifierClass.setName("ObjectIdentifier");
		this.objectIdentifierClass.getESuperTypes().add(objectIdentifierType);
		EAttribute oidBits = EcoreFactory.eINSTANCE.createEAttribute();
		oidBits.setName("oidBits");
		oidBits.setEType(EcorePackage.Literals.EINT);
		oidBits.setLowerBound(0);
		oidBits.setUpperBound(-1);
		this.objectIdentifierClass.getEStructuralFeatures().add(oidBits);
		interfaces.getEClassifiers().add(objectIdentifierClass);
		
		// create an Object Identifier Class
		this.octetStringClass = EcoreFactory.eINSTANCE.createEClass();
		this.octetStringClass.setName("OctetString");
		this.octetStringClass.getESuperTypes().add(octetStringType);
		EAttribute octets = EcoreFactory.eINSTANCE.createEAttribute();
		octets.setName("octets");
		octets.setEType(EcorePackage.Literals.EBYTE);
		octets.setLowerBound(0);
		octets.setUpperBound(-1);
		this.octetStringClass.getEStructuralFeatures().add(octets);
		interfaces.getEClassifiers().add(octetStringClass);		
		
}
	
	

	/**
	 * Create an ecore classifier for the given FR type definition
	 * @param frTypeDefinition	The type definition
	 * @param parentPackage		The package in which the created classifiers shall be created
	 * @return					The created classifier
	 * @throws Exception		Throw when for errors in the creation process
	 */
	public EClassifier getEcore(TypeDefinition frTypeDefinition, EPackage parentPackage) throws Exception {
		if(frTypeDefinition.eContainer() instanceof Module) {
			Module m = (Module)frTypeDefinition.eContainer();
			String commonPackage = FR_COMMON_PACKAGE_DEFAULT;
			if(m.getName() != null && m.getName().length() > 0) {
				commonPackage = m.getName();
			}
			
			if(packages.containsKey(commonPackage)) {
				parentPackage = packages.get(commonPackage);
			} else {
				EPackage p = EcoreFactory.eINSTANCE.createEPackage();
				p.setName(commonPackage);
				p.setNsPrefix(commonPackage);
				p.setNsURI(ePackageUriPrefix + DOT + commonPackage);
				packages.put(commonPackage, p);
				topLevelPackage.getESubpackages().add(p);
				parentPackage = p;
			}
		}

		// Type Definitions can be referenced. So return an eventually existing type definition
		if(typeDefinitions.containsKey(frTypeDefinition)) {
			return typeDefinitions.get(frTypeDefinition);
		} else {
			EPackage typeDefinitionPackage = parentPackage;
						
			EClassifier typeDefinitionEcore = getEcore(frTypeDefinition.getType(), frTypeDefinition.getName(), typeDefinitionPackage);
			typeDefinitions.put(frTypeDefinition, typeDefinitionEcore);
				
			return typeDefinitionEcore;
		}
		
	}	
	
	/**
	 * Creates an ecore class with a value attribute, which has the type of the local type reference
	 * @param frReferenceLocal	The local type reference, pointing to the referenced type
	 * @param name				The name of the class to be created
	 * @param parentPackage		The package in which the class shall be created
	 * @return					The created ecore class
	 * @throws Exception		Thrown in case an error occurred
	 */
	private EClass getEcore(TypeReferenceLocal frReferenceLocal, String name, EPackage parentPackage) throws Exception {
		EClassifier referencedType = getEcore(frReferenceLocal.getTypeDefinition(), parentPackage);
		
		EClass localTypeReferenceClass = createEClass(NameTool.wellFormed(name), parentPackage);
		createMember(localTypeReferenceClass, VALUE, referencedType, 1, 1);
		
		return localTypeReferenceClass;
	}
	
	/**
	 * Converts the given FR Type instance to an ecore class
	 * @param frType
	 * @param parentPackage
	 * @return
	 * @throws Exception
	 */
	private EClassifier getEcore(Type frType, String name, EPackage parentPackage) throws Exception {
		if(frType instanceof Element) {
			return getEcore((Element)frType, parentPackage);
		}  else if(frType instanceof Null) {
			return nullClass;
		} else if(frType instanceof ObjectIdentifier) {
			return objectIdentifierClass;
		} else if(frType instanceof Enumerated) {
			return getEcore((Enumerated)frType, name, parentPackage);
		} else if(frType instanceof IntegerType) {
			EClass c = getEcore(EcorePackage.Literals.EINT, name, parentPackage);
			c.getESuperTypes().add(integerType);
			addConstraints(c, (IntegerType)frType);
			return c;
		} else if(frType instanceof Boolean) {
			EClass c = getEcore(EcorePackage.Literals.EBOOLEAN, name, parentPackage); 
			c.getESuperTypes().add(booleanType);
			return c;
		} else if(frType instanceof Real) {
			EClass c = getEcore(EcorePackage.Literals.EDOUBLE, name, parentPackage);
			c.getESuperTypes().add(realType);
			addConstraints(c, (Real)frType);
			return c;
		} else if(frType instanceof CharacterString) {
			EClass c = getEcore(EcorePackage.Literals.ESTRING, name, parentPackage);
			c.getESuperTypes().add(characterStringType);
			return c;
		} else if(frType instanceof OctetString) {
			EClass c = getEcore(EcorePackage.Literals.EBYTE, name, parentPackage);
			c.getESuperTypes().add(octetStringType);
			return c;
		} else if(frType instanceof BitString) {
			EClass c = getEcore(EcorePackage.Literals.ESTRING, name, parentPackage);
			c.getESuperTypes().add(bitStringType);
			return c;
		} else if(frType instanceof Choice) {
			EClass c = getEcore((Choice)frType, name, parentPackage); 
			c.getESuperTypes().add(choiceType);
			return c;
		} else if(frType instanceof StructuredDifferentType) {
			EClass c = getEcore((StructuredDifferentType)frType, name, parentPackage);
			c.getESuperTypes().add(getTypeInterface(frType));
			return c;
		} else if(frType instanceof StructuredSizeConstrainedType) {
			EClass c = getEcore((StructuredSizeConstrainedType)frType, name, parentPackage);
			c.getESuperTypes().add(getTypeInterface(frType));
			return c;
		} else if(frType instanceof TypeReferenceLocal) {
			EClass c = getEcore((TypeReferenceLocal)frType, name, parentPackage);
			try {
				c.getESuperTypes().add(getTypeInterface(((TypeReferenceLocal)frType).getTypeDefinition().getType()));
			} catch(Exception e) {}
			return c;
		} else if(frType == null) {
			return null;
		}
		
		throw new Exception("Failed to convert unsupported type to ecore: " + frType);
	}

	/**
	 * Returns the type definition EClass for the given FR Type
	 * @param frType		The FR type
	 * @return				The corresponding ECLass type interface
	 * @throws Exception	Thrown if there is no type interface for the given FR Type
	 */
	private EClass getTypeInterface(Type frType) throws Exception {
		if(frType instanceof Boolean) {
			return booleanType;
		} else if(frType instanceof Null) {
			return nullType;
		} else if(frType instanceof ObjectIdentifier) {
			return objectIdentifierType;
		} else if(frType instanceof Real) {
			return realType;
		} else if(frType instanceof IntegerType) {
			return integerType;
		} else if(frType instanceof Enumerated) {
			return enumeratedType;
		}  else if(frType instanceof BitString) {
			return bitStringType;
		} else if(frType instanceof OctetString) {
			return octetStringType;
		} else if(frType instanceof CharacterString) {
			return characterStringType;
		} else if(frType instanceof Sequence) {
			return sequenceType;
		} else if(frType instanceof Set) {
			return setType;
		} else if(frType instanceof Choice) {
			return choiceType;
		} else if(frType instanceof SequenceOf) {
			return sequenceOfType;
		} else if(frType instanceof SetOf) {
			return setOfType;
		}
		
		
		throw new Exception("no type interface avilable for " + frType.getClass().getName());
	}
	
	/**
	 * Creates an eClass with the given name and a value attribute of the given data type
	 * @param dataType
	 * @param name
	 * @param parentPackage
	 * @return
	 * @throws Exception 
	 */
	private EClass getEcore(EDataType dataType, String name, EPackage parentPackage) throws Exception {
		EClass ecoreClass = createEClass(name, parentPackage);
		createMember(ecoreClass, VALUE, dataType, 1, 1);
		
		return ecoreClass;
	}
	
	/**
	 * Converts the given FR Type instance to an ecore class and adds it to the parent package
	 * @param frType			The FR type for which an ecore class shall be created
	 * @param parentPackage		The created ecore class is added to that package
	 * @return
	 */
	private EClass getEcore(Element frTypeElement, EPackage parentPackage) throws Exception {
		EClass elementClass = createEClass(frTypeElement.getName(), parentPackage);
		int lowerBound = 1;
		final int upperBound = 1;
				
		EClassifier valueClassifier = getEcore(frTypeElement.getType(), elementClass.getName() + "Value"
				, parentPackage);
		
		if(frTypeElement.isOptional()) {
			lowerBound = 0;
		}
				
		createMember(elementClass, VALUE, valueClassifier, lowerBound, upperBound);
		
		return elementClass;
	}
	
	/**
	 * Created an EEnum for the FR Enumerated type
	 * @param frEnumerated
	 * @param parentPackage
	 * @return The EENumerated
	 * @throws Exception if the name of the enum cannot be derived from a parent container of type Element
	 */
	private EClassifier getEcore(Enumerated frEnumerated, String name, EPackage parentPackage) throws Exception {
		EEnum enumClass = EcoreFactory.eINSTANCE.createEEnum();
		enumClass.setName(getUniqueName(parentPackage, name, enumClass));
			
		for(NamedValue nv : frEnumerated.getValues()) {
			EEnumLiteral el = EcoreFactory.eINSTANCE.createEEnumLiteral();
			el.setName(NameTool.wellFormed(nv.getName()));
			el.setValue(nv.getValue());
			enumClass.getELiterals().add(el);
		}
		
		parentPackage.getEClassifiers().add(enumClass);
		return enumClass;
	}
	
	/**
	 * Creates an ecore class corresponding to SET OF or SEQUENCE OF
	 * @param frStructuredDiffType		The type object for which the ecore class shall be generated
	 * @param name						The name to be used for the created ecore class
	 * @param parentPackage				The package holding the created types
	 * @return							The created ecore class
	 * @throws Exception				Thrown in case of error
	 */
	private EClass getEcore(StructuredDifferentType frStructuredDiffType, String name, EPackage parentPackage) throws Exception {
		EClass sequenceClass = createEClass(name, parentPackage);
		final EPackage subTypePackage = createPackage(parentPackage, name + "Types");
		
		int idx = 0;
		for(Type t : frStructuredDiffType.getElements()) {
			int lowerBound = 1;
			final int upperBound = 1;			
			String sequenceMemberName = NameTool.wellFormedLc(name + "Seq" + idx);
			
			if(t instanceof Element &&
					((Element)t).isOptional() == true) {
				lowerBound = 0;
				sequenceMemberName = NameTool.wellFormed(((Element)t).getName());
			} else if(t instanceof Element) {
				sequenceMemberName = NameTool.wellFormedLc(((Element)t).getName());
				
			}
			
			EClassifier valueType = getEcore(t, sequenceMemberName, subTypePackage);					
			createMember(sequenceClass, sequenceMemberName, valueType, lowerBound, upperBound);
			
			idx++;
		}
			
		return sequenceClass;
	}
	
	/**
	 * Creates a class corresponding to the structured size constrained type. A value attribute will represent the contained types.
	 * @param frSizeConstrainedType		The type object for which the ecore class shall be generated
	 * @param name						The name to be used for the created ecore class
	 * @param parentPackage				The package holding the created types
	 * @return							The created ecore class
	 * @throws Exception				Thrown in case of error
	 */
	private EClass getEcore(StructuredSizeConstrainedType frSizeConstrainedType, String name, EPackage parentPackage) throws Exception {
		EClass sequenceClass = createEClass(name, parentPackage);
		final EPackage subTypePackage = createPackage(parentPackage, name + "Types");
		
		if(frSizeConstrainedType.getElements() != null) {
			EClassifier subType = getEcore(frSizeConstrainedType.getElements(), name + "Item", subTypePackage);
			
			long lowerBound = 0;
			long upperBound = -1; 
			if(frSizeConstrainedType.getSizeConstraint() != null && frSizeConstrainedType.getSizeConstraint().size() > 0 &&
					frSizeConstrainedType.getSizeConstraint().get(0) != null) {
				lowerBound = frSizeConstrainedType.getSizeConstraint().get(0).getMin();
				upperBound = frSizeConstrainedType.getSizeConstraint().get(0).getMax();
			}
			
			createMember(sequenceClass, VALUE, subType, (int)lowerBound, (int)upperBound);
		}
		
		return sequenceClass;
	}
	
	/**
	 * Creates an ecore class for the given FR Choice
	 * @param frChoice			The choice giving the structure
	 * @param name				The name to be used for the choice ecore class
	 * @param parentPackage		The package in which the class is created
	 * @return					The created ecore class
	 * @throws Exception		If child elements of the choice are not of type element, an exception is thrown
	 */
	private EClass getEcore(Choice frChoice, String name, EPackage parentPackage) throws Exception {
		EClass choiceClass = createEClass(name, parentPackage);
		final EPackage subTypePackage = createPackage(parentPackage, name + "Choices");
		
		// create a base class for the elements of CHOICE		
		EClass sequenceChoiceBase = createEClass(name + "Base", parentPackage);
		sequenceChoiceBase.setAbstract(true);

		// create an attribute of the base type for the choice class
		createMember(choiceClass, NameTool.wellFormedLc(sequenceChoiceBase.getName()), sequenceChoiceBase, 1, 1);
		
		// create class for the elements of the choice and let them inherit the base class - only Element is supported with CHOICE!
		for(Type t : frChoice.getElements()) {
			if(t instanceof Element) {
				Element e = (Element)t;
				EClass sequenceChoice = getEcore(e, subTypePackage);
				sequenceChoice.getESuperTypes().add(sequenceChoiceBase);				
				
			} else {
				throw new Exception("Unsupported choice element (not Element of type): " + t);
			}
		}
				
		return choiceClass;		
	}
	
	/**
	 * Creates an ecore class according to the given name and adds it to the parent package
	 * @param name		The name used as a basis for the class name (made well-formed)
	 * @return			The created class
	 */
	private EClass createEClass(String name, EPackage parentPackage) {
		EClass eClass = EcoreFactory.eINSTANCE.createEClass();
		eClass.setName(name);
		eClass.setName(getUniqueName(parentPackage, name, eClass));
		parentPackage.getEClassifiers().add(eClass);		
		
		return eClass;
	}
	
	/**
	 * Returns a unique well-formed name for a class of a the given package
	 * @param p		The package of the class
	 * @param c		The class for which a 
	 * @return		The unique well formed name of the class
	 */
	private String getUniqueName(EPackage p, String name, EClassifier c) {
		String wellFormedName = NameTool.wellFormed(name);
		String fqName = getFqPackageName(p) + DOT + wellFormedName;
		
		// make the name unique by adding a number at the end
		int idx = 0;
		while(this.createdTypes.containsKey(fqName) == true) {
			wellFormedName = wellFormedName + idx;
			fqName = getFqPackageName(p) + wellFormedName;
		}
		
		System.out.println("Created " + c.getClass().getSimpleName() + " with name " + fqName);
		this.createdTypes.put(fqName, c);
		
		c.setName(wellFormedName);
		return wellFormedName;
	}
	
	/**
	 * Returns the full qualified name of the package. Names of parent package are prepended and separated by '.'.
	 * @param p		The package for which the full qualified name shall be constructed.
	 * @return		the full qualified name
	 */
	private String getFqPackageName(EPackage p) {
		String pn = p.getName();
		if(p.getESuperPackage() != null) {
			pn = getFqPackageName(p.getESuperPackage()) + DOT + pn;
		}
		return pn;
	}
	
	private void addConstraints(EClass c, SimpleRangeType type) {
		if(type.getRangeConstraint() == null || type.getRangeConstraint().size() == 0) {
			return;
		}

		try {

			EClassifier tc = EcorePackage.Literals.ELONG;
			Object minValue = null;
			Object maxValue = null;
			
			if(type instanceof IntegerType) {
				minValue =  Long.valueOf(type.getRangeConstraint().get(0).getMin());
				maxValue =  Long.valueOf(type.getRangeConstraint().get(0).getMax());
			} else if(type instanceof Real) {
				tc = EcorePackage.Literals.EDOUBLE;
				minValue =  Double.valueOf(type.getRangeConstraint().get(0).getMin());
				maxValue =  Double.valueOf(type.getRangeConstraint().get(0).getMax());				
			}
		
			EAttribute min = EcoreFactory.eINSTANCE.createEAttribute();
			min.setEType(tc);
			min.setName(MIN);
			min.setUnsettable(true);
			min.setDefaultValue(minValue);
			c.getEStructuralFeatures().add(min);
			
			EAttribute max = EcoreFactory.eINSTANCE.createEAttribute();
			max.setEType(tc);
			max.setName(MAX);
			max.setUnsettable(true);
			max.setDefaultValue(maxValue);
			c.getEStructuralFeatures().add(max);										
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Creates the right type of member for the given member type in parent. If value is an EDataType, an attribute is created.
	 * If value is an EClass, a reference is created.
	 * @param parent		The parent class, for which the member shall be generated
	 * @param name			The name of the member
	 * @param memberType	The type of the member
	 * @param lowerBound	The lower bound of the member
	 * @param upperBound	The upper bound of the member
	 * @return				The created member
	 * @throws Exception	If memberType is not an EClass or an EDataType, an exception is thrown 
	 */
	private EStructuralFeature createMember(final EClass parent, String name, EClassifier memberType, int lowerBound, int upperBound) throws Exception {
		EStructuralFeature member = null;
		
		if(memberType instanceof EClass) {
			member = EcoreFactory.eINSTANCE.createEReference();
			((EReference)member).setContainment(true);
		} else if(memberType instanceof EDataType) {
			member = EcoreFactory.eINSTANCE.createEAttribute();
		}
		
		if(member == null) {
			throw new Exception("cannot create member for unsupported type: " + memberType);
		}
		
		member.setName(name);
		member.setLowerBound(lowerBound);
		member.setUpperBound(upperBound);
		member.setEType(memberType);
		
		parent.getEStructuralFeatures().add(member);
		
		return member;
	}
	
	/**
	 * Creates a new package with the gven name. The package NS URI will be hierarchically constructed from the parent packages
	 * @param parentPackage		The parent package of the created package, the created package will be set as a sub package
	 * @param name				The name of the crated package
	 * @return					The created package
	 */
	private EPackage createPackage(EPackage parentPackage, String name) {
		EPackage subPackage = EcoreFactory.eINSTANCE.createEPackage();
		subPackage.setName(name);
		subPackage.setNsPrefix(name);
		StringBuffer nsUri  = new StringBuffer();
		parentPackage.getESubpackages().add(subPackage);
		
		while(parentPackage != null) {
			nsUri.append(DOT + parentPackage.getName());			
			parentPackage = parentPackage.getESuperPackage();
		}
		
		subPackage.setNsURI(HTTP_ISO_ORG_DOD_CCSDS_FRI + nsUri.toString() + DOT + name);
		
		return subPackage;
	}
}
