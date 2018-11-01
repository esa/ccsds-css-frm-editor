/**
 * Generated with Acceleo
 */
package ccsds.fr.type.model.frtypes.components;

// Start of user code for imports
import ccsds.fr.type.model.frtypes.FromModule;
import ccsds.fr.type.model.frtypes.FrtypesPackage;
import ccsds.fr.type.model.frtypes.Module;
import ccsds.fr.type.model.frtypes.TypeDefinition;

import ccsds.fr.type.model.frtypes.parts.FrtypesViewsRepository;
import ccsds.fr.type.model.frtypes.parts.ModulePropertiesEditionPart;

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
public class ModulePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for typeDefinition ReferencesTable
	 */
	protected ReferencesTableSettings typeDefinitionSettings;
	
	/**
	 * Settings for imports ReferencesTable
	 */
	protected ReferencesTableSettings importsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ModulePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject module, String editing_mode) {
		super(editingContext, module, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = FrtypesViewsRepository.class;
		partKey = FrtypesViewsRepository.Module.class;
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
			
			final Module module = (Module)elt;
			final ModulePropertiesEditionPart basePart = (ModulePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(FrtypesViewsRepository.Module.Properties.typeDefinition)) {
				typeDefinitionSettings = new ReferencesTableSettings(module, FrtypesPackage.eINSTANCE.getModule_TypeDefinition());
				basePart.initTypeDefinition(typeDefinitionSettings);
			}
			if (isAccessible(FrtypesViewsRepository.Module.Properties.oid))
				basePart.setOid(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, module.getOid()));
			
			if (isAccessible(FrtypesViewsRepository.Module.Properties.exports))
				basePart.setExports(module.getExports());
			
			if (isAccessible(FrtypesViewsRepository.Module.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, module.getName()));
			
			if (isAccessible(FrtypesViewsRepository.Module.Properties.imports)) {
				importsSettings = new ReferencesTableSettings(module, FrtypesPackage.eINSTANCE.getModule_Imports());
				basePart.initImports(importsSettings);
			}
			// init filters
			if (isAccessible(FrtypesViewsRepository.Module.Properties.typeDefinition)) {
				basePart.addFilterToTypeDefinition(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof TypeDefinition); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for typeDefinition
				// End of user code
			}
			
			
			
			if (isAccessible(FrtypesViewsRepository.Module.Properties.imports)) {
				basePart.addFilterToImports(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof FromModule); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for imports
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
		if (editorKey == FrtypesViewsRepository.Module.Properties.typeDefinition) {
			return FrtypesPackage.eINSTANCE.getModule_TypeDefinition();
		}
		if (editorKey == FrtypesViewsRepository.Module.Properties.oid) {
			return FrtypesPackage.eINSTANCE.getModule_Oid();
		}
		if (editorKey == FrtypesViewsRepository.Module.Properties.exports) {
			return FrtypesPackage.eINSTANCE.getModule_Exports();
		}
		if (editorKey == FrtypesViewsRepository.Module.Properties.name) {
			return FrtypesPackage.eINSTANCE.getModule_Name();
		}
		if (editorKey == FrtypesViewsRepository.Module.Properties.imports) {
			return FrtypesPackage.eINSTANCE.getModule_Imports();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Module module = (Module)semanticObject;
		if (FrtypesViewsRepository.Module.Properties.typeDefinition == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, typeDefinitionSettings, editingContext.getAdapterFactory());
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
				typeDefinitionSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				typeDefinitionSettings.move(event.getNewIndex(), (TypeDefinition) event.getNewValue());
			}
		}
		if (FrtypesViewsRepository.Module.Properties.oid == event.getAffectedEditor()) {
			module.setOid((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (FrtypesViewsRepository.Module.Properties.exports == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				module.getExports().clear();
				module.getExports().addAll(((EList) event.getNewValue()));
			}
		}
		if (FrtypesViewsRepository.Module.Properties.name == event.getAffectedEditor()) {
			module.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (FrtypesViewsRepository.Module.Properties.imports == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, importsSettings, editingContext.getAdapterFactory());
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
				importsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				importsSettings.move(event.getNewIndex(), (FromModule) event.getNewValue());
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
			ModulePropertiesEditionPart basePart = (ModulePropertiesEditionPart)editingPart;
			if (FrtypesPackage.eINSTANCE.getModule_TypeDefinition().equals(msg.getFeature()) && isAccessible(FrtypesViewsRepository.Module.Properties.typeDefinition))
				basePart.updateTypeDefinition();
			if (FrtypesPackage.eINSTANCE.getModule_Oid().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FrtypesViewsRepository.Module.Properties.oid)) {
				if (msg.getNewValue() != null) {
					basePart.setOid(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setOid("");
				}
			}
			if (FrtypesPackage.eINSTANCE.getModule_Exports().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FrtypesViewsRepository.Module.Properties.exports)) {
				if (msg.getNewValue() instanceof EList<?>) {
					basePart.setExports((EList<?>)msg.getNewValue());
				} else if (msg.getNewValue() == null) {
					basePart.setExports(new BasicEList<Object>());
				} else {
					BasicEList<Object> newValueAsList = new BasicEList<Object>();
					newValueAsList.add(msg.getNewValue());
					basePart.setExports(newValueAsList);
				}
			}
			
			if (FrtypesPackage.eINSTANCE.getModule_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FrtypesViewsRepository.Module.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (FrtypesPackage.eINSTANCE.getModule_Imports().equals(msg.getFeature()) && isAccessible(FrtypesViewsRepository.Module.Properties.imports))
				basePart.updateImports();
			
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
			FrtypesPackage.eINSTANCE.getModule_TypeDefinition(),
			FrtypesPackage.eINSTANCE.getModule_Oid(),
			FrtypesPackage.eINSTANCE.getModule_Exports(),
			FrtypesPackage.eINSTANCE.getModule_Name(),
			FrtypesPackage.eINSTANCE.getModule_Imports()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == FrtypesViewsRepository.Module.Properties.name;
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
				if (FrtypesViewsRepository.Module.Properties.oid == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FrtypesPackage.eINSTANCE.getModule_Oid().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FrtypesPackage.eINSTANCE.getModule_Oid().getEAttributeType(), newValue);
				}
				if (FrtypesViewsRepository.Module.Properties.exports == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(FrtypesPackage.eINSTANCE.getModule_Exports().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (FrtypesViewsRepository.Module.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FrtypesPackage.eINSTANCE.getModule_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FrtypesPackage.eINSTANCE.getModule_Name().getEAttributeType(), newValue);
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
