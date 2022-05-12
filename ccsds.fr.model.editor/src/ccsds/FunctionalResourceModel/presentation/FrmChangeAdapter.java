package ccsds.FunctionalResourceModel.presentation;

/*-
 * #%L
 * CCSDS Functional Resource Model Editor
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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;

import ccsds.FunctionalResourceModel.AncillaryInterface;
import ccsds.FunctionalResourceModel.FunctionalResourceModel;
import ccsds.FunctionalResourceModel.ServiceAccessPoint;
import ccsds.FunctionalResourceModel.TypedElement;
import ccsds.fr.type.model.frtypes.Choice;
import ccsds.fr.type.model.frtypes.Element;
import ccsds.fr.type.model.frtypes.Enumerated;
import ccsds.fr.type.model.frtypes.NamedValue;
import ccsds.fr.type.model.frtypes.Type;
import ccsds.fr.type.model.frtypes.TypeDefinition;
import ccsds.fr.utility.FrUtility;

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

		// for the getFrm(fr) call below we assume that the fr is already contained under the target FRM (target of drag and drop)
//		if(notification.getNewValue() instanceof FunctionalResource) {
//			FunctionalResource fr = (FunctionalResource)notification.getNewValue();			
//			
//			List<TypeDefinition> localTypes = new LinkedList<TypeDefinition>();
//			FunctionalResourceModel frm = FrUtility.getFrm(fr);
//			FrUtility.getAllLocalTypeDefinitions(frm, localTypes);
//			FrUtility.adjustLocalTypeReferences(fr, frm, localTypes);
//			
//			FrUtility.adjustServiceAccessPointReferences(fr, FrUtility.getFrm(fr));
//			FrUtility.adjustAncillaryInterfaceReferences(fr, FrUtility.getFrm(fr));
//		}
		
		if(notification.getNewValue() instanceof ServiceAccessPoint) {
			FunctionalResourceModel frm =  FrUtility.getFrm((EObject)notification.getNewValue());
			FrUtility.adjustServiceAccessPointReference((ServiceAccessPoint)notification.getNewValue(), frm, FrUtility.getFunctionalResources(frm));
		}

		if(notification.getNewValue() instanceof AncillaryInterface) {
			FunctionalResourceModel frm =  FrUtility.getFrm((EObject)notification.getNewValue());
			FrUtility.adjustAncillaryInterfaceReference((AncillaryInterface)notification.getNewValue(), frm, FrUtility.getFunctionalResources(frm));
		}		
		
		if(notification.getNotifier() instanceof Choice && notification.getNewValue() instanceof Element) {
			handleNewChoiceElement((Choice)notification.getNotifier(), (Element)notification.getNewValue());
		}
		
		super.notifyChanged(notification);
	}

	/**
	 * Handles new NaemdValue children for enums and initialises with the next numeric value
	 * @param notifier
	 * @param newValue
	 */
	private static void handleNewEnumValue(Enumerated notifier, NamedValue newValue) {
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
	private static void handleNewTypeDefinition(TypedElement typedElement, TypeDefinition newTypeDefinition) {
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
	private static void handleNewChoiceElement(Choice choice, Element newElement) {
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
