/**
 * Generated with Acceleo
 */
package ccsds.fr.type.model.frtypes.parts.impl;

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
import ccsds.fr.type.model.frtypes.parts.FrtypesViewsRepository;
import ccsds.fr.type.model.frtypes.parts.TypeReferenceLocalPropertiesEditionPart;

import ccsds.fr.type.model.frtypes.providers.FrtypesMessages;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

// End of user code

/**
 * 
 * 
 */
public class TypeReferenceLocalPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, TypeReferenceLocalPropertiesEditionPart {

	protected EObjectFlatComboViewer typeDefinition;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TypeReferenceLocalPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence typeReferenceLocalStep = new BindingCompositionSequence(propertiesEditionComponent);
		typeReferenceLocalStep
			.addStep(FrtypesViewsRepository.TypeReferenceLocal.Properties.class)
			.addStep(FrtypesViewsRepository.TypeReferenceLocal.Properties.typeDefinition);
		
		
		composer = new PartComposer(typeReferenceLocalStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == FrtypesViewsRepository.TypeReferenceLocal.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == FrtypesViewsRepository.TypeReferenceLocal.Properties.typeDefinition) {
					return createTypeDefinitionFlatComboViewer(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(FrtypesMessages.TypeReferenceLocalPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createTypeDefinitionFlatComboViewer(Composite parent) {
		createDescription(parent, FrtypesViewsRepository.TypeReferenceLocal.Properties.typeDefinition, FrtypesMessages.TypeReferenceLocalPropertiesEditionPart_TypeDefinitionLabel);
		typeDefinition = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(FrtypesViewsRepository.TypeReferenceLocal.Properties.typeDefinition, FrtypesViewsRepository.SWT_KIND));
		typeDefinition.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		typeDefinition.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypeReferenceLocalPropertiesEditionPartImpl.this, FrtypesViewsRepository.TypeReferenceLocal.Properties.typeDefinition, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getTypeDefinition()));
			}

		});
		GridData typeDefinitionData = new GridData(GridData.FILL_HORIZONTAL);
		typeDefinition.setLayoutData(typeDefinitionData);
		typeDefinition.setID(FrtypesViewsRepository.TypeReferenceLocal.Properties.typeDefinition);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FrtypesViewsRepository.TypeReferenceLocal.Properties.typeDefinition, FrtypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTypeDefinitionFlatComboViewer

		// End of user code
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.TypeReferenceLocalPropertiesEditionPart#getTypeDefinition()
	 * 
	 */
	public EObject getTypeDefinition() {
		if (typeDefinition.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) typeDefinition.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.TypeReferenceLocalPropertiesEditionPart#initTypeDefinition(EObjectFlatComboSettings)
	 */
	public void initTypeDefinition(EObjectFlatComboSettings settings) {
		typeDefinition.setInput(settings);
		if (current != null) {
			typeDefinition.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FrtypesViewsRepository.TypeReferenceLocal.Properties.typeDefinition);
		if (eefElementEditorReadOnlyState && typeDefinition.isEnabled()) {
			typeDefinition.setEnabled(false);
			typeDefinition.setToolTipText(FrtypesMessages.TypeReferenceLocal_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !typeDefinition.isEnabled()) {
			typeDefinition.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.TypeReferenceLocalPropertiesEditionPart#setTypeDefinition(EObject newValue)
	 * 
	 */
	public void setTypeDefinition(EObject newValue) {
		if (newValue != null) {
			typeDefinition.setSelection(new StructuredSelection(newValue));
		} else {
			typeDefinition.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FrtypesViewsRepository.TypeReferenceLocal.Properties.typeDefinition);
		if (eefElementEditorReadOnlyState && typeDefinition.isEnabled()) {
			typeDefinition.setEnabled(false);
			typeDefinition.setToolTipText(FrtypesMessages.TypeReferenceLocal_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !typeDefinition.isEnabled()) {
			typeDefinition.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.TypeReferenceLocalPropertiesEditionPart#setTypeDefinitionButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTypeDefinitionButtonMode(ButtonsModeEnum newValue) {
		typeDefinition.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.TypeReferenceLocalPropertiesEditionPart#addFilterTypeDefinition(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTypeDefinition(ViewerFilter filter) {
		typeDefinition.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.TypeReferenceLocalPropertiesEditionPart#addBusinessFilterTypeDefinition(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTypeDefinition(ViewerFilter filter) {
		typeDefinition.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return FrtypesMessages.TypeReferenceLocal_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
