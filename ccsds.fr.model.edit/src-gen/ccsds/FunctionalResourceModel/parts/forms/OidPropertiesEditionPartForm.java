/**
 * Generated with Acceleo
 */
package ccsds.FunctionalResourceModel.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import ccsds.FunctionalResourceModel.FunctionalResourceModelPackage;
import ccsds.FunctionalResourceModel.parts.FunctionalResourceModelViewsRepository;
import ccsds.FunctionalResourceModel.parts.OidPropertiesEditionPart;
import ccsds.FunctionalResourceModel.providers.FunctionalResourceModelMessages;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TableColumn;
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
public class OidPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, OidPropertiesEditionPart {

	protected Text oidBit;
	protected Button editOidBit;
	private EList oidBitList;



	/**
	 * For {@link ISection} use only.
	 */
	public OidPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public OidPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence oidStep = new BindingCompositionSequence(propertiesEditionComponent);
		oidStep
			.addStep(FunctionalResourceModelViewsRepository.Oid.Properties.class)
			.addStep(FunctionalResourceModelViewsRepository.Oid.Properties.oidBit);
		
		
		composer = new PartComposer(oidStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == FunctionalResourceModelViewsRepository.Oid.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == FunctionalResourceModelViewsRepository.Oid.Properties.oidBit) {
					return createOidBitMultiValuedEditor(widgetFactory, parent);
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
		propertiesSection.setText(FunctionalResourceModelMessages.OidPropertiesEditionPart_PropertiesGroupLabel);
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

	/**
	 * 
	 */
	protected Composite createOidBitMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		oidBit = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData oidBitData = new GridData(GridData.FILL_HORIZONTAL);
		oidBitData.horizontalSpan = 2;
		oidBit.setLayoutData(oidBitData);
		EditingUtils.setID(oidBit, FunctionalResourceModelViewsRepository.Oid.Properties.oidBit);
		EditingUtils.setEEFtype(oidBit, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editOidBit = widgetFactory.createButton(parent, getDescription(FunctionalResourceModelViewsRepository.Oid.Properties.oidBit, FunctionalResourceModelMessages.OidPropertiesEditionPart_OidBitLabel), SWT.NONE);
		GridData editOidBitData = new GridData();
		editOidBit.setLayoutData(editOidBitData);
		editOidBit.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						oidBit.getShell(), "Oid", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						oidBitList, FunctionalResourceModelPackage.eINSTANCE.getOid_OidBit().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					oidBitList = dialog.getResult();
					if (oidBitList == null) {
						oidBitList = new BasicEList();
					}
					oidBit.setText(oidBitList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OidPropertiesEditionPartForm.this, FunctionalResourceModelViewsRepository.Oid.Properties.oidBit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(oidBitList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editOidBit, FunctionalResourceModelViewsRepository.Oid.Properties.oidBit);
		EditingUtils.setEEFtype(editOidBit, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createOidBitMultiValuedEditor

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
	
	// End of user code


}
