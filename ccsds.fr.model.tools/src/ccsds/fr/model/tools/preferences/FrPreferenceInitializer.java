package ccsds.fr.model.tools.preferences;

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

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import ccsds.fr.model.tools.Activator;
import ccsds.fr.type.model.XmlHelper;

/**
 * Class used to initialize default preference values.
 */
public class FrPreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(FrPreferenceConstants.P_FRIM_GENERATION, false);
		store.setDefault(FrPreferenceConstants.P_GENERATE_CFGPARAMS_ONLY, true);
		store.setDefault(FrPreferenceConstants.P_PARAMS_SUBSTITUTION_GROUP, XmlHelper.FRM_CONFIG_PARAM);
		store.setDefault(FrPreferenceConstants.P_FRM_TARGET_NS, XmlHelper.FRM_NS);
		store.setDefault(FrPreferenceConstants.P_FRIM_TARGET_NS, XmlHelper.FRIM_NS);
	}

}
