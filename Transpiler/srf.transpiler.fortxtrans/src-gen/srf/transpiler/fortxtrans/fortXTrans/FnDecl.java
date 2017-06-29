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
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.FnDecl#getName <em>Name</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.FnDecl#getParams <em>Params</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.FnDecl#getRetVal <em>Ret Val</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.FnDecl#isBody <em>Body</em>}</li>
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
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getFnDecl_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.FnDecl#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * Returns the value of the '<em><b>Ret Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ret Val</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ret Val</em>' containment reference.
   * @see #setRetVal(RetType)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getFnDecl_RetVal()
   * @model containment="true"
   * @generated
   */
  RetType getRetVal();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.FnDecl#getRetVal <em>Ret Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ret Val</em>' containment reference.
   * @see #getRetVal()
   * @generated
   */
  void setRetVal(RetType value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' attribute.
   * @see #setBody(boolean)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getFnDecl_Body()
   * @model
   * @generated
   */
  boolean isBody();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.FnDecl#isBody <em>Body</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' attribute.
   * @see #isBody()
   * @generated
   */
  void setBody(boolean value);

  /**
   * Returns the value of the '<em><b>Fn Itself</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fn Itself</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fn Itself</em>' containment reference.
   * @see #setFnItself(Expr)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getFnDecl_FnItself()
   * @model containment="true"
   * @generated
   */
  Expr getFnItself();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.FnDecl#getFnItself <em>Fn Itself</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fn Itself</em>' containment reference.
   * @see #getFnItself()
   * @generated
   */
  void setFnItself(Expr value);

} // FnDecl
