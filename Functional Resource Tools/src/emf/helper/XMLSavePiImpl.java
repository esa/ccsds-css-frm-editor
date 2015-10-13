package emf.helper;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.impl.XMLSaveImpl;

public class XMLSavePiImpl extends XMLSaveImpl {

	public XMLSavePiImpl(XMLHelper helper) {
		super(helper);		
	}
	
	public void traverse(List<? extends EObject> contents) {
		if (!toDOM && declareXML) {
			doc.add("<?xml version=\"" + xmlVersion + "\" encoding=\"" + encoding + "\"?>");
			
			// TODO: generalize this for PIs
			doc.addLine();
			doc.add("<?xml-stylesheet href=\"frm.xsl\" type=\"text/xsl\" ?>");
			
			doc.addLine();
		}

		int size = contents.size();

		// Reserve a place to insert xmlns declarations after we know what they
		// all are.
		//
		Object mark;

		if (size == 1) {
			mark = writeTopObject(contents.get(0));
		} else {
			mark = writeTopObjects(contents);
		}
		if (!toDOM) {
			// Go back and add all the XMLNS stuff.
			//
			doc.resetToMark(mark);
		} else {
			currentNode = document.getDocumentElement();
		}
		addNamespaceDeclarations();
		addDoctypeInformation();
	}
}
