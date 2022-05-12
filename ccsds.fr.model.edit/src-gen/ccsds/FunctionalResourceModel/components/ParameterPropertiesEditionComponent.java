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

import ccsds.FunctionalResourceModel.Annotation;
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
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent;
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
public class ParameterPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for annotation ReferencesTable
	 */
	protected ReferencesTableSettings annotationSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ParameterPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject parameter, String editing_mode) {
		super(editingContext, parameter, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = FunctionalResourceModelViewsRepository.class;
		partKey = FunctionalResourceModelViewsRepository.Parameter.class;
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
			final ParameterPropertiesEditionPart basePart = (ParameterPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(FunctionalResourceModelViewsRepository.Parameter.Properties.semanticDefinition))
				basePart.setSemanticDefinition(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, parameter.getSemanticDefinition()));
			if (isAccessible(FunctionalResourceModelViewsRepository.Parameter.Properties.classifier))
				basePart.setClassifier(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, parameter.getClassifier()));
			
			if (isAccessible(FunctionalResourceModelViewsRepository.Parameter.Properties.stringIdentifier))
				basePart.setStringIdentifier(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, parameter.getStringIdentifier()));
			
			if (isAccessible(FunctionalResourceModelViewsRepository.Parameter.Properties.version)) {
				basePart.setVersion(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, parameter.getVersion()));
			}
			
			if (isAccessible(FunctionalResourceModelViewsRepository.Parameter.Properties.creationDate))
				basePart.setCreationDate(EEFConverterUtil.convertToString(EcorePackage.Literals.EDATE, parameter.getCreationDate()));
			
			if (isAccessible(FunctionalResourceModelViewsRepository.Parameter.Properties.authorizingEntity))
				basePart.setAuthorizingEntity(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, parameter.getAuthorizingEntity()));
			
			if (isAccessible(FunctionalResourceModelViewsRepository.Parameter.Properties.oidBit)) {
				basePart.setOidBit(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, parameter.getOidBit()));
			}
			
			if (isAccessible(FunctionalResourceModelViewsRepository.Parameter.Properties.deprecated)) {
				basePart.setDeprecated(parameter.isDeprecated());
			}
			if (isAccessible(FunctionalResourceModelViewsRepository.Parameter.Properties.annotation)) {
				annotationSettings = new ReferencesTableSettings(parameter, FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Annotation());
				basePart.initAnnotation(annotationSettings);
			}
			if (isAccessible(FunctionalResourceModelViewsRepository.Parameter.Properties.typeDefinition))
				basePart.setTypeDefinition(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, parameter.getTypeDefinition()));
			if (isAccessible(FunctionalResourceModelViewsRepository.Parameter.Properties.engineeringUnit))
				basePart.setEngineeringUnit(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, parameter.getEngineeringUnit()));
			
			if (isAccessible(FunctionalResourceModelViewsRepository.Parameter.Properties.configured)) {
				basePart.setConfigured(parameter.isConfigured());
			}
			if (isAccessible(FunctionalResourceModelViewsRepository.Parameter.Properties.guardCondition))
				basePart.setGuardCondition(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, parameter.getGuardCondition()));
			// init filters
			
			
			
			
			
			
			
			
			if (isAccessible(FunctionalResourceModelViewsRepository.Parameter.Properties.annotation)) {
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
		if (editorKey == FunctionalResourceModelViewsRepository.Parameter.Properties.semanticDefinition) {
			return FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_SemanticDefinition();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.Parameter.Properties.classifier) {
			return FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Classifier();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.Parameter.Properties.stringIdentifier) {
			return FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_StringIdentifier();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.Parameter.Properties.version) {
			return FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Version();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.Parameter.Properties.creationDate) {
			return FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_CreationDate();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.Parameter.Properties.authorizingEntity) {
			return FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_AuthorizingEntity();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.Parameter.Properties.oidBit) {
			return FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_OidBit();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.Parameter.Properties.deprecated) {
			return FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Deprecated();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.Parameter.Properties.annotation) {
			return FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Annotation();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.Parameter.Properties.typeDefinition) {
			return FunctionalResourceModelPackage.eINSTANCE.getTypedElement_TypeDefinition();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.Parameter.Properties.engineeringUnit) {
			return FunctionalResourceModelPackage.eINSTANCE.getTypedElement_EngineeringUnit();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.Parameter.Properties.configured) {
			return FunctionalResourceModelPackage.eINSTANCE.getParameter_Configured();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.Parameter.Properties.guardCondition) {
			return FunctionalResourceModelPackage.eINSTANCE.getParameter_GuardCondition();
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
		if (FunctionalResourceModelViewsRepository.Parameter.Properties.semanticDefinition == event.getAffectedEditor()) {
			parameter.setSemanticDefinition((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (FunctionalResourceModelViewsRepository.Parameter.Properties.classifier == event.getAffectedEditor()) {
			parameter.setClassifier((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (FunctionalResourceModelViewsRepository.Parameter.Properties.stringIdentifier == event.getAffectedEditor()) {
			parameter.setStringIdentifier((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (FunctionalResourceModelViewsRepository.Parameter.Properties.version == event.getAffectedEditor()) {
			parameter.setVersion((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (FunctionalResourceModelViewsRepository.Parameter.Properties.creationDate == event.getAffectedEditor()) {
			parameter.setCreationDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.Literals.EDATE, (String)event.getNewValue()));
		}
		if (FunctionalResourceModelViewsRepository.Parameter.Properties.authorizingEntity == event.getAffectedEditor()) {
			parameter.setAuthorizingEntity((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (FunctionalResourceModelViewsRepository.Parameter.Properties.oidBit == event.getAffectedEditor()) {
			parameter.setOidBit((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (FunctionalResourceModelViewsRepository.Parameter.Properties.deprecated == event.getAffectedEditor()) {
			parameter.setDeprecated((Boolean)event.getNewValue());
		}
		if (FunctionalResourceModelViewsRepository.Parameter.Properties.annotation == event.getAffectedEditor()) {
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
		if (FunctionalResourceModelViewsRepository.Parameter.Properties.typeDefinition == event.getAffectedEditor()) {
			parameter.setTypeDefinition((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (FunctionalResourceModelViewsRepository.Parameter.Properties.engineeringUnit == event.getAffectedEditor()) {
			parameter.setEngineeringUnit((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (FunctionalResourceModelViewsRepository.Parameter.Properties.configured == event.getAffectedEditor()) {
			parameter.setConfigured((Boolean)event.getNewValue());
		}
		if (FunctionalResourceModelViewsRepository.Parameter.Properties.guardCondition == event.getAffectedEditor()) {
			parameter.setGuardCondition((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			ParameterPropertiesEditionPart basePart = (ParameterPropertiesEditionPart)editingPart;
			if (FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_SemanticDefinition().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.Parameter.Properties.semanticDefinition)){
				if (msg.getNewValue() != null) {
					basePart.setSemanticDefinition(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setSemanticDefinition("");
				}
			}
			if (FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Classifier().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.Parameter.Properties.classifier)) {
				if (msg.getNewValue() != null) {
					basePart.setClassifier(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setClassifier("");
				}
			}
			if (FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_StringIdentifier().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.Parameter.Properties.stringIdentifier)) {
				if (msg.getNewValue() != null) {
					basePart.setStringIdentifier(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setStringIdentifier("");
				}
			}
			if (FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Version().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.Parameter.Properties.version)) {
				if (msg.getNewValue() != null) {
					basePart.setVersion(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setVersion("");
				}
			}
			if (FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_CreationDate().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.Parameter.Properties.creationDate)) {
				if (msg.getNewValue() != null) {
					basePart.setCreationDate(EcoreUtil.convertToString(EcorePackage.Literals.EDATE, msg.getNewValue()));
				} else {
					basePart.setCreationDate("");
				}
			}
			if (FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_AuthorizingEntity().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.Parameter.Properties.authorizingEntity)) {
				if (msg.getNewValue() != null) {
					basePart.setAuthorizingEntity(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setAuthorizingEntity("");
				}
			}
			if (FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_OidBit().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.Parameter.Properties.oidBit)) {
				if (msg.getNewValue() != null) {
					basePart.setOidBit(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setOidBit("");
				}
			}
			if (FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Deprecated().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.Parameter.Properties.deprecated))
				basePart.setDeprecated((Boolean)msg.getNewValue());
			
			if (FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Annotation().equals(msg.getFeature()) && isAccessible(FunctionalResourceModelViewsRepository.Parameter.Properties.annotation))
				basePart.updateAnnotation();
			if (FunctionalResourceModelPackage.eINSTANCE.getTypedElement_TypeDefinition().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.Parameter.Properties.typeDefinition)){
				if (msg.getNewValue() != null) {
					basePart.setTypeDefinition(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setTypeDefinition("");
				}
			}
			if (FunctionalResourceModelPackage.eINSTANCE.getTypedElement_EngineeringUnit().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.Parameter.Properties.engineeringUnit)) {
				if (msg.getNewValue() != null) {
					basePart.setEngineeringUnit(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setEngineeringUnit("");
				}
			}
			if (FunctionalResourceModelPackage.eINSTANCE.getParameter_Configured().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.Parameter.Properties.configured))
				basePart.setConfigured((Boolean)msg.getNewValue());
			
			if (FunctionalResourceModelPackage.eINSTANCE.getParameter_GuardCondition().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.Parameter.Properties.guardCondition)){
				if (msg.getNewValue() != null) {
					basePart.setGuardCondition(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setGuardCondition("");
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
			FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_SemanticDefinition(),
			FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Classifier(),
			FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_StringIdentifier(),
			FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Version(),
			FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_CreationDate(),
			FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_AuthorizingEntity(),
			FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_OidBit(),
			FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Deprecated(),
			FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Annotation(),
			FunctionalResourceModelPackage.eINSTANCE.getTypedElement_TypeDefinition(),
			FunctionalResourceModelPackage.eINSTANCE.getTypedElement_EngineeringUnit(),
			FunctionalResourceModelPackage.eINSTANCE.getParameter_Configured(),
			FunctionalResourceModelPackage.eINSTANCE.getParameter_GuardCondition()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == FunctionalResourceModelViewsRepository.Parameter.Properties.semanticDefinition || key == FunctionalResourceModelViewsRepository.Parameter.Properties.classifier || key == FunctionalResourceModelViewsRepository.Parameter.Properties.version || key == FunctionalResourceModelViewsRepository.Parameter.Properties.authorizingEntity || key == FunctionalResourceModelViewsRepository.Parameter.Properties.oidBit || key == FunctionalResourceModelViewsRepository.Parameter.Properties.deprecated || key == FunctionalResourceModelViewsRepository.Parameter.Properties.typeDefinition;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getHelpContent(java.lang.Object, int)
	 * 
	 */
	public String getHelpContent(Object key, int kind) {
		if (key == FunctionalResourceModelViewsRepository.Parameter.Properties.guardCondition)
			return ""; //$NON-NLS-1$
		return super.getHelpContent(key, kind);
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
				if (FunctionalResourceModelViewsRepository.Parameter.Properties.semanticDefinition == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_SemanticDefinition().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_SemanticDefinition().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.Parameter.Properties.classifier == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Classifier().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Classifier().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.Parameter.Properties.stringIdentifier == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_StringIdentifier().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_StringIdentifier().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.Parameter.Properties.version == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Version().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Version().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.Parameter.Properties.creationDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_CreationDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_CreationDate().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.Parameter.Properties.authorizingEntity == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_AuthorizingEntity().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_AuthorizingEntity().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.Parameter.Properties.oidBit == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_OidBit().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_OidBit().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.Parameter.Properties.deprecated == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Deprecated().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Deprecated().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.Parameter.Properties.typeDefinition == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getTypedElement_TypeDefinition().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getTypedElement_TypeDefinition().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.Parameter.Properties.engineeringUnit == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getTypedElement_EngineeringUnit().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getTypedElement_EngineeringUnit().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.Parameter.Properties.configured == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getParameter_Configured().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getParameter_Configured().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.Parameter.Properties.guardCondition == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getParameter_GuardCondition().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getParameter_GuardCondition().getEAttributeType(), newValue);
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
