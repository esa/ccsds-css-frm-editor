/**
 */
package ccsds.fr.type.model.frtypes.impl;

import ccsds.fr.type.model.frtypes.ExportWriter;
import ccsds.fr.type.model.frtypes.CharacterString;
import ccsds.fr.type.model.frtypes.FrtypesPackage;
import ccsds.fr.type.model.frtypes.PermittedAlphabetConstraint;
import ccsds.fr.type.model.frtypes.StringType;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Character String</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsds.fr.type.model.frtypes.impl.CharacterStringImpl#getPermittedAlphabetConstraint <em>Permitted Alphabet Constraint</em>}</li>
 *   <li>{@link ccsds.fr.type.model.frtypes.impl.CharacterStringImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharacterStringImpl extends SimpleSizeConstrainedTypeImpl implements CharacterString {
	/**
	 * The cached value of the '{@link #getPermittedAlphabetConstraint() <em>Permitted Alphabet Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermittedAlphabetConstraint()
	 * @generated
	 * @ordered
	 */
	protected PermittedAlphabetConstraint permittedAlphabetConstraint;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final StringType TYPE_EDEFAULT = StringType.VISIBLE_STRING;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected StringType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacterStringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FrtypesPackage.Literals.CHARACTER_STRING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermittedAlphabetConstraint getPermittedAlphabetConstraint() {
		return permittedAlphabetConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPermittedAlphabetConstraint(
			PermittedAlphabetConstraint newPermittedAlphabetConstraint, NotificationChain msgs) {
		PermittedAlphabetConstraint oldPermittedAlphabetConstraint = permittedAlphabetConstraint;
		permittedAlphabetConstraint = newPermittedAlphabetConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FrtypesPackage.CHARACTER_STRING__PERMITTED_ALPHABET_CONSTRAINT, oldPermittedAlphabetConstraint,
					newPermittedAlphabetConstraint);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermittedAlphabetConstraint(PermittedAlphabetConstraint newPermittedAlphabetConstraint) {
		if (newPermittedAlphabetConstraint != permittedAlphabetConstraint) {
			NotificationChain msgs = null;
			if (permittedAlphabetConstraint != null)
				msgs = ((InternalEObject) permittedAlphabetConstraint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - FrtypesPackage.CHARACTER_STRING__PERMITTED_ALPHABET_CONSTRAINT, null,
						msgs);
			if (newPermittedAlphabetConstraint != null)
				msgs = ((InternalEObject) newPermittedAlphabetConstraint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FrtypesPackage.CHARACTER_STRING__PERMITTED_ALPHABET_CONSTRAINT, null,
						msgs);
			msgs = basicSetPermittedAlphabetConstraint(newPermittedAlphabetConstraint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FrtypesPackage.CHARACTER_STRING__PERMITTED_ALPHABET_CONSTRAINT, newPermittedAlphabetConstraint,
					newPermittedAlphabetConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(StringType newType) {
		StringType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrtypesPackage.CHARACTER_STRING__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FrtypesPackage.CHARACTER_STRING__PERMITTED_ALPHABET_CONSTRAINT:
			return basicSetPermittedAlphabetConstraint(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FrtypesPackage.CHARACTER_STRING__PERMITTED_ALPHABET_CONSTRAINT:
			return getPermittedAlphabetConstraint();
		case FrtypesPackage.CHARACTER_STRING__TYPE:
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
		case FrtypesPackage.CHARACTER_STRING__PERMITTED_ALPHABET_CONSTRAINT:
			setPermittedAlphabetConstraint((PermittedAlphabetConstraint) newValue);
			return;
		case FrtypesPackage.CHARACTER_STRING__TYPE:
			setType((StringType) newValue);
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
		case FrtypesPackage.CHARACTER_STRING__PERMITTED_ALPHABET_CONSTRAINT:
			setPermittedAlphabetConstraint((PermittedAlphabetConstraint) null);
			return;
		case FrtypesPackage.CHARACTER_STRING__TYPE:
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
		case FrtypesPackage.CHARACTER_STRING__PERMITTED_ALPHABET_CONSTRAINT:
			return permittedAlphabetConstraint != null;
		case FrtypesPackage.CHARACTER_STRING__TYPE:
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

	/**
	 * Write the Character String
	 * @generated NOT
	 */
	@Override
	public void writeAsn1(int indentLevel, StringBuffer output) {
		output.append(getType().toString());

		if (getPermittedAlphabetConstraint() != null && getSizeConstraint().size() > 0) {
			output.append(ExportWriter.LPAREN);
		}

		super.writeAsn1(indentLevel, output); // size constraints

		if (getPermittedAlphabetConstraint() != null && getSizeConstraint().size() == 0) {
			getPermittedAlphabetConstraint().writeAsn1(indentLevel, output);
		}

		if (getPermittedAlphabetConstraint() != null && getSizeConstraint().size() > 0) {
			output.append(ExportWriter.AND);
			getPermittedAlphabetConstraint().writeAsn1(indentLevel, output);
			output.append(ExportWriter.RPAREN);
		}

	}
} //CharacterStringImpl
