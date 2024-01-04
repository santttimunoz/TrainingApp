/**
 * IMaintenanceToolsAPI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;


/**
 * An API used for managing the application. This is distinct from
 * ISystemToolsAPI which is concerned with managing the application platform.
 * @deprecated Since 8.0.0.  Please use the ab800 package.
 */
public interface IMaintenanceToolsAPI extends java.rmi.Remote {

    /**
     * Gets the status of a particular batch process invocation. 
     * If that invocation is still running,
     * the status will indicate as much, and only the startDate and opsCompleted
     * fields will be filled in.
     * Otherwise the returned object will contain information about
     * the completed run (see ProcessStatus for information about all the
     * fields returned).
     * <br>
 * @deprecated
     * @param pid the process ID to retrieve the status of
     * @return the status of that particular process invocation
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.SOAPServerException 
     * @throws com.guidewire.ab.webservices.fault.PermissionException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws com.guidewire.ab.webservices.fault.SOAPSenderException 
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.entity.ProcessStatus batchProcessStatusByID(com.guidewire.ab.webservices.entity.ProcessID pid) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.SOAPServerException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException, com.guidewire.ab.webservices.fault.SOAPSenderException;

    /**
     * Gets the status of the given batch process, indicating whether
     * or not the process is running and,
     * if so, its current progress.
     * <br>
 * @deprecated
     * @param processName the name of the process to retrieve the status of
     * @return the status of that particular process
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.SOAPServerException 
     * @throws com.guidewire.ab.webservices.fault.PermissionException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.entity.ProcessStatus batchProcessStatusByName(java.lang.String processName) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.SOAPServerException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Retrieves the number of active work items for a queue
     * <br>
 * @deprecated
     * @param queueName name of the queue
     * @return The status of the queue
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.SOAPServerException 
     * @throws com.guidewire.ab.webservices.fault.PermissionException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public int getNumActiveWorkItems(java.lang.String queueName) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.SOAPServerException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Return the set of valid batch process names
     * <br>
 * @deprecated
     * @return String[]
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.SOAPServerException 
     * @throws com.guidewire.ab.webservices.fault.PermissionException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public java.lang.String[] getValidBatchProcessNames() throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.SOAPServerException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Retrieves the status of active executors for that particular
     * queue. Each executor contains information
     * about last 25 workers ran by each executor.
     * <br>
 * @deprecated
     * @param queueName name of the queue
     * @return The status of the queue
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.SOAPServerException 
     * @throws com.guidewire.ab.webservices.fault.PermissionException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.entity.WQueueStatus getWQueueStatus(java.lang.String queueName) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.SOAPServerException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Get the current configuration of distributed workers for the
     * specified work queue.
     * <br>
 * @deprecated
     * @param queueName Name of the queue to query
     * @return A WorkQueueConfig instance containing the current settings
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.SOAPServerException 
     * @throws com.guidewire.ab.webservices.fault.PermissionException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.entity.WorkQueueConfig getWorkQueueConfig(java.lang.String queueName) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.SOAPServerException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Returns the list of work queue names for this product.
     * These names may be used in {@link #getWorkQueueConfig}
     * and {@link #setWorkQueueConfig}.
     * <br>
 * @deprecated
     * @return 
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.SOAPServerException 
     * @throws com.guidewire.ab.webservices.fault.PermissionException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public java.lang.String[] getWorkQueueNames() throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.SOAPServerException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Retrieves the worker status with information about work queues
     * across a cluster.
     * <br>
 * @deprecated (since 8.0) use the method {@link #getWQueueStatus(String)}
     * instead.  It returns more detailed and accurate
     * information about a worker queue executors and workers.
     * @param queueName name of the queue
     * @return The status of the queue
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.SOAPServerException 
     * @throws com.guidewire.ab.webservices.fault.PermissionException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.entity.WorkQueueStatus getWorkQueueStatus(java.lang.String queueName) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.SOAPServerException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Return whether a given batch process name is valid
     * <br>
 * @deprecated
     * @param processName 
     * @return boolean
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.SOAPServerException 
     * @throws com.guidewire.ab.webservices.fault.PermissionException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public boolean isBatchProcessNameValid(java.lang.String processName) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.SOAPServerException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * whether the plugin is started.
     * <br>
 * @deprecated
     * @param pluginName the name of the plugin to start
     * @return 
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public boolean isPluginStarted(java.lang.String pluginName) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Wakes up all workers for the specified queue across the cluster.
     * Workers will check for workitems and will continue
     * processing any found until the workitem table for the
     * queue is empty.
     * <br>
 * @deprecated
     * @param queueName Name of the queue to notify workers
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.SOAPServerException 
     * @throws com.guidewire.ab.webservices.fault.PermissionException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void notifyQueueWorkers(java.lang.String queueName) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.SOAPServerException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Requests termination of the given batch process, if it's currently
     * running. Note that it's possible that
     * this particular invocation could have finished and another invocation
     * of the same process
     * begun, in which case this won't request the termination of the current
     * invocation.
     * 
     * This method does not wait for the batch process to actually terminate
     * <br>
 * @deprecated
     * @param pid the process ID of the process for which to request termination
     * @return true if the request was successful, false if the process could not be terminated
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.SOAPServerException 
     * @throws com.guidewire.ab.webservices.fault.PermissionException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws com.guidewire.ab.webservices.fault.SOAPSenderException 
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public boolean requestTerminationOfBatchProcessByID(com.guidewire.ab.webservices.entity.ProcessID pid) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.SOAPServerException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException, com.guidewire.ab.webservices.fault.SOAPSenderException;

    /**
     * Requests termination of the given batch process, if it's currently
     * running.
     * 
     * This method does not wait for the batch process to actually terminate
     * <br>
 * @deprecated
     * @param processName the name of the batch process for which to request termination
     * @return true if the request was successful, false if the process could not be terminated
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.SOAPServerException 
     * @throws com.guidewire.ab.webservices.fault.PermissionException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public boolean requestTerminationOfBatchProcessByName(java.lang.String processName) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.SOAPServerException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Sets the configuration for distributed workers for the
     * specified work queue.  Any currently running worker
     * instances will be stopped after the current workitem in process
     * is completed.  New worker instances as specified by the passed
     * in config will be created and started.  Note that the
     * changes made here are temporary; if the server is restarted,
     * the initial values from config.xml will be used when creating
     * and starting workers.
     * <br>
 * @deprecated
     * @param queueName Name of the queue to modify
     * @param config The configuration to establish.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.SOAPServerException 
     * @throws com.guidewire.ab.webservices.fault.PermissionException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void setWorkQueueConfig(java.lang.String queueName, com.guidewire.ab.webservices.entity.WorkQueueConfig config) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.SOAPServerException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Starts the given batch process.  If the process is already
     * running on the server,
     * an exception will be thrown.
     * <br>
 * @deprecated
     * @param processName the name of the batch process to start
     * @return the ProcessID of the process that was started
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.SOAPServerException 
     * @throws com.guidewire.ab.webservices.fault.PermissionException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.entity.ProcessID startBatchProcess(java.lang.String processName) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.SOAPServerException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Starts the given startable plugin.
     * <br>
 * @deprecated
     * @param pluginName the name of the plugin to start
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void startPlugin(java.lang.String pluginName) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * This will start the workqueue wokers
     * <br>
 * @deprecated
     * @param queueName Name of the queue
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.SOAPServerException 
     * @throws com.guidewire.ab.webservices.fault.PermissionException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void startWorkQueueWorkers(java.lang.String queueName) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.SOAPServerException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Stop the given startable plugin.
     * <br>
 * @deprecated
     * @param pluginName the name of the plugin
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void stopPlugin(java.lang.String pluginName) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * This will stop the specified ied work queue.
     * <br>
 * @deprecated
     * @param queueName Name of the queue
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.SOAPServerException 
     * @throws com.guidewire.ab.webservices.fault.PermissionException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void stopWorkQueueWorkers(java.lang.String queueName) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.SOAPServerException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Wait on the active work items for a queue
     * <br>
 * @deprecated
     * @param queueName name of the queue
     * @return true if the queue is now empty
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.SOAPServerException 
     * @throws com.guidewire.ab.webservices.fault.PermissionException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public boolean waitOnActiveWorkItems(java.lang.String queueName) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.SOAPServerException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;
}
