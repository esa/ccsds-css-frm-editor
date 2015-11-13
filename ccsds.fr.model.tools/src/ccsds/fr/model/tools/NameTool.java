package ccsds.fr.model.tools;

/**
 * Utility class for naming 
 */
public class NameTool {

	/**
	 * Transforms the given string to a well formed name
	 * by eliminating ' ' and '-' char. After such a character
	 * the name character is capitalised.
	 * @param name
	 * @return
	 */
	public static String wellFormed(String name) {
		if(name == null)
			return null;
		
		String forbidden = " -,&/\\";
		String result = "";
		String ucName = name.toUpperCase();
		boolean capitalize = true;
		
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
