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

import srf.transpiler.fortxtrans.fortXTrans.Expression;
import srf.transpiler.fortxtrans.fortXTrans.FnDecl;
import srf.transpiler.fortxtrans.fortXTrans.FnMods;
import srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage;
import srf.transpiler.fortxtrans.fortXTrans.RetType;
import srf.transpiler.fortxtrans.fortXTrans.ValParam;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fn Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.FnDeclImpl#getMods <em>Mods</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.FnDeclImpl#getFnName <em>Fn Name</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.FnDeclImpl#getParams <em>Params</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.FnDeclImpl#getReturn <em>Return</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.FnDeclImpl#getFnItself <em>Fn Itself</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FnDeclImpl extends MinimalEObjectImpl.Container implements FnDecl
{
  /**
   * The cached value of the '{@link #getMods() <em>Mods</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMods()
   * @generated
   * @ordered
   */
  protected FnMods mods;

  /**
   * The default value of the '{@link #getFnName() <em>Fn Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFnName()
   * @generated
   * @ordered
   */
  protected static final String FN_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFnName() <em>Fn Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFnName()
   * @generated
   * @ordered
   */
  protected String fnName = FN_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected ValParam params;

  /**
   * The cached value of the '{@link #getReturn() <em>Return</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturn()
   * @generated
   * @ordered
   */
  protected RetType return_;

  /**
   * The cached value of the '{@link #getFnItself() <em>Fn Itself</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFnItself()
   * @generated
   * @ordered
   */
  protected Expression fnItself;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FnDeclImpl()
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
    return FortXTransPackage.Literals.FN_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FnMods getMods()
  {
    return mods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMods(FnMods newMods, NotificationChain msgs)
  {
    FnMods oldMods = mods;
    mods = newMods;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FortXTransPackage.FN_DECL__MODS, oldMods, newMods);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMods(FnMods newMods)
  {
    if (newMods != mods)
    {
      NotificationChain msgs = null;
      if (mods != null)
        msgs = ((InternalEObject)mods).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.FN_DECL__MODS, null, msgs);
      if (newMods != null)
        msgs = ((InternalEObject)newMods).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.FN_DECL__MODS, null, msgs);
      msgs = basicSetMods(newMods, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.FN_DECL__MODS, newMods, newMods));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFnName()
  {
    return fnName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFnName(String newFnName)
  {
    String oldFnName = fnName;
    fnName = newFnName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.FN_DECL__FN_NAME, oldFnName, fnName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValParam getParams()
  {
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParams(ValParam newParams, NotificationChain msgs)
  {
    ValParam oldParams = params;
    params = newParams;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FortXTransPackage.FN_DECL__PARAMS, oldParams, newParams);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParams(ValParam newParams)
  {
    if (newParams != params)
    {
      NotificationChain msgs = null;
      if (params != null)
        msgs = ((InternalEObject)params).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.FN_DECL__PARAMS, null, msgs);
      if (newParams != null)
        msgs = ((InternalEObject)newParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.FN_DECL__PARAMS, null, msgs);
      msgs = basicSetParams(newParams, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.FN_DECL__PARAMS, newParams, newParams));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RetType getReturn()
  {
    return return_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturn(RetType newReturn, NotificationChain msgs)
  {
    RetType oldReturn = return_;
    return_ = newReturn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FortXTransPackage.FN_DECL__RETURN, oldReturn, newReturn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturn(RetType newReturn)
  {
    if (newReturn != return_)
    {
      NotificationChain msgs = null;
      if (return_ != null)
        msgs = ((InternalEObject)return_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.FN_DECL__RETURN, null, msgs);
      if (newReturn != null)
        msgs = ((InternalEObject)newReturn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.FN_DECL__RETURN, null, msgs);
      msgs = basicSetReturn(newReturn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.FN_DECL__RETURN, newReturn, newReturn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getFnItself()
  {
    return fnItself;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFnItself(Expression newFnItself, NotificationChain msgs)
  {
    Expression oldFnItself = fnItself;
    fnItself = newFnItself;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FortXTransPackage.FN_DECL__FN_ITSELF, oldFnItself, newFnItself);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFnItself(Expression newFnItself)
  {
    if (newFnItself != fnItself)
    {
      NotificationChain msgs = null;
      if (fnItself != null)
        msgs = ((InternalEObject)fnItself).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.FN_DECL__FN_ITSELF, null, msgs);
      if (newFnItself != null)
        msgs = ((InternalEObject)newFnItself).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.FN_DECL__FN_ITSELF, null, msgs);
      msgs = basicSetFnItself(newFnItself, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.FN_DECL__FN_ITSELF, newFnItself, newFnItself));
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
      case FortXTransPackage.FN_DECL__MODS:
        return basicSetMods(null, msgs);
      case FortXTransPackage.FN_DECL__PARAMS:
        return basicSetParams(null, msgs);
      case FortXTransPackage.FN_DECL__RETURN:
        return basicSetReturn(null, msgs);
      case FortXTransPackage.FN_DECL__FN_ITSELF:
        return basicSetFnItself(null, msgs);
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
      case FortXTransPackage.FN_DECL__MODS:
        return getMods();
      case FortXTransPackage.FN_DECL__FN_NAME:
        return getFnName();
      case FortXTransPackage.FN_DECL__PARAMS:
        return getParams();
      case FortXTransPackage.FN_DECL__RETURN:
        return getReturn();
      case FortXTransPackage.FN_DECL__FN_ITSELF:
        return getFnItself();
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
      case FortXTransPackage.FN_DECL__MODS:
        setMods((FnMods)newValue);
        return;
      case FortXTransPackage.FN_DECL__FN_NAME:
        setFnName((String)newValue);
        return;
      case FortXTransPackage.FN_DECL__PARAMS:
        setParams((ValParam)newValue);
        return;
      case FortXTransPackage.FN_DECL__RETURN:
        setReturn((RetType)newValue);
        return;
      case FortXTransPackage.FN_DECL__FN_ITSELF:
        setFnItself((Expression)newValue);
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
      case FortXTransPackage.FN_DECL__MODS:
        setMods((FnMods)null);
        return;
      case FortXTransPackage.FN_DECL__FN_NAME:
        setFnName(FN_NAME_EDEFAULT);
        return;
      case FortXTransPackage.FN_DECL__PARAMS:
        setParams((ValParam)null);
        return;
      case FortXTransPackage.FN_DECL__RETURN:
        setReturn((RetType)null);
        return;
      case FortXTransPackage.FN_DECL__FN_ITSELF:
        setFnItself((Expression)null);
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
      case FortXTransPackage.FN_DECL__MODS:
        return mods != null;
      case FortXTransPackage.FN_DECL__FN_NAME:
        return FN_NAME_EDEFAULT == null ? fnName != null : !FN_NAME_EDEFAULT.equals(fnName);
      case FortXTransPackage.FN_DECL__PARAMS:
        return params != null;
      case FortXTransPackage.FN_DECL__RETURN:
        return return_ != null;
      case FortXTransPackage.FN_DECL__FN_ITSELF:
        return fnItself != null;
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
    result.append(" (fnName: ");
    result.append(fnName);
    result.append(')');
    return result.toString();
  }

} //FnDeclImpl
