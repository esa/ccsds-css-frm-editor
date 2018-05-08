/**
 * Generated with Acceleo
 */
package ccsds.FunctionalResourceModel.components;

import ccsds.FunctionalResourceModel.AncillaryInterface;
// Start of user code for imports
import ccsds.FunctionalResourceModel.Directive;
import ccsds.FunctionalResourceModel.Event;
import ccsds.FunctionalResourceModel.FunctionalResource;
import ccsds.FunctionalResourceModel.FunctionalResourceModelPackage;
import ccsds.FunctionalResourceModel.Parameter;
import ccsds.FunctionalResourceModel.ServiceAccessPoint;
import ccsds.FunctionalResourceModel.parts.FunctionalResourceModelViewsRepository;
import ccsds.FunctionalResourceModel.parts.FunctionalResourcePropertiesEditionPart;

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

import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;

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
public class FunctionalResourcePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for event ReferencesTable
	 */
	protected ReferencesTableSettings eventSettings;
	
	/**
	 * Settings for directives ReferencesTable
	 */
	protected ReferencesTableSettings directivesSettings;
	
	/**
	 * Settings for uses ReferencesTable
	 */
	private ReferencesTableSettings usesSettings;
	
	/**
	 * Settings for parameter ReferencesTable
	 */
	protected ReferencesTableSettings parameterSettings;
	
	/**
	 * Settings for serviceAccesspoint ReferencesTable
	 */
	protected ReferencesTableSettings serviceAccesspointSettings;
	
	/**
	 * Settings for providedAncillaryInterface ReferencesTable
	 */
	protected ReferencesTableSettings providedAncillaryInterfaceSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public FunctionalResourcePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject functionalResource, String editing_mode) {
		super(editingContext, functionalResource, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = FunctionalResourceModelViewsRepository.class;
		partKey = FunctionalResourceModelViewsRepository.FunctionalResource.class;
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
			
			final FunctionalResource functionalResource = (FunctionalResource)elt;
			final FunctionalResourcePropertiesEditionPart basePart = (FunctionalResourcePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.semanticDefinition))
				basePart.setSemanticDefinition(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, functionalResource.getSemanticDefinition()));
			if (isAccessible(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.classifier))
				basePart.setClassifier(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, functionalResource.getClassifier()));
			
			if (isAccessible(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.stringIdentifier))
				basePart.setStringIdentifier(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, functionalResource.getStringIdentifier()));
			
			if (isAccessible(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.version)) {
				basePart.setVersion(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, functionalResource.getVersion()));
			}
			
			if (isAccessible(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.creationDate))
				basePart.setCreationDate(EEFConverterUtil.convertToString(EcorePackage.Literals.EDATE, functionalResource.getCreationDate()));
			
			if (isAccessible(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.authorizingEntity))
				basePart.setAuthorizingEntity(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, functionalResource.getAuthorizingEntity()));
			
			if (isAccessible(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.oidBit)) {
				basePart.setOidBit(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, functionalResource.getOidBit()));
			}
			
			if (isAccessible(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.deprecated)) {
				basePart.setDeprecated(functionalResource.isDeprecated());
			}
			if (isAccessible(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.event)) {
				eventSettings = new ReferencesTableSettings(functionalResource, FunctionalResourceModelPackage.eINSTANCE.getFunctionalResource_Event());
				basePart.initEvent(eventSettings);
			}
			if (isAccessible(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.directives)) {
				directivesSettings = new ReferencesTableSettings(functionalResource, FunctionalResourceModelPackage.eINSTANCE.getFunctionalResource_Directives());
				basePart.initDirectives(directivesSettings);
			}
			if (isAccessible(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.uses)) {
				usesSettings = new ReferencesTableSettings(functionalResource, FunctionalResourceModelPackage.eINSTANCE.getFunctionalResource_Uses());
				basePart.initUses(usesSettings);
			}
			if (isAccessible(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.parameter)) {
				parameterSettings = new ReferencesTableSettings(functionalResource, FunctionalResourceModelPackage.eINSTANCE.getFunctionalResource_Parameter());
				basePart.initParameter(parameterSettings);
			}
			if (isAccessible(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.serviceAccesspoint)) {
				serviceAccesspointSettings = new ReferencesTableSettings(functionalResource, FunctionalResourceModelPackage.eINSTANCE.getFunctionalResource_ServiceAccesspoint());
				basePart.initServiceAccesspoint(serviceAccesspointSettings);
			}
			if (isAccessible(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.providedAncillaryInterface)) {
				providedAncillaryInterfaceSettings = new ReferencesTableSettings(functionalResource, FunctionalResourceModelPackage.eINSTANCE.getFunctionalResource_ProvidedAncillaryInterface());
				basePart.initProvidedAncillaryInterface(providedAncillaryInterfaceSettings);
			}
			// init filters
			
			
			
			
			
			
			
			
			if (isAccessible(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.event)) {
				basePart.addFilterToEvent(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Event); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for event
				// End of user code
			}
			if (isAccessible(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.directives)) {
				basePart.addFilterToDirectives(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Directive); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for directives
				// End of user code
			}
			if (isAccessible(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.uses)) {
				basePart.addFilterToUses(new EObjectFilter(FunctionalResourceModelPackage.Literals.FUNCTIONAL_RESOURCE));
				// Start of user code for additional businessfilters for uses
				// End of user code
			}
			if (isAccessible(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.parameter)) {
				basePart.addFilterToParameter(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Parameter); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for parameter
				// End of user code
			}
			if (isAccessible(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.serviceAccesspoint)) {
				basePart.addFilterToServiceAccesspoint(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ServiceAccessPoint); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for serviceAccesspoint
				// End of user code
			}
			if (isAccessible(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.providedAncillaryInterface)) {
				basePart.addFilterToProvidedAncillaryInterface(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof AncillaryInterface); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for providedAncillaryInterface
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
		if (editorKey == FunctionalResourceModelViewsRepository.FunctionalResource.Properties.semanticDefinition) {
			return FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_SemanticDefinition();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.FunctionalResource.Properties.classifier) {
			return FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Classifier();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.FunctionalResource.Properties.stringIdentifier) {
			return FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_StringIdentifier();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.FunctionalResource.Properties.version) {
			return FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Version();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.FunctionalResource.Properties.creationDate) {
			return FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_CreationDate();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.FunctionalResource.Properties.authorizingEntity) {
			return FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_AuthorizingEntity();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.FunctionalResource.Properties.oidBit) {
			return FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_OidBit();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.FunctionalResource.Properties.deprecated) {
			return FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Deprecated();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.FunctionalResource.Properties.event) {
			return FunctionalResourceModelPackage.eINSTANCE.getFunctionalResource_Event();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.FunctionalResource.Properties.directives) {
			return FunctionalResourceModelPackage.eINSTANCE.getFunctionalResource_Directives();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.FunctionalResource.Properties.uses) {
			return FunctionalResourceModelPackage.eINSTANCE.getFunctionalResource_Uses();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.FunctionalResource.Properties.parameter) {
			return FunctionalResourceModelPackage.eINSTANCE.getFunctionalResource_Parameter();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.FunctionalResource.Properties.serviceAccesspoint) {
			return FunctionalResourceModelPackage.eINSTANCE.getFunctionalResource_ServiceAccesspoint();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.FunctionalResource.Properties.providedAncillaryInterface) {
			return FunctionalResourceModelPackage.eINSTANCE.getFunctionalResource_ProvidedAncillaryInterface();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		FunctionalResource functionalResource = (FunctionalResource)semanticObject;
		if (FunctionalResourceModelViewsRepository.FunctionalResource.Properties.semanticDefinition == event.getAffectedEditor()) {
			functionalResource.setSemanticDefinition((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (FunctionalResourceModelViewsRepository.FunctionalResource.Properties.classifier == event.getAffectedEditor()) {
			functionalResource.setClassifier((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (FunctionalResourceModelViewsRepository.FunctionalResource.Properties.stringIdentifier == event.getAffectedEditor()) {
			functionalResource.setStringIdentifier((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (FunctionalResourceModelViewsRepository.FunctionalResource.Properties.version == event.getAffectedEditor()) {
			functionalResource.setVersion((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (FunctionalResourceModelViewsRepository.FunctionalResource.Properties.creationDate == event.getAffectedEditor()) {
			functionalResource.setCreationDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.Literals.EDATE, (String)event.getNewValue()));
		}
		if (FunctionalResourceModelViewsRepository.FunctionalResource.Properties.authorizingEntity == event.getAffectedEditor()) {
			functionalResource.setAuthorizingEntity((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (FunctionalResourceModelViewsRepository.FunctionalResource.Properties.oidBit == event.getAffectedEditor()) {
			functionalResource.setOidBit((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (FunctionalResourceModelViewsRepository.FunctionalResource.Properties.deprecated == event.getAffectedEditor()) {
			functionalResource.setDeprecated((Boolean)event.getNewValue());
		}
		if (FunctionalResourceModelViewsRepository.FunctionalResource.Properties.event == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, eventSettings, editingContext.getAdapterFactory());
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
				eventSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				eventSettings.move(event.getNewIndex(), (Event) event.getNewValue());
			}
		}
		if (FunctionalResourceModelViewsRepository.FunctionalResource.Properties.directives == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, directivesSettings, editingContext.getAdapterFactory());
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
				directivesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				directivesSettings.move(event.getNewIndex(), (Directive) event.getNewValue());
			}
		}
		if (FunctionalResourceModelViewsRepository.FunctionalResource.Properties.uses == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof FunctionalResource) {
					usesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				usesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				usesSettings.move(event.getNewIndex(), (FunctionalResource) event.getNewValue());
			}
		}
		if (FunctionalResourceModelViewsRepository.FunctionalResource.Properties.parameter == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, parameterSettings, editingContext.getAdapterFactory());
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
				parameterSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				parameterSettings.move(event.getNewIndex(), (Parameter) event.getNewValue());
			}
		}
		if (FunctionalResourceModelViewsRepository.FunctionalResource.Properties.serviceAccesspoint == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, serviceAccesspointSettings, editingContext.getAdapterFactory());
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
				serviceAccesspointSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				serviceAccesspointSettings.move(event.getNewIndex(), (ServiceAccessPoint) event.getNewValue());
			}
		}
		if (FunctionalResourceModelViewsRepository.FunctionalResource.Properties.providedAncillaryInterface == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, providedAncillaryInterfaceSettings, editingContext.getAdapterFactory());
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
				providedAncillaryInterfaceSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				providedAncillaryInterfaceSettings.move(event.getNewIndex(), (AncillaryInterface) event.getNewValue());
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
			FunctionalResourcePropertiesEditionPart basePart = (FunctionalResourcePropertiesEditionPart)editingPart;
			if (FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_SemanticDefinition().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.semanticDefinition)){
				if (msg.getNewValue() != null) {
					basePart.setSemanticDefinition(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setSemanticDefinition("");
				}
			}
			if (FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Classifier().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.classifier)) {
				if (msg.getNewValue() != null) {
					basePart.setClassifier(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setClassifier("");
				}
			}
			if (FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_StringIdentifier().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.stringIdentifier)) {
				if (msg.getNewValue() != null) {
					basePart.setStringIdentifier(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setStringIdentifier("");
				}
			}
			if (FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Version().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.version)) {
				if (msg.getNewValue() != null) {
					basePart.setVersion(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setVersion("");
				}
			}
			if (FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_CreationDate().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.creationDate)) {
				if (msg.getNewValue() != null) {
					basePart.setCreationDate(EcoreUtil.convertToString(EcorePackage.Literals.EDATE, msg.getNewValue()));
				} else {
					basePart.setCreationDate("");
				}
			}
			if (FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_AuthorizingEntity().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.authorizingEntity)) {
				if (msg.getNewValue() != null) {
					basePart.setAuthorizingEntity(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setAuthorizingEntity("");
				}
			}
			if (FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_OidBit().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.oidBit)) {
				if (msg.getNewValue() != null) {
					basePart.setOidBit(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setOidBit("");
				}
			}
			if (FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Deprecated().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.deprecated))
				basePart.setDeprecated((Boolean)msg.getNewValue());
			
			if (FunctionalResourceModelPackage.eINSTANCE.getFunctionalResource_Event().equals(msg.getFeature()) && isAccessible(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.event))
				basePart.updateEvent();
			if (FunctionalResourceModelPackage.eINSTANCE.getFunctionalResource_Directives().equals(msg.getFeature()) && isAccessible(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.directives))
				basePart.updateDirectives();
			if (FunctionalResourceModelPackage.eINSTANCE.getFunctionalResource_Uses().equals(msg.getFeature())  && isAccessible(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.uses))
				basePart.updateUses();
			if (FunctionalResourceModelPackage.eINSTANCE.getFunctionalResource_Parameter().equals(msg.getFeature()) && isAccessible(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.parameter))
				basePart.updateParameter();
			if (FunctionalResourceModelPackage.eINSTANCE.getFunctionalResource_ServiceAccesspoint().equals(msg.getFeature()) && isAccessible(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.serviceAccesspoint))
				basePart.updateServiceAccesspoint();
			if (FunctionalResourceModelPackage.eINSTANCE.getFunctionalResource_ProvidedAncillaryInterface().equals(msg.getFeature()) && isAccessible(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.providedAncillaryInterface))
				basePart.updateProvidedAncillaryInterface();
			
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
			FunctionalResourceModelPackage.eINSTANCE.getFunctionalResource_Event(),
			FunctionalResourceModelPackage.eINSTANCE.getFunctionalResource_Directives(),
			FunctionalResourceModelPackage.eINSTANCE.getFunctionalResource_Uses(),
			FunctionalResourceModelPackage.eINSTANCE.getFunctionalResource_Parameter(),
			FunctionalResourceModelPackage.eINSTANCE.getFunctionalResource_ServiceAccesspoint(),
			FunctionalResourceModelPackage.eINSTANCE.getFunctionalResource_ProvidedAncillaryInterface()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == FunctionalResourceModelViewsRepository.FunctionalResource.Properties.semanticDefinition || key == FunctionalResourceModelViewsRepository.FunctionalResource.Properties.classifier || key == FunctionalResourceModelViewsRepository.FunctionalResource.Properties.version || key == FunctionalResourceModelViewsRepository.FunctionalResource.Properties.authorizingEntity || key == FunctionalResourceModelViewsRepository.FunctionalResource.Properties.oidBit || key == FunctionalResourceModelViewsRepository.FunctionalResource.Properties.deprecated;
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
				if (FunctionalResourceModelViewsRepository.FunctionalResource.Properties.semanticDefinition == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_SemanticDefinition().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_SemanticDefinition().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.FunctionalResource.Properties.classifier == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Classifier().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Classifier().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.FunctionalResource.Properties.stringIdentifier == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_StringIdentifier().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_StringIdentifier().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.FunctionalResource.Properties.version == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Version().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_Version().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.FunctionalResource.Properties.creationDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_CreationDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_CreationDate().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.FunctionalResource.Properties.authorizingEntity == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_AuthorizingEntity().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_AuthorizingEntity().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.FunctionalResource.Properties.oidBit == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_OidBit().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getFrModelElement_OidBit().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.FunctionalResource.Properties.deprecated == event.getAffectedEditor()) {
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
