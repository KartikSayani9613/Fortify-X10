/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package srf.transpiler.fortxtrans.fortXTrans;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.Binding#getIdtup <em>Idtup</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.Binding#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends EObject
{
  /**
   * Returns the value of the '<em><b>Idtup</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Idtup</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Idtup</em>' containment reference.
   * @see #setIdtup(IdOrTuple)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getBinding_Idtup()
   * @model containment="true"
   * @generated
   */
  IdOrTuple getIdtup();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.Binding#getIdtup <em>Idtup</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Idtup</em>' containment reference.
   * @see #getIdtup()
   * @generated
   */
  void setIdtup(IdOrTuple value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expr)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getBinding_Expr()
   * @model containment="true"
   * @generated
   */
  Expr getExpr();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.Binding#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expr value);

} // Binding