/**
 * Generated with Acceleo
 */
package ccsds.fr.type.model.frtypes.parts;

/**
 * 
 * 
 */
public class FrtypesViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * TypeDefinition view descriptor
	 * 
	 */
	public static class TypeDefinition {
		public static class Properties {
	
			
			public static String name = "frtypes::TypeDefinition::properties::name";
			
	
		}
	
	}

	/**
	 * Boolean view descriptor
	 * 
	 */
	public static class Boolean_ {
		public static class Properties {
	
	
		}
	
	}

	/**
	 * IntegerType view descriptor
	 * 
	 */
	public static class IntegerType {
		public static class Properties {
	
			
			public static String rangeConstraint = "frtypes::IntegerType::properties::rangeConstraint";
			
			
			public static String namedValues = "frtypes::IntegerType::properties::namedValues";
			
	
		}
	
	}

	/**
	 * BitString view descriptor
	 * 
	 */
	public static class BitString {
		public static class Properties {
	
			
			public static String sizeConstraint = "frtypes::BitString::properties::sizeConstraint";
			
	
		}
	
	}

	/**
	 * OctetString view descriptor
	 * 
	 */
	public static class OctetString {
		public static class Properties {
	
			
			public static String sizeConstraint = "frtypes::OctetString::properties::sizeConstraint";
			
	
		}
	
	}

	/**
	 * Real view descriptor
	 * 
	 */
	public static class Real {
		public static class Properties {
	
			
			public static String rangeConstraint = "frtypes::Real::properties::rangeConstraint";
			
	
		}
	
	}

	/**
	 * Enumerated view descriptor
	 * 
	 */
	public static class Enumerated {
		public static class Properties {
	
			
			public static String values = "frtypes::Enumerated::properties::values";
			
	
		}
	
	}

	/**
	 * CharacterString view descriptor
	 * 
	 */
	public static class CharacterString {
		public static class Properties {
	
			
			public static String sizeConstraint = "frtypes::CharacterString::properties::sizeConstraint";
			
			
			public static String type = "frtypes::CharacterString::properties::type";
			
	
		}
	
	}

	/**
	 * Sequence view descriptor
	 * 
	 */
	public static class Sequence {
		public static class Properties {
	
			
			public static String components = "frtypes::Sequence::properties::components";
			
	
		}
	
	}

	/**
	 * SequenceOf view descriptor
	 * 
	 */
	public static class SequenceOf {
		public static class Properties {
	
			
			public static String sizeConstraint = "frtypes::SequenceOf::properties::sizeConstraint";
			
	
		}
	
	}

	/**
	 * Set view descriptor
	 * 
	 */
	public static class Set {
		public static class Properties {
	
			
			public static String components = "frtypes::Set::properties::components";
			
	
		}
	
	}

	/**
	 * SetOf view descriptor
	 * 
	 */
	public static class SetOf {
		public static class Properties {
	
			
			public static String sizeConstraint = "frtypes::SetOf::properties::sizeConstraint";
			
	
		}
	
	}

	/**
	 * SizeConstraint view descriptor
	 * 
	 */
	public static class SizeConstraint {
		public static class Properties {
	
			
			public static String min = "frtypes::SizeConstraint::properties::min";
			
			
			public static String max = "frtypes::SizeConstraint::properties::max";
			
	
		}
	
	}

	/**
	 * ValueRangeConstraint view descriptor
	 * 
	 */
	public static class ValueRangeConstraint {
		public static class Properties {
	
			
			public static String min = "frtypes::ValueRangeConstraint::properties::min";
			
			
			public static String max = "frtypes::ValueRangeConstraint::properties::max";
			
	
		}
	
	}

	/**
	 * NamedValue view descriptor
	 * 
	 */
	public static class NamedValue {
		public static class Properties {
	
			
			public static String name = "frtypes::NamedValue::properties::name";
			
			
			public static String value = "frtypes::NamedValue::properties::value";
			
	
		}
	
	}

	/**
	 * Choice view descriptor
	 * 
	 */
	public static class Choice {
		public static class Properties {
	
			
			public static String components = "frtypes::Choice::properties::components";
			
	
		}
	
	}

	/**
	 * TypeReferenceLocal view descriptor
	 * 
	 */
	public static class TypeReferenceLocal {
		public static class Properties {
	
			
			public static String typeDefinition = "frtypes::TypeReferenceLocal::properties::typeDefinition";
			
	
		}
	
	}

	/**
	 * SingleValueConstraint view descriptor
	 * 
	 */
	public static class SingleValueConstraint {
		public static class Properties {
	
			
			public static String values = "frtypes::SingleValueConstraint::properties::values";
			
	
		}
	
	}

	/**
	 * PermittedAlphabetConstraint view descriptor
	 * 
	 */
	public static class PermittedAlphabetConstraint {
		public static class Properties {
	
			
			public static String values = "frtypes::PermittedAlphabetConstraint::properties::values";
			
			
			public static String type = "frtypes::PermittedAlphabetConstraint::properties::type";
			
	
		}
	
	}

	/**
	 * Module view descriptor
	 * 
	 */
	public static class Module {
		public static class Properties {
	
			
			public static String typeDefinition = "frtypes::Module::properties::typeDefinition";
			
			
			public static String oid = "frtypes::Module::properties::oid";
			
			
			public static String imports = "frtypes::Module::properties::imports";
			
			
			public static String exports = "frtypes::Module::properties::exports";
			
			
			public static String name = "frtypes::Module::properties::name";
			
	
		}
	
	}

	/**
	 * ObjectIdentifier view descriptor
	 * 
	 */
	public static class ObjectIdentifier {
		public static class Properties {
	
	
		}
	
	}

	/**
	 * ComponentValue view descriptor
	 * 
	 */
	public static class ComponentValue {
		public static class Properties {
	
			
			public static String name = "frtypes::ComponentValue::properties::name";
			
			
			public static String tag = "frtypes::ComponentValue::properties::tag";
			
			
			public static String optional = "frtypes::ComponentValue::properties::optional";
			
	
		}
	
	}

	/**
	 * TypeReferenceExternal view descriptor
	 * 
	 */
	public static class TypeReferenceExternal {
		public static class Properties {
	
			
			public static String name = "frtypes::TypeReferenceExternal::properties::name";
			
	
		}
	
	}

	/**
	 * Null view descriptor
	 * 
	 */
	public static class Null {
		public static class Properties {
	
	
		}
	
	}

}
