package ccsds.fr.model.tools;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import ccsds.FunctionalResourceModel.FunctionalResource;
import ccsds.FunctionalResourceModel.FunctionalResourceModel;
import ccsds.FunctionalResourceModel.FunctionalResourceSet;
import ccsds.FunctionalResourceModel.FunctionalResourceStratum;
import ccsds.FunctionalResourceModel.provider.FunctionalResourceModelItemProviderAdapterFactory;

/**
 * Helper class for FR related functions 
 */
public class FrUtility {

	/**
	 * Returns an ordered array of FRs as they appear in the model,
	 * no matter if they are directly under the model or within a
	 * FunctionalResourceSet
	 * @param frm
	 * @return The array of Functional resources
	 */
	public static FunctionalResource[] getFunctionalResources(FunctionalResourceModel frm) {
		List<FunctionalResource> frList = new LinkedList<FunctionalResource>();
		
		if(frm != null) {
			
			// add first the FRs in FR Strata
			for(FunctionalResourceStratum stratum : frm.getFunctionalResouceStratum()) {
				for(FunctionalResourceSet frs : stratum.getFunctionalResourceSet()) {
					for(FunctionalResource fr : frs.getFunctionalResource()) {
						frList.add(fr);
					}
				}
			}
			
			// add first the FRs in FR Sets hanging under FRM
			for(FunctionalResourceSet frs : frm.getFunctionalResourceSet()) {
				for(FunctionalResource fr : frs.getFunctionalResource()) {
					frList.add(fr);
				}
			}

			// Add second the FRs directly contained in the FRM under FRM
			for(FunctionalResource fr : frm.getFunctionalResource()) {
				frList.add(fr);
			}
		}
		
		
		return frList.toArray(new FunctionalResource[0]);
	}

	/**
	 * Loads a Functional Resource model from a file
	 * @param uri the URI denoting the FRM file
	 * @return	The loaded Functional Resource Model
	 * @throws IOException Thrown when loading the FRM from the file has an IO problem.
	 */
	public static FunctionalResourceModel loadFrm(String uri) throws IOException {
		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		adapterFactory
				.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new FunctionalResourceModelItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		AdapterFactoryEditingDomain domain = new AdapterFactoryEditingDomain(
				adapterFactory, new BasicCommandStack() /* we will not need the cmd stack... */ );

		Resource resource = domain.createResource(uri);
		try {
			resource.load(null);
			return (FunctionalResourceModel)resource.getContents().get(0);		
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		}	
	}
	
	/**
	 * Returns the current Project Explorer Selection as a file or null.
	 * @return
	 */
	public static IFile getProjectExplorerSelection() {
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
