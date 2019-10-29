/**
 */
package ccsds.fr.type.model.frtypes.impl;

import ccsds.fr.type.model.frtypes.ExportWriter;
import ccsds.fr.type.model.frtypes.Enumerated;
import ccsds.fr.type.model.frtypes.FrtypesPackage;
import ccsds.fr.type.model.frtypes.NamedValue;
import ccsds.fr.type.model.frtypes.SingleValueConstraint;
import ccsds.fr.type.model.frtypes.Type;
import ccsds.fr.type.model.frtypes.TypeReferenceLocal;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Value Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsds.fr.type.model.frtypes.impl.SingleValueConstraintImpl#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleValueConstraintImpl extends ConstraintImpl implements SingleValueConstraint {
	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<String> values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleValueConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FrtypesPackage.Literals.SINGLE_VALUE_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getValues() {
		if (values == null) {
			values = new EDataTypeUniqueEList<String>(String.class, this,
					FrtypesPackage.SINGLE_VALUE_CONSTRAINT__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FrtypesPackage.SINGLE_VALUE_CONSTRAINT__VALUES:
			return getValues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FrtypesPackage.SINGLE_VALUE_CONSTRAINT__VALUES:
			getValues().clear();
			getValues().addAll((Collection<? extends String>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case FrtypesPackage.SINGLE_VALUE_CONSTRAINT__VALUES:
			getValues().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case FrtypesPackage.SINGLE_VALUE_CONSTRAINT__VALUES:
			return values != null && !values.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (values: ");
		result.append(values);
		result.append(')');
		return result.toString();
	}

	/**
	 * Writes the given value to the given output.
	 * For parent objects referencing Enumerated, a conversion of 
	 * numeric enum values to enum literals is performed
	
	 * @param output 	The output to which the (converted) value is written
	 * @param value		The value written to the output. For enums in numeric form this is converted to enum literal
	
	 * @generated NOT
	 */
	private void writeValue(StringBuffer output, String value) {
		EList<NamedValue> namedValues = null;
		// Check if parent is an local type reference to an enum - translate eventually numeric values to enum literals		
		EObject parent = eContainer();
		if (parent instanceof TypeReferenceLocal) {
			TypeReferenceLocal trl = (TypeReferenceLocal) parent;
			try {
				Type t = trl.getTypeDefinition().getType();
				if (t instanceof Enumerated) {
					Enumerated e = (Enumerated) t;
					namedValues = e.getValues();
				}
			} catch (Exception e) {
				// OK
			}
		}

		try {
			int numericValue = Integer.parseInt(value);
			for (int idx = 0; idx < namedValues.size(); idx++) {
				if (namedValues.get(idx).getValue() == numericValue) {
					value = namedValues.get(idx).getName();
					break;
				}
			}

		} catch (Exception e) {
			// OK, may happen
		}

		output.append(value);
	}

	/**
	 * Write the value range constraint
	 * @generated NOT
	 */
	@Override
	public void writeAsn1(int indentLevel, StringBuffer output) {
		if (getValues().size() == 0) {
			return;
		}

		output.append(ExportWriter.BLANK + ExportWriter.LPAREN);

		int idx = 0;
		for (String v : getValues()) {

			//output.append(v);
			writeValue(output, v);
			idx++;

			if (idx < getValues().size()) {
				output.append(ExportWriter.OR);
			}
		}

		output.append(ExportWriter.RPAREN);
	}
} //SingleValueConstraintImpl
