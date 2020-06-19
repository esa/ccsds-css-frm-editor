/**
 */
package ccsds.fr.type.model.frtypes.impl;

import ccsds.fr.type.model.frtypes.ExportWriter;
import ccsds.fr.type.model.frtypes.FrtypesPackage;
import ccsds.fr.type.model.frtypes.ObjectIdentifier;
import ccsds.fr.type.model.frtypes.SingleValueConstraint;
import ccsds.fr.type.model.frtypes.Type;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsds.fr.type.model.frtypes.impl.TypeImpl#getSingleValueConstraint <em>Single Value Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TypeImpl extends MinimalEObjectImpl.Container implements Type {
	/**
	 * The cached value of the '{@link #getSingleValueConstraint() <em>Single Value Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleValueConstraint()
	 * @generated
	 * @ordered
	 */
	protected SingleValueConstraint singleValueConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FrtypesPackage.Literals.TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValueConstraint getSingleValueConstraint() {
		return singleValueConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSingleValueConstraint(SingleValueConstraint newSingleValueConstraint,
			NotificationChain msgs) {
		SingleValueConstraint oldSingleValueConstraint = singleValueConstraint;
		singleValueConstraint = newSingleValueConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FrtypesPackage.TYPE__SINGLE_VALUE_CONSTRAINT, oldSingleValueConstraint, newSingleValueConstraint);
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
	public void setSingleValueConstraint(SingleValueConstraint newSingleValueConstraint) {
		if (newSingleValueConstraint != singleValueConstraint) {
			NotificationChain msgs = null;
			if (singleValueConstraint != null)
				msgs = ((InternalEObject) singleValueConstraint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - FrtypesPackage.TYPE__SINGLE_VALUE_CONSTRAINT, null, msgs);
			if (newSingleValueConstraint != null)
				msgs = ((InternalEObject) newSingleValueConstraint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FrtypesPackage.TYPE__SINGLE_VALUE_CONSTRAINT, null, msgs);
			msgs = basicSetSingleValueConstraint(newSingleValueConstraint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrtypesPackage.TYPE__SINGLE_VALUE_CONSTRAINT,
					newSingleValueConstraint, newSingleValueConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void writeAsn1(int indentLevel, StringBuffer output) {
		if (numSingleValueConstraint() > 0) {

			output.append(ExportWriter.BLANK);
			output.append(ExportWriter.LPAREN);

			int idx = 0;
			for (String c : getSingleValueConstraint().getValues()) {
				output.append(c);
				idx++;

				if (idx < getSingleValueConstraint().getValues().size()) {
					output.append(ExportWriter.OR);
				}
			}

			output.append(ExportWriter.RPAREN);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void writeXsd(int indentLevel, StringBuffer output, ObjectIdentifier oid) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FrtypesPackage.TYPE__SINGLE_VALUE_CONSTRAINT:
			return basicSetSingleValueConstraint(null, msgs);
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
		case FrtypesPackage.TYPE__SINGLE_VALUE_CONSTRAINT:
			return getSingleValueConstraint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FrtypesPackage.TYPE__SINGLE_VALUE_CONSTRAINT:
			setSingleValueConstraint((SingleValueConstraint) newValue);
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
		case FrtypesPackage.TYPE__SINGLE_VALUE_CONSTRAINT:
			setSingleValueConstraint((SingleValueConstraint) null);
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
		case FrtypesPackage.TYPE__SINGLE_VALUE_CONSTRAINT:
			return singleValueConstraint != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case FrtypesPackage.TYPE___WRITE_ASN1__INT_STRINGBUFFER:
			writeAsn1((Integer) arguments.get(0), (StringBuffer) arguments.get(1));
			return null;
		case FrtypesPackage.TYPE___WRITE_XSD__INT_STRINGBUFFER_OBJECTIDENTIFIER:
			writeXsd((Integer) arguments.get(0), (StringBuffer) arguments.get(1), (ObjectIdentifier) arguments.get(2));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //TypeImpl
