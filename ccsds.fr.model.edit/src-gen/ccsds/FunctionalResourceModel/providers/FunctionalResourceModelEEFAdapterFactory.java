/**
 * Generated with Acceleo
 */
package ccsds.FunctionalResourceModel.providers;

/*-
 * #%L
 * CCSDS Functional Resource Model Edit
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

import ccsds.FunctionalResourceModel.util.FunctionalResourceModelAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;

/**
 * 
 * 
 */
public class FunctionalResourceModelEEFAdapterFactory extends FunctionalResourceModelAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see ccsds.FunctionalResourceModel.util.FunctionalResourceModelAdapterFactory#createFunctionalResourceModelAdapter()
	 * 
	 */
	public Adapter createFunctionalResourceModelAdapter() {
		return new FunctionalResourceModelPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see ccsds.FunctionalResourceModel.util.FunctionalResourceModelAdapterFactory#createFunctionalResourceStratumAdapter()
	 * 
	 */
	public Adapter createFunctionalResourceStratumAdapter() {
		return new FunctionalResourceStratumPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see ccsds.FunctionalResourceModel.util.FunctionalResourceModelAdapterFactory#createFunctionalResourceSetAdapter()
	 * 
	 */
	public Adapter createFunctionalResourceSetAdapter() {
		return new FunctionalResourceSetPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see ccsds.FunctionalResourceModel.util.FunctionalResourceModelAdapterFactory#createFrModelElementAdapter()
	 * 
	 */
	public Adapter createFrModelElementAdapter() {
		return new FrModelElementPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see ccsds.FunctionalResourceModel.util.FunctionalResourceModelAdapterFactory#createOidAdapter()
	 * 
	 */
	public Adapter createOidAdapter() {
		return new OidPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see ccsds.FunctionalResourceModel.util.FunctionalResourceModelAdapterFactory#createFunctionalResourceAdapter()
	 * 
	 */
	public Adapter createFunctionalResourceAdapter() {
		return new FunctionalResourcePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see ccsds.FunctionalResourceModel.util.FunctionalResourceModelAdapterFactory#createEventAdapter()
	 * 
	 */
	public Adapter createEventAdapter() {
		return new EventPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see ccsds.FunctionalResourceModel.util.FunctionalResourceModelAdapterFactory#createDirectiveAdapter()
	 * 
	 */
	public Adapter createDirectiveAdapter() {
		return new DirectivePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see ccsds.FunctionalResourceModel.util.FunctionalResourceModelAdapterFactory#createTypedElementAdapter()
	 * 
	 */
	public Adapter createTypedElementAdapter() {
		return new TypedElementPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see ccsds.FunctionalResourceModel.util.FunctionalResourceModelAdapterFactory#createParameterAdapter()
	 * 
	 */
	public Adapter createParameterAdapter() {
		return new ParameterPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see ccsds.FunctionalResourceModel.util.FunctionalResourceModelAdapterFactory#createValueAdapter()
	 * 
	 */
	public Adapter createValueAdapter() {
		return new ValuePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see ccsds.FunctionalResourceModel.util.FunctionalResourceModelAdapterFactory#createQualifierAdapter()
	 * 
	 */
	public Adapter createQualifierAdapter() {
		return new QualifierPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see ccsds.FunctionalResourceModel.util.FunctionalResourceModelAdapterFactory#createServiceAccessPointAdapter()
	 * 
	 */
	public Adapter createServiceAccessPointAdapter() {
		return new ServiceAccessPointPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see ccsds.FunctionalResourceModel.util.FunctionalResourceModelAdapterFactory#createAncillaryInterfaceAdapter()
	 * 
	 */
	public Adapter createAncillaryInterfaceAdapter() {
		return new AncillaryInterfacePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see ccsds.FunctionalResourceModel.util.FunctionalResourceModelAdapterFactory#createAnnotationAdapter()
	 * 
	 */
	public Adapter createAnnotationAdapter() {
		return new AnnotationPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see ccsds.FunctionalResourceModel.util.FunctionalResourceModelAdapterFactory#createDataUnitAdapter()
	 * 
	 */
	public Adapter createDataUnitAdapter() {
		return new DataUnitPropertiesEditionProvider();
	}

}
