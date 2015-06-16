package ccsds.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
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
import functional_resource_transformation.Activator;

public class CreateParameterOidsHandler extends AbstractHandler implements IHandler {

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
		IEditorPart ep = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if(ep instanceof FunctionalResourceModelEditor) {
			FunctionalResourceModelEditor editor = (FunctionalResourceModelEditor)ep;
			FunctionalResourceModel frm = editor.getModel();
			updateFrmOids(frm, editor.getEditingDomain());
			
			
		}
		
		return null;
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
	private void updateFrmOids(FunctionalResourceModel frm, EditingDomain domain) {
		CompoundCommand setAll = new MyCompoundCommand();
		setAll.setLabel("Update Functional Resource OIDs from root OID");
		Oid rootOid = frm.getRootOid();
		if(rootOid == null) {
			// TODO: tell the user
			return;
		}
		
		for(FunctionalResource fr : frm.getFunctionalResource()) {
			Oid frOid = cloneOid(rootOid);
			frOid.getOidBit().add(fr.getOidBit());			
			SetCommand setFrOidCmd = new SetCommand(domain, fr,
					fr.eClass().getEStructuralFeature(FunctionalResourceModelPackage.FR_MODEL_ELEMENT__OID),
					frOid);
			setAll.append(setFrOidCmd);
			//fr.setOid(frOid);
			
			int parameterIndex = 1;
			int eventIndex = 1;
			int directiveIndex = 1;
			int currentOidBit = -1;
			
			for(EObject o : fr.eContents()) {
				if(o instanceof FrModelElement) {
					FrModelElement m = (FrModelElement)o;
					Oid childOid = cloneOid(rootOid);
					childOid.getOidBit().add(fr.getOidBit());
					
					// add the type: parameter(1) / event(2) / directive(3)
					if(m instanceof Parameter) {
						childOid.getOidBit().add(1);
						currentOidBit = parameterIndex;
						parameterIndex++;
					}
					else if(m instanceof Event) {
						childOid.getOidBit().add(2);
						currentOidBit = eventIndex;
						eventIndex++;
					}
					else if (m instanceof Directive) {
						childOid.getOidBit().add(3);
						currentOidBit = directiveIndex;
						directiveIndex++;
					}
					
					// add the identifier of the parameter itself
					if(currentOidBit == m.getOidBit()) {
						childOid.getOidBit().add(m.getOidBit());
					}
					else
					{
						int old = m.getOidBit();
						SetCommand setOidBit = new SetCommand(domain, m, 
								m.eClass().getEStructuralFeature(FunctionalResourceModelPackage.FR_MODEL_ELEMENT__OID_BIT),
								new Integer(currentOidBit));
						setAll.append(setOidBit);
						Activator.getDefault().getLog().log(new Status(Status.INFO, Activator.PLUGIN_ID,
								"Replaced OID bit for " + fr.getName() + " / " + m.getName() + " from " + old + " to " + currentOidBit));
						
						childOid.getOidBit().add(currentOidBit);
					}
					
					// add the version as a suffix to the OID
					childOid.getOidBit().add(m.getVersion());
					
					SetCommand setFrModelElOidCmd = new SetCommand(domain, m, 
							m.eClass().getEStructuralFeature(FunctionalResourceModelPackage.FR_MODEL_ELEMENT__OID),
							childOid);
					//Activator.getDefault().getLog().log(new Status(Status.INFO, Activator.PLUGIN_ID, ""));
					
					setAll.append(setFrModelElOidCmd);
					//m.setOid(childOid);
					
					
				}
			}			
		}
		// There are two issues with the command:
		// 1) after applying all items in the tree are selected and all nodes are expanded
		// 2) undo is extremely slow if all items are selected and the tree is expanded
		domain.getCommandStack().execute(setAll);
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
