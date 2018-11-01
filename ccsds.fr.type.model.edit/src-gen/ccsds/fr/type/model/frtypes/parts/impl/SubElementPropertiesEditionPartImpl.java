/**
 * Generated with Acceleo
 */
package ccsds.fr.type.model.frtypes.parts.impl;

// Start of user code for imports
import ccsds.fr.type.model.frtypes.parts.FrtypesViewsRepository;
import ccsds.fr.type.model.frtypes.parts.SubElementPropertiesEditionPart;

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
public class SubElementPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, SubElementPropertiesEditionPart {

	protected Text name;
	protected Text tag;
	protected Button optional;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SubElementPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence subElementStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = subElementStep.addStep(FrtypesViewsRepository.SubElement.Properties.class);
		propertiesStep.addStep(FrtypesViewsRepository.SubElement.Properties.name);
		propertiesStep.addStep(FrtypesViewsRepository.SubElement.Properties.tag);
		propertiesStep.addStep(FrtypesViewsRepository.SubElement.Properties.optional);
		
		
		composer = new PartComposer(subElementStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == FrtypesViewsRepository.SubElement.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == FrtypesViewsRepository.SubElement.Properties.name) {
					return createNameText(parent);
				}
				if (key == FrtypesViewsRepository.SubElement.Properties.tag) {
					return createTagText(parent);
				}
				if (key == FrtypesViewsRepository.SubElement.Properties.optional) {
					return createOptionalCheckbox(parent);
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
		propertiesGroup.setText(FrtypesMessages.SubElementPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, FrtypesViewsRepository.SubElement.Properties.name, FrtypesMessages.SubElementPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubElementPropertiesEditionPartImpl.this, FrtypesViewsRepository.SubElement.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubElementPropertiesEditionPartImpl.this, FrtypesViewsRepository.SubElement.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, FrtypesViewsRepository.SubElement.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FrtypesViewsRepository.SubElement.Properties.name, FrtypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createTagText(Composite parent) {
		createDescription(parent, FrtypesViewsRepository.SubElement.Properties.tag, FrtypesMessages.SubElementPropertiesEditionPart_TagLabel);
		tag = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData tagData = new GridData(GridData.FILL_HORIZONTAL);
		tag.setLayoutData(tagData);
		tag.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubElementPropertiesEditionPartImpl.this, FrtypesViewsRepository.SubElement.Properties.tag, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, tag.getText()));
			}

		});
		tag.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubElementPropertiesEditionPartImpl.this, FrtypesViewsRepository.SubElement.Properties.tag, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, tag.getText()));
				}
			}

		});
		EditingUtils.setID(tag, FrtypesViewsRepository.SubElement.Properties.tag);
		EditingUtils.setEEFtype(tag, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FrtypesViewsRepository.SubElement.Properties.tag, FrtypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTagText

		// End of user code
		return parent;
	}

	
	protected Composite createOptionalCheckbox(Composite parent) {
		optional = new Button(parent, SWT.CHECK);
		optional.setText(getDescription(FrtypesViewsRepository.SubElement.Properties.optional, FrtypesMessages.SubElementPropertiesEditionPart_OptionalLabel));
		optional.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubElementPropertiesEditionPartImpl.this, FrtypesViewsRepository.SubElement.Properties.optional, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(optional.getSelection())));
			}

		});
		GridData optionalData = new GridData(GridData.FILL_HORIZONTAL);
		optionalData.horizontalSpan = 2;
		optional.setLayoutData(optionalData);
		EditingUtils.setID(optional, FrtypesViewsRepository.SubElement.Properties.optional);
		EditingUtils.setEEFtype(optional, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FrtypesViewsRepository.SubElement.Properties.optional, FrtypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createOptionalCheckbox

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
	 * @see ccsds.fr.type.model.frtypes.parts.SubElementPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.SubElementPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FrtypesViewsRepository.SubElement.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(FrtypesMessages.SubElement_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.SubElementPropertiesEditionPart#getTag()
	 * 
	 */
	public String getTag() {
		return tag.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.SubElementPropertiesEditionPart#setTag(String newValue)
	 * 
	 */
	public void setTag(String newValue) {
		if (newValue != null) {
			tag.setText(newValue);
		} else {
			tag.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FrtypesViewsRepository.SubElement.Properties.tag);
		if (eefElementEditorReadOnlyState && tag.isEnabled()) {
			tag.setEnabled(false);
			tag.setToolTipText(FrtypesMessages.SubElement_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !tag.isEnabled()) {
			tag.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.SubElementPropertiesEditionPart#getOptional()
	 * 
	 */
	public Boolean getOptional() {
		return Boolean.valueOf(optional.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.SubElementPropertiesEditionPart#setOptional(Boolean newValue)
	 * 
	 */
	public void setOptional(Boolean newValue) {
		if (newValue != null) {
			optional.setSelection(newValue.booleanValue());
		} else {
			optional.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FrtypesViewsRepository.SubElement.Properties.optional);
		if (eefElementEditorReadOnlyState && optional.isEnabled()) {
			optional.setEnabled(false);
			optional.setToolTipText(FrtypesMessages.SubElement_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !optional.isEnabled()) {
			optional.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return FrtypesMessages.SubElement_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
