package ccsds.fr.utility;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import ccsds.FunctionalResourceModel.AncillaryInterface;
import ccsds.FunctionalResourceModel.FunctionalResource;
import ccsds.FunctionalResourceModel.FunctionalResourceModel;
import ccsds.FunctionalResourceModel.FunctionalResourceSet;
import ccsds.FunctionalResourceModel.FunctionalResourceStratum;
import ccsds.FunctionalResourceModel.ServiceAccessPoint;
import ccsds.FunctionalResourceModel.provider.FunctionalResourceModelItemProviderAdapterFactory;
import ccsds.fr.type.model.frtypes.Element;
import ccsds.fr.type.model.frtypes.Module;
import ccsds.fr.type.model.frtypes.TypeDefinition;
import ccsds.fr.type.model.frtypes.TypeReferenceLocal;
import ccsds.fr.type.model.frtypes.util.FrTypesUtil;

/**
 * Helper class for FR related functions 
 */
public class FrUtility {

	/**
	 * Returns an ordered array of FRs as they appear in the model,
	 * no matter if they are directly under the model or within a
	 * FunctionalResourceSet
	 * @param frm
	 * @return The array of Functional resources
	 */
	public static FunctionalResource[] getFunctionalResources(FunctionalResourceModel frm) {
		List<FunctionalResource> frList = new LinkedList<FunctionalResource>();
		
		if(frm != null) {
			
			// add first the FRs in FR Strata
			for(FunctionalResourceStratum stratum : frm.getFunctionalResourceStratum()) {
				for(FunctionalResourceSet frs : stratum.getFunctionalResourceSet()) {
					for(FunctionalResource fr : frs.getFunctionalResource()) {
						frList.add(fr);
					}
				}
			}
			
			// add first the FRs in FR Sets hanging under FRM
			for(FunctionalResourceSet frs : frm.getFunctionalResourceSet()) {
				for(FunctionalResource fr : frs.getFunctionalResource()) {
					frList.add(fr);
				}
			}

			// Add second the FRs directly contained in the FRM under FRM
			for(FunctionalResource fr : frm.getFunctionalResource()) {
				frList.add(fr);
			}
		}
		
		
		return frList.toArray(new FunctionalResource[0]);
	}

	/**
	 * Loads a Functional Resource model from a file
	 * @param uri the URI denoting the FRM file
	 * @return	The loaded Functional Resource Model
	 * @throws IOException Thrown when loading the FRM from the file has an IO problem.
	 */
	public static FunctionalResourceModel loadFrm(String uri) throws IOException {
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

		Resource resource = domain.createResource(uri);
		try {
			resource.load(null);
			return (FunctionalResourceModel)resource.getContents().get(0);		
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		}	
	}
	
	/**
	 * Returns the current Project Explorer Selection as a file or null.
	 * @return
	 */
	public static IFile getProjectExplorerSelection() {
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		try {
			IStructuredSelection structured = (IStructuredSelection)window.getSelectionService().getSelection();
			IFile file = (IFile) structured.getFirstElement();
			return file;
			
		} catch(Exception e) { 
		}
		
		return null;
	}	
	
	/**
	 * Adjust the local type reference for this object and all children
	 * @param obj The object to be searched for references not pointing to the FRM
	 * @param frm The FRM searched for the object which should be referenced instead
	 */
	public static void adjustLocalTypeReferences(EObject obj, FunctionalResourceModel frm, List<TypeDefinition> localTypes) {
		if(obj instanceof TypeReferenceLocal) {
			TypeReferenceLocal lr = (TypeReferenceLocal)obj;
			adjustTypeRefLocal(lr, frm, localTypes);
		}
		
		for(EObject child : obj.eContents()) {
			adjustLocalTypeReferences(child, frm, localTypes);
		}
	}
	
	/**
	 * Returns a list of all type definitions defined below the given object.
	 * @param obj
	 * @return
	 */
	public static void getAllLocalTypeDefinitions(EObject obj, List<TypeDefinition> localTypes)  {
		
		for(EObject child : obj.eContents()) {
			if(child instanceof TypeDefinition) {
				localTypes.add((TypeDefinition) child); // also local type references can be referenced, no need to filter them.
			}
			
			// work recursively
			getAllLocalTypeDefinitions(child, localTypes); 
		}
	}
	
	/**
	 * Replace the type reference of the given local type reference if 
	 * in the local ASN.1 type module has a type definition of the same name 
	 * @param typeReference	The local reference, which is adjusted to 
	 * 							reference only type definitions from the 
	 * 							local FRM ASN.1 module
	 */
	private static void adjustTypeRefLocal(TypeReferenceLocal typeReference, FunctionalResourceModel frm, List<TypeDefinition> localTypes) {		
		Module localAsn1Module = null;
		
		if(frm != null) {
			localAsn1Module = frm.getAsnTypeModule();
			
		}
			
		if(isFromSameResource(typeReference.getTypeDefinition(), frm) == true) {
			return;
		}
		
		if(localAsn1Module != null) {
			int typeIndex = 0;
			boolean foundLocalTypeDef = false;
			//for(TypeDefinition localTypeDef : localAsn1Module.getTypeDefinition()) {
			for(TypeDefinition localTypeDef : localTypes) {
				
				// same type name, but objects are not the same, so it is from another FRM file (or there are more with same name) 
				if(localTypeDef.getName() != null &&
						localTypeDef.getName().equals(typeReference.getTypeDefinition().getName()) && 
								localTypeDef != typeReference.getTypeDefinition()) {
					String parent = typeReference.eContainer().eClass().getName();
					foundLocalTypeDef = true;
					
					if(typeReference.eContainer() instanceof TypeDefinition) {
						parent = ((TypeDefinition)typeReference.eContainer()).getName();
					}
					
					if(typeReference.eContainer() instanceof Element) {
						parent = ((Element)typeReference.eContainer()).getName();
					}
					
					FrTypesUtil.log("Replaced type reference to other FRM file: " + localTypeDef.getName() + " at index " + typeIndex + " parent: " + parent);
					
					typeReference.setTypeDefinition(localTypeDef);
				} else if(localTypeDef.getName() != null &&
						localTypeDef.getName().equals(typeReference.getTypeDefinition().getName()) && 
						localTypeDef == typeReference.getTypeDefinition()) {
					foundLocalTypeDef = true;
				} else if(localTypeDef == typeReference.getTypeDefinition()) { // the localTypeDef already references the local module
					foundLocalTypeDef = true;
				}
				typeIndex++;
			} // end for
			
			if(foundLocalTypeDef == false) {
				try {
					FrTypesUtil.warn("Could not replace type reference to other FRM file: " + typeReference.getTypeDefinition().getName() +
							" parent: " + typeReference.eContainer());
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}

	/**
	 * Adjust ecore object references to point to the local FRM file
	 * Required to drag and drop FRs from one file to another
	 * @param obj References are replaced for the given object and all children of type ServiceAccessPoint
	 * @param frm The FRM searched for the object which should be referenced instead
	 */
	public static void adjustServiceAccessPointReferences(EObject obj, FunctionalResourceModel frm) {
		if(obj instanceof ServiceAccessPoint) {
			ServiceAccessPoint sap = (ServiceAccessPoint)obj;			
			adjustServiceAccessPointReference(sap, frm, FrUtility.getFunctionalResources(frm));
		}
				
		for(EObject child : obj.eContents()) {			
			adjustServiceAccessPointReferences(child, frm);
		}		
	}

	/**
	 * Replaces the for the given SAP the reference to the accessing FR.
	 * Criterion: Same FR classifier
	 * @param sap
	 * @param frm 
	 */
	public static void adjustServiceAccessPointReference(ServiceAccessPoint sap, FunctionalResourceModel frm, FunctionalResource[] frArray) {		

		// replace the reference to the FR with an FR from this model. 		
		if(isFromSameResource(sap.getAccessingFunctionalResource(), frm) == false) {
			boolean replacedAccessingFr = false;
			
			for(FunctionalResource fr : frArray) {
				if(fr.getClassifier() != null && sap.getAccessingFunctionalResource() != null) {
						if(fr.getClassifier().equals(sap.getAccessingFunctionalResource().getClassifier()) == true) {
							FrTypesUtil.log("Replaced SAP reference for accessing FR of SAP " + sap.getName() + " to " + fr.getClassifier());
							sap.setAccessingFunctionalResource(fr);
							replacedAccessingFr = true;
							break;
						}
				}
			}
			
			if(replacedAccessingFr == false) {
				if(sap.getAccessingFunctionalResource() != null && sap.getAccessingFunctionalResource() != sap.eContainer()) {
					FrTypesUtil.warn("Replacing SAP reference for accessing FR " + sap.getAccessingFunctionalResource().getClassifier() + " of SAP " + sap.getName() + " failed.");
					//sap.setAccessingFunctionalResource(null);
				}
			}
		}
		

		if(isFromSameResource(sap.getAccessedFunctionalResource(), frm) == false) {
			boolean replacedAccessedFr = false;

			for(FunctionalResource fr : frArray) {
				if(fr.getClassifier() != null && sap.getAccessedFunctionalResource() != null) {
						if(fr.getClassifier().equals(sap.getAccessedFunctionalResource().getClassifier()) == true) {
							sap.setAccessedFunctionalResource(fr);
							replacedAccessedFr = true;
							FrTypesUtil.log("Replaced SAP reference for accessed FR of SAP " + sap.getName() + " to " + fr.getClassifier());
							break;
						}
				}
			}

			if(replacedAccessedFr == false) {
				if(sap.getAccessedFunctionalResource() != null && sap.getAccessedFunctionalResource() != sap.eContainer()) {
					FrTypesUtil.warn("Replacing SAP reference for accessed FR " + sap.getAccessedFunctionalResource().getClassifier() + " of SAP " + sap.getName() 
						+ " SAP resource: " + sap.eResource().getURI() + " failed.");
					//sap.setAccessedFunctionalResource(null);
				}			
			}		
		}
		
	}
	
	/**
	 * Adjust ecore object references to point to the local FRM file
	 * Required to drag and drop FRs from one file to another
	 * @param obj References are replaced for the given object and all children of type AncillaryInterface
	 * @param frm The FRM searched for the object which should be referenced instead
	 */	
	public static void adjustAncillaryInterfaceReferences(EObject obj, FunctionalResourceModel frm) {
		if(obj instanceof AncillaryInterface) {
			AncillaryInterface aif = (AncillaryInterface)obj;			
			adjustAncillaryInterfaceReference(aif, frm, FrUtility.getFunctionalResources(frm));
		}
		
		for(EObject child : obj.eContents()) {
			adjustAncillaryInterfaceReferences(child, frm);
		}			
	}	
	
	/**
	 * Adjusts the object references to point to the local FRM file
	 * Required to drag and drop FRs from one file to another
	 * @param aif		For the given aif the references will be adjusted
	 * @param frm		The FRs referenced by aif are checked if they are in the same file as the FRM 
	 * @param frArray	The Array of local FRMs
	 */
	public static void adjustAncillaryInterfaceReference(AncillaryInterface aif, FunctionalResourceModel frm, FunctionalResource[] frArray) {
		// replace the reference to the FR with an FR from this model. 
		if(isFromSameResource(aif.getProvidingFunctionalResource(), frm) == false) {
			boolean replacedProvidingFr = false;
			
			for(FunctionalResource fr : frArray) {
				if(fr.getClassifier() != null && aif.getProvidingFunctionalResource() != null) {
						if(fr.getClassifier().equals(aif.getProvidingFunctionalResource().getClassifier()) == true) {
							aif.setProvidingFunctionalResource(fr);
							replacedProvidingFr = true;
							FrTypesUtil.log("Replace Ancillary Interface reference for providing FR of SAP " + aif.getName() + " to " + fr.getClassifier());
							break;
						}
				}
			}

			if(replacedProvidingFr == false) {
				if(aif.getProvidingFunctionalResource() != null && aif.getProvidingFunctionalResource() != aif.eContainer()) {
					FrTypesUtil.warn("Replace Ancillary Interface reference for providing FR " + aif.getProvidingFunctionalResource().getClassifier() + " of SAP " + aif.getName() + " failed.");
					//aif.setProvidingFunctionalResource(null);
				}
			}
		}
		

		if(isFromSameResource(aif.getRequiringFunctionalResource(), frm) == false) {
			boolean replacedRequirigingFr = false;

			for(FunctionalResource fr : frArray) {
				if(fr.getClassifier() != null && aif.getRequiringFunctionalResource() != null) {
						if(fr.getClassifier().equals(aif.getRequiringFunctionalResource().getClassifier()) == true) {
							aif.setRequiringFunctionalResource(fr);
							replacedRequirigingFr = true;
							FrTypesUtil.log("Replaced Ancillary Interface reference for providing FR of Ancillary Interface " + aif.getName() + " to " + fr.getClassifier());
							break;
						}
				}
			}
			
			if(replacedRequirigingFr == false) {
				if(aif.getRequiringFunctionalResource() != null && aif.getRequiringFunctionalResource() != aif.eContainer()) {
					FrTypesUtil.warn("Replacing SAP reference for accessed FR " + aif.getRequiringFunctionalResource().getClassifier() + " of Ancillary Interface " + aif.getName() + " failed.");
					//aif.setRequiringFunctionalResource(null);
				}	
			}			
		}
		
	}
	
	/**
	 * Tests if the two given EObjects are from the same resource (file).
	 * Intended use is to test if a model from one file containes references to another file
	 * @param obj1
	 * @param obj2
	 * @return		true if the objects are from the same resource and not null
	 */
	private static boolean isFromSameResource(EObject obj1, EObject obj2) {
		if(obj1 != null && obj1.eResource() != null && obj2 != null) {
			if(obj1.eResource().equals(obj2.eResource())) {
				return true;
			}
		}
		
//		if(obj1 != null && obj1.eResource() != null && 
//				obj2 != null && obj2.eResource() != null)
//			FrTypesUtil.log("Not from the same resource file: " + obj1.getClass().getSimpleName() + " / " + obj2.getClass().getSimpleName()
//					+ " " + obj1.eResource().getURI() + " and " + obj2.eResource().getURI());
		
		return false;
	}
	
	/**
	 * Get the parent FRM object for the given EObject 
	 * @param obj
	 * @return		The FROm oject or null if there is no FRM parent for the given EObject
	 */
	public static FunctionalResourceModel getFrm(EObject obj) {
		EObject parentContainer = obj;
		
		while(parentContainer != null) {
			if(parentContainer instanceof FunctionalResourceModel) {
				return (FunctionalResourceModel)parentContainer;				
			}
			parentContainer = parentContainer.eContainer();
		}
		
		return null;
	}	
	
}
