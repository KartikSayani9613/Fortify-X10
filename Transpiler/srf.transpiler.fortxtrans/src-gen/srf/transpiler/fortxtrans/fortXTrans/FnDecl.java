/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package srf.transpiler.fortxtrans.fortXTrans;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fn Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.FnDecl#getMods <em>Mods</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.FnDecl#getFnName <em>Fn Name</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.FnDecl#getParams <em>Params</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.FnDecl#getReturn <em>Return</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.FnDecl#getFnItself <em>Fn Itself</em>}</li>
 * </ul>
 *
 * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getFnDecl()
 * @model
 * @generated
 */
public interface FnDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Mods</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mods</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mods</em>' containment reference.
   * @see #setMods(FnMods)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getFnDecl_Mods()
   * @model containment="true"
   * @generated
   */
  FnMods getMods();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.FnDecl#getMods <em>Mods</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mods</em>' containment reference.
   * @see #getMods()
   * @generated
   */
  void setMods(FnMods value);

  /**
   * Returns the value of the '<em><b>Fn Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fn Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fn Name</em>' attribute.
   * @see #setFnName(String)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getFnDecl_FnName()
   * @model
   * @generated
   */
  String getFnName();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.FnDecl#getFnName <em>Fn Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fn Name</em>' attribute.
   * @see #getFnName()
   * @generated
   */
  void setFnName(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference.
   * @see #setParams(ValParam)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getFnDecl_Params()
   * @model containment="true"
   * @generated
   */
  ValParam getParams();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.FnDecl#getParams <em>Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Params</em>' containment reference.
   * @see #getParams()
   * @generated
   */
  void setParams(ValParam value);

  /**
   * Returns the value of the '<em><b>Return</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return</em>' containment reference.
   * @see #setReturn(RetType)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getFnDecl_Return()
   * @model containment="true"
   * @generated
   */
  RetType getReturn();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.FnDecl#getReturn <em>Return</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return</em>' containment reference.
   * @see #getReturn()
   * @generated
   */
  void setReturn(RetType value);

  /**
   * Returns the value of the '<em><b>Fn Itself</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fn Itself</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fn Itself</em>' containment reference.
   * @see #setFnItself(Expression)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getFnDecl_FnItself()
   * @model containment="true"
   * @generated
   */
  Expression getFnItself();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.FnDecl#getFnItself <em>Fn Itself</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fn Itself</em>' containment reference.
   * @see #getFnItself()
   * @generated
   */
  void setFnItself(Expression value);

} // FnDecl
