/**
 * Generated with Acceleo
 */
package ccsds.fr.type.model.frtypes.components;

// Start of user code for imports
import ccsds.fr.type.model.frtypes.FrtypesPackage;
import ccsds.fr.type.model.frtypes.ValueRangeConstraint;

import ccsds.fr.type.model.frtypes.parts.FrtypesViewsRepository;
import ccsds.fr.type.model.frtypes.parts.ValueRangeConstraintPropertiesEditionPart;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;


// End of user code

/**
 * 
 * 
 */
public class ValueRangeConstraintPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public ValueRangeConstraintPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject valueRangeConstraint, String editing_mode) {
		super(editingContext, valueRangeConstraint, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = FrtypesViewsRepository.class;
		partKey = FrtypesViewsRepository.ValueRangeConstraint.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			
			final ValueRangeConstraint valueRangeConstraint = (ValueRangeConstraint)elt;
			final ValueRangeConstraintPropertiesEditionPart basePart = (ValueRangeConstraintPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(FrtypesViewsRepository.ValueRangeConstraint.Properties.min))
				basePart.setMin(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, valueRangeConstraint.getMin()));
			
			if (isAccessible(FrtypesViewsRepository.ValueRangeConstraint.Properties.max))
				basePart.setMax(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, valueRangeConstraint.getMax()));
			
			// init filters
			
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}





	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == FrtypesViewsRepository.ValueRangeConstraint.Properties.min) {
			return FrtypesPackage.eINSTANCE.getValueRangeConstraint_Min();
		}
		if (editorKey == FrtypesViewsRepository.ValueRangeConstraint.Properties.max) {
			return FrtypesPackage.eINSTANCE.getValueRangeConstraint_Max();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ValueRangeConstraint valueRangeConstraint = (ValueRangeConstraint)semanticObject;
		if (FrtypesViewsRepository.ValueRangeConstraint.Properties.min == event.getAffectedEditor()) {
			valueRangeConstraint.setMin((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (FrtypesViewsRepository.ValueRangeConstraint.Properties.max == event.getAffectedEditor()) {
			valueRangeConstraint.setMax((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			ValueRangeConstraintPropertiesEditionPart basePart = (ValueRangeConstraintPropertiesEditionPart)editingPart;
			if (FrtypesPackage.eINSTANCE.getValueRangeConstraint_Min().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FrtypesViewsRepository.ValueRangeConstraint.Properties.min)) {
				if (msg.getNewValue() != null) {
					basePart.setMin(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setMin("");
				}
			}
			if (FrtypesPackage.eINSTANCE.getValueRangeConstraint_Max().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FrtypesViewsRepository.ValueRangeConstraint.Properties.max)) {
				if (msg.getNewValue() != null) {
					basePart.setMax(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setMax("");
				}
			}
			
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getNotificationFilters()
	 */
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		NotificationFilter filter = new EStructuralFeatureNotificationFilter(
			FrtypesPackage.eINSTANCE.getValueRangeConstraint_Min(),
			FrtypesPackage.eINSTANCE.getValueRangeConstraint_Max()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == FrtypesViewsRepository.ValueRangeConstraint.Properties.min || key == FrtypesViewsRepository.ValueRangeConstraint.Properties.max;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (FrtypesViewsRepository.ValueRangeConstraint.Properties.min == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FrtypesPackage.eINSTANCE.getValueRangeConstraint_Min().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FrtypesPackage.eINSTANCE.getValueRangeConstraint_Min().getEAttributeType(), newValue);
				}
				if (FrtypesViewsRepository.ValueRangeConstraint.Properties.max == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FrtypesPackage.eINSTANCE.getValueRangeConstraint_Max().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FrtypesPackage.eINSTANCE.getValueRangeConstraint_Max().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}


	

	

}
