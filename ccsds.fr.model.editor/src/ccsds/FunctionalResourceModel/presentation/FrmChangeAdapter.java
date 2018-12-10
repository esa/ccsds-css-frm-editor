package ccsds.FunctionalResourceModel.presentation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;

import ccsds.FunctionalResourceModel.TypedElement;
import ccsds.fr.type.model.frtypes.Enumerated;
import ccsds.fr.type.model.frtypes.NamedValue;
import ccsds.fr.type.model.frtypes.TypeDefinition;

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
		
		super.notifyChanged(notification);
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
}
