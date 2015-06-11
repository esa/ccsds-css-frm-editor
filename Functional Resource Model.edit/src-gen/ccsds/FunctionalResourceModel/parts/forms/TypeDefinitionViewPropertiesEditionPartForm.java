/**
 * Generated with Acceleo
 */
package ccsds.FunctionalResourceModel.parts.forms;

// Start of user code for imports
import ccsds.FunctionalResourceModel.parts.FunctionalResourceModelViewsRepository;
import ccsds.FunctionalResourceModel.parts.TypeDefinitionViewPropertiesEditionPart;
import ccsds.FunctionalResourceModel.providers.FunctionalResourceModelMessages;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

// End of user code

/**
 * 
 * 
 */
public class TypeDefinitionViewPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, TypeDefinitionViewPropertiesEditionPart {

	protected Text typeDefinitionRichText;



	/**
	 * For {@link ISection} use only.
	 */
	public TypeDefinitionViewPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TypeDefinitionViewPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence typeDefinitionViewStep = new BindingCompositionSequence(propertiesEditionComponent);
		typeDefinitionViewStep.addStep(FunctionalResourceModelViewsRepository.TypeDefinitionView.typeDefinitionRichText);
		
		composer = new PartComposer(typeDefinitionViewStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == FunctionalResourceModelViewsRepository.TypeDefinitionView.typeDefinitionRichText) {
					return createTypeDefinitionRichTextTextarea(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	
	protected Composite createTypeDefinitionRichTextTextarea(FormToolkit widgetFactory, Composite parent) {
		Label typeDefinitionRichTextLabel = createDescription(parent, FunctionalResourceModelViewsRepository.TypeDefinitionView.typeDefinitionRichText, FunctionalResourceModelMessages.TypeDefinitionViewPropertiesEditionPart_TypeDefinitionRichTextLabel);
		GridData typeDefinitionRichTextLabelData = new GridData(GridData.FILL_HORIZONTAL);
		typeDefinitionRichTextLabelData.horizontalSpan = 3;
		typeDefinitionRichTextLabel.setLayoutData(typeDefinitionRichTextLabelData);
		typeDefinitionRichText = widgetFactory.createText(parent, "", SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL); //$NON-NLS-1$
		GridData typeDefinitionRichTextData = new GridData(GridData.FILL_HORIZONTAL);
		typeDefinitionRichTextData.horizontalSpan = 2;
		typeDefinitionRichTextData.heightHint = 80;
		typeDefinitionRichTextData.widthHint = 200;
		typeDefinitionRichText.setLayoutData(typeDefinitionRichTextData);
		typeDefinitionRichText.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TypeDefinitionViewPropertiesEditionPartForm.this,
							FunctionalResourceModelViewsRepository.TypeDefinitionView.typeDefinitionRichText,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, typeDefinitionRichText.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TypeDefinitionViewPropertiesEditionPartForm.this,
									FunctionalResourceModelViewsRepository.TypeDefinitionView.typeDefinitionRichText,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, typeDefinitionRichText.getText()));
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
									TypeDefinitionViewPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		EditingUtils.setID(typeDefinitionRichText, FunctionalResourceModelViewsRepository.TypeDefinitionView.typeDefinitionRichText);
		EditingUtils.setEEFtype(typeDefinitionRichText, "eef::Textarea"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.TypeDefinitionView.typeDefinitionRichText, FunctionalResourceModelViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTypeDefinitionRichTextTextArea

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
	 * @see ccsds.FunctionalResourceModel.parts.TypeDefinitionViewPropertiesEditionPart#getTypeDefinitionRichText()
	 * 
	 */
	public String getTypeDefinitionRichText() {
		return typeDefinitionRichText.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.TypeDefinitionViewPropertiesEditionPart#setTypeDefinitionRichText(String newValue)
	 * 
	 */
	public void setTypeDefinitionRichText(String newValue) {
		if (newValue != null) {
			typeDefinitionRichText.setText(newValue);
		} else {
			typeDefinitionRichText.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.TypeDefinitionView.typeDefinitionRichText);
		if (eefElementEditorReadOnlyState && typeDefinitionRichText.isEnabled()) {
			typeDefinitionRichText.setEnabled(false);
			typeDefinitionRichText.setBackground(typeDefinitionRichText.getDisplay().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND));
			typeDefinitionRichText.setToolTipText(FunctionalResourceModelMessages.TypeDefinitionView_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !typeDefinitionRichText.isEnabled()) {
			typeDefinitionRichText.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return FunctionalResourceModelMessages.TypeDefinitionView_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
