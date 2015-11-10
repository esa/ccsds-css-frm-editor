/**
 * Generated with Acceleo
 */
package ccsds.FunctionalResourceModel.parts.forms;

// Start of user code for imports
import ccsds.FunctionalResourceModel.parts.FunctionalResourceModelViewsRepository;
import ccsds.FunctionalResourceModel.parts.ParameterPropertiesEditionPart;
import ccsds.FunctionalResourceModel.providers.FunctionalResourceModelMessages;

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
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
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
public class ParameterPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, ParameterPropertiesEditionPart {

	protected Text semanticDefinition;
	protected Text oidBit;
	protected Button deprecated;
	protected Text authorizingEntity;
	protected Text creationDate;
	protected Text name;
	protected Text version;
	protected Text engineeringUnit;
	protected Text typeDefinition;
	protected Button monitored;
	protected Button configured;
	protected Text guardCondition;



	/**
	 * For {@link ISection} use only.
	 */
	public ParameterPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ParameterPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence parameterStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = parameterStep.addStep(FunctionalResourceModelViewsRepository.Parameter.Properties.class);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.Parameter.Properties.semanticDefinition);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.Parameter.Properties.oidBit);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.Parameter.Properties.deprecated);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.Parameter.Properties.authorizingEntity);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.Parameter.Properties.creationDate);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.Parameter.Properties.name);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.Parameter.Properties.version);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.Parameter.Properties.engineeringUnit);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.Parameter.Properties.typeDefinition);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.Parameter.Properties.monitored);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.Parameter.Properties.configured);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.Parameter.Properties.guardCondition);
		
		
		composer = new PartComposer(parameterStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == FunctionalResourceModelViewsRepository.Parameter.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == FunctionalResourceModelViewsRepository.Parameter.Properties.semanticDefinition) {
					return createSemanticDefinitionTextarea(widgetFactory, parent);
				}
				if (key == FunctionalResourceModelViewsRepository.Parameter.Properties.oidBit) {
					return createOidBitText(widgetFactory, parent);
				}
				if (key == FunctionalResourceModelViewsRepository.Parameter.Properties.deprecated) {
					return createDeprecatedCheckbox(widgetFactory, parent);
				}
				if (key == FunctionalResourceModelViewsRepository.Parameter.Properties.authorizingEntity) {
					return createAuthorizingEntityText(widgetFactory, parent);
				}
				if (key == FunctionalResourceModelViewsRepository.Parameter.Properties.creationDate) {
					return createCreationDateText(widgetFactory, parent);
				}
				if (key == FunctionalResourceModelViewsRepository.Parameter.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == FunctionalResourceModelViewsRepository.Parameter.Properties.version) {
					return createVersionText(widgetFactory, parent);
				}
				if (key == FunctionalResourceModelViewsRepository.Parameter.Properties.engineeringUnit) {
					return createEngineeringUnitText(widgetFactory, parent);
				}
				if (key == FunctionalResourceModelViewsRepository.Parameter.Properties.typeDefinition) {
					return createTypeDefinitionTextarea(widgetFactory, parent);
				}
				if (key == FunctionalResourceModelViewsRepository.Parameter.Properties.monitored) {
					return createMonitoredCheckbox(widgetFactory, parent);
				}
				if (key == FunctionalResourceModelViewsRepository.Parameter.Properties.configured) {
					return createConfiguredCheckbox(widgetFactory, parent);
				}
				if (key == FunctionalResourceModelViewsRepository.Parameter.Properties.guardCondition) {
					return createGuardConditionTextarea(widgetFactory, parent);
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
		propertiesSection.setText(FunctionalResourceModelMessages.ParameterPropertiesEditionPart_PropertiesGroupLabel);
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
		Label semanticDefinitionLabel = createDescription(parent, FunctionalResourceModelViewsRepository.Parameter.Properties.semanticDefinition, FunctionalResourceModelMessages.ParameterPropertiesEditionPart_SemanticDefinitionLabel);
		GridData semanticDefinitionLabelData = new GridData(GridData.FILL_HORIZONTAL);
		semanticDefinitionLabelData.horizontalSpan = 3;
		semanticDefinitionLabel.setLayoutData(semanticDefinitionLabelData);
		semanticDefinition = widgetFactory.createText(parent, "", SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL); //$NON-NLS-1$
		GridData semanticDefinitionData = new GridData(GridData.FILL_HORIZONTAL);
		semanticDefinitionData.horizontalSpan = 2;
		semanticDefinitionData.heightHint = 160;
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
							ParameterPropertiesEditionPartForm.this,
							FunctionalResourceModelViewsRepository.Parameter.Properties.semanticDefinition,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, semanticDefinition.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ParameterPropertiesEditionPartForm.this,
									FunctionalResourceModelViewsRepository.Parameter.Properties.semanticDefinition,
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
									ParameterPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		EditingUtils.setID(semanticDefinition, FunctionalResourceModelViewsRepository.Parameter.Properties.semanticDefinition);
		EditingUtils.setEEFtype(semanticDefinition, "eef::Textarea"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.Parameter.Properties.semanticDefinition, FunctionalResourceModelViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createSemanticDefinitionTextArea

		// End of user code
		return parent;
	}

	
	protected Composite createOidBitText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.Parameter.Properties.oidBit, FunctionalResourceModelMessages.ParameterPropertiesEditionPart_OidBitLabel);
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
							ParameterPropertiesEditionPartForm.this,
							FunctionalResourceModelViewsRepository.Parameter.Properties.oidBit,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, oidBit.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ParameterPropertiesEditionPartForm.this,
									FunctionalResourceModelViewsRepository.Parameter.Properties.oidBit,
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
									ParameterPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.Parameter.Properties.oidBit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, oidBit.getText()));
				}
			}
		});
		EditingUtils.setID(oidBit, FunctionalResourceModelViewsRepository.Parameter.Properties.oidBit);
		EditingUtils.setEEFtype(oidBit, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.Parameter.Properties.oidBit, FunctionalResourceModelViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createOidBitText

		// End of user code
		return parent;
	}

	
	protected Composite createDeprecatedCheckbox(FormToolkit widgetFactory, Composite parent) {
		deprecated = widgetFactory.createButton(parent, getDescription(FunctionalResourceModelViewsRepository.Parameter.Properties.deprecated, FunctionalResourceModelMessages.ParameterPropertiesEditionPart_DeprecatedLabel), SWT.CHECK);
		deprecated.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.Parameter.Properties.deprecated, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(deprecated.getSelection())));
			}

		});
		GridData deprecatedData = new GridData(GridData.FILL_HORIZONTAL);
		deprecatedData.horizontalSpan = 2;
		deprecated.setLayoutData(deprecatedData);
		EditingUtils.setID(deprecated, FunctionalResourceModelViewsRepository.Parameter.Properties.deprecated);
		EditingUtils.setEEFtype(deprecated, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.Parameter.Properties.deprecated, FunctionalResourceModelViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createDeprecatedCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createAuthorizingEntityText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.Parameter.Properties.authorizingEntity, FunctionalResourceModelMessages.ParameterPropertiesEditionPart_AuthorizingEntityLabel);
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
							ParameterPropertiesEditionPartForm.this,
							FunctionalResourceModelViewsRepository.Parameter.Properties.authorizingEntity,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, authorizingEntity.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ParameterPropertiesEditionPartForm.this,
									FunctionalResourceModelViewsRepository.Parameter.Properties.authorizingEntity,
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
									ParameterPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.Parameter.Properties.authorizingEntity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, authorizingEntity.getText()));
				}
			}
		});
		EditingUtils.setID(authorizingEntity, FunctionalResourceModelViewsRepository.Parameter.Properties.authorizingEntity);
		EditingUtils.setEEFtype(authorizingEntity, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.Parameter.Properties.authorizingEntity, FunctionalResourceModelViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createAuthorizingEntityText

		// End of user code
		return parent;
	}

	
	protected Composite createCreationDateText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.Parameter.Properties.creationDate, FunctionalResourceModelMessages.ParameterPropertiesEditionPart_CreationDateLabel);
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
							ParameterPropertiesEditionPartForm.this,
							FunctionalResourceModelViewsRepository.Parameter.Properties.creationDate,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, creationDate.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ParameterPropertiesEditionPartForm.this,
									FunctionalResourceModelViewsRepository.Parameter.Properties.creationDate,
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
									ParameterPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.Parameter.Properties.creationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, creationDate.getText()));
				}
			}
		});
		EditingUtils.setID(creationDate, FunctionalResourceModelViewsRepository.Parameter.Properties.creationDate);
		EditingUtils.setEEFtype(creationDate, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.Parameter.Properties.creationDate, FunctionalResourceModelViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createCreationDateText

		// End of user code
		return parent;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.Parameter.Properties.name, FunctionalResourceModelMessages.ParameterPropertiesEditionPart_NameLabel);
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ParameterPropertiesEditionPartForm.this,
							FunctionalResourceModelViewsRepository.Parameter.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ParameterPropertiesEditionPartForm.this,
									FunctionalResourceModelViewsRepository.Parameter.Properties.name,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, name.getText()));
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
									ParameterPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.Parameter.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, FunctionalResourceModelViewsRepository.Parameter.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.Parameter.Properties.name, FunctionalResourceModelViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createVersionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.Parameter.Properties.version, FunctionalResourceModelMessages.ParameterPropertiesEditionPart_VersionLabel);
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
							ParameterPropertiesEditionPartForm.this,
							FunctionalResourceModelViewsRepository.Parameter.Properties.version,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ParameterPropertiesEditionPartForm.this,
									FunctionalResourceModelViewsRepository.Parameter.Properties.version,
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
									ParameterPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.Parameter.Properties.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
				}
			}
		});
		EditingUtils.setID(version, FunctionalResourceModelViewsRepository.Parameter.Properties.version);
		EditingUtils.setEEFtype(version, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.Parameter.Properties.version, FunctionalResourceModelViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createVersionText

		// End of user code
		return parent;
	}

	
	protected Composite createEngineeringUnitText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.Parameter.Properties.engineeringUnit, FunctionalResourceModelMessages.ParameterPropertiesEditionPart_EngineeringUnitLabel);
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
							ParameterPropertiesEditionPartForm.this,
							FunctionalResourceModelViewsRepository.Parameter.Properties.engineeringUnit,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, engineeringUnit.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ParameterPropertiesEditionPartForm.this,
									FunctionalResourceModelViewsRepository.Parameter.Properties.engineeringUnit,
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
									ParameterPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.Parameter.Properties.engineeringUnit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, engineeringUnit.getText()));
				}
			}
		});
		EditingUtils.setID(engineeringUnit, FunctionalResourceModelViewsRepository.Parameter.Properties.engineeringUnit);
		EditingUtils.setEEFtype(engineeringUnit, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.Parameter.Properties.engineeringUnit, FunctionalResourceModelViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createEngineeringUnitText

		// End of user code
		return parent;
	}

	
	protected Composite createTypeDefinitionTextarea(FormToolkit widgetFactory, Composite parent) {
		Label typeDefinitionLabel = createDescription(parent, FunctionalResourceModelViewsRepository.Parameter.Properties.typeDefinition, FunctionalResourceModelMessages.ParameterPropertiesEditionPart_TypeDefinitionLabel);
		GridData typeDefinitionLabelData = new GridData(GridData.FILL_HORIZONTAL);
		typeDefinitionLabelData.horizontalSpan = 3;
		typeDefinitionLabel.setLayoutData(typeDefinitionLabelData);
		typeDefinition = widgetFactory.createText(parent, "", SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL); //$NON-NLS-1$
		GridData typeDefinitionData = new GridData(GridData.FILL_HORIZONTAL);
		typeDefinitionData.horizontalSpan = 2;
		typeDefinitionData.heightHint = 160;
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
							ParameterPropertiesEditionPartForm.this,
							FunctionalResourceModelViewsRepository.Parameter.Properties.typeDefinition,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, typeDefinition.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ParameterPropertiesEditionPartForm.this,
									FunctionalResourceModelViewsRepository.Parameter.Properties.typeDefinition,
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
									ParameterPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		EditingUtils.setID(typeDefinition, FunctionalResourceModelViewsRepository.Parameter.Properties.typeDefinition);
		EditingUtils.setEEFtype(typeDefinition, "eef::Textarea"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.Parameter.Properties.typeDefinition, FunctionalResourceModelViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTypeDefinitionTextArea

		// End of user code
		return parent;
	}

	
	protected Composite createMonitoredCheckbox(FormToolkit widgetFactory, Composite parent) {
		monitored = widgetFactory.createButton(parent, getDescription(FunctionalResourceModelViewsRepository.Parameter.Properties.monitored, FunctionalResourceModelMessages.ParameterPropertiesEditionPart_MonitoredLabel), SWT.CHECK);
		monitored.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.Parameter.Properties.monitored, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(monitored.getSelection())));
			}

		});
		GridData monitoredData = new GridData(GridData.FILL_HORIZONTAL);
		monitoredData.horizontalSpan = 2;
		monitored.setLayoutData(monitoredData);
		EditingUtils.setID(monitored, FunctionalResourceModelViewsRepository.Parameter.Properties.monitored);
		EditingUtils.setEEFtype(monitored, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.Parameter.Properties.monitored, FunctionalResourceModelViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createMonitoredCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createConfiguredCheckbox(FormToolkit widgetFactory, Composite parent) {
		configured = widgetFactory.createButton(parent, getDescription(FunctionalResourceModelViewsRepository.Parameter.Properties.configured, FunctionalResourceModelMessages.ParameterPropertiesEditionPart_ConfiguredLabel), SWT.CHECK);
		configured.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.Parameter.Properties.configured, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(configured.getSelection())));
			}

		});
		GridData configuredData = new GridData(GridData.FILL_HORIZONTAL);
		configuredData.horizontalSpan = 2;
		configured.setLayoutData(configuredData);
		EditingUtils.setID(configured, FunctionalResourceModelViewsRepository.Parameter.Properties.configured);
		EditingUtils.setEEFtype(configured, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.Parameter.Properties.configured, FunctionalResourceModelViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createConfiguredCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createGuardConditionTextarea(FormToolkit widgetFactory, Composite parent) {
		Label guardConditionLabel = createDescription(parent, FunctionalResourceModelViewsRepository.Parameter.Properties.guardCondition, FunctionalResourceModelMessages.ParameterPropertiesEditionPart_GuardConditionLabel);
		GridData guardConditionLabelData = new GridData(GridData.FILL_HORIZONTAL);
		guardConditionLabelData.horizontalSpan = 3;
		guardConditionLabel.setLayoutData(guardConditionLabelData);
		guardCondition = widgetFactory.createText(parent, "", SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL); //$NON-NLS-1$
		GridData guardConditionData = new GridData(GridData.FILL_HORIZONTAL);
		guardConditionData.horizontalSpan = 2;
		guardConditionData.heightHint = 160;
		guardConditionData.widthHint = 200;
		guardCondition.setLayoutData(guardConditionData);
		guardCondition.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ParameterPropertiesEditionPartForm.this,
							FunctionalResourceModelViewsRepository.Parameter.Properties.guardCondition,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, guardCondition.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ParameterPropertiesEditionPartForm.this,
									FunctionalResourceModelViewsRepository.Parameter.Properties.guardCondition,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, guardCondition.getText()));
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
									ParameterPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		EditingUtils.setID(guardCondition, FunctionalResourceModelViewsRepository.Parameter.Properties.guardCondition);
		EditingUtils.setEEFtype(guardCondition, "eef::Textarea"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.Parameter.Properties.guardCondition, FunctionalResourceModelViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createGuardConditionTextArea

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
	 * @see ccsds.FunctionalResourceModel.parts.ParameterPropertiesEditionPart#getSemanticDefinition()
	 * 
	 */
	public String getSemanticDefinition() {
		return semanticDefinition.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ParameterPropertiesEditionPart#setSemanticDefinition(String newValue)
	 * 
	 */
	public void setSemanticDefinition(String newValue) {
		if (newValue != null) {
			semanticDefinition.setText(newValue);
		} else {
			semanticDefinition.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.Parameter.Properties.semanticDefinition);
		if (eefElementEditorReadOnlyState && semanticDefinition.isEnabled()) {
			semanticDefinition.setEnabled(false);
			semanticDefinition.setBackground(semanticDefinition.getDisplay().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND));
			semanticDefinition.setToolTipText(FunctionalResourceModelMessages.Parameter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !semanticDefinition.isEnabled()) {
			semanticDefinition.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ParameterPropertiesEditionPart#getOidBit()
	 * 
	 */
	public String getOidBit() {
		return oidBit.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ParameterPropertiesEditionPart#setOidBit(String newValue)
	 * 
	 */
	public void setOidBit(String newValue) {
		if (newValue != null) {
			oidBit.setText(newValue);
		} else {
			oidBit.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.Parameter.Properties.oidBit);
		if (eefElementEditorReadOnlyState && oidBit.isEnabled()) {
			oidBit.setEnabled(false);
			oidBit.setToolTipText(FunctionalResourceModelMessages.Parameter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !oidBit.isEnabled()) {
			oidBit.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ParameterPropertiesEditionPart#getDeprecated()
	 * 
	 */
	public Boolean getDeprecated() {
		return Boolean.valueOf(deprecated.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ParameterPropertiesEditionPart#setDeprecated(Boolean newValue)
	 * 
	 */
	public void setDeprecated(Boolean newValue) {
		if (newValue != null) {
			deprecated.setSelection(newValue.booleanValue());
		} else {
			deprecated.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.Parameter.Properties.deprecated);
		if (eefElementEditorReadOnlyState && deprecated.isEnabled()) {
			deprecated.setEnabled(false);
			deprecated.setToolTipText(FunctionalResourceModelMessages.Parameter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !deprecated.isEnabled()) {
			deprecated.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ParameterPropertiesEditionPart#getAuthorizingEntity()
	 * 
	 */
	public String getAuthorizingEntity() {
		return authorizingEntity.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ParameterPropertiesEditionPart#setAuthorizingEntity(String newValue)
	 * 
	 */
	public void setAuthorizingEntity(String newValue) {
		if (newValue != null) {
			authorizingEntity.setText(newValue);
		} else {
			authorizingEntity.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.Parameter.Properties.authorizingEntity);
		if (eefElementEditorReadOnlyState && authorizingEntity.isEnabled()) {
			authorizingEntity.setEnabled(false);
			authorizingEntity.setToolTipText(FunctionalResourceModelMessages.Parameter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !authorizingEntity.isEnabled()) {
			authorizingEntity.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ParameterPropertiesEditionPart#getCreationDate()
	 * 
	 */
	public String getCreationDate() {
		return creationDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ParameterPropertiesEditionPart#setCreationDate(String newValue)
	 * 
	 */
	public void setCreationDate(String newValue) {
		if (newValue != null) {
			creationDate.setText(newValue);
		} else {
			creationDate.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.Parameter.Properties.creationDate);
		if (eefElementEditorReadOnlyState && creationDate.isEnabled()) {
			creationDate.setEnabled(false);
			creationDate.setToolTipText(FunctionalResourceModelMessages.Parameter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !creationDate.isEnabled()) {
			creationDate.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ParameterPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ParameterPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.Parameter.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(FunctionalResourceModelMessages.Parameter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ParameterPropertiesEditionPart#getVersion()
	 * 
	 */
	public String getVersion() {
		return version.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ParameterPropertiesEditionPart#setVersion(String newValue)
	 * 
	 */
	public void setVersion(String newValue) {
		if (newValue != null) {
			version.setText(newValue);
		} else {
			version.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.Parameter.Properties.version);
		if (eefElementEditorReadOnlyState && version.isEnabled()) {
			version.setEnabled(false);
			version.setToolTipText(FunctionalResourceModelMessages.Parameter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !version.isEnabled()) {
			version.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ParameterPropertiesEditionPart#getEngineeringUnit()
	 * 
	 */
	public String getEngineeringUnit() {
		return engineeringUnit.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ParameterPropertiesEditionPart#setEngineeringUnit(String newValue)
	 * 
	 */
	public void setEngineeringUnit(String newValue) {
		if (newValue != null) {
			engineeringUnit.setText(newValue);
		} else {
			engineeringUnit.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.Parameter.Properties.engineeringUnit);
		if (eefElementEditorReadOnlyState && engineeringUnit.isEnabled()) {
			engineeringUnit.setEnabled(false);
			engineeringUnit.setToolTipText(FunctionalResourceModelMessages.Parameter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !engineeringUnit.isEnabled()) {
			engineeringUnit.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ParameterPropertiesEditionPart#getTypeDefinition()
	 * 
	 */
	public String getTypeDefinition() {
		return typeDefinition.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ParameterPropertiesEditionPart#setTypeDefinition(String newValue)
	 * 
	 */
	public void setTypeDefinition(String newValue) {
		if (newValue != null) {
			typeDefinition.setText(newValue);
		} else {
			typeDefinition.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.Parameter.Properties.typeDefinition);
		if (eefElementEditorReadOnlyState && typeDefinition.isEnabled()) {
			typeDefinition.setEnabled(false);
			typeDefinition.setBackground(typeDefinition.getDisplay().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND));
			typeDefinition.setToolTipText(FunctionalResourceModelMessages.Parameter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !typeDefinition.isEnabled()) {
			typeDefinition.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ParameterPropertiesEditionPart#getMonitored()
	 * 
	 */
	public Boolean getMonitored() {
		return Boolean.valueOf(monitored.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ParameterPropertiesEditionPart#setMonitored(Boolean newValue)
	 * 
	 */
	public void setMonitored(Boolean newValue) {
		if (newValue != null) {
			monitored.setSelection(newValue.booleanValue());
		} else {
			monitored.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.Parameter.Properties.monitored);
		if (eefElementEditorReadOnlyState && monitored.isEnabled()) {
			monitored.setEnabled(false);
			monitored.setToolTipText(FunctionalResourceModelMessages.Parameter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !monitored.isEnabled()) {
			monitored.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ParameterPropertiesEditionPart#getConfigured()
	 * 
	 */
	public Boolean getConfigured() {
		return Boolean.valueOf(configured.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ParameterPropertiesEditionPart#setConfigured(Boolean newValue)
	 * 
	 */
	public void setConfigured(Boolean newValue) {
		if (newValue != null) {
			configured.setSelection(newValue.booleanValue());
		} else {
			configured.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.Parameter.Properties.configured);
		if (eefElementEditorReadOnlyState && configured.isEnabled()) {
			configured.setEnabled(false);
			configured.setToolTipText(FunctionalResourceModelMessages.Parameter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !configured.isEnabled()) {
			configured.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ParameterPropertiesEditionPart#getGuardCondition()
	 * 
	 */
	public String getGuardCondition() {
		return guardCondition.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ParameterPropertiesEditionPart#setGuardCondition(String newValue)
	 * 
	 */
	public void setGuardCondition(String newValue) {
		if (newValue != null) {
			guardCondition.setText(newValue);
		} else {
			guardCondition.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.Parameter.Properties.guardCondition);
		if (eefElementEditorReadOnlyState && guardCondition.isEnabled()) {
			guardCondition.setEnabled(false);
			guardCondition.setBackground(guardCondition.getDisplay().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND));
			guardCondition.setToolTipText(FunctionalResourceModelMessages.Parameter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !guardCondition.isEnabled()) {
			guardCondition.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return FunctionalResourceModelMessages.Parameter_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
