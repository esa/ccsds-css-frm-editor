package ccsds.fr.type.model.transform.test;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import ccsds.fr.type.model.frtypes.Choice;
import ccsds.fr.type.model.frtypes.Element;
import ccsds.fr.type.model.frtypes.Enumerated;
import ccsds.fr.type.model.frtypes.FrtypesFactory;
import ccsds.fr.type.model.frtypes.IntegerType;
import ccsds.fr.type.model.frtypes.Module;
import ccsds.fr.type.model.frtypes.NamedValue;
import ccsds.fr.type.model.frtypes.Sequence;
import ccsds.fr.type.model.frtypes.SequenceOf;
import ccsds.fr.type.model.frtypes.SizeConstraint;
import ccsds.fr.type.model.frtypes.TypeDefinition;
import ccsds.fr.type.model.frtypes.TypeReferenceLocal;
import ccsds.fr.type.model.frtypes.ValueRangeConstraint;
import ccsds.fr.type.model.transform.FrTypeTransformer;

public class TestFrTypeTransform {

	private static EPackage ecorePackage;
	private static FrTypeTransformer frTtoEcore;

	@BeforeClass
	public static void setup() {
		ecorePackage = EcoreFactory.eINSTANCE.createEPackage();
		ecorePackage.setName("TestPackage");
		ecorePackage.setNsPrefix("tst");
		ecorePackage.setNsURI("fr.test");
		
		frTtoEcore = new FrTypeTransformer(ecorePackage);
	}
	
	@AfterClass
	public static void saveEcore() {
		// save the new ecore model
		ResourceSet metaResourceSet = new ResourceSetImpl();
		
		//Register XML Factory implementation to handle .ecore files			
		metaResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
		    "ecore", new  XMLResourceFactoryImpl());

		String fileName = "/tmp/test.ecore";
		Resource metaResource = metaResourceSet.createResource(URI.createURI(fileName));

		// Add bookStoreEPackage to contents list of the resource 
		metaResource.getContents().add(ecorePackage);

		// save the ecore model
		try {
		     metaResource.save(null);
		     //System.out.println("Created " + fileName);			     
		} catch (IOException e) {				
			e.printStackTrace();
			System.err.println("Failed to created " + fileName);
		}		
	}
	
	private EAttribute getAttribute(String name, EClass ecoreClass) {
		return (EAttribute)ecoreClass.getEStructuralFeature(name);
	}
	
	@Test
	public void testIntegerTypeTransform() throws Exception {
		final String name = "IntegerTypeDefinition";
		TypeDefinition integerTypeDef = FrtypesFactory.eINSTANCE.createTypeDefinition();
		integerTypeDef.setName(name);
		IntegerType integerType = FrtypesFactory.eINSTANCE.createIntegerType();
		integerTypeDef.setType(integerType);
		
		ValueRangeConstraint vc = FrtypesFactory.eINSTANCE.createValueRangeConstraint();
		vc.setMin("5");
		vc.setMax("10");
		integerType.getRangeConstraint().add(vc);
		
		EClassifier ecoreClass = frTtoEcore.getEcore(integerTypeDef, createPackage("IntegerTest"));
		assert(ecoreClass instanceof EClass);
		assert(ecoreClass.getName().equals(name));
		assert(getAttribute("value", (EClass)ecoreClass).getLowerBound() == 1);
		assert(getAttribute("value", (EClass)ecoreClass).getUpperBound() == 1);
	}
		
	private Enumerated createEnumTestType() {
		Enumerated e = FrtypesFactory.eINSTANCE.createEnumerated();
		NamedValue nv = FrtypesFactory.eINSTANCE.createNamedValue();
		nv.setName("enumValue1");
		nv.setValue(0);
		e.getValues().add(EcoreUtil.copy(nv));
		nv.setName("enumValue2");
		nv.setValue(1);
		e.getValues().add(EcoreUtil.copy(nv));
		
		return e;
	}
	
	/**
	 * Creates a package with the given name and adds the created package to this.ecorePackage
	 * @param name
	 * @return
	 */
	private EPackage createPackage(String name) {
		EPackage p = EcoreFactory.eINSTANCE.createEPackage();
		p.setName(name);
		ecorePackage.getESubpackages().add(p);
		
		return p;
	}
	
	@Test
	public void testEnumTypeTransform() throws Exception {
		final String name = "EnumTypeDefinition";
		TypeDefinition enumType = FrtypesFactory.eINSTANCE.createTypeDefinition();
		enumType.setName(name);
		enumType.setType(createEnumTestType());
		
		EClassifier ecoreClass = frTtoEcore.getEcore(enumType, createPackage("EnumTest"));
		assert(ecoreClass.getName().equals(name));
		assert(ecoreClass instanceof EEnum);
		assert(((EEnum)ecoreClass).getEEnumLiteral("EnumValue1").getValue() == 0);
		assert(((EEnum)ecoreClass).getEEnumLiteral("EnumValue2").getValue() == 1);
	}
	
	@Test
	public void testChoiceTypeDefinition() throws Exception {
		final String name = "ChoiceTypeDefinition";
		TypeDefinition choiceType = FrtypesFactory.eINSTANCE.createTypeDefinition();
		choiceType.setName(name);
		choiceType.setType(FrtypesFactory.eINSTANCE.createIntegerType());
		
		Choice c = FrtypesFactory.eINSTANCE.createChoice();
		choiceType.setType(c);
		
		Element integerChoice = FrtypesFactory.eINSTANCE.createElement();
		integerChoice.setName("integerChoice");
		integerChoice.setType(FrtypesFactory.eINSTANCE.createIntegerType());
		c.getElements().add(integerChoice);
		
		Element enumChoice = FrtypesFactory.eINSTANCE.createElement();
		enumChoice.setName("enumChoice");
		enumChoice.setType(createEnumTestType());
		c.getElements().add(enumChoice);
		
		EClassifier ecoreClass = frTtoEcore.getEcore(choiceType, createPackage("ChoiceTest"));
		assert(ecoreClass instanceof EClass);		
	}
	
	@Test
	public void testLocalTypeReference() throws Exception {
		Module testModule = FrtypesFactory.eINSTANCE.createModule();
		testModule.setName("CommonTypes");
		
		final String name = "ReferencedTypeDefinition";
		TypeDefinition referencedTypeDefinition = FrtypesFactory.eINSTANCE.createTypeDefinition();
		referencedTypeDefinition.setName(name);		
		referencedTypeDefinition.setType(FrtypesFactory.eINSTANCE.createIntegerType());		
		testModule.getTypeDefinition().add(referencedTypeDefinition);
		
		TypeDefinition localTypeReferenceDefinition = FrtypesFactory.eINSTANCE.createTypeDefinition();
		TypeReferenceLocal localTypeReference = FrtypesFactory.eINSTANCE.createTypeReferenceLocal();
		
		localTypeReference.setTypeDefinition(referencedTypeDefinition);
		localTypeReferenceDefinition.setName("TestLocalTypeReference");
		localTypeReferenceDefinition.setType(localTypeReference);
		
		frTtoEcore.getEcore(localTypeReferenceDefinition, createPackage("LocalTypeReferenceTest"));
	}
	
	@Test
	public void testSequenceOfSequence() throws Exception {
		final String name = "TestSequenceOfSequenceTypeDefinition";
		TypeDefinition sequenceOfSequenceType = FrtypesFactory.eINSTANCE.createTypeDefinition();
		sequenceOfSequenceType.setName(name);
		
		SequenceOf sequenceOf = FrtypesFactory.eINSTANCE.createSequenceOf();
		Sequence sequence = FrtypesFactory.eINSTANCE.createSequence();
		sequence.getElements().add(createEnumTestType());
		sequence.getElements().add(FrtypesFactory.eINSTANCE.createIntegerType());
		
		sequenceOf.setElements(sequence);
		sequenceOfSequenceType.setType(sequenceOf);
		
		SizeConstraint sizeConstraint = FrtypesFactory.eINSTANCE.createSizeConstraint();
		sizeConstraint.setMin(2);
		sizeConstraint.setMax(5);
		
		sequenceOf.getSizeConstraint().add(sizeConstraint);
		
		frTtoEcore.getEcore(sequenceOfSequenceType, createPackage("SequenceOfSequenceTypeTest"));
	}
}
