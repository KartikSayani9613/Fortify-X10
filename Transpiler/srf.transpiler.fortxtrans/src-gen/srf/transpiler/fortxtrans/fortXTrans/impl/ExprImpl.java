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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import srf.transpiler.fortxtrans.fortXTrans.Expr;
import srf.transpiler.fortxtrans.fortXTrans.ExprFront;
import srf.transpiler.fortxtrans.fortXTrans.ExprTail;
import srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.ExprImpl#getFront <em>Front</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.ExprImpl#getTails <em>Tails</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExprImpl extends ExpressionImpl implements Expr
{
  /**
   * The cached value of the '{@link #getFront() <em>Front</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFront()
   * @generated
   * @ordered
   */
  protected ExprFront front;

  /**
   * The cached value of the '{@link #getTails() <em>Tails</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTails()
   * @generated
   * @ordered
   */
  protected EList<ExprTail> tails;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprImpl()
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
    return FortXTransPackage.Literals.EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprFront getFront()
  {
    return front;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFront(ExprFront newFront, NotificationChain msgs)
  {
    ExprFront oldFront = front;
    front = newFront;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FortXTransPackage.EXPR__FRONT, oldFront, newFront);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFront(ExprFront newFront)
  {
    if (newFront != front)
    {
      NotificationChain msgs = null;
      if (front != null)
        msgs = ((InternalEObject)front).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.EXPR__FRONT, null, msgs);
      if (newFront != null)
        msgs = ((InternalEObject)newFront).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.EXPR__FRONT, null, msgs);
      msgs = basicSetFront(newFront, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.EXPR__FRONT, newFront, newFront));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExprTail> getTails()
  {
    if (tails == null)
    {
      tails = new EObjectContainmentEList<ExprTail>(ExprTail.class, this, FortXTransPackage.EXPR__TAILS);
    }
    return tails;
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
      case FortXTransPackage.EXPR__FRONT:
        return basicSetFront(null, msgs);
      case FortXTransPackage.EXPR__TAILS:
        return ((InternalEList<?>)getTails()).basicRemove(otherEnd, msgs);
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
      case FortXTransPackage.EXPR__FRONT:
        return getFront();
      case FortXTransPackage.EXPR__TAILS:
        return getTails();
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
      case FortXTransPackage.EXPR__FRONT:
        setFront((ExprFront)newValue);
        return;
      case FortXTransPackage.EXPR__TAILS:
        getTails().clear();
        getTails().addAll((Collection<? extends ExprTail>)newValue);
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
      case FortXTransPackage.EXPR__FRONT:
        setFront((ExprFront)null);
        return;
      case FortXTransPackage.EXPR__TAILS:
        getTails().clear();
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
      case FortXTransPackage.EXPR__FRONT:
        return front != null;
      case FortXTransPackage.EXPR__TAILS:
        return tails != null && !tails.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExprImpl
