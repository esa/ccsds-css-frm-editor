/**
 */
package ccsds.fr.type.model.frtypes.impl;

/*-
 * #%L
 * CCSDS Functional Resource Type Model
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

import ccsds.fr.type.model.XmlHelper;
import ccsds.fr.type.model.frtypes.FrtypesPackage;
import ccsds.fr.type.model.frtypes.ObjectIdentifier;
import ccsds.fr.type.model.frtypes.SizeConstrainedType;
import ccsds.fr.type.model.frtypes.SizeConstraint;
import ccsds.fr.type.model.frtypes.StructuredSizeConstrainedType;
import ccsds.fr.type.model.frtypes.Type;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Size Constrained Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsds.fr.type.model.frtypes.impl.StructuredSizeConstrainedTypeImpl#getSizeConstraint <em>Size Constraint</em>}</li>
 *   <li>{@link ccsds.fr.type.model.frtypes.impl.StructuredSizeConstrainedTypeImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StructuredSizeConstrainedTypeImpl extends StructuredTypeImpl
		implements StructuredSizeConstrainedType {
	/**
	 * The cached value of the '{@link #getSizeConstraint() <em>Size Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<SizeConstraint> sizeConstraint;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected Type elements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredSizeConstrainedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FrtypesPackage.Literals.STRUCTURED_SIZE_CONSTRAINED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SizeConstraint> getSizeConstraint() {
		if (sizeConstraint == null) {
			sizeConstraint = new EObjectContainmentEList<SizeConstraint>(SizeConstraint.class, this,
					FrtypesPackage.STRUCTURED_SIZE_CONSTRAINED_TYPE__SIZE_CONSTRAINT);
		}
		return sizeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getElements() {
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElements(Type newElements, NotificationChain msgs) {
		Type oldElements = elements;
		elements = newElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FrtypesPackage.STRUCTURED_SIZE_CONSTRAINED_TYPE__ELEMENTS, oldElements, newElements);
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
	public void setElements(Type newElements) {
		if (newElements != elements) {
			NotificationChain msgs = null;
			if (elements != null)
				msgs = ((InternalEObject) elements).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - FrtypesPackage.STRUCTURED_SIZE_CONSTRAINED_TYPE__ELEMENTS, null, msgs);
			if (newElements != null)
				msgs = ((InternalEObject) newElements).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FrtypesPackage.STRUCTURED_SIZE_CONSTRAINED_TYPE__ELEMENTS, null, msgs);
			msgs = basicSetElements(newElements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FrtypesPackage.STRUCTURED_SIZE_CONSTRAINED_TYPE__ELEMENTS, newElements, newElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FrtypesPackage.STRUCTURED_SIZE_CONSTRAINED_TYPE__SIZE_CONSTRAINT:
			return ((InternalEList<?>) getSizeConstraint()).basicRemove(otherEnd, msgs);
		case FrtypesPackage.STRUCTURED_SIZE_CONSTRAINED_TYPE__ELEMENTS:
			return basicSetElements(null, msgs);
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
		case FrtypesPackage.STRUCTURED_SIZE_CONSTRAINED_TYPE__SIZE_CONSTRAINT:
			return getSizeConstraint();
		case FrtypesPackage.STRUCTURED_SIZE_CONSTRAINED_TYPE__ELEMENTS:
			return getElements();
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
		case FrtypesPackage.STRUCTURED_SIZE_CONSTRAINED_TYPE__SIZE_CONSTRAINT:
			getSizeConstraint().clear();
			getSizeConstraint().addAll((Collection<? extends SizeConstraint>) newValue);
			return;
		case FrtypesPackage.STRUCTURED_SIZE_CONSTRAINED_TYPE__ELEMENTS:
			setElements((Type) newValue);
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
		case FrtypesPackage.STRUCTURED_SIZE_CONSTRAINED_TYPE__SIZE_CONSTRAINT:
			getSizeConstraint().clear();
			return;
		case FrtypesPackage.STRUCTURED_SIZE_CONSTRAINED_TYPE__ELEMENTS:
			setElements((Type) null);
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
		case FrtypesPackage.STRUCTURED_SIZE_CONSTRAINED_TYPE__SIZE_CONSTRAINT:
			return sizeConstraint != null && !sizeConstraint.isEmpty();
		case FrtypesPackage.STRUCTURED_SIZE_CONSTRAINED_TYPE__ELEMENTS:
			return elements != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SizeConstrainedType.class) {
			switch (derivedFeatureID) {
			case FrtypesPackage.STRUCTURED_SIZE_CONSTRAINED_TYPE__SIZE_CONSTRAINT:
				return FrtypesPackage.SIZE_CONSTRAINED_TYPE__SIZE_CONSTRAINT;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SizeConstrainedType.class) {
			switch (baseFeatureID) {
			case FrtypesPackage.SIZE_CONSTRAINED_TYPE__SIZE_CONSTRAINT:
				return FrtypesPackage.STRUCTURED_SIZE_CONSTRAINED_TYPE__SIZE_CONSTRAINT;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * Write the components of a structured type
	 * @generated NOT
	 */
	@Override
	public void writeAsn1(int indentLevel, StringBuffer output) {
		if (getElements() != null) {
			getElements().writeAsn1(indentLevel + 1, output);
		} else {
			output.append("no component set");
		}
	}

	/**
	 * Write the  sequence of / set of to XSD
	 * @generated NOT
	 */
	@Override
	public void writeXsd(int indentLevel, StringBuffer output, ObjectIdentifier oid, Map<String, String> properties) {

		// a SET OF or SEQUENCE of without size constraints shall have an unbounded pper size.
		// We need to add an unbounded upper size to override the XSD mxOccurs=1 default
		boolean addedSizeConstraints = false;
		if(getSizeConstraint() == null || getSizeConstraint().size() == 0) {
			addedSizeConstraints = true;
			getSizeConstraint().add(FrtypesFactoryImpl.eINSTANCE.createSizeConstraint());
			getSizeConstraint().get(0).setMax(-1);
			getSizeConstraint().get(0).setMin(0);
		}
		
		XmlHelper.writeStructuredSameType(indentLevel, output, this, getElements(), oid, properties);
		
		if(addedSizeConstraints == true) {
			getSizeConstraint().clear();
		}
		
	}
} //StructuredSizeConstrainedTypeImpl
