/**
 * Generated with Acceleo
 */
package ccsds.fr.type.model.frtypes.parts.forms;

// Start of user code for imports
import ccsds.fr.type.model.frtypes.parts.FrtypesViewsRepository;
import ccsds.fr.type.model.frtypes.parts.TypeReferenceLocalPropertiesEditionPart;

import ccsds.fr.type.model.frtypes.providers.FrtypesMessages;

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

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

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
public class TypeReferenceLocalPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, TypeReferenceLocalPropertiesEditionPart {

	protected EObjectFlatComboViewer typeDefinition;



	/**
	 * For {@link ISection} use only.
	 */
	public TypeReferenceLocalPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TypeReferenceLocalPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence typeReferenceLocalStep = new BindingCompositionSequence(propertiesEditionComponent);
		typeReferenceLocalStep
			.addStep(FrtypesViewsRepository.TypeReferenceLocal.Properties.class)
			.addStep(FrtypesViewsRepository.TypeReferenceLocal.Properties.typeDefinition);
		
		
		composer = new PartComposer(typeReferenceLocalStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == FrtypesViewsRepository.TypeReferenceLocal.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == FrtypesViewsRepository.TypeReferenceLocal.Properties.typeDefinition) {
					return createTypeDefinitionFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(FrtypesMessages.TypeReferenceLocalPropertiesEditionPart_PropertiesGroupLabel);
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
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createTypeDefinitionFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, FrtypesViewsRepository.TypeReferenceLocal.Properties.typeDefinition, FrtypesMessages.TypeReferenceLocalPropertiesEditionPart_TypeDefinitionLabel);
		typeDefinition = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(FrtypesViewsRepository.TypeReferenceLocal.Properties.typeDefinition, FrtypesViewsRepository.FORM_KIND));
		widgetFactory.adapt(typeDefinition);
		typeDefinition.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData typeDefinitionData = new GridData(GridData.FILL_HORIZONTAL);
		typeDefinition.setLayoutData(typeDefinitionData);
		typeDefinition.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypeReferenceLocalPropertiesEditionPartForm.this, FrtypesViewsRepository.TypeReferenceLocal.Properties.typeDefinition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTypeDefinition()));
			}

		});
		typeDefinition.setID(FrtypesViewsRepository.TypeReferenceLocal.Properties.typeDefinition);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FrtypesViewsRepository.TypeReferenceLocal.Properties.typeDefinition, FrtypesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTypeDefinitionFlatComboViewer

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
	 * @see ccsds.fr.type.model.frtypes.parts.TypeReferenceLocalPropertiesEditionPart#getTypeDefinition()
	 * 
	 */
	public EObject getTypeDefinition() {
		if (typeDefinition.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) typeDefinition.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.TypeReferenceLocalPropertiesEditionPart#initTypeDefinition(EObjectFlatComboSettings)
	 */
	public void initTypeDefinition(EObjectFlatComboSettings settings) {
		typeDefinition.setInput(settings);
		if (current != null) {
			typeDefinition.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FrtypesViewsRepository.TypeReferenceLocal.Properties.typeDefinition);
		if (eefElementEditorReadOnlyState && typeDefinition.isEnabled()) {
			typeDefinition.setEnabled(false);
			typeDefinition.setToolTipText(FrtypesMessages.TypeReferenceLocal_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !typeDefinition.isEnabled()) {
			typeDefinition.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.TypeReferenceLocalPropertiesEditionPart#setTypeDefinition(EObject newValue)
	 * 
	 */
	public void setTypeDefinition(EObject newValue) {
		if (newValue != null) {
			typeDefinition.setSelection(new StructuredSelection(newValue));
		} else {
			typeDefinition.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FrtypesViewsRepository.TypeReferenceLocal.Properties.typeDefinition);
		if (eefElementEditorReadOnlyState && typeDefinition.isEnabled()) {
			typeDefinition.setEnabled(false);
			typeDefinition.setToolTipText(FrtypesMessages.TypeReferenceLocal_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !typeDefinition.isEnabled()) {
			typeDefinition.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.TypeReferenceLocalPropertiesEditionPart#setTypeDefinitionButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTypeDefinitionButtonMode(ButtonsModeEnum newValue) {
		typeDefinition.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.TypeReferenceLocalPropertiesEditionPart#addFilterTypeDefinition(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTypeDefinition(ViewerFilter filter) {
		typeDefinition.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.TypeReferenceLocalPropertiesEditionPart#addBusinessFilterTypeDefinition(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTypeDefinition(ViewerFilter filter) {
		typeDefinition.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return FrtypesMessages.TypeReferenceLocal_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
