package ccsds.oids;

/*-
 * #%L
 * CCSDS Functional Resource Model Editor
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

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class OidNode {
	public static final int OID_WILDCARD = -1;
	private int oidBit;
	private String oidBitLabel;
	private Map<Integer, OidNode> childNodes = new HashMap<Integer, OidNode>();
	
	public OidNode(int oidBit) {
		this.oidBit = oidBit;
	}
	
	public OidNode(int oidBit, String oidBitLabel) {
		this.oidBit = oidBit;
		this.oidBitLabel = oidBitLabel;
	}
	
	public int getOidBit() {
		return oidBit;
	}
	
	public String getOidBitLable() {
		return oidBitLabel;
	}
	
	public String toString() {
		return this.toString(oidBit);
	}

	public String toString(int o) {
		if(oidBitLabel != null && oidBitLabel.length() > 0 &&
				(o == oidBit || oidBit == OID_WILDCARD)) {
			return oidBitLabel + "(" + o + ")";
		}
		
		return Integer.toString(o);
	}
	
	
	public OidNode getChildNode(int oidBit) {
		OidNode n = childNodes.get(oidBit);
		if(n == null) {
			n = childNodes.get(OID_WILDCARD); // return the wildcard if there is
		}
		
		return n;
	}
	
	public List<OidNode> getChildNodes() {
		List<OidNode> children = new LinkedList<OidNode>();
		for(int oidBit : childNodes.keySet())
			children.add(childNodes.get(oidBit));
		return children;
	}
	
	public void addChildNode(int oidBit) {
		childNodes.put(new Integer(oidBit), new OidNode(oidBit));
	}
	
	public OidNode addChildNode(int oidBit, String oidBitString) {
		OidNode childNode = new OidNode(oidBit, oidBitString); 
		childNodes.put(new Integer(oidBit), childNode);
		return childNode;
	}

	
}
