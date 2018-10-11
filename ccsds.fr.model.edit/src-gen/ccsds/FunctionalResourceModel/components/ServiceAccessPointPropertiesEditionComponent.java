/**
 * Generated with Acceleo
 */
package ccsds.FunctionalResourceModel.components;

// Start of user code for imports
import ccsds.FunctionalResourceModel.FunctionalResource;
import ccsds.FunctionalResourceModel.FunctionalResourceModelFactory;
import ccsds.FunctionalResourceModel.FunctionalResourceModelPackage;
import ccsds.FunctionalResourceModel.ServiceAccessPoint;

import ccsds.FunctionalResourceModel.parts.FunctionalResourceModelViewsRepository;
import ccsds.FunctionalResourceModel.parts.ServiceAccessPointPropertiesEditionPart;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
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
public class ServiceAccessPointPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for accessedFunctionalResource EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings accessedFunctionalResourceSettings;
	
	/**
	 * Settings for accessingFunctionalResource EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings accessingFunctionalResourceSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ServiceAccessPointPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject serviceAccessPoint, String editing_mode) {
		super(editingContext, serviceAccessPoint, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = FunctionalResourceModelViewsRepository.class;
		partKey = FunctionalResourceModelViewsRepository.ServiceAccessPoint.class;
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
			
			final ServiceAccessPoint serviceAccessPoint = (ServiceAccessPoint)elt;
			final ServiceAccessPointPropertiesEditionPart basePart = (ServiceAccessPointPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, serviceAccessPoint.getName()));
			
			if (isAccessible(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.minAccessor)) {
				basePart.setMinAccessor(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, serviceAccessPoint.getMinAccessor()));
			}
			
			if (isAccessible(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.maxAccessor)) {
				basePart.setMaxAccessor(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, serviceAccessPoint.getMaxAccessor()));
			}
			
			if (isAccessible(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.minAccessed)) {
				basePart.setMinAccessed(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, serviceAccessPoint.getMinAccessed()));
			}
			
			if (isAccessible(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.maxAccessed)) {
				basePart.setMaxAccessed(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, serviceAccessPoint.getMaxAccessed()));
			}
			
			if (isAccessible(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.accessedFunctionalResource)) {
				// init part
				accessedFunctionalResourceSettings = new EObjectFlatComboSettings(serviceAccessPoint, FunctionalResourceModelPackage.eINSTANCE.getServiceAccessPoint_AccessedFunctionalResource());
				basePart.initAccessedFunctionalResource(accessedFunctionalResourceSettings);
				// set the button mode
				basePart.setAccessedFunctionalResourceButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.accessingFunctionalResource)) {
				// init part
				accessingFunctionalResourceSettings = new EObjectFlatComboSettings(serviceAccessPoint, FunctionalResourceModelPackage.eINSTANCE.getServiceAccessPoint_AccessingFunctionalResource());
				basePart.initAccessingFunctionalResource(accessingFunctionalResourceSettings);
				// set the button mode
				basePart.setAccessingFunctionalResourceButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			
			
			
			
			if (isAccessible(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.accessedFunctionalResource)) {
				basePart.addFilterToAccessedFunctionalResource(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof FunctionalResource);
					}
					
				});
				// Start of user code for additional businessfilters for accessedFunctionalResource
				// End of user code
			}
			if (isAccessible(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.accessingFunctionalResource)) {
				basePart.addFilterToAccessingFunctionalResource(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof FunctionalResource);
					}
					
				});
				// Start of user code for additional businessfilters for accessingFunctionalResource
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
		if (editorKey == FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.name) {
			return FunctionalResourceModelPackage.eINSTANCE.getServiceAccessPoint_Name();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.minAccessor) {
			return FunctionalResourceModelPackage.eINSTANCE.getServiceAccessPoint_MinAccessor();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.maxAccessor) {
			return FunctionalResourceModelPackage.eINSTANCE.getServiceAccessPoint_MaxAccessor();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.minAccessed) {
			return FunctionalResourceModelPackage.eINSTANCE.getServiceAccessPoint_MinAccessed();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.maxAccessed) {
			return FunctionalResourceModelPackage.eINSTANCE.getServiceAccessPoint_MaxAccessed();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.accessedFunctionalResource) {
			return FunctionalResourceModelPackage.eINSTANCE.getServiceAccessPoint_AccessedFunctionalResource();
		}
		if (editorKey == FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.accessingFunctionalResource) {
			return FunctionalResourceModelPackage.eINSTANCE.getServiceAccessPoint_AccessingFunctionalResource();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ServiceAccessPoint serviceAccessPoint = (ServiceAccessPoint)semanticObject;
		if (FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.name == event.getAffectedEditor()) {
			serviceAccessPoint.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.minAccessor == event.getAffectedEditor()) {
			serviceAccessPoint.setMinAccessor((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.maxAccessor == event.getAffectedEditor()) {
			serviceAccessPoint.setMaxAccessor((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.minAccessed == event.getAffectedEditor()) {
			serviceAccessPoint.setMinAccessed((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.maxAccessed == event.getAffectedEditor()) {
			serviceAccessPoint.setMaxAccessed((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.accessedFunctionalResource == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				accessedFunctionalResourceSettings.setToReference((FunctionalResource)event.getNewValue());
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
				accessedFunctionalResourceSettings.setToReference(eObject);
			}
		}
		if (FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.accessingFunctionalResource == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				accessingFunctionalResourceSettings.setToReference((FunctionalResource)event.getNewValue());
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
				accessingFunctionalResourceSettings.setToReference(eObject);
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
			ServiceAccessPointPropertiesEditionPart basePart = (ServiceAccessPointPropertiesEditionPart)editingPart;
			if (FunctionalResourceModelPackage.eINSTANCE.getServiceAccessPoint_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (FunctionalResourceModelPackage.eINSTANCE.getServiceAccessPoint_MinAccessor().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.minAccessor)) {
				if (msg.getNewValue() != null) {
					basePart.setMinAccessor(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setMinAccessor("");
				}
			}
			if (FunctionalResourceModelPackage.eINSTANCE.getServiceAccessPoint_MaxAccessor().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.maxAccessor)) {
				if (msg.getNewValue() != null) {
					basePart.setMaxAccessor(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setMaxAccessor("");
				}
			}
			if (FunctionalResourceModelPackage.eINSTANCE.getServiceAccessPoint_MinAccessed().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.minAccessed)) {
				if (msg.getNewValue() != null) {
					basePart.setMinAccessed(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setMinAccessed("");
				}
			}
			if (FunctionalResourceModelPackage.eINSTANCE.getServiceAccessPoint_MaxAccessed().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.maxAccessed)) {
				if (msg.getNewValue() != null) {
					basePart.setMaxAccessed(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setMaxAccessed("");
				}
			}
			if (FunctionalResourceModelPackage.eINSTANCE.getServiceAccessPoint_AccessedFunctionalResource().equals(msg.getFeature()) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.accessedFunctionalResource))
				basePart.setAccessedFunctionalResource((EObject)msg.getNewValue());
			if (FunctionalResourceModelPackage.eINSTANCE.getServiceAccessPoint_AccessingFunctionalResource().equals(msg.getFeature()) && basePart != null && isAccessible(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.accessingFunctionalResource))
				basePart.setAccessingFunctionalResource((EObject)msg.getNewValue());
			
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
			FunctionalResourceModelPackage.eINSTANCE.getServiceAccessPoint_Name(),
			FunctionalResourceModelPackage.eINSTANCE.getServiceAccessPoint_MinAccessor(),
			FunctionalResourceModelPackage.eINSTANCE.getServiceAccessPoint_MaxAccessor(),
			FunctionalResourceModelPackage.eINSTANCE.getServiceAccessPoint_MinAccessed(),
			FunctionalResourceModelPackage.eINSTANCE.getServiceAccessPoint_MaxAccessed(),
			FunctionalResourceModelPackage.eINSTANCE.getServiceAccessPoint_AccessedFunctionalResource(),
			FunctionalResourceModelPackage.eINSTANCE.getServiceAccessPoint_AccessingFunctionalResource()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.minAccessor || key == FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.maxAccessor || key == FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.minAccessed || key == FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.maxAccessed || key == FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.accessedFunctionalResource || key == FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.accessingFunctionalResource;
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
				if (FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getServiceAccessPoint_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getServiceAccessPoint_Name().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.minAccessor == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getServiceAccessPoint_MinAccessor().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getServiceAccessPoint_MinAccessor().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.maxAccessor == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getServiceAccessPoint_MaxAccessor().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getServiceAccessPoint_MaxAccessor().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.minAccessed == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getServiceAccessPoint_MinAccessed().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getServiceAccessPoint_MinAccessed().getEAttributeType(), newValue);
				}
				if (FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.maxAccessed == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FunctionalResourceModelPackage.eINSTANCE.getServiceAccessPoint_MaxAccessed().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FunctionalResourceModelPackage.eINSTANCE.getServiceAccessPoint_MaxAccessed().getEAttributeType(), newValue);
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
