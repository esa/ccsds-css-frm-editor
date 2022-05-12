package ccsds.fr.type.model;

/*-
 * #%L
 * CCSDS Functional Resource Type Model
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
