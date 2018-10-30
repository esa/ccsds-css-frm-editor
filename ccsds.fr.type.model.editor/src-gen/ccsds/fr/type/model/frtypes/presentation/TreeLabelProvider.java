package ccsds.fr.type.model.frtypes.presentation;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.window.ToolTip;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;

import ccsds.fr.type.model.frtypes.Asn1Writer;

/**
 *  A simple wrapper of the emf class to provide tooltips for some 
 *  items in the tree.
 */
public class TreeLabelProvider extends ColumnLabelProvider {

	private final Font tooltipFont = new Font(null,"Courier New",12, SWT.NONE);
	
	AdapterFactoryLabelProvider adapterFactory;
	
	public TreeLabelProvider(AdapterFactoryLabelProvider af, ColumnViewer selectionViewer) {
		adapterFactory = af;
		ColumnViewerToolTipSupport.enableFor(selectionViewer, ToolTip.NO_RECREATE); // #hd# tooltip support
	}

	@Override
	public String getToolTipText(Object element) {		
		if(element instanceof Asn1Writer) {
			StringBuffer asn1Buffer = new StringBuffer();
			((Asn1Writer)element).writeAsn1(0, asn1Buffer);
			
			return asn1Buffer.toString();
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
	
	@Override
	public Font getToolTipFont(Object object) {
		return this.tooltipFont;
	}
	
}
