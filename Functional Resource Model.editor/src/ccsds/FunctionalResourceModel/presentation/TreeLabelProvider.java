package ccsds.FunctionalResourceModel.presentation;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.window.ToolTip;
import org.eclipse.swt.graphics.Image;

import ccsds.FunctionalResourceModel.Oid;
import ccsds.oids.OidTree;

/**
 *  A simple wrapper of the emf class to provide tooltips for some 
 *  items in the tree.
 */
public class TreeLabelProvider extends ColumnLabelProvider {

	AdapterFactoryLabelProvider adapterFactory;
	
	public TreeLabelProvider(AdapterFactoryLabelProvider af, ColumnViewer selectionViewer) {
		adapterFactory = af;
		ColumnViewerToolTipSupport.enableFor(selectionViewer, ToolTip.NO_RECREATE); // #hd# tooltip support
	}

	@Override
	public String getToolTipText(Object element) {		
		if(element instanceof Oid) {
			try {
				return OidTree.getInstance().getOidString(((Oid)element));
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public String getText(Object element) {		
		return adapterFactory.getText(element);
	}
	
	@Override
	public Image getImage(Object element) {		
		return adapterFactory.getImage(element);
	}
	
}
