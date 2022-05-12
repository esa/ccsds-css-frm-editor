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
import ccsds.fr.type.model.frtypes.ConstraintType;
import ccsds.fr.type.model.frtypes.FrtypesPackage;
import ccsds.fr.type.model.frtypes.PermittedAlphabetConstraint;

import ccsds.fr.type.model.frtypes.parts.FrtypesViewsRepository;
import ccsds.fr.type.model.frtypes.parts.PermittedAlphabetConstraintPropertiesEditionPart;

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

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;


// End of user code

/**
 * 
 * 
 */
public class PermittedAlphabetConstraintPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public PermittedAlphabetConstraintPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject permittedAlphabetConstraint, String editing_mode) {
		super(editingContext, permittedAlphabetConstraint, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = FrtypesViewsRepository.class;
		partKey = FrtypesViewsRepository.PermittedAlphabetConstraint.class;
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
			
			final PermittedAlphabetConstraint permittedAlphabetConstraint = (PermittedAlphabetConstraint)elt;
			final PermittedAlphabetConstraintPropertiesEditionPart basePart = (PermittedAlphabetConstraintPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(FrtypesViewsRepository.PermittedAlphabetConstraint.Properties.values))
				basePart.setValues(permittedAlphabetConstraint.getValues());
			
			if (isAccessible(FrtypesViewsRepository.PermittedAlphabetConstraint.Properties.type)) {
				basePart.initType(EEFUtils.choiceOfValues(permittedAlphabetConstraint, FrtypesPackage.eINSTANCE.getPermittedAlphabetConstraint_Type()), permittedAlphabetConstraint.getType());
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
		if (editorKey == FrtypesViewsRepository.PermittedAlphabetConstraint.Properties.values) {
			return FrtypesPackage.eINSTANCE.getPermittedAlphabetConstraint_Values();
		}
		if (editorKey == FrtypesViewsRepository.PermittedAlphabetConstraint.Properties.type) {
			return FrtypesPackage.eINSTANCE.getPermittedAlphabetConstraint_Type();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		PermittedAlphabetConstraint permittedAlphabetConstraint = (PermittedAlphabetConstraint)semanticObject;
		if (FrtypesViewsRepository.PermittedAlphabetConstraint.Properties.values == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				permittedAlphabetConstraint.getValues().clear();
				permittedAlphabetConstraint.getValues().addAll(((EList) event.getNewValue()));
			}
		}
		if (FrtypesViewsRepository.PermittedAlphabetConstraint.Properties.type == event.getAffectedEditor()) {
			permittedAlphabetConstraint.setType((ConstraintType)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			PermittedAlphabetConstraintPropertiesEditionPart basePart = (PermittedAlphabetConstraintPropertiesEditionPart)editingPart;
			if (FrtypesPackage.eINSTANCE.getPermittedAlphabetConstraint_Values().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(FrtypesViewsRepository.PermittedAlphabetConstraint.Properties.values)) {
				if (msg.getNewValue() instanceof EList<?>) {
					basePart.setValues((EList<?>)msg.getNewValue());
				} else if (msg.getNewValue() == null) {
					basePart.setValues(new BasicEList<Object>());
				} else {
					BasicEList<Object> newValueAsList = new BasicEList<Object>();
					newValueAsList.add(msg.getNewValue());
					basePart.setValues(newValueAsList);
				}
			}
			
			if (FrtypesPackage.eINSTANCE.getPermittedAlphabetConstraint_Type().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(FrtypesViewsRepository.PermittedAlphabetConstraint.Properties.type))
				basePart.setType((ConstraintType)msg.getNewValue());
			
			
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
			FrtypesPackage.eINSTANCE.getPermittedAlphabetConstraint_Values(),
			FrtypesPackage.eINSTANCE.getPermittedAlphabetConstraint_Type()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == FrtypesViewsRepository.PermittedAlphabetConstraint.Properties.values;
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
				if (FrtypesViewsRepository.PermittedAlphabetConstraint.Properties.values == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(FrtypesPackage.eINSTANCE.getPermittedAlphabetConstraint_Values().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (FrtypesViewsRepository.PermittedAlphabetConstraint.Properties.type == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FrtypesPackage.eINSTANCE.getPermittedAlphabetConstraint_Type().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FrtypesPackage.eINSTANCE.getPermittedAlphabetConstraint_Type().getEAttributeType(), newValue);
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
