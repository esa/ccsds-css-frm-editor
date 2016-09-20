package ccsds.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import ccsds.tranform.FrModelTransformation;

public class TransformFrHandler extends AbstractHandler implements IHandler {

	/**
	 * Gets the filename of the Project Explorer and transforms Functional
	 * Resource Models to ecore models for the actual instances of the FRs.
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IFile file = getProjectExplorerSelection();
		if(file != null) {
			System.out.println("Transform " + file.getLocation().toPortableString());
			FrModelTransformation frTrans = new FrModelTransformation();
			frTrans.transformFrModel(file);
		}
		return null;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	/**
	 * Returns the current Project Explorer Selection as a file or null.
	 * @return
	 */
	private IFile getProjectExplorerSelection() {
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		try {
			IStructuredSelection structured = (IStructuredSelection)window.getSelectionService().getSelection();
			IFile file = (IFile) structured.getFirstElement();
			return file;
			
		} catch(Exception e) { 
		}
		
		return null;
	}
	
}
