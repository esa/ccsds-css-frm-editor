/**
 * Generated with Acceleo
 */
package ccsds.fr.type.model.frtypes.parts.forms;

// Start of user code for imports
import ccsds.fr.type.model.frtypes.parts.FrtypesViewsRepository;
import ccsds.fr.type.model.frtypes.parts.SequenceOfPropertiesEditionPart;

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
public class SequenceOfPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, SequenceOfPropertiesEditionPart {

	protected ReferencesTable sizeConstraint;
	protected List<ViewerFilter> sizeConstraintBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> sizeConstraintFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public SequenceOfPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SequenceOfPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence sequenceOfStep = new BindingCompositionSequence(propertiesEditionComponent);
		sequenceOfStep
			.addStep(FrtypesViewsRepository.SequenceOf.Properties.class)
			.addStep(FrtypesViewsRepository.SequenceOf.Properties.sizeConstraint);
		
		
		composer = new PartComposer(sequenceOfStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == FrtypesViewsRepository.SequenceOf.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == FrtypesViewsRepository.SequenceOf.Properties.sizeConstraint) {
					return createSizeConstraintTableComposition(widgetFactory, parent);
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
		propertiesSection.setText(FrtypesMessages.SequenceOfPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createSizeConstraintTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.sizeConstraint = new ReferencesTable(getDescription(FrtypesViewsRepository.SequenceOf.Properties.sizeConstraint, FrtypesMessages.SequenceOfPropertiesEditionPart_SizeConstraintLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SequenceOfPropertiesEditionPartForm.this, FrtypesViewsRepository.SequenceOf.Properties.sizeConstraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				sizeConstraint.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SequenceOfPropertiesEditionPartForm.this, FrtypesViewsRepository.SequenceOf.Properties.sizeConstraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				sizeConstraint.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SequenceOfPropertiesEditionPartForm.this, FrtypesViewsRepository.SequenceOf.Properties.sizeConstraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				sizeConstraint.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SequenceOfPropertiesEditionPartForm.this, FrtypesViewsRepository.SequenceOf.Properties.sizeConstraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				sizeConstraint.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.sizeConstraintFilters) {
			this.sizeConstraint.addFilter(filter);
		}
		this.sizeConstraint.setHelpText(propertiesEditionComponent.getHelpContent(FrtypesViewsRepository.SequenceOf.Properties.sizeConstraint, FrtypesViewsRepository.FORM_KIND));
		this.sizeConstraint.createControls(parent, widgetFactory);
		this.sizeConstraint.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SequenceOfPropertiesEditionPartForm.this, FrtypesViewsRepository.SequenceOf.Properties.sizeConstraint, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData sizeConstraintData = new GridData(GridData.FILL_HORIZONTAL);
		sizeConstraintData.horizontalSpan = 3;
		this.sizeConstraint.setLayoutData(sizeConstraintData);
		this.sizeConstraint.setLowerBound(0);
		this.sizeConstraint.setUpperBound(-1);
		sizeConstraint.setID(FrtypesViewsRepository.SequenceOf.Properties.sizeConstraint);
		sizeConstraint.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createSizeConstraintTableComposition

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
	 * @see ccsds.fr.type.model.frtypes.parts.SequenceOfPropertiesEditionPart#initSizeConstraint(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initSizeConstraint(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		sizeConstraint.setContentProvider(contentProvider);
		sizeConstraint.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(FrtypesViewsRepository.SequenceOf.Properties.sizeConstraint);
		if (eefElementEditorReadOnlyState && sizeConstraint.isEnabled()) {
			sizeConstraint.setEnabled(false);
			sizeConstraint.setToolTipText(FrtypesMessages.SequenceOf_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sizeConstraint.isEnabled()) {
			sizeConstraint.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.SequenceOfPropertiesEditionPart#updateSizeConstraint()
	 * 
	 */
	public void updateSizeConstraint() {
	sizeConstraint.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.SequenceOfPropertiesEditionPart#addFilterSizeConstraint(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSizeConstraint(ViewerFilter filter) {
		sizeConstraintFilters.add(filter);
		if (this.sizeConstraint != null) {
			this.sizeConstraint.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.SequenceOfPropertiesEditionPart#addBusinessFilterSizeConstraint(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSizeConstraint(ViewerFilter filter) {
		sizeConstraintBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.SequenceOfPropertiesEditionPart#isContainedInSizeConstraintTable(EObject element)
	 * 
	 */
	public boolean isContainedInSizeConstraintTable(EObject element) {
		return ((ReferencesTableSettings)sizeConstraint.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return FrtypesMessages.SequenceOf_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
