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

import srf.transpiler.fortxtrans.fortXTrans.DelimitedExpr;
import srf.transpiler.fortxtrans.fortXTrans.DelimitedExprList;
import srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage;
import srf.transpiler.fortxtrans.fortXTrans.Stmnt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stmnt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.StmntImpl#getDelim <em>Delim</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.StmntImpl#getDelims <em>Delims</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StmntImpl extends MinimalEObjectImpl.Container implements Stmnt
{
  /**
   * The cached value of the '{@link #getDelim() <em>Delim</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelim()
   * @generated
   * @ordered
   */
  protected DelimitedExpr delim;

  /**
   * The cached value of the '{@link #getDelims() <em>Delims</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelims()
   * @generated
   * @ordered
   */
  protected DelimitedExprList delims;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StmntImpl()
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
    return FortXTransPackage.Literals.STMNT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DelimitedExpr getDelim()
  {
    return delim;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDelim(DelimitedExpr newDelim, NotificationChain msgs)
  {
    DelimitedExpr oldDelim = delim;
    delim = newDelim;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FortXTransPackage.STMNT__DELIM, oldDelim, newDelim);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDelim(DelimitedExpr newDelim)
  {
    if (newDelim != delim)
    {
      NotificationChain msgs = null;
      if (delim != null)
        msgs = ((InternalEObject)delim).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.STMNT__DELIM, null, msgs);
      if (newDelim != null)
        msgs = ((InternalEObject)newDelim).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.STMNT__DELIM, null, msgs);
      msgs = basicSetDelim(newDelim, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.STMNT__DELIM, newDelim, newDelim));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DelimitedExprList getDelims()
  {
    return delims;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDelims(DelimitedExprList newDelims, NotificationChain msgs)
  {
    DelimitedExprList oldDelims = delims;
    delims = newDelims;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FortXTransPackage.STMNT__DELIMS, oldDelims, newDelims);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDelims(DelimitedExprList newDelims)
  {
    if (newDelims != delims)
    {
      NotificationChain msgs = null;
      if (delims != null)
        msgs = ((InternalEObject)delims).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.STMNT__DELIMS, null, msgs);
      if (newDelims != null)
        msgs = ((InternalEObject)newDelims).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.STMNT__DELIMS, null, msgs);
      msgs = basicSetDelims(newDelims, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.STMNT__DELIMS, newDelims, newDelims));
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
      case FortXTransPackage.STMNT__DELIM:
        return basicSetDelim(null, msgs);
      case FortXTransPackage.STMNT__DELIMS:
        return basicSetDelims(null, msgs);
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
      case FortXTransPackage.STMNT__DELIM:
        return getDelim();
      case FortXTransPackage.STMNT__DELIMS:
        return getDelims();
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
      case FortXTransPackage.STMNT__DELIM:
        setDelim((DelimitedExpr)newValue);
        return;
      case FortXTransPackage.STMNT__DELIMS:
        setDelims((DelimitedExprList)newValue);
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
      case FortXTransPackage.STMNT__DELIM:
        setDelim((DelimitedExpr)null);
        return;
      case FortXTransPackage.STMNT__DELIMS:
        setDelims((DelimitedExprList)null);
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
      case FortXTransPackage.STMNT__DELIM:
        return delim != null;
      case FortXTransPackage.STMNT__DELIMS:
        return delims != null;
    }
    return super.eIsSet(featureID);
  }

} //StmntImpl
