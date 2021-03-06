/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package srf.transpiler.fortxtrans.fortXTrans;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aliased Simple Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.AliasedSimpleName#getOrig <em>Orig</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.AliasedSimpleName#getAsName <em>As Name</em>}</li>
 * </ul>
 *
 * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getAliasedSimpleName()
 * @model
 * @generated
 */
public interface AliasedSimpleName extends EObject
{
  /**
   * Returns the value of the '<em><b>Orig</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Orig</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Orig</em>' attribute.
   * @see #setOrig(String)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getAliasedSimpleName_Orig()
   * @model
   * @generated
   */
  String getOrig();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.AliasedSimpleName#getOrig <em>Orig</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Orig</em>' attribute.
   * @see #getOrig()
   * @generated
   */
  void setOrig(String value);

  /**
   * Returns the value of the '<em><b>As Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>As Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>As Name</em>' attribute.
   * @see #setAsName(String)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getAliasedSimpleName_AsName()
   * @model
   * @generated
   */
  String getAsName();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.AliasedSimpleName#getAsName <em>As Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>As Name</em>' attribute.
   * @see #getAsName()
   * @generated
   */
  void setAsName(String value);

} // AliasedSimpleName
