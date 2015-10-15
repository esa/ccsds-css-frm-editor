package ccsds.tranform;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
				createFrInstance(fr, complexClass);
			}
		
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
	 * Creates an FrInstance EClass according to the FunctionalResource
	 * and add it to the the given package
	 * @param friPackage 	the package to which the created class is added
	 * @param fr			the FunctionalResource used as a template for the new class.
	 * @param complexClass 
	 * @return 
	 */
	private EClass createFrInstance(FunctionalResource fr, EClass complexClass) {
		
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
				
		createManagementClass(fr, frInstanceClass);

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
	private void createManagementClass(FunctionalResource fr, EClass frInstanceClass) {		
		for(Parameter p : fr.getParameter()) {
			EReference mgmntRef = theCoreFactory.createEReference();
			mgmntRef.setName("Parameter"+ wellFormed(p.getName()));
			mgmntRef.setEType(entityMgmtClass);
			mgmntRef.setLowerBound(1); 
			mgmntRef.setUpperBound(1);
			mgmntRef.setContainment(true);
			
			frInstanceClass.getEStructuralFeatures().add(mgmntRef);
		}
		
		for(Directive d : fr.getDirectives()) {
			EReference mgmntRef = theCoreFactory.createEReference();
			mgmntRef.setName("Directive"+ wellFormed(d.getName()));
			mgmntRef.setEType(entityMgmtClass);
			mgmntRef.setLowerBound(1); 
			mgmntRef.setUpperBound(1);
			mgmntRef.setContainment(true);
			
			frInstanceClass.getEStructuralFeatures().add(mgmntRef);
		}

		for(Event e : fr.getEvents()) {
			EReference mgmntRef = theCoreFactory.createEReference();
			mgmntRef.setName("Event"+ wellFormed(e.getName()));
			mgmntRef.setEType(entityMgmtClass);
			mgmntRef.setLowerBound(1); 
			mgmntRef.setUpperBound(1);
			mgmntRef.setContainment(true);
			
			frInstanceClass.getEStructuralFeatures().add(mgmntRef);
		}
		
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
