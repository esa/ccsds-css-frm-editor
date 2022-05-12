/**
 * Generated with Acceleo
 */
package ccsds.FunctionalResourceModel.components;

/*-
 * #%L
 * CCSDS Functional Resource Model Edit
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

// Start of user code for imports
import ccsds.FunctionalResourceModel.AncillaryInterface;
import ccsds.FunctionalResourceModel.FunctionalResource;
import ccsds.FunctionalResourceModel.FunctionalResourceModelFactory;
import ccsds.FunctionalResourceModel.FunctionalResourceModelPackage;

import ccsds.FunctionalResourceModel.parts.AncillaryInterfacePropertiesEditionPart;
import ccsds.FunctionalResourceModel.parts.FunctionalResourceModelViewsRepository;

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

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public class AncillaryInterfacePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for providingFunctionalResource EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings providingFunctionalResourceSettings;
	
	/**
	 * Settings for requiringFunctionalResource EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings requiringFunctionalResourceSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public AncillaryInterfacePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject ancillaryInterface, String editing_mode) {
		super(editingContext, ancillaryInterface, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = FunctionalResourceModelViewsRepository.class;
		partKey = FunctionalResourceModelViewsRepository.AncillaryInterface.class;
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
			
			final AncillaryInterface ancillaryInterface = (AncillaryInterface)elt;
			final AncillaryInterfacePropertiesEditionPart basePart = (AncillaryInterfacePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, ancillaryInterface.getName()));
			
			if (isAccessible(FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.providingFunctionalResource)) {
				// init part
				providingFunctionalResourceSettings = new EObjectFlatComboSettings(ancillaryInterface, FunctionalResourceModelPackage.eINSTANCE.getAncillaryInterface_ProvidingFunctionalResource());
				basePart.initProvidingFunctionalResource(providingFunctionalResourceSettings);
				// set the button mode
				basePart.setProvidingFunctionalResourceButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.requiringFunctionalResource)) {
				// init part
				requiringFunctionalResourceSettings = new EObjectFlatComboSettings(ancillaryInterface, FunctionalResourceModelPackage.eINSTANCE.getAncillaryInterface_RequiringFunctionalResource());
				basePart.initRequiringFunctionalResource(requiringFunctionalResourceSettings);
				// set the button mode
				basePart.setRequiringFunctionalResourceButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			if (isAccessible(FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.providingFunctionalResource)) {
				basePart.addFilterToProvidingFunctionalResource(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof FunctionalResource);
					}
					
				});
				// Start of user code for additional businessfilters for providingFunctionalResource
				// End of user code
			}
			if (isAccessible(FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.requiringFunctionalResource)) {
				basePart.addFilterToRequiringFunctionalResource(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof FunctionalResource);
					}
					
				});
				// Start of user code for additional businessfilters for requiringFunctionalResource
				// End of user code
			}
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
		if (editorKey == FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.name) {
			return FunctionalResourceModelPackage.eINSTANCE.getAncillaryInterface_Name();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.providingFunctionalResource) {
			return FunctionalResourceModelPackage.eINSTANCE.getAncillaryInterface_ProvidingFunctionalResource();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.requiringFunctionalResource) {
			return FunctionalResourceModelPackage.eINSTANCE.getAncillaryInterface_RequiringFunctionalResource();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		AncillaryInterface ancillaryInterface = (AncillaryInterface)semanticObject;
		if (FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.name == event.getAffectedEditor()) {
			ancillaryInterface.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.providingFunctionalResource == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				providingFunctionalResourceSettings.setToReference((FunctionalResource)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				FunctionalResource eObject = FunctionalResourceModelFactory.eINSTANCE.createFunctionalResource();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				providingFunctionalResourceSettings.setToReference(eObject);
			}
		}
		if (FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.requiringFunctionalResource == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				requiringFunctionalResourceSettings.setToReference((FunctionalResource)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				FunctionalResource eObject = FunctionalResourceModelFactory.eINSTANCE.createFunctionalResource();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				requiringFunctionalResourceSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			AncillaryInterfacePropertiesEditionPart basePart = (AncillaryInterfacePropertiesEditionPart)editingPart;
			if (FunctionalResourceModelPackage.eINSTANCE.getAncillaryInterface_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (FunctionalResourceModelPackage.eINSTANCE.getAncillaryInterface_ProvidingFunctionalResource().equals(msg.getFeature()) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.providingFunctionalResource))
				basePart.setProvidingFunctionalResource((EObject)msg.getNewValue());
			if (FunctionalResourceModelPackage.eINSTANCE.getAncillaryInterface_RequiringFunctionalResource().equals(msg.getFeature()) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.requiringFunctionalResource))
				basePart.setRequiringFunctionalResource((EObject)msg.getNewValue());
			
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
			FunctionalResourceModelPackage.eINSTANCE.getAncillaryInterface_Name(),
			FunctionalResourceModelPackage.eINSTANCE.getAncillaryInterface_ProvidingFunctionalResource(),
			FunctionalResourceModelPackage.eINSTANCE.getAncillaryInterface_RequiringFunctionalResource()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.providingFunctionalResource || key == FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.requiringFunctionalResource;
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
				if (FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getAncillaryInterface_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getAncillaryInterface_Name().getEAttributeType(), newValue);
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
