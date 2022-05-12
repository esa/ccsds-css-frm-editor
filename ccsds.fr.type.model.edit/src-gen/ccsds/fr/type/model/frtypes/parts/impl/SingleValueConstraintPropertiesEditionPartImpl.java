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
import ccsds.fr.type.model.frtypes.FrtypesPackage;

import ccsds.fr.type.model.frtypes.parts.FrtypesViewsRepository;
import ccsds.fr.type.model.frtypes.parts.SingleValueConstraintPropertiesEditionPart;

import ccsds.fr.type.model.frtypes.providers.FrtypesMessages;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.jface.window.Window;

import org.eclipse.swt.SWT;

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
public class SingleValueConstraintPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, SingleValueConstraintPropertiesEditionPart {

	protected Text values;
	protected Button editValues;
	protected EList valuesList;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SingleValueConstraintPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence singleValueConstraintStep = new BindingCompositionSequence(propertiesEditionComponent);
		singleValueConstraintStep
			.addStep(FrtypesViewsRepository.SingleValueConstraint.Properties.class)
			.addStep(FrtypesViewsRepository.SingleValueConstraint.Properties.values);
		
		
		composer = new PartComposer(singleValueConstraintStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == FrtypesViewsRepository.SingleValueConstraint.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == FrtypesViewsRepository.SingleValueConstraint.Properties.values) {
					return createValuesMultiValuedEditor(parent);
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
		propertiesGroup.setText(FrtypesMessages.SingleValueConstraintPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	protected Composite createValuesMultiValuedEditor(Composite parent) {
		values = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData valuesData = new GridData(GridData.FILL_HORIZONTAL);
		valuesData.horizontalSpan = 2;
		values.setLayoutData(valuesData);
		EditingUtils.setID(values, FrtypesViewsRepository.SingleValueConstraint.Properties.values);
		EditingUtils.setEEFtype(values, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editValues = new Button(parent, SWT.NONE);
		editValues.setText(getDescription(FrtypesViewsRepository.SingleValueConstraint.Properties.values, FrtypesMessages.SingleValueConstraintPropertiesEditionPart_ValuesLabel));
		GridData editValuesData = new GridData();
		editValues.setLayoutData(editValuesData);
		editValues.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						values.getShell(), "SingleValueConstraint", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						valuesList, FrtypesPackage.eINSTANCE.getSingleValueConstraint_Values().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					valuesList = dialog.getResult();
					if (valuesList == null) {
						valuesList = new BasicEList();
					}
					values.setText(valuesList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SingleValueConstraintPropertiesEditionPartImpl.this, FrtypesViewsRepository.SingleValueConstraint.Properties.values, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(valuesList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editValues, FrtypesViewsRepository.SingleValueConstraint.Properties.values);
		EditingUtils.setEEFtype(editValues, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createValuesMultiValuedEditor

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
	 * @see ccsds.fr.type.model.frtypes.parts.SingleValueConstraintPropertiesEditionPart#getValues()
	 * 
	 */
	public EList getValues() {
		return valuesList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.SingleValueConstraintPropertiesEditionPart#setValues(EList newValue)
	 * 
	 */
	public void setValues(EList newValue) {
		valuesList = newValue;
		if (newValue != null) {
			values.setText(valuesList.toString());
		} else {
			values.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FrtypesViewsRepository.SingleValueConstraint.Properties.values);
		if (eefElementEditorReadOnlyState && values.isEnabled()) {
			values.setEnabled(false);
			values.setToolTipText(FrtypesMessages.SingleValueConstraint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !values.isEnabled()) {
			values.setEnabled(true);
		}	
		
	}

	public void addToValues(Object newValue) {
		valuesList.add(newValue);
		if (newValue != null) {
			values.setText(valuesList.toString());
		} else {
			values.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToValues(Object newValue) {
		valuesList.remove(newValue);
		if (newValue != null) {
			values.setText(valuesList.toString());
		} else {
			values.setText(""); //$NON-NLS-1$
		}
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return FrtypesMessages.SingleValueConstraint_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
