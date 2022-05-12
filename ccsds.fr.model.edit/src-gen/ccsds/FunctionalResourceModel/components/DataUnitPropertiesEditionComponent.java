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
import ccsds.FunctionalResourceModel.Annotation;
import ccsds.FunctionalResourceModel.DataUnit;
import ccsds.FunctionalResourceModel.FunctionalResourceModelPackage;

import ccsds.FunctionalResourceModel.parts.DataUnitPropertiesEditionPart;
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
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

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
public class DataUnitPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for annotation ReferencesTable
	 */
	protected ReferencesTableSettings annotationSettings;
	
	/**
	 * Settings for subDataUnit ReferencesTable
	 */
	protected ReferencesTableSettings subDataUnitSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public DataUnitPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject dataUnit, String editing_mode) {
		super(editingContext, dataUnit, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = FunctionalResourceModelViewsRepository.class;
		partKey = FunctionalResourceModelViewsRepository.DataUnit.class;
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
			
			final DataUnit dataUnit = (DataUnit)elt;
			final DataUnitPropertiesEditionPart basePart = (DataUnitPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(FunctionalResourceModelViewsRepository.DataUnit.Properties.semanticDefinition))
				basePart.setSemanticDefinition(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, dataUnit.getSemanticDefinition()));
			if (isAccessible(FunctionalResourceModelViewsRepository.DataUnit.Properties.classifier))
				basePart.setClassifier(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, dataUnit.getClassifier()));
			
			if (isAccessible(FunctionalResourceModelViewsRepository.DataUnit.Properties.stringIdentifier))
				basePart.setStringIdentifier(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, dataUnit.getStringIdentifier()));
			
			if (isAccessible(FunctionalResourceModelViewsRepository.DataUnit.Properties.version)) {
				basePart.setVersion(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, dataUnit.getVersion()));
			}
			
			if (isAccessible(FunctionalResourceModelViewsRepository.DataUnit.Properties.creationDate))
				basePart.setCreationDate(EEFConverterUtil.convertToString(EcorePackage.Literals.EDATE, dataUnit.getCreationDate()));
			
			if (isAccessible(FunctionalResourceModelViewsRepository.DataUnit.Properties.authorizingEntity))
				basePart.setAuthorizingEntity(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, dataUnit.getAuthorizingEntity()));
			
			if (isAccessible(FunctionalResourceModelViewsRepository.DataUnit.Properties.oidBit)) {
				basePart.setOidBit(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, dataUnit.getOidBit()));
			}
			
			if (isAccessible(FunctionalResourceModelViewsRepository.DataUnit.Properties.deprecated)) {
				basePart.setDeprecated(dataUnit.isDeprecated());
			}
			if (isAccessible(FunctionalResourceModelViewsRepository.DataUnit.Properties.annotation)) {
				annotationSettings = new ReferencesTableSettings(dataUnit, FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Annotation());
				basePart.initAnnotation(annotationSettings);
			}
			// FIXME NO VALID CASE INTO template public updater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : typeDefinition, DataUnit, DataUnit.
			if (isAccessible(FunctionalResourceModelViewsRepository.DataUnit.Properties.subDataUnit)) {
				subDataUnitSettings = new ReferencesTableSettings(dataUnit, FunctionalResourceModelPackage.eINSTANCE.getDataUnit_SubDataUnit());
				basePart.initSubDataUnit(subDataUnitSettings);
			}
			// init filters
			
			
			
			
			
			
			
			
			if (isAccessible(FunctionalResourceModelViewsRepository.DataUnit.Properties.annotation)) {
				basePart.addFilterToAnnotation(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Annotation); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for annotation
				// End of user code
			}
			// FIXME NO VALID CASE INTO template public filterUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : typeDefinition, DataUnit, DataUnit.
			if (isAccessible(FunctionalResourceModelViewsRepository.DataUnit.Properties.subDataUnit)) {
				basePart.addFilterToSubDataUnit(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof DataUnit); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for subDataUnit
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
		if (editorKey == FunctionalResourceModelViewsRepository.DataUnit.Properties.semanticDefinition) {
			return FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_SemanticDefinition();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.DataUnit.Properties.classifier) {
			return FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Classifier();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.DataUnit.Properties.stringIdentifier) {
			return FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_StringIdentifier();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.DataUnit.Properties.version) {
			return FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Version();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.DataUnit.Properties.creationDate) {
			return FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_CreationDate();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.DataUnit.Properties.authorizingEntity) {
			return FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_AuthorizingEntity();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.DataUnit.Properties.oidBit) {
			return FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_OidBit();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.DataUnit.Properties.deprecated) {
			return FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Deprecated();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.DataUnit.Properties.annotation) {
			return FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Annotation();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.DataUnit.Properties.typeDefinition) {
			return FunctionalResourceModelPackage.eINSTANCE.getDataUnit_TypeDefinition();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.DataUnit.Properties.subDataUnit) {
			return FunctionalResourceModelPackage.eINSTANCE.getDataUnit_SubDataUnit();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		DataUnit dataUnit = (DataUnit)semanticObject;
		if (FunctionalResourceModelViewsRepository.DataUnit.Properties.semanticDefinition == event.getAffectedEditor()) {
			dataUnit.setSemanticDefinition((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (FunctionalResourceModelViewsRepository.DataUnit.Properties.classifier == event.getAffectedEditor()) {
			dataUnit.setClassifier((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (FunctionalResourceModelViewsRepository.DataUnit.Properties.stringIdentifier == event.getAffectedEditor()) {
			dataUnit.setStringIdentifier((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (FunctionalResourceModelViewsRepository.DataUnit.Properties.version == event.getAffectedEditor()) {
			dataUnit.setVersion((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (FunctionalResourceModelViewsRepository.DataUnit.Properties.creationDate == event.getAffectedEditor()) {
			dataUnit.setCreationDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.Literals.EDATE, (String)event.getNewValue()));
		}
		if (FunctionalResourceModelViewsRepository.DataUnit.Properties.authorizingEntity == event.getAffectedEditor()) {
			dataUnit.setAuthorizingEntity((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (FunctionalResourceModelViewsRepository.DataUnit.Properties.oidBit == event.getAffectedEditor()) {
			dataUnit.setOidBit((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (FunctionalResourceModelViewsRepository.DataUnit.Properties.deprecated == event.getAffectedEditor()) {
			dataUnit.setDeprecated((Boolean)event.getNewValue());
		}
		if (FunctionalResourceModelViewsRepository.DataUnit.Properties.annotation == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, annotationSettings, editingContext.getAdapterFactory());
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
				annotationSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				annotationSettings.move(event.getNewIndex(), (Annotation) event.getNewValue());
			}
		}
		if (FunctionalResourceModelViewsRepository.DataUnit.Properties.typeDefinition == event.getAffectedEditor()) {
			// FIXME INVALID CASE you must override the template 'declareEObjectUpdater' for the case : typeDefinition, DataUnit, DataUnit.
		}
		if (FunctionalResourceModelViewsRepository.DataUnit.Properties.subDataUnit == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, subDataUnitSettings, editingContext.getAdapterFactory());
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
				subDataUnitSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				subDataUnitSettings.move(event.getNewIndex(), (DataUnit) event.getNewValue());
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
			DataUnitPropertiesEditionPart basePart = (DataUnitPropertiesEditionPart)editingPart;
			if (FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_SemanticDefinition().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.DataUnit.Properties.semanticDefinition)){
				if (msg.getNewValue() != null) {
					basePart.setSemanticDefinition(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setSemanticDefinition("");
				}
			}
			if (FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Classifier().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.DataUnit.Properties.classifier)) {
				if (msg.getNewValue() != null) {
					basePart.setClassifier(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setClassifier("");
				}
			}
			if (FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_StringIdentifier().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.DataUnit.Properties.stringIdentifier)) {
				if (msg.getNewValue() != null) {
					basePart.setStringIdentifier(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setStringIdentifier("");
				}
			}
			if (FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Version().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.DataUnit.Properties.version)) {
				if (msg.getNewValue() != null) {
					basePart.setVersion(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setVersion("");
				}
			}
			if (FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_CreationDate().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.DataUnit.Properties.creationDate)) {
				if (msg.getNewValue() != null) {
					basePart.setCreationDate(EcoreUtil.convertToString(EcorePackage.Literals.EDATE, msg.getNewValue()));
				} else {
					basePart.setCreationDate("");
				}
			}
			if (FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_AuthorizingEntity().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.DataUnit.Properties.authorizingEntity)) {
				if (msg.getNewValue() != null) {
					basePart.setAuthorizingEntity(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setAuthorizingEntity("");
				}
			}
			if (FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_OidBit().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.DataUnit.Properties.oidBit)) {
				if (msg.getNewValue() != null) {
					basePart.setOidBit(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setOidBit("");
				}
			}
			if (FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Deprecated().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.DataUnit.Properties.deprecated))
				basePart.setDeprecated((Boolean)msg.getNewValue());
			
			if (FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Annotation().equals(msg.getFeature()) && isAccessible(FunctionalResourceModelViewsRepository.DataUnit.Properties.annotation))
				basePart.updateAnnotation();
			// FIXME INVALID CASE INTO template public liveUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : typeDefinition, DataUnit, DataUnit.
			if (FunctionalResourceModelPackage.eINSTANCE.getDataUnit_SubDataUnit().equals(msg.getFeature()) && isAccessible(FunctionalResourceModelViewsRepository.DataUnit.Properties.subDataUnit))
				basePart.updateSubDataUnit();
			
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
			FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_SemanticDefinition(),
			FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Classifier(),
			FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_StringIdentifier(),
			FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Version(),
			FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_CreationDate(),
			FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_AuthorizingEntity(),
			FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_OidBit(),
			FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Deprecated(),
			FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Annotation(),
			FunctionalResourceModelPackage.eINSTANCE.getDataUnit_TypeDefinition(),
			FunctionalResourceModelPackage.eINSTANCE.getDataUnit_SubDataUnit()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == FunctionalResourceModelViewsRepository.DataUnit.Properties.semanticDefinition || key == FunctionalResourceModelViewsRepository.DataUnit.Properties.classifier || key == FunctionalResourceModelViewsRepository.DataUnit.Properties.version || key == FunctionalResourceModelViewsRepository.DataUnit.Properties.authorizingEntity || key == FunctionalResourceModelViewsRepository.DataUnit.Properties.oidBit || key == FunctionalResourceModelViewsRepository.DataUnit.Properties.deprecated || key == FunctionalResourceModelViewsRepository.DataUnit.Properties.typeDefinition;
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
				if (FunctionalResourceModelViewsRepository.DataUnit.Properties.semanticDefinition == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_SemanticDefinition().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_SemanticDefinition().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.DataUnit.Properties.classifier == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Classifier().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Classifier().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.DataUnit.Properties.stringIdentifier == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_StringIdentifier().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_StringIdentifier().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.DataUnit.Properties.version == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Version().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Version().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.DataUnit.Properties.creationDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_CreationDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_CreationDate().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.DataUnit.Properties.authorizingEntity == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_AuthorizingEntity().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_AuthorizingEntity().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.DataUnit.Properties.oidBit == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_OidBit().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_OidBit().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.DataUnit.Properties.deprecated == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Deprecated().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Deprecated().getEAttributeType(), newValue);
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
