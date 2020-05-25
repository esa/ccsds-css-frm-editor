package ccsds.FunctionalResourceModel.presentation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;

import ccsds.FunctionalResourceModel.FunctionalResource;
import ccsds.FunctionalResourceModel.FunctionalResourceModel;
import ccsds.FunctionalResourceModel.TypedElement;
import ccsds.fr.type.model.frtypes.Choice;
import ccsds.fr.type.model.frtypes.Element;
import ccsds.fr.type.model.frtypes.Enumerated;
import ccsds.fr.type.model.frtypes.Module;
import ccsds.fr.type.model.frtypes.NamedValue;
import ccsds.fr.type.model.frtypes.Type;
import ccsds.fr.type.model.frtypes.TypeDefinition;
import ccsds.fr.type.model.frtypes.TypeReferenceLocal;
import ccsds.fr.type.model.frtypes.util.FrTypesUtil;

/**
 * Change adapter for an FRM model. Hooks up and initialises
 * new element according to context. 
 */
public class FrmChangeAdapter extends EContentAdapter {

	@Override
	public void notifyChanged(Notification notification) {
		//System.out.println("FRm change: " + notification);
		
		if(notification.getNotifier() instanceof Enumerated &&
				notification.getNewValue() instanceof NamedValue) {
			handleNewEnumValue((Enumerated)notification.getNotifier(), (NamedValue)notification.getNewValue());
		}
		
		if(notification.getNotifier() instanceof TypedElement && notification.getNewValue() instanceof TypeDefinition) {
			handleNewTypeDefinition((TypedElement)notification.getNotifier(), (TypeDefinition)notification.getNewValue());
		}

		if(notification.getNewValue() instanceof FunctionalResource) {
			FunctionalResource fr = (FunctionalResource)notification.getNewValue();				
			adjustLocalTypeReferences(fr);
		}

		if(notification.getNotifier() instanceof Choice && notification.getNewValue() instanceof Element) {
			handleNewChoiceElement((Choice)notification.getNotifier(), (Element)notification.getNewValue());
		}
		
		super.notifyChanged(notification);
	}

	/**
	 * Adjust the local type reference for this object and all children
	 * @param obj
	 */
	private void adjustLocalTypeReferences(EObject obj) {
		if(obj instanceof TypeReferenceLocal) {
			TypeReferenceLocal lr = (TypeReferenceLocal)obj;
			replaceTypeRefLocal(lr);
		}
		
		TreeIterator<EObject> iter = obj.eAllContents();
		while(iter.hasNext()) {
			EObject child = iter.next();
			adjustLocalTypeReferences(child);
		}
	}
	
	/**
	 * Replace the type reference of the given local type reference if 
	 * in the local ASN.1 type module has a type definition of the same name 
	 * @param localReference	The local reference, which is adjusted to 
	 * 							reference only type definitions from the 
	 * 							local FRM ASN.1 module
	 */
	private void replaceTypeRefLocal(TypeReferenceLocal localReference) {
		EObject parentContainer = localReference.eContainer();
		Module localAsn1Module = null;
		
		// find the FRM and the ASN.1 module below
		while(parentContainer.eContainer() != null) {
			parentContainer = parentContainer.eContainer();
			if(parentContainer != null && parentContainer instanceof FunctionalResourceModel) {
				FunctionalResourceModel frm = (FunctionalResourceModel)parentContainer;
				localAsn1Module = frm.getAsnTypeModule();
				break;
			}
		}
		
		if(localAsn1Module != null) {
			int typeIndex = 0;
			boolean foundLocalTypeDef = false;
			for(TypeDefinition localTypeDef : localAsn1Module.getTypeDefinition()) {
				
				// same type name, but objects are not the same, so it is from another FRM file (or there are more with same name) 
				if(localTypeDef.getName() != null &&
						localTypeDef.getName().equals(localReference.getTypeDefinition().getName()) && 
								localTypeDef != localReference.getTypeDefinition()) {
					String parent = localReference.eContainer().eClass().getName();
					foundLocalTypeDef = true;
					
					if(localReference.eContainer() instanceof TypeDefinition) {
						parent = ((TypeDefinition)localReference.eContainer()).getName();
					}
					
					if(localReference.eContainer() instanceof Element) {
						parent = ((Element)localReference.eContainer()).getName();
					}
					
					FrTypesUtil.log("Replace type reference to other FRM file: " + localTypeDef.getName() + " at index " + typeIndex + " parent: " + parent);
					
					localReference.setTypeDefinition(localTypeDef);
				} else if(localTypeDef.getName() != null &&
						localTypeDef.getName().equals(localReference.getTypeDefinition().getName()) && 
						localTypeDef == localReference.getTypeDefinition()) {
					foundLocalTypeDef = true;
				}
				typeIndex++;
			} // end for
			
			if(foundLocalTypeDef == false) {
				try {
					FrTypesUtil.warn("Could not replace type reference to other FRM file: " + localReference.getTypeDefinition().getName() +
							" parent: " + localReference.eContainer());
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	/**
	 * Handles new NaemdValue children for enums and initialises with the next numeric value
	 * @param notifier
	 * @param newValue
	 */
	private void handleNewEnumValue(Enumerated notifier, NamedValue newValue) {
		try {
			int numValues = notifier.getValues().size();
			if(numValues > 1) {
				int newEnumValue = notifier.getValues().get(numValues-1-1 /*new value is already in the list*/).getValue() + 1;
				newValue.setValue(newEnumValue);
			}
		} catch(Exception e ) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Handles new TypeDefinition objects and initialises the name according to the classifier of the parent.
	 * @param typedElement
	 * @param newTypeDefinition
	 */
	private void handleNewTypeDefinition(TypedElement typedElement, TypeDefinition newTypeDefinition) {
		try {
			if(newTypeDefinition.getName() == null || newTypeDefinition.getName().length() == 0 &&
					typedElement.getClassifier() != null && typedElement.getClassifier().length() > 1) {
				newTypeDefinition.setName(typedElement.getClassifier().substring(0, 1).toUpperCase() 
						+ typedElement.getClassifier().substring(1));
			}
		} catch(Exception e ) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * Handles a new element under a choice. Sets the tag to Choice#size - 1 
	 * @param choice
	 * @param newElement
	 */
	private void handleNewChoiceElement(Choice choice, Element newElement) {
		try {
			if(choice != null && choice.getElements() != null) {
				int idx = 0;
				for(Type childElement : choice.getElements()) {
					if(childElement instanceof Element && childElement == newElement) {
						newElement.setTag(Integer.toString(idx));
						
					} else if(childElement instanceof Element && ((Element)childElement).getTag() != null) {
						idx = Integer.parseInt(((Element)childElement).getTag());
					}
					idx++;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
