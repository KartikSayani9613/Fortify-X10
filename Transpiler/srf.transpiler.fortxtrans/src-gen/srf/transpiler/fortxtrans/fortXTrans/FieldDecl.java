/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package srf.transpiler.fortxtrans.fortXTrans;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.FieldDecl#getPri <em>Pri</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.FieldDecl#getMut <em>Mut</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.FieldDecl#getVars <em>Vars</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.FieldDecl#getInit <em>Init</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.FieldDecl#getIdtup <em>Idtup</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.FieldDecl#getType <em>Type</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.FieldDecl#getTuptype <em>Tuptype</em>}</li>
 * </ul>
 *
 * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getFieldDecl()
 * @model
 * @generated
 */
public interface FieldDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Pri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pri</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pri</em>' attribute.
   * @see #setPri(String)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getFieldDecl_Pri()
   * @model
   * @generated
   */
  String getPri();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.FieldDecl#getPri <em>Pri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pri</em>' attribute.
   * @see #getPri()
   * @generated
   */
  void setPri(String value);

  /**
   * Returns the value of the '<em><b>Mut</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mut</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mut</em>' attribute.
   * @see #setMut(String)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getFieldDecl_Mut()
   * @model
   * @generated
   */
  String getMut();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.FieldDecl#getMut <em>Mut</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mut</em>' attribute.
   * @see #getMut()
   * @generated
   */
  void setMut(String value);

  /**
   * Returns the value of the '<em><b>Vars</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vars</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' containment reference.
   * @see #setVars(NoNewlineVarWTypes)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getFieldDecl_Vars()
   * @model containment="true"
   * @generated
   */
  NoNewlineVarWTypes getVars();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.FieldDecl#getVars <em>Vars</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vars</em>' containment reference.
   * @see #getVars()
   * @generated
   */
  void setVars(NoNewlineVarWTypes value);

  /**
   * Returns the value of the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init</em>' containment reference.
   * @see #setInit(Expr)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getFieldDecl_Init()
   * @model containment="true"
   * @generated
   */
  Expr getInit();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.FieldDecl#getInit <em>Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init</em>' containment reference.
   * @see #getInit()
   * @generated
   */
  void setInit(Expr value);

  /**
   * Returns the value of the '<em><b>Idtup</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Idtup</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Idtup</em>' containment reference.
   * @see #setIdtup(Qualified)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getFieldDecl_Idtup()
   * @model containment="true"
   * @generated
   */
  Qualified getIdtup();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.FieldDecl#getIdtup <em>Idtup</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Idtup</em>' containment reference.
   * @see #getIdtup()
   * @generated
   */
  void setIdtup(Qualified value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(SimpleName)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getFieldDecl_Type()
   * @model containment="true"
   * @generated
   */
  SimpleName getType();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.FieldDecl#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(SimpleName value);

  /**
   * Returns the value of the '<em><b>Tuptype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tuptype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tuptype</em>' containment reference.
   * @see #setTuptype(TupleType)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getFieldDecl_Tuptype()
   * @model containment="true"
   * @generated
   */
  TupleType getTuptype();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.FieldDecl#getTuptype <em>Tuptype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tuptype</em>' containment reference.
   * @see #getTuptype()
   * @generated
   */
  void setTuptype(TupleType value);

} // FieldDecl
