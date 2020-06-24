/**
 * Generated with Acceleo
 */
package ccsds.FunctionalResourceModel.parts.impl;

// Start of user code for imports
import ccsds.FunctionalResourceModel.parts.FunctionalResourceModelPropertiesEditionPart;
import ccsds.FunctionalResourceModel.parts.FunctionalResourceModelViewsRepository;

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
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

// End of user code

/**
 * 
 * 
 */
public class FunctionalResourceModelPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, FunctionalResourceModelPropertiesEditionPart {

	protected ReferencesTable functionalResourceStratum;
	protected List<ViewerFilter> functionalResourceStratumBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> functionalResourceStratumFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable functionalResourceSet;
	protected List<ViewerFilter> functionalResourceSetBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> functionalResourceSetFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable functionalResource;
	protected List<ViewerFilter> functionalResourceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> functionalResourceFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public FunctionalResourceModelPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence functionalResourceModel_Step = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = functionalResourceModel_Step.addStep(FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.class);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResourceStratum);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResourceSet);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResource);
		
		
		composer = new PartComposer(functionalResourceModel_Step) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResourceStratum) {
					return createFunctionalResourceStratumAdvancedTableComposition(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResourceSet) {
					return createFunctionalResourceSetAdvancedTableComposition(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResource) {
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
		propertiesGroup.setText(FunctionalResourceModelMessages.FunctionalResourceModelPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createFunctionalResourceStratumAdvancedTableComposition(Composite parent) {
		this.functionalResourceStratum = new ReferencesTable(getDescription(FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResourceStratum, FunctionalResourceModelMessages.FunctionalResourceModelPropertiesEditionPart_FunctionalResourceStratumLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourceModelPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResourceStratum, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				functionalResourceStratum.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourceModelPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResourceStratum, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				functionalResourceStratum.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourceModelPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResourceStratum, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				functionalResourceStratum.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourceModelPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResourceStratum, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				functionalResourceStratum.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.functionalResourceStratumFilters) {
			this.functionalResourceStratum.addFilter(filter);
		}
		this.functionalResourceStratum.setHelpText(propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResourceStratum, FunctionalResourceModelViewsRepository.SWT_KIND));
		this.functionalResourceStratum.createControls(parent);
		this.functionalResourceStratum.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourceModelPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResourceStratum, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData functionalResourceStratumData = new GridData(GridData.FILL_HORIZONTAL);
		functionalResourceStratumData.horizontalSpan = 3;
		this.functionalResourceStratum.setLayoutData(functionalResourceStratumData);
		this.functionalResourceStratum.setLowerBound(0);
		this.functionalResourceStratum.setUpperBound(-1);
		functionalResourceStratum.setID(FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResourceStratum);
		functionalResourceStratum.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createFunctionalResourceStratumAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createFunctionalResourceSetAdvancedTableComposition(Composite parent) {
		this.functionalResourceSet = new ReferencesTable(getDescription(FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResourceSet, FunctionalResourceModelMessages.FunctionalResourceModelPropertiesEditionPart_FunctionalResourceSetLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourceModelPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResourceSet, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				functionalResourceSet.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourceModelPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResourceSet, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				functionalResourceSet.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourceModelPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResourceSet, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				functionalResourceSet.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourceModelPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResourceSet, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				functionalResourceSet.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.functionalResourceSetFilters) {
			this.functionalResourceSet.addFilter(filter);
		}
		this.functionalResourceSet.setHelpText(propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResourceSet, FunctionalResourceModelViewsRepository.SWT_KIND));
		this.functionalResourceSet.createControls(parent);
		this.functionalResourceSet.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourceModelPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResourceSet, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData functionalResourceSetData = new GridData(GridData.FILL_HORIZONTAL);
		functionalResourceSetData.horizontalSpan = 3;
		this.functionalResourceSet.setLayoutData(functionalResourceSetData);
		this.functionalResourceSet.setLowerBound(0);
		this.functionalResourceSet.setUpperBound(-1);
		functionalResourceSet.setID(FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResourceSet);
		functionalResourceSet.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createFunctionalResourceSetAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createFunctionalResourceAdvancedTableComposition(Composite parent) {
		this.functionalResource = new ReferencesTable(getDescription(FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResource, FunctionalResourceModelMessages.FunctionalResourceModelPropertiesEditionPart_FunctionalResourceLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourceModelPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				functionalResource.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourceModelPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				functionalResource.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourceModelPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				functionalResource.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourceModelPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				functionalResource.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.functionalResourceFilters) {
			this.functionalResource.addFilter(filter);
		}
		this.functionalResource.setHelpText(propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResource, FunctionalResourceModelViewsRepository.SWT_KIND));
		this.functionalResource.createControls(parent);
		this.functionalResource.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourceModelPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResource, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData functionalResourceData = new GridData(GridData.FILL_HORIZONTAL);
		functionalResourceData.horizontalSpan = 3;
		this.functionalResource.setLayoutData(functionalResourceData);
		this.functionalResource.setLowerBound(0);
		this.functionalResource.setUpperBound(-1);
		functionalResource.setID(FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResource);
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
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourceModelPropertiesEditionPart#initFunctionalResourceStratum(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initFunctionalResourceStratum(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		functionalResourceStratum.setContentProvider(contentProvider);
		functionalResourceStratum.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResourceStratum);
		if (eefElementEditorReadOnlyState && functionalResourceStratum.isEnabled()) {
			functionalResourceStratum.setEnabled(false);
			functionalResourceStratum.setToolTipText(FunctionalResourceModelMessages.FunctionalResourceModel_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !functionalResourceStratum.isEnabled()) {
			functionalResourceStratum.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourceModelPropertiesEditionPart#updateFunctionalResourceStratum()
	 * 
	 */
	public void updateFunctionalResourceStratum() {
	functionalResourceStratum.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourceModelPropertiesEditionPart#addFilterFunctionalResourceStratum(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFunctionalResourceStratum(ViewerFilter filter) {
		functionalResourceStratumFilters.add(filter);
		if (this.functionalResourceStratum != null) {
			this.functionalResourceStratum.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourceModelPropertiesEditionPart#addBusinessFilterFunctionalResourceStratum(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFunctionalResourceStratum(ViewerFilter filter) {
		functionalResourceStratumBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourceModelPropertiesEditionPart#isContainedInFunctionalResourceStratumTable(EObject element)
	 * 
	 */
	public boolean isContainedInFunctionalResourceStratumTable(EObject element) {
		return ((ReferencesTableSettings)functionalResourceStratum.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourceModelPropertiesEditionPart#initFunctionalResourceSet(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initFunctionalResourceSet(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		functionalResourceSet.setContentProvider(contentProvider);
		functionalResourceSet.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResourceSet);
		if (eefElementEditorReadOnlyState && functionalResourceSet.isEnabled()) {
			functionalResourceSet.setEnabled(false);
			functionalResourceSet.setToolTipText(FunctionalResourceModelMessages.FunctionalResourceModel_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !functionalResourceSet.isEnabled()) {
			functionalResourceSet.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourceModelPropertiesEditionPart#updateFunctionalResourceSet()
	 * 
	 */
	public void updateFunctionalResourceSet() {
	functionalResourceSet.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourceModelPropertiesEditionPart#addFilterFunctionalResourceSet(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFunctionalResourceSet(ViewerFilter filter) {
		functionalResourceSetFilters.add(filter);
		if (this.functionalResourceSet != null) {
			this.functionalResourceSet.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourceModelPropertiesEditionPart#addBusinessFilterFunctionalResourceSet(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFunctionalResourceSet(ViewerFilter filter) {
		functionalResourceSetBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourceModelPropertiesEditionPart#isContainedInFunctionalResourceSetTable(EObject element)
	 * 
	 */
	public boolean isContainedInFunctionalResourceSetTable(EObject element) {
		return ((ReferencesTableSettings)functionalResourceSet.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourceModelPropertiesEditionPart#initFunctionalResource(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initFunctionalResource(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		functionalResource.setContentProvider(contentProvider);
		functionalResource.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResource);
		if (eefElementEditorReadOnlyState && functionalResource.isEnabled()) {
			functionalResource.setEnabled(false);
			functionalResource.setToolTipText(FunctionalResourceModelMessages.FunctionalResourceModel_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !functionalResource.isEnabled()) {
			functionalResource.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourceModelPropertiesEditionPart#updateFunctionalResource()
	 * 
	 */
	public void updateFunctionalResource() {
	functionalResource.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourceModelPropertiesEditionPart#addFilterFunctionalResource(ViewerFilter filter)
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
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourceModelPropertiesEditionPart#addBusinessFilterFunctionalResource(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFunctionalResource(ViewerFilter filter) {
		functionalResourceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourceModelPropertiesEditionPart#isContainedInFunctionalResourceTable(EObject element)
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
		return FunctionalResourceModelMessages.FunctionalResourceModel_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
