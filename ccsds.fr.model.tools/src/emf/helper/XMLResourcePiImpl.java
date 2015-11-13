package emf.helper;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLSave;
//use XMI - handles attributes present in older versions:  xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI"
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl; 
//import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

public class XMLResourcePiImpl extends XMIResourceImpl {

	public XMLResourcePiImpl(URI uri) {
		super(uri);
	}

	@Override
	protected XMLSave createXMLSave()
	{
		return new XMLSavePiImpl(createXMLHelper());
  	}		
	
}
