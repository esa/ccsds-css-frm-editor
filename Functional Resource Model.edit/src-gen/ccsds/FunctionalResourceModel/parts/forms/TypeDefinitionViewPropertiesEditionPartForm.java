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
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.richtext.actions.EEFFontNameAction;
import org.eclipse.emf.eef.runtime.ui.widgets.richtext.actions.EEFFontSizeAction;
import org.eclipse.emf.eef.runtime.ui.widgets.richtext.actions.EEFFontStyleAction;
import org.eclipse.epf.richtext.IRichText;
import org.eclipse.epf.richtext.IRichTextToolBar;
import org.eclipse.epf.richtext.RichText;
import org.eclipse.epf.richtext.RichTextToolBar;
import org.eclipse.epf.richtext.actions.AddImageAction;
import org.eclipse.epf.richtext.actions.AddLinkAction;
import org.eclipse.epf.richtext.actions.AddOrderedListAction;
import org.eclipse.epf.richtext.actions.AddTableAction;
import org.eclipse.epf.richtext.actions.AddUnorderedListAction;
import org.eclipse.epf.richtext.actions.BoldAction;
import org.eclipse.epf.richtext.actions.ClearContentAction;
import org.eclipse.epf.richtext.actions.CopyAction;
import org.eclipse.epf.richtext.actions.CutAction;
import org.eclipse.epf.richtext.actions.FindReplaceAction;
import org.eclipse.epf.richtext.actions.IndentAction;
import org.eclipse.epf.richtext.actions.ItalicAction;
import org.eclipse.epf.richtext.actions.JustifyCenterAction;
import org.eclipse.epf.richtext.actions.JustifyLeftAction;
import org.eclipse.epf.richtext.actions.JustifyRightAction;
import org.eclipse.epf.richtext.actions.OutdentAction;
import org.eclipse.epf.richtext.actions.PasteAction;
import org.eclipse.epf.richtext.actions.SubscriptAction;
import org.eclipse.epf.richtext.actions.SuperscriptAction;
import org.eclipse.epf.richtext.actions.TidyActionGroup;
import org.eclipse.epf.richtext.actions.UnderlineAction;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

// End of user code

/**
 * 
 * 
 */
public class TypeDefinitionViewPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, TypeDefinitionViewPropertiesEditionPart {

	protected RichText typeDefinitionRichText;



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
					return createTypeDefinitionRichTextRichText(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	
	protected Composite createTypeDefinitionRichTextRichText(FormToolkit widgetFactory, Composite parent) {
		Label typeDefinitionRichTextLabel = createDescription(parent, FunctionalResourceModelViewsRepository.TypeDefinitionView.typeDefinitionRichText, FunctionalResourceModelMessages.TypeDefinitionViewPropertiesEditionPart_TypeDefinitionRichTextLabel);
		GridData typeDefinitionRichTextLabelData = new GridData(GridData.FILL_HORIZONTAL);
		typeDefinitionRichTextLabelData.horizontalSpan = 2;
		typeDefinitionRichTextLabel.setLayoutData(typeDefinitionRichTextLabelData);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.TypeDefinitionView.typeDefinitionRichText, FunctionalResourceModelViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		Composite toolbarContainer = widgetFactory.createComposite(parent);
		toolbarContainer.setLayout(new GridLayout(2, false));
		GridData toolbarData = new GridData(GridData.FILL_HORIZONTAL);
		toolbarData.horizontalSpan = 3;
		toolbarData.widthHint = 200;
		toolbarContainer.setLayoutData(toolbarData);
		RichTextToolBar toolBar = new RichTextToolBar(toolbarContainer, SWT.NONE, typeDefinitionRichText);
		typeDefinitionRichText = new RichText(parent, SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL); //$NON-NLS-1$
		typeDefinitionRichText.setEditable(true);
		GridData typeDefinitionRichTextData = new GridData(GridData.FILL_HORIZONTAL);
		typeDefinitionRichTextData.horizontalSpan = 3;
		typeDefinitionRichTextData.heightHint = 400;
		typeDefinitionRichTextData.widthHint = 200;
		typeDefinitionRichText.setLayoutData(typeDefinitionRichTextData);

		typeDefinitionRichText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				propertiesEditionComponent.delayedFirePropertiesChanged(new PropertiesEditionEvent(TypeDefinitionViewPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.TypeDefinitionView.typeDefinitionRichText, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, typeDefinitionRichText.getText()));
			}
		});

		fillToolBar(toolBar, typeDefinitionRichText);
		return parent;
	}

	/**
	 * Populate actions in the Toolbar to link with the RichText
	 * 
	 * @param toolBar The IRichTextToolBar
	 * @param richText The IRichText
	 */
	private void fillToolBar(IRichTextToolBar toolBar, IRichText richText) {
				toolBar.addAction(new EEFFontStyleAction(richText));
				toolBar.addAction(new EEFFontNameAction(richText));
				toolBar.addAction(new EEFFontSizeAction(richText));
				toolBar.addSeparator();
				toolBar.addAction(new CutAction(richText));
				toolBar.addAction(new CopyAction(richText));
				toolBar.addAction(new PasteAction(richText));
				toolBar.addSeparator();
				toolBar.addAction(new ClearContentAction(richText));
				toolBar.addSeparator();
				toolBar.addAction(new BoldAction(richText));
				toolBar.addAction(new ItalicAction(richText));
				toolBar.addAction(new UnderlineAction(richText));
				toolBar.addSeparator();
				toolBar.addAction(new SubscriptAction(richText));
				toolBar.addAction(new SuperscriptAction(richText));
				toolBar.addSeparator();
				toolBar.addAction(new TidyActionGroup(richText));
				toolBar.addSeparator();
				toolBar.addAction(new AddOrderedListAction(richText));
				toolBar.addAction(new AddUnorderedListAction(richText));
				toolBar.addSeparator();
				toolBar.addAction(new OutdentAction(richText));
				toolBar.addAction(new IndentAction(richText));
				toolBar.addSeparator();
				toolBar.addAction(new JustifyLeftAction(richText));
				toolBar.addAction(new JustifyCenterAction(richText));
				toolBar.addAction(new JustifyRightAction(richText));
				toolBar.addSeparator();
				toolBar.addAction(new FindReplaceAction(richText) {
					/**
					 * @see org.eclipse.epf.richtext.actions.FindReplaceAction#execute(org.eclipse.epf.richtext.IRichText)
					 */
					public void execute(IRichText rText) {
						rText.getFindReplaceAction().execute(rText);
					}
				});
				toolBar.addSeparator();
				toolBar.addAction(new AddLinkAction(richText));
				toolBar.addAction(new AddImageAction(richText));
				toolBar.addSeparator();
				toolBar.addAction(new AddTableAction(richText));
		
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
//		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.TypeDefinitionView.typeDefinitionRichText);
//		if (eefElementEditorReadOnlyState && typeDefinitionRichText.isEnabled()) {
//			typeDefinitionRichText.setEnabled(false);
//			typeDefinitionRichText.setToolTipText(FunctionalResourceModelMessages.TypeDefinitionView_ReadOnly);
//		} else if (!eefElementEditorReadOnlyState && !typeDefinitionRichText.isEnabled()) {
//			typeDefinitionRichText.setEnabled(true);
//		}	
		
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
