/**
 * Generated with Acceleo
 */
package ccsds.FunctionalResourceModel.parts.impl;

// Start of user code for imports
import ccsds.FunctionalResourceModel.parts.FunctionalResourceModelViewsRepository;
import ccsds.FunctionalResourceModel.parts.TypedElementPropertiesEditionPart;
import ccsds.FunctionalResourceModel.providers.FunctionalResourceModelMessages;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

// End of user code

/**
 * 
 * 
 */
public class TypedElementPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, TypedElementPropertiesEditionPart {

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
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TypedElementPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
					return createPropertiesGroup(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.TypedElement.Properties.semanticDefinition) {
					return createSemanticDefinitionTextarea(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.TypedElement.Properties.classifier) {
					return createClassifierText(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.TypedElement.Properties.stringIdentifier) {
					return createStringIdentifierText(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.TypedElement.Properties.version) {
					return createVersionText(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.TypedElement.Properties.creationDate) {
					return createCreationDateText(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.TypedElement.Properties.authorizingEntity) {
					return createAuthorizingEntityText(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.TypedElement.Properties.oidBit) {
					return createOidBitText(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.TypedElement.Properties.deprecated) {
					return createDeprecatedCheckbox(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.TypedElement.Properties.annotation) {
					return createAnnotationAdvancedTableComposition(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.TypedElement.Properties.typeDefinition) {
					return createTypeDefinitionTextarea(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.TypedElement.Properties.engineeringUnit) {
					return createEngineeringUnitText(parent);
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
		propertiesGroup.setText(FunctionalResourceModelMessages.TypedElementPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createSemanticDefinitionTextarea(Composite parent) {
		Label semanticDefinitionLabel = createDescription(parent, FunctionalResourceModelViewsRepository.TypedElement.Properties.semanticDefinition, FunctionalResourceModelMessages.TypedElementPropertiesEditionPart_SemanticDefinitionLabel);
		GridData semanticDefinitionLabelData = new GridData(GridData.FILL_HORIZONTAL);
		semanticDefinitionLabelData.horizontalSpan = 3;
		semanticDefinitionLabel.setLayoutData(semanticDefinitionLabelData);
		semanticDefinition = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL);
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
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypedElementPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.TypedElement.Properties.semanticDefinition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, semanticDefinition.getText()));
			}

		});
		EditingUtils.setID(semanticDefinition, FunctionalResourceModelViewsRepository.TypedElement.Properties.semanticDefinition);
		EditingUtils.setEEFtype(semanticDefinition, "eef::Textarea"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.TypedElement.Properties.semanticDefinition, FunctionalResourceModelViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createSemanticDefinitionTextArea

		// End of user code
		return parent;
	}

	
	protected Composite createClassifierText(Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.TypedElement.Properties.classifier, FunctionalResourceModelMessages.TypedElementPropertiesEditionPart_ClassifierLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypedElementPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.TypedElement.Properties.classifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, classifier.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypedElementPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.TypedElement.Properties.classifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, classifier.getText()));
				}
			}

		});
		EditingUtils.setID(classifier, FunctionalResourceModelViewsRepository.TypedElement.Properties.classifier);
		EditingUtils.setEEFtype(classifier, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.TypedElement.Properties.classifier, FunctionalResourceModelViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createClassifierText

		// End of user code
		return parent;
	}

	
	protected Composite createStringIdentifierText(Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.TypedElement.Properties.stringIdentifier, FunctionalResourceModelMessages.TypedElementPropertiesEditionPart_StringIdentifierLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypedElementPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.TypedElement.Properties.stringIdentifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, stringIdentifier.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypedElementPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.TypedElement.Properties.stringIdentifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, stringIdentifier.getText()));
				}
			}

		});
		EditingUtils.setID(stringIdentifier, FunctionalResourceModelViewsRepository.TypedElement.Properties.stringIdentifier);
		EditingUtils.setEEFtype(stringIdentifier, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.TypedElement.Properties.stringIdentifier, FunctionalResourceModelViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createStringIdentifierText

		// End of user code
		return parent;
	}

	
	protected Composite createVersionText(Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.TypedElement.Properties.version, FunctionalResourceModelMessages.TypedElementPropertiesEditionPart_VersionLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypedElementPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.TypedElement.Properties.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypedElementPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.TypedElement.Properties.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
				}
			}

		});
		EditingUtils.setID(version, FunctionalResourceModelViewsRepository.TypedElement.Properties.version);
		EditingUtils.setEEFtype(version, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.TypedElement.Properties.version, FunctionalResourceModelViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createVersionText

		// End of user code
		return parent;
	}

	
	protected Composite createCreationDateText(Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.TypedElement.Properties.creationDate, FunctionalResourceModelMessages.TypedElementPropertiesEditionPart_CreationDateLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypedElementPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.TypedElement.Properties.creationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, creationDate.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypedElementPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.TypedElement.Properties.creationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, creationDate.getText()));
				}
			}

		});
		EditingUtils.setID(creationDate, FunctionalResourceModelViewsRepository.TypedElement.Properties.creationDate);
		EditingUtils.setEEFtype(creationDate, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.TypedElement.Properties.creationDate, FunctionalResourceModelViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createCreationDateText

		// End of user code
		return parent;
	}

	
	protected Composite createAuthorizingEntityText(Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.TypedElement.Properties.authorizingEntity, FunctionalResourceModelMessages.TypedElementPropertiesEditionPart_AuthorizingEntityLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypedElementPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.TypedElement.Properties.authorizingEntity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, authorizingEntity.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypedElementPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.TypedElement.Properties.authorizingEntity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, authorizingEntity.getText()));
				}
			}

		});
		EditingUtils.setID(authorizingEntity, FunctionalResourceModelViewsRepository.TypedElement.Properties.authorizingEntity);
		EditingUtils.setEEFtype(authorizingEntity, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.TypedElement.Properties.authorizingEntity, FunctionalResourceModelViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createAuthorizingEntityText

		// End of user code
		return parent;
	}

	
	protected Composite createOidBitText(Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.TypedElement.Properties.oidBit, FunctionalResourceModelMessages.TypedElementPropertiesEditionPart_OidBitLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypedElementPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.TypedElement.Properties.oidBit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, oidBit.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypedElementPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.TypedElement.Properties.oidBit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, oidBit.getText()));
				}
			}

		});
		EditingUtils.setID(oidBit, FunctionalResourceModelViewsRepository.TypedElement.Properties.oidBit);
		EditingUtils.setEEFtype(oidBit, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.TypedElement.Properties.oidBit, FunctionalResourceModelViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createOidBitText

		// End of user code
		return parent;
	}

	
	protected Composite createDeprecatedCheckbox(Composite parent) {
		deprecated = new Button(parent, SWT.CHECK);
		deprecated.setText(getDescription(FunctionalResourceModelViewsRepository.TypedElement.Properties.deprecated, FunctionalResourceModelMessages.TypedElementPropertiesEditionPart_DeprecatedLabel));
		deprecated.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypedElementPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.TypedElement.Properties.deprecated, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(deprecated.getSelection())));
			}

		});
		GridData deprecatedData = new GridData(GridData.FILL_HORIZONTAL);
		deprecatedData.horizontalSpan = 2;
		deprecated.setLayoutData(deprecatedData);
		EditingUtils.setID(deprecated, FunctionalResourceModelViewsRepository.TypedElement.Properties.deprecated);
		EditingUtils.setEEFtype(deprecated, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.TypedElement.Properties.deprecated, FunctionalResourceModelViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createDeprecatedCheckbox

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createAnnotationAdvancedTableComposition(Composite parent) {
		this.annotation = new ReferencesTable(getDescription(FunctionalResourceModelViewsRepository.TypedElement.Properties.annotation, FunctionalResourceModelMessages.TypedElementPropertiesEditionPart_AnnotationLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypedElementPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.TypedElement.Properties.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				annotation.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypedElementPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.TypedElement.Properties.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				annotation.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypedElementPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.TypedElement.Properties.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				annotation.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypedElementPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.TypedElement.Properties.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				annotation.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.annotationFilters) {
			this.annotation.addFilter(filter);
		}
		this.annotation.setHelpText(propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.TypedElement.Properties.annotation, FunctionalResourceModelViewsRepository.SWT_KIND));
		this.annotation.createControls(parent);
		this.annotation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypedElementPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.TypedElement.Properties.annotation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
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
		// Start of user code for createAnnotationAdvancedTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createTypeDefinitionTextarea(Composite parent) {
		Label typeDefinitionLabel = createDescription(parent, FunctionalResourceModelViewsRepository.TypedElement.Properties.typeDefinition, FunctionalResourceModelMessages.TypedElementPropertiesEditionPart_TypeDefinitionLabel);
		GridData typeDefinitionLabelData = new GridData(GridData.FILL_HORIZONTAL);
		typeDefinitionLabelData.horizontalSpan = 3;
		typeDefinitionLabel.setLayoutData(typeDefinitionLabelData);
		typeDefinition = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL);
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
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypedElementPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.TypedElement.Properties.typeDefinition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, typeDefinition.getText()));
			}

		});
		EditingUtils.setID(typeDefinition, FunctionalResourceModelViewsRepository.TypedElement.Properties.typeDefinition);
		EditingUtils.setEEFtype(typeDefinition, "eef::Textarea"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.TypedElement.Properties.typeDefinition, FunctionalResourceModelViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTypeDefinitionTextArea

		// End of user code
		return parent;
	}

	
	protected Composite createEngineeringUnitText(Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.TypedElement.Properties.engineeringUnit, FunctionalResourceModelMessages.TypedElementPropertiesEditionPart_EngineeringUnitLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypedElementPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.TypedElement.Properties.engineeringUnit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, engineeringUnit.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypedElementPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.TypedElement.Properties.engineeringUnit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, engineeringUnit.getText()));
				}
			}

		});
		EditingUtils.setID(engineeringUnit, FunctionalResourceModelViewsRepository.TypedElement.Properties.engineeringUnit);
		EditingUtils.setEEFtype(engineeringUnit, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.TypedElement.Properties.engineeringUnit, FunctionalResourceModelViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
