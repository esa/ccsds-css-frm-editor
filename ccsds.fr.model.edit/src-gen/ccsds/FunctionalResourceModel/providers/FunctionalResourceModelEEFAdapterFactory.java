/**
 * Generated with Acceleo
 */
package ccsds.FunctionalResourceModel.providers;

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

}
