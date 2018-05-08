/**
 * Generated with Acceleo
 */
package ccsds.FunctionalResourceModel.parts.impl;

// Start of user code for imports
import java.util.StringTokenizer;

import ccsds.FunctionalResourceModel.FunctionalResourceModelPackage;
import ccsds.FunctionalResourceModel.parts.FunctionalResourceModelViewsRepository;
import ccsds.FunctionalResourceModel.parts.OidPropertiesEditionPart;
import ccsds.FunctionalResourceModel.providers.FunctionalResourceModelMessages;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Text;

// End of user code

/**
 * 
 * 
 */
public class OidPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, OidPropertiesEditionPart {

	protected Text oidBit;
	protected Button editOidBit;
	protected EList oidBitList;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public OidPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence oidStep = new BindingCompositionSequence(propertiesEditionComponent);
		oidStep
			.addStep(FunctionalResourceModelViewsRepository.Oid.Properties.class)
			.addStep(FunctionalResourceModelViewsRepository.Oid.Properties.oidBit);
		
		
		composer = new PartComposer(oidStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == FunctionalResourceModelViewsRepository.Oid.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == FunctionalResourceModelViewsRepository.Oid.Properties.oidBit) {
					return createOidBitMultiValuedEditor(parent);
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
		propertiesGroup.setText(FunctionalResourceModelMessages.OidPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

//	protected Composite createOidBitMultiValuedEditor(Composite parent) {
//		oidBit = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.READ_ONLY);
//		GridData oidBitData = new GridData(GridData.FILL_HORIZONTAL);
//		oidBitData.horizontalSpan = 2;
//		oidBit.setLayoutData(oidBitData);
//		EditingUtils.setID(oidBit, FunctionalResourceModelViewsRepository.Oid.Properties.oidBit);
//		EditingUtils.setEEFtype(oidBit, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
//		editOidBit = new Button(parent, SWT.NONE);
//		editOidBit.setText(getDescription(FunctionalResourceModelViewsRepository.Oid.Properties.oidBit, FunctionalResourceModelMessages.OidPropertiesEditionPart_OidBitLabel));
//		GridData editOidBitData = new GridData();
//		editOidBit.setLayoutData(editOidBitData);
//		editOidBit.addSelectionListener(new SelectionAdapter() {
//
//			/**
//			 * {@inheritDoc}
//			 * 
//			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
//			 */
//			public void widgetSelected(SelectionEvent e) {
//				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
//						oidBit.getShell(), "Oid", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
//						oidBitList, FunctionalResourceModelPackage.eINSTANCE.getOid_OidBit().getEType(), null,
//						false, true, 
//						null, null);
//				if (dialog.open() == Window.OK) {
//					oidBitList = dialog.getResult();
//					if (oidBitList == null) {
//						oidBitList = new BasicEList();
//					}
//					oidBit.setText(oidBitList.toString());
//					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OidPropertiesEditionPartImpl.this, FunctionalResourceModelViewsRepository.Oid.Properties.oidBit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(oidBitList)));
//					setHasChanged(true);
//				}
//			}
//		});
//		EditingUtils.setID(editOidBit, FunctionalResourceModelViewsRepository.Oid.Properties.oidBit);
//		EditingUtils.setEEFtype(editOidBit, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
//		// Start of user code for createOidBitMultiValuedEditor
////////////////////
////////////////////		// End of user code
//		return parent;
//	}


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
	 * @see ccsds.FunctionalResourceModel.parts.OidPropertiesEditionPart#getOidBit()
	 * 
	 */
	public EList getOidBit() {
		return oidBitList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ccsds.FunctionalResourceModel.parts.OidPropertiesEditionPart#setOidBit(EList newValue)
	 * 
	 */
	public void setOidBit(EList newValue) {
		oidBitList = newValue;
		if (newValue != null) {
			oidBit.setText(oidBitList.toString());
		} else {
			oidBit.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FunctionalResourceModelViewsRepository.Oid.Properties.oidBit);
		if (eefElementEditorReadOnlyState && oidBit.isEnabled()) {
			oidBit.setEnabled(false);
			oidBit.setToolTipText(FunctionalResourceModelMessages.Oid_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !oidBit.isEnabled()) {
			oidBit.setEnabled(true);
		}	
		
	}

	public void addToOidBit(Object newValue) {
		oidBitList.add(newValue);
		if (newValue != null) {
			oidBit.setText(oidBitList.toString());
		} else {
			oidBit.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToOidBit(Object newValue) {
		oidBitList.remove(newValue);
		if (newValue != null) {
			oidBit.setText(oidBitList.toString());
		} else {
			oidBit.setText(""); //$NON-NLS-1$
		}
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return FunctionalResourceModelMessages.Oid_Part_Title;
	}

	// Start of user code additional methods
	/**
	 * Create an editor for the OIDs
	 * #hd# use this method in favour of the generated one.
	 * @param parent
	 * @return the composite on which the editor is created
	 */
	private Composite createOidBitMultiValuedEditor(Composite parent) {
		this.oidBit = new Text(parent, SWT.READ_ONLY);
		GridData oidData = new GridData(GridData.FILL_HORIZONTAL);
		oidBit.setLayoutData(oidData);
		
		return parent;
	}	
	// End of user code


}
