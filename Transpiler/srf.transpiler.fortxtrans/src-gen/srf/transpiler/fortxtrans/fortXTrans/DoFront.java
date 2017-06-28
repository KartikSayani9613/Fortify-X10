/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package srf.transpiler.fortxtrans.fortXTrans;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Do Front</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.DoFront#isAt <em>At</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.DoFront#getExp <em>Exp</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.DoFront#isAtom <em>Atom</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.DoFront#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getDoFront()
 * @model
 * @generated
 */
public interface DoFront extends EObject
{
  /**
   * Returns the value of the '<em><b>At</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>At</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>At</em>' attribute.
   * @see #setAt(boolean)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getDoFront_At()
   * @model
   * @generated
   */
  boolean isAt();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.DoFront#isAt <em>At</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>At</em>' attribute.
   * @see #isAt()
   * @generated
   */
  void setAt(boolean value);

  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Expr)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getDoFront_Exp()
   * @model containment="true"
   * @generated
   */
  Expr getExp();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.DoFront#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Expr value);

  /**
   * Returns the value of the '<em><b>Atom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atom</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atom</em>' attribute.
   * @see #setAtom(boolean)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getDoFront_Atom()
   * @model
   * @generated
   */
  boolean isAtom();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.DoFront#isAtom <em>Atom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atom</em>' attribute.
   * @see #isAtom()
   * @generated
   */
  void setAtom(boolean value);

  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference.
   * @see #setBlock(BlockElems)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getDoFront_Block()
   * @model containment="true"
   * @generated
   */
  BlockElems getBlock();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.DoFront#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(BlockElems value);

} // DoFront
