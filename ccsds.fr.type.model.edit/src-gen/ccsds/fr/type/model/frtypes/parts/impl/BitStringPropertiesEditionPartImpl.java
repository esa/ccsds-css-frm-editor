/**
 * Generated with Acceleo
 */
package ccsds.fr.type.model.frtypes.parts.impl;

// Start of user code for imports
import ccsds.fr.type.model.frtypes.parts.BitStringPropertiesEditionPart;
import ccsds.fr.type.model.frtypes.parts.FrtypesViewsRepository;

import ccsds.fr.type.model.frtypes.providers.FrtypesMessages;

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

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

// End of user code

/**
 * 
 * 
 */
public class BitStringPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, BitStringPropertiesEditionPart {

	protected ReferencesTable sizeConstraint;
	protected List<ViewerFilter> sizeConstraintBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> sizeConstraintFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public BitStringPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence bitStringStep = new BindingCompositionSequence(propertiesEditionComponent);
		bitStringStep
			.addStep(FrtypesViewsRepository.BitString.Properties.class)
			.addStep(FrtypesViewsRepository.BitString.Properties.sizeConstraint);
		
		
		composer = new PartComposer(bitStringStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == FrtypesViewsRepository.BitString.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == FrtypesViewsRepository.BitString.Properties.sizeConstraint) {
					return createSizeConstraintAdvancedTableComposition(parent);
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
		propertiesGroup.setText(FrtypesMessages.BitStringPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createSizeConstraintAdvancedTableComposition(Composite parent) {
		this.sizeConstraint = new ReferencesTable(getDescription(FrtypesViewsRepository.BitString.Properties.sizeConstraint, FrtypesMessages.BitStringPropertiesEditionPart_SizeConstraintLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BitStringPropertiesEditionPartImpl.this, FrtypesViewsRepository.BitString.Properties.sizeConstraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				sizeConstraint.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BitStringPropertiesEditionPartImpl.this, FrtypesViewsRepository.BitString.Properties.sizeConstraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				sizeConstraint.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BitStringPropertiesEditionPartImpl.this, FrtypesViewsRepository.BitString.Properties.sizeConstraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				sizeConstraint.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BitStringPropertiesEditionPartImpl.this, FrtypesViewsRepository.BitString.Properties.sizeConstraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				sizeConstraint.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.sizeConstraintFilters) {
			this.sizeConstraint.addFilter(filter);
		}
		this.sizeConstraint.setHelpText(propertiesEditionComponent.getHelpContent(FrtypesViewsRepository.BitString.Properties.sizeConstraint, FrtypesViewsRepository.SWT_KIND));
		this.sizeConstraint.createControls(parent);
		this.sizeConstraint.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BitStringPropertiesEditionPartImpl.this, FrtypesViewsRepository.BitString.Properties.sizeConstraint, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData sizeConstraintData = new GridData(GridData.FILL_HORIZONTAL);
		sizeConstraintData.horizontalSpan = 3;
		this.sizeConstraint.setLayoutData(sizeConstraintData);
		this.sizeConstraint.setLowerBound(0);
		this.sizeConstraint.setUpperBound(-1);
		sizeConstraint.setID(FrtypesViewsRepository.BitString.Properties.sizeConstraint);
		sizeConstraint.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createSizeConstraintAdvancedTableComposition

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
	 * @see ccsds.fr.type.model.frtypes.parts.BitStringPropertiesEditionPart#initSizeConstraint(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initSizeConstraint(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		sizeConstraint.setContentProvider(contentProvider);
		sizeConstraint.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(FrtypesViewsRepository.BitString.Properties.sizeConstraint);
		if (eefElementEditorReadOnlyState && sizeConstraint.isEnabled()) {
			sizeConstraint.setEnabled(false);
			sizeConstraint.setToolTipText(FrtypesMessages.BitString_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sizeConstraint.isEnabled()) {
			sizeConstraint.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.BitStringPropertiesEditionPart#updateSizeConstraint()
	 * 
	 */
	public void updateSizeConstraint() {
	sizeConstraint.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.BitStringPropertiesEditionPart#addFilterSizeConstraint(ViewerFilter filter)
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
	 * @see ccsds.fr.type.model.frtypes.parts.BitStringPropertiesEditionPart#addBusinessFilterSizeConstraint(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSizeConstraint(ViewerFilter filter) {
		sizeConstraintBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.BitStringPropertiesEditionPart#isContainedInSizeConstraintTable(EObject element)
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
		return FrtypesMessages.BitString_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
