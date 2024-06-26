/**
 * Generated with Acceleo
 */
package ccsds.fr.type.model.frtypes.components;

/*-
 * #%L
 * CCSDS Functional Resource Type Model Edit
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
import ccsds.fr.type.model.frtypes.CharacterString;
import ccsds.fr.type.model.frtypes.FrtypesPackage;
import ccsds.fr.type.model.frtypes.SizeConstraint;
import ccsds.fr.type.model.frtypes.StringType;

import ccsds.fr.type.model.frtypes.parts.CharacterStringPropertiesEditionPart;
import ccsds.fr.type.model.frtypes.parts.FrtypesViewsRepository;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public class CharacterStringPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for sizeConstraint ReferencesTable
	 */
	protected ReferencesTableSettings sizeConstraintSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public CharacterStringPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject characterString, String editing_mode) {
		super(editingContext, characterString, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = FrtypesViewsRepository.class;
		partKey = FrtypesViewsRepository.CharacterString.class;
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
			
			final CharacterString characterString = (CharacterString)elt;
			final CharacterStringPropertiesEditionPart basePart = (CharacterStringPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(FrtypesViewsRepository.CharacterString.Properties.sizeConstraint)) {
				sizeConstraintSettings = new ReferencesTableSettings(characterString, FrtypesPackage.eINSTANCE.getSizeConstrainedType_SizeConstraint());
				basePart.initSizeConstraint(sizeConstraintSettings);
			}
			if (isAccessible(FrtypesViewsRepository.CharacterString.Properties.type)) {
				basePart.initType(EEFUtils.choiceOfValues(characterString, FrtypesPackage.eINSTANCE.getCharacterString_Type()), characterString.getType());
			}
			// init filters
			if (isAccessible(FrtypesViewsRepository.CharacterString.Properties.sizeConstraint)) {
				basePart.addFilterToSizeConstraint(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof SizeConstraint); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for sizeConstraint
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
		if (editorKey == FrtypesViewsRepository.CharacterString.Properties.sizeConstraint) {
			return FrtypesPackage.eINSTANCE.getSizeConstrainedType_SizeConstraint();
		}
		if (editorKey == FrtypesViewsRepository.CharacterString.Properties.type) {
			return FrtypesPackage.eINSTANCE.getCharacterString_Type();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		CharacterString characterString = (CharacterString)semanticObject;
		if (FrtypesViewsRepository.CharacterString.Properties.sizeConstraint == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, sizeConstraintSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				sizeConstraintSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				sizeConstraintSettings.move(event.getNewIndex(), (SizeConstraint) event.getNewValue());
			}
		}
		if (FrtypesViewsRepository.CharacterString.Properties.type == event.getAffectedEditor()) {
			characterString.setType((StringType)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			CharacterStringPropertiesEditionPart basePart = (CharacterStringPropertiesEditionPart)editingPart;
			if (FrtypesPackage.eINSTANCE.getSizeConstrainedType_SizeConstraint().equals(msg.getFeature()) && isAccessible(FrtypesViewsRepository.CharacterString.Properties.sizeConstraint))
				basePart.updateSizeConstraint();
			if (FrtypesPackage.eINSTANCE.getCharacterString_Type().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(FrtypesViewsRepository.CharacterString.Properties.type))
				basePart.setType((StringType)msg.getNewValue());
			
			
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
			FrtypesPackage.eINSTANCE.getSizeConstrainedType_SizeConstraint(),
			FrtypesPackage.eINSTANCE.getCharacterString_Type()		);
		return new NotificationFilter[] {filter,};
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
				if (FrtypesViewsRepository.CharacterString.Properties.type == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FrtypesPackage.eINSTANCE.getCharacterString_Type().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FrtypesPackage.eINSTANCE.getCharacterString_Type().getEAttributeType(), newValue);
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
