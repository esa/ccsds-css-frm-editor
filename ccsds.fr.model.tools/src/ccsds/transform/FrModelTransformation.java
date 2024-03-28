package ccsds.transform;

/*-
 * #%L
 * CCSDS Functional Resource Model Tools
 * %%
 * Copyright (C) 2022 European Space Agency
 * %%
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * #L%
 */

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
import ccsds.FunctionalResourceModel.Oid;
import ccsds.FunctionalResourceModel.Parameter;
import ccsds.FunctionalResourceModel.ServiceAccessPoint;
import ccsds.fr.type.model.NameTool;
import ccsds.fr.type.model.transform.FrTypeTransformer;
import ccsds.fr.utility.FrUtility;
import ccsds.handlers.FrXsdExportAdapter;

/**
 * Transforms a Functional Resource Model to the corresponding ecore model for instances
 * of the Functional Resource Model.
 */
public class FrModelTransformation {
	
	private static final String TYPES_PACKAGE = "types";
	private static final String FRI = "fri";	
	private final EcoreFactory theCoreFactory;
	private final EClass functionalresourceInstanceClass;	
	private final EClass functionalresourceInstanceContainerClass;	
	private final EClass abstractParameter;
	private final EClass abstractEvent;
	private final EClass abstractDirective;
	private final EPackage friTopPackage;
	private final EPackage commonTypes;

	public FrModelTransformation() {
		theCoreFactory = EcoreFactory.eINSTANCE;
		friTopPackage = createEPackage("FunctionalResourceModelInstance", FRI, FrTypeTransformer.HTTP_ISO_ORG_DOD_CCSDS_FRI);

		commonTypes = theCoreFactory.createEPackage();
		commonTypes.setName("CommonTypes");
		commonTypes.setNsPrefix("CommonTypes");
		commonTypes.setNsURI(FrTypeTransformer.HTTP_ISO_ORG_DOD_CCSDS_FRI + FrTypeTransformer.DOT + "commonTypes");
		friTopPackage.getESubpackages().add(commonTypes);

		// abstract base classes
		abstractParameter = createAbstractParameter(commonTypes);
		abstractEvent = createEventClass(commonTypes);
		abstractDirective = createDirectiveClass(commonTypes);

		functionalresourceInstanceClass = createFunctionalResourceInstance(commonTypes);
		functionalresourceInstanceContainerClass = createFunctionalResourceInstanceContainer(commonTypes, functionalresourceInstanceClass);

		EClass fgClass = createFunctionalGroupClass(commonTypes, functionalresourceInstanceClass);		
		createFunctionalComplexClass(friTopPackage, fgClass);
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
			
			FrTypeTransformer typeTransformer = new FrTypeTransformer(commonTypes);
			
			FunctionalResource[] frArray = FrUtility.getFunctionalResources(frm);
			for(FunctionalResource fr : frArray) {
				//createDerivedFrInstance(fr, complexClass);
				createDerivedFrInstance(friTopPackage, fr, null, typeTransformer);
			}
		
			//createDependencyForUse(FrUtility.getFunctionalResources(frm));
			createDependencyForSap(friTopPackage, FrUtility.getFunctionalResources(frm));
			
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
	
	private EClass createFunctionalResourceInstance(EPackage friTopPackage) {
		EClass frInstance = theCoreFactory.createEClass();
		frInstance.setName("FunctionalResourceInstance");
		
		EAttribute semanticDescrAttr = theCoreFactory.createEAttribute();
		semanticDescrAttr.setName("name");
		semanticDescrAttr.setEType(EcorePackage.eINSTANCE.getEString());		
		semanticDescrAttr.setUpperBound(1);
		frInstance.getEStructuralFeatures().add(semanticDescrAttr);
		
		friTopPackage.getEClassifiers().add(frInstance);
		return frInstance;
	}

	private EClass createFunctionalResourceInstanceContainer(EPackage friTopPackage, EClass parent) {
		EClass frInstanceContainer = theCoreFactory.createEClass();
		frInstanceContainer.setName("FunctionalResourceInstanceContainer");
		frInstanceContainer.getESuperTypes().add(parent);
		friTopPackage.getEClassifiers().add(frInstanceContainer);
		return frInstanceContainer;
	}
	
	
	private EClass createAbstractParameter(EPackage friTopPackage) {
		EClass theClass = theCoreFactory.createEClass();
		theClass.setName("AbstractParameter");
		
		friTopPackage.getEClassifiers().add(theClass);
		return theClass;
	}

	private EClass createEventClass(EPackage friTopPackage) {
		EClass theClass = theCoreFactory.createEClass();
		theClass.setName("AbstractEvent");
		
		friTopPackage.getEClassifiers().add(theClass);
		return theClass;
	}

	private EClass createDirectiveClass(EPackage friTopPackage) {
		EClass theClass = theCoreFactory.createEClass();
		theClass.setName("AbstractDirective");
		
		friTopPackage.getEClassifiers().add(theClass);
		return theClass;
	}

	
	/**
	 * Creates a Functional resource Instance derived from functionalresourceInstanceClass EClass according to the FunctionalResource
	 * and add it to the the given package
	 * @param friTopPackage 	The package to which the created class is added
	 * @param fr				The FunctionalResource used as a template for the new class.
	 * @param complexClass 		 
	 * @param typeTransformer 	The type transformer to use for fr.type.model types 
	 * @return 
	 */
	private void createDerivedFrInstance(EPackage friTopPackage, FunctionalResource fr, EClass complexClass, FrTypeTransformer typeTransformer) {
				
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
		
		EPackage typePackage = theCoreFactory.createEPackage();
		frPackage.getESubpackages().add(typePackage);
		typePackage.setName(TYPES_PACKAGE);
		typePackage.setNsPrefix(TYPES_PACKAGE + FrTypeTransformer.DOT + frInstanceClass.getName());
		typePackage.setNsURI(FrTypeTransformer.HTTP_ISO_ORG_DOD_CCSDS_FRI + FrTypeTransformer.DOT + TYPES_PACKAGE + FrTypeTransformer.DOT + frInstanceClass.getName());
		List<EClass> paramClasses = createParamClasses(frPackage, frInstanceClass, fr.getParameter(), typeTransformer, typePackage);
		addReferences(frInstanceClass, paramClasses);
		
		List<EClass> eventClasses = createEventClasses(frPackage, frInstanceClass, fr.getEvent());
		addReferences(frInstanceClass, eventClasses);

		List<EClass> directiveClasses = createDirectiveClasses(frPackage, frInstanceClass, fr.getDirectives());
		addReferences(frInstanceClass, directiveClasses);

		// create an FR Instance container if necessary
		if(FrXsdExportAdapter.isDynamicFr(fr.getAnnotation())) {
			EClass frInstanceContainer = theCoreFactory.createEClass();
			frInstanceContainer.setName(frInstanceClass.getName() + "Container");
			frInstanceContainer.getESuperTypes().add(functionalresourceInstanceContainerClass);
			
			EReference instances = theCoreFactory.createEReference();			
			instances.setName("frInstances");
			instances.setContainment(true);
			instances.setEType(frInstanceClass);
			instances.setLowerBound(0);
			instances.setUpperBound(-1);
			
			frInstanceContainer.getEStructuralFeatures().add(instances);
			frPackage.getEClassifiers().add(frInstanceContainer);			
		}

		
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
			String name = deriveClassName(event) + "Event";
					
			name = getUniqueClassifierName(thePackage, parent.getName(), name);
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
			String name = deriveClassName(directive) + "Directive";
					
			name = getUniqueClassifierName(thePackage, parent.getName(), name);
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
	 * @param typeTransformer 
	 * @return
	 */
	private List<EClass> createParamClasses(EPackage thePackage, EClass parent, EList<Parameter> parameters, FrTypeTransformer typeTransformer, EPackage typePackage) {
		List<EClass> createdClasses = new ArrayList<EClass>();
		for(Parameter parameter : parameters) {
			String name = deriveClassName(parameter) + "Param";
					
			name = getUniqueClassifierName(thePackage, parent.getName(), name);
			EClass theClass = theCoreFactory.createEClass();
			
			theClass.getESuperTypes().add(abstractParameter);
			theClass.setName(name);
			
			EAttribute semanticDescrAttr = theCoreFactory.createEAttribute();
			semanticDescrAttr.setName("description");
			semanticDescrAttr.setEType(EcorePackage.eINSTANCE.getEString());		
			semanticDescrAttr.setDefaultValueLiteral(parameter.getSemanticDefinition());		
			semanticDescrAttr.setUpperBound(1);
			theClass.getEStructuralFeatures().add(semanticDescrAttr);
			
			EAttribute paramOid = theCoreFactory.createEAttribute();
			paramOid.setName("oid");
			paramOid.setEType(EcorePackage.eINSTANCE.getEString());		
			paramOid.setDefaultValueLiteral(oidString(parameter.getOid()));
			paramOid.setLowerBound(1);			
			paramOid.setUpperBound(1);
			paramOid.setUnsettable(true);
			theClass.getEStructuralFeatures().add(paramOid);
			
			
			
//			EAttribute typeAttr = theCoreFactory.createEAttribute();
//			typeAttr.setName("typeString");
//			typeAttr.setDefaultValueLiteral(parameter.getTypeDefinition());		
//			typeAttr.setUpperBound(1);
//			theClass.getEStructuralFeatures().add(typeAttr);

			EStructuralFeature value = theCoreFactory.createEAttribute();
			
			try {
				EClassifier typeClassifier = typeTransformer.getEcore(parameter.getTypeDef(), typePackage);

				// create a refercens if the value attribute is EClass and not EDatatype (enum, int, etc)
				if(typeClassifier instanceof EClass) {
					value = theCoreFactory.createEReference();
					((EReference)value).setContainment(true);
				}
				value.setName("value");
				value.setEType(typeClassifier);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//valueAttr.setDefaultValueLiteral(parameter.getTypeDefinition());		
			value.setUpperBound(1);
			theClass.getEStructuralFeatures().add(value);			

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
			configAttr.setUnsettable(true);
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
	private void createDependencyForUse(EPackage friTopPackage, FunctionalResource[] frList) {
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
	private void createDependencyForSap(EPackage friTopPackage, FunctionalResource[] frList) {
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
	 * Create a functional group class in the given package
	 * @param frPackage
	 */
	private EClass createFunctionalGroupClass(EPackage frPackage, EClass functionalresourceInstanceClass) {
		EClass functionalGroupClass = theCoreFactory.createEClass();
		frPackage.getEClassifiers().add(functionalGroupClass);
		
		functionalGroupClass.setName("FunctionalGroup");
		
		EAttribute fgName = theCoreFactory.createEAttribute();
		fgName.setName("name");
		functionalGroupClass.getEStructuralFeatures().add(fgName);
		fgName.setEType(EcorePackage.eINSTANCE.getEString());
		fgName.setLowerBound(0);
		fgName.setUpperBound(1);
		
		
		EReference frInstances = theCoreFactory.createEReference();
		frInstances.setName("frInstances");
		frInstances.setContainment(true);
		frInstances.setEType(functionalresourceInstanceClass);
		frInstances.setLowerBound(0);
		frInstances.setUpperBound(-1);
		functionalGroupClass.getEStructuralFeatures().add(frInstances);
		
		EReference subFunctionalGroups = theCoreFactory.createEReference();
		subFunctionalGroups.setName("subGroups");
		subFunctionalGroups.setContainment(true);
		subFunctionalGroups.setEType(functionalGroupClass);
		subFunctionalGroups.setLowerBound(0);
		subFunctionalGroups.setUpperBound(-1);		
		functionalGroupClass.getEStructuralFeatures().add(subFunctionalGroups);
		
		return functionalGroupClass;
	}

	/**
	 * Create a Complex class in the given package
	 * @param frPackage
	 * @param fgClass 
	 */
	private void createFunctionalComplexClass(EPackage frPackage, EClass fgClass) {
		EClass complexClass = theCoreFactory.createEClass();
		frPackage.getEClassifiers().add(complexClass);
		
		complexClass.setName("Complex");
		
		EAttribute name = theCoreFactory.createEAttribute();
		name.setName("name");
		complexClass.getEStructuralFeatures().add(name);
		name.setEType(EcorePackage.eINSTANCE.getEString());
		name.setLowerBound(0);
		name.setUpperBound(1);
		
		
		EReference frInstances = theCoreFactory.createEReference();
		frInstances.setName("frInstances");
		frInstances.setContainment(true);
		frInstances.setEType(functionalresourceInstanceClass);
		frInstances.setLowerBound(0);
		frInstances.setUpperBound(-1);
		complexClass.getEStructuralFeatures().add(frInstances);
		
		EReference subFunctionalGroups = theCoreFactory.createEReference();
		subFunctionalGroups.setName("subGroups");
		subFunctionalGroups.setContainment(true);
		subFunctionalGroups.setEType(fgClass);
		subFunctionalGroups.setLowerBound(0);
		subFunctionalGroups.setUpperBound(-1);		
		complexClass.getEStructuralFeatures().add(subFunctionalGroups);
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
	 * Returns a classifier name which is valid within the for package.
	 * Uniqueness is achieved by adding 2..n for duplicated names.
	 * @param name the name to make unique.
	 * @return
	 */
	private String getUniqueClassifierName(EPackage thePackage, String prefix, String name) {
		int num = 0;
		String orgName = name;
		EClassifier c = null;
		do {
			c = thePackage.getEClassifier(name);
			
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
	 * Returns an OID string for the given OID
	 */
	public String oidString(Oid oid) {
		StringBuffer oidStr = new StringBuffer();
		for(int idx=0; idx<oid.getOidBit().size(); idx++) {
			oidStr.append(oid.getOidBit().get(idx));
			
			if(idx+1 < oid.getOidBit().size()) {
				oidStr.append(FrTypeTransformer.DOT);
			}
		}
		
		return oidStr.toString();
	}
	
}
