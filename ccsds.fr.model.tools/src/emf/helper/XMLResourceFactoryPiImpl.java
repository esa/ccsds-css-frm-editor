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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

public class XMLResourceFactoryPiImpl extends XMLResourceFactoryImpl {
	  /**
	   * Creates an XMLResourceImpl and returns it.
	   */
	  @Override
	  public Resource createResource(URI uri)
	  {
	    return new XMLResourcePiImpl(uri);
	  }
}
