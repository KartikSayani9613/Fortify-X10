/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package srf.transpiler.fortxtrans.fortXTrans;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.Expr#getFront <em>Front</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.Expr#getTails <em>Tails</em>}</li>
 * </ul>
 *
 * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getExpr()
 * @model
 * @generated
 */
public interface Expr extends Expression
{
  /**
   * Returns the value of the '<em><b>Front</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Front</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Front</em>' containment reference.
   * @see #setFront(ExprFront)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getExpr_Front()
   * @model containment="true"
   * @generated
   */
  ExprFront getFront();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.Expr#getFront <em>Front</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Front</em>' containment reference.
   * @see #getFront()
   * @generated
   */
  void setFront(ExprFront value);

  /**
   * Returns the value of the '<em><b>Tails</b></em>' containment reference list.
   * The list contents are of type {@link srf.transpiler.fortxtrans.fortXTrans.ExprTail}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tails</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tails</em>' containment reference list.
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getExpr_Tails()
   * @model containment="true"
   * @generated
   */
  EList<ExprTail> getTails();

} // Expr
