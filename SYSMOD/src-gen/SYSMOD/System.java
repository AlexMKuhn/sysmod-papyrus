/**
 */
package SYSMOD;

import org.eclipse.papyrus.sysml16.blocks.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SYSMOD.System#getSystemIdea <em>System Idea</em>}</li>
 * </ul>
 *
 * @see SYSMOD.SYSMODPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends Block {
	/**
	 * Returns the value of the '<em><b>System Idea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Idea</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Idea</em>' attribute.
	 * @see #setSystemIdea(String)
	 * @see SYSMOD.SYSMODPackage#getSystem_SystemIdea()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getSystemIdea();

	/**
	 * Sets the value of the '{@link SYSMOD.System#getSystemIdea <em>System Idea</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Idea</em>' attribute.
	 * @see #getSystemIdea()
	 * @generated
	 */
	void setSystemIdea(String value);

} // System
