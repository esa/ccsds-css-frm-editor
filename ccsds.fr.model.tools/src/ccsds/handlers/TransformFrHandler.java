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

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;

import ccsds.fr.utility.FrUtility;
import ccsds.tranform.FrModelTransformation;

public class TransformFrHandler extends AbstractHandler implements IHandler {

	/**
	 * Gets the filename of the Project Explorer and transforms Functional
	 * Resource Models to ecore models for the actual instances of the FRs.
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IFile file = FrUtility.getProjectExplorerSelection();
		if(file != null) {
			System.out.println("Transform " + file.getLocation().toPortableString());
			FrModelTransformation frTrans = new FrModelTransformation();
			frTrans.transformFrModel(file);
		}
		return null;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
