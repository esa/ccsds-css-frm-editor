package ccsds.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import ccsds.fr.model.tools.FrUtility;
import ccsds.tranform.FrModelTransformation;

public class TransformFrHandler extends AbstractHandler implements IHandler {

	/**
	 * Gets the filename of the Project Explorer and transforms Functional
	 * Resource Models to ecore models for the actual instances of the FRs.
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IFile file = FrUtility.getProjectExplorerSelection();
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
}
