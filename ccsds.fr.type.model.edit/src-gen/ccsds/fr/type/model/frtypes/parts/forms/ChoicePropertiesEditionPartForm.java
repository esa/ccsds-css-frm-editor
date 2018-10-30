/**
 * Generated with Acceleo
 */
package ccsds.fr.type.model.frtypes.parts.forms;

// Start of user code for imports
import ccsds.fr.type.model.frtypes.parts.ChoicePropertiesEditionPart;
import ccsds.fr.type.model.frtypes.parts.FrtypesViewsRepository;

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
public class ChoicePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, ChoicePropertiesEditionPart {

	protected ReferencesTable components;
	protected List<ViewerFilter> componentsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> componentsFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public ChoicePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ChoicePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence choiceStep = new BindingCompositionSequence(propertiesEditionComponent);
		choiceStep
			.addStep(FrtypesViewsRepository.Choice.Properties.class)
			.addStep(FrtypesViewsRepository.Choice.Properties.components);
		
		
		composer = new PartComposer(choiceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == FrtypesViewsRepository.Choice.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == FrtypesViewsRepository.Choice.Properties.components) {
					return createComponentsTableComposition(widgetFactory, parent);
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
		propertiesSection.setText(FrtypesMessages.ChoicePropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createComponentsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.components = new ReferencesTable(getDescription(FrtypesViewsRepository.Choice.Properties.components, FrtypesMessages.ChoicePropertiesEditionPart_ComponentsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChoicePropertiesEditionPartForm.this, FrtypesViewsRepository.Choice.Properties.components, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				components.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChoicePropertiesEditionPartForm.this, FrtypesViewsRepository.Choice.Properties.components, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				components.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChoicePropertiesEditionPartForm.this, FrtypesViewsRepository.Choice.Properties.components, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				components.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChoicePropertiesEditionPartForm.this, FrtypesViewsRepository.Choice.Properties.components, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				components.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.componentsFilters) {
			this.components.addFilter(filter);
		}
		this.components.setHelpText(propertiesEditionComponent.getHelpContent(FrtypesViewsRepository.Choice.Properties.components, FrtypesViewsRepository.FORM_KIND));
		this.components.createControls(parent, widgetFactory);
		this.components.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChoicePropertiesEditionPartForm.this, FrtypesViewsRepository.Choice.Properties.components, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData componentsData = new GridData(GridData.FILL_HORIZONTAL);
		componentsData.horizontalSpan = 3;
		this.components.setLayoutData(componentsData);
		this.components.setLowerBound(1);
		this.components.setUpperBound(-1);
		components.setID(FrtypesViewsRepository.Choice.Properties.components);
		components.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createComponentsTableComposition

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
	 * @see ccsds.fr.type.model.frtypes.parts.ChoicePropertiesEditionPart#initComponents(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initComponents(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		components.setContentProvider(contentProvider);
		components.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(FrtypesViewsRepository.Choice.Properties.components);
		if (eefElementEditorReadOnlyState && components.isEnabled()) {
			components.setEnabled(false);
			components.setToolTipText(FrtypesMessages.Choice_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !components.isEnabled()) {
			components.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.ChoicePropertiesEditionPart#updateComponents()
	 * 
	 */
	public void updateComponents() {
	components.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.ChoicePropertiesEditionPart#addFilterComponents(ViewerFilter filter)
	 * 
	 */
	public void addFilterToComponents(ViewerFilter filter) {
		componentsFilters.add(filter);
		if (this.components != null) {
			this.components.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.ChoicePropertiesEditionPart#addBusinessFilterComponents(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToComponents(ViewerFilter filter) {
		componentsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.ChoicePropertiesEditionPart#isContainedInComponentsTable(EObject element)
	 * 
	 */
	public boolean isContainedInComponentsTable(EObject element) {
		return ((ReferencesTableSettings)components.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return FrtypesMessages.Choice_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
