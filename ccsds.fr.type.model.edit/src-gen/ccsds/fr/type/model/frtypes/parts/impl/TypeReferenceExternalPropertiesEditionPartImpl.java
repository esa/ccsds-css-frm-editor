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
import ccsds.fr.type.model.frtypes.parts.TypeReferenceExternalPropertiesEditionPart;

import ccsds.fr.type.model.frtypes.providers.FrtypesMessages;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

// End of user code

/**
 * 
 * 
 */
public class TypeReferenceExternalPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, TypeReferenceExternalPropertiesEditionPart {

	protected Text name;
	protected Button complexType;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TypeReferenceExternalPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence typeReferenceExternalStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = typeReferenceExternalStep.addStep(FrtypesViewsRepository.TypeReferenceExternal.Properties.class);
		propertiesStep.addStep(FrtypesViewsRepository.TypeReferenceExternal.Properties.name);
		propertiesStep.addStep(FrtypesViewsRepository.TypeReferenceExternal.Properties.complexType);
		
		
		composer = new PartComposer(typeReferenceExternalStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == FrtypesViewsRepository.TypeReferenceExternal.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == FrtypesViewsRepository.TypeReferenceExternal.Properties.name) {
					return createNameText(parent);
				}
				if (key == FrtypesViewsRepository.TypeReferenceExternal.Properties.complexType) {
					return createComplexTypeCheckbox(parent);
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
		propertiesGroup.setText(FrtypesMessages.TypeReferenceExternalPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, FrtypesViewsRepository.TypeReferenceExternal.Properties.name, FrtypesMessages.TypeReferenceExternalPropertiesEditionPart_NameLabel);
		name = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypeReferenceExternalPropertiesEditionPartImpl.this, FrtypesViewsRepository.TypeReferenceExternal.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypeReferenceExternalPropertiesEditionPartImpl.this, FrtypesViewsRepository.TypeReferenceExternal.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, FrtypesViewsRepository.TypeReferenceExternal.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FrtypesViewsRepository.TypeReferenceExternal.Properties.name, FrtypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createComplexTypeCheckbox(Composite parent) {
		complexType = new Button(parent, SWT.CHECK);
		complexType.setText(getDescription(FrtypesViewsRepository.TypeReferenceExternal.Properties.complexType, FrtypesMessages.TypeReferenceExternalPropertiesEditionPart_ComplexTypeLabel));
		complexType.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypeReferenceExternalPropertiesEditionPartImpl.this, FrtypesViewsRepository.TypeReferenceExternal.Properties.complexType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(complexType.getSelection())));
			}

		});
		GridData complexTypeData = new GridData(GridData.FILL_HORIZONTAL);
		complexTypeData.horizontalSpan = 2;
		complexType.setLayoutData(complexTypeData);
		EditingUtils.setID(complexType, FrtypesViewsRepository.TypeReferenceExternal.Properties.complexType);
		EditingUtils.setEEFtype(complexType, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FrtypesViewsRepository.TypeReferenceExternal.Properties.complexType, FrtypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createComplexTypeCheckbox

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
	 * @see ccsds.fr.type.model.frtypes.parts.TypeReferenceExternalPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.TypeReferenceExternalPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FrtypesViewsRepository.TypeReferenceExternal.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(FrtypesMessages.TypeReferenceExternal_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.TypeReferenceExternalPropertiesEditionPart#getComplexType()
	 * 
	 */
	public Boolean getComplexType() {
		return Boolean.valueOf(complexType.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.TypeReferenceExternalPropertiesEditionPart#setComplexType(Boolean newValue)
	 * 
	 */
	public void setComplexType(Boolean newValue) {
		if (newValue != null) {
			complexType.setSelection(newValue.booleanValue());
		} else {
			complexType.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FrtypesViewsRepository.TypeReferenceExternal.Properties.complexType);
		if (eefElementEditorReadOnlyState && complexType.isEnabled()) {
			complexType.setEnabled(false);
			complexType.setToolTipText(FrtypesMessages.TypeReferenceExternal_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !complexType.isEnabled()) {
			complexType.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return FrtypesMessages.TypeReferenceExternal_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
