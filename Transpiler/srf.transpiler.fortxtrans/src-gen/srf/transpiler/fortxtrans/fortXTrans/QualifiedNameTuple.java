/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package srf.transpiler.fortxtrans.fortXTrans;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualified Name Tuple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.QualifiedNameTuple#getQlist <em>Qlist</em>}</li>
 * </ul>
 *
 * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getQualifiedNameTuple()
 * @model
 * @generated
 */
public interface QualifiedNameTuple extends Qualified
{
  /**
   * Returns the value of the '<em><b>Qlist</b></em>' containment reference list.
   * The list contents are of type {@link srf.transpiler.fortxtrans.fortXTrans.QualifiedName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qlist</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qlist</em>' containment reference list.
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getQualifiedNameTuple_Qlist()
   * @model containment="true"
   * @generated
   */
  EList<QualifiedName> getQlist();

} // QualifiedNameTuple
