/**
 * Generated with Acceleo
 */
package ccsds.FunctionalResourceModel.components;

// Start of user code for imports
import ccsds.FunctionalResourceModel.FunctionalResourceModelPackage;
import ccsds.FunctionalResourceModel.Parameter;
import ccsds.FunctionalResourceModel.parts.FunctionalResourceModelViewsRepository;
import ccsds.FunctionalResourceModel.parts.TypeDefinitionViewPropertiesEditionPart;

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
public class ParameterTypeDefinitionViewPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String TYPEDEFINITIONVIEW_PART = "TypeDefinitionView"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public ParameterTypeDefinitionViewPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject parameter, String editing_mode) {
		super(editingContext, parameter, editing_mode);
		parts = new String[] { TYPEDEFINITIONVIEW_PART };
		repositoryKey = FunctionalResourceModelViewsRepository.class;
		partKey = FunctionalResourceModelViewsRepository.TypeDefinitionView.class;
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
			
			final Parameter parameter = (Parameter)elt;
			final TypeDefinitionViewPropertiesEditionPart typeDefinitionViewPart = (TypeDefinitionViewPropertiesEditionPart)editingPart;
			// init values
			if (parameter.getTypeDefinition() != null && isAccessible(FunctionalResourceModelViewsRepository.TypeDefinitionView.typeDefinitionRichText))
				typeDefinitionViewPart.setTypeDefinitionRichText(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, parameter.getTypeDefinition()));
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
		if (editorKey == FunctionalResourceModelViewsRepository.TypeDefinitionView.typeDefinitionRichText) {
			return FunctionalResourceModelPackage.eINSTANCE.getParameter_TypeDefinition();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Parameter parameter = (Parameter)semanticObject;
		if (FunctionalResourceModelViewsRepository.TypeDefinitionView.typeDefinitionRichText == event.getAffectedEditor()) {
			parameter.setTypeDefinition((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			TypeDefinitionViewPropertiesEditionPart typeDefinitionViewPart = (TypeDefinitionViewPropertiesEditionPart)editingPart;
			if (FunctionalResourceModelPackage.eINSTANCE.getParameter_TypeDefinition().equals(msg.getFeature()) && isAccessible(FunctionalResourceModelViewsRepository.TypeDefinitionView.typeDefinitionRichText)){
				if (msg.getNewValue() != null) {
					typeDefinitionViewPart.setTypeDefinitionRichText(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					typeDefinitionViewPart.setTypeDefinitionRichText("");
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
			FunctionalResourceModelPackage.eINSTANCE.getParameter_TypeDefinition()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == FunctionalResourceModelViewsRepository.Parameter.Properties.semanticDefinition || key == FunctionalResourceModelViewsRepository.Parameter.Properties.oidBit || key == FunctionalResourceModelViewsRepository.Parameter.Properties.deprecated || key == FunctionalResourceModelViewsRepository.Parameter.Properties.authorizingEntity || key == FunctionalResourceModelViewsRepository.Parameter.Properties.name || key == FunctionalResourceModelViewsRepository.Parameter.Properties.version || key == FunctionalResourceModelViewsRepository.TypeDefinitionView.typeDefinitionRichText;
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
				if (FunctionalResourceModelViewsRepository.TypeDefinitionView.typeDefinitionRichText == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getParameter_TypeDefinition().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getParameter_TypeDefinition().getEAttributeType(), newValue);
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
