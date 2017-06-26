/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package srf.transpiler.fortxtrans.fortXTrans.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import srf.transpiler.fortxtrans.fortXTrans.AbsFnMod;
import srf.transpiler.fortxtrans.fortXTrans.FnMod;
import srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fn Mod</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.FnModImpl#getAbsMod <em>Abs Mod</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.FnModImpl#getPri <em>Pri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FnModImpl extends MinimalEObjectImpl.Container implements FnMod
{
  /**
   * The cached value of the '{@link #getAbsMod() <em>Abs Mod</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbsMod()
   * @generated
   * @ordered
   */
  protected AbsFnMod absMod;

  /**
   * The default value of the '{@link #getPri() <em>Pri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPri()
   * @generated
   * @ordered
   */
  protected static final String PRI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPri() <em>Pri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPri()
   * @generated
   * @ordered
   */
  protected String pri = PRI_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FnModImpl()
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
    return FortXTransPackage.Literals.FN_MOD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbsFnMod getAbsMod()
  {
    return absMod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAbsMod(AbsFnMod newAbsMod, NotificationChain msgs)
  {
    AbsFnMod oldAbsMod = absMod;
    absMod = newAbsMod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FortXTransPackage.FN_MOD__ABS_MOD, oldAbsMod, newAbsMod);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbsMod(AbsFnMod newAbsMod)
  {
    if (newAbsMod != absMod)
    {
      NotificationChain msgs = null;
      if (absMod != null)
        msgs = ((InternalEObject)absMod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.FN_MOD__ABS_MOD, null, msgs);
      if (newAbsMod != null)
        msgs = ((InternalEObject)newAbsMod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.FN_MOD__ABS_MOD, null, msgs);
      msgs = basicSetAbsMod(newAbsMod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.FN_MOD__ABS_MOD, newAbsMod, newAbsMod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPri()
  {
    return pri;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPri(String newPri)
  {
    String oldPri = pri;
    pri = newPri;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.FN_MOD__PRI, oldPri, pri));
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
      case FortXTransPackage.FN_MOD__ABS_MOD:
        return basicSetAbsMod(null, msgs);
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
      case FortXTransPackage.FN_MOD__ABS_MOD:
        return getAbsMod();
      case FortXTransPackage.FN_MOD__PRI:
        return getPri();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FortXTransPackage.FN_MOD__ABS_MOD:
        setAbsMod((AbsFnMod)newValue);
        return;
      case FortXTransPackage.FN_MOD__PRI:
        setPri((String)newValue);
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
      case FortXTransPackage.FN_MOD__ABS_MOD:
        setAbsMod((AbsFnMod)null);
        return;
      case FortXTransPackage.FN_MOD__PRI:
        setPri(PRI_EDEFAULT);
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
      case FortXTransPackage.FN_MOD__ABS_MOD:
        return absMod != null;
      case FortXTransPackage.FN_MOD__PRI:
        return PRI_EDEFAULT == null ? pri != null : !PRI_EDEFAULT.equals(pri);
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
    result.append(" (pri: ");
    result.append(pri);
    result.append(')');
    return result.toString();
  }

} //FnModImpl
