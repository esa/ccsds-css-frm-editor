/**
 * Generated with Acceleo
 */
package ccsds.fr.type.model.frtypes.providers;

import ccsds.fr.type.model.frtypes.util.FrtypesAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;

/**
 * 
 * 
 */
public class FrtypesEEFAdapterFactory extends FrtypesAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see ccsds.fr.type.model.frtypes.util.FrtypesAdapterFactory#createTypeDefinitionAdapter()
	 * 
	 */
	public Adapter createTypeDefinitionAdapter() {
		return new TypeDefinitionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see ccsds.fr.type.model.frtypes.util.FrtypesAdapterFactory#createIntegerTypeAdapter()
	 * 
	 */
	public Adapter createIntegerTypeAdapter() {
		return new IntegerTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see ccsds.fr.type.model.frtypes.util.FrtypesAdapterFactory#createBitStringAdapter()
	 * 
	 */
	public Adapter createBitStringAdapter() {
		return new BitStringPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see ccsds.fr.type.model.frtypes.util.FrtypesAdapterFactory#createOctetStringAdapter()
	 * 
	 */
	public Adapter createOctetStringAdapter() {
		return new OctetStringPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see ccsds.fr.type.model.frtypes.util.FrtypesAdapterFactory#createRealAdapter()
	 * 
	 */
	public Adapter createRealAdapter() {
		return new RealPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see ccsds.fr.type.model.frtypes.util.FrtypesAdapterFactory#createEnumeratedAdapter()
	 * 
	 */
	public Adapter createEnumeratedAdapter() {
		return new EnumeratedPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see ccsds.fr.type.model.frtypes.util.FrtypesAdapterFactory#createCharacterStringAdapter()
	 * 
	 */
	public Adapter createCharacterStringAdapter() {
		return new CharacterStringPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see ccsds.fr.type.model.frtypes.util.FrtypesAdapterFactory#createSequenceAdapter()
	 * 
	 */
	public Adapter createSequenceAdapter() {
		return new SequencePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see ccsds.fr.type.model.frtypes.util.FrtypesAdapterFactory#createSequenceOfAdapter()
	 * 
	 */
	public Adapter createSequenceOfAdapter() {
		return new SequenceOfPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see ccsds.fr.type.model.frtypes.util.FrtypesAdapterFactory#createSetAdapter()
	 * 
	 */
	public Adapter createSetAdapter() {
		return new SetPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see ccsds.fr.type.model.frtypes.util.FrtypesAdapterFactory#createSetOfAdapter()
	 * 
	 */
	public Adapter createSetOfAdapter() {
		return new SetOfPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see ccsds.fr.type.model.frtypes.util.FrtypesAdapterFactory#createSizeConstraintAdapter()
	 * 
	 */
	public Adapter createSizeConstraintAdapter() {
		return new SizeConstraintPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see ccsds.fr.type.model.frtypes.util.FrtypesAdapterFactory#createValueRangeConstraintAdapter()
	 * 
	 */
	public Adapter createValueRangeConstraintAdapter() {
		return new ValueRangeConstraintPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see ccsds.fr.type.model.frtypes.util.FrtypesAdapterFactory#createNamedValueAdapter()
	 * 
	 */
	public Adapter createNamedValueAdapter() {
		return new NamedValuePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see ccsds.fr.type.model.frtypes.util.FrtypesAdapterFactory#createChoiceAdapter()
	 * 
	 */
	public Adapter createChoiceAdapter() {
		return new ChoicePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see ccsds.fr.type.model.frtypes.util.FrtypesAdapterFactory#createTypeReferenceLocalAdapter()
	 * 
	 */
	public Adapter createTypeReferenceLocalAdapter() {
		return new TypeReferenceLocalPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see ccsds.fr.type.model.frtypes.util.FrtypesAdapterFactory#createSingleValueConstraintAdapter()
	 * 
	 */
	public Adapter createSingleValueConstraintAdapter() {
		return new SingleValueConstraintPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see ccsds.fr.type.model.frtypes.util.FrtypesAdapterFactory#createPermittedAlphabetConstraintAdapter()
	 * 
	 */
	public Adapter createPermittedAlphabetConstraintAdapter() {
		return new PermittedAlphabetConstraintPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see ccsds.fr.type.model.frtypes.util.FrtypesAdapterFactory#createModuleAdapter()
	 * 
	 */
	public Adapter createModuleAdapter() {
		return new ModulePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see ccsds.fr.type.model.frtypes.util.FrtypesAdapterFactory#createComponentValueAdapter()
	 * 
	 */
	public Adapter createComponentValueAdapter() {
		return new ComponentValuePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see ccsds.fr.type.model.frtypes.util.FrtypesAdapterFactory#createTypeReferenceExternalAdapter()
	 * 
	 */
	public Adapter createTypeReferenceExternalAdapter() {
		return new TypeReferenceExternalPropertiesEditionProvider();
	}

}
