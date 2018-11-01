/**
 * Generated with Acceleo
 */
package ccsds.fr.type.model.frtypes.parts.impl;

// Start of user code for imports
import ccsds.fr.type.model.frtypes.FrtypesPackage;

import ccsds.fr.type.model.frtypes.parts.FromModulePropertiesEditionPart;
import ccsds.fr.type.model.frtypes.parts.FrtypesViewsRepository;

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
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

// End of user code

/**
 * 
 * 
 */
public class FromModulePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, FromModulePropertiesEditionPart {

	protected Text name;
	protected Text importedTypes;
	protected Button editImportedTypes;
	protected EList importedTypesList;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public FromModulePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence fromModuleStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = fromModuleStep.addStep(FrtypesViewsRepository.FromModule.Properties.class);
		propertiesStep.addStep(FrtypesViewsRepository.FromModule.Properties.name);
		propertiesStep.addStep(FrtypesViewsRepository.FromModule.Properties.importedTypes);
		
		
		composer = new PartComposer(fromModuleStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == FrtypesViewsRepository.FromModule.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == FrtypesViewsRepository.FromModule.Properties.name) {
					return createNameText(parent);
				}
				if (key == FrtypesViewsRepository.FromModule.Properties.importedTypes) {
					return createImportedTypesMultiValuedEditor(parent);
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
		propertiesGroup.setText(FrtypesMessages.FromModulePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, FrtypesViewsRepository.FromModule.Properties.name, FrtypesMessages.FromModulePropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FromModulePropertiesEditionPartImpl.this, FrtypesViewsRepository.FromModule.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FromModulePropertiesEditionPartImpl.this, FrtypesViewsRepository.FromModule.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, FrtypesViewsRepository.FromModule.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FrtypesViewsRepository.FromModule.Properties.name, FrtypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	protected Composite createImportedTypesMultiValuedEditor(Composite parent) {
		importedTypes = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData importedTypesData = new GridData(GridData.FILL_HORIZONTAL);
		importedTypesData.horizontalSpan = 2;
		importedTypes.setLayoutData(importedTypesData);
		EditingUtils.setID(importedTypes, FrtypesViewsRepository.FromModule.Properties.importedTypes);
		EditingUtils.setEEFtype(importedTypes, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editImportedTypes = new Button(parent, SWT.NONE);
		editImportedTypes.setText(getDescription(FrtypesViewsRepository.FromModule.Properties.importedTypes, FrtypesMessages.FromModulePropertiesEditionPart_ImportedTypesLabel));
		GridData editImportedTypesData = new GridData();
		editImportedTypes.setLayoutData(editImportedTypesData);
		editImportedTypes.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						importedTypes.getShell(), "FromModule", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						importedTypesList, FrtypesPackage.eINSTANCE.getFromModule_ImportedTypes().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					importedTypesList = dialog.getResult();
					if (importedTypesList == null) {
						importedTypesList = new BasicEList();
					}
					importedTypes.setText(importedTypesList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FromModulePropertiesEditionPartImpl.this, FrtypesViewsRepository.FromModule.Properties.importedTypes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(importedTypesList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editImportedTypes, FrtypesViewsRepository.FromModule.Properties.importedTypes);
		EditingUtils.setEEFtype(editImportedTypes, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createImportedTypesMultiValuedEditor

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
	 * @see ccsds.fr.type.model.frtypes.parts.FromModulePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.FromModulePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FrtypesViewsRepository.FromModule.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(FrtypesMessages.FromModule_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.FromModulePropertiesEditionPart#getImportedTypes()
	 * 
	 */
	public EList getImportedTypes() {
		return importedTypesList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.FromModulePropertiesEditionPart#setImportedTypes(EList newValue)
	 * 
	 */
	public void setImportedTypes(EList newValue) {
		importedTypesList = newValue;
		if (newValue != null) {
			importedTypes.setText(importedTypesList.toString());
		} else {
			importedTypes.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FrtypesViewsRepository.FromModule.Properties.importedTypes);
		if (eefElementEditorReadOnlyState && importedTypes.isEnabled()) {
			importedTypes.setEnabled(false);
			importedTypes.setToolTipText(FrtypesMessages.FromModule_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !importedTypes.isEnabled()) {
			importedTypes.setEnabled(true);
		}	
		
	}

	public void addToImportedTypes(Object newValue) {
		importedTypesList.add(newValue);
		if (newValue != null) {
			importedTypes.setText(importedTypesList.toString());
		} else {
			importedTypes.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToImportedTypes(Object newValue) {
		importedTypesList.remove(newValue);
		if (newValue != null) {
			importedTypes.setText(importedTypesList.toString());
		} else {
			importedTypes.setText(""); //$NON-NLS-1$
		}
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return FrtypesMessages.FromModule_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
