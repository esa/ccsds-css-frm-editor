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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.FilteredTree;

import ccsds.FunctionalResourceModel.presentation.FunctionalResourceModelEditor;

/**
 * Class to handle the find request for the FR editor 
 */
public class FindHandler extends AbstractHandler implements IHandler {
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IEditorPart ep = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if(ep instanceof FunctionalResourceModelEditor) {
			FunctionalResourceModelEditor editor = (FunctionalResourceModelEditor)ep;
			
			try {
				Composite c = editor.getViewer().getControl().getParent().getParent();
				if(c instanceof FilteredTree) {
					FilteredTree ft = (FilteredTree)c;
					ft.getFilterControl().setFocus();
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.err.println("Not able to get FilteredTree composite");
			}
		}
		
		return null;	
	}
}
