/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package srf.transpiler.fortxtrans.fortXTrans.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import srf.transpiler.fortxtrans.fortXTrans.Expr;
import srf.transpiler.fortxtrans.fortXTrans.ExprList;
import srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.ExprListImpl#getExps <em>Exps</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.ExprListImpl#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExprListImpl extends MinimalEObjectImpl.Container implements ExprList
{
  /**
   * The cached value of the '{@link #getExps() <em>Exps</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExps()
   * @generated
   * @ordered
   */
  protected Expr exps;

  /**
   * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp()
   * @generated
   * @ordered
   */
  protected EList<Expr> exp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprListImpl()
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
    return FortXTransPackage.Literals.EXPR_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getExps()
  {
    return exps;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExps(Expr newExps, NotificationChain msgs)
  {
    Expr oldExps = exps;
    exps = newExps;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FortXTransPackage.EXPR_LIST__EXPS, oldExps, newExps);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExps(Expr newExps)
  {
    if (newExps != exps)
    {
      NotificationChain msgs = null;
      if (exps != null)
        msgs = ((InternalEObject)exps).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.EXPR_LIST__EXPS, null, msgs);
      if (newExps != null)
        msgs = ((InternalEObject)newExps).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.EXPR_LIST__EXPS, null, msgs);
      msgs = basicSetExps(newExps, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.EXPR_LIST__EXPS, newExps, newExps));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expr> getExp()
  {
    if (exp == null)
    {
      exp = new EObjectContainmentEList<Expr>(Expr.class, this, FortXTransPackage.EXPR_LIST__EXP);
    }
    return exp;
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
      case FortXTransPackage.EXPR_LIST__EXPS:
        return basicSetExps(null, msgs);
      case FortXTransPackage.EXPR_LIST__EXP:
        return ((InternalEList<?>)getExp()).basicRemove(otherEnd, msgs);
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
      case FortXTransPackage.EXPR_LIST__EXPS:
        return getExps();
      case FortXTransPackage.EXPR_LIST__EXP:
        return getExp();
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
      case FortXTransPackage.EXPR_LIST__EXPS:
        setExps((Expr)newValue);
        return;
      case FortXTransPackage.EXPR_LIST__EXP:
        getExp().clear();
        getExp().addAll((Collection<? extends Expr>)newValue);
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
      case FortXTransPackage.EXPR_LIST__EXPS:
        setExps((Expr)null);
        return;
      case FortXTransPackage.EXPR_LIST__EXP:
        getExp().clear();
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
      case FortXTransPackage.EXPR_LIST__EXPS:
        return exps != null;
      case FortXTransPackage.EXPR_LIST__EXP:
        return exp != null && !exp.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExprListImpl
