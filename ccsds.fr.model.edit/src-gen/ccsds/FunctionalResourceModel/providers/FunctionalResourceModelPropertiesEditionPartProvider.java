/**
 * Generated with Acceleo
 */
package ccsds.FunctionalResourceModel.providers;

import ccsds.FunctionalResourceModel.parts.FunctionalResourceModelViewsRepository;

import ccsds.FunctionalResourceModel.parts.forms.DirectivePropertiesEditionPartForm;
import ccsds.FunctionalResourceModel.parts.forms.EventPropertiesEditionPartForm;
import ccsds.FunctionalResourceModel.parts.forms.FrModelElementPropertiesEditionPartForm;
import ccsds.FunctionalResourceModel.parts.forms.FunctionalResourceModelPropertiesEditionPartForm;
import ccsds.FunctionalResourceModel.parts.forms.FunctionalResourcePropertiesEditionPartForm;
import ccsds.FunctionalResourceModel.parts.forms.OidPropertiesEditionPartForm;
import ccsds.FunctionalResourceModel.parts.forms.ParameterPropertiesEditionPartForm;

import ccsds.FunctionalResourceModel.parts.impl.DirectivePropertiesEditionPartImpl;
import ccsds.FunctionalResourceModel.parts.impl.EventPropertiesEditionPartImpl;
import ccsds.FunctionalResourceModel.parts.impl.FrModelElementPropertiesEditionPartImpl;
import ccsds.FunctionalResourceModel.parts.impl.FunctionalResourceModelPropertiesEditionPartImpl;
import ccsds.FunctionalResourceModel.parts.impl.FunctionalResourcePropertiesEditionPartImpl;
import ccsds.FunctionalResourceModel.parts.impl.OidPropertiesEditionPartImpl;
import ccsds.FunctionalResourceModel.parts.impl.ParameterPropertiesEditionPartImpl;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

/**
 * 
 * 
 */
public class FunctionalResourceModelPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == FunctionalResourceModelViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == FunctionalResourceModelViewsRepository.FunctionalResourceModel_.class) {
			if (kind == FunctionalResourceModelViewsRepository.SWT_KIND)
				return new FunctionalResourceModelPropertiesEditionPartImpl(component);
			if (kind == FunctionalResourceModelViewsRepository.FORM_KIND)
				return new FunctionalResourceModelPropertiesEditionPartForm(component);
		}
		if (key == FunctionalResourceModelViewsRepository.FrModelElement.class) {
			if (kind == FunctionalResourceModelViewsRepository.SWT_KIND)
				return new FrModelElementPropertiesEditionPartImpl(component);
			if (kind == FunctionalResourceModelViewsRepository.FORM_KIND)
				return new FrModelElementPropertiesEditionPartForm(component);
		}
		if (key == FunctionalResourceModelViewsRepository.Oid.class) {
			if (kind == FunctionalResourceModelViewsRepository.SWT_KIND)
				return new OidPropertiesEditionPartImpl(component);
			if (kind == FunctionalResourceModelViewsRepository.FORM_KIND)
				return new OidPropertiesEditionPartForm(component);
		}
		if (key == FunctionalResourceModelViewsRepository.FunctionalResource.class) {
			if (kind == FunctionalResourceModelViewsRepository.SWT_KIND)
				return new FunctionalResourcePropertiesEditionPartImpl(component);
			if (kind == FunctionalResourceModelViewsRepository.FORM_KIND)
				return new FunctionalResourcePropertiesEditionPartForm(component);
		}
		if (key == FunctionalResourceModelViewsRepository.Event.class) {
			if (kind == FunctionalResourceModelViewsRepository.SWT_KIND)
				return new EventPropertiesEditionPartImpl(component);
			if (kind == FunctionalResourceModelViewsRepository.FORM_KIND)
				return new EventPropertiesEditionPartForm(component);
		}
		if (key == FunctionalResourceModelViewsRepository.Directive.class) {
			if (kind == FunctionalResourceModelViewsRepository.SWT_KIND)
				return new DirectivePropertiesEditionPartImpl(component);
			if (kind == FunctionalResourceModelViewsRepository.FORM_KIND)
				return new DirectivePropertiesEditionPartForm(component);
		}
		if (key == FunctionalResourceModelViewsRepository.Parameter.class) {
			if (kind == FunctionalResourceModelViewsRepository.SWT_KIND)
				return new ParameterPropertiesEditionPartImpl(component);
			if (kind == FunctionalResourceModelViewsRepository.FORM_KIND)
				return new ParameterPropertiesEditionPartForm(component);
		}
		return null;
	}

}