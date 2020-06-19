package ccsds.fr.type.model;

public class XmlAttribute {

	private String name;
	private String value;

	public XmlAttribute(String name, String value) {
		this.name = name;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return name + XmlHelper.EQUAL + XmlHelper.QUOT + value + XmlHelper.QUOT;
	}

	public String getName() {		
		return name;
	}

	public String getValue() {		
		return value;
	}
}
