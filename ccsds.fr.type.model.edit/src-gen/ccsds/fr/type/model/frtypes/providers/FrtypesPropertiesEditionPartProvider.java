/**
 * Generated with Acceleo
 */
package ccsds.fr.type.model.frtypes.providers;

import ccsds.fr.type.model.frtypes.parts.FrtypesViewsRepository;

import ccsds.fr.type.model.frtypes.parts.forms.BitStringPropertiesEditionPartForm;
import ccsds.fr.type.model.frtypes.parts.forms.Boolean_PropertiesEditionPartForm;
import ccsds.fr.type.model.frtypes.parts.forms.CharacterStringPropertiesEditionPartForm;
import ccsds.fr.type.model.frtypes.parts.forms.ChoicePropertiesEditionPartForm;
import ccsds.fr.type.model.frtypes.parts.forms.ElementPropertiesEditionPartForm;
import ccsds.fr.type.model.frtypes.parts.forms.EnumeratedPropertiesEditionPartForm;
import ccsds.fr.type.model.frtypes.parts.forms.FromModulePropertiesEditionPartForm;
import ccsds.fr.type.model.frtypes.parts.forms.IntegerTypePropertiesEditionPartForm;
import ccsds.fr.type.model.frtypes.parts.forms.ModulePropertiesEditionPartForm;
import ccsds.fr.type.model.frtypes.parts.forms.NamedValuePropertiesEditionPartForm;
import ccsds.fr.type.model.frtypes.parts.forms.NullPropertiesEditionPartForm;
import ccsds.fr.type.model.frtypes.parts.forms.ObjectIdentifierPropertiesEditionPartForm;
import ccsds.fr.type.model.frtypes.parts.forms.OctetStringPropertiesEditionPartForm;
import ccsds.fr.type.model.frtypes.parts.forms.PermittedAlphabetConstraintPropertiesEditionPartForm;
import ccsds.fr.type.model.frtypes.parts.forms.RealPropertiesEditionPartForm;
import ccsds.fr.type.model.frtypes.parts.forms.SequenceOfPropertiesEditionPartForm;
import ccsds.fr.type.model.frtypes.parts.forms.SequencePropertiesEditionPartForm;
import ccsds.fr.type.model.frtypes.parts.forms.SetOfPropertiesEditionPartForm;
import ccsds.fr.type.model.frtypes.parts.forms.SetPropertiesEditionPartForm;
import ccsds.fr.type.model.frtypes.parts.forms.SingleValueConstraintPropertiesEditionPartForm;
import ccsds.fr.type.model.frtypes.parts.forms.SizeConstraintPropertiesEditionPartForm;
import ccsds.fr.type.model.frtypes.parts.forms.TypeDefinitionPropertiesEditionPartForm;
import ccsds.fr.type.model.frtypes.parts.forms.TypeReferenceExternalPropertiesEditionPartForm;
import ccsds.fr.type.model.frtypes.parts.forms.TypeReferenceLocalPropertiesEditionPartForm;
import ccsds.fr.type.model.frtypes.parts.forms.ValueRangeConstraintPropertiesEditionPartForm;

import ccsds.fr.type.model.frtypes.parts.impl.BitStringPropertiesEditionPartImpl;
import ccsds.fr.type.model.frtypes.parts.impl.Boolean_PropertiesEditionPartImpl;
import ccsds.fr.type.model.frtypes.parts.impl.CharacterStringPropertiesEditionPartImpl;
import ccsds.fr.type.model.frtypes.parts.impl.ChoicePropertiesEditionPartImpl;
import ccsds.fr.type.model.frtypes.parts.impl.ElementPropertiesEditionPartImpl;
import ccsds.fr.type.model.frtypes.parts.impl.EnumeratedPropertiesEditionPartImpl;
import ccsds.fr.type.model.frtypes.parts.impl.FromModulePropertiesEditionPartImpl;
import ccsds.fr.type.model.frtypes.parts.impl.IntegerTypePropertiesEditionPartImpl;
import ccsds.fr.type.model.frtypes.parts.impl.ModulePropertiesEditionPartImpl;
import ccsds.fr.type.model.frtypes.parts.impl.NamedValuePropertiesEditionPartImpl;
import ccsds.fr.type.model.frtypes.parts.impl.NullPropertiesEditionPartImpl;
import ccsds.fr.type.model.frtypes.parts.impl.ObjectIdentifierPropertiesEditionPartImpl;
import ccsds.fr.type.model.frtypes.parts.impl.OctetStringPropertiesEditionPartImpl;
import ccsds.fr.type.model.frtypes.parts.impl.PermittedAlphabetConstraintPropertiesEditionPartImpl;
import ccsds.fr.type.model.frtypes.parts.impl.RealPropertiesEditionPartImpl;
import ccsds.fr.type.model.frtypes.parts.impl.SequenceOfPropertiesEditionPartImpl;
import ccsds.fr.type.model.frtypes.parts.impl.SequencePropertiesEditionPartImpl;
import ccsds.fr.type.model.frtypes.parts.impl.SetOfPropertiesEditionPartImpl;
import ccsds.fr.type.model.frtypes.parts.impl.SetPropertiesEditionPartImpl;
import ccsds.fr.type.model.frtypes.parts.impl.SingleValueConstraintPropertiesEditionPartImpl;
import ccsds.fr.type.model.frtypes.parts.impl.SizeConstraintPropertiesEditionPartImpl;
import ccsds.fr.type.model.frtypes.parts.impl.TypeDefinitionPropertiesEditionPartImpl;
import ccsds.fr.type.model.frtypes.parts.impl.TypeReferenceExternalPropertiesEditionPartImpl;
import ccsds.fr.type.model.frtypes.parts.impl.TypeReferenceLocalPropertiesEditionPartImpl;
import ccsds.fr.type.model.frtypes.parts.impl.ValueRangeConstraintPropertiesEditionPartImpl;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

/**
 * 
 * 
 */
public class FrtypesPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == FrtypesViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == FrtypesViewsRepository.TypeDefinition.class) {
			if (kind == FrtypesViewsRepository.SWT_KIND)
				return new TypeDefinitionPropertiesEditionPartImpl(component);
			if (kind == FrtypesViewsRepository.FORM_KIND)
				return new TypeDefinitionPropertiesEditionPartForm(component);
		}
		if (key == FrtypesViewsRepository.Boolean_.class) {
			if (kind == FrtypesViewsRepository.SWT_KIND)
				return new Boolean_PropertiesEditionPartImpl(component);
			if (kind == FrtypesViewsRepository.FORM_KIND)
				return new Boolean_PropertiesEditionPartForm(component);
		}
		if (key == FrtypesViewsRepository.IntegerType.class) {
			if (kind == FrtypesViewsRepository.SWT_KIND)
				return new IntegerTypePropertiesEditionPartImpl(component);
			if (kind == FrtypesViewsRepository.FORM_KIND)
				return new IntegerTypePropertiesEditionPartForm(component);
		}
		if (key == FrtypesViewsRepository.BitString.class) {
			if (kind == FrtypesViewsRepository.SWT_KIND)
				return new BitStringPropertiesEditionPartImpl(component);
			if (kind == FrtypesViewsRepository.FORM_KIND)
				return new BitStringPropertiesEditionPartForm(component);
		}
		if (key == FrtypesViewsRepository.OctetString.class) {
			if (kind == FrtypesViewsRepository.SWT_KIND)
				return new OctetStringPropertiesEditionPartImpl(component);
			if (kind == FrtypesViewsRepository.FORM_KIND)
				return new OctetStringPropertiesEditionPartForm(component);
		}
		if (key == FrtypesViewsRepository.Real.class) {
			if (kind == FrtypesViewsRepository.SWT_KIND)
				return new RealPropertiesEditionPartImpl(component);
			if (kind == FrtypesViewsRepository.FORM_KIND)
				return new RealPropertiesEditionPartForm(component);
		}
		if (key == FrtypesViewsRepository.Enumerated.class) {
			if (kind == FrtypesViewsRepository.SWT_KIND)
				return new EnumeratedPropertiesEditionPartImpl(component);
			if (kind == FrtypesViewsRepository.FORM_KIND)
				return new EnumeratedPropertiesEditionPartForm(component);
		}
		if (key == FrtypesViewsRepository.CharacterString.class) {
			if (kind == FrtypesViewsRepository.SWT_KIND)
				return new CharacterStringPropertiesEditionPartImpl(component);
			if (kind == FrtypesViewsRepository.FORM_KIND)
				return new CharacterStringPropertiesEditionPartForm(component);
		}
		if (key == FrtypesViewsRepository.Sequence.class) {
			if (kind == FrtypesViewsRepository.SWT_KIND)
				return new SequencePropertiesEditionPartImpl(component);
			if (kind == FrtypesViewsRepository.FORM_KIND)
				return new SequencePropertiesEditionPartForm(component);
		}
		if (key == FrtypesViewsRepository.SequenceOf.class) {
			if (kind == FrtypesViewsRepository.SWT_KIND)
				return new SequenceOfPropertiesEditionPartImpl(component);
			if (kind == FrtypesViewsRepository.FORM_KIND)
				return new SequenceOfPropertiesEditionPartForm(component);
		}
		if (key == FrtypesViewsRepository.Set.class) {
			if (kind == FrtypesViewsRepository.SWT_KIND)
				return new SetPropertiesEditionPartImpl(component);
			if (kind == FrtypesViewsRepository.FORM_KIND)
				return new SetPropertiesEditionPartForm(component);
		}
		if (key == FrtypesViewsRepository.SetOf.class) {
			if (kind == FrtypesViewsRepository.SWT_KIND)
				return new SetOfPropertiesEditionPartImpl(component);
			if (kind == FrtypesViewsRepository.FORM_KIND)
				return new SetOfPropertiesEditionPartForm(component);
		}
		if (key == FrtypesViewsRepository.SizeConstraint.class) {
			if (kind == FrtypesViewsRepository.SWT_KIND)
				return new SizeConstraintPropertiesEditionPartImpl(component);
			if (kind == FrtypesViewsRepository.FORM_KIND)
				return new SizeConstraintPropertiesEditionPartForm(component);
		}
		if (key == FrtypesViewsRepository.ValueRangeConstraint.class) {
			if (kind == FrtypesViewsRepository.SWT_KIND)
				return new ValueRangeConstraintPropertiesEditionPartImpl(component);
			if (kind == FrtypesViewsRepository.FORM_KIND)
				return new ValueRangeConstraintPropertiesEditionPartForm(component);
		}
		if (key == FrtypesViewsRepository.NamedValue.class) {
			if (kind == FrtypesViewsRepository.SWT_KIND)
				return new NamedValuePropertiesEditionPartImpl(component);
			if (kind == FrtypesViewsRepository.FORM_KIND)
				return new NamedValuePropertiesEditionPartForm(component);
		}
		if (key == FrtypesViewsRepository.Choice.class) {
			if (kind == FrtypesViewsRepository.SWT_KIND)
				return new ChoicePropertiesEditionPartImpl(component);
			if (kind == FrtypesViewsRepository.FORM_KIND)
				return new ChoicePropertiesEditionPartForm(component);
		}
		if (key == FrtypesViewsRepository.TypeReferenceLocal.class) {
			if (kind == FrtypesViewsRepository.SWT_KIND)
				return new TypeReferenceLocalPropertiesEditionPartImpl(component);
			if (kind == FrtypesViewsRepository.FORM_KIND)
				return new TypeReferenceLocalPropertiesEditionPartForm(component);
		}
		if (key == FrtypesViewsRepository.SingleValueConstraint.class) {
			if (kind == FrtypesViewsRepository.SWT_KIND)
				return new SingleValueConstraintPropertiesEditionPartImpl(component);
			if (kind == FrtypesViewsRepository.FORM_KIND)
				return new SingleValueConstraintPropertiesEditionPartForm(component);
		}
		if (key == FrtypesViewsRepository.PermittedAlphabetConstraint.class) {
			if (kind == FrtypesViewsRepository.SWT_KIND)
				return new PermittedAlphabetConstraintPropertiesEditionPartImpl(component);
			if (kind == FrtypesViewsRepository.FORM_KIND)
				return new PermittedAlphabetConstraintPropertiesEditionPartForm(component);
		}
		if (key == FrtypesViewsRepository.Module.class) {
			if (kind == FrtypesViewsRepository.SWT_KIND)
				return new ModulePropertiesEditionPartImpl(component);
			if (kind == FrtypesViewsRepository.FORM_KIND)
				return new ModulePropertiesEditionPartForm(component);
		}
		if (key == FrtypesViewsRepository.ObjectIdentifier.class) {
			if (kind == FrtypesViewsRepository.SWT_KIND)
				return new ObjectIdentifierPropertiesEditionPartImpl(component);
			if (kind == FrtypesViewsRepository.FORM_KIND)
				return new ObjectIdentifierPropertiesEditionPartForm(component);
		}
		if (key == FrtypesViewsRepository.Element.class) {
			if (kind == FrtypesViewsRepository.SWT_KIND)
				return new ElementPropertiesEditionPartImpl(component);
			if (kind == FrtypesViewsRepository.FORM_KIND)
				return new ElementPropertiesEditionPartForm(component);
		}
		if (key == FrtypesViewsRepository.TypeReferenceExternal.class) {
			if (kind == FrtypesViewsRepository.SWT_KIND)
				return new TypeReferenceExternalPropertiesEditionPartImpl(component);
			if (kind == FrtypesViewsRepository.FORM_KIND)
				return new TypeReferenceExternalPropertiesEditionPartForm(component);
		}
		if (key == FrtypesViewsRepository.Null.class) {
			if (kind == FrtypesViewsRepository.SWT_KIND)
				return new NullPropertiesEditionPartImpl(component);
			if (kind == FrtypesViewsRepository.FORM_KIND)
				return new NullPropertiesEditionPartForm(component);
		}
		if (key == FrtypesViewsRepository.FromModule.class) {
			if (kind == FrtypesViewsRepository.SWT_KIND)
				return new FromModulePropertiesEditionPartImpl(component);
			if (kind == FrtypesViewsRepository.FORM_KIND)
				return new FromModulePropertiesEditionPartForm(component);
		}
		return null;
	}

}
