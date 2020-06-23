/**
 * Generated with Acceleo
 */
package ccsds.FunctionalResourceModel.components;

// Start of user code for imports
import ccsds.FunctionalResourceModel.FunctionalResource;
import ccsds.FunctionalResourceModel.FunctionalResourceModel;
import ccsds.FunctionalResourceModel.FunctionalResourceModelPackage;
import ccsds.FunctionalResourceModel.FunctionalResourceSet;
import ccsds.FunctionalResourceModel.FunctionalResourceStratum;
import ccsds.FunctionalResourceModel.parts.FunctionalResourceModelPropertiesEditionPart;
import ccsds.FunctionalResourceModel.parts.FunctionalResourceModelViewsRepository;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

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
public class FunctionalResourceModelPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for functionalResourceSet ReferencesTable
	 */
	protected ReferencesTableSettings functionalResourceSetSettings;
	
	/**
	 * Settings for functionalResource ReferencesTable
	 */
	protected ReferencesTableSettings functionalResourceSettings;
	
	/**
	 * Settings for functionalResouceStratum ReferencesTable
	 */
	protected ReferencesTableSettings functionalResouceStratumSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public FunctionalResourceModelPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject functionalResourceModel, String editing_mode) {
		super(editingContext, functionalResourceModel, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = FunctionalResourceModelViewsRepository.class;
		partKey = FunctionalResourceModelViewsRepository.FunctionalResourceModel_.class;
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
			
			final FunctionalResourceModel functionalResourceModel = (FunctionalResourceModel)elt;
			final FunctionalResourceModelPropertiesEditionPart basePart = (FunctionalResourceModelPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResourceSet)) {
				functionalResourceSetSettings = new ReferencesTableSettings(functionalResourceModel, FunctionalResourceModelPackage.eINSTANCE.getFunctionalResourceModel_FunctionalResourceSet());
				basePart.initFunctionalResourceSet(functionalResourceSetSettings);
			}
			if (isAccessible(FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResource)) {
				functionalResourceSettings = new ReferencesTableSettings(functionalResourceModel, FunctionalResourceModelPackage.eINSTANCE.getFunctionalResourceModel_FunctionalResource());
				basePart.initFunctionalResource(functionalResourceSettings);
			}
			if (isAccessible(FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResouceStratum)) {
				functionalResouceStratumSettings = new ReferencesTableSettings(functionalResourceModel, FunctionalResourceModelPackage.eINSTANCE.getFunctionalResourceModel_FunctionalResouceStratum());
				basePart.initFunctionalResouceStratum(functionalResouceStratumSettings);
			}
			// init filters
			if (isAccessible(FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResourceSet)) {
				basePart.addFilterToFunctionalResourceSet(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof FunctionalResourceSet); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for functionalResourceSet
				// End of user code
			}
			if (isAccessible(FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResource)) {
				basePart.addFilterToFunctionalResource(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof FunctionalResource); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for functionalResource
				// End of user code
			}
			if (isAccessible(FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResouceStratum)) {
				basePart.addFilterToFunctionalResouceStratum(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof FunctionalResourceStratum); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for functionalResouceStratum
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
		if (editorKey == FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResourceSet) {
			return FunctionalResourceModelPackage.eINSTANCE.getFunctionalResourceModel_FunctionalResourceSet();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResource) {
			return FunctionalResourceModelPackage.eINSTANCE.getFunctionalResourceModel_FunctionalResource();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResouceStratum) {
			return FunctionalResourceModelPackage.eINSTANCE.getFunctionalResourceModel_FunctionalResouceStratum();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		FunctionalResourceModel functionalResourceModel = (FunctionalResourceModel)semanticObject;
		if (FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResourceSet == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, functionalResourceSetSettings, editingContext.getAdapterFactory());
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
				functionalResourceSetSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				functionalResourceSetSettings.move(event.getNewIndex(), (FunctionalResourceSet) event.getNewValue());
			}
		}
		if (FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResource == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, functionalResourceSettings, editingContext.getAdapterFactory());
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
				functionalResourceSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				functionalResourceSettings.move(event.getNewIndex(), (FunctionalResource) event.getNewValue());
			}
		}
		if (FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResouceStratum == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, functionalResouceStratumSettings, editingContext.getAdapterFactory());
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
				functionalResouceStratumSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				functionalResouceStratumSettings.move(event.getNewIndex(), (FunctionalResourceStratum) event.getNewValue());
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
			FunctionalResourceModelPropertiesEditionPart basePart = (FunctionalResourceModelPropertiesEditionPart)editingPart;
			if (FunctionalResourceModelPackage.eINSTANCE.getFunctionalResourceModel_FunctionalResourceSet().equals(msg.getFeature()) && isAccessible(FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResourceSet))
				basePart.updateFunctionalResourceSet();
			if (FunctionalResourceModelPackage.eINSTANCE.getFunctionalResourceModel_FunctionalResource().equals(msg.getFeature()) && isAccessible(FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResource))
				basePart.updateFunctionalResource();
			if (FunctionalResourceModelPackage.eINSTANCE.getFunctionalResourceModel_FunctionalResouceStratum().equals(msg.getFeature()) && isAccessible(FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResouceStratum))
				basePart.updateFunctionalResouceStratum();
			
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
			FunctionalResourceModelPackage.eINSTANCE.getFunctionalResourceModel_FunctionalResourceSet(),
			FunctionalResourceModelPackage.eINSTANCE.getFunctionalResourceModel_FunctionalResource(),
			FunctionalResourceModelPackage.eINSTANCE.getFunctionalResourceModel_FunctionalResouceStratum()		);
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
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}


	

	

}
