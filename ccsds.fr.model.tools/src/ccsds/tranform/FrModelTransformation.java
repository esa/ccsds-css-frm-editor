package ccsds.tranform;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IFile;
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
import ccsds.FunctionalResourceModel.Directive;
import ccsds.FunctionalResourceModel.Event;
import ccsds.FunctionalResourceModel.FrModelElement;
import ccsds.FunctionalResourceModel.FunctionalResource;
import ccsds.FunctionalResourceModel.FunctionalResourceModel;
import ccsds.FunctionalResourceModel.Parameter;
import ccsds.FunctionalResourceModel.ServiceAccessPoint;
import ccsds.fr.model.tools.NameTool;
import ccsds.fr.utility.FrUtility;

/**
 * Transforms a Functional Resource Model to the corresponding ecore model for instances
 * of the Functional Resource Model.
 */
public class FrModelTransformation {
	
	private static final String FRI = "fri";
	private static final String HTTP_ISO_ORG_DOD_CCSDS_FRI = "http://iso.org.dod.ccsds.fri";
	private EcoreFactory theCoreFactory;
	private EClass functionalresourceInstanceClass;
	private EPackage friTopPackage;
	private EClass abstractParameter;
	private EClass abstractEvent;
	private EClass abstractDirective;

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
		try {
			FunctionalResourceModel frm = FrUtility.loadFrm(frModelFile.getFullPath().toString());
			
			friTopPackage = createEPackage("FunctionalResourceModelInstance", FRI, HTTP_ISO_ORG_DOD_CCSDS_FRI);
			
			// create globally needed classes and make them available to the ecore package and the transformation
			functionalresourceInstanceClass = createFunctionalResourceInstance();

			// abstract base classes
			abstractParameter = createAbstractParameter();
			abstractEvent = createEventClass();
			abstractDirective = createDirectiveClass();

//			// create a service user class needed for modelling
//			srvUserClass = createServiceUser();
//			
//			// create the entity management class
//			EClass entityMgmtClass = createEntityMgmntClass();
//			
//			// create the top-level classes complex and network
//			EClass complexClass = createComplexClass();			
//			createNetworkClass(complexClass);
			
			// iterate over the functional resource model and map to target ecore elements (classes)
			
			FunctionalResource[] frArray = FrUtility.getFunctionalResources(frm);
			for(FunctionalResource fr : frArray) {
				//createDerivedFrInstance(fr, complexClass);
				createDerivedFrInstance(fr, null);
			}
		
			//createDependencyForUse(FrUtility.getFunctionalResources(frm));
			createDependencyForSap(FrUtility.getFunctionalResources(frm));
			
			// save the new ecore model
			ResourceSet metaResourceSet = new ResourceSetImpl();
			
			//Register XML Factory implementation to handle .ecore files			
			metaResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
			    "ecore", new  XMLResourceFactoryImpl());

			// Create empty resource with the given URI
			String fileName = frModelFile.getFullPath().removeFileExtension().toString() + ".ecore";			
			Resource metaResource = metaResourceSet.createResource(URI.createURI(fileName));

			// Add bookStoreEPackage to contents list of the resource 
			metaResource.getContents().add(friTopPackage);

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
	private EPackage createEPackage(String name, String nsPrefix, String nsUri) {

		/*
		* Instantiate EPackage and provide unique URI
		* to identify this package
		*/
		EPackage ecorePackage = theCoreFactory.createEPackage();
		ecorePackage.setName(name);
		ecorePackage.setNsPrefix(nsPrefix);
		ecorePackage.setNsURI(nsUri);
		
		return ecorePackage;
	}
	
	private EClass createFunctionalResourceInstance() {
		EClass frInstance = theCoreFactory.createEClass();
		frInstance.setName("FunctionalResourceInstance");
		
		friTopPackage.getEClassifiers().add(frInstance);
		return frInstance;
	}

	private EClass createAbstractParameter() {
		EClass theClass = theCoreFactory.createEClass();
		theClass.setName("AbstractParameter");
		
		friTopPackage.getEClassifiers().add(theClass);
		return theClass;
	}

	private EClass createEventClass() {
		EClass theClass = theCoreFactory.createEClass();
		theClass.setName("AbstractEvent");
		
		friTopPackage.getEClassifiers().add(theClass);
		return theClass;
	}

	private EClass createDirectiveClass() {
		EClass theClass = theCoreFactory.createEClass();
		theClass.setName("AbstractDirective");
		
		friTopPackage.getEClassifiers().add(theClass);
		return theClass;
	}

	
	/**
	 * Creates a Functional resource Instance derived from functionalresourceInstanceClass EClass according to the FunctionalResource
	 * and add it to the the given package
	 * @param friTopPackage 	the package to which the created class is added
	 * @param fr			the FunctionalResource used as a template for the new class.
	 * @param complexClass 
	 * @return 
	 */
	private EClass createDerivedFrInstance(FunctionalResource fr, EClass complexClass) {
				
		EClass frInstanceClass = theCoreFactory.createEClass();
		frInstanceClass.setName(NameTool.wellFormed(fr.getClassifier()));
		frInstanceClass.getESuperTypes().add(functionalresourceInstanceClass);
		
		EPackage frPackage = createEPackage("Fr"+frInstanceClass.getName(), "frp"+frInstanceClass.getName(), "http://iso.org.dod.ccsds."+frInstanceClass.getName());

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
				

		// add an attribute of the created FRI type to the complex class
		EReference frList = theCoreFactory.createEReference();
		frList.setName(deriveClassName(fr));
		frList.setEType(frInstanceClass);
		frList.setLowerBound(0); 
		frList.setUpperBound(EStructuralFeature.UNBOUNDED_MULTIPLICITY);
		frList.setContainment(true);
		
		if(complexClass != null) {
			complexClass.getEStructuralFeatures().add(frList);
		}
		
		frPackage.getEClassifiers().add(frInstanceClass);
		friTopPackage.getESubpackages().add(frPackage);		
		//friPackage.getEClassifiers().add(frInstanceClass);

		//createManagementClass(fr, frInstanceClass);
		
		List<EClass> paramClasses = createParamClasses(frPackage, frInstanceClass, fr.getParameter());
		addReferences(frInstanceClass, paramClasses);
		
		List<EClass> eventClasses = createEventClasses(frPackage, frInstanceClass, fr.getEvent());
		addReferences(frInstanceClass, eventClasses);

		List<EClass> directiveClasses = createDirectiveClasses(frPackage, frInstanceClass, fr.getDirectives());
		addReferences(frInstanceClass, directiveClasses);
		
		return frInstanceClass;
	}

	/**
	 * Create a event class according to the given list
	 * TODO createDirectiveClasses and createEventClasses are identical - re-factor to a common base class
	 * @param events
	 * @return the created event classes
	 */
	private List<EClass> createEventClasses(EPackage thePackage, EClass parent, EList<Event> events) {
		List<EClass> createdClasses = new ArrayList<EClass>();
		for(Event event : events) {
			String name = deriveClassName(event);
					
			name = getUniqueClassifierName(parent.getName(), name);
			EClass theClass = theCoreFactory.createEClass();
			
			theClass.getESuperTypes().add(abstractEvent);
			theClass.setName(name);

			EAttribute semanticDescrAttr = theCoreFactory.createEAttribute();
			semanticDescrAttr.setName("description");
			semanticDescrAttr.setEType(EcorePackage.eINSTANCE.getEString());		
			semanticDescrAttr.setDefaultValueLiteral(event.getSemanticDefinition());		
			semanticDescrAttr.setUpperBound(1);
			theClass.getEStructuralFeatures().add(semanticDescrAttr);
			
			if(event.getValue() != null) {
				EAttribute qualifierAttr = theCoreFactory.createEAttribute();
				qualifierAttr.setName("value");
				qualifierAttr.setEType(EcorePackage.eINSTANCE.getEString());		
				//qualifierAttr.setDefaultValueLiteral(event.getValue());		
				qualifierAttr.setUpperBound(1);
				theClass.getEStructuralFeatures().add(qualifierAttr);
			}
			
			thePackage.getEClassifiers().add(theClass);
			createdClasses.add(theClass);
		}
		
		return createdClasses;
	}	

	/**
	 * Create a Directive class according to the given list
	 * @param events
	 * @return the created Directive classes
	 */
	private List<EClass> createDirectiveClasses(EPackage thePackage, EClass parent, EList<Directive> directives) {
		List<EClass> createdClasses = new ArrayList<EClass>();
		for(Directive directive : directives) {
			String name = deriveClassName(directive);
					
			name = getUniqueClassifierName(parent.getName(), name);
			EClass theClass = theCoreFactory.createEClass();
			
			theClass.getESuperTypes().add(abstractDirective);
			theClass.setName(name);

			EAttribute semanticDescrAttr = theCoreFactory.createEAttribute();
			semanticDescrAttr.setName("description");
			semanticDescrAttr.setEType(EcorePackage.eINSTANCE.getEString());		
			semanticDescrAttr.setDefaultValueLiteral(directive.getSemanticDefinition());		
			semanticDescrAttr.setUpperBound(1);
			theClass.getEStructuralFeatures().add(semanticDescrAttr);
			
			if(directive.getQualifier() != null) {
				EAttribute qualifierAttr = theCoreFactory.createEAttribute();
				qualifierAttr.setName("qualifier");
				qualifierAttr.setEType(EcorePackage.eINSTANCE.getEString());		
				//qualifierAttr.setDefaultValueLiteral(directive.getQualifier());		
				qualifierAttr.setUpperBound(1);
				theClass.getEStructuralFeatures().add(qualifierAttr);
			}
			
			thePackage.getEClassifiers().add(theClass);
			createdClasses.add(theClass);
		}
		
		return createdClasses;
	}	
	
	
	/**
	 * Create a parameter class according to the given parameter list
	 * @param parameters
	 * @return
	 */
	private List<EClass> createParamClasses(EPackage thePackage, EClass parent, EList<Parameter> parameters) {
		List<EClass> createdClasses = new ArrayList<EClass>();
		for(Parameter parameter : parameters) {
			String name = deriveClassName(parameter);
					
			name = getUniqueClassifierName(parent.getName(), name);
			EClass theClass = theCoreFactory.createEClass();
			
			theClass.getESuperTypes().add(abstractParameter);
			theClass.setName(name);
			
			EAttribute semanticDescrAttr = theCoreFactory.createEAttribute();
			semanticDescrAttr.setName("description");
			semanticDescrAttr.setEType(EcorePackage.eINSTANCE.getEString());		
			semanticDescrAttr.setDefaultValueLiteral(parameter.getSemanticDefinition());		
			semanticDescrAttr.setUpperBound(1);
			theClass.getEStructuralFeatures().add(semanticDescrAttr);
			
			EAttribute typeAttr = theCoreFactory.createEAttribute();
			typeAttr.setName("type");
			typeAttr.setEType(EcorePackage.eINSTANCE.getEString());		
			typeAttr.setDefaultValueLiteral(parameter.getTypeDefinition());		
			typeAttr.setUpperBound(1);
			theClass.getEStructuralFeatures().add(typeAttr);

			EAttribute valueAttr = theCoreFactory.createEAttribute();
			valueAttr.setName("value");
			valueAttr.setEType(EcorePackage.eINSTANCE.getEString()); // what type to use? we cannot (easily) understand / translate the ASN.1 type definition		
			//valueAttr.setDefaultValueLiteral(parameter.getTypeDefinition());		
			valueAttr.setUpperBound(1);
			theClass.getEStructuralFeatures().add(valueAttr);			

//			EAttribute monitorAttr = theCoreFactory.createEAttribute();
//			monitorAttr.setName("monitored");
//			monitorAttr.setEType(EcorePackage.eINSTANCE.getEBoolean());		
//			monitorAttr.setDefaultValue(parameter.isMonitored());
//			monitorAttr.setChangeable(false);
//			monitorAttr.setUpperBound(1);
//			theClass.getEStructuralFeatures().add(monitorAttr);			
			
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
			theClass.getEStructuralFeatures().add(configAttr);			
			
			createdClasses.add(theClass);
			//friPackage.getEClassifiers().add(paramClass);
			thePackage.getEClassifiers().add(theClass);
		}
		return createdClasses;
	}
	
	/**
	 * Adds the given attributes with the type of the given classes to the class.
	 * @param theClass		the class for which the attributes are added
	 * @param referenceTargets  the classes providing the attribute types
	 */
	private void addReferences(EClass theClass, List<EClass> referenceTargets) {
		for(EClass referenceTarget : referenceTargets) {
//	attributes are not suitable for complex types
//			EAttribute paramAttr = theCoreFactory.createEAttribute();			
//			paramAttr.setName(Character.toLowerCase(aClass.getName().charAt(0)) + aClass.getName().substring(1));	
//			paramAttr.setEType(aClass);			
//			paramAttr.setUpperBound(1);
//			System.out.println("Add attribute " + paramAttr.getName() + " for " + theClass.getName());
//			theClass.getEStructuralFeatures().add(paramAttr);
			try {
					EReference ref = theCoreFactory.createEReference();
					ref.setName(Character.toLowerCase(referenceTarget.getName().charAt(0)) + referenceTarget.getName().substring(1));
					//paramRef.setName("param" + paramClass.getName());
					ref.setLowerBound(1);
					ref.setUpperBound(1);
					ref.setEType(referenceTarget);
					ref.setContainment(true);
					//System.out.println("Add reference " + ref.getName() + " for " + theClass.getName());
					theClass.getEStructuralFeatures().add(ref);	
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
	 */
	@SuppressWarnings("unused")
	private void createDependencyForUse(FunctionalResource[] frList) {
		for(FunctionalResource fr : frList) {
			EClass refSource = getClassByName(deriveClassName(fr), friTopPackage);
			for(FunctionalResource usedFr : fr.getUses()) {
				try {
					EClass refTarget = getClassByName(deriveClassName(usedFr), friTopPackage);
					if(refSource != null && refTarget != null) {
						EReference usesRef = theCoreFactory.createEReference();
						usesRef.setName("uses" + deriveClassName(usedFr));
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
	 * Create the a dependency for each ServiceAccessPoint relation as expressed in the frm 
	 * for the created FunctionalresourceInstanceClasses
	 * @param frList The array of Functional Resources
	 */
	private void createDependencyForSap(FunctionalResource[] frList) {
		for(FunctionalResource fr : frList) {
			EClass refSource = getClassByName(deriveClassName(fr), friTopPackage);
			List<String> sapNames = new LinkedList<String>();
			for(ServiceAccessPoint sap : fr.getServiceAccesspoint()) {
				try {
					EClass refTarget = getClassByName(deriveClassName(sap.getAccessedFunctionalResource()), friTopPackage);
					if(refSource != null && refTarget != null) {
						EReference sapRef = theCoreFactory.createEReference();
						String sapName = "sap" + NameTool.wellFormed(sap.getName());
						if(sapNames.contains(sapName)) {
							sapName = sapName + sapNames.size();
						}
						sapRef.setName(sapName); 
						sapNames.add(sapName);
						sapRef.setLowerBound(sap.getMinAccessed());
						sapRef.setUpperBound(sap.getMaxAccessed());
						sapRef.setEType(refTarget);
						sapRef.setContainment(false);
						refSource.getEStructuralFeatures().add(sapRef);			
						System.out.println("Added SAP " + sapName + " to FRI " + refSource.getName());
					}											
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}	
	
	/**
	 * Construct a class name out of the short name or
	 * the name of the element.
	 * @param element the element for which the class name is requested
	 * @return the class name
	 */
	private String deriveClassName(FrModelElement element) {
		String name = element.getClassifier(); 
		if(name == null || name.length() == 0)
			name = element.getClassifier();
		
		return NameTool.wellFormed(name);
	}

	/**
	 * Returns the EClass of the given name from friPackage
	 * @param name the searched class name
	 * @param EPackage p the package to search. Subpackages are searched as well.
	 * @return
	 */
	private EClass getClassByName(String name, EPackage p) {
		EClassifier cl = p.getEClassifier(name);
		
		if(cl != null && cl instanceof EClass)
			return (EClass)cl;
	
		// search in the sub packages
		for(EPackage subPackage : p.getESubpackages()) {
			cl = getClassByName(name, subPackage);
			if(cl != null && cl instanceof EClass)
				return (EClass)cl;
		}
		
		return null;
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
//			mgmntRef.setName("Parameter"+ NameTool.wellFormed(p.getName()));
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
//			mgmntRef.setName("Directive"+ NameTool.wellFormed(d.getName()));
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
//			mgmntRef.setName("Event"+ NameTool.wellFormed(e.getName()));
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
			c = friTopPackage.getEClassifier(name);
			
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
	
}
