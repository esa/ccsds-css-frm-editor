package ccsds.tranform;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;

import ccsds.FunctionalResourceModel.Directive;
import ccsds.FunctionalResourceModel.Event;
import ccsds.FunctionalResourceModel.FunctionalResource;
import ccsds.FunctionalResourceModel.FunctionalResourceModel;
import ccsds.FunctionalResourceModel.Parameter;
import ccsds.FunctionalResourceModel.provider.FunctionalResourceModelItemProviderAdapterFactory;

/**
 * Transforms a Functional Resource Model to the corresponding ecore model for instances
 * of the Functional Resource Model.
 */
public class FrModelTransformation {
	
	private EcoreFactory theCoreFactory;
	private EClass functionalresourceInstanceClass;
	private EPackage friPackage;
	private EClass srvUserClass;
	private EClass entityMgmtClass;

	public FrModelTransformation() {
		theCoreFactory = EcoreFactory.eINSTANCE;
	}
	
	/**
	 * Transforms a Functional Resource Model to the corresponding ecore model for instances
	 * of the Functional Resource Model.
	 * @param frModelFile
	 * @return
	 */
	public boolean transformFrModel(IFile frModelFile) {
		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		adapterFactory
				.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new FunctionalResourceModelItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		AdapterFactoryEditingDomain domain = new AdapterFactoryEditingDomain(
				adapterFactory, new BasicCommandStack() /* we will not need the cmd stack... */ );

		Resource resource = domain.createResource(frModelFile.getFullPath()
				.toString());
		try {
			resource.load(null);
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		
		try {
			FunctionalResourceModel frm = (FunctionalResourceModel)resource.getContents().get(0);
			
			friPackage = createEPackage();
			
			// create globally needed classes and make them available to the ecore package and the transformation
			functionalresourceInstanceClass = createFunctionalResourceInstance();

			// create a service user class needed for modelling
			srvUserClass = createServiceUser();
			
			// create the entity management class
			entityMgmtClass = createEntityMgmntClass();
			
			// create the top-level classes complex and network
			EClass complexClass = createComplexClass();			
			createNetworkClass(complexClass);
			
			// iterate over the functional resource model and map to target ecore elements (classes)
			for(FunctionalResource fr : frm.getFunctionalResource()) {
				createDerivedFrInstance(fr, complexClass);
			}
		
			createDependencyForUse(frm, friPackage);
			
			// save the new ecore model
			ResourceSet metaResourceSet = new ResourceSetImpl();
			
			//Register XML Factory implementation to handle .ecore files			
			metaResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
			    "ecore", new  XMLResourceFactoryImpl());

			// Create empty resource with the given URI
			String fileName = frModelFile.getFullPath().removeFileExtension().toString() + ".ecore";			
			Resource metaResource = metaResourceSet.createResource(URI.createURI(fileName));

			// Add bookStoreEPackage to contents list of the resource 
			metaResource.getContents().add(friPackage);

			// save the ecore model
			try {
			     metaResource.save(null);
			     System.out.println("Created " + fileName);			     
			     return true;
			} catch (IOException e) {				
				e.printStackTrace();
				System.err.println("Failed to created " + fileName);
			}			
			
			
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
		return false;
	}
	
	/**
	 * Creates an ecore package for functional resource instance models
	 * @return the created EPackage object
	 */
	private EPackage createEPackage() {

		/*
		* Instantiate EPackage and provide unique URI
		* to identify this package
		*/
		EPackage friPacakge = theCoreFactory.createEPackage();
		friPacakge.setName("FunctionalResourceModelInstance");
		friPacakge.setNsPrefix("fri");
		friPacakge.setNsURI("http://iso.org.dod.ccsds.fri");
		
		return friPacakge;
	}
	
	private EClass createFunctionalResourceInstance() {
		EClass frInstance = theCoreFactory.createEClass();
		frInstance.setName("FunctionalResourceInstance");
		
		friPackage.getEClassifiers().add(frInstance);
		return frInstance;
	}
	
	/**
	 * Creates a Functional resource Instance derived from functionalresourceInstanceClass EClass according to the FunctionalResource
	 * and add it to the the given package
	 * @param friPackage 	the package to which the created class is added
	 * @param fr			the FunctionalResource used as a template for the new class.
	 * @param complexClass 
	 * @return 
	 */
	private EClass createDerivedFrInstance(FunctionalResource fr, EClass complexClass) {
		
		EClass frInstanceClass = theCoreFactory.createEClass();
		frInstanceClass.setName(wellFormed(fr.getName()));
		frInstanceClass.getESuperTypes().add(functionalresourceInstanceClass);

		EAttribute instanceNo = theCoreFactory.createEAttribute();
		instanceNo.setName("instanceNumber");
		instanceNo.setEType(EcorePackage.eINSTANCE.getEInt());
		instanceNo.setLowerBound(1);			
		instanceNo.setUpperBound(1);
		frInstanceClass.getEStructuralFeatures().add(instanceNo);

		// semanticDescrAttr here or in parent? here we can add a meaningful default - could it be an annotation?
		EAttribute semanticDescrAttr = theCoreFactory.createEAttribute();
		semanticDescrAttr.setName("description");
		semanticDescrAttr.setEType(EcorePackage.eINSTANCE.getEString());		
		semanticDescrAttr.setDefaultValueLiteral(fr.getSemanticDefinition());		
		semanticDescrAttr.setUpperBound(1);
		frInstanceClass.getEStructuralFeatures().add(semanticDescrAttr);
				
		//createManagementClass(fr, frInstanceClass);
		List<EClass> paramClasses = createParamClasses(frInstanceClass, fr.getParameter());
		addParametersToFri(frInstanceClass, paramClasses);

		// add an attribute of the created FRI type to the complex class
		EReference frList = theCoreFactory.createEReference();
		frList.setName(wellFormed(fr.getName()));
		frList.setEType(frInstanceClass);
		frList.setLowerBound(0); 
		frList.setUpperBound(EStructuralFeature.UNBOUNDED_MULTIPLICITY);
		frList.setContainment(true);
		
		complexClass.getEStructuralFeatures().add(frList);
		
		friPackage.getEClassifiers().add(frInstanceClass);
		
		return frInstanceClass;
	}
	
	/**
	 * Create a parameter class according to the given parameter list
	 * @param parameters
	 * @return
	 */
	private List<EClass> createParamClasses(EClass parent, EList<Parameter> parameters) {
		List<EClass> createdClasses = new ArrayList<EClass>();
		for(Parameter parameter : parameters) {
			String paramName = getUniqueClassifierName(parent.getName(), wellFormed(parameter.getName()));
			EClass paramClass = theCoreFactory.createEClass();
			paramClass.setName(paramName);
			
			EAttribute semanticDescrAttr = theCoreFactory.createEAttribute();
			semanticDescrAttr.setName("description");
			semanticDescrAttr.setEType(EcorePackage.eINSTANCE.getEString());		
			semanticDescrAttr.setDefaultValueLiteral(parameter.getSemanticDefinition());		
			semanticDescrAttr.setUpperBound(1);
			paramClass.getEStructuralFeatures().add(semanticDescrAttr);
			
			EAttribute typeAttr = theCoreFactory.createEAttribute();
			typeAttr.setName("type");
			typeAttr.setEType(EcorePackage.eINSTANCE.getEString());		
			typeAttr.setDefaultValueLiteral(parameter.getTypeDefinition());		
			typeAttr.setUpperBound(1);
			paramClass.getEStructuralFeatures().add(typeAttr);

			EAttribute valueAttr = theCoreFactory.createEAttribute();
			valueAttr.setName("value");
			valueAttr.setEType(EcorePackage.eINSTANCE.getEString()); // what type to use? we cannot (easily) understand / translate the ASN.1 type definition		
			//valueAttr.setDefaultValueLiteral(parameter.getTypeDefinition());		
			valueAttr.setUpperBound(1);
			paramClass.getEStructuralFeatures().add(valueAttr);			

			EAttribute monitorAttr = theCoreFactory.createEAttribute();
			monitorAttr.setName("monitored");
			monitorAttr.setEType(EcorePackage.eINSTANCE.getEBoolean());		
			monitorAttr.setDefaultValue(parameter.isMonitored());
			monitorAttr.setChangeable(false);
			monitorAttr.setUpperBound(1);
			paramClass.getEStructuralFeatures().add(monitorAttr);			
			
//			EAttribute controlledAttr = theCoreFactory.createEAttribute();
//			controlledAttr.setName("controlled");
//			controlledAttr.setEType(EcorePackage.eINSTANCE.getEBoolean());		
//			controlledAttr.setDefaultValue(parameter.isControlled());		
//			controlledAttr.setChangeable(false);
//			controlledAttr.setUpperBound(1);
//			paramClass.getEStructuralFeatures().add(controlledAttr);			

			EAttribute configAttr = theCoreFactory.createEAttribute();
			configAttr.setName("configured");
			configAttr.setEType(EcorePackage.eINSTANCE.getEBoolean());		
			configAttr.setDefaultValue(parameter.isConfigured());
			configAttr.setChangeable(false);
			configAttr.setUpperBound(1);
			paramClass.getEStructuralFeatures().add(configAttr);			
			
			createdClasses.add(paramClass);
			friPackage.getEClassifiers().add(paramClass);
		}
		return createdClasses;
	}
	
	/**
	 * Adds the given attributes with the type of the given classes to the class.
	 * @param theClass		the class for which the attributes are added
	 * @param paramClasses  the classes providing the attribute types
	 */
	private void addParametersToFri(EClass theClass, List<EClass> paramClasses) {
		for(EClass paramClass : paramClasses) {
//	attributes are not suitable for complex types
//			EAttribute paramAttr = theCoreFactory.createEAttribute();			
//			paramAttr.setName(Character.toLowerCase(aClass.getName().charAt(0)) + aClass.getName().substring(1));	
//			paramAttr.setEType(aClass);			
//			paramAttr.setUpperBound(1);
//			System.out.println("Add attribute " + paramAttr.getName() + " for " + theClass.getName());
//			theClass.getEStructuralFeatures().add(paramAttr);
			try {
					EReference paramRef = theCoreFactory.createEReference();
					paramRef.setName(Character.toLowerCase(paramClass.getName().charAt(0)) + paramClass.getName().substring(1));
					//paramRef.setName("param" + paramClass.getName());
					paramRef.setLowerBound(1);
					paramRef.setUpperBound(1);
					paramRef.setEType(paramClass);
					paramRef.setContainment(true);
					System.out.println("Add param ref " + paramRef.getName() + " for " + theClass.getName());
					theClass.getEStructuralFeatures().add(paramRef);	
			}									
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Create the a dependency for each uses relations as expressed in the frm 
	 * for the created FunctionalresourceInstanceClasses
	 * @param frm
	 * @param theFriPackage
	 */
	private void createDependencyForUse(FunctionalResourceModel frm, EPackage theFriPackage) {
		for(FunctionalResource fr : frm.getFunctionalResource()) {
			EClass refSource = getClassByName(wellFormed(fr.getName()));
			for(FunctionalResource usedFr : fr.getUses()) {
				try {
					EClass refTarget = getClassByName(wellFormed(usedFr.getName()));
					if(refSource != null && refTarget != null) {
						EReference usesRef = theCoreFactory.createEReference();
						usesRef.setName("uses");
						usesRef.setLowerBound(1);
						usesRef.setUpperBound(1);
						usesRef.setEType(refTarget);
						usesRef.setContainment(false);
						refSource.getEStructuralFeatures().add(usesRef);							
					}						
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * Returns the EClass of the given name from friPackage
	 * @param name
	 * @return
	 */
	private EClass getClassByName(String name) {
		EClassifier cl = friPackage.getEClassifier(name);
		if(cl != null && cl instanceof EClass)
			return (EClass)cl;
	
		return null;
	}
	
	/**
	 * Creates a class for a network. For our purposes the network has a name
	 * and a number of complexes.
	 * @param complexClass
	 * @return
	 */
	private EClass createNetworkClass(EClass complexClass) {
		EClass networkClass = theCoreFactory.createEClass();		
		friPackage.getEClassifiers().add(networkClass);
		networkClass.setName("Network");
		EAttribute attr = theCoreFactory.createEAttribute();
		attr.setName("NetworkName");
		attr.setLowerBound(1);
		attr.setUpperBound(1);
		attr.setEType(EcorePackage.eINSTANCE.getEString());
		networkClass.getEStructuralFeatures().add(attr);
		
		EReference complexRef = theCoreFactory.createEReference();
		complexRef.setName("ComplexList");
		complexRef.setLowerBound(0);
		complexRef.setUpperBound(EStructuralFeature.UNBOUNDED_MULTIPLICITY);
		complexRef.setEType(complexClass);
		complexRef.setContainment(true);
		networkClass.getEStructuralFeatures().add(complexRef);		
		
		return networkClass;
		
	}
	
	/**
	 * Creates a complex class, which can host functional resources
	 * @return 
	 */
	private EClass createComplexClass() {
		EClass complexClass = theCoreFactory.createEClass();		
		friPackage.getEClassifiers().add(complexClass);
		complexClass.setName("Complex");
		EAttribute attr = theCoreFactory.createEAttribute();
		attr.setName("ComplexName");
		attr.setLowerBound(0);
		attr.setUpperBound(-1);
		attr.setEType(EcorePackage.eINSTANCE.getEString());
		complexClass.getEStructuralFeatures().add(attr);
		
		return complexClass;
	}
	
	/**
	 * Creates a service user class
	 * @return 
	 */
	private EClass createServiceUser() {
		EClass srvUserClass = theCoreFactory.createEClass();
		friPackage.getEClassifiers().add(srvUserClass);
		srvUserClass.setName("ServiceUser");
		EAttribute attr = theCoreFactory.createEAttribute();
		attr.setName("ServiceUserName");
		attr.setLowerBound(0);
		attr.setUpperBound(-1);
		attr.setEType(EcorePackage.eINSTANCE.getEString());
		srvUserClass.getEStructuralFeatures().add(attr);
		
		return srvUserClass;
	}
	
	/**
	 * Creates the access management class
	 * @return 
	 */
	private EClass createEntityMgmntClass() {
		EClass entityMgmntClass = theCoreFactory.createEClass();
		friPackage.getEClassifiers().add(entityMgmntClass);
		entityMgmntClass.setName("EntityMgmnt");

		EAttribute attr = theCoreFactory.createEAttribute();
		attr.setName("Support");
		attr.setEType(EcorePackage.eINSTANCE.getEBoolean());
		attr.setDefaultValueLiteral("true"); // TBC
		attr.setEType(EcorePackage.eINSTANCE.getEBoolean());
		attr.setLowerBound(1);			
		attr.setUpperBound(1);			
		attr.setDefaultValueLiteral("true");
		entityMgmntClass.getEStructuralFeatures().add(attr);

		EReference srvUsers = theCoreFactory.createEReference();
		srvUsers.setName("Access");
		srvUsers.setEType(srvUserClass);
		srvUsers.setLowerBound(0); 
		srvUsers.setUpperBound(EStructuralFeature.UNBOUNDED_MULTIPLICITY);
		srvUsers.setContainment(true);
		entityMgmntClass.getEStructuralFeatures().add(srvUsers);						
		
		return entityMgmntClass;
	}	
	
	/**
	 * Creates for each parameter of the given functional resource
	 * an attribute indicating support capabilities and adds to the FR
	 * Note: In a similar way one could create a sort of runtime model containing the monitored values
	 * @param fr				The functional resource (input) with parameters
	 * @param frInstanceClass	The functional resource instance class which is extended by the attributes  
	 */
//	private void createManagementClass(FunctionalResource fr, EClass frInstanceClass) {		
//		for(Parameter p : fr.getParameter()) {
//			EReference mgmntRef = theCoreFactory.createEReference();
//			mgmntRef.setName("Parameter"+ wellFormed(p.getName()));
//			mgmntRef.setEType(entityMgmtClass);
//			mgmntRef.setLowerBound(1); 
//			mgmntRef.setUpperBound(1);
//			mgmntRef.setContainment(true);
//			
//			frInstanceClass.getEStructuralFeatures().add(mgmntRef);
//		}
//		
//		for(Directive d : fr.getDirectives()) {
//			EReference mgmntRef = theCoreFactory.createEReference();
//			mgmntRef.setName("Directive"+ wellFormed(d.getName()));
//			mgmntRef.setEType(entityMgmtClass);
//			mgmntRef.setLowerBound(1); 
//			mgmntRef.setUpperBound(1);
//			mgmntRef.setContainment(true);
//			
//			frInstanceClass.getEStructuralFeatures().add(mgmntRef);
//		}
//
//		for(Event e : fr.getEvents()) {
//			EReference mgmntRef = theCoreFactory.createEReference();
//			mgmntRef.setName("Event"+ wellFormed(e.getName()));
//			mgmntRef.setEType(entityMgmtClass);
//			mgmntRef.setLowerBound(1); 
//			mgmntRef.setUpperBound(1);
//			mgmntRef.setContainment(true);
//			
//			frInstanceClass.getEStructuralFeatures().add(mgmntRef);
//		}
//		
//	}

	/**
	 * Returns a classifier name which is valid within the fro package.
	 * Uniqueness is achieved by adding 2..n for duplicated names.
	 * @param name the name to make unique.
	 * @return
	 */
	private String getUniqueClassifierName(String prefix, String name) {
		int num = 0;
		String orgName = name;
		EClassifier c = null;
		do {
			c = friPackage.getEClassifier(name);
			
			if(c == null)
				return name;
			
			if(c != null && num == 0)
				name = prefix + name;
			else if(c!= null)
				name = orgName + num;  
			
			num++;
		} while(c != null);
						
		return name;
	}
	
	/**
	 * Transforms the given string to a well formed name
	 * by eliminating ' ' and '-' char. After such a character
	 * the name character is capitalised.
	 * @param name
	 * @return
	 */
	private String wellFormed(String name) {
		String forbidden = " -,&/\\";
		String result = "";
		String ucName = name.toUpperCase();
		boolean capitalize = true;
		
		for(int idx=0; idx<name.length(); idx++) {
			if(forbidden.indexOf(name.charAt(idx)) == -1) {
				if(capitalize == false) {
					result += name.charAt(idx);
				} else {					
					result += ucName.charAt(idx);
					capitalize = false;
				}
				
			} else {
				capitalize = true;
			}
		}
		return result;
	}
	
}
