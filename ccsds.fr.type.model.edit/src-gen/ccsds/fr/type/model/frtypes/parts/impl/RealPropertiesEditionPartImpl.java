/**
 * Generated with Acceleo
 */
package ccsds.fr.type.model.frtypes.parts.impl;

// Start of user code for imports
import ccsds.fr.type.model.frtypes.parts.FrtypesViewsRepository;
import ccsds.fr.type.model.frtypes.parts.RealPropertiesEditionPart;

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
public class RealPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RealPropertiesEditionPart {

	protected ReferencesTable rangeConstraint;
	protected List<ViewerFilter> rangeConstraintBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> rangeConstraintFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RealPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence realStep = new BindingCompositionSequence(propertiesEditionComponent);
		realStep
			.addStep(FrtypesViewsRepository.Real.Properties.class)
			.addStep(FrtypesViewsRepository.Real.Properties.rangeConstraint);
		
		
		composer = new PartComposer(realStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == FrtypesViewsRepository.Real.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == FrtypesViewsRepository.Real.Properties.rangeConstraint) {
					return createRangeConstraintAdvancedTableComposition(parent);
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
		propertiesGroup.setText(FrtypesMessages.RealPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createRangeConstraintAdvancedTableComposition(Composite parent) {
		this.rangeConstraint = new ReferencesTable(getDescription(FrtypesViewsRepository.Real.Properties.rangeConstraint, FrtypesMessages.RealPropertiesEditionPart_RangeConstraintLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RealPropertiesEditionPartImpl.this, FrtypesViewsRepository.Real.Properties.rangeConstraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				rangeConstraint.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RealPropertiesEditionPartImpl.this, FrtypesViewsRepository.Real.Properties.rangeConstraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				rangeConstraint.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RealPropertiesEditionPartImpl.this, FrtypesViewsRepository.Real.Properties.rangeConstraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				rangeConstraint.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RealPropertiesEditionPartImpl.this, FrtypesViewsRepository.Real.Properties.rangeConstraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				rangeConstraint.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.rangeConstraintFilters) {
			this.rangeConstraint.addFilter(filter);
		}
		this.rangeConstraint.setHelpText(propertiesEditionComponent.getHelpContent(FrtypesViewsRepository.Real.Properties.rangeConstraint, FrtypesViewsRepository.SWT_KIND));
		this.rangeConstraint.createControls(parent);
		this.rangeConstraint.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RealPropertiesEditionPartImpl.this, FrtypesViewsRepository.Real.Properties.rangeConstraint, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData rangeConstraintData = new GridData(GridData.FILL_HORIZONTAL);
		rangeConstraintData.horizontalSpan = 3;
		this.rangeConstraint.setLayoutData(rangeConstraintData);
		this.rangeConstraint.setLowerBound(0);
		this.rangeConstraint.setUpperBound(-1);
		rangeConstraint.setID(FrtypesViewsRepository.Real.Properties.rangeConstraint);
		rangeConstraint.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createRangeConstraintAdvancedTableComposition

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
	 * @see ccsds.fr.type.model.frtypes.parts.RealPropertiesEditionPart#initRangeConstraint(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initRangeConstraint(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		rangeConstraint.setContentProvider(contentProvider);
		rangeConstraint.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(FrtypesViewsRepository.Real.Properties.rangeConstraint);
		if (eefElementEditorReadOnlyState && rangeConstraint.isEnabled()) {
			rangeConstraint.setEnabled(false);
			rangeConstraint.setToolTipText(FrtypesMessages.Real_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !rangeConstraint.isEnabled()) {
			rangeConstraint.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.RealPropertiesEditionPart#updateRangeConstraint()
	 * 
	 */
	public void updateRangeConstraint() {
	rangeConstraint.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.RealPropertiesEditionPart#addFilterRangeConstraint(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRangeConstraint(ViewerFilter filter) {
		rangeConstraintFilters.add(filter);
		if (this.rangeConstraint != null) {
			this.rangeConstraint.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.RealPropertiesEditionPart#addBusinessFilterRangeConstraint(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRangeConstraint(ViewerFilter filter) {
		rangeConstraintBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.fr.type.model.frtypes.parts.RealPropertiesEditionPart#isContainedInRangeConstraintTable(EObject element)
	 * 
	 */
	public boolean isContainedInRangeConstraintTable(EObject element) {
		return ((ReferencesTableSettings)rangeConstraint.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return FrtypesMessages.Real_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
