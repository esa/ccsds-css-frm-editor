/**
 * Generated with Acceleo
 */
package ccsds.FunctionalResourceModel.parts.impl;

// Start of user code for imports
import ccsds.FunctionalResourceModel.parts.FunctionalResourceModelViewsRepository;
import ccsds.FunctionalResourceModel.parts.FunctionalResourceSetPropertiesEditionPart;

import ccsds.FunctionalResourceModel.providers.FunctionalResourceModelMessages;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

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

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

// End of user code

/**
 * 
 * 
 */
public class FunctionalResourceSetPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, FunctionalResourceSetPropertiesEditionPart {

	protected Text name;
	protected ReferencesTable functionalResource;
	protected List<ViewerFilter> functionalResourceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> functionalResourceFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public FunctionalResourceSetPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence functionalResourceSetStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = functionalResourceSetStep.addStep(FunctionalResourceModelViewsRepository.FunctionalResourceSet.Properties.class);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.FunctionalResourceSet.Properties.name);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.FunctionalResourceSet.Properties.functionalResource);
		
		
		composer = new PartComposer(functionalResourceSetStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == FunctionalResourceModelViewsRepository.FunctionalResourceSet.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.FunctionalResourceSet.Properties.name) {
					return createNameText(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.FunctionalResourceSet.Properties.functionalResource) {
					return createFunctionalResourceAdvancedTableComposition(parent);
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
		propertiesGroup.setText(FunctionalResourceModelMessages.FunctionalResourceSetPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.FunctionalResourceSet.Properties.name, FunctionalResourceModelMessages.FunctionalResourceSetPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourceSetPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResourceSet.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourceSetPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResourceSet.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, FunctionalResourceModelViewsRepository.FunctionalResourceSet.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.FunctionalResourceSet.Properties.name, FunctionalResourceModelViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createFunctionalResourceAdvancedTableComposition(Composite parent) {
		this.functionalResource = new ReferencesTable(getDescription(FunctionalResourceModelViewsRepository.FunctionalResourceSet.Properties.functionalResource, FunctionalResourceModelMessages.FunctionalResourceSetPropertiesEditionPart_FunctionalResourceLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourceSetPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResourceSet.Properties.functionalResource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				functionalResource.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourceSetPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResourceSet.Properties.functionalResource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				functionalResource.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourceSetPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResourceSet.Properties.functionalResource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				functionalResource.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourceSetPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResourceSet.Properties.functionalResource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				functionalResource.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.functionalResourceFilters) {
			this.functionalResource.addFilter(filter);
		}
		this.functionalResource.setHelpText(propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.FunctionalResourceSet.Properties.functionalResource, FunctionalResourceModelViewsRepository.SWT_KIND));
		this.functionalResource.createControls(parent);
		this.functionalResource.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourceSetPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResourceSet.Properties.functionalResource, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData functionalResourceData = new GridData(GridData.FILL_HORIZONTAL);
		functionalResourceData.horizontalSpan = 3;
		this.functionalResource.setLayoutData(functionalResourceData);
		this.functionalResource.setLowerBound(0);
		this.functionalResource.setUpperBound(-1);
		functionalResource.setID(FunctionalResourceModelViewsRepository.FunctionalResourceSet.Properties.functionalResource);
		functionalResource.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createFunctionalResourceAdvancedTableComposition

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
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourceSetPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourceSetPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.FunctionalResourceSet.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(FunctionalResourceModelMessages.FunctionalResourceSet_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourceSetPropertiesEditionPart#initFunctionalResource(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initFunctionalResource(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		functionalResource.setContentProvider(contentProvider);
		functionalResource.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.FunctionalResourceSet.Properties.functionalResource);
		if (eefElementEditorReadOnlyState && functionalResource.isEnabled()) {
			functionalResource.setEnabled(false);
			functionalResource.setToolTipText(FunctionalResourceModelMessages.FunctionalResourceSet_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !functionalResource.isEnabled()) {
			functionalResource.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourceSetPropertiesEditionPart#updateFunctionalResource()
	 * 
	 */
	public void updateFunctionalResource() {
	functionalResource.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourceSetPropertiesEditionPart#addFilterFunctionalResource(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFunctionalResource(ViewerFilter filter) {
		functionalResourceFilters.add(filter);
		if (this.functionalResource != null) {
			this.functionalResource.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourceSetPropertiesEditionPart#addBusinessFilterFunctionalResource(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFunctionalResource(ViewerFilter filter) {
		functionalResourceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourceSetPropertiesEditionPart#isContainedInFunctionalResourceTable(EObject element)
	 * 
	 */
	public boolean isContainedInFunctionalResourceTable(EObject element) {
		return ((ReferencesTableSettings)functionalResource.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return FunctionalResourceModelMessages.FunctionalResourceSet_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
