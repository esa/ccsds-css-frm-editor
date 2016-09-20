/**
 * Generated with Acceleo
 */
package ccsds.FunctionalResourceModel.parts.impl;

// Start of user code for imports
import ccsds.FunctionalResourceModel.parts.FunctionalResourceModelViewsRepository;
import ccsds.FunctionalResourceModel.parts.ParameterPropertiesEditionPart;
import ccsds.FunctionalResourceModel.providers.FunctionalResourceModelMessages;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

// End of user code

/**
 * 
 * 
 */
public class ParameterPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ParameterPropertiesEditionPart {

	protected Text semanticDefinition;
	protected Text classifier;
	protected Text stringIdentifier;
	protected Text version;
	protected Text creationDate;
	protected Text authorizingEntity;
	protected Text oidBit;
	protected Button deprecated;
	protected Text typeDefinition;
	protected Text engineeringUnit;
	protected Button configured;
	protected Text guardCondition;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ParameterPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence parameterStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = parameterStep.addStep(FunctionalResourceModelViewsRepository.Parameter.Properties.class);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.Parameter.Properties.semanticDefinition);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.Parameter.Properties.classifier);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.Parameter.Properties.stringIdentifier);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.Parameter.Properties.version);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.Parameter.Properties.creationDate);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.Parameter.Properties.authorizingEntity);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.Parameter.Properties.oidBit);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.Parameter.Properties.deprecated);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.Parameter.Properties.typeDefinition);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.Parameter.Properties.engineeringUnit);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.Parameter.Properties.configured);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.Parameter.Properties.guardCondition);
		
		
		composer = new PartComposer(parameterStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == FunctionalResourceModelViewsRepository.Parameter.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.Parameter.Properties.semanticDefinition) {
					return createSemanticDefinitionTextarea(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.Parameter.Properties.classifier) {
					return createClassifierText(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.Parameter.Properties.stringIdentifier) {
					return createStringIdentifierText(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.Parameter.Properties.version) {
					return createVersionText(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.Parameter.Properties.creationDate) {
					return createCreationDateText(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.Parameter.Properties.authorizingEntity) {
					return createAuthorizingEntityText(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.Parameter.Properties.oidBit) {
					return createOidBitText(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.Parameter.Properties.deprecated) {
					return createDeprecatedCheckbox(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.Parameter.Properties.typeDefinition) {
					return createTypeDefinitionTextarea(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.Parameter.Properties.engineeringUnit) {
					return createEngineeringUnitText(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.Parameter.Properties.configured) {
					return createConfiguredCheckbox(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.Parameter.Properties.guardCondition) {
					return createGuardConditionTextarea(parent);
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
		propertiesGroup.setText(FunctionalResourceModelMessages.ParameterPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createSemanticDefinitionTextarea(Composite parent) {
		Label semanticDefinitionLabel = createDescription(parent, FunctionalResourceModelViewsRepository.Parameter.Properties.semanticDefinition, FunctionalResourceModelMessages.ParameterPropertiesEditionPart_SemanticDefinitionLabel);
		GridData semanticDefinitionLabelData = new GridData(GridData.FILL_HORIZONTAL);
		semanticDefinitionLabelData.horizontalSpan = 3;
		semanticDefinitionLabel.setLayoutData(semanticDefinitionLabelData);
		semanticDefinition = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL);
		GridData semanticDefinitionData = new GridData(GridData.FILL_HORIZONTAL);
		semanticDefinitionData.horizontalSpan = 2;
		semanticDefinitionData.heightHint=160;
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
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.Parameter.Properties.semanticDefinition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, semanticDefinition.getText()));
			}

		});
		EditingUtils.setID(semanticDefinition, FunctionalResourceModelViewsRepository.Parameter.Properties.semanticDefinition);
		EditingUtils.setEEFtype(semanticDefinition, "eef::Textarea"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.Parameter.Properties.semanticDefinition, FunctionalResourceModelViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createSemanticDefinitionTextArea

		// End of user code
		return parent;
	}

	
	protected Composite createClassifierText(Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.Parameter.Properties.classifier, FunctionalResourceModelMessages.ParameterPropertiesEditionPart_ClassifierLabel);
		classifier = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData classifierData = new GridData(GridData.FILL_HORIZONTAL);
		classifier.setLayoutData(classifierData);
		classifier.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.Parameter.Properties.classifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, classifier.getText()));
			}

		});
		classifier.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.Parameter.Properties.classifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, classifier.getText()));
				}
			}

		});
		EditingUtils.setID(classifier, FunctionalResourceModelViewsRepository.Parameter.Properties.classifier);
		EditingUtils.setEEFtype(classifier, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.Parameter.Properties.classifier, FunctionalResourceModelViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createClassifierText

		// End of user code
		return parent;
	}

	
	protected Composite createStringIdentifierText(Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.Parameter.Properties.stringIdentifier, FunctionalResourceModelMessages.ParameterPropertiesEditionPart_StringIdentifierLabel);
		stringIdentifier = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData stringIdentifierData = new GridData(GridData.FILL_HORIZONTAL);
		stringIdentifier.setLayoutData(stringIdentifierData);
		stringIdentifier.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.Parameter.Properties.stringIdentifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, stringIdentifier.getText()));
			}

		});
		stringIdentifier.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.Parameter.Properties.stringIdentifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, stringIdentifier.getText()));
				}
			}

		});
		EditingUtils.setID(stringIdentifier, FunctionalResourceModelViewsRepository.Parameter.Properties.stringIdentifier);
		EditingUtils.setEEFtype(stringIdentifier, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.Parameter.Properties.stringIdentifier, FunctionalResourceModelViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createStringIdentifierText

		// End of user code
		return parent;
	}

	
	protected Composite createVersionText(Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.Parameter.Properties.version, FunctionalResourceModelMessages.ParameterPropertiesEditionPart_VersionLabel);
		version = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData versionData = new GridData(GridData.FILL_HORIZONTAL);
		version.setLayoutData(versionData);
		version.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.Parameter.Properties.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
			}

		});
		version.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.Parameter.Properties.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
				}
			}

		});
		EditingUtils.setID(version, FunctionalResourceModelViewsRepository.Parameter.Properties.version);
		EditingUtils.setEEFtype(version, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.Parameter.Properties.version, FunctionalResourceModelViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createVersionText

		// End of user code
		return parent;
	}

	
	protected Composite createCreationDateText(Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.Parameter.Properties.creationDate, FunctionalResourceModelMessages.ParameterPropertiesEditionPart_CreationDateLabel);
		creationDate = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData creationDateData = new GridData(GridData.FILL_HORIZONTAL);
		creationDate.setLayoutData(creationDateData);
		creationDate.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.Parameter.Properties.creationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, creationDate.getText()));
			}

		});
		creationDate.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.Parameter.Properties.creationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, creationDate.getText()));
				}
			}

		});
		EditingUtils.setID(creationDate, FunctionalResourceModelViewsRepository.Parameter.Properties.creationDate);
		EditingUtils.setEEFtype(creationDate, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.Parameter.Properties.creationDate, FunctionalResourceModelViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createCreationDateText

		// End of user code
		return parent;
	}

	
	protected Composite createAuthorizingEntityText(Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.Parameter.Properties.authorizingEntity, FunctionalResourceModelMessages.ParameterPropertiesEditionPart_AuthorizingEntityLabel);
		authorizingEntity = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData authorizingEntityData = new GridData(GridData.FILL_HORIZONTAL);
		authorizingEntity.setLayoutData(authorizingEntityData);
		authorizingEntity.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.Parameter.Properties.authorizingEntity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, authorizingEntity.getText()));
			}

		});
		authorizingEntity.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.Parameter.Properties.authorizingEntity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, authorizingEntity.getText()));
				}
			}

		});
		EditingUtils.setID(authorizingEntity, FunctionalResourceModelViewsRepository.Parameter.Properties.authorizingEntity);
		EditingUtils.setEEFtype(authorizingEntity, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.Parameter.Properties.authorizingEntity, FunctionalResourceModelViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createAuthorizingEntityText

		// End of user code
		return parent;
	}

	
	protected Composite createOidBitText(Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.Parameter.Properties.oidBit, FunctionalResourceModelMessages.ParameterPropertiesEditionPart_OidBitLabel);
		oidBit = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData oidBitData = new GridData(GridData.FILL_HORIZONTAL);
		oidBit.setLayoutData(oidBitData);
		oidBit.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.Parameter.Properties.oidBit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, oidBit.getText()));
			}

		});
		oidBit.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.Parameter.Properties.oidBit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, oidBit.getText()));
				}
			}

		});
		EditingUtils.setID(oidBit, FunctionalResourceModelViewsRepository.Parameter.Properties.oidBit);
		EditingUtils.setEEFtype(oidBit, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.Parameter.Properties.oidBit, FunctionalResourceModelViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createOidBitText

		// End of user code
		return parent;
	}

	
	protected Composite createDeprecatedCheckbox(Composite parent) {
		deprecated = new Button(parent, SWT.CHECK);
		deprecated.setText(getDescription(FunctionalResourceModelViewsRepository.Parameter.Properties.deprecated, FunctionalResourceModelMessages.ParameterPropertiesEditionPart_DeprecatedLabel));
		deprecated.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.Parameter.Properties.deprecated, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(deprecated.getSelection())));
			}

		});
		GridData deprecatedData = new GridData(GridData.FILL_HORIZONTAL);
		deprecatedData.horizontalSpan = 2;
		deprecated.setLayoutData(deprecatedData);
		EditingUtils.setID(deprecated, FunctionalResourceModelViewsRepository.Parameter.Properties.deprecated);
		EditingUtils.setEEFtype(deprecated, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.Parameter.Properties.deprecated, FunctionalResourceModelViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createDeprecatedCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createTypeDefinitionTextarea(Composite parent) {
		Label typeDefinitionLabel = createDescription(parent, FunctionalResourceModelViewsRepository.Parameter.Properties.typeDefinition, FunctionalResourceModelMessages.ParameterPropertiesEditionPart_TypeDefinitionLabel);
		GridData typeDefinitionLabelData = new GridData(GridData.FILL_HORIZONTAL);
		typeDefinitionLabelData.horizontalSpan = 3;
		typeDefinitionLabel.setLayoutData(typeDefinitionLabelData);
		typeDefinition = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL);
		GridData typeDefinitionData = new GridData(GridData.FILL_HORIZONTAL);
		typeDefinitionData.horizontalSpan = 2;
		typeDefinitionData.heightHint=160;
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
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.Parameter.Properties.typeDefinition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, typeDefinition.getText()));
			}

		});
		EditingUtils.setID(typeDefinition, FunctionalResourceModelViewsRepository.Parameter.Properties.typeDefinition);
		EditingUtils.setEEFtype(typeDefinition, "eef::Textarea"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.Parameter.Properties.typeDefinition, FunctionalResourceModelViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTypeDefinitionTextArea

		// End of user code
		return parent;
	}

	
	protected Composite createEngineeringUnitText(Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.Parameter.Properties.engineeringUnit, FunctionalResourceModelMessages.ParameterPropertiesEditionPart_EngineeringUnitLabel);
		engineeringUnit = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData engineeringUnitData = new GridData(GridData.FILL_HORIZONTAL);
		engineeringUnit.setLayoutData(engineeringUnitData);
		engineeringUnit.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.Parameter.Properties.engineeringUnit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, engineeringUnit.getText()));
			}

		});
		engineeringUnit.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.Parameter.Properties.engineeringUnit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, engineeringUnit.getText()));
				}
			}

		});
		EditingUtils.setID(engineeringUnit, FunctionalResourceModelViewsRepository.Parameter.Properties.engineeringUnit);
		EditingUtils.setEEFtype(engineeringUnit, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.Parameter.Properties.engineeringUnit, FunctionalResourceModelViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createEngineeringUnitText

		// End of user code
		return parent;
	}

	
	protected Composite createConfiguredCheckbox(Composite parent) {
		configured = new Button(parent, SWT.CHECK);
		configured.setText(getDescription(FunctionalResourceModelViewsRepository.Parameter.Properties.configured, FunctionalResourceModelMessages.ParameterPropertiesEditionPart_ConfiguredLabel));
		configured.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.Parameter.Properties.configured, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(configured.getSelection())));
			}

		});
		GridData configuredData = new GridData(GridData.FILL_HORIZONTAL);
		configuredData.horizontalSpan = 2;
		configured.setLayoutData(configuredData);
		EditingUtils.setID(configured, FunctionalResourceModelViewsRepository.Parameter.Properties.configured);
		EditingUtils.setEEFtype(configured, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.Parameter.Properties.configured, FunctionalResourceModelViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createConfiguredCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createGuardConditionTextarea(Composite parent) {
		Label guardConditionLabel = createDescription(parent, FunctionalResourceModelViewsRepository.Parameter.Properties.guardCondition, FunctionalResourceModelMessages.ParameterPropertiesEditionPart_GuardConditionLabel);
		GridData guardConditionLabelData = new GridData(GridData.FILL_HORIZONTAL);
		guardConditionLabelData.horizontalSpan = 3;
		guardConditionLabel.setLayoutData(guardConditionLabelData);
		guardCondition = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL);
		GridData guardConditionData = new GridData(GridData.FILL_HORIZONTAL);
		guardConditionData.horizontalSpan = 2;
		guardConditionData.heightHint=160;
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
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.Parameter.Properties.guardCondition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, guardCondition.getText()));
			}

		});
		EditingUtils.setID(guardCondition, FunctionalResourceModelViewsRepository.Parameter.Properties.guardCondition);
		EditingUtils.setEEFtype(guardCondition, "eef::Textarea"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.Parameter.Properties.guardCondition, FunctionalResourceModelViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see ccsds.FunctionalResourceModel.parts.ParameterPropertiesEditionPart#getClassifier()
	 * 
	 */
	public String getClassifier() {
		return classifier.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ParameterPropertiesEditionPart#setClassifier(String newValue)
	 * 
	 */
	public void setClassifier(String newValue) {
		if (newValue != null) {
			classifier.setText(newValue);
		} else {
			classifier.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.Parameter.Properties.classifier);
		if (eefElementEditorReadOnlyState && classifier.isEnabled()) {
			classifier.setEnabled(false);
			classifier.setToolTipText(FunctionalResourceModelMessages.Parameter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !classifier.isEnabled()) {
			classifier.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ParameterPropertiesEditionPart#getStringIdentifier()
	 * 
	 */
	public String getStringIdentifier() {
		return stringIdentifier.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.ParameterPropertiesEditionPart#setStringIdentifier(String newValue)
	 * 
	 */
	public void setStringIdentifier(String newValue) {
		if (newValue != null) {
			stringIdentifier.setText(newValue);
		} else {
			stringIdentifier.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.Parameter.Properties.stringIdentifier);
		if (eefElementEditorReadOnlyState && stringIdentifier.isEnabled()) {
			stringIdentifier.setEnabled(false);
			stringIdentifier.setToolTipText(FunctionalResourceModelMessages.Parameter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !stringIdentifier.isEnabled()) {
			stringIdentifier.setEnabled(true);
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
