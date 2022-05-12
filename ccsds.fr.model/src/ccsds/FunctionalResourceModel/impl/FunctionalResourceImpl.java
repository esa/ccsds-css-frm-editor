/**
 */
package ccsds.FunctionalResourceModel.impl;

/*-
 * #%L
 * CCSDS Functional Resource Model
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

import ccsds.FunctionalResourceModel.AncillaryInterface;
import ccsds.FunctionalResourceModel.DataUnit;
import ccsds.FunctionalResourceModel.Directive;
import ccsds.FunctionalResourceModel.Event;
import ccsds.FunctionalResourceModel.FunctionalResource;
import ccsds.FunctionalResourceModel.FunctionalResourceModelPackage;
import ccsds.FunctionalResourceModel.Parameter;
import ccsds.FunctionalResourceModel.ServiceAccessPoint;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.FunctionalResourceImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.FunctionalResourceImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.FunctionalResourceImpl#getDirectives <em>Directives</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.FunctionalResourceImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.FunctionalResourceImpl#getServiceAccesspoint <em>Service Accesspoint</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.FunctionalResourceImpl#getProvidedAncillaryInterface <em>Provided Ancillary Interface</em>}</li>
 *   <li>{@link ccsds.FunctionalResourceModel.impl.FunctionalResourceImpl#getDataUnit <em>Data Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalResourceImpl extends FrModelElementImpl implements FunctionalResource {
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameter;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> event;

	/**
	 * The cached value of the '{@link #getDirectives() <em>Directives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectives()
	 * @generated
	 * @ordered
	 */
	protected EList<Directive> directives;

	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalResource> uses;

	/**
	 * The cached value of the '{@link #getServiceAccesspoint() <em>Service Accesspoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceAccesspoint()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceAccessPoint> serviceAccesspoint;

	/**
	 * The cached value of the '{@link #getProvidedAncillaryInterface() <em>Provided Ancillary Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedAncillaryInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<AncillaryInterface> providedAncillaryInterface;

	/**
	 * The cached value of the '{@link #getDataUnit() <em>Data Unit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<DataUnit> dataUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionalResourceModelPackage.Literals.FUNCTIONAL_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvent() {
		if (event == null) {
			event = new EObjectContainmentEList<Event>(Event.class, this, FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__EVENT);
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Directive> getDirectives() {
		if (directives == null) {
			directives = new EObjectContainmentEList<Directive>(Directive.class, this, FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__DIRECTIVES);
		}
		return directives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalResource> getUses() {
		if (uses == null) {
			uses = new EObjectResolvingEList<FunctionalResource>(FunctionalResource.class, this, FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__USES);
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceAccessPoint> getServiceAccesspoint() {
		if (serviceAccesspoint == null) {
			serviceAccesspoint = new EObjectContainmentWithInverseEList<ServiceAccessPoint>(ServiceAccessPoint.class, this, FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__SERVICE_ACCESSPOINT, FunctionalResourceModelPackage.SERVICE_ACCESS_POINT__ACCESSED_FUNCTIONAL_RESOURCE);
		}
		return serviceAccesspoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AncillaryInterface> getProvidedAncillaryInterface() {
		if (providedAncillaryInterface == null) {
			providedAncillaryInterface = new EObjectContainmentWithInverseEList<AncillaryInterface>(AncillaryInterface.class, this, FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__PROVIDED_ANCILLARY_INTERFACE, FunctionalResourceModelPackage.ANCILLARY_INTERFACE__PROVIDING_FUNCTIONAL_RESOURCE);
		}
		return providedAncillaryInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataUnit> getDataUnit() {
		if (dataUnit == null) {
			dataUnit = new EObjectContainmentEList<DataUnit>(DataUnit.class, this, FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__DATA_UNIT);
		}
		return dataUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__SERVICE_ACCESSPOINT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServiceAccesspoint()).basicAdd(otherEnd, msgs);
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__PROVIDED_ANCILLARY_INTERFACE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProvidedAncillaryInterface()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__EVENT:
				return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__DIRECTIVES:
				return ((InternalEList<?>)getDirectives()).basicRemove(otherEnd, msgs);
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__SERVICE_ACCESSPOINT:
				return ((InternalEList<?>)getServiceAccesspoint()).basicRemove(otherEnd, msgs);
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__PROVIDED_ANCILLARY_INTERFACE:
				return ((InternalEList<?>)getProvidedAncillaryInterface()).basicRemove(otherEnd, msgs);
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__DATA_UNIT:
				return ((InternalEList<?>)getDataUnit()).basicRemove(otherEnd, msgs);
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
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__PARAMETER:
				return getParameter();
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__EVENT:
				return getEvent();
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__DIRECTIVES:
				return getDirectives();
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__USES:
				return getUses();
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__SERVICE_ACCESSPOINT:
				return getServiceAccesspoint();
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__PROVIDED_ANCILLARY_INTERFACE:
				return getProvidedAncillaryInterface();
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__DATA_UNIT:
				return getDataUnit();
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
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends Event>)newValue);
				return;
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__DIRECTIVES:
				getDirectives().clear();
				getDirectives().addAll((Collection<? extends Directive>)newValue);
				return;
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__USES:
				getUses().clear();
				getUses().addAll((Collection<? extends FunctionalResource>)newValue);
				return;
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__SERVICE_ACCESSPOINT:
				getServiceAccesspoint().clear();
				getServiceAccesspoint().addAll((Collection<? extends ServiceAccessPoint>)newValue);
				return;
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__PROVIDED_ANCILLARY_INTERFACE:
				getProvidedAncillaryInterface().clear();
				getProvidedAncillaryInterface().addAll((Collection<? extends AncillaryInterface>)newValue);
				return;
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__DATA_UNIT:
				getDataUnit().clear();
				getDataUnit().addAll((Collection<? extends DataUnit>)newValue);
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
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__PARAMETER:
				getParameter().clear();
				return;
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__EVENT:
				getEvent().clear();
				return;
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__DIRECTIVES:
				getDirectives().clear();
				return;
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__USES:
				getUses().clear();
				return;
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__SERVICE_ACCESSPOINT:
				getServiceAccesspoint().clear();
				return;
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__PROVIDED_ANCILLARY_INTERFACE:
				getProvidedAncillaryInterface().clear();
				return;
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__DATA_UNIT:
				getDataUnit().clear();
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
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__EVENT:
				return event != null && !event.isEmpty();
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__DIRECTIVES:
				return directives != null && !directives.isEmpty();
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__USES:
				return uses != null && !uses.isEmpty();
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__SERVICE_ACCESSPOINT:
				return serviceAccesspoint != null && !serviceAccesspoint.isEmpty();
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__PROVIDED_ANCILLARY_INTERFACE:
				return providedAncillaryInterface != null && !providedAncillaryInterface.isEmpty();
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__DATA_UNIT:
				return dataUnit != null && !dataUnit.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionalResourceImpl
