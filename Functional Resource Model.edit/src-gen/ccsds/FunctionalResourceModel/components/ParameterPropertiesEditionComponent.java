/**
 * Generated with Acceleo
 */
package ccsds.FunctionalResourceModel.components;

// Start of user code for imports
import ccsds.FunctionalResourceModel.FunctionalResourceModelPackage;
import ccsds.FunctionalResourceModel.Parameter;
import ccsds.FunctionalResourceModel.parts.FunctionalResourceModelViewsRepository;
import ccsds.FunctionalResourceModel.parts.ParameterPropertiesEditionPart;
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
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;


// End of user code

/**
 * 
 * 
 */
public class ParameterPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private ParameterPropertiesEditionPart basePart;

	/**
	 * The ParameterBasePropertiesEditionComponent sub component
	 * 
	 */
	protected ParameterBasePropertiesEditionComponent parameterBasePropertiesEditionComponent;

	/**
	 * The TypeDefinitionView part
	 * 
	 */
	private TypeDefinitionViewPropertiesEditionPart typeDefinitionViewPart;

	/**
	 * The ParameterTypeDefinitionViewPropertiesEditionComponent sub component
	 * 
	 */
	protected ParameterTypeDefinitionViewPropertiesEditionComponent parameterTypeDefinitionViewPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param parameter the EObject to edit
	 * 
	 */
	public ParameterPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject parameter, String editing_mode) {
		super(editingContext, editing_mode);
		if (parameter instanceof Parameter) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(parameter, PropertiesEditingProvider.class);
			parameterBasePropertiesEditionComponent = (ParameterBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, ParameterBasePropertiesEditionComponent.BASE_PART, ParameterBasePropertiesEditionComponent.class);
			addSubComponent(parameterBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(parameter, PropertiesEditingProvider.class);
			parameterTypeDefinitionViewPropertiesEditionComponent = (ParameterTypeDefinitionViewPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, ParameterTypeDefinitionViewPropertiesEditionComponent.TYPEDEFINITIONVIEW_PART, ParameterTypeDefinitionViewPropertiesEditionComponent.class);
			addSubComponent(parameterTypeDefinitionViewPropertiesEditionComponent);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent#
	 *      getPropertiesEditionPart(int, java.lang.String)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(int kind, String key) {
		if (ParameterBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (ParameterPropertiesEditionPart)parameterBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (ParameterTypeDefinitionViewPropertiesEditionComponent.TYPEDEFINITIONVIEW_PART.equals(key)) {
			typeDefinitionViewPart = (TypeDefinitionViewPropertiesEditionPart)parameterTypeDefinitionViewPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)typeDefinitionViewPart;
		}
		return super.getPropertiesEditionPart(kind, key);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent#
	 *      setPropertiesEditionPart(java.lang.Object, int,
	 *      org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart)
	 * 
	 */
	public void setPropertiesEditionPart(java.lang.Object key, int kind, IPropertiesEditionPart propertiesEditionPart) {
		if (FunctionalResourceModelViewsRepository.Parameter.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (ParameterPropertiesEditionPart)propertiesEditionPart;
		}
		if (FunctionalResourceModelViewsRepository.TypeDefinitionView.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			typeDefinitionViewPart = (TypeDefinitionViewPropertiesEditionPart)propertiesEditionPart;
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent#
	 *      initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject,
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(java.lang.Object key, int kind, EObject element, ResourceSet allResource) {
		if (key == FunctionalResourceModelViewsRepository.Parameter.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == FunctionalResourceModelViewsRepository.TypeDefinitionView.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
