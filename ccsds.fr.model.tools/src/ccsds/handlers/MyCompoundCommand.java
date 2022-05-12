package ccsds.handlers;

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

import java.util.Collection;

import org.eclipse.emf.common.command.CompoundCommand;

/**
 * The selection in the editor is set to all affected
 * object of the command - not what we want here. 
 */
class MyCompoundCommand extends CompoundCommand {
	public Collection<?> getAffectedObjects() {
		return null;
	}
}
