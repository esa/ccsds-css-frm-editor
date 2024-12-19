package ccsds.fr.type.model;

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

/**
 * Utility class for naming 
 */
public class NameTool {

	/**
	 * Transforms the given string to a well formed name
	 * by eliminating " ,&/\\\" and leading '-' char. After such a character
	 * the name character is capitalised.
	 * @param name
	 * @return
	 */
	public static String wellFormed(String name) {
		if(name == null)
			return null;
		
		String forbidden = " ,&/\\\"";
		String result = "";
		String ucName = name.toUpperCase();
		boolean capitalize = true;
		
		// remove a leading hyphen
		while(name.length() > 0 && name.charAt(0) == '-') {
			name = name.substring(1);
		}
		
		for(int idx=0; idx<name.length(); idx++) {
			if(forbidden.indexOf(name.charAt(idx)) == -1) {
				if(capitalize == false) {
					result += name.charAt(idx);
				} else {					
					result += ucName.charAt(idx);
					capitalize = false;
				}
				
			} else {
				capitalize = true;
			}
		}
		return result;
	}
}
