package ccsds.handlers;

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