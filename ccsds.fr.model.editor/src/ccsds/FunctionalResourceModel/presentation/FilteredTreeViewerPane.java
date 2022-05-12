package ccsds.FunctionalResourceModel.presentation;

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

import org.eclipse.emf.common.ui.ViewerPane;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ViewForm;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;

/**
 * Little helper class to create a FiteredTree on a viewer pane.
 * This does not work with ViewerPane directly. ViewerPane checks if
 * the control has the ViewerPane as a parent. This is not the 
 * case for FilteredTree, which is itself derived from Composite and
 * is the parent of the control (the Tree). 
 */
public class FilteredTreeViewerPane extends ViewerPane {
	FilteredTree filteredTree = null;

	public FilteredTreeViewerPane(IWorkbenchPage page, IWorkbenchPart part) {
		super(page, part);
	}

	@Override
	public Viewer createViewer(Composite parent) {
		PatternFilter filter = new FrPatternFilter();
		filteredTree = new FilteredTree(parent, SWT.MULTI | SWT.V_SCROLL,
				filter, true);

		return filteredTree.getViewer();
	}

	// #hd# overridden to pass the FilteredTree as a composite.
	@Override
	public void createControl(Composite parent) {
		if (getControl() == null) {
			container = parent;

			// Create view form.
			// control = new ViewForm(parent, getStyle());
			control = new ViewForm(parent, SWT.NONE);
			control.addDisposeListener(new DisposeListener() {
				public void widgetDisposed(DisposeEvent event) {
					dispose();
				}
			});
			control.marginWidth = 0;
			control.marginHeight = 0;

			// Create a title bar.
			createTitleBar();

			viewer = createViewer(control);

			if (this.filteredTree != null) {
				control.setContent(this.filteredTree); 
				control.setTabList(new Control[] { this.filteredTree });
			} else {
				control.setContent(viewer.getControl());
				control.setTabList(new Control[] { viewer.getControl() });
			}

			// When the pane or any child gains focus, notify the workbench.
			control.addListener(SWT.Activate, this);
			hookFocus(control);
			if (this.filteredTree != null) {
				hookFocus(this.filteredTree);
			} else {
				hookFocus(viewer.getControl());
			}
		}
	}
}
