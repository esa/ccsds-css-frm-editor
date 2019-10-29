/**
 */
package ccsds.fr.type.model.frtypes.impl;

import ccsds.fr.type.model.frtypes.ExportWriter;
import ccsds.fr.type.model.frtypes.ConstraintType;
import ccsds.fr.type.model.frtypes.FrtypesPackage;
import ccsds.fr.type.model.frtypes.PermittedAlphabetConstraint;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Permitted Alphabet Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsds.fr.type.model.frtypes.impl.PermittedAlphabetConstraintImpl#getValues <em>Values</em>}</li>
 *   <li>{@link ccsds.fr.type.model.frtypes.impl.PermittedAlphabetConstraintImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PermittedAlphabetConstraintImpl extends ConstraintImpl implements PermittedAlphabetConstraint {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ConstraintType TYPE_EDEFAULT = ConstraintType.RANGE;
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ConstraintType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PermittedAlphabetConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FrtypesPackage.Literals.PERMITTED_ALPHABET_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getValues() {
		if (values == null) {
			values = new EDataTypeUniqueEList<String>(String.class, this,
					FrtypesPackage.PERMITTED_ALPHABET_CONSTRAINT__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ConstraintType newType) {
		ConstraintType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrtypesPackage.PERMITTED_ALPHABET_CONSTRAINT__TYPE,
					oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FrtypesPackage.PERMITTED_ALPHABET_CONSTRAINT__VALUES:
			return getValues();
		case FrtypesPackage.PERMITTED_ALPHABET_CONSTRAINT__TYPE:
			return getType();
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
		case FrtypesPackage.PERMITTED_ALPHABET_CONSTRAINT__VALUES:
			getValues().clear();
			getValues().addAll((Collection<? extends String>) newValue);
			return;
		case FrtypesPackage.PERMITTED_ALPHABET_CONSTRAINT__TYPE:
			setType((ConstraintType) newValue);
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
		case FrtypesPackage.PERMITTED_ALPHABET_CONSTRAINT__VALUES:
			getValues().clear();
			return;
		case FrtypesPackage.PERMITTED_ALPHABET_CONSTRAINT__TYPE:
			setType(TYPE_EDEFAULT);
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
		case FrtypesPackage.PERMITTED_ALPHABET_CONSTRAINT__VALUES:
			return values != null && !values.isEmpty();
		case FrtypesPackage.PERMITTED_ALPHABET_CONSTRAINT__TYPE:
			return type != TYPE_EDEFAULT;
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
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

	/**
	 * Write the permitted alphabet constraint
	 * @generated NOT
	 */
	@Override
	public void writeAsn1(int indentLevel, StringBuffer output) {
		if (getValues() == null || getValues().size() == 0) {
			return;
		}

		output.append(ExportWriter.BLANK + ExportWriter.FROM + ExportWriter.LPAREN);

		if (getType() == ConstraintType.RANGE && getValues().size() == 2) {
			output.append(ExportWriter.LPAREN + getValues().get(0) + ExportWriter.UNTIL + getValues().get(1)
					+ ExportWriter.RPAREN);
		} else { // OR
			output.append(ExportWriter.LPAREN);

			int idx = 0;
			for (String value : getValues()) {
				output.append(value);
				idx++;

				if (idx < getValues().size()) {
					output.append(ExportWriter.OR);
				}
			}

			output.append(ExportWriter.RPAREN);
		}

		output.append(ExportWriter.RPAREN);

	}

} //PermittedAlphabetConstraintImpl
