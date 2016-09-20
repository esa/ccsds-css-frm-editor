package ccsds.handlers;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

import ccsds.FunctionalResourceModel.Directive;
import ccsds.FunctionalResourceModel.Event;
import ccsds.FunctionalResourceModel.FrModelElement;
import ccsds.FunctionalResourceModel.FunctionalResource;
import ccsds.FunctionalResourceModel.FunctionalResourceModel;
import ccsds.FunctionalResourceModel.FunctionalResourceModelFactory;
import ccsds.FunctionalResourceModel.FunctionalResourceModelPackage;
import ccsds.FunctionalResourceModel.Oid;
import ccsds.FunctionalResourceModel.Parameter;
import ccsds.FunctionalResourceModel.presentation.FunctionalResourceModelEditor;
import ccsds.FunctionalResourceModel.provider.OidItemProvider;
import ccsds.fr.model.tools.Activator;
import ccsds.fr.model.tools.NameTool;

enum ModelElementType {
	FR_OID_TYPE(-1),
	PARAMETER_OID_TYPE(1),
	EVENT_OID_TYPE(2),
	DIRECTIVE_OID_TYPE(3);
	
	private int value;
	
	ModelElementType(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}

public class UpdateOidsNameHandler extends AbstractHandler implements IHandler {

	/**
	 * Creates Parameter OIDs from the root OID and the 
	 * - root OID
	 * - the OID Bit and
	 * - the version 
	 * of a parameter.
	 * Parameter
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IEditorPart ep = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if(ep instanceof FunctionalResourceModelEditor) {
			
			// to avoid losing data in a text field with focus
			Control currentFocus = Display.getCurrent().getFocusControl();
			if(currentFocus!= null && currentFocus.getParent() != null && currentFocus.getParent().getParent() != null) {
				Control parent = currentFocus.getParent().getParent();
				parent.setFocus();
			}
			
			FunctionalResourceModelEditor editor = (FunctionalResourceModelEditor)ep;
			FunctionalResourceModel frm = editor.getModel();
			
			CompoundCommand setAll = new MyCompoundCommand();
			updateFrmOids(frm, editor.getEditingDomain(), setAll);
			updateShortNames(frm, editor.getEditingDomain(), setAll);
			
			// There are two issues with the command:
			// 1) after applying all items in the tree are selected and all nodes are expanded
			// 2) undo is extremely slow if all items are selected and the tree is expanded
			editor.getEditingDomain().getCommandStack().execute(setAll);			
		}
		
		return null;
	}


	/**
	 * Update the short name of FR elements if it is not already set
	 * @param frm
	 * @param editingDomain
	 * @param setAll
	 */
	private void updateShortNames(EObject frm,
			EditingDomain editingDomain, CompoundCommand setAll) {
		
		for(EObject o : frm.eContents()) {
			if(o instanceof FrModelElement) {
				FrModelElement el = (FrModelElement)o;
				if(el.getClassifier() == null || el.getClassifier().length() == 0) {
					SetCommand setCmd = new SetCommand(editingDomain, el,
							el.eClass().getEStructuralFeature(FunctionalResourceModelPackage.FR_MODEL_ELEMENT__CLASSIFIER),
							NameTool.wellFormed(el.getStringIdentifier()));					
						setAll.append(setCmd);								
				}
				updateShortNames(el, editingDomain, setAll);
			}
		}
	}


	@Override
	public boolean isEnabled() {
		IEditorPart ep = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if(ep instanceof FunctionalResourceModelEditor) {
			return true;
		}
		return false;
	}

	/**
	 * Creates OIDs from the root OID and the 
	 * - root OID
	 * - the OID Bit and
	 * - the parameter version 
	 * of a parameter.
	 * Parameter
	 * @param frm
	 * @param editingDomain 
	 * @param commandStack 
	 */
	private void updateFrmOids(FunctionalResourceModel frm, EditingDomain domain, CompoundCommand setAll) {		
		setAll.setLabel("Update Functional Resource OIDs from root OID");
		Oid rootOid = frm.getRootOid();
		if(rootOid == null) {
			try {
				MessageBox msg = new MessageBox(Display.getCurrent().getActiveShell(), SWT.ICON_WARNING);
				msg.setText("Warning");
				msg.setMessage("Create root before calculating OIDs");
				msg.open();
			} catch (Exception e) {
				e.printStackTrace();
				System.err.println("No root OID - failed t create warning message");
			}
			return;
		}
		
		updateOids(domain, "", frm.getFunctionalResource().toArray(new FrModelElement[0]), 
				rootOid, ModelElementType.FR_OID_TYPE.getValue(), setAll);
	}

	/**
	 * Update the OIDs of the child parameters for the given model element
	 * use a sorted map with all parameters and adjust versions for parameters with same name (and oidbit?)  
	 * @param domain				the EMF editing domain
	 * @param parentName			the name of the parent element
	 * @param FrModelElement[] 		the model elements for which the OIDs shall be updated. Must be all of the same type!
	 * @param parentOid				the OID of the parent model element. May differ from m.getOid()!
	 * @param elementType			the type of the model elements (1: parameter, 2: event, 3: directive)
	 * @param setOids				the set command which will finally set the OIDs
	 */
	private void updateOids(EditingDomain domain, String parentName, FrModelElement[] modelElements, Oid parentOid, int elementType,  CompoundCommand setOids) {
		String type = "Unknown Type";
			
		if(modelElements != null) {

			// organise the elements by position and classifier. Elements (parameter, event or directive) with the same name must be distinguished by version 
			// LinkedHashMap preserves the order of insertion
			LinkedHashMap<String, List<FrModelElement> > mElementMap = new LinkedHashMap<String, List<FrModelElement> >();
			for(FrModelElement mElement : modelElements) {
				if(mElementMap.containsKey(mElement.getClassifier()) == false)
					mElementMap.put(mElement.getClassifier(), new LinkedList<FrModelElement>());
				mElementMap.get(mElement.getClassifier()).add(mElement);
			}
			
			filterExternalOids(mElementMap); // filter out external OIDs
			
			int mElementIndex = 1;	// first parameter index in the OID to be used		
			Iterator<String> paramIt = mElementMap.keySet().iterator();
			while(paramIt.hasNext()) {
				List<FrModelElement> mElementVersions = mElementMap.get(paramIt.next());
				int version = 1; // first version to be used
				for(FrModelElement mElement : mElementVersions) {
					version = mElement.getVersion(); // this destroys automatic version numbering, but takes into account the user specified version
					// for logging, determine the type
					if(mElement instanceof FunctionalResource) {
						type = "Functional Resource";
					} else if(mElement instanceof Event) {
						type = "Event";
					} else if(mElement instanceof Directive) {
						type = "Directive";
					} else if(mElement instanceof Parameter) {
						type = "Parameter";
					} else {
						continue; // no need for an OID for Directive/Qualifier and Event/Value
					}
					
					Oid mElementOid = cloneOid(parentOid);
					if(elementType != ModelElementType.FR_OID_TYPE.getValue()) // TODO: to keep the model extensible the FRs should have a type!
						mElementOid.getOidBit().add(elementType);
					mElementOid.getOidBit().add(mElementIndex);
					if(mElement instanceof FunctionalResource == false) // not for FRs themselves!
						mElementOid.getOidBit().add(version); // add the version as a suffix to the OID.				
					boolean oidUpdate = false;
					
					if(mElement.getOid() == null) {
						oidUpdate = true;
						Activator.getDefault().getLog().log(new Status(Status.INFO, Activator.PLUGIN_ID,
								"Created OID for " + type + " "
										+ parentName + " / " + mElement.getStringIdentifier() + ": " + OidItemProvider.getOidStr(mElementOid)));					
					}
					if(mElement.getOid() != null && EcoreUtil.equals(mElement.getOid(), mElementOid) == false) {
						oidUpdate = true;
						Activator.getDefault().getLog().log(new Status(Status.INFO, Activator.PLUGIN_ID,
								"Upated OID for " + type + " " 
										+ parentName + " / " + mElement.getStringIdentifier() + " from " + OidItemProvider.getOidStr(mElement.getOid())
										+ " to " + OidItemProvider.getOidStr(mElementOid)));					
					}
					
					if(oidUpdate == true) {
						SetCommand setParameterOidCmd = new SetCommand(domain, mElement, 
								mElement.eClass().getEStructuralFeature(FunctionalResourceModelPackage.FR_MODEL_ELEMENT__OID),
								mElementOid);
						setOids.append(setParameterOidCmd);
						
						SetCommand setParameterOidBitCmd = new SetCommand(domain, mElement, 
								mElement.eClass().getEStructuralFeature(FunctionalResourceModelPackage.FR_MODEL_ELEMENT__OID_BIT),
								mElementIndex);
						setOids.append(setParameterOidBitCmd);
						
						SetCommand setParameterVersionCmd = new SetCommand(domain, mElement, 
								mElement.eClass().getEStructuralFeature(FunctionalResourceModelPackage.FR_MODEL_ELEMENT__VERSION),
								version);
						setOids.append(setParameterVersionCmd);
					}
					
					// update the children of functional resources directives and events
					if(mElement instanceof FunctionalResource) {
						FunctionalResource fr = (FunctionalResource)mElement;
						updateOids(domain, fr.getClassifier(), fr.getParameter().toArray(new FrModelElement[0]), 
								mElementOid,ModelElementType.PARAMETER_OID_TYPE.getValue(), setOids);
						updateOids(domain, fr.getClassifier(), fr.getEvent().toArray(new FrModelElement[0]), 
								mElementOid, ModelElementType.EVENT_OID_TYPE.getValue(), setOids);
						updateOids(domain, fr.getClassifier(), fr.getDirectives().toArray(new FrModelElement[0]), 
								mElementOid, ModelElementType.DIRECTIVE_OID_TYPE.getValue(), setOids);
						
					} else if(mElement instanceof Directive) {
						updateOids(domain, mElement.getClassifier(), ((Directive)mElement).getQualifier().toArray(new FrModelElement[0]) ,
								mElementOid, ModelElementType.DIRECTIVE_OID_TYPE.getValue(), setOids);
					} else if(mElement instanceof Event) {
						updateOids(domain, mElement.getClassifier(), ((Event)mElement).getValue().toArray(new FrModelElement[0]) ,
								mElementOid, ModelElementType.EVENT_OID_TYPE.getValue(), setOids);
					}
					
					version++; // go to the next version
				}
				mElementIndex++; // next element index
			}
		}
	}
	
	/**
	 * Removes those model element lists from the map which contain external Oids 
	 * @param mElementMap
	 */
	private void filterExternalOids(LinkedHashMap<String, List<FrModelElement>> mElementMap) {
		Iterator<String> paramIt = mElementMap.keySet().iterator();
		while(paramIt.hasNext()) {
			boolean hasExternalOids = false;
			List<FrModelElement> mElementVersions = mElementMap.get(paramIt.next());
			for(FrModelElement mElement : mElementVersions) {
				if(mElement instanceof FunctionalResource) {
				} else if(mElement instanceof Event) {
					hasExternalOids = (((Event)mElement).getExternalOid() != null) ? true : false;					
				} else if(mElement instanceof Directive) {
				} else if(mElement instanceof Parameter) {					
					hasExternalOids = (((Parameter)mElement).getExternalOid() != null) ? true : false;					
				}
				if(hasExternalOids == true) {
					paramIt.remove();
					break;
				}
			}
		}		
	}


	/**
	 * Clones the given OID
	 * @param sourceOid
	 * @return
	 */
	private Oid cloneOid(Oid sourceOid) {
		Oid oid = FunctionalResourceModelFactory.eINSTANCE.createOid();
		for(int oidBit : sourceOid.getOidBit()) {
			oid.getOidBit().add(oidBit);
		}
		
		return oid;
	}	
}
