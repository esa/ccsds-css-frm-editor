package ccsds.handlers;

/*-
 * #%L
 * CCSDS Functional Resource Model Tools
 * %%
 * Copyright (C) 2022 European Space Agency
 * %%
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * #L%
 */

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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
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
import ccsds.FunctionalResourceModel.FunctionalResourceSet;
import ccsds.FunctionalResourceModel.FunctionalResourceStratum;
import ccsds.FunctionalResourceModel.Oid;
import ccsds.FunctionalResourceModel.Parameter;
import ccsds.FunctionalResourceModel.Qualifier;
import ccsds.FunctionalResourceModel.Value;
import ccsds.FunctionalResourceModel.presentation.FunctionalResourceModelEditor;
import ccsds.FunctionalResourceModel.provider.OidItemProvider;
import ccsds.fr.model.tools.Activator;
import ccsds.fr.type.model.NameTool;

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

	private final int OID_OFFSET_STEP = 1000;
	private final int OID_INITIAL = 1;


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

			if(setAll.isEmpty() == false){
				// There are two issues with the command:
				// 1) after applying all items in the tree are selected and all nodes are expanded
				// 2) undo is extremely slow if all items are selected and the tree is expanded
				editor.getEditingDomain().getCommandStack().execute(setAll);
			} else {
				Activator.getDefault().getLog().log(
						new Status(Status.INFO, Activator.PLUGIN_ID, "No OID or name updates found for " + 
				editor.getEditorInput().getName()));
			}
			
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
		
		// offset the FR Sets
		CompoundCommand setOidOffsets = new MyCompoundCommand();
		setOidOffsets.setLabel("Automatic FR Set OID offsets");
		offsetFrSets(domain, setOidOffsets, frm.getFunctionalResourceSet());
		domain.getCommandStack().execute(setOidOffsets); // do this before using the OID offsets
		
		// Iterate over the FR Sets hanging under FRM and update the OIDs
		for(FunctionalResourceStratum stratum : frm.getFunctionalResourceStratum()) {
			for(FunctionalResourceSet frs : stratum.getFunctionalResourceSet()) {
				updateOids(domain, "", frs.getOidOffset(), frs.getFunctionalResource().toArray(new FunctionalResource[0]),
						rootOid, ModelElementType.FR_OID_TYPE.getValue(), setAll);
			}
		}
		
		// Iterate over the FR Sets hanging under FRM and update the OIDs
		for(FunctionalResourceSet frs : frm.getFunctionalResourceSet()) {
			updateOids(domain, "", frs.getOidOffset(), frs.getFunctionalResource().toArray(new FunctionalResource[0]),
					rootOid, ModelElementType.FR_OID_TYPE.getValue(), setAll);
		}
		
		// update FRs hanging under FRM
		final int zeroOidOffset = 0;
		updateOids(domain, "", zeroOidOffset, frm.getFunctionalResource().toArray(new FunctionalResource[0]), 
				rootOid, ModelElementType.FR_OID_TYPE.getValue(), setAll);
	}

	/**
	 * Computes an OID offset to each of the given FR Sets in case the offset is still the default.
	 * The offset is computed by the position in the model and the highest already used offset.  
	 * @param domain					The editing domain to create commands
	 * @param setAll					The compound set command for all model actions
	 * @param functionalResourceSets	The FR Sets for whic the offset shall be computed
	 */
	private void offsetFrSets(EditingDomain editingDomain, CompoundCommand setAll,
			EList<FunctionalResourceSet> functionalResourceSets) {		
		int maxOidOffset = 0;
		
		// get the maximum used oid offset
		for(FunctionalResourceSet frs : functionalResourceSets) {
			if(frs.getOidOffset() > maxOidOffset) {
				maxOidOffset = frs.getOidOffset();
			}
		}
		
		// add oid offsets for FR Sets not having a valid (non default) oid offset
		int oidOffset = maxOidOffset + OID_OFFSET_STEP;
		for(FunctionalResourceSet frs : functionalResourceSets) {
			if(frs.getOidOffset() == 0 /* the default */) {
				SetCommand setCmd = new SetCommand(editingDomain, frs,
						frs.eClass().getEStructuralFeature(FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_SET__OID_OFFSET),
						oidOffset);
				
				Activator.getDefault().getLog().log(
						new Status(Status.INFO, Activator.PLUGIN_ID, "Update OID offset of FR Set " + frs.getName()
						+ " from " + frs.getOidOffset() + " to " + oidOffset));
				
				oidOffset += OID_OFFSET_STEP;		
				setAll.append(setCmd);												
			}
		}
	}


	/**
	 * Update the OIDs of the child parameters for the given model element
	 * use a sorted map with all parameters and adjust versions for parameters with same classifier (and oidbit?)  
	 * @param domain				the EMF editing domain
	 * @param parentName			the name of the parent element
	 * @param oidOffset 
	 * @param FrModelElement[] 		the model elements for which the OIDs shall be updated. Must be all of the same type!
	 * @param parentOid				the OID of the parent model element. May differ from m.getOid()!
	 * @param elementType			the type of the model elements (1: parameter, 2: event, 3: directive)
	 * @param setOids				the set command which will finally set the OIDs
	 */
	private void updateOids(EditingDomain domain, String parentName, int oidOffset, FrModelElement[] modelElements, Oid parentOid, int elementType,  CompoundCommand setOids) {
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
			
			//int mElementIndex = oidOffset;	// first parameter index in the OID to be used		
			LinkedHashMap<Integer, Integer > versionNextElementIndexMap = new LinkedHashMap<Integer, Integer>();			
			
			Iterator<String> paramIt = mElementMap.keySet().iterator();
			while(paramIt.hasNext()) {
				List<FrModelElement> mElementSameClassifier = mElementMap.get(paramIt.next());
				
				int version = 1; // first version to be used
				if(mElementSameClassifier.size() > 0) {
					version = mElementSameClassifier.get(0).getVersion(); // Initialise with the first user supplied value
				}
				
				// iterate over the element with the same classifier
				for(FrModelElement mElement : mElementSameClassifier) {
					int userVersion = mElement.getVersion(); // this destroys automatic version numbering, but takes into account the user specified version
					if(userVersion > version) {
						version = userVersion;
					}

					 // we can reuse the ID of version 1, later versions have the same ID, but a different 
					if(version  > 1 && versionNextElementIndexMap.get(1) != null) {
						int elementIdOffset = versionNextElementIndexMap.get(1);
						elementIdOffset = elementIdOffset - 1;
						versionNextElementIndexMap.put(version, elementIdOffset); // add the initial OID offset where to start
					} else if(versionNextElementIndexMap.containsKey(version) == false) {
						versionNextElementIndexMap.put(version, oidOffset); // add the initial OID offset where to start
					}
					
					
					// for logging, determine the type
					int oidFeatureId = FunctionalResourceModelPackage.FR_MODEL_ELEMENT__OID; // FR OID feature ID
					if(mElement instanceof FunctionalResource) {
						type = "Functional Resource";
					} else if(mElement instanceof Event) {
						type = "Event";
					} else if(mElement instanceof Directive) {
						type = "Directive";
					} else if(mElement instanceof Parameter) {
						type = "Parameter";
					} else if(mElement instanceof Qualifier || mElement instanceof Value) {
						type = mElement.getClass().getSimpleName();
						oidFeatureId = FunctionalResourceModelPackage.TYPED_ELEMENT__TYPE_OID;
					}
					
					Oid mElementOid = cloneOid(parentOid);

//					if(elementType != ModelElementType.FR_OID_TYPE.getValue()) // TODO: to keep the model extensible the FRs should have a type!
//						mElementOid.getOidBit().add(elementType);
					
					// add type for P/E/D 
					if(isPED(mElement)) {
						mElementOid.getOidBit().add(elementType);
					}

					
					
					// add the index as the actual ID of the element					
					mElementOid.getOidBit().add(versionNextElementIndexMap.get(version));
					
					// version type for P/E/D 
					if(isPED(mElement)) {
						mElementOid.getOidBit().add(version); // add the version as a suffix to the OID.
					}					
					
					// check if the element OID or the type OID require an update
					boolean oidUpdate = requiresOidUpdate(parentName, type, mElement, oidFeatureId, mElementOid);
					
					// handle the parameter typeOid
					setParameterTypeOid(domain, parentName, mElement, mElementOid, setOids);
					
					if(oidUpdate == true) {
						
						SetCommand setOidCmd = new SetCommand(domain, mElement, 
								mElement.eClass().getEStructuralFeature(oidFeatureId),
								mElementOid);
						setOids.append(setOidCmd);
						
						SetCommand setOidBitCmd = new SetCommand(domain, mElement, 
								mElement.eClass().getEStructuralFeature(FunctionalResourceModelPackage.FR_MODEL_ELEMENT__OID_BIT),
								versionNextElementIndexMap.get(version));
						setOids.append(setOidBitCmd);
						
						SetCommand setVersionCmd = new SetCommand(domain, mElement, 
								mElement.eClass().getEStructuralFeature(FunctionalResourceModelPackage.FR_MODEL_ELEMENT__VERSION),
								version);
						setOids.append(setVersionCmd);
					}
					
					// update the children of functional resources directives and events
					if(mElement instanceof FunctionalResource) {
						FunctionalResource fr = (FunctionalResource)mElement;
						updateOids(domain, fr.getClassifier(), OID_INITIAL, fr.getParameter().toArray(new FrModelElement[0]), 
								mElementOid,ModelElementType.PARAMETER_OID_TYPE.getValue(), setOids);
						updateOids(domain, fr.getClassifier(), OID_INITIAL, fr.getEvent().toArray(new FrModelElement[0]), 
								mElementOid, ModelElementType.EVENT_OID_TYPE.getValue(), setOids);
						updateOids(domain, fr.getClassifier(), OID_INITIAL, fr.getDirectives().toArray(new FrModelElement[0]), 
								mElementOid, ModelElementType.DIRECTIVE_OID_TYPE.getValue(), setOids);
						
					} else if(mElement instanceof Directive) {
						updateOids(domain, mElement.getClassifier(), OID_INITIAL, ((Directive)mElement).getQualifier().toArray(new FrModelElement[0]) ,
								mElementOid, ModelElementType.DIRECTIVE_OID_TYPE.getValue(), setOids);
					} else if(mElement instanceof Event) {
						updateOids(domain, mElement.getClassifier(), OID_INITIAL, ((Event)mElement).getValue().toArray(new FrModelElement[0]) ,
								mElementOid, ModelElementType.EVENT_OID_TYPE.getValue(), setOids);
					}
					
					int mElementIndex = versionNextElementIndexMap.get(version);
					mElementIndex++; // next element index
					versionNextElementIndexMap.put(version, mElementIndex);						

					version++; // go to the next version for elements having the same classifier
				} // end iteration over elements with same classifier
				
				// set the next element index according to the position along the dimension of the version
				
			} // end iteration over the element map, key: element classifier
		}
	}

	/**
	 * Return true if this element has an external type OID
	 * @param mElement
	 * @return
	 */
	private boolean hasExternalTypeOid(FrModelElement mElement) {
		try {
			EStructuralFeature f = mElement.eClass().getEStructuralFeature(FunctionalResourceModelPackage.TYPED_ELEMENT__EXTERNAL_TYPE_OID);
			if(mElement != null && f != null && mElement.eGet(f) != null) {
				return true;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	/**
	 * Sets the element type OID for this parameter if necessary into the setOids command
	 * @param domain		the editing domain for the mElement
	 * @param parent		the parent of mElement, used for logging
	 * @param mElement		the parameter 
	 * @param mElementOid	the element OID of the parameter
	 * @param setOids		the command finally performing the set
	 */
	private void setParameterTypeOid(EditingDomain domain, String  parentName, FrModelElement mElement, Oid mElementOid, CompoundCommand setOids) {
		if(mElement == null || mElement instanceof Parameter == false) {
			return;
		}		
		
		// no type OID if external type OID is there
		if(hasExternalTypeOid(mElement) == true) {
			return;
		}
		
		Oid parameterTypeOid = EcoreUtil.copy(mElementOid);
		parameterTypeOid.getOidBit().add(1);
		
		Oid currentTypeOid = ((Parameter)mElement).getTypeOid();
		
		if(currentTypeOid == null || 
				EcoreUtil.equals(currentTypeOid, parameterTypeOid) == false) {
			
			if(currentTypeOid != null) {
				Activator.getDefault().getLog().log(
						new Status(Status.INFO, Activator.PLUGIN_ID, "Update 'Type OID' from " + OidItemProvider.getOidStr(currentTypeOid)
						+ " to " + OidItemProvider.getOidStr(parameterTypeOid) 
						+ " for " + parentName + " / parameter " + mElement.getClassifier()));				
			} else {
				Activator.getDefault().getLog().log(
						new Status(Status.INFO, Activator.PLUGIN_ID, "Create 'Type OID' " + OidItemProvider.getOidStr(parameterTypeOid)
						+ " for " + parentName + " / parameter " + mElement.getClassifier()));
			}
			
			EStructuralFeature typeOidFeature = mElement.eClass().getEStructuralFeature(FunctionalResourceModelPackage.TYPED_ELEMENT__TYPE_OID);
			
			SetCommand setTypeOidCmd = new SetCommand(domain, mElement, 
					typeOidFeature,
					parameterTypeOid);
			setOids.append(setTypeOidCmd);
		}
	}


	/**
	 * Check if the model element is a P/E/D
	 * @param mElement
	 * @return true if the element is a P/E/D
	 */
	private boolean isPED(FrModelElement mElement) {
		if(mElement instanceof Parameter 
		|| mElement instanceof Directive
		|| mElement instanceof Event) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * Check if the OID for the given feature must be updated
	 * @param mElement
	 * @param oidFeatureId
	 * @param newOidValue
	 * @return true if the element OID is not set or different. true if this is type OID and there is no external type OID and the 
	 * type OID is not set of different.
	 */
	private boolean requiresOidUpdate(String parentName, String type, FrModelElement mElement, int oidFeatureId, Oid newOidValue) {
		try {
			String oidType = "'Element OID' (" + oidFeatureId + ")";
			
			// get the current OID for the give OID feature (element OID or type OID)
			Oid currentOid = (Oid) mElement.eGet(mElement.eClass().getEStructuralFeature(oidFeatureId));
			
			// typeOid are not added if there is an external typeOid
			if(oidFeatureId == FunctionalResourceModelPackage.TYPED_ELEMENT__TYPE_OID) {
				Object extTypeOid = mElement.eGet(mElement.eClass().getEStructuralFeature(FunctionalResourceModelPackage.TYPED_ELEMENT__EXTERNAL_TYPE_OID));
				if(extTypeOid != null) {
					return false;
				}
				oidType = "'Type OID' (" + oidFeatureId + ")";
			}
			
			if (currentOid == null) {
				Activator.getDefault().getLog().log(
						new Status(Status.INFO, Activator.PLUGIN_ID, "Create " + oidType + " for " + type + " " + parentName + " / "
								+ mElement.getStringIdentifier() + ": " + OidItemProvider.getOidStr(newOidValue)));
	
				return true;
			} else if (EcoreUtil.equals(currentOid, newOidValue) == false) {
				Activator.getDefault().getLog()
						.log(new Status(Status.INFO, Activator.PLUGIN_ID,
								"Updated " + oidType + " for " + type + " " + parentName + " / " + mElement.getClassifier()
										+ " from " + OidItemProvider.getOidStr(currentOid) + " to "
										+ OidItemProvider.getOidStr(newOidValue)));
				return true;
	
			}		
		} catch(Exception e) {
			Activator.getDefault().getLog().log(new Status(Status.ERROR, Activator.PLUGIN_ID, "Failed to get OID feature using ID " +
					oidFeatureId + " from " + mElement));
		}
		return false;
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
