/**
 * Generated with Acceleo
 */
package ccsds.FunctionalResourceModel.components;

import ccsds.FunctionalResourceModel.Annotation;
// Start of user code for imports
import ccsds.FunctionalResourceModel.FunctionalResourceModelPackage;
import ccsds.FunctionalResourceModel.Qualifier;

import ccsds.FunctionalResourceModel.parts.FunctionalResourceModelViewsRepository;
import ccsds.FunctionalResourceModel.parts.QualifierPropertiesEditionPart;

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
public class QualifierPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for annotation ReferencesTable
	 */
	protected ReferencesTableSettings annotationSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public QualifierPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject qualifier, String editing_mode) {
		super(editingContext, qualifier, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = FunctionalResourceModelViewsRepository.class;
		partKey = FunctionalResourceModelViewsRepository.Qualifier.class;
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
			
			final Qualifier qualifier = (Qualifier)elt;
			final QualifierPropertiesEditionPart basePart = (QualifierPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(FunctionalResourceModelViewsRepository.Qualifier.Properties.semanticDefinition))
				basePart.setSemanticDefinition(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, qualifier.getSemanticDefinition()));
			if (isAccessible(FunctionalResourceModelViewsRepository.Qualifier.Properties.classifier))
				basePart.setClassifier(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, qualifier.getClassifier()));
			
			if (isAccessible(FunctionalResourceModelViewsRepository.Qualifier.Properties.stringIdentifier))
				basePart.setStringIdentifier(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, qualifier.getStringIdentifier()));
			
			if (isAccessible(FunctionalResourceModelViewsRepository.Qualifier.Properties.version)) {
				basePart.setVersion(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, qualifier.getVersion()));
			}
			
			if (isAccessible(FunctionalResourceModelViewsRepository.Qualifier.Properties.creationDate))
				basePart.setCreationDate(EEFConverterUtil.convertToString(EcorePackage.Literals.EDATE, qualifier.getCreationDate()));
			
			if (isAccessible(FunctionalResourceModelViewsRepository.Qualifier.Properties.authorizingEntity))
				basePart.setAuthorizingEntity(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, qualifier.getAuthorizingEntity()));
			
			if (isAccessible(FunctionalResourceModelViewsRepository.Qualifier.Properties.oidBit)) {
				basePart.setOidBit(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, qualifier.getOidBit()));
			}
			
			if (isAccessible(FunctionalResourceModelViewsRepository.Qualifier.Properties.deprecated)) {
				basePart.setDeprecated(qualifier.isDeprecated());
			}
			if (isAccessible(FunctionalResourceModelViewsRepository.Qualifier.Properties.annotation)) {
				annotationSettings = new ReferencesTableSettings(qualifier, FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Annotation());
				basePart.initAnnotation(annotationSettings);
			}
			if (isAccessible(FunctionalResourceModelViewsRepository.Qualifier.Properties.typeDefinition))
				basePart.setTypeDefinition(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, qualifier.getTypeDefinition()));
			if (isAccessible(FunctionalResourceModelViewsRepository.Qualifier.Properties.engineeringUnit))
				basePart.setEngineeringUnit(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, qualifier.getEngineeringUnit()));
			
			// init filters
			
			
			
			
			
			
			
			
			if (isAccessible(FunctionalResourceModelViewsRepository.Qualifier.Properties.annotation)) {
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
		if (editorKey == FunctionalResourceModelViewsRepository.Qualifier.Properties.semanticDefinition) {
			return FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_SemanticDefinition();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.Qualifier.Properties.classifier) {
			return FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Classifier();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.Qualifier.Properties.stringIdentifier) {
			return FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_StringIdentifier();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.Qualifier.Properties.version) {
			return FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Version();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.Qualifier.Properties.creationDate) {
			return FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_CreationDate();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.Qualifier.Properties.authorizingEntity) {
			return FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_AuthorizingEntity();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.Qualifier.Properties.oidBit) {
			return FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_OidBit();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.Qualifier.Properties.deprecated) {
			return FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Deprecated();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.Qualifier.Properties.annotation) {
			return FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Annotation();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.Qualifier.Properties.typeDefinition) {
			return FunctionalResourceModelPackage.eINSTANCE.getTypedElement_TypeDefinition();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.Qualifier.Properties.engineeringUnit) {
			return FunctionalResourceModelPackage.eINSTANCE.getTypedElement_EngineeringUnit();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Qualifier qualifier = (Qualifier)semanticObject;
		if (FunctionalResourceModelViewsRepository.Qualifier.Properties.semanticDefinition == event.getAffectedEditor()) {
			qualifier.setSemanticDefinition((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (FunctionalResourceModelViewsRepository.Qualifier.Properties.classifier == event.getAffectedEditor()) {
			qualifier.setClassifier((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (FunctionalResourceModelViewsRepository.Qualifier.Properties.stringIdentifier == event.getAffectedEditor()) {
			qualifier.setStringIdentifier((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (FunctionalResourceModelViewsRepository.Qualifier.Properties.version == event.getAffectedEditor()) {
			qualifier.setVersion((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (FunctionalResourceModelViewsRepository.Qualifier.Properties.creationDate == event.getAffectedEditor()) {
			qualifier.setCreationDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.Literals.EDATE, (String)event.getNewValue()));
		}
		if (FunctionalResourceModelViewsRepository.Qualifier.Properties.authorizingEntity == event.getAffectedEditor()) {
			qualifier.setAuthorizingEntity((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (FunctionalResourceModelViewsRepository.Qualifier.Properties.oidBit == event.getAffectedEditor()) {
			qualifier.setOidBit((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (FunctionalResourceModelViewsRepository.Qualifier.Properties.deprecated == event.getAffectedEditor()) {
			qualifier.setDeprecated((Boolean)event.getNewValue());
		}
		if (FunctionalResourceModelViewsRepository.Qualifier.Properties.annotation == event.getAffectedEditor()) {
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
		if (FunctionalResourceModelViewsRepository.Qualifier.Properties.typeDefinition == event.getAffectedEditor()) {
			qualifier.setTypeDefinition((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (FunctionalResourceModelViewsRepository.Qualifier.Properties.engineeringUnit == event.getAffectedEditor()) {
			qualifier.setEngineeringUnit((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			QualifierPropertiesEditionPart basePart = (QualifierPropertiesEditionPart)editingPart;
			if (FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_SemanticDefinition().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.Qualifier.Properties.semanticDefinition)){
				if (msg.getNewValue() != null) {
					basePart.setSemanticDefinition(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setSemanticDefinition("");
				}
			}
			if (FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Classifier().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.Qualifier.Properties.classifier)) {
				if (msg.getNewValue() != null) {
					basePart.setClassifier(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setClassifier("");
				}
			}
			if (FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_StringIdentifier().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.Qualifier.Properties.stringIdentifier)) {
				if (msg.getNewValue() != null) {
					basePart.setStringIdentifier(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setStringIdentifier("");
				}
			}
			if (FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Version().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.Qualifier.Properties.version)) {
				if (msg.getNewValue() != null) {
					basePart.setVersion(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setVersion("");
				}
			}
			if (FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_CreationDate().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.Qualifier.Properties.creationDate)) {
				if (msg.getNewValue() != null) {
					basePart.setCreationDate(EcoreUtil.convertToString(EcorePackage.Literals.EDATE, msg.getNewValue()));
				} else {
					basePart.setCreationDate("");
				}
			}
			if (FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_AuthorizingEntity().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.Qualifier.Properties.authorizingEntity)) {
				if (msg.getNewValue() != null) {
					basePart.setAuthorizingEntity(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setAuthorizingEntity("");
				}
			}
			if (FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_OidBit().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.Qualifier.Properties.oidBit)) {
				if (msg.getNewValue() != null) {
					basePart.setOidBit(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setOidBit("");
				}
			}
			if (FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Deprecated().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.Qualifier.Properties.deprecated))
				basePart.setDeprecated((Boolean)msg.getNewValue());
			
			if (FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Annotation().equals(msg.getFeature()) && isAccessible(FunctionalResourceModelViewsRepository.Qualifier.Properties.annotation))
				basePart.updateAnnotation();
			if (FunctionalResourceModelPackage.eINSTANCE.getTypedElement_TypeDefinition().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.Qualifier.Properties.typeDefinition)){
				if (msg.getNewValue() != null) {
					basePart.setTypeDefinition(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setTypeDefinition("");
				}
			}
			if (FunctionalResourceModelPackage.eINSTANCE.getTypedElement_EngineeringUnit().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.Qualifier.Properties.engineeringUnit)) {
				if (msg.getNewValue() != null) {
					basePart.setEngineeringUnit(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setEngineeringUnit("");
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
			FunctionalResourceModelPackage.eINSTANCE.getTypedElement_EngineeringUnit()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == FunctionalResourceModelViewsRepository.Qualifier.Properties.semanticDefinition || key == FunctionalResourceModelViewsRepository.Qualifier.Properties.classifier || key == FunctionalResourceModelViewsRepository.Qualifier.Properties.version || key == FunctionalResourceModelViewsRepository.Qualifier.Properties.authorizingEntity || key == FunctionalResourceModelViewsRepository.Qualifier.Properties.oidBit || key == FunctionalResourceModelViewsRepository.Qualifier.Properties.deprecated || key == FunctionalResourceModelViewsRepository.Qualifier.Properties.typeDefinition;
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
				if (FunctionalResourceModelViewsRepository.Qualifier.Properties.semanticDefinition == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_SemanticDefinition().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_SemanticDefinition().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.Qualifier.Properties.classifier == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Classifier().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Classifier().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.Qualifier.Properties.stringIdentifier == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_StringIdentifier().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_StringIdentifier().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.Qualifier.Properties.version == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Version().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Version().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.Qualifier.Properties.creationDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_CreationDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_CreationDate().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.Qualifier.Properties.authorizingEntity == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_AuthorizingEntity().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_AuthorizingEntity().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.Qualifier.Properties.oidBit == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_OidBit().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_OidBit().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.Qualifier.Properties.deprecated == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Deprecated().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Deprecated().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.Qualifier.Properties.typeDefinition == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getTypedElement_TypeDefinition().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getTypedElement_TypeDefinition().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.Qualifier.Properties.engineeringUnit == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getTypedElement_EngineeringUnit().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getTypedElement_EngineeringUnit().getEAttributeType(), newValue);
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
