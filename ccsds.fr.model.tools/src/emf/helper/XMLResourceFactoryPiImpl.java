package emf.helper;

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
