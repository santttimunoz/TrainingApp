/**
 * IProfilerAPI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;


/**
 * API to access services offered by the Guidewire Profiler.
 * @deprecated Use WS-I webservice gw.wsi.pl.ProfilerAPI instead.
 */
public interface IProfilerAPI extends java.rmi.Remote {

    /**
     * Enable or disable the profiler for batch processes of the given
     * type
     * <br>
 * @deprecated
     * @param enable whether to enable or disable
     * @param type batch process type
     * @param hiResTime whether to use hi-resolution clock for timing (Windows only)
     * @param enableStackTracing to allow stack tracing (expensive) or not. This is ignored if enable is false
     * @param enableQueryOptimizerTracing whether to allow query optimizer tracing (expensive) or not. This is ignored if enable is false.
     * @param enableExtendedQueryTracing whether to allow extended query tracing (expensive) or not. This is ignored if enable is false.
     * @param dbmsCounterThresholdMs The threshold for how long a database operation can take before generating a report using dbms
counters for the interval (start of profiling session, end of profiling session). Use 0 to disable.
     * @param diffDbmsCounters Whether diffing DBMS counters is enabled. Only meaningful if ProfilerEnabled and DbmsCounterThresholdMs are true.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void setEnableProfilerForBatchProcess(boolean enable, com.guidewire.ab.webservices.enumeration.BatchProcessType type, boolean hiResTime, boolean enableStackTracing, boolean enableQueryOptimizerTracing, boolean enableExtendedQueryTracing, int dbmsCounterThresholdMs, boolean diffDbmsCounters) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Enable or disable the profiler for batch processes of the given
     * type and their associated work queue
     * <br>
 * @deprecated
     * @param enable whether to enable or disable
     * @param type batch process type
     * @param hiResTime whether to use hi-resolution clock for timing (Windows only)
     * @param enableStackTracing whether to allow stack tracing (expensive) or not. This is ignored if enable is false
     * @param enableQueryOptimizerTracing whether to allow query optimizer tracing (expensive) or not. This is ignored if enable is false.
     * @param enableExtendedQueryTracing whether to allow extended query tracing (expensive) or not. This is ignored if enable is false.
     * @param dbmsCounterThresholdMs The threshold for how long a database operation can take before generating a report using dbms
counters for the interval (start of profiling session, end of profiling session). Use 0 to disable.
     * @param diffDbmsCounters Whether diffing DBMS counters is enabled. Only meaningful if ProfilerEnabled and DbmsCounterThresholdMs are true.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void setEnableProfilerForBatchProcessAndWorkQueue(boolean enable, com.guidewire.ab.webservices.enumeration.BatchProcessType type, boolean hiResTime, boolean enableStackTracing, boolean enableQueryOptimizerTracing, boolean enableExtendedQueryTracing, int dbmsCounterThresholdMs, boolean diffDbmsCounters) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Enable or disable the profiler for the given message destinations
     * <br>
 * @deprecated
     * @param enable whether to enable or disable
     * @param destinationID 
     * @param hiResTime whether to use hi-resolution clock for timing (Windows only)
     * @param enableStackTracing whether to allow stack tracing (expensive) or not. This is ignored if enable is false
     * @param enableQueryOptimizerTracing whether to allow query optimizer tracing (expensive) or not. This is ignored if enable is false.
     * @param enableExtendedQueryTracing whether to allow extended query tracing (expensive) or not. This is ignored if enable is false.
     * @param dbmsCounterThresholdMs The threshold for how long a database operation can take before generating a report using dbms
counters for the interval (start of profiling session, end of profiling session). Use 0 to disable.
     * @param diffDbmsCounters Whether diffing DBMS counters is enabled. Only meaningful if ProfilerEnabled and DbmsCounterThresholdMs are true.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void setEnableProfilerForMessageDestination(boolean enable, int destinationID, boolean hiResTime, boolean enableStackTracing, boolean enableQueryOptimizerTracing, boolean enableExtendedQueryTracing, int dbmsCounterThresholdMs, boolean diffDbmsCounters) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Enable or disable the profiler for the given StartablePlugin
     * <br>
 * @deprecated
     * @param enable whether to enable or disable
     * @param pluginName 
     * @param hiResTime whether to use hi-resolution clock for timing (Windows only)
     * @param enableStackTracing whether to allow stack tracing (expensive) or not. This is ignored if enable is false
     * @param enableQueryOptimizerTracing whether to allow query optimizer tracing (expensive) or not. This is ignored if enable is false.
     * @param enableExtendedQueryTracing whether to allow extended query tracing (expensive) or not. This is ignored if enable is false.
     * @param dbmsCounterThresholdMs The threshold for how long a database operation can take before generating a report using dbms
counters for the interval (start of profiling session, end of profiling session). Use 0 to disable.
     * @param diffDbmsCounters Whether diffing DBMS counters is enabled. Only meaningful if ProfilerEnabled and DbmsCounterThresholdMs are true.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void setEnableProfilerForStartablePlugin(boolean enable, java.lang.String pluginName, boolean hiResTime, boolean enableStackTracing, boolean enableQueryOptimizerTracing, boolean enableExtendedQueryTracing, int dbmsCounterThresholdMs, boolean diffDbmsCounters) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Enable or disable the profiler for subsequent new web sessions.
     * Not recommended for production systems
     * <br>
 * @deprecated
     * @param name name for the profiler session. optional; use null for the default name.
     * @param enable whether to enable or disable
     * @param hiResTime whether to use hi-resolution clock for timing (Windows only)
     * @param enableStackTracing whether to allow stack tracing (expensive) or not. This is ignored if enable is false
     * @param enableQueryOptimizerTracing whether to allow query optimizer tracing (expensive) or not. This is ignored if enable is false.
     * @param enableExtendedQueryTracing whether to allow extended query tracing (expensive) or not. This is ignored if enable is false.
     * @param dbmsCounterThresholdMs The threshold for how long a database operation can take before generating a report using dbms
counters for the interval (start of profiling session, end of profiling session). Use 0 to disable.
     * @param diffDbmsCounters Whether diffing DBMS counters is enabled. Only meaningful if ProfilerEnabled and DbmsCounterThresholdMs are true.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void setEnableProfilerForSubsequentWebSessions(java.lang.String name, boolean enable, boolean hiResTime, boolean enableStackTracing, boolean enableQueryOptimizerTracing, boolean enableExtendedQueryTracing, int dbmsCounterThresholdMs, boolean diffDbmsCounters) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Enable or disable the profiler for the given web service (service
     * name, operation name) pair
     * <br>
 * @deprecated
     * @param enable whether to enable or disable
     * @param serviceName 
     * @param operationName 
     * @param hiResTime whether to use hi-resolution clock for timing (Windows only)
     * @param enableStackTracing whether to allow stack tracing (expensive) or not. This is ignored if enable is false
     * @param enableQueryOptimizerTracing whether to allow query optimizer tracing (expensive) or not. This is ignored if enable is false.
     * @param enableExtendedQueryTracing whether to allow extended query tracing (expensive) or not. This is ignored if enable is false.
     * @param dbmsCounterThresholdMs The threshold for how long a database operation can take before generating a report using dbms
counters for the interval (start of profiling session, end of profiling session). Use 0 to disable.
     * @param diffDbmsCounters Whether diffing DBMS counters is enabled. Only meaningful if ProfilerEnabled and DbmsCounterThresholdMs are true.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void setEnableProfilerForWebService(boolean enable, java.lang.String serviceName, java.lang.String operationName, boolean hiResTime, boolean enableStackTracing, boolean enableQueryOptimizerTracing, boolean enableExtendedQueryTracing, int dbmsCounterThresholdMs, boolean diffDbmsCounters) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Enable or disable the profiler for work queues associated with
     * the given batch process type
     * <br>
 * @deprecated
     * @param enable whether to enable or disable
     * @param type batch process type
     * @param hiResTime whether to use hi-resolution clock for timing (Windows only)
     * @param enableStackTracing whether to allow stack tracing (expensive) or not. This is ignored if enable is false
     * @param enableQueryOptimizerTracing whether to allow query optimizer tracing (expensive) or not. This is ignored if enable is false.
     * @param enableExtendedQueryTracing whether to allow extended query tracing (expensive) or not. This is ignored if enable is false.
     * @param dbmsCounterThresholdMs The threshold for how long a database operation can take before generating a report using dbms
counters for the interval (start of profiling session, end of profiling session). Use 0 to disable.
     * @param diffDbmsCounters Whether diffing DBMS counters is enabled. Only meaningful if ProfilerEnabled and DbmsCounterThresholdMs are true.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void setEnableProfilerForWorkQueue(boolean enable, com.guidewire.ab.webservices.enumeration.BatchProcessType type, boolean hiResTime, boolean enableStackTracing, boolean enableQueryOptimizerTracing, boolean enableExtendedQueryTracing, int dbmsCounterThresholdMs, boolean diffDbmsCounters) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;
}
