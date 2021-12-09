/**
 * Generated with Acceleo
 */
package ccsds.FunctionalResourceModel.parts.forms;

// Start of user code for imports
import ccsds.FunctionalResourceModel.parts.FunctionalResourceModelViewsRepository;
import ccsds.FunctionalResourceModel.parts.TypedElementPropertiesEditionPart;
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
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
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
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

// End of user code

/**
 * 
 * 
 */
public class TypedElementPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, TypedElementPropertiesEditionPart {

	protected Text semanticDefinition;
	protected Text classifier;
	protected Text stringIdentifier;
	protected Text version;
	protected Text creationDate;
	protected Text authorizingEntity;
	protected Text oidBit;
	protected Button deprecated;
	protected ReferencesTable annotation;
	protected List<ViewerFilter> annotationBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> annotationFilters = new ArrayList<ViewerFilter>();
	protected Text typeDefinition;
	protected Text engineeringUnit;



	/**
	 * For {@link ISection} use only.
	 */
	public TypedElementPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TypedElementPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence typedElementStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = typedElementStep.addStep(FunctionalResourceModelViewsRepository.TypedElement.Properties.class);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.TypedElement.Properties.semanticDefinition);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.TypedElement.Properties.classifier);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.TypedElement.Properties.stringIdentifier);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.TypedElement.Properties.version);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.TypedElement.Properties.creationDate);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.TypedElement.Properties.authorizingEntity);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.TypedElement.Properties.oidBit);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.TypedElement.Properties.deprecated);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.TypedElement.Properties.annotation);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.TypedElement.Properties.typeDefinition);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.TypedElement.Properties.engineeringUnit);
		
		
		composer = new PartComposer(typedElementStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == FunctionalResourceModelViewsRepository.TypedElement.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == FunctionalResourceModelViewsRepository.TypedElement.Properties.semanticDefinition) {
					return createSemanticDefinitionTextarea(widgetFactory, parent);
				}
				if (key == FunctionalResourceModelViewsRepository.TypedElement.Properties.classifier) {
					return createClassifierText(widgetFactory, parent);
				}
				if (key == FunctionalResourceModelViewsRepository.TypedElement.Properties.stringIdentifier) {
					return createStringIdentifierText(widgetFactory, parent);
				}
				if (key == FunctionalResourceModelViewsRepository.TypedElement.Properties.version) {
					return createVersionText(widgetFactory, parent);
				}
				if (key == FunctionalResourceModelViewsRepository.TypedElement.Properties.creationDate) {
					return createCreationDateText(widgetFactory, parent);
				}
				if (key == FunctionalResourceModelViewsRepository.TypedElement.Properties.authorizingEntity) {
					return createAuthorizingEntityText(widgetFactory, parent);
				}
				if (key == FunctionalResourceModelViewsRepository.TypedElement.Properties.oidBit) {
					return createOidBitText(widgetFactory, parent);
				}
				if (key == FunctionalResourceModelViewsRepository.TypedElement.Properties.deprecated) {
					return createDeprecatedCheckbox(widgetFactory, parent);
				}
				if (key == FunctionalResourceModelViewsRepository.TypedElement.Properties.annotation) {
					return createAnnotationTableComposition(widgetFactory, parent);
				}
				if (key == FunctionalResourceModelViewsRepository.TypedElement.Properties.typeDefinition) {
					return createTypeDefinitionTextarea(widgetFactory, parent);
				}
				if (key == FunctionalResourceModelViewsRepository.TypedElement.Properties.engineeringUnit) {
					return createEngineeringUnitText(widgetFactory, parent);
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
		propertiesSection.setText(FunctionalResourceModelMessages.TypedElementPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createSemanticDefinitionTextarea(FormToolkit widgetFactory, Composite parent) {
		Label semanticDefinitionLabel = createDescription(parent, FunctionalResourceModelViewsRepository.TypedElement.Properties.semanticDefinition, FunctionalResourceModelMessages.TypedElementPropertiesEditionPart_SemanticDefinitionLabel);
		GridData semanticDefinitionLabelData = new GridData(GridData.FILL_HORIZONTAL);
		semanticDefinitionLabelData.horizontalSpan = 3;
		semanticDefinitionLabel.setLayoutData(semanticDefinitionLabelData);
		semanticDefinition = widgetFactory.createText(parent, "", SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL); //$NON-NLS-1$
		GridData semanticDefinitionData = new GridData(GridData.FILL_HORIZONTAL);
		semanticDefinitionData.horizontalSpan = 2;
		semanticDefinitionData.heightHint=240;
		semanticDefinitionData.widthHint = 200;
		semanticDefinition.setLayoutData(semanticDefinitionData);
		semanticDefinition.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TypedElementPropertiesEditionPartForm.this,
							FunctionalResourceModelViewsRepository.TypedElement.Properties.semanticDefinition,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, semanticDefinition.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TypedElementPropertiesEditionPartForm.this,
									FunctionalResourceModelViewsRepository.TypedElement.Properties.semanticDefinition,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, semanticDefinition.getText()));
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
									TypedElementPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		EditingUtils.setID(semanticDefinition, FunctionalResourceModelViewsRepository.TypedElement.Properties.semanticDefinition);
		EditingUtils.setEEFtype(semanticDefinition, "eef::Textarea"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.TypedElement.Properties.semanticDefinition, FunctionalResourceModelViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createSemanticDefinitionTextArea

		// End of user code
		return parent;
	}

	
	protected Composite createClassifierText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.TypedElement.Properties.classifier, FunctionalResourceModelMessages.TypedElementPropertiesEditionPart_ClassifierLabel);
		classifier = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		classifier.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData classifierData = new GridData(GridData.FILL_HORIZONTAL);
		classifier.setLayoutData(classifierData);
		classifier.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TypedElementPropertiesEditionPartForm.this,
							FunctionalResourceModelViewsRepository.TypedElement.Properties.classifier,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, classifier.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TypedElementPropertiesEditionPartForm.this,
									FunctionalResourceModelViewsRepository.TypedElement.Properties.classifier,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, classifier.getText()));
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
									TypedElementPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		classifier.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypedElementPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.TypedElement.Properties.classifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, classifier.getText()));
				}
			}
		});
		EditingUtils.setID(classifier, FunctionalResourceModelViewsRepository.TypedElement.Properties.classifier);
		EditingUtils.setEEFtype(classifier, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.TypedElement.Properties.classifier, FunctionalResourceModelViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createClassifierText

		// End of user code
		return parent;
	}

	
	protected Composite createStringIdentifierText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.TypedElement.Properties.stringIdentifier, FunctionalResourceModelMessages.TypedElementPropertiesEditionPart_StringIdentifierLabel);
		stringIdentifier = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		stringIdentifier.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData stringIdentifierData = new GridData(GridData.FILL_HORIZONTAL);
		stringIdentifier.setLayoutData(stringIdentifierData);
		stringIdentifier.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TypedElementPropertiesEditionPartForm.this,
							FunctionalResourceModelViewsRepository.TypedElement.Properties.stringIdentifier,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, stringIdentifier.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TypedElementPropertiesEditionPartForm.this,
									FunctionalResourceModelViewsRepository.TypedElement.Properties.stringIdentifier,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, stringIdentifier.getText()));
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
									TypedElementPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		stringIdentifier.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypedElementPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.TypedElement.Properties.stringIdentifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, stringIdentifier.getText()));
				}
			}
		});
		EditingUtils.setID(stringIdentifier, FunctionalResourceModelViewsRepository.TypedElement.Properties.stringIdentifier);
		EditingUtils.setEEFtype(stringIdentifier, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.TypedElement.Properties.stringIdentifier, FunctionalResourceModelViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createStringIdentifierText

		// End of user code
		return parent;
	}

	
	protected Composite createVersionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.TypedElement.Properties.version, FunctionalResourceModelMessages.TypedElementPropertiesEditionPart_VersionLabel);
		version = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		version.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData versionData = new GridData(GridData.FILL_HORIZONTAL);
		version.setLayoutData(versionData);
		version.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TypedElementPropertiesEditionPartForm.this,
							FunctionalResourceModelViewsRepository.TypedElement.Properties.version,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TypedElementPropertiesEditionPartForm.this,
									FunctionalResourceModelViewsRepository.TypedElement.Properties.version,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, version.getText()));
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
									TypedElementPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		version.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypedElementPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.TypedElement.Properties.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
				}
			}
		});
		EditingUtils.setID(version, FunctionalResourceModelViewsRepository.TypedElement.Properties.version);
		EditingUtils.setEEFtype(version, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.TypedElement.Properties.version, FunctionalResourceModelViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createVersionText

		// End of user code
		return parent;
	}

	
	protected Composite createCreationDateText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.TypedElement.Properties.creationDate, FunctionalResourceModelMessages.TypedElementPropertiesEditionPart_CreationDateLabel);
		creationDate = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		creationDate.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData creationDateData = new GridData(GridData.FILL_HORIZONTAL);
		creationDate.setLayoutData(creationDateData);
		creationDate.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TypedElementPropertiesEditionPartForm.this,
							FunctionalResourceModelViewsRepository.TypedElement.Properties.creationDate,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, creationDate.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TypedElementPropertiesEditionPartForm.this,
									FunctionalResourceModelViewsRepository.TypedElement.Properties.creationDate,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, creationDate.getText()));
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
									TypedElementPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		creationDate.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypedElementPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.TypedElement.Properties.creationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, creationDate.getText()));
				}
			}
		});
		EditingUtils.setID(creationDate, FunctionalResourceModelViewsRepository.TypedElement.Properties.creationDate);
		EditingUtils.setEEFtype(creationDate, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.TypedElement.Properties.creationDate, FunctionalResourceModelViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createCreationDateText

		// End of user code
		return parent;
	}

	
	protected Composite createAuthorizingEntityText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.TypedElement.Properties.authorizingEntity, FunctionalResourceModelMessages.TypedElementPropertiesEditionPart_AuthorizingEntityLabel);
		authorizingEntity = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		authorizingEntity.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData authorizingEntityData = new GridData(GridData.FILL_HORIZONTAL);
		authorizingEntity.setLayoutData(authorizingEntityData);
		authorizingEntity.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TypedElementPropertiesEditionPartForm.this,
							FunctionalResourceModelViewsRepository.TypedElement.Properties.authorizingEntity,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, authorizingEntity.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TypedElementPropertiesEditionPartForm.this,
									FunctionalResourceModelViewsRepository.TypedElement.Properties.authorizingEntity,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, authorizingEntity.getText()));
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
									TypedElementPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		authorizingEntity.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypedElementPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.TypedElement.Properties.authorizingEntity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, authorizingEntity.getText()));
				}
			}
		});
		EditingUtils.setID(authorizingEntity, FunctionalResourceModelViewsRepository.TypedElement.Properties.authorizingEntity);
		EditingUtils.setEEFtype(authorizingEntity, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.TypedElement.Properties.authorizingEntity, FunctionalResourceModelViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createAuthorizingEntityText

		// End of user code
		return parent;
	}

	
	protected Composite createOidBitText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.TypedElement.Properties.oidBit, FunctionalResourceModelMessages.TypedElementPropertiesEditionPart_OidBitLabel);
		oidBit = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		oidBit.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData oidBitData = new GridData(GridData.FILL_HORIZONTAL);
		oidBit.setLayoutData(oidBitData);
		oidBit.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TypedElementPropertiesEditionPartForm.this,
							FunctionalResourceModelViewsRepository.TypedElement.Properties.oidBit,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, oidBit.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TypedElementPropertiesEditionPartForm.this,
									FunctionalResourceModelViewsRepository.TypedElement.Properties.oidBit,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, oidBit.getText()));
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
									TypedElementPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		oidBit.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypedElementPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.TypedElement.Properties.oidBit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, oidBit.getText()));
				}
			}
		});
		EditingUtils.setID(oidBit, FunctionalResourceModelViewsRepository.TypedElement.Properties.oidBit);
		EditingUtils.setEEFtype(oidBit, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.TypedElement.Properties.oidBit, FunctionalResourceModelViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createOidBitText

		// End of user code
		return parent;
	}

	
	protected Composite createDeprecatedCheckbox(FormToolkit widgetFactory, Composite parent) {
		deprecated = widgetFactory.createButton(parent, getDescription(FunctionalResourceModelViewsRepository.TypedElement.Properties.deprecated, FunctionalResourceModelMessages.TypedElementPropertiesEditionPart_DeprecatedLabel), SWT.CHECK);
		deprecated.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypedElementPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.TypedElement.Properties.deprecated, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(deprecated.getSelection())));
			}

		});
		GridData deprecatedData = new GridData(GridData.FILL_HORIZONTAL);
		deprecatedData.horizontalSpan = 2;
		deprecated.setLayoutData(deprecatedData);
		EditingUtils.setID(deprecated, FunctionalResourceModelViewsRepository.TypedElement.Properties.deprecated);
		EditingUtils.setEEFtype(deprecated, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.TypedElement.Properties.deprecated, FunctionalResourceModelViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createDeprecatedCheckbox

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createAnnotationTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.annotation = new ReferencesTable(getDescription(FunctionalResourceModelViewsRepository.TypedElement.Properties.annotation, FunctionalResourceModelMessages.TypedElementPropertiesEditionPart_AnnotationLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypedElementPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.TypedElement.Properties.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				annotation.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypedElementPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.TypedElement.Properties.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				annotation.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypedElementPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.TypedElement.Properties.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				annotation.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypedElementPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.TypedElement.Properties.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				annotation.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.annotationFilters) {
			this.annotation.addFilter(filter);
		}
		this.annotation.setHelpText(propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.TypedElement.Properties.annotation, FunctionalResourceModelViewsRepository.FORM_KIND));
		this.annotation.createControls(parent, widgetFactory);
		this.annotation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypedElementPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.TypedElement.Properties.annotation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData annotationData = new GridData(GridData.FILL_HORIZONTAL);
		annotationData.horizontalSpan = 3;
		this.annotation.setLayoutData(annotationData);
		this.annotation.setLowerBound(0);
		this.annotation.setUpperBound(-1);
		annotation.setID(FunctionalResourceModelViewsRepository.TypedElement.Properties.annotation);
		annotation.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createAnnotationTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createTypeDefinitionTextarea(FormToolkit widgetFactory, Composite parent) {
		Label typeDefinitionLabel = createDescription(parent, FunctionalResourceModelViewsRepository.TypedElement.Properties.typeDefinition, FunctionalResourceModelMessages.TypedElementPropertiesEditionPart_TypeDefinitionLabel);
		GridData typeDefinitionLabelData = new GridData(GridData.FILL_HORIZONTAL);
		typeDefinitionLabelData.horizontalSpan = 3;
		typeDefinitionLabel.setLayoutData(typeDefinitionLabelData);
		typeDefinition = widgetFactory.createText(parent, "", SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL); //$NON-NLS-1$
		GridData typeDefinitionData = new GridData(GridData.FILL_HORIZONTAL);
		typeDefinitionData.horizontalSpan = 2;
		typeDefinitionData.heightHint=240;
		typeDefinitionData.widthHint = 200;
		typeDefinition.setLayoutData(typeDefinitionData);
		typeDefinition.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TypedElementPropertiesEditionPartForm.this,
							FunctionalResourceModelViewsRepository.TypedElement.Properties.typeDefinition,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, typeDefinition.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TypedElementPropertiesEditionPartForm.this,
									FunctionalResourceModelViewsRepository.TypedElement.Properties.typeDefinition,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, typeDefinition.getText()));
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
									TypedElementPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		EditingUtils.setID(typeDefinition, FunctionalResourceModelViewsRepository.TypedElement.Properties.typeDefinition);
		EditingUtils.setEEFtype(typeDefinition, "eef::Textarea"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.TypedElement.Properties.typeDefinition, FunctionalResourceModelViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTypeDefinitionTextArea

		// End of user code
		return parent;
	}

	
	protected Composite createEngineeringUnitText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.TypedElement.Properties.engineeringUnit, FunctionalResourceModelMessages.TypedElementPropertiesEditionPart_EngineeringUnitLabel);
		engineeringUnit = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		engineeringUnit.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData engineeringUnitData = new GridData(GridData.FILL_HORIZONTAL);
		engineeringUnit.setLayoutData(engineeringUnitData);
		engineeringUnit.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TypedElementPropertiesEditionPartForm.this,
							FunctionalResourceModelViewsRepository.TypedElement.Properties.engineeringUnit,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, engineeringUnit.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TypedElementPropertiesEditionPartForm.this,
									FunctionalResourceModelViewsRepository.TypedElement.Properties.engineeringUnit,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, engineeringUnit.getText()));
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
									TypedElementPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		engineeringUnit.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypedElementPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.TypedElement.Properties.engineeringUnit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, engineeringUnit.getText()));
				}
			}
		});
		EditingUtils.setID(engineeringUnit, FunctionalResourceModelViewsRepository.TypedElement.Properties.engineeringUnit);
		EditingUtils.setEEFtype(engineeringUnit, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.TypedElement.Properties.engineeringUnit, FunctionalResourceModelViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createEngineeringUnitText

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
	 * @see ccsds.FunctionalResourceModel.parts.TypedElementPropertiesEditionPart#getSemanticDefinition()
	 * 
	 */
	public String getSemanticDefinition() {
		return semanticDefinition.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.TypedElementPropertiesEditionPart#setSemanticDefinition(String newValue)
	 * 
	 */
	public void setSemanticDefinition(String newValue) {
		if (newValue != null) {
			semanticDefinition.setText(newValue);
		} else {
			semanticDefinition.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.TypedElement.Properties.semanticDefinition);
		if (eefElementEditorReadOnlyState && semanticDefinition.isEnabled()) {
			semanticDefinition.setEnabled(false);
			semanticDefinition.setBackground(semanticDefinition.getDisplay().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND));
			semanticDefinition.setToolTipText(FunctionalResourceModelMessages.TypedElement_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !semanticDefinition.isEnabled()) {
			semanticDefinition.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.TypedElementPropertiesEditionPart#getClassifier()
	 * 
	 */
	public String getClassifier() {
		return classifier.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.TypedElementPropertiesEditionPart#setClassifier(String newValue)
	 * 
	 */
	public void setClassifier(String newValue) {
		if (newValue != null) {
			classifier.setText(newValue);
		} else {
			classifier.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.TypedElement.Properties.classifier);
		if (eefElementEditorReadOnlyState && classifier.isEnabled()) {
			classifier.setEnabled(false);
			classifier.setToolTipText(FunctionalResourceModelMessages.TypedElement_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !classifier.isEnabled()) {
			classifier.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.TypedElementPropertiesEditionPart#getStringIdentifier()
	 * 
	 */
	public String getStringIdentifier() {
		return stringIdentifier.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.TypedElementPropertiesEditionPart#setStringIdentifier(String newValue)
	 * 
	 */
	public void setStringIdentifier(String newValue) {
		if (newValue != null) {
			stringIdentifier.setText(newValue);
		} else {
			stringIdentifier.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.TypedElement.Properties.stringIdentifier);
		if (eefElementEditorReadOnlyState && stringIdentifier.isEnabled()) {
			stringIdentifier.setEnabled(false);
			stringIdentifier.setToolTipText(FunctionalResourceModelMessages.TypedElement_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !stringIdentifier.isEnabled()) {
			stringIdentifier.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.TypedElementPropertiesEditionPart#getVersion()
	 * 
	 */
	public String getVersion() {
		return version.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.TypedElementPropertiesEditionPart#setVersion(String newValue)
	 * 
	 */
	public void setVersion(String newValue) {
		if (newValue != null) {
			version.setText(newValue);
		} else {
			version.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.TypedElement.Properties.version);
		if (eefElementEditorReadOnlyState && version.isEnabled()) {
			version.setEnabled(false);
			version.setToolTipText(FunctionalResourceModelMessages.TypedElement_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !version.isEnabled()) {
			version.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.TypedElementPropertiesEditionPart#getCreationDate()
	 * 
	 */
	public String getCreationDate() {
		return creationDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.TypedElementPropertiesEditionPart#setCreationDate(String newValue)
	 * 
	 */
	public void setCreationDate(String newValue) {
		if (newValue != null) {
			creationDate.setText(newValue);
		} else {
			creationDate.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.TypedElement.Properties.creationDate);
		if (eefElementEditorReadOnlyState && creationDate.isEnabled()) {
			creationDate.setEnabled(false);
			creationDate.setToolTipText(FunctionalResourceModelMessages.TypedElement_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !creationDate.isEnabled()) {
			creationDate.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.TypedElementPropertiesEditionPart#getAuthorizingEntity()
	 * 
	 */
	public String getAuthorizingEntity() {
		return authorizingEntity.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.TypedElementPropertiesEditionPart#setAuthorizingEntity(String newValue)
	 * 
	 */
	public void setAuthorizingEntity(String newValue) {
		if (newValue != null) {
			authorizingEntity.setText(newValue);
		} else {
			authorizingEntity.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.TypedElement.Properties.authorizingEntity);
		if (eefElementEditorReadOnlyState && authorizingEntity.isEnabled()) {
			authorizingEntity.setEnabled(false);
			authorizingEntity.setToolTipText(FunctionalResourceModelMessages.TypedElement_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !authorizingEntity.isEnabled()) {
			authorizingEntity.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.TypedElementPropertiesEditionPart#getOidBit()
	 * 
	 */
	public String getOidBit() {
		return oidBit.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.TypedElementPropertiesEditionPart#setOidBit(String newValue)
	 * 
	 */
	public void setOidBit(String newValue) {
		if (newValue != null) {
			oidBit.setText(newValue);
		} else {
			oidBit.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.TypedElement.Properties.oidBit);
		if (eefElementEditorReadOnlyState && oidBit.isEnabled()) {
			oidBit.setEnabled(false);
			oidBit.setToolTipText(FunctionalResourceModelMessages.TypedElement_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !oidBit.isEnabled()) {
			oidBit.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.TypedElementPropertiesEditionPart#getDeprecated()
	 * 
	 */
	public Boolean getDeprecated() {
		return Boolean.valueOf(deprecated.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.TypedElementPropertiesEditionPart#setDeprecated(Boolean newValue)
	 * 
	 */
	public void setDeprecated(Boolean newValue) {
		if (newValue != null) {
			deprecated.setSelection(newValue.booleanValue());
		} else {
			deprecated.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.TypedElement.Properties.deprecated);
		if (eefElementEditorReadOnlyState && deprecated.isEnabled()) {
			deprecated.setEnabled(false);
			deprecated.setToolTipText(FunctionalResourceModelMessages.TypedElement_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !deprecated.isEnabled()) {
			deprecated.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.TypedElementPropertiesEditionPart#initAnnotation(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAnnotation(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		annotation.setContentProvider(contentProvider);
		annotation.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.TypedElement.Properties.annotation);
		if (eefElementEditorReadOnlyState && annotation.isEnabled()) {
			annotation.setEnabled(false);
			annotation.setToolTipText(FunctionalResourceModelMessages.TypedElement_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !annotation.isEnabled()) {
			annotation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.TypedElementPropertiesEditionPart#updateAnnotation()
	 * 
	 */
	public void updateAnnotation() {
	annotation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.TypedElementPropertiesEditionPart#addFilterAnnotation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAnnotation(ViewerFilter filter) {
		annotationFilters.add(filter);
		if (this.annotation != null) {
			this.annotation.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.TypedElementPropertiesEditionPart#addBusinessFilterAnnotation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAnnotation(ViewerFilter filter) {
		annotationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.TypedElementPropertiesEditionPart#isContainedInAnnotationTable(EObject element)
	 * 
	 */
	public boolean isContainedInAnnotationTable(EObject element) {
		return ((ReferencesTableSettings)annotation.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.TypedElementPropertiesEditionPart#getTypeDefinition()
	 * 
	 */
	public String getTypeDefinition() {
		return typeDefinition.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.TypedElementPropertiesEditionPart#setTypeDefinition(String newValue)
	 * 
	 */
	public void setTypeDefinition(String newValue) {
		if (newValue != null) {
			typeDefinition.setText(newValue);
		} else {
			typeDefinition.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.TypedElement.Properties.typeDefinition);
		if (eefElementEditorReadOnlyState && typeDefinition.isEnabled()) {
			typeDefinition.setEnabled(false);
			typeDefinition.setBackground(typeDefinition.getDisplay().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND));
			typeDefinition.setToolTipText(FunctionalResourceModelMessages.TypedElement_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !typeDefinition.isEnabled()) {
			typeDefinition.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.TypedElementPropertiesEditionPart#getEngineeringUnit()
	 * 
	 */
	public String getEngineeringUnit() {
		return engineeringUnit.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.TypedElementPropertiesEditionPart#setEngineeringUnit(String newValue)
	 * 
	 */
	public void setEngineeringUnit(String newValue) {
		if (newValue != null) {
			engineeringUnit.setText(newValue);
		} else {
			engineeringUnit.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.TypedElement.Properties.engineeringUnit);
		if (eefElementEditorReadOnlyState && engineeringUnit.isEnabled()) {
			engineeringUnit.setEnabled(false);
			engineeringUnit.setToolTipText(FunctionalResourceModelMessages.TypedElement_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !engineeringUnit.isEnabled()) {
			engineeringUnit.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return FunctionalResourceModelMessages.TypedElement_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
