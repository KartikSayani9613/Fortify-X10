/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package srf.transpiler.fortxtrans.fortXTrans;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Elems</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.BlockElems#getBlock <em>Block</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.BlockElems#getMoreBlocks <em>More Blocks</em>}</li>
 * </ul>
 *
 * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getBlockElems()
 * @model
 * @generated
 */
public interface BlockElems extends Expression
{
  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference.
   * @see #setBlock(Expression)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getBlockElems_Block()
   * @model containment="true"
   * @generated
   */
  Expression getBlock();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.BlockElems#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(Expression value);

  /**
   * Returns the value of the '<em><b>More Blocks</b></em>' containment reference list.
   * The list contents are of type {@link srf.transpiler.fortxtrans.fortXTrans.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>More Blocks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>More Blocks</em>' containment reference list.
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getBlockElems_MoreBlocks()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getMoreBlocks();

} // BlockElems
