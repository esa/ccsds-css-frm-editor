/**
 * Generated with Acceleo
 */
package ccsds.fr.type.model.frtypes.components;

// Start of user code for imports
import ccsds.fr.type.model.frtypes.FrtypesPackage;
import ccsds.fr.type.model.frtypes.TypeReferenceExternal;

import ccsds.fr.type.model.frtypes.parts.FrtypesViewsRepository;
import ccsds.fr.type.model.frtypes.parts.TypeReferenceExternalPropertiesEditionPart;

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

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;


// End of user code

/**
 * 
 * 
 */
public class TypeReferenceExternalPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public TypeReferenceExternalPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject typeReferenceExternal, String editing_mode) {
		super(editingContext, typeReferenceExternal, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = FrtypesViewsRepository.class;
		partKey = FrtypesViewsRepository.TypeReferenceExternal.class;
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
			
			final TypeReferenceExternal typeReferenceExternal = (TypeReferenceExternal)elt;
			final TypeReferenceExternalPropertiesEditionPart basePart = (TypeReferenceExternalPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(FrtypesViewsRepository.TypeReferenceExternal.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, typeReferenceExternal.getName()));
			
			if (isAccessible(FrtypesViewsRepository.TypeReferenceExternal.Properties.complexType)) {
				basePart.setComplexType(typeReferenceExternal.isComplexType());
			}
			// init filters
			
			
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
		if (editorKey == FrtypesViewsRepository.TypeReferenceExternal.Properties.name) {
			return FrtypesPackage.eINSTANCE.getTypeReferenceExternal_Name();
		}
		if (editorKey == FrtypesViewsRepository.TypeReferenceExternal.Properties.complexType) {
			return FrtypesPackage.eINSTANCE.getTypeReferenceExternal_ComplexType();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		TypeReferenceExternal typeReferenceExternal = (TypeReferenceExternal)semanticObject;
		if (FrtypesViewsRepository.TypeReferenceExternal.Properties.name == event.getAffectedEditor()) {
			typeReferenceExternal.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (FrtypesViewsRepository.TypeReferenceExternal.Properties.complexType == event.getAffectedEditor()) {
			typeReferenceExternal.setComplexType((Boolean)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			TypeReferenceExternalPropertiesEditionPart basePart = (TypeReferenceExternalPropertiesEditionPart)editingPart;
			if (FrtypesPackage.eINSTANCE.getTypeReferenceExternal_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FrtypesViewsRepository.TypeReferenceExternal.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (FrtypesPackage.eINSTANCE.getTypeReferenceExternal_ComplexType().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FrtypesViewsRepository.TypeReferenceExternal.Properties.complexType))
				basePart.setComplexType((Boolean)msg.getNewValue());
			
			
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
			FrtypesPackage.eINSTANCE.getTypeReferenceExternal_Name(),
			FrtypesPackage.eINSTANCE.getTypeReferenceExternal_ComplexType()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == FrtypesViewsRepository.TypeReferenceExternal.Properties.name;
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
				if (FrtypesViewsRepository.TypeReferenceExternal.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FrtypesPackage.eINSTANCE.getTypeReferenceExternal_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FrtypesPackage.eINSTANCE.getTypeReferenceExternal_Name().getEAttributeType(), newValue);
				}
				if (FrtypesViewsRepository.TypeReferenceExternal.Properties.complexType == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FrtypesPackage.eINSTANCE.getTypeReferenceExternal_ComplexType().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FrtypesPackage.eINSTANCE.getTypeReferenceExternal_ComplexType().getEAttributeType(), newValue);
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
