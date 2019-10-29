/**
 */
package ccsds.fr.type.model.frtypes.impl;

import ccsds.fr.type.model.frtypes.ExportWriter;
import ccsds.fr.type.model.frtypes.FromModule;
import ccsds.fr.type.model.frtypes.FrtypesPackage;
import ccsds.fr.type.model.frtypes.Module;
import ccsds.fr.type.model.frtypes.TypeDefinition;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsds.fr.type.model.frtypes.impl.ModuleImpl#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link ccsds.fr.type.model.frtypes.impl.ModuleImpl#getOid <em>Oid</em>}</li>
 *   <li>{@link ccsds.fr.type.model.frtypes.impl.ModuleImpl#getExports <em>Exports</em>}</li>
 *   <li>{@link ccsds.fr.type.model.frtypes.impl.ModuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link ccsds.fr.type.model.frtypes.impl.ModuleImpl#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleImpl extends MinimalEObjectImpl.Container implements Module {
	/**
	 * The cached value of the '{@link #getTypeDefinition() <em>Type Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDefinition> typeDefinition;

	/**
	 * The default value of the '{@link #getOid() <em>Oid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOid()
	 * @generated
	 * @ordered
	 */
	protected static final String OID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOid() <em>Oid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOid()
	 * @generated
	 * @ordered
	 */
	protected String oid = OID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExports() <em>Exports</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExports()
	 * @generated
	 * @ordered
	 */
	protected EList<String> exports;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<FromModule> imports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FrtypesPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDefinition> getTypeDefinition() {
		if (typeDefinition == null) {
			typeDefinition = new EObjectContainmentEList<TypeDefinition>(TypeDefinition.class, this,
					FrtypesPackage.MODULE__TYPE_DEFINITION);
		}
		return typeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOid() {
		return oid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOid(String newOid) {
		String oldOid = oid;
		oid = newOid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrtypesPackage.MODULE__OID, oldOid, oid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FromModule> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<FromModule>(FromModule.class, this, FrtypesPackage.MODULE__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getExports() {
		if (exports == null) {
			exports = new EDataTypeUniqueEList<String>(String.class, this, FrtypesPackage.MODULE__EXPORTS);
		}
		return exports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrtypesPackage.MODULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void writeAsn1(int indentLevel, StringBuffer output) {
		if (getName() != null) {
			output.append(getName());
		} else {
			output.append("module name not set");
		}

		output.append(System.lineSeparator());
		if (getOid() != null) {
			output.append(ExportWriter.LCBRACE + ExportWriter.BLANK + getOid() + System.lineSeparator()
					+ ExportWriter.RCBRACE);
		} else {
			output.append(ExportWriter.LCBRACE + ExportWriter.BLANK
					+ "iso(1) identified-organization(3) standards-producing-organization(112)\n"
					+ "	ccsds(4) css(4) crossSuppportResources(2)" + System.lineSeparator() + ExportWriter.RCBRACE);
		}

		output.append(
				System.lineSeparator() + System.lineSeparator() + ExportWriter.DEFINITIONS + System.lineSeparator());
		output.append(ExportWriter.IMPLICIT + ExportWriter.BLANK + ExportWriter.TAGS + System.lineSeparator());
		output.append(ExportWriter.ASSIGN + ExportWriter.BLANK + ExportWriter.BEGIN + System.lineSeparator());

		// EXPORTS - there should be always exports, basically all types of this module are exported
		output.append(System.lineSeparator() + ExportWriter.EXPORTS + System.lineSeparator());
		int idx = 0;
		for (String export : getExports()) {
			output.append(ExportWriter.INDENT + ExportWriter.INDENT + export);

			idx++;
			if (idx < getExports().size()) {
				output.append(System.lineSeparator() + ExportWriter.SEP);
			}
		}
		output.append(
				System.lineSeparator() + ExportWriter.SEMI_COLON + System.lineSeparator() + System.lineSeparator());

		// IMPORTS
		if (getImports().size() > 0) {
			for (FromModule fromModuleImport : getImports()) {
				fromModuleImport.writeAsn1(indentLevel, output);
			}
		}

		// all type definitions
		for (TypeDefinition td : getTypeDefinition()) {
			td.writeAsn1(indentLevel, output);
			output.append(System.lineSeparator());
		}

		//output.append(System.lineSeparator() + Asn1Writer.RCBRACE);
		output.append(System.lineSeparator() + ExportWriter.END);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FrtypesPackage.MODULE__TYPE_DEFINITION:
			return ((InternalEList<?>) getTypeDefinition()).basicRemove(otherEnd, msgs);
		case FrtypesPackage.MODULE__IMPORTS:
			return ((InternalEList<?>) getImports()).basicRemove(otherEnd, msgs);
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
		case FrtypesPackage.MODULE__TYPE_DEFINITION:
			return getTypeDefinition();
		case FrtypesPackage.MODULE__OID:
			return getOid();
		case FrtypesPackage.MODULE__EXPORTS:
			return getExports();
		case FrtypesPackage.MODULE__NAME:
			return getName();
		case FrtypesPackage.MODULE__IMPORTS:
			return getImports();
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
		case FrtypesPackage.MODULE__TYPE_DEFINITION:
			getTypeDefinition().clear();
			getTypeDefinition().addAll((Collection<? extends TypeDefinition>) newValue);
			return;
		case FrtypesPackage.MODULE__OID:
			setOid((String) newValue);
			return;
		case FrtypesPackage.MODULE__EXPORTS:
			getExports().clear();
			getExports().addAll((Collection<? extends String>) newValue);
			return;
		case FrtypesPackage.MODULE__NAME:
			setName((String) newValue);
			return;
		case FrtypesPackage.MODULE__IMPORTS:
			getImports().clear();
			getImports().addAll((Collection<? extends FromModule>) newValue);
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
		case FrtypesPackage.MODULE__TYPE_DEFINITION:
			getTypeDefinition().clear();
			return;
		case FrtypesPackage.MODULE__OID:
			setOid(OID_EDEFAULT);
			return;
		case FrtypesPackage.MODULE__EXPORTS:
			getExports().clear();
			return;
		case FrtypesPackage.MODULE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case FrtypesPackage.MODULE__IMPORTS:
			getImports().clear();
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
		case FrtypesPackage.MODULE__TYPE_DEFINITION:
			return typeDefinition != null && !typeDefinition.isEmpty();
		case FrtypesPackage.MODULE__OID:
			return OID_EDEFAULT == null ? oid != null : !OID_EDEFAULT.equals(oid);
		case FrtypesPackage.MODULE__EXPORTS:
			return exports != null && !exports.isEmpty();
		case FrtypesPackage.MODULE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case FrtypesPackage.MODULE__IMPORTS:
			return imports != null && !imports.isEmpty();
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
		case FrtypesPackage.MODULE___WRITE_ASN1__INT_STRINGBUFFER:
			writeAsn1((Integer) arguments.get(0), (StringBuffer) arguments.get(1));
			return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (oid: ");
		result.append(oid);
		result.append(", exports: ");
		result.append(exports);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ModuleImpl
