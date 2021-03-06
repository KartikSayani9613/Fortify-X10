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

import srf.transpiler.fortxtrans.fortXTrans.Binding;
import srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage;
import srf.transpiler.fortxtrans.fortXTrans.GenSource;
import srf.transpiler.fortxtrans.fortXTrans.Qualified;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.BindingImpl#getIdtup <em>Idtup</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.BindingImpl#getG <em>G</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.BindingImpl#getSeq <em>Seq</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingImpl extends MinimalEObjectImpl.Container implements Binding
{
  /**
   * The cached value of the '{@link #getIdtup() <em>Idtup</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdtup()
   * @generated
   * @ordered
   */
  protected Qualified idtup;

  /**
   * The cached value of the '{@link #getG() <em>G</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getG()
   * @generated
   * @ordered
   */
  protected GenSource g;

  /**
   * The default value of the '{@link #getSeq() <em>Seq</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeq()
   * @generated
   * @ordered
   */
  protected static final String SEQ_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSeq() <em>Seq</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeq()
   * @generated
   * @ordered
   */
  protected String seq = SEQ_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BindingImpl()
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
    return FortXTransPackage.Literals.BINDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Qualified getIdtup()
  {
    return idtup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdtup(Qualified newIdtup, NotificationChain msgs)
  {
    Qualified oldIdtup = idtup;
    idtup = newIdtup;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FortXTransPackage.BINDING__IDTUP, oldIdtup, newIdtup);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdtup(Qualified newIdtup)
  {
    if (newIdtup != idtup)
    {
      NotificationChain msgs = null;
      if (idtup != null)
        msgs = ((InternalEObject)idtup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.BINDING__IDTUP, null, msgs);
      if (newIdtup != null)
        msgs = ((InternalEObject)newIdtup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.BINDING__IDTUP, null, msgs);
      msgs = basicSetIdtup(newIdtup, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.BINDING__IDTUP, newIdtup, newIdtup));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenSource getG()
  {
    return g;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetG(GenSource newG, NotificationChain msgs)
  {
    GenSource oldG = g;
    g = newG;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FortXTransPackage.BINDING__G, oldG, newG);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setG(GenSource newG)
  {
    if (newG != g)
    {
      NotificationChain msgs = null;
      if (g != null)
        msgs = ((InternalEObject)g).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.BINDING__G, null, msgs);
      if (newG != null)
        msgs = ((InternalEObject)newG).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.BINDING__G, null, msgs);
      msgs = basicSetG(newG, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.BINDING__G, newG, newG));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSeq()
  {
    return seq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSeq(String newSeq)
  {
    String oldSeq = seq;
    seq = newSeq;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.BINDING__SEQ, oldSeq, seq));
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
      case FortXTransPackage.BINDING__IDTUP:
        return basicSetIdtup(null, msgs);
      case FortXTransPackage.BINDING__G:
        return basicSetG(null, msgs);
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
      case FortXTransPackage.BINDING__IDTUP:
        return getIdtup();
      case FortXTransPackage.BINDING__G:
        return getG();
      case FortXTransPackage.BINDING__SEQ:
        return getSeq();
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
      case FortXTransPackage.BINDING__IDTUP:
        setIdtup((Qualified)newValue);
        return;
      case FortXTransPackage.BINDING__G:
        setG((GenSource)newValue);
        return;
      case FortXTransPackage.BINDING__SEQ:
        setSeq((String)newValue);
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
      case FortXTransPackage.BINDING__IDTUP:
        setIdtup((Qualified)null);
        return;
      case FortXTransPackage.BINDING__G:
        setG((GenSource)null);
        return;
      case FortXTransPackage.BINDING__SEQ:
        setSeq(SEQ_EDEFAULT);
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
      case FortXTransPackage.BINDING__IDTUP:
        return idtup != null;
      case FortXTransPackage.BINDING__G:
        return g != null;
      case FortXTransPackage.BINDING__SEQ:
        return SEQ_EDEFAULT == null ? seq != null : !SEQ_EDEFAULT.equals(seq);
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
    result.append(" (seq: ");
    result.append(seq);
    result.append(')');
    return result.toString();
  }

} //BindingImpl
