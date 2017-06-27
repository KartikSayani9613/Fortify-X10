/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package srf.transpiler.fortxtrans.fortXTrans;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.GenClause#getBinding <em>Binding</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.GenClause#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getGenClause()
 * @model
 * @generated
 */
public interface GenClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Binding</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Binding</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Binding</em>' containment reference.
   * @see #setBinding(Binding)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getGenClause_Binding()
   * @model containment="true"
   * @generated
   */
  Binding getBinding();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.GenClause#getBinding <em>Binding</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Binding</em>' containment reference.
   * @see #getBinding()
   * @generated
   */
  void setBinding(Binding value);

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
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getGenClause_Expr()
   * @model containment="true"
   * @generated
   */
  Expr getExpr();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.GenClause#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expr value);

} // GenClause
