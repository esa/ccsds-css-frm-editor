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
import ccsds.FunctionalResourceModel.FunctionalResourceModelPackage;

import ccsds.FunctionalResourceModel.parts.FunctionalResourceModelViewsRepository;
import ccsds.FunctionalResourceModel.parts.ServiceAccessPointPropertiesEditionPart;

import ccsds.FunctionalResourceModel.providers.FunctionalResourceModelMessages;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

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
import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.jface.window.Window;

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
public class ServiceAccessPointPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, ServiceAccessPointPropertiesEditionPart {

	protected Text name;
	protected Text minAccessor;
	protected Text maxAccessor;
	protected Text minAccessed;
	protected Text maxAccessed;
	protected EObjectFlatComboViewer accessedFunctionalResource;
	protected EObjectFlatComboViewer accessingFunctionalResource;



	/**
	 * For {@link ISection} use only.
	 */
	public ServiceAccessPointPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ServiceAccessPointPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence serviceAccessPointStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = serviceAccessPointStep.addStep(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.class);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.name);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.minAccessor);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.maxAccessor);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.minAccessed);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.maxAccessed);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.accessedFunctionalResource);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.accessingFunctionalResource);
		
		
		composer = new PartComposer(serviceAccessPointStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.minAccessor) {
					return createMinAccessorText(widgetFactory, parent);
				}
				if (key == FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.maxAccessor) {
					return createMaxAccessorText(widgetFactory, parent);
				}
				if (key == FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.minAccessed) {
					return createMinAccessedText(widgetFactory, parent);
				}
				if (key == FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.maxAccessed) {
					return createMaxAccessedText(widgetFactory, parent);
				}
				if (key == FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.accessedFunctionalResource) {
					return createAccessedFunctionalResourceFlatComboViewer(parent, widgetFactory);
				}
				if (key == FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.accessingFunctionalResource) {
					return createAccessingFunctionalResourceFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(FunctionalResourceModelMessages.ServiceAccessPointPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.name, FunctionalResourceModelMessages.ServiceAccessPointPropertiesEditionPart_NameLabel);
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
							ServiceAccessPointPropertiesEditionPartForm.this,
							FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ServiceAccessPointPropertiesEditionPartForm.this,
									FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.name,
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
									ServiceAccessPointPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ServiceAccessPointPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.name, FunctionalResourceModelViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createMinAccessorText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.minAccessor, FunctionalResourceModelMessages.ServiceAccessPointPropertiesEditionPart_MinAccessorLabel);
		minAccessor = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		minAccessor.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData minAccessorData = new GridData(GridData.FILL_HORIZONTAL);
		minAccessor.setLayoutData(minAccessorData);
		minAccessor.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ServiceAccessPointPropertiesEditionPartForm.this,
							FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.minAccessor,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, minAccessor.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ServiceAccessPointPropertiesEditionPartForm.this,
									FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.minAccessor,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, minAccessor.getText()));
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
									ServiceAccessPointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		minAccessor.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ServiceAccessPointPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.minAccessor, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, minAccessor.getText()));
				}
			}
		});
		EditingUtils.setID(minAccessor, FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.minAccessor);
		EditingUtils.setEEFtype(minAccessor, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.minAccessor, FunctionalResourceModelViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createMinAccessorText

		// End of user code
		return parent;
	}

	
	protected Composite createMaxAccessorText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.maxAccessor, FunctionalResourceModelMessages.ServiceAccessPointPropertiesEditionPart_MaxAccessorLabel);
		maxAccessor = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		maxAccessor.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData maxAccessorData = new GridData(GridData.FILL_HORIZONTAL);
		maxAccessor.setLayoutData(maxAccessorData);
		maxAccessor.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ServiceAccessPointPropertiesEditionPartForm.this,
							FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.maxAccessor,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, maxAccessor.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ServiceAccessPointPropertiesEditionPartForm.this,
									FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.maxAccessor,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, maxAccessor.getText()));
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
									ServiceAccessPointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		maxAccessor.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ServiceAccessPointPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.maxAccessor, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, maxAccessor.getText()));
				}
			}
		});
		EditingUtils.setID(maxAccessor, FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.maxAccessor);
		EditingUtils.setEEFtype(maxAccessor, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.maxAccessor, FunctionalResourceModelViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createMaxAccessorText

		// End of user code
		return parent;
	}

	
	protected Composite createMinAccessedText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.minAccessed, FunctionalResourceModelMessages.ServiceAccessPointPropertiesEditionPart_MinAccessedLabel);
		minAccessed = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		minAccessed.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData minAccessedData = new GridData(GridData.FILL_HORIZONTAL);
		minAccessed.setLayoutData(minAccessedData);
		minAccessed.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ServiceAccessPointPropertiesEditionPartForm.this,
							FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.minAccessed,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, minAccessed.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ServiceAccessPointPropertiesEditionPartForm.this,
									FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.minAccessed,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, minAccessed.getText()));
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
									ServiceAccessPointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		minAccessed.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ServiceAccessPointPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.minAccessed, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, minAccessed.getText()));
				}
			}
		});
		EditingUtils.setID(minAccessed, FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.minAccessed);
		EditingUtils.setEEFtype(minAccessed, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.minAccessed, FunctionalResourceModelViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createMinAccessedText

		// End of user code
		return parent;
	}

	
	protected Composite createMaxAccessedText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.maxAccessed, FunctionalResourceModelMessages.ServiceAccessPointPropertiesEditionPart_MaxAccessedLabel);
		maxAccessed = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		maxAccessed.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData maxAccessedData = new GridData(GridData.FILL_HORIZONTAL);
		maxAccessed.setLayoutData(maxAccessedData);
		maxAccessed.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ServiceAccessPointPropertiesEditionPartForm.this,
							FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.maxAccessed,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, maxAccessed.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ServiceAccessPointPropertiesEditionPartForm.this,
									FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.maxAccessed,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, maxAccessed.getText()));
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
									ServiceAccessPointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		maxAccessed.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ServiceAccessPointPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.maxAccessed, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, maxAccessed.getText()));
				}
			}
		});
		EditingUtils.setID(maxAccessed, FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.maxAccessed);
		EditingUtils.setEEFtype(maxAccessed, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.maxAccessed, FunctionalResourceModelViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createMaxAccessedText

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createAccessedFunctionalResourceFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.accessedFunctionalResource, FunctionalResourceModelMessages.ServiceAccessPointPropertiesEditionPart_AccessedFunctionalResourceLabel);
		accessedFunctionalResource = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.accessedFunctionalResource, FunctionalResourceModelViewsRepository.FORM_KIND));
		widgetFactory.adapt(accessedFunctionalResource);
		accessedFunctionalResource.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData accessedFunctionalResourceData = new GridData(GridData.FILL_HORIZONTAL);
		accessedFunctionalResource.setLayoutData(accessedFunctionalResourceData);
		accessedFunctionalResource.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ServiceAccessPointPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.accessedFunctionalResource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getAccessedFunctionalResource()));
			}

		});
		accessedFunctionalResource.setID(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.accessedFunctionalResource);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.accessedFunctionalResource, FunctionalResourceModelViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createAccessedFunctionalResourceFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createAccessingFunctionalResourceFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.accessingFunctionalResource, FunctionalResourceModelMessages.ServiceAccessPointPropertiesEditionPart_AccessingFunctionalResourceLabel);
		accessingFunctionalResource = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.accessingFunctionalResource, FunctionalResourceModelViewsRepository.FORM_KIND));
		widgetFactory.adapt(accessingFunctionalResource);
		accessingFunctionalResource.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData accessingFunctionalResourceData = new GridData(GridData.FILL_HORIZONTAL);
		accessingFunctionalResource.setLayoutData(accessingFunctionalResourceData);
		accessingFunctionalResource.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ServiceAccessPointPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.accessingFunctionalResource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getAccessingFunctionalResource()));
			}

		});
		accessingFunctionalResource.setID(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.accessingFunctionalResource);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.accessingFunctionalResource, FunctionalResourceModelViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createAccessingFunctionalResourceFlatComboViewer

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
	 * @see ccsds.FunctionalResourceModel.parts.ServiceAccessPointPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ServiceAccessPointPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(FunctionalResourceModelMessages.ServiceAccessPoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ServiceAccessPointPropertiesEditionPart#getMinAccessor()
	 * 
	 */
	public String getMinAccessor() {
		return minAccessor.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ServiceAccessPointPropertiesEditionPart#setMinAccessor(String newValue)
	 * 
	 */
	public void setMinAccessor(String newValue) {
		if (newValue != null) {
			minAccessor.setText(newValue);
		} else {
			minAccessor.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.minAccessor);
		if (eefElementEditorReadOnlyState && minAccessor.isEnabled()) {
			minAccessor.setEnabled(false);
			minAccessor.setToolTipText(FunctionalResourceModelMessages.ServiceAccessPoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !minAccessor.isEnabled()) {
			minAccessor.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ServiceAccessPointPropertiesEditionPart#getMaxAccessor()
	 * 
	 */
	public String getMaxAccessor() {
		return maxAccessor.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ServiceAccessPointPropertiesEditionPart#setMaxAccessor(String newValue)
	 * 
	 */
	public void setMaxAccessor(String newValue) {
		if (newValue != null) {
			maxAccessor.setText(newValue);
		} else {
			maxAccessor.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.maxAccessor);
		if (eefElementEditorReadOnlyState && maxAccessor.isEnabled()) {
			maxAccessor.setEnabled(false);
			maxAccessor.setToolTipText(FunctionalResourceModelMessages.ServiceAccessPoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !maxAccessor.isEnabled()) {
			maxAccessor.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ServiceAccessPointPropertiesEditionPart#getMinAccessed()
	 * 
	 */
	public String getMinAccessed() {
		return minAccessed.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ServiceAccessPointPropertiesEditionPart#setMinAccessed(String newValue)
	 * 
	 */
	public void setMinAccessed(String newValue) {
		if (newValue != null) {
			minAccessed.setText(newValue);
		} else {
			minAccessed.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.minAccessed);
		if (eefElementEditorReadOnlyState && minAccessed.isEnabled()) {
			minAccessed.setEnabled(false);
			minAccessed.setToolTipText(FunctionalResourceModelMessages.ServiceAccessPoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !minAccessed.isEnabled()) {
			minAccessed.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ServiceAccessPointPropertiesEditionPart#getMaxAccessed()
	 * 
	 */
	public String getMaxAccessed() {
		return maxAccessed.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ServiceAccessPointPropertiesEditionPart#setMaxAccessed(String newValue)
	 * 
	 */
	public void setMaxAccessed(String newValue) {
		if (newValue != null) {
			maxAccessed.setText(newValue);
		} else {
			maxAccessed.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.maxAccessed);
		if (eefElementEditorReadOnlyState && maxAccessed.isEnabled()) {
			maxAccessed.setEnabled(false);
			maxAccessed.setToolTipText(FunctionalResourceModelMessages.ServiceAccessPoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !maxAccessed.isEnabled()) {
			maxAccessed.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ServiceAccessPointPropertiesEditionPart#getAccessedFunctionalResource()
	 * 
	 */
	public EObject getAccessedFunctionalResource() {
		if (accessedFunctionalResource.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) accessedFunctionalResource.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ServiceAccessPointPropertiesEditionPart#initAccessedFunctionalResource(EObjectFlatComboSettings)
	 */
	public void initAccessedFunctionalResource(EObjectFlatComboSettings settings) {
		accessedFunctionalResource.setInput(settings);
		if (current != null) {
			accessedFunctionalResource.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.accessedFunctionalResource);
		if (eefElementEditorReadOnlyState && accessedFunctionalResource.isEnabled()) {
			accessedFunctionalResource.setEnabled(false);
			accessedFunctionalResource.setToolTipText(FunctionalResourceModelMessages.ServiceAccessPoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !accessedFunctionalResource.isEnabled()) {
			accessedFunctionalResource.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ServiceAccessPointPropertiesEditionPart#setAccessedFunctionalResource(EObject newValue)
	 * 
	 */
	public void setAccessedFunctionalResource(EObject newValue) {
		if (newValue != null) {
			accessedFunctionalResource.setSelection(new StructuredSelection(newValue));
		} else {
			accessedFunctionalResource.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.accessedFunctionalResource);
		if (eefElementEditorReadOnlyState && accessedFunctionalResource.isEnabled()) {
			accessedFunctionalResource.setEnabled(false);
			accessedFunctionalResource.setToolTipText(FunctionalResourceModelMessages.ServiceAccessPoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !accessedFunctionalResource.isEnabled()) {
			accessedFunctionalResource.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ServiceAccessPointPropertiesEditionPart#setAccessedFunctionalResourceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setAccessedFunctionalResourceButtonMode(ButtonsModeEnum newValue) {
		accessedFunctionalResource.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ServiceAccessPointPropertiesEditionPart#addFilterAccessedFunctionalResource(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAccessedFunctionalResource(ViewerFilter filter) {
		accessedFunctionalResource.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ServiceAccessPointPropertiesEditionPart#addBusinessFilterAccessedFunctionalResource(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAccessedFunctionalResource(ViewerFilter filter) {
		accessedFunctionalResource.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ServiceAccessPointPropertiesEditionPart#getAccessingFunctionalResource()
	 * 
	 */
	public EObject getAccessingFunctionalResource() {
		if (accessingFunctionalResource.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) accessingFunctionalResource.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ServiceAccessPointPropertiesEditionPart#initAccessingFunctionalResource(EObjectFlatComboSettings)
	 */
	public void initAccessingFunctionalResource(EObjectFlatComboSettings settings) {
		accessingFunctionalResource.setInput(settings);
		if (current != null) {
			accessingFunctionalResource.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.accessingFunctionalResource);
		if (eefElementEditorReadOnlyState && accessingFunctionalResource.isEnabled()) {
			accessingFunctionalResource.setEnabled(false);
			accessingFunctionalResource.setToolTipText(FunctionalResourceModelMessages.ServiceAccessPoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !accessingFunctionalResource.isEnabled()) {
			accessingFunctionalResource.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ServiceAccessPointPropertiesEditionPart#setAccessingFunctionalResource(EObject newValue)
	 * 
	 */
	public void setAccessingFunctionalResource(EObject newValue) {
		if (newValue != null) {
			accessingFunctionalResource.setSelection(new StructuredSelection(newValue));
		} else {
			accessingFunctionalResource.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.ServiceAccessPoint.Properties.accessingFunctionalResource);
		if (eefElementEditorReadOnlyState && accessingFunctionalResource.isEnabled()) {
			accessingFunctionalResource.setEnabled(false);
			accessingFunctionalResource.setToolTipText(FunctionalResourceModelMessages.ServiceAccessPoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !accessingFunctionalResource.isEnabled()) {
			accessingFunctionalResource.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ServiceAccessPointPropertiesEditionPart#setAccessingFunctionalResourceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setAccessingFunctionalResourceButtonMode(ButtonsModeEnum newValue) {
		accessingFunctionalResource.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ServiceAccessPointPropertiesEditionPart#addFilterAccessingFunctionalResource(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAccessingFunctionalResource(ViewerFilter filter) {
		accessingFunctionalResource.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ServiceAccessPointPropertiesEditionPart#addBusinessFilterAccessingFunctionalResource(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAccessingFunctionalResource(ViewerFilter filter) {
		accessingFunctionalResource.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return FunctionalResourceModelMessages.ServiceAccessPoint_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
