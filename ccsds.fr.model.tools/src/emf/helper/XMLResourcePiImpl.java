package emf.helper;

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
