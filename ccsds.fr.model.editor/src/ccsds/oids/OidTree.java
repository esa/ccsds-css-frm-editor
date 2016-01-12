package ccsds.oids;

import ccsds.FunctionalResourceModel.Oid;

/**
 *  Represents an OID tree to translate numeric OIDs to 
 *  OIDs with labels attached to the numeric OID bits.
 */
public class OidTree {
	private static final char OID_SEP = '.';
	private static OidTree instance;
	private OidNode rootNode;
	
	/**
	 * Private constructor for initialisation 
	 */
	private OidTree() {		
		initialise();
	}
	
	/**
	 * Provides access to the OID tree.
	 * @return the instance of the OID tree
	 */
	public static synchronized OidTree getInstance() {
		if(instance == null)
			instance = new OidTree();
		return instance;
	}
	
	/**
	 * Returns an OID string for the given OID. Labels are added 
	 * to the numeric parts of the OIDs if available. 
	 * @param oid
	 * @return
	 */
	public String getOidString(Oid oid) {
		if(oid == null)
			return null;
		
		StringBuffer oidStr = new StringBuffer();
		
		OidNode node = rootNode;
		
		int index = 0;
		
		if(oid.getOidBit() == null || oid.getOidBit().size() == 0)
			return "";
		
		do {
			Integer oidBit = oid.getOidBit().get(index);

			if(node != null) {
				oidStr.append(node.toString(oidBit));
			} else {
				oidStr.append(oidBit.toString());
			}
			
			index++; // next oid bit			
			
			// get the next node of the current oid bit
			if(node != null && index < oid.getOidBit().size()) {
				oidBit = oid.getOidBit().get(index);
				node = node.getChildNode(oidBit);
			}
			
			oidStr.append(".");			 			 			
		} while(index < oid.getOidBit().size());
		
		// cut off the last . 
		if(oidStr.length() > 1 && oidStr.charAt(oidStr.length()-1) == OID_SEP)
			return oidStr.substring(0, oidStr.length()-1);
		
		return oidStr.toString();
	}
	
	/**
	 * Hard-coded initialisation of the Functional Resource OIDs with wildcards 
	 */
	private void initialise() {
		rootNode = new OidNode(1, "iso");
		OidNode identifiedOrganisation = rootNode.addChildNode(3, "identifiedOrganisation");
		OidNode css = identifiedOrganisation.addChildNode(112, "standard").addChildNode(4, "ccsds").addChildNode(4, "css");
		css.addChildNode(1, "csts").addChildNode(1, "framework").addChildNode(5, "serviceGenericIdentifiers");		
		OidNode crossSupprtResources = css.addChildNode(2, "crossSupportResources");
		css.addChildNode(3, "abstractServiceComponents");
		
		OidNode functionalResourcesGenericIdentifiers = crossSupprtResources.addChildNode(3, "functionalResourcesGenericIdentifiers");
		OidNode frVersion = functionalResourcesGenericIdentifiers.addChildNode(OidNode.OID_WILDCARD, "fr").
			addChildNode(OidNode.OID_WILDCARD, "version");
		
		frVersion.addChildNode(1, "parameter").addChildNode(OidNode.OID_WILDCARD, "number").addChildNode(OidNode.OID_WILDCARD, "version");
		frVersion.addChildNode(2, "event").addChildNode(OidNode.OID_WILDCARD, "number").addChildNode(OidNode.OID_WILDCARD, "version");
		frVersion.addChildNode(3, "directive").addChildNode(OidNode.OID_WILDCARD, "number").addChildNode(OidNode.OID_WILDCARD, "version");
		
		// System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		StringBuffer s = new StringBuffer();
		if(rootNode != null) {
			printNode(s, rootNode);
		} else {
			s.append("no root node!");
		}
		
		return s.toString();
	}

	/**
	 * Helper function to print the OID tree.
	 * @param s		the target the print is done to,
	 * @param node  the node to print 
	 */
	private void printNode(StringBuffer s, OidNode node) {
		s.append(node);
		s.append("\n");
		for(OidNode c : node.getChildNodes()) {
			printNode(s, c);
		}		
	}
	
}
