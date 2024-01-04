/**
 * IWorkflowAPI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;


/**
 * External API for performing operations on workflows.
 * @deprecated Use WS-I webservice gw.wsi.pl.WorkflowAPI instead.
 */
public interface IWorkflowAPI extends java.rmi.Remote {

    /**
     * Sets the state of the workflow with public ID <code>workflowID</code>
     * to WorkflowState#TC_COMPLETED.
     * <br>
 * @deprecated
     * @param workflowID the public id of the workflow
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.RequiredFieldException If the workflow id is null.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException If the workflow id did not match a valid workflow.
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void complete(java.lang.String workflowID) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.RequiredFieldException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Invokes the triggerKey on the current step of the specified
     * workflow causing
     * the workflow to advance to the next step.
     * If a null or invalid workflow ID is passed in, an exception will be
     * thrown.  In
     * addition, if the triggerkey is null or the trigger is not available,
     * an
     * exception will be thrown.
     * <br>
 * @deprecated
     * @param workflowID The ID of the workflow
     * @param triggerKey A workflow trigger key off the current workflow
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.RequiredFieldException If the workflow id is null.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException If the workflow id did not match a valid workflow.
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void invokeTrigger(java.lang.String workflowID, com.guidewire.ab.webservices.enumeration.WorkflowTriggerKey triggerKey) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.RequiredFieldException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * True if the given trigger is available in the Workflow; i.e.
     * if it is OK to pass the
     * trigger ID to the invokeTrigger method.
     * <br>
 * @deprecated
     * @param workflowID The ID of the workflow
     * @param triggerKey A workflow trigger key off the current workflow
     * @return 
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.RequiredFieldException If the workflow id is null.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException If the workflow id did not match a valid workflow.
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public boolean isTriggerAvailable(java.lang.String workflowID, com.guidewire.ab.webservices.enumeration.WorkflowTriggerKey triggerKey) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.RequiredFieldException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Resumes all workflows in the state
     * WorkflowState#TC_ERROR or WorkflowState#TC_SUSPENDED.
     * 
     * The workflow engine will subsequently attempt to advance these workflows
     * to their next steps. For each one, if an error occurs again, the error
     * will be logged and the workflow's state set to WorkflowState#TC_ERROR.
     * <br>
 * @deprecated
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException If the workflow id did not match a valid workflow.
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void resumeAllWorkflows() throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Resumes the workflow with public ID <code>workflowID</code>.
     * 
     * The workflow engine will subsequently attempt to advance the workflow
     * to its next step. If an error occurs again, the error
     * will be logged and the workflow's state set to WorkflowState#TC_ERROR.
     * <br>
 * @deprecated
     * @param workflowID the public id of the workflow
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.RequiredFieldException If the workflow id is null.
     * @throws com.guidewire.ab.webservices.fault.EntityStateException If the workflow is not currently in the error or suspended state.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException If the workflow id did not match a valid workflow.
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void resumeWorkflow(java.lang.String workflowID) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.RequiredFieldException, com.guidewire.ab.webservices.fault.EntityStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Suspends the workflow with public ID <code>workflowID</code>.
     * <br>
 * @deprecated
     * @param workflowID the public id of the workflow
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.RequiredFieldException If the workflow id is null.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException If the workflow id did not match a valid workflow.
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void suspend(java.lang.String workflowID) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.RequiredFieldException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;
}
