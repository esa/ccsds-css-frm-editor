package ccsds.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

import ccsds.FunctionalResourceModel.FrModelElement;
import ccsds.FunctionalResourceModel.FunctionalResource;
import ccsds.FunctionalResourceModel.FunctionalResourceModel;
import ccsds.FunctionalResourceModel.FunctionalResourceModelPackage;
import ccsds.FunctionalResourceModel.presentation.FunctionalResourceModelEditor;


public class CreateAuthEntities extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		InputDialog dlg = new InputDialog(Display.getCurrent().getActiveShell(), 
				"Default Authorizing Entity", "Set Default Authorizing Entity", "CSTS WG", null);
		int nRet = dlg.open();
		if(nRet != InputDialog.OK) // OK
			return null;
		
		IEditorPart ep = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if(ep instanceof FunctionalResourceModelEditor) {
			FunctionalResourceModelEditor editor = (FunctionalResourceModelEditor)ep;
			FunctionalResourceModel frm = editor.getModel();
			
			updateAuthEntities(frm, editor.getEditingDomain(), dlg.getValue());
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
	
	private void updateAuthEntities(FunctionalResourceModel frm,
			EditingDomain domain, String entity) {
		
		CompoundCommand setAll = new MyCompoundCommand();
		setAll.setLabel("Set Authorizing Entities");
		
		// TODO use EMF visitor?
		for(FunctionalResource fr : frm.getFunctionalResource()) {
			if(fr.getAuthorizingEntity() == null ||
					fr.getAuthorizingEntity().length() == 0)
			{
				SetCommand setFrAuthEntitiyCmd = new SetCommand(domain, fr,
					fr.eClass().getEStructuralFeature(FunctionalResourceModelPackage.FR_MODEL_ELEMENT__AUTHORIZING_ENTITY),
					entity);
			
				setAll.append(setFrAuthEntitiyCmd);			
			}
			
			for(EObject o : fr.eContents()) {
				if(o instanceof FrModelElement) {
					FrModelElement m = (FrModelElement)o;
					if(m.getAuthorizingEntity() == null ||
							m.getAuthorizingEntity().length() == 0) {
					
						SetCommand setFrModelElOidCmd = new SetCommand(domain, m, 
							m.eClass().getEStructuralFeature(FunctionalResourceModelPackage.FR_MODEL_ELEMENT__AUTHORIZING_ENTITY),
							entity); 
					
						setAll.append(setFrModelElOidCmd);
					}
					
				}
			}			
		}
		// There are two issues with the command:
		// 1) after applying all items in the tree are selected and all nodes are expanded
		// 2) undo is extremely slow if all items are selected and the tree is expanded
		domain.getCommandStack().execute(setAll);
		
	}

}
