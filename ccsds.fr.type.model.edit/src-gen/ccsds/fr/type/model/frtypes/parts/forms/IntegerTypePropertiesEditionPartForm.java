/**
 * Generated with Acceleo
 */
package ccsds.fr.type.model.frtypes.parts.forms;

// Start of user code for imports
import ccsds.fr.type.model.frtypes.parts.FrtypesViewsRepository;
import ccsds.fr.type.model.frtypes.parts.IntegerTypePropertiesEditionPart;

import ccsds.fr.type.model.frtypes.providers.FrtypesMessages;

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
public class IntegerTypePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, IntegerTypePropertiesEditionPart {

	protected ReferencesTable rangeConstraint;
	protected List<ViewerFilter> rangeConstraintBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> rangeConstraintFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable namedValues;
	protected List<ViewerFilter> namedValuesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> namedValuesFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public IntegerTypePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public IntegerTypePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence integerTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = integerTypeStep.addStep(FrtypesViewsRepository.IntegerType.Properties.class);
		propertiesStep.addStep(FrtypesViewsRepository.IntegerType.Properties.rangeConstraint);
		propertiesStep.addStep(FrtypesViewsRepository.IntegerType.Properties.namedValues);
		
		
		composer = new PartComposer(integerTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == FrtypesViewsRepository.IntegerType.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == FrtypesViewsRepository.IntegerType.Properties.rangeConstraint) {
					return createRangeConstraintTableComposition(widgetFactory, parent);
				}
				if (key == FrtypesViewsRepository.IntegerType.Properties.namedValues) {
					return createNamedValuesTableComposition(widgetFactory, parent);
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
		propertiesSection.setText(FrtypesMessages.IntegerTypePropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createRangeConstraintTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.rangeConstraint = new ReferencesTable(getDescription(FrtypesViewsRepository.IntegerType.Properties.rangeConstraint, FrtypesMessages.IntegerTypePropertiesEditionPart_RangeConstraintLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntegerTypePropertiesEditionPartForm.this, FrtypesViewsRepository.IntegerType.Properties.rangeConstraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				rangeConstraint.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntegerTypePropertiesEditionPartForm.this, FrtypesViewsRepository.IntegerType.Properties.rangeConstraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				rangeConstraint.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntegerTypePropertiesEditionPartForm.this, FrtypesViewsRepository.IntegerType.Properties.rangeConstraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				rangeConstraint.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntegerTypePropertiesEditionPartForm.this, FrtypesViewsRepository.IntegerType.Properties.rangeConstraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				rangeConstraint.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.rangeConstraintFilters) {
			this.rangeConstraint.addFilter(filter);
		}
		this.rangeConstraint.setHelpText(propertiesEditionComponent.getHelpContent(FrtypesViewsRepository.IntegerType.Properties.rangeConstraint, FrtypesViewsRepository.FORM_KIND));
		this.rangeConstraint.createControls(parent, widgetFactory);
		this.rangeConstraint.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntegerTypePropertiesEditionPartForm.this, FrtypesViewsRepository.IntegerType.Properties.rangeConstraint, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData rangeConstraintData = new GridData(GridData.FILL_HORIZONTAL);
		rangeConstraintData.horizontalSpan = 3;
		this.rangeConstraint.setLayoutData(rangeConstraintData);
		this.rangeConstraint.setLowerBound(0);
		this.rangeConstraint.setUpperBound(-1);
		rangeConstraint.setID(FrtypesViewsRepository.IntegerType.Properties.rangeConstraint);
		rangeConstraint.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createRangeConstraintTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createNamedValuesTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.namedValues = new ReferencesTable(getDescription(FrtypesViewsRepository.IntegerType.Properties.namedValues, FrtypesMessages.IntegerTypePropertiesEditionPart_NamedValuesLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntegerTypePropertiesEditionPartForm.this, FrtypesViewsRepository.IntegerType.Properties.namedValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				namedValues.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntegerTypePropertiesEditionPartForm.this, FrtypesViewsRepository.IntegerType.Properties.namedValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				namedValues.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntegerTypePropertiesEditionPartForm.this, FrtypesViewsRepository.IntegerType.Properties.namedValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				namedValues.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntegerTypePropertiesEditionPartForm.this, FrtypesViewsRepository.IntegerType.Properties.namedValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				namedValues.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.namedValuesFilters) {
			this.namedValues.addFilter(filter);
		}
		this.namedValues.setHelpText(propertiesEditionComponent.getHelpContent(FrtypesViewsRepository.IntegerType.Properties.namedValues, FrtypesViewsRepository.FORM_KIND));
		this.namedValues.createControls(parent, widgetFactory);
		this.namedValues.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntegerTypePropertiesEditionPartForm.this, FrtypesViewsRepository.IntegerType.Properties.namedValues, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData namedValuesData = new GridData(GridData.FILL_HORIZONTAL);
		namedValuesData.horizontalSpan = 3;
		this.namedValues.setLayoutData(namedValuesData);
		this.namedValues.setLowerBound(0);
		this.namedValues.setUpperBound(-1);
		namedValues.setID(FrtypesViewsRepository.IntegerType.Properties.namedValues);
		namedValues.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createNamedValuesTableComposition

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
	 * @see ccsds.fr.type.model.frtypes.parts.IntegerTypePropertiesEditionPart#initRangeConstraint(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initRangeConstraint(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		rangeConstraint.setContentProvider(contentProvider);
		rangeConstraint.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(FrtypesViewsRepository.IntegerType.Properties.rangeConstraint);
		if (eefElementEditorReadOnlyState && rangeConstraint.isEnabled()) {
			rangeConstraint.setEnabled(false);
			rangeConstraint.setToolTipText(FrtypesMessages.IntegerType_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !rangeConstraint.isEnabled()) {
			rangeConstraint.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.IntegerTypePropertiesEditionPart#updateRangeConstraint()
	 * 
	 */
	public void updateRangeConstraint() {
	rangeConstraint.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.IntegerTypePropertiesEditionPart#addFilterRangeConstraint(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRangeConstraint(ViewerFilter filter) {
		rangeConstraintFilters.add(filter);
		if (this.rangeConstraint != null) {
			this.rangeConstraint.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.IntegerTypePropertiesEditionPart#addBusinessFilterRangeConstraint(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRangeConstraint(ViewerFilter filter) {
		rangeConstraintBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.IntegerTypePropertiesEditionPart#isContainedInRangeConstraintTable(EObject element)
	 * 
	 */
	public boolean isContainedInRangeConstraintTable(EObject element) {
		return ((ReferencesTableSettings)rangeConstraint.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.IntegerTypePropertiesEditionPart#initNamedValues(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initNamedValues(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		namedValues.setContentProvider(contentProvider);
		namedValues.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(FrtypesViewsRepository.IntegerType.Properties.namedValues);
		if (eefElementEditorReadOnlyState && namedValues.isEnabled()) {
			namedValues.setEnabled(false);
			namedValues.setToolTipText(FrtypesMessages.IntegerType_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !namedValues.isEnabled()) {
			namedValues.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.IntegerTypePropertiesEditionPart#updateNamedValues()
	 * 
	 */
	public void updateNamedValues() {
	namedValues.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.IntegerTypePropertiesEditionPart#addFilterNamedValues(ViewerFilter filter)
	 * 
	 */
	public void addFilterToNamedValues(ViewerFilter filter) {
		namedValuesFilters.add(filter);
		if (this.namedValues != null) {
			this.namedValues.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.IntegerTypePropertiesEditionPart#addBusinessFilterNamedValues(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToNamedValues(ViewerFilter filter) {
		namedValuesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.IntegerTypePropertiesEditionPart#isContainedInNamedValuesTable(EObject element)
	 * 
	 */
	public boolean isContainedInNamedValuesTable(EObject element) {
		return ((ReferencesTableSettings)namedValues.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return FrtypesMessages.IntegerType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
