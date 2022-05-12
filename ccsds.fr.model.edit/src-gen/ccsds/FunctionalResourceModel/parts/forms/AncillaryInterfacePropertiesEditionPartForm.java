/**
 * Generated with Acceleo
 */
package ccsds.FunctionalResourceModel.parts.forms;

/*-
 * #%L
 * CCSDS Functional Resource Model Edit
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
import ccsds.FunctionalResourceModel.parts.AncillaryInterfacePropertiesEditionPart;
import ccsds.FunctionalResourceModel.parts.FunctionalResourceModelViewsRepository;

import ccsds.FunctionalResourceModel.providers.FunctionalResourceModelMessages;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

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
public class AncillaryInterfacePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, AncillaryInterfacePropertiesEditionPart {

	protected Text name;
	protected EObjectFlatComboViewer providingFunctionalResource;
	protected EObjectFlatComboViewer requiringFunctionalResource;



	/**
	 * For {@link ISection} use only.
	 */
	public AncillaryInterfacePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public AncillaryInterfacePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence ancillaryInterfaceStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = ancillaryInterfaceStep.addStep(FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.class);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.name);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.providingFunctionalResource);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.requiringFunctionalResource);
		
		
		composer = new PartComposer(ancillaryInterfaceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.providingFunctionalResource) {
					return createProvidingFunctionalResourceFlatComboViewer(parent, widgetFactory);
				}
				if (key == FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.requiringFunctionalResource) {
					return createRequiringFunctionalResourceFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(FunctionalResourceModelMessages.AncillaryInterfacePropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.name, FunctionalResourceModelMessages.AncillaryInterfacePropertiesEditionPart_NameLabel);
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							AncillaryInterfacePropertiesEditionPartForm.this,
							FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									AncillaryInterfacePropertiesEditionPartForm.this,
									FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.name,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, name.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									AncillaryInterfacePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AncillaryInterfacePropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.name, FunctionalResourceModelViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createProvidingFunctionalResourceFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.providingFunctionalResource, FunctionalResourceModelMessages.AncillaryInterfacePropertiesEditionPart_ProvidingFunctionalResourceLabel);
		providingFunctionalResource = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.providingFunctionalResource, FunctionalResourceModelViewsRepository.FORM_KIND));
		widgetFactory.adapt(providingFunctionalResource);
		providingFunctionalResource.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData providingFunctionalResourceData = new GridData(GridData.FILL_HORIZONTAL);
		providingFunctionalResource.setLayoutData(providingFunctionalResourceData);
		providingFunctionalResource.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AncillaryInterfacePropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.providingFunctionalResource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getProvidingFunctionalResource()));
			}

		});
		providingFunctionalResource.setID(FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.providingFunctionalResource);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.providingFunctionalResource, FunctionalResourceModelViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createProvidingFunctionalResourceFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createRequiringFunctionalResourceFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.requiringFunctionalResource, FunctionalResourceModelMessages.AncillaryInterfacePropertiesEditionPart_RequiringFunctionalResourceLabel);
		requiringFunctionalResource = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.requiringFunctionalResource, FunctionalResourceModelViewsRepository.FORM_KIND));
		widgetFactory.adapt(requiringFunctionalResource);
		requiringFunctionalResource.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData requiringFunctionalResourceData = new GridData(GridData.FILL_HORIZONTAL);
		requiringFunctionalResource.setLayoutData(requiringFunctionalResourceData);
		requiringFunctionalResource.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AncillaryInterfacePropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.requiringFunctionalResource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getRequiringFunctionalResource()));
			}

		});
		requiringFunctionalResource.setID(FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.requiringFunctionalResource);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.requiringFunctionalResource, FunctionalResourceModelViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createRequiringFunctionalResourceFlatComboViewer

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
	 * @see ccsds.FunctionalResourceModel.parts.AncillaryInterfacePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.AncillaryInterfacePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(FunctionalResourceModelMessages.AncillaryInterface_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.AncillaryInterfacePropertiesEditionPart#getProvidingFunctionalResource()
	 * 
	 */
	public EObject getProvidingFunctionalResource() {
		if (providingFunctionalResource.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) providingFunctionalResource.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.AncillaryInterfacePropertiesEditionPart#initProvidingFunctionalResource(EObjectFlatComboSettings)
	 */
	public void initProvidingFunctionalResource(EObjectFlatComboSettings settings) {
		providingFunctionalResource.setInput(settings);
		if (current != null) {
			providingFunctionalResource.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.providingFunctionalResource);
		if (eefElementEditorReadOnlyState && providingFunctionalResource.isEnabled()) {
			providingFunctionalResource.setEnabled(false);
			providingFunctionalResource.setToolTipText(FunctionalResourceModelMessages.AncillaryInterface_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !providingFunctionalResource.isEnabled()) {
			providingFunctionalResource.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.AncillaryInterfacePropertiesEditionPart#setProvidingFunctionalResource(EObject newValue)
	 * 
	 */
	public void setProvidingFunctionalResource(EObject newValue) {
		if (newValue != null) {
			providingFunctionalResource.setSelection(new StructuredSelection(newValue));
		} else {
			providingFunctionalResource.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.providingFunctionalResource);
		if (eefElementEditorReadOnlyState && providingFunctionalResource.isEnabled()) {
			providingFunctionalResource.setEnabled(false);
			providingFunctionalResource.setToolTipText(FunctionalResourceModelMessages.AncillaryInterface_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !providingFunctionalResource.isEnabled()) {
			providingFunctionalResource.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.AncillaryInterfacePropertiesEditionPart#setProvidingFunctionalResourceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setProvidingFunctionalResourceButtonMode(ButtonsModeEnum newValue) {
		providingFunctionalResource.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.AncillaryInterfacePropertiesEditionPart#addFilterProvidingFunctionalResource(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProvidingFunctionalResource(ViewerFilter filter) {
		providingFunctionalResource.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.AncillaryInterfacePropertiesEditionPart#addBusinessFilterProvidingFunctionalResource(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProvidingFunctionalResource(ViewerFilter filter) {
		providingFunctionalResource.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.AncillaryInterfacePropertiesEditionPart#getRequiringFunctionalResource()
	 * 
	 */
	public EObject getRequiringFunctionalResource() {
		if (requiringFunctionalResource.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) requiringFunctionalResource.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.AncillaryInterfacePropertiesEditionPart#initRequiringFunctionalResource(EObjectFlatComboSettings)
	 */
	public void initRequiringFunctionalResource(EObjectFlatComboSettings settings) {
		requiringFunctionalResource.setInput(settings);
		if (current != null) {
			requiringFunctionalResource.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.requiringFunctionalResource);
		if (eefElementEditorReadOnlyState && requiringFunctionalResource.isEnabled()) {
			requiringFunctionalResource.setEnabled(false);
			requiringFunctionalResource.setToolTipText(FunctionalResourceModelMessages.AncillaryInterface_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !requiringFunctionalResource.isEnabled()) {
			requiringFunctionalResource.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.AncillaryInterfacePropertiesEditionPart#setRequiringFunctionalResource(EObject newValue)
	 * 
	 */
	public void setRequiringFunctionalResource(EObject newValue) {
		if (newValue != null) {
			requiringFunctionalResource.setSelection(new StructuredSelection(newValue));
		} else {
			requiringFunctionalResource.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.AncillaryInterface.Properties.requiringFunctionalResource);
		if (eefElementEditorReadOnlyState && requiringFunctionalResource.isEnabled()) {
			requiringFunctionalResource.setEnabled(false);
			requiringFunctionalResource.setToolTipText(FunctionalResourceModelMessages.AncillaryInterface_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !requiringFunctionalResource.isEnabled()) {
			requiringFunctionalResource.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.AncillaryInterfacePropertiesEditionPart#setRequiringFunctionalResourceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setRequiringFunctionalResourceButtonMode(ButtonsModeEnum newValue) {
		requiringFunctionalResource.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.AncillaryInterfacePropertiesEditionPart#addFilterRequiringFunctionalResource(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRequiringFunctionalResource(ViewerFilter filter) {
		requiringFunctionalResource.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.AncillaryInterfacePropertiesEditionPart#addBusinessFilterRequiringFunctionalResource(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRequiringFunctionalResource(ViewerFilter filter) {
		requiringFunctionalResource.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return FunctionalResourceModelMessages.AncillaryInterface_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
