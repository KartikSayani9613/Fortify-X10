/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package srf.transpiler.fortxtrans.fortXTrans.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage;
import srf.transpiler.fortxtrans.fortXTrans.Literal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.LiteralImpl#getIntg <em>Intg</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.LiteralImpl#getFlot <em>Flot</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.LiteralImpl#getStr <em>Str</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LiteralImpl extends MinimalEObjectImpl.Container implements Literal
{
  /**
   * The default value of the '{@link #getIntg() <em>Intg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntg()
   * @generated
   * @ordered
   */
  protected static final int INTG_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIntg() <em>Intg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntg()
   * @generated
   * @ordered
   */
  protected int intg = INTG_EDEFAULT;

  /**
   * The default value of the '{@link #getFlot() <em>Flot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlot()
   * @generated
   * @ordered
   */
  protected static final String FLOT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFlot() <em>Flot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlot()
   * @generated
   * @ordered
   */
  protected String flot = FLOT_EDEFAULT;

  /**
   * The default value of the '{@link #getStr() <em>Str</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStr()
   * @generated
   * @ordered
   */
  protected static final String STR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStr() <em>Str</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStr()
   * @generated
   * @ordered
   */
  protected String str = STR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LiteralImpl()
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
    return FortXTransPackage.Literals.LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIntg()
  {
    return intg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntg(int newIntg)
  {
    int oldIntg = intg;
    intg = newIntg;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.LITERAL__INTG, oldIntg, intg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFlot()
  {
    return flot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFlot(String newFlot)
  {
    String oldFlot = flot;
    flot = newFlot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.LITERAL__FLOT, oldFlot, flot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStr()
  {
    return str;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStr(String newStr)
  {
    String oldStr = str;
    str = newStr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.LITERAL__STR, oldStr, str));
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
      case FortXTransPackage.LITERAL__INTG:
        return getIntg();
      case FortXTransPackage.LITERAL__FLOT:
        return getFlot();
      case FortXTransPackage.LITERAL__STR:
        return getStr();
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
      case FortXTransPackage.LITERAL__INTG:
        setIntg((Integer)newValue);
        return;
      case FortXTransPackage.LITERAL__FLOT:
        setFlot((String)newValue);
        return;
      case FortXTransPackage.LITERAL__STR:
        setStr((String)newValue);
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
      case FortXTransPackage.LITERAL__INTG:
        setIntg(INTG_EDEFAULT);
        return;
      case FortXTransPackage.LITERAL__FLOT:
        setFlot(FLOT_EDEFAULT);
        return;
      case FortXTransPackage.LITERAL__STR:
        setStr(STR_EDEFAULT);
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
      case FortXTransPackage.LITERAL__INTG:
        return intg != INTG_EDEFAULT;
      case FortXTransPackage.LITERAL__FLOT:
        return FLOT_EDEFAULT == null ? flot != null : !FLOT_EDEFAULT.equals(flot);
      case FortXTransPackage.LITERAL__STR:
        return STR_EDEFAULT == null ? str != null : !STR_EDEFAULT.equals(str);
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
    result.append(" (intg: ");
    result.append(intg);
    result.append(", flot: ");
    result.append(flot);
    result.append(", str: ");
    result.append(str);
    result.append(')');
    return result.toString();
  }

} //LiteralImpl
