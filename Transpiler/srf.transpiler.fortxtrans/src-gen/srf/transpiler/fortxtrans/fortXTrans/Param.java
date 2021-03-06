/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package srf.transpiler.fortxtrans.fortXTrans;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.Param#getParId <em>Par Id</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.Param#getIstype <em>Istype</em>}</li>
 * </ul>
 *
 * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getParam()
 * @model
 * @generated
 */
public interface Param extends EObject
{
  /**
   * Returns the value of the '<em><b>Par Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Par Id</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Par Id</em>' containment reference.
   * @see #setParId(QualifiedName)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getParam_ParId()
   * @model containment="true"
   * @generated
   */
  QualifiedName getParId();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.Param#getParId <em>Par Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Par Id</em>' containment reference.
   * @see #getParId()
   * @generated
   */
  void setParId(QualifiedName value);

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
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getParam_Istype()
   * @model containment="true"
   * @generated
   */
  IsType getIstype();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.Param#getIstype <em>Istype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Istype</em>' containment reference.
   * @see #getIstype()
   * @generated
   */
  void setIstype(IsType value);

} // Param
