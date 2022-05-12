/**
 * Generated with Acceleo
 */
package ccsds.fr.type.model.frtypes.parts.forms;

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
import ccsds.fr.type.model.frtypes.parts.ModulePropertiesEditionPart;

import ccsds.fr.type.model.frtypes.providers.FrtypesMessages;

import java.util.ArrayList;
import java.util.List;

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

import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

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
public class ModulePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, ModulePropertiesEditionPart {

	protected ReferencesTable typeDefinition;
	protected List<ViewerFilter> typeDefinitionBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> typeDefinitionFilters = new ArrayList<ViewerFilter>();
	protected Text oid;
	protected Text exports;
	protected Button editExports;
	protected EList exportsList;
	protected Text name;
	protected ReferencesTable imports;
	protected List<ViewerFilter> importsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> importsFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public ModulePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ModulePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence moduleStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = moduleStep.addStep(FrtypesViewsRepository.Module.Properties.class);
		propertiesStep.addStep(FrtypesViewsRepository.Module.Properties.typeDefinition);
		propertiesStep.addStep(FrtypesViewsRepository.Module.Properties.oid);
		propertiesStep.addStep(FrtypesViewsRepository.Module.Properties.exports);
		propertiesStep.addStep(FrtypesViewsRepository.Module.Properties.name);
		propertiesStep.addStep(FrtypesViewsRepository.Module.Properties.imports);
		
		
		composer = new PartComposer(moduleStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == FrtypesViewsRepository.Module.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == FrtypesViewsRepository.Module.Properties.typeDefinition) {
					return createTypeDefinitionTableComposition(widgetFactory, parent);
				}
				if (key == FrtypesViewsRepository.Module.Properties.oid) {
					return createOidText(widgetFactory, parent);
				}
				if (key == FrtypesViewsRepository.Module.Properties.exports) {
					return createExportsMultiValuedEditor(widgetFactory, parent);
				}
				if (key == FrtypesViewsRepository.Module.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == FrtypesViewsRepository.Module.Properties.imports) {
					return createImportsTableComposition(widgetFactory, parent);
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
		propertiesSection.setText(FrtypesMessages.ModulePropertiesEditionPart_PropertiesGroupLabel);
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
	 * @param container
	 * 
	 */
	protected Composite createTypeDefinitionTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.typeDefinition = new ReferencesTable(getDescription(FrtypesViewsRepository.Module.Properties.typeDefinition, FrtypesMessages.ModulePropertiesEditionPart_TypeDefinitionLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartForm.this, FrtypesViewsRepository.Module.Properties.typeDefinition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				typeDefinition.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartForm.this, FrtypesViewsRepository.Module.Properties.typeDefinition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				typeDefinition.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartForm.this, FrtypesViewsRepository.Module.Properties.typeDefinition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				typeDefinition.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartForm.this, FrtypesViewsRepository.Module.Properties.typeDefinition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				typeDefinition.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.typeDefinitionFilters) {
			this.typeDefinition.addFilter(filter);
		}
		this.typeDefinition.setHelpText(propertiesEditionComponent.getHelpContent(FrtypesViewsRepository.Module.Properties.typeDefinition, FrtypesViewsRepository.FORM_KIND));
		this.typeDefinition.createControls(parent, widgetFactory);
		this.typeDefinition.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartForm.this, FrtypesViewsRepository.Module.Properties.typeDefinition, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData typeDefinitionData = new GridData(GridData.FILL_HORIZONTAL);
		typeDefinitionData.horizontalSpan = 3;
		this.typeDefinition.setLayoutData(typeDefinitionData);
		this.typeDefinition.setLowerBound(0);
		this.typeDefinition.setUpperBound(-1);
		typeDefinition.setID(FrtypesViewsRepository.Module.Properties.typeDefinition);
		typeDefinition.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createTypeDefinitionTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createOidText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, FrtypesViewsRepository.Module.Properties.oid, FrtypesMessages.ModulePropertiesEditionPart_OidLabel);
		oid = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		oid.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData oidData = new GridData(GridData.FILL_HORIZONTAL);
		oid.setLayoutData(oidData);
		oid.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ModulePropertiesEditionPartForm.this,
							FrtypesViewsRepository.Module.Properties.oid,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, oid.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ModulePropertiesEditionPartForm.this,
									FrtypesViewsRepository.Module.Properties.oid,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, oid.getText()));
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
									ModulePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		oid.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartForm.this, FrtypesViewsRepository.Module.Properties.oid, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, oid.getText()));
				}
			}
		});
		EditingUtils.setID(oid, FrtypesViewsRepository.Module.Properties.oid);
		EditingUtils.setEEFtype(oid, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FrtypesViewsRepository.Module.Properties.oid, FrtypesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createOidText

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createExportsMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		exports = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData exportsData = new GridData(GridData.FILL_HORIZONTAL);
		exportsData.horizontalSpan = 2;
		exports.setLayoutData(exportsData);
		EditingUtils.setID(exports, FrtypesViewsRepository.Module.Properties.exports);
		EditingUtils.setEEFtype(exports, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editExports = widgetFactory.createButton(parent, getDescription(FrtypesViewsRepository.Module.Properties.exports, FrtypesMessages.ModulePropertiesEditionPart_ExportsLabel), SWT.NONE);
		GridData editExportsData = new GridData();
		editExports.setLayoutData(editExportsData);
		editExports.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						exports.getShell(), "Module", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						exportsList, FrtypesPackage.eINSTANCE.getModule_Exports().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					exportsList = dialog.getResult();
					if (exportsList == null) {
						exportsList = new BasicEList();
					}
					exports.setText(exportsList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartForm.this, FrtypesViewsRepository.Module.Properties.exports, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(exportsList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editExports, FrtypesViewsRepository.Module.Properties.exports);
		EditingUtils.setEEFtype(editExports, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createExportsMultiValuedEditor

		// End of user code
		return parent;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, FrtypesViewsRepository.Module.Properties.name, FrtypesMessages.ModulePropertiesEditionPart_NameLabel);
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
							ModulePropertiesEditionPartForm.this,
							FrtypesViewsRepository.Module.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ModulePropertiesEditionPartForm.this,
									FrtypesViewsRepository.Module.Properties.name,
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
									ModulePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartForm.this, FrtypesViewsRepository.Module.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, FrtypesViewsRepository.Module.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FrtypesViewsRepository.Module.Properties.name, FrtypesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createImportsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.imports = new ReferencesTable(getDescription(FrtypesViewsRepository.Module.Properties.imports, FrtypesMessages.ModulePropertiesEditionPart_ImportsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartForm.this, FrtypesViewsRepository.Module.Properties.imports, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				imports.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartForm.this, FrtypesViewsRepository.Module.Properties.imports, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				imports.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartForm.this, FrtypesViewsRepository.Module.Properties.imports, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				imports.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartForm.this, FrtypesViewsRepository.Module.Properties.imports, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				imports.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.importsFilters) {
			this.imports.addFilter(filter);
		}
		this.imports.setHelpText(propertiesEditionComponent.getHelpContent(FrtypesViewsRepository.Module.Properties.imports, FrtypesViewsRepository.FORM_KIND));
		this.imports.createControls(parent, widgetFactory);
		this.imports.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartForm.this, FrtypesViewsRepository.Module.Properties.imports, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData importsData = new GridData(GridData.FILL_HORIZONTAL);
		importsData.horizontalSpan = 3;
		this.imports.setLayoutData(importsData);
		this.imports.setLowerBound(0);
		this.imports.setUpperBound(-1);
		imports.setID(FrtypesViewsRepository.Module.Properties.imports);
		imports.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createImportsTableComposition

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
	 * @see ccsds.fr.type.model.frtypes.parts.ModulePropertiesEditionPart#initTypeDefinition(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initTypeDefinition(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		typeDefinition.setContentProvider(contentProvider);
		typeDefinition.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(FrtypesViewsRepository.Module.Properties.typeDefinition);
		if (eefElementEditorReadOnlyState && typeDefinition.isEnabled()) {
			typeDefinition.setEnabled(false);
			typeDefinition.setToolTipText(FrtypesMessages.Module_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !typeDefinition.isEnabled()) {
			typeDefinition.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.ModulePropertiesEditionPart#updateTypeDefinition()
	 * 
	 */
	public void updateTypeDefinition() {
	typeDefinition.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.ModulePropertiesEditionPart#addFilterTypeDefinition(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTypeDefinition(ViewerFilter filter) {
		typeDefinitionFilters.add(filter);
		if (this.typeDefinition != null) {
			this.typeDefinition.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.ModulePropertiesEditionPart#addBusinessFilterTypeDefinition(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTypeDefinition(ViewerFilter filter) {
		typeDefinitionBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.ModulePropertiesEditionPart#isContainedInTypeDefinitionTable(EObject element)
	 * 
	 */
	public boolean isContainedInTypeDefinitionTable(EObject element) {
		return ((ReferencesTableSettings)typeDefinition.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.ModulePropertiesEditionPart#getOid()
	 * 
	 */
	public String getOid() {
		return oid.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.ModulePropertiesEditionPart#setOid(String newValue)
	 * 
	 */
	public void setOid(String newValue) {
		if (newValue != null) {
			oid.setText(newValue);
		} else {
			oid.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FrtypesViewsRepository.Module.Properties.oid);
		if (eefElementEditorReadOnlyState && oid.isEnabled()) {
			oid.setEnabled(false);
			oid.setToolTipText(FrtypesMessages.Module_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !oid.isEnabled()) {
			oid.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.ModulePropertiesEditionPart#getExports()
	 * 
	 */
	public EList getExports() {
		return exportsList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.ModulePropertiesEditionPart#setExports(EList newValue)
	 * 
	 */
	public void setExports(EList newValue) {
		exportsList = newValue;
		if (newValue != null) {
			exports.setText(exportsList.toString());
		} else {
			exports.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FrtypesViewsRepository.Module.Properties.exports);
		if (eefElementEditorReadOnlyState && exports.isEnabled()) {
			exports.setEnabled(false);
			exports.setToolTipText(FrtypesMessages.Module_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !exports.isEnabled()) {
			exports.setEnabled(true);
		}	
		
	}

	public void addToExports(Object newValue) {
		exportsList.add(newValue);
		if (newValue != null) {
			exports.setText(exportsList.toString());
		} else {
			exports.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToExports(Object newValue) {
		exportsList.remove(newValue);
		if (newValue != null) {
			exports.setText(exportsList.toString());
		} else {
			exports.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.ModulePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.ModulePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FrtypesViewsRepository.Module.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(FrtypesMessages.Module_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.ModulePropertiesEditionPart#initImports(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initImports(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		imports.setContentProvider(contentProvider);
		imports.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(FrtypesViewsRepository.Module.Properties.imports);
		if (eefElementEditorReadOnlyState && imports.isEnabled()) {
			imports.setEnabled(false);
			imports.setToolTipText(FrtypesMessages.Module_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !imports.isEnabled()) {
			imports.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.ModulePropertiesEditionPart#updateImports()
	 * 
	 */
	public void updateImports() {
	imports.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.ModulePropertiesEditionPart#addFilterImports(ViewerFilter filter)
	 * 
	 */
	public void addFilterToImports(ViewerFilter filter) {
		importsFilters.add(filter);
		if (this.imports != null) {
			this.imports.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.ModulePropertiesEditionPart#addBusinessFilterImports(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToImports(ViewerFilter filter) {
		importsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.ModulePropertiesEditionPart#isContainedInImportsTable(EObject element)
	 * 
	 */
	public boolean isContainedInImportsTable(EObject element) {
		return ((ReferencesTableSettings)imports.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return FrtypesMessages.Module_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
