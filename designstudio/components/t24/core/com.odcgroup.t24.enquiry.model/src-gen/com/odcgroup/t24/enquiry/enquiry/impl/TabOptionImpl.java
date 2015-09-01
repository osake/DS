/**
 */
package com.odcgroup.t24.enquiry.enquiry.impl;

import com.odcgroup.t24.enquiry.enquiry.EnquiryPackage;
import com.odcgroup.t24.enquiry.enquiry.Parameter;
import com.odcgroup.t24.enquiry.enquiry.Reference;
import com.odcgroup.t24.enquiry.enquiry.TabOption;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Tab Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.odcgroup.t24.enquiry.enquiry.impl.TabOptionImpl#getTabName <em>Tab Name</em>}</li>
 *   <li>{@link com.odcgroup.t24.enquiry.enquiry.impl.TabOptionImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link com.odcgroup.t24.enquiry.enquiry.impl.TabOptionImpl#getFieldParameter <em>Field Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TabOptionImpl extends DrillDownOptionImpl implements TabOption
{
  /**
   * The default value of the '{@link #getTabName() <em>Tab Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTabName()
   * @generated
   * @ordered
   */
  protected static final String TAB_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTabName() <em>Tab Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTabName()
   * @generated
   * @ordered
   */
  protected String tabName = TAB_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReference()
   * @generated
   * @ordered
   */
  protected EList<Reference> reference;

  /**
   * The cached value of the '{@link #getFieldParameter() <em>Field Parameter</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldParameter()
   * @generated
   * @ordered
   */
  protected EList<Parameter> fieldParameter;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TabOptionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EnquiryPackage.Literals.TAB_OPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTabName()
  {
    return tabName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTabName(String newTabName)
  {
    String oldTabName = tabName;
    tabName = newTabName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EnquiryPackage.TAB_OPTION__TAB_NAME, oldTabName, tabName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Reference> getReference()
  {
    if (reference == null)
    {
      reference = new EObjectContainmentEList<Reference>(Reference.class, this, EnquiryPackage.TAB_OPTION__REFERENCE);
    }
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getFieldParameter()
  {
    if (fieldParameter == null)
    {
      fieldParameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, EnquiryPackage.TAB_OPTION__FIELD_PARAMETER);
    }
    return fieldParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EnquiryPackage.TAB_OPTION__REFERENCE:
        return ((InternalEList<?>)getReference()).basicRemove(otherEnd, msgs);
      case EnquiryPackage.TAB_OPTION__FIELD_PARAMETER:
        return ((InternalEList<?>)getFieldParameter()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EnquiryPackage.TAB_OPTION__TAB_NAME:
        return getTabName();
      case EnquiryPackage.TAB_OPTION__REFERENCE:
        return getReference();
      case EnquiryPackage.TAB_OPTION__FIELD_PARAMETER:
        return getFieldParameter();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EnquiryPackage.TAB_OPTION__TAB_NAME:
        setTabName((String)newValue);
        return;
      case EnquiryPackage.TAB_OPTION__REFERENCE:
        getReference().clear();
        getReference().addAll((Collection<? extends Reference>)newValue);
        return;
      case EnquiryPackage.TAB_OPTION__FIELD_PARAMETER:
        getFieldParameter().clear();
        getFieldParameter().addAll((Collection<? extends Parameter>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EnquiryPackage.TAB_OPTION__TAB_NAME:
        setTabName(TAB_NAME_EDEFAULT);
        return;
      case EnquiryPackage.TAB_OPTION__REFERENCE:
        getReference().clear();
        return;
      case EnquiryPackage.TAB_OPTION__FIELD_PARAMETER:
        getFieldParameter().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EnquiryPackage.TAB_OPTION__TAB_NAME:
        return TAB_NAME_EDEFAULT == null ? tabName != null : !TAB_NAME_EDEFAULT.equals(tabName);
      case EnquiryPackage.TAB_OPTION__REFERENCE:
        return reference != null && !reference.isEmpty();
      case EnquiryPackage.TAB_OPTION__FIELD_PARAMETER:
        return fieldParameter != null && !fieldParameter.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (tabName: ");
    result.append(tabName);
    result.append(')');
    return result.toString();
  }

} //TabOptionImpl
