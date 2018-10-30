/**
 * Generated with Acceleo
 */
package ccsds.fr.type.model.frtypes.parts.forms;

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

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;

import org.eclipse.jface.window.Window;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

// End of user code

/**
 * 
 * 
 */
public class SingleValueConstraintPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, SingleValueConstraintPropertiesEditionPart {

	protected Text values;
	protected Button editValues;
	protected EList valuesList;



	/**
	 * For {@link ISection} use only.
	 */
	public SingleValueConstraintPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SingleValueConstraintPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence singleValueConstraintStep = new BindingCompositionSequence(propertiesEditionComponent);
		singleValueConstraintStep
			.addStep(FrtypesViewsRepository.SingleValueConstraint.Properties.class)
			.addStep(FrtypesViewsRepository.SingleValueConstraint.Properties.values);
		
		
		composer = new PartComposer(singleValueConstraintStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == FrtypesViewsRepository.SingleValueConstraint.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == FrtypesViewsRepository.SingleValueConstraint.Properties.values) {
					return createValuesMultiValuedEditor(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(FrtypesMessages.SingleValueConstraintPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	/**
	 * 
	 */
	protected Composite createValuesMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		values = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData valuesData = new GridData(GridData.FILL_HORIZONTAL);
		valuesData.horizontalSpan = 2;
		values.setLayoutData(valuesData);
		EditingUtils.setID(values, FrtypesViewsRepository.SingleValueConstraint.Properties.values);
		EditingUtils.setEEFtype(values, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editValues = widgetFactory.createButton(parent, getDescription(FrtypesViewsRepository.SingleValueConstraint.Properties.values, FrtypesMessages.SingleValueConstraintPropertiesEditionPart_ValuesLabel), SWT.NONE);
		GridData editValuesData = new GridData();
		editValues.setLayoutData(editValuesData);
		editValues.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SingleValueConstraintPropertiesEditionPartForm.this, FrtypesViewsRepository.SingleValueConstraint.Properties.values, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(valuesList)));
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
