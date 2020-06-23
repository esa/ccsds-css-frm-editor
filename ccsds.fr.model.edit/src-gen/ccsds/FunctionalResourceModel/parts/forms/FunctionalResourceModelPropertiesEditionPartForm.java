/**
 * Generated with Acceleo
 */
package ccsds.FunctionalResourceModel.parts.forms;

// Start of user code for imports
import ccsds.FunctionalResourceModel.parts.FunctionalResourceModelPropertiesEditionPart;
import ccsds.FunctionalResourceModel.parts.FunctionalResourceModelViewsRepository;

import ccsds.FunctionalResourceModel.providers.FunctionalResourceModelMessages;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

// End of user code

/**
 * 
 * 
 */
public class FunctionalResourceModelPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, FunctionalResourceModelPropertiesEditionPart {

	protected ReferencesTable functionalResourceSet;
	protected List<ViewerFilter> functionalResourceSetBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> functionalResourceSetFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable functionalResource;
	protected List<ViewerFilter> functionalResourceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> functionalResourceFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable functionalResouceStratum;
	protected List<ViewerFilter> functionalResouceStratumBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> functionalResouceStratumFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public FunctionalResourceModelPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public FunctionalResourceModelPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence functionalResourceModel_Step = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = functionalResourceModel_Step.addStep(FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.class);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResourceSet);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResource);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResouceStratum);
		
		
		composer = new PartComposer(functionalResourceModel_Step) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResourceSet) {
					return createFunctionalResourceSetTableComposition(widgetFactory, parent);
				}
				if (key == FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResource) {
					return createFunctionalResourceTableComposition(widgetFactory, parent);
				}
				if (key == FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResouceStratum) {
					return createFunctionalResouceStratumTableComposition(widgetFactory, parent);
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
		propertiesSection.setText(FunctionalResourceModelMessages.FunctionalResourceModelPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createFunctionalResourceSetTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.functionalResourceSet = new ReferencesTable(getDescription(FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResourceSet, FunctionalResourceModelMessages.FunctionalResourceModelPropertiesEditionPart_FunctionalResourceSetLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourceModelPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResourceSet, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				functionalResourceSet.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourceModelPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResourceSet, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				functionalResourceSet.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourceModelPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResourceSet, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				functionalResourceSet.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourceModelPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResourceSet, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				functionalResourceSet.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.functionalResourceSetFilters) {
			this.functionalResourceSet.addFilter(filter);
		}
		this.functionalResourceSet.setHelpText(propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResourceSet, FunctionalResourceModelViewsRepository.FORM_KIND));
		this.functionalResourceSet.createControls(parent, widgetFactory);
		this.functionalResourceSet.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourceModelPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResourceSet, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
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
		// Start of user code for createFunctionalResourceSetTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createFunctionalResourceTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.functionalResource = new ReferencesTable(getDescription(FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResource, FunctionalResourceModelMessages.FunctionalResourceModelPropertiesEditionPart_FunctionalResourceLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourceModelPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				functionalResource.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourceModelPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				functionalResource.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourceModelPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				functionalResource.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourceModelPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				functionalResource.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.functionalResourceFilters) {
			this.functionalResource.addFilter(filter);
		}
		this.functionalResource.setHelpText(propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResource, FunctionalResourceModelViewsRepository.FORM_KIND));
		this.functionalResource.createControls(parent, widgetFactory);
		this.functionalResource.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourceModelPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResource, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
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
		// Start of user code for createFunctionalResourceTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createFunctionalResouceStratumTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.functionalResouceStratum = new ReferencesTable(getDescription(FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResouceStratum, FunctionalResourceModelMessages.FunctionalResourceModelPropertiesEditionPart_FunctionalResouceStratumLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourceModelPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResouceStratum, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				functionalResouceStratum.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourceModelPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResouceStratum, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				functionalResouceStratum.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourceModelPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResouceStratum, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				functionalResouceStratum.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourceModelPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResouceStratum, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				functionalResouceStratum.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.functionalResouceStratumFilters) {
			this.functionalResouceStratum.addFilter(filter);
		}
		this.functionalResouceStratum.setHelpText(propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResouceStratum, FunctionalResourceModelViewsRepository.FORM_KIND));
		this.functionalResouceStratum.createControls(parent, widgetFactory);
		this.functionalResouceStratum.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourceModelPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResouceStratum, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData functionalResouceStratumData = new GridData(GridData.FILL_HORIZONTAL);
		functionalResouceStratumData.horizontalSpan = 3;
		this.functionalResouceStratum.setLayoutData(functionalResouceStratumData);
		this.functionalResouceStratum.setLowerBound(0);
		this.functionalResouceStratum.setUpperBound(-1);
		functionalResouceStratum.setID(FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResouceStratum);
		functionalResouceStratum.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createFunctionalResouceStratumTableComposition

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
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourceModelPropertiesEditionPart#initFunctionalResouceStratum(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initFunctionalResouceStratum(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		functionalResouceStratum.setContentProvider(contentProvider);
		functionalResouceStratum.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.FunctionalResourceModel_.Properties.functionalResouceStratum);
		if (eefElementEditorReadOnlyState && functionalResouceStratum.isEnabled()) {
			functionalResouceStratum.setEnabled(false);
			functionalResouceStratum.setToolTipText(FunctionalResourceModelMessages.FunctionalResourceModel_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !functionalResouceStratum.isEnabled()) {
			functionalResouceStratum.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourceModelPropertiesEditionPart#updateFunctionalResouceStratum()
	 * 
	 */
	public void updateFunctionalResouceStratum() {
	functionalResouceStratum.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourceModelPropertiesEditionPart#addFilterFunctionalResouceStratum(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFunctionalResouceStratum(ViewerFilter filter) {
		functionalResouceStratumFilters.add(filter);
		if (this.functionalResouceStratum != null) {
			this.functionalResouceStratum.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourceModelPropertiesEditionPart#addBusinessFilterFunctionalResouceStratum(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFunctionalResouceStratum(ViewerFilter filter) {
		functionalResouceStratumBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourceModelPropertiesEditionPart#isContainedInFunctionalResouceStratumTable(EObject element)
	 * 
	 */
	public boolean isContainedInFunctionalResouceStratumTable(EObject element) {
		return ((ReferencesTableSettings)functionalResouceStratum.getInput()).contains(element);
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
