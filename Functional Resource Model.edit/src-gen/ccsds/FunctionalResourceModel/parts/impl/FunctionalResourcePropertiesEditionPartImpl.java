/**
 * Generated with Acceleo
 */
package ccsds.FunctionalResourceModel.parts.impl;

// Start of user code for imports
import ccsds.FunctionalResourceModel.parts.FunctionalResourceModelViewsRepository;
import ccsds.FunctionalResourceModel.parts.FunctionalResourcePropertiesEditionPart;

import ccsds.FunctionalResourceModel.providers.FunctionalResourceModelMessages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.IStructuredSelection;
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
public class FunctionalResourcePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, FunctionalResourcePropertiesEditionPart {

	protected Text semanticDefinition;
	protected Text oidBit;
	protected Button deprecated;
	protected Text authorizingEntity;
	protected Text creationDate;
	protected Text name;
	protected Text version;
	protected ReferencesTable events;
	protected List<ViewerFilter> eventsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> eventsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable directives;
	protected List<ViewerFilter> directivesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> directivesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable uses;
	protected List<ViewerFilter> usesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> usesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable parameter;
	protected List<ViewerFilter> parameterBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> parameterFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public FunctionalResourcePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence functionalResourceStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = functionalResourceStep.addStep(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.class);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.semanticDefinition);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.oidBit);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.deprecated);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.authorizingEntity);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.creationDate);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.name);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.version);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.events);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.directives);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.uses);
		propertiesStep.addStep(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.parameter);
		
		
		composer = new PartComposer(functionalResourceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == FunctionalResourceModelViewsRepository.FunctionalResource.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.FunctionalResource.Properties.semanticDefinition) {
					return createSemanticDefinitionText(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.FunctionalResource.Properties.oidBit) {
					return createOidBitText(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.FunctionalResource.Properties.deprecated) {
					return createDeprecatedCheckbox(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.FunctionalResource.Properties.authorizingEntity) {
					return createAuthorizingEntityText(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.FunctionalResource.Properties.creationDate) {
					return createCreationDateText(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.FunctionalResource.Properties.name) {
					return createNameText(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.FunctionalResource.Properties.version) {
					return createVersionText(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.FunctionalResource.Properties.events) {
					return createEventsAdvancedTableComposition(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.FunctionalResource.Properties.directives) {
					return createDirectivesAdvancedTableComposition(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.FunctionalResource.Properties.uses) {
					return createUsesAdvancedReferencesTable(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.FunctionalResource.Properties.parameter) {
					return createParameterAdvancedTableComposition(parent);
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
		propertiesGroup.setText(FunctionalResourceModelMessages.FunctionalResourcePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createSemanticDefinitionText(Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.semanticDefinition, FunctionalResourceModelMessages.FunctionalResourcePropertiesEditionPart_SemanticDefinitionLabel);
		semanticDefinition = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData semanticDefinitionData = new GridData(GridData.FILL_HORIZONTAL);
		semanticDefinition.setLayoutData(semanticDefinitionData);
		semanticDefinition.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourcePropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.semanticDefinition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, semanticDefinition.getText()));
			}

		});
		semanticDefinition.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourcePropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.semanticDefinition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, semanticDefinition.getText()));
				}
			}

		});
		EditingUtils.setID(semanticDefinition, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.semanticDefinition);
		EditingUtils.setEEFtype(semanticDefinition, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.semanticDefinition, FunctionalResourceModelViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createSemanticDefinitionText

		// End of user code
		return parent;
	}

	
	protected Composite createOidBitText(Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.oidBit, FunctionalResourceModelMessages.FunctionalResourcePropertiesEditionPart_OidBitLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourcePropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.oidBit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, oidBit.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourcePropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.oidBit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, oidBit.getText()));
				}
			}

		});
		EditingUtils.setID(oidBit, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.oidBit);
		EditingUtils.setEEFtype(oidBit, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.oidBit, FunctionalResourceModelViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createOidBitText

		// End of user code
		return parent;
	}

	
	protected Composite createDeprecatedCheckbox(Composite parent) {
		deprecated = new Button(parent, SWT.CHECK);
		deprecated.setText(getDescription(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.deprecated, FunctionalResourceModelMessages.FunctionalResourcePropertiesEditionPart_DeprecatedLabel));
		deprecated.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourcePropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.deprecated, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(deprecated.getSelection())));
			}

		});
		GridData deprecatedData = new GridData(GridData.FILL_HORIZONTAL);
		deprecatedData.horizontalSpan = 2;
		deprecated.setLayoutData(deprecatedData);
		EditingUtils.setID(deprecated, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.deprecated);
		EditingUtils.setEEFtype(deprecated, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.deprecated, FunctionalResourceModelViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createDeprecatedCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createAuthorizingEntityText(Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.authorizingEntity, FunctionalResourceModelMessages.FunctionalResourcePropertiesEditionPart_AuthorizingEntityLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourcePropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.authorizingEntity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, authorizingEntity.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourcePropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.authorizingEntity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, authorizingEntity.getText()));
				}
			}

		});
		EditingUtils.setID(authorizingEntity, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.authorizingEntity);
		EditingUtils.setEEFtype(authorizingEntity, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.authorizingEntity, FunctionalResourceModelViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createAuthorizingEntityText

		// End of user code
		return parent;
	}

	
	protected Composite createCreationDateText(Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.creationDate, FunctionalResourceModelMessages.FunctionalResourcePropertiesEditionPart_CreationDateLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourcePropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.creationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, creationDate.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourcePropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.creationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, creationDate.getText()));
				}
			}

		});
		EditingUtils.setID(creationDate, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.creationDate);
		EditingUtils.setEEFtype(creationDate, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.creationDate, FunctionalResourceModelViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createCreationDateText

		// End of user code
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.name, FunctionalResourceModelMessages.FunctionalResourcePropertiesEditionPart_NameLabel);
		name = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourcePropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourcePropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.name, FunctionalResourceModelViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createVersionText(Composite parent) {
		createDescription(parent, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.version, FunctionalResourceModelMessages.FunctionalResourcePropertiesEditionPart_VersionLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourcePropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourcePropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
				}
			}

		});
		EditingUtils.setID(version, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.version);
		EditingUtils.setEEFtype(version, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.version, FunctionalResourceModelViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createVersionText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createEventsAdvancedTableComposition(Composite parent) {
		this.events = new ReferencesTable(getDescription(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.events, FunctionalResourceModelMessages.FunctionalResourcePropertiesEditionPart_EventsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourcePropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.events, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				events.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourcePropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.events, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				events.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourcePropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.events, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				events.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourcePropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.events, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				events.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.eventsFilters) {
			this.events.addFilter(filter);
		}
		this.events.setHelpText(propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.events, FunctionalResourceModelViewsRepository.SWT_KIND));
		this.events.createControls(parent);
		this.events.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourcePropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.events, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData eventsData = new GridData(GridData.FILL_HORIZONTAL);
		eventsData.horizontalSpan = 3;
		this.events.setLayoutData(eventsData);
		this.events.setLowerBound(0);
		this.events.setUpperBound(-1);
		events.setID(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.events);
		events.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createEventsAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createDirectivesAdvancedTableComposition(Composite parent) {
		this.directives = new ReferencesTable(getDescription(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.directives, FunctionalResourceModelMessages.FunctionalResourcePropertiesEditionPart_DirectivesLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourcePropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.directives, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				directives.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourcePropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.directives, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				directives.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourcePropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.directives, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				directives.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourcePropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.directives, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				directives.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.directivesFilters) {
			this.directives.addFilter(filter);
		}
		this.directives.setHelpText(propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.directives, FunctionalResourceModelViewsRepository.SWT_KIND));
		this.directives.createControls(parent);
		this.directives.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourcePropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.directives, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData directivesData = new GridData(GridData.FILL_HORIZONTAL);
		directivesData.horizontalSpan = 3;
		this.directives.setLayoutData(directivesData);
		this.directives.setLowerBound(0);
		this.directives.setUpperBound(-1);
		directives.setID(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.directives);
		directives.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createDirectivesAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createUsesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.uses, FunctionalResourceModelMessages.FunctionalResourcePropertiesEditionPart_UsesLabel);		 
		this.uses = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addUses(); }
			public void handleEdit(EObject element) { editUses(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveUses(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromUses(element); }
			public void navigateTo(EObject element) { }
		});
		this.uses.setHelpText(propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.uses, FunctionalResourceModelViewsRepository.SWT_KIND));
		this.uses.createControls(parent);
		this.uses.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourcePropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.uses, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData usesData = new GridData(GridData.FILL_HORIZONTAL);
		usesData.horizontalSpan = 3;
		this.uses.setLayoutData(usesData);
		this.uses.disableMove();
		uses.setID(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.uses);
		uses.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addUses() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(uses.getInput(), usesFilters, usesBusinessFilters,
		"uses", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourcePropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.uses,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				uses.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveUses(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourcePropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.uses, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		uses.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromUses(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourcePropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.uses, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		uses.refresh();
	}

	/**
	 * 
	 */
	protected void editUses(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				uses.refresh();
			}
		}
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createParameterAdvancedTableComposition(Composite parent) {
		this.parameter = new ReferencesTable(getDescription(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.parameter, FunctionalResourceModelMessages.FunctionalResourcePropertiesEditionPart_ParameterLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourcePropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.parameter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				parameter.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourcePropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.parameter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				parameter.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourcePropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.parameter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				parameter.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourcePropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.parameter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				parameter.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.parameterFilters) {
			this.parameter.addFilter(filter);
		}
		this.parameter.setHelpText(propertiesEditionComponent.getHelpContent(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.parameter, FunctionalResourceModelViewsRepository.SWT_KIND));
		this.parameter.createControls(parent);
		this.parameter.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionalResourcePropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.FunctionalResource.Properties.parameter, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData parameterData = new GridData(GridData.FILL_HORIZONTAL);
		parameterData.horizontalSpan = 3;
		this.parameter.setLayoutData(parameterData);
		this.parameter.setLowerBound(0);
		this.parameter.setUpperBound(-1);
		parameter.setID(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.parameter);
		parameter.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createParameterAdvancedTableComposition

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
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourcePropertiesEditionPart#getSemanticDefinition()
	 * 
	 */
	public String getSemanticDefinition() {
		return semanticDefinition.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourcePropertiesEditionPart#setSemanticDefinition(String newValue)
	 * 
	 */
	public void setSemanticDefinition(String newValue) {
		if (newValue != null) {
			semanticDefinition.setText(newValue);
		} else {
			semanticDefinition.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.semanticDefinition);
		if (eefElementEditorReadOnlyState && semanticDefinition.isEnabled()) {
			semanticDefinition.setEnabled(false);
			semanticDefinition.setToolTipText(FunctionalResourceModelMessages.FunctionalResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !semanticDefinition.isEnabled()) {
			semanticDefinition.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourcePropertiesEditionPart#getOidBit()
	 * 
	 */
	public String getOidBit() {
		return oidBit.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourcePropertiesEditionPart#setOidBit(String newValue)
	 * 
	 */
	public void setOidBit(String newValue) {
		if (newValue != null) {
			oidBit.setText(newValue);
		} else {
			oidBit.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.oidBit);
		if (eefElementEditorReadOnlyState && oidBit.isEnabled()) {
			oidBit.setEnabled(false);
			oidBit.setToolTipText(FunctionalResourceModelMessages.FunctionalResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !oidBit.isEnabled()) {
			oidBit.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourcePropertiesEditionPart#getDeprecated()
	 * 
	 */
	public Boolean getDeprecated() {
		return Boolean.valueOf(deprecated.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourcePropertiesEditionPart#setDeprecated(Boolean newValue)
	 * 
	 */
	public void setDeprecated(Boolean newValue) {
		if (newValue != null) {
			deprecated.setSelection(newValue.booleanValue());
		} else {
			deprecated.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.deprecated);
		if (eefElementEditorReadOnlyState && deprecated.isEnabled()) {
			deprecated.setEnabled(false);
			deprecated.setToolTipText(FunctionalResourceModelMessages.FunctionalResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !deprecated.isEnabled()) {
			deprecated.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourcePropertiesEditionPart#getAuthorizingEntity()
	 * 
	 */
	public String getAuthorizingEntity() {
		return authorizingEntity.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourcePropertiesEditionPart#setAuthorizingEntity(String newValue)
	 * 
	 */
	public void setAuthorizingEntity(String newValue) {
		if (newValue != null) {
			authorizingEntity.setText(newValue);
		} else {
			authorizingEntity.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.authorizingEntity);
		if (eefElementEditorReadOnlyState && authorizingEntity.isEnabled()) {
			authorizingEntity.setEnabled(false);
			authorizingEntity.setToolTipText(FunctionalResourceModelMessages.FunctionalResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !authorizingEntity.isEnabled()) {
			authorizingEntity.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourcePropertiesEditionPart#getCreationDate()
	 * 
	 */
	public String getCreationDate() {
		return creationDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourcePropertiesEditionPart#setCreationDate(String newValue)
	 * 
	 */
	public void setCreationDate(String newValue) {
		if (newValue != null) {
			creationDate.setText(newValue);
		} else {
			creationDate.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.creationDate);
		if (eefElementEditorReadOnlyState && creationDate.isEnabled()) {
			creationDate.setEnabled(false);
			creationDate.setToolTipText(FunctionalResourceModelMessages.FunctionalResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !creationDate.isEnabled()) {
			creationDate.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourcePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourcePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(FunctionalResourceModelMessages.FunctionalResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourcePropertiesEditionPart#getVersion()
	 * 
	 */
	public String getVersion() {
		return version.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourcePropertiesEditionPart#setVersion(String newValue)
	 * 
	 */
	public void setVersion(String newValue) {
		if (newValue != null) {
			version.setText(newValue);
		} else {
			version.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.version);
		if (eefElementEditorReadOnlyState && version.isEnabled()) {
			version.setEnabled(false);
			version.setToolTipText(FunctionalResourceModelMessages.FunctionalResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !version.isEnabled()) {
			version.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourcePropertiesEditionPart#initEvents(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initEvents(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		events.setContentProvider(contentProvider);
		events.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.events);
		if (eefElementEditorReadOnlyState && events.isEnabled()) {
			events.setEnabled(false);
			events.setToolTipText(FunctionalResourceModelMessages.FunctionalResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !events.isEnabled()) {
			events.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourcePropertiesEditionPart#updateEvents()
	 * 
	 */
	public void updateEvents() {
	events.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourcePropertiesEditionPart#addFilterEvents(ViewerFilter filter)
	 * 
	 */
	public void addFilterToEvents(ViewerFilter filter) {
		eventsFilters.add(filter);
		if (this.events != null) {
			this.events.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourcePropertiesEditionPart#addBusinessFilterEvents(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToEvents(ViewerFilter filter) {
		eventsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourcePropertiesEditionPart#isContainedInEventsTable(EObject element)
	 * 
	 */
	public boolean isContainedInEventsTable(EObject element) {
		return ((ReferencesTableSettings)events.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourcePropertiesEditionPart#initDirectives(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initDirectives(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		directives.setContentProvider(contentProvider);
		directives.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.directives);
		if (eefElementEditorReadOnlyState && directives.isEnabled()) {
			directives.setEnabled(false);
			directives.setToolTipText(FunctionalResourceModelMessages.FunctionalResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !directives.isEnabled()) {
			directives.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourcePropertiesEditionPart#updateDirectives()
	 * 
	 */
	public void updateDirectives() {
	directives.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourcePropertiesEditionPart#addFilterDirectives(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDirectives(ViewerFilter filter) {
		directivesFilters.add(filter);
		if (this.directives != null) {
			this.directives.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourcePropertiesEditionPart#addBusinessFilterDirectives(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDirectives(ViewerFilter filter) {
		directivesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourcePropertiesEditionPart#isContainedInDirectivesTable(EObject element)
	 * 
	 */
	public boolean isContainedInDirectivesTable(EObject element) {
		return ((ReferencesTableSettings)directives.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourcePropertiesEditionPart#initUses(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initUses(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		uses.setContentProvider(contentProvider);
		uses.setInput(settings);
		usesBusinessFilters.clear();
		usesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.uses);
		if (eefElementEditorReadOnlyState && uses.getTable().isEnabled()) {
			uses.setEnabled(false);
			uses.setToolTipText(FunctionalResourceModelMessages.FunctionalResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !uses.getTable().isEnabled()) {
			uses.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourcePropertiesEditionPart#updateUses()
	 * 
	 */
	public void updateUses() {
	uses.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourcePropertiesEditionPart#addFilterUses(ViewerFilter filter)
	 * 
	 */
	public void addFilterToUses(ViewerFilter filter) {
		usesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourcePropertiesEditionPart#addBusinessFilterUses(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToUses(ViewerFilter filter) {
		usesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourcePropertiesEditionPart#isContainedInUsesTable(EObject element)
	 * 
	 */
	public boolean isContainedInUsesTable(EObject element) {
		return ((ReferencesTableSettings)uses.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourcePropertiesEditionPart#initParameter(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initParameter(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		parameter.setContentProvider(contentProvider);
		parameter.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.FunctionalResource.Properties.parameter);
		if (eefElementEditorReadOnlyState && parameter.isEnabled()) {
			parameter.setEnabled(false);
			parameter.setToolTipText(FunctionalResourceModelMessages.FunctionalResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parameter.isEnabled()) {
			parameter.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourcePropertiesEditionPart#updateParameter()
	 * 
	 */
	public void updateParameter() {
	parameter.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourcePropertiesEditionPart#addFilterParameter(ViewerFilter filter)
	 * 
	 */
	public void addFilterToParameter(ViewerFilter filter) {
		parameterFilters.add(filter);
		if (this.parameter != null) {
			this.parameter.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourcePropertiesEditionPart#addBusinessFilterParameter(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToParameter(ViewerFilter filter) {
		parameterBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.FunctionalResourcePropertiesEditionPart#isContainedInParameterTable(EObject element)
	 * 
	 */
	public boolean isContainedInParameterTable(EObject element) {
		return ((ReferencesTableSettings)parameter.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return FunctionalResourceModelMessages.FunctionalResource_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
