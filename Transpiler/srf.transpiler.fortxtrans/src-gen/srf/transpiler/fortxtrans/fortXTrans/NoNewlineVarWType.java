/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package srf.transpiler.fortxtrans.fortXTrans;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>No Newline Var WType</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.NoNewlineVarWType#getBid <em>Bid</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.NoNewlineVarWType#getIstype <em>Istype</em>}</li>
 * </ul>
 *
 * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getNoNewlineVarWType()
 * @model
 * @generated
 */
public interface NoNewlineVarWType extends EObject
{
  /**
   * Returns the value of the '<em><b>Bid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bid</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bid</em>' attribute.
   * @see #setBid(String)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getNoNewlineVarWType_Bid()
   * @model
   * @generated
   */
  String getBid();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.NoNewlineVarWType#getBid <em>Bid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bid</em>' attribute.
   * @see #getBid()
   * @generated
   */
  void setBid(String value);

  /**
   * Returns the value of the '<em><b>Istype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Istype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Istype</em>' containment reference.
   * @see #setIstype(IsType)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getNoNewlineVarWType_Istype()
   * @model containment="true"
   * @generated
   */
  IsType getIstype();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.NoNewlineVarWType#getIstype <em>Istype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Istype</em>' containment reference.
   * @see #getIstype()
   * @generated
   */
  void setIstype(IsType value);

} // NoNewlineVarWType
