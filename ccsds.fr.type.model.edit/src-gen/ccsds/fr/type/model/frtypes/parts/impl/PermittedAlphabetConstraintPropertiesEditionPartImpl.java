/**
 * Generated with Acceleo
 */
package ccsds.fr.type.model.frtypes.parts.impl;

// Start of user code for imports
import ccsds.fr.type.model.frtypes.FrtypesPackage;

import ccsds.fr.type.model.frtypes.parts.FrtypesViewsRepository;
import ccsds.fr.type.model.frtypes.parts.PermittedAlphabetConstraintPropertiesEditionPart;

import ccsds.fr.type.model.frtypes.providers.FrtypesMessages;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;

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

import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;

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
public class PermittedAlphabetConstraintPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, PermittedAlphabetConstraintPropertiesEditionPart {

	protected Text values;
	protected Button editValues;
	protected EList valuesList;
	protected EMFComboViewer type;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public PermittedAlphabetConstraintPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence permittedAlphabetConstraintStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = permittedAlphabetConstraintStep.addStep(FrtypesViewsRepository.PermittedAlphabetConstraint.Properties.class);
		propertiesStep.addStep(FrtypesViewsRepository.PermittedAlphabetConstraint.Properties.values);
		propertiesStep.addStep(FrtypesViewsRepository.PermittedAlphabetConstraint.Properties.type);
		
		
		composer = new PartComposer(permittedAlphabetConstraintStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == FrtypesViewsRepository.PermittedAlphabetConstraint.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == FrtypesViewsRepository.PermittedAlphabetConstraint.Properties.values) {
					return createValuesMultiValuedEditor(parent);
				}
				if (key == FrtypesViewsRepository.PermittedAlphabetConstraint.Properties.type) {
					return createTypeEMFComboViewer(parent);
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
		propertiesGroup.setText(FrtypesMessages.PermittedAlphabetConstraintPropertiesEditionPart_PropertiesGroupLabel);
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
		EditingUtils.setID(values, FrtypesViewsRepository.PermittedAlphabetConstraint.Properties.values);
		EditingUtils.setEEFtype(values, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editValues = new Button(parent, SWT.NONE);
		editValues.setText(getDescription(FrtypesViewsRepository.PermittedAlphabetConstraint.Properties.values, FrtypesMessages.PermittedAlphabetConstraintPropertiesEditionPart_ValuesLabel));
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
						values.getShell(), "PermittedAlphabetConstraint", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						valuesList, FrtypesPackage.eINSTANCE.getPermittedAlphabetConstraint_Values().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					valuesList = dialog.getResult();
					if (valuesList == null) {
						valuesList = new BasicEList();
					}
					values.setText(valuesList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PermittedAlphabetConstraintPropertiesEditionPartImpl.this, FrtypesViewsRepository.PermittedAlphabetConstraint.Properties.values, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(valuesList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editValues, FrtypesViewsRepository.PermittedAlphabetConstraint.Properties.values);
		EditingUtils.setEEFtype(editValues, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createValuesMultiValuedEditor

		// End of user code
		return parent;
	}

	
	protected Composite createTypeEMFComboViewer(Composite parent) {
		createDescription(parent, FrtypesViewsRepository.PermittedAlphabetConstraint.Properties.type, FrtypesMessages.PermittedAlphabetConstraintPropertiesEditionPart_TypeLabel);
		type = new EMFComboViewer(parent);
		type.setContentProvider(new ArrayContentProvider());
		type.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData typeData = new GridData(GridData.FILL_HORIZONTAL);
		type.getCombo().setLayoutData(typeData);
		type.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PermittedAlphabetConstraintPropertiesEditionPartImpl.this, FrtypesViewsRepository.PermittedAlphabetConstraint.Properties.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getType()));
			}

		});
		type.setID(FrtypesViewsRepository.PermittedAlphabetConstraint.Properties.type);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FrtypesViewsRepository.PermittedAlphabetConstraint.Properties.type, FrtypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTypeEMFComboViewer

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
	 * @see ccsds.fr.type.model.frtypes.parts.PermittedAlphabetConstraintPropertiesEditionPart#getValues()
	 * 
	 */
	public EList getValues() {
		return valuesList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.PermittedAlphabetConstraintPropertiesEditionPart#setValues(EList newValue)
	 * 
	 */
	public void setValues(EList newValue) {
		valuesList = newValue;
		if (newValue != null) {
			values.setText(valuesList.toString());
		} else {
			values.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FrtypesViewsRepository.PermittedAlphabetConstraint.Properties.values);
		if (eefElementEditorReadOnlyState && values.isEnabled()) {
			values.setEnabled(false);
			values.setToolTipText(FrtypesMessages.PermittedAlphabetConstraint_ReadOnly);
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
	 * @see ccsds.fr.type.model.frtypes.parts.PermittedAlphabetConstraintPropertiesEditionPart#getType()
	 * 
	 */
	public Enumerator getType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) type.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.PermittedAlphabetConstraintPropertiesEditionPart#initType(Object input, Enumerator current)
	 */
	public void initType(Object input, Enumerator current) {
		type.setInput(input);
		type.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(FrtypesViewsRepository.PermittedAlphabetConstraint.Properties.type);
		if (eefElementEditorReadOnlyState && type.isEnabled()) {
			type.setEnabled(false);
			type.setToolTipText(FrtypesMessages.PermittedAlphabetConstraint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !type.isEnabled()) {
			type.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.PermittedAlphabetConstraintPropertiesEditionPart#setType(Enumerator newValue)
	 * 
	 */
	public void setType(Enumerator newValue) {
		type.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(FrtypesViewsRepository.PermittedAlphabetConstraint.Properties.type);
		if (eefElementEditorReadOnlyState && type.isEnabled()) {
			type.setEnabled(false);
			type.setToolTipText(FrtypesMessages.PermittedAlphabetConstraint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !type.isEnabled()) {
			type.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return FrtypesMessages.PermittedAlphabetConstraint_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
