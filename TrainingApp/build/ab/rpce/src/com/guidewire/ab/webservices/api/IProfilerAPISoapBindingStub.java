/**
 * IProfilerAPISoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;

public class IProfilerAPISoapBindingStub extends org.apache.axis.client.Stub implements com.guidewire.ab.webservices.api.IProfilerAPI {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[7];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setEnableProfilerForBatchProcess");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enable"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "BatchProcessType"), com.guidewire.ab.webservices.enumeration.BatchProcessType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "hiResTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enableStackTracing"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enableQueryOptimizerTracing"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enableExtendedQueryTracing"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dbmsCounterThresholdMs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "diffDbmsCounters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "fault"),
                      "com.guidewire.ab.webservices.fault.ServerStateException",
                      new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "ServerStateException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "fault"),
                      "com.guidewire.ab.webservices.fault.PermissionException",
                      new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "PermissionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "fault"),
                      "com.guidewire.ab.webservices.fault.BadIdentifierException",
                      new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "BadIdentifierException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setEnableProfilerForBatchProcessAndWorkQueue");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enable"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "BatchProcessType"), com.guidewire.ab.webservices.enumeration.BatchProcessType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "hiResTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enableStackTracing"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enableQueryOptimizerTracing"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enableExtendedQueryTracing"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dbmsCounterThresholdMs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "diffDbmsCounters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "fault"),
                      "com.guidewire.ab.webservices.fault.ServerStateException",
                      new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "ServerStateException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "fault"),
                      "com.guidewire.ab.webservices.fault.PermissionException",
                      new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "PermissionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "fault"),
                      "com.guidewire.ab.webservices.fault.BadIdentifierException",
                      new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "BadIdentifierException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setEnableProfilerForMessageDestination");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enable"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "destinationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "hiResTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enableStackTracing"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enableQueryOptimizerTracing"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enableExtendedQueryTracing"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dbmsCounterThresholdMs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "diffDbmsCounters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "fault"),
                      "com.guidewire.ab.webservices.fault.ServerStateException",
                      new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "ServerStateException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "fault"),
                      "com.guidewire.ab.webservices.fault.PermissionException",
                      new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "PermissionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "fault"),
                      "com.guidewire.ab.webservices.fault.BadIdentifierException",
                      new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "BadIdentifierException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setEnableProfilerForStartablePlugin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enable"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pluginName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "hiResTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enableStackTracing"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enableQueryOptimizerTracing"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enableExtendedQueryTracing"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dbmsCounterThresholdMs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "diffDbmsCounters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "fault"),
                      "com.guidewire.ab.webservices.fault.ServerStateException",
                      new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "ServerStateException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "fault"),
                      "com.guidewire.ab.webservices.fault.PermissionException",
                      new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "PermissionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "fault"),
                      "com.guidewire.ab.webservices.fault.BadIdentifierException",
                      new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "BadIdentifierException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setEnableProfilerForSubsequentWebSessions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enable"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "hiResTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enableStackTracing"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enableQueryOptimizerTracing"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enableExtendedQueryTracing"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dbmsCounterThresholdMs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "diffDbmsCounters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "fault"),
                      "com.guidewire.ab.webservices.fault.ServerStateException",
                      new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "ServerStateException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "fault"),
                      "com.guidewire.ab.webservices.fault.PermissionException",
                      new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "PermissionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "fault"),
                      "com.guidewire.ab.webservices.fault.BadIdentifierException",
                      new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "BadIdentifierException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setEnableProfilerForWebService");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enable"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "serviceName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "operationName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "hiResTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enableStackTracing"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enableQueryOptimizerTracing"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enableExtendedQueryTracing"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dbmsCounterThresholdMs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "diffDbmsCounters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "fault"),
                      "com.guidewire.ab.webservices.fault.ServerStateException",
                      new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "ServerStateException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "fault"),
                      "com.guidewire.ab.webservices.fault.PermissionException",
                      new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "PermissionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "fault"),
                      "com.guidewire.ab.webservices.fault.BadIdentifierException",
                      new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "BadIdentifierException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setEnableProfilerForWorkQueue");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enable"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "BatchProcessType"), com.guidewire.ab.webservices.enumeration.BatchProcessType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "hiResTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enableStackTracing"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enableQueryOptimizerTracing"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enableExtendedQueryTracing"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dbmsCounterThresholdMs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "diffDbmsCounters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "fault"),
                      "com.guidewire.ab.webservices.fault.ServerStateException",
                      new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "ServerStateException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "fault"),
                      "com.guidewire.ab.webservices.fault.PermissionException",
                      new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "PermissionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "fault"),
                      "com.guidewire.ab.webservices.fault.BadIdentifierException",
                      new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "BadIdentifierException"), 
                      true
                     ));
        _operations[6] = oper;

    }

    public IProfilerAPISoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public IProfilerAPISoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public IProfilerAPISoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "ArrayOfArrayOf_soapenc_string");
            cachedSerQNames.add(qName);
            cls = java.lang.String[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "ArrayOf_soapenc_string");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "ArrayOf_xsd_int");
            cachedSerQNames.add(qName);
            cls = int[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABAdjudicator");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ABAdjudicator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABAttorney");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ABAttorney.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABAutoRepairShop");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ABAutoRepairShop.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABAutoScrapYard_Ext");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ABAutoScrapYard_Ext.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABAutoTowingAgcy");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ABAutoTowingAgcy.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABCompany");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ABCompany.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABCompanyVendor");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ABCompanyVendor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABContact");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ABContact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABContactAddress");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ABContactAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABContactCategoryScore");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ABContactCategoryScore.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABContactSpecialistService");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ABContactSpecialistService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABContactTag");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ABContactTag.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABDoctor");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ABDoctor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABLawFirm");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ABLawFirm.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABLegalVenue");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ABLegalVenue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABMedicalCareOrg");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ABMedicalCareOrg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABPerson");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ABPerson.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABPersonVendor");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ABPersonVendor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABPlace");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ABPlace.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABPolicyCompany");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ABPolicyCompany.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABPolicyPerson");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ABPolicyPerson.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABUserContact");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ABUserContact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "AWRReportUserSettings");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.AWRReportUserSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Acknowledgement");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.Acknowledgement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Activity");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.Activity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ActivityPattern");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ActivityPattern.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Address");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.Address.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfABContactAddress");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ABContactAddress[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABContactAddress");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfABContactCategoryScore");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ABContactCategoryScore[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABContactCategoryScore");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfABContactSpecialistService");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ABContactSpecialistService[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABContactSpecialistService");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfABContactTag");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ABContactTag[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABContactTag");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfAttributeUser");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.AttributeUser[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "AttributeUser");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfBankAccount");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.BankAccount[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "BankAccount");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfBuilding_Ext");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.Building_Ext[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Building_Ext");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfContact");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.Contact[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Contact");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfContactAddress");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ContactAddress[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ContactAddress");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfContactCategoryScore");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ContactCategoryScore[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ContactCategoryScore");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfContactContact");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ContactContact[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ContactContact");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfContactNote");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ContactNote[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ContactNote");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfContactRelationshipSpecRel");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ContactRelationshipSpecRel[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ContactRelationshipSpecRel");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfContactTag");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ContactTag[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ContactTag");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfCreateUpdateOp");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.CreateUpdateOp[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "CreateUpdateOp");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfCustomEvents");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.CustomEvents[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "CustomEvents");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfDBConsistencyCheckResult");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.DBConsistencyCheckResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "DBConsistencyCheckResult");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfDataGenInfoDetail");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.DataGenInfoDetail[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "DataGenInfoDetail");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfDatabaseSnapshotInfo");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.DatabaseSnapshotInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "DatabaseSnapshotInfo");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfDeleteUpdateOp");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.DeleteUpdateOp[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "DeleteUpdateOp");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfEFTData");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.EFTData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "EFTData");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfEntityValidation");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.EntityValidation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "EntityValidation");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfFieldChangeUpdateOp");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.FieldChangeUpdateOp[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "FieldChangeUpdateOp");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfFieldChangeValue");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.FieldChangeValue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "FieldChangeValue");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfFieldChanges");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.FieldChanges[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "FieldChanges");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfFieldFilter");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.FieldFilter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "FieldFilter");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfFieldValidation");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.FieldValidation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "FieldValidation");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfFlagEntry");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.FlagEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "FlagEntry");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfGWObject");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.GWObject[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "GWObject");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfGeneralValidation");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.GeneralValidation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "GeneralValidation");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfHistoryEntry");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.HistoryEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "HistoryEntry");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfImportResultDetail");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ImportResultDetail[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ImportResultDetail");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfImportResultSummary");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ImportResultSummary[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ImportResultSummary");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfInsertPathValue");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.InsertPathValue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "InsertPathValue");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfLegalCase");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.LegalCase[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LegalCase");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfLoadCallback");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.LoadCallback[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadCallback");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfLoadCallbackResult");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.LoadCallbackResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadCallbackResult");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfLoadEncryptChunk");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.LoadEncryptChunk[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadEncryptChunk");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfLoadEncryptTable");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.LoadEncryptTable[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadEncryptTable");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfLoadInsertSelect");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.LoadInsertSelect[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadInsertSelect");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfLoadIntegrityCheck");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.LoadIntegrityCheck[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadIntegrityCheck");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfLoadOperation");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.LoadOperation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadOperation");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfLoadParameter");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.LoadParameter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadParameter");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfLoadRowCount");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.LoadRowCount[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadRowCount");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfLoadStep");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.LoadStep[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadStep");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfLoadUpdateStatisticsSelect");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.LoadUpdateStatisticsSelect[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadUpdateStatisticsSelect");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfOfficialID");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.OfficialID[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "OfficialID");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfOrganizationZoneAdmin");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.OrganizationZoneAdmin[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "OrganizationZoneAdmin");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfPathValue");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.PathValue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "PathValue");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfReviewSummaryCategoryScore");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ReviewSummaryCategoryScore[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ReviewSummaryCategoryScore");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfRolePrivilege");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.RolePrivilege[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "RolePrivilege");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfSessionData");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.SessionData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "SessionData");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfSetPathValuesIDRef");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.SetPathValuesIDRef[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "SetPathValuesIDRef");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfSpecialistServiceParent");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.SpecialistServiceParent[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "SpecialistServiceParent");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfTempToPermEntry");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.TempToPermEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "TempToPermEntry");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfTypeKeyData");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.TypeKeyData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "TypeKeyData");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfUpdateDBStatisticsCommand");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.UpdateDBStatisticsCommand[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "UpdateDBStatisticsCommand");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfUserRole");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.UserRole[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "UserRole");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfValidationWarning");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ValidationWarning[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ValidationWarning");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfVendorEvaluation");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.VendorEvaluation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "VendorEvaluation");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfWQTaskDetails");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.WQTaskDetails[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "WQTaskDetails");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ArrayOfWQueueExecutorDetails");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.WQueueExecutorDetails[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "WQueueExecutorDetails");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "AssignableQueue");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.AssignableQueue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Attribute");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.Attribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "AttributeUser");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.AttributeUser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "BankAccount");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.BankAccount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Building_Ext");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.Building_Ext.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Company");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.Company.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "CompanyVendor");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.CompanyVendor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Contact");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.Contact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ContactAddress");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ContactAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ContactCategoryScore");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ContactCategoryScore.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ContactContact");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ContactContact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ContactFindMatchResult");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ContactFindMatchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ContactNote");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ContactNote.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ContactRelationshipSpec");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ContactRelationshipSpec.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ContactRelationshipSpecRel");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ContactRelationshipSpecRel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ContactSearchCriteria");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ContactSearchCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ContactSearchResult");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ContactSearchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ContactTag");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ContactTag.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ContactUpdateResult");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ContactUpdateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "CreateUpdateOp");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.CreateUpdateOp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Credential");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.Credential.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "CurrencyAmount");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.CurrencyAmount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "CustomEvents");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.CustomEvents.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "DBConsistencyCheckResult");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.DBConsistencyCheckResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "DataChange");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.DataChange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "DataGenInfo");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.DataGenInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "DataGenInfoDetail");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.DataGenInfoDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "DatabaseSnapshotInfo");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.DatabaseSnapshotInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "DateCriteria");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.DateCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "DateCriterionChoice");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.DateCriterionChoice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "DeleteUpdateOp");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.DeleteUpdateOp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Document");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.Document.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "EFTData");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.EFTData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "EntityValidation");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.EntityValidation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ExtContactSrchResult");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ExtContactSrchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "FieldChangeUpdateOp");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.FieldChangeUpdateOp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "FieldChangeValue");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.FieldChangeValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "FieldChanges");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.FieldChanges.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "FieldFilter");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.FieldFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "FieldValidation");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.FieldValidation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "FinancialSummary");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.FinancialSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "FindIdsResult");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.FindIdsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "FlagEntry");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.FlagEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "GWObject");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.GWObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "GeneralValidation");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.GeneralValidation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Group");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.Group.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "HistoryEntry");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.HistoryEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ImportResultDetail");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ImportResultDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ImportResultSummary");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ImportResultSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ImportResults");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ImportResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "InsertPathValue");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.InsertPathValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LegalCase");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.LegalCase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LegalVenue");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.LegalVenue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadCallback");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.LoadCallback.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadCallbackResult");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.LoadCallbackResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadCommand");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.LoadCommand.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadEncryptChunk");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.LoadEncryptChunk.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadEncryptTable");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.LoadEncryptTable.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadInsertSelect");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.LoadInsertSelect.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadIntegrityCheck");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.LoadIntegrityCheck.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadOperation");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.LoadOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadParameter");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.LoadParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadRowCount");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.LoadRowCount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadStep");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.LoadStep.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadUpdateStatisticsSelect");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.LoadUpdateStatisticsSelect.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Message");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.Message.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "MessageGenerator");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.MessageGenerator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "MessageHistory");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.MessageHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "MessageOptionalFields");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.MessageOptionalFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "MessageStatisticsData");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.MessageStatisticsData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "NameCriteria");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.NameCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Note");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.Note.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ObjectFilter");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ObjectFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "OfficialID");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.OfficialID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Organization");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.Organization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "OrganizationZoneAdmin");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.OrganizationZoneAdmin.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "PathValue");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.PathValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Person");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.Person.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "PersonVendor");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.PersonVendor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Place");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.Place.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ProcessID");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ProcessID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ProcessStatus");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ProcessStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ProximitySearchParameters");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ProximitySearchParameters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ReviewSummary");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ReviewSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ReviewSummaryCategoryScore");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ReviewSummaryCategoryScore.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Role");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.Role.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "RolePrivilege");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.RolePrivilege.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "SearchResult");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.SearchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ServerVersion");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ServerVersion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "SessionData");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.SessionData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "SetPathValuesIDRef");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.SetPathValuesIDRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "SetPathValuesResult");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.SetPathValuesResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "SpatialPoint");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.SpatialPoint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "SpecialistService");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.SpecialistService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "SpecialistServiceParent");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.SpecialistServiceParent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "TableImportResult");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.TableImportResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "TempToPermEntry");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.TempToPermEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "TypeKeyData");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.TypeKeyData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "UpdateBatch");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.UpdateBatch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "UpdateDBStatisticsCommand");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.UpdateDBStatisticsCommand.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "UpdateOp");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.UpdateOp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "User");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.User.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "UserContact");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.UserContact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "UserRole");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.UserRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ValidationIssue");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ValidationIssue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ValidationResult");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ValidationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ValidationWarning");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ValidationWarning.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "VendorEvaluation");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.VendorEvaluation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ViewedContact");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.ViewedContact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "WQTaskDetails");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.WQTaskDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "WQueueExecutorDetails");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.WQueueExecutorDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "WQueueStatus");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.WQueueStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "WorkQueueConfig");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.WorkQueueConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "WorkQueueStatus");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.WorkQueueStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Workflow");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.entity.Workflow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ABContact");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.ABContact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "Activity");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.Activity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ActivityCategory");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.ActivityCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ActivityClass");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.ActivityClass.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ActivityType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.ActivityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "Address");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.Address.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "AddressType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.AddressType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "AdjudicativeDomain");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.AdjudicativeDomain.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ArrayOfReviewCategory");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.ReviewCategory[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ReviewCategory");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "AutoSync");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.AutoSync.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "BankAccountType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.BankAccountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "BatchProcessType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.BatchProcessType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "BuildingType_Ext");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.BuildingType_Ext.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "BusinessType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.BusinessType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "Contact");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.Contact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ContactCreationApprovalStatus");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.ContactCreationApprovalStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ContactMatchResultType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.ContactMatchResultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ContactNoteType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.ContactNoteType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ContactRel");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.ContactRel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ContactSearchResultType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.ContactSearchResultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ContactSearchType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.ContactSearchType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ContactTagType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.ContactTagType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ContactTier");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.ContactTier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "Country");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.Country.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "Currency");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.Currency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "DataChangeStatus");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.DataChangeStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "DataGenActionType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.DataGenActionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "DataGenStatusType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.DataGenStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "DateFieldsToSearchType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.DateFieldsToSearchType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "DateRangeChoiceType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.DateRangeChoiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "DateSearchType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.DateSearchType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "DoctorCategoryType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.DoctorCategoryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "DoctorSpecialtyType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.DoctorSpecialtyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "DocumentSection");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.DocumentSection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "DocumentSecurityType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.DocumentSecurityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "DocumentStatusType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.DocumentStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "DocumentType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.DocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ErrorCategory");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.ErrorCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "FlagEntryReason");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.FlagEntryReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "GW_Events");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.GW_Events.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "GenderType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.GenderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "GeocodeStatus");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.GeocodeStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "GroupType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.GroupType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "HistoryEventType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.HistoryEventType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "HolidayTagCode");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.HolidayTagCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "IncludeDaysType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.IncludeDaysType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "Jurisdiction");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.Jurisdiction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "LanguageType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.LanguageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "LegalCaseReportStatus");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.LegalCaseReportStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "LegalCaseStatus");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.LegalCaseStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "LegalCaseType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.LegalCaseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "LegalSpecialty");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.LegalSpecialty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "LoadCommandType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.LoadCommandType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "LoadErrorType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.LoadErrorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "LoadStepType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.LoadStepType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "LoaderCallbackTimeType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.LoaderCallbackTimeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "LocaleType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.LocaleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ManagerRelationshipType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.ManagerRelationshipType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "MaritalStatus");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.MaritalStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "MeasurementSystem");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.MeasurementSystem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "NamePrefix");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.NamePrefix.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "NameSuffix");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.NameSuffix.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "NoteSecurityType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.NoteSecurityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "NoteTopicType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.NoteTopicType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "OfficialID");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.OfficialID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "OfficialIDType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.OfficialIDType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "PhoneCountryCode");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.PhoneCountryCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "PrimaryPhoneType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.PrimaryPhoneType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "Priority");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.Priority.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "RefTypeEnum");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.RefTypeEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ReviewCategory");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.ReviewCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ReviewServiceType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.ReviewServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "RoleType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.RoleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "SearchObjectType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.SearchObjectType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "SearchResult");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.SearchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "SpecialtyType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.SpecialtyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "StartPointType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.StartPointType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "State");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.State.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "SystemPermissionType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.SystemPermissionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "SystemRunlevel");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.SystemRunlevel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "TaxFilingStatusType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.TaxFilingStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "TaxStatus");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.TaxStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "TimeZoneType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.TimeZoneType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "UnitOfDistance");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.UnitOfDistance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "UpdateOp");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.UpdateOp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "UserAttributeType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.UserAttributeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "UserExperienceType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.UserExperienceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "UserRole");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.UserRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ValidationIssue");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.ValidationIssue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ValidationIssueType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.ValidationIssueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ValidationLevel");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.ValidationLevel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "VendorAvailabilityType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.VendorAvailabilityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "VendorEvaluationStatus");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.VendorEvaluationStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }
    private void addBindings3() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "VendorType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.VendorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "VenueType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.VenueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "VerificationStatus");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.VerificationStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "WorkItemSetState");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.WorkItemSetState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "Workflow");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.Workflow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "WorkflowActionType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.WorkflowActionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "WorkflowActiveState");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.WorkflowActiveState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "WorkflowHandler");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.WorkflowHandler.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "WorkflowState");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.WorkflowState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "WorkflowTriggerKey");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.WorkflowTriggerKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "YesNo");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.YesNo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ZoneType");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.enumeration.ZoneType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "AlreadyExecutedException");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.fault.AlreadyExecutedException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "BadIdentifierException");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.fault.BadIdentifierException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "BatchProcessException");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.fault.BatchProcessException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "DataConversionException");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.fault.DataConversionException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "DuplicateKeyException");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.fault.DuplicateKeyException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "EntityStateException");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.fault.EntityStateException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "FieldConversionException");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.fault.FieldConversionException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "FieldFormatException");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.fault.FieldFormatException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "LoginException");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.fault.LoginException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "PermissionException");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.fault.PermissionException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "RequiredFieldException");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.fault.RequiredFieldException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "SOAPException");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.fault.SOAPException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "SOAPRetryableException");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.fault.SOAPRetryableException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "SOAPSenderException");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.fault.SOAPSenderException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "SOAPServerException");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.fault.SOAPServerException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "ServerStateException");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.fault.ServerStateException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "UnknownTypeKeyException");
            cachedSerQNames.add(qName);
            cls = com.guidewire.ab.webservices.fault.UnknownTypeKeyException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public void setEnableProfilerForBatchProcess(boolean enable, com.guidewire.ab.webservices.enumeration.BatchProcessType type, boolean hiResTime, boolean enableStackTracing, boolean enableQueryOptimizerTracing, boolean enableExtendedQueryTracing, int dbmsCounterThresholdMs, boolean diffDbmsCounters) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "setEnableProfilerForBatchProcess"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Boolean(enable), type, new java.lang.Boolean(hiResTime), new java.lang.Boolean(enableStackTracing), new java.lang.Boolean(enableQueryOptimizerTracing), new java.lang.Boolean(enableExtendedQueryTracing), new java.lang.Integer(dbmsCounterThresholdMs), new java.lang.Boolean(diffDbmsCounters)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.guidewire.ab.webservices.fault.ServerStateException) {
              throw (com.guidewire.ab.webservices.fault.ServerStateException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.guidewire.ab.webservices.fault.PermissionException) {
              throw (com.guidewire.ab.webservices.fault.PermissionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.guidewire.ab.webservices.fault.BadIdentifierException) {
              throw (com.guidewire.ab.webservices.fault.BadIdentifierException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void setEnableProfilerForBatchProcessAndWorkQueue(boolean enable, com.guidewire.ab.webservices.enumeration.BatchProcessType type, boolean hiResTime, boolean enableStackTracing, boolean enableQueryOptimizerTracing, boolean enableExtendedQueryTracing, int dbmsCounterThresholdMs, boolean diffDbmsCounters) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "setEnableProfilerForBatchProcessAndWorkQueue"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Boolean(enable), type, new java.lang.Boolean(hiResTime), new java.lang.Boolean(enableStackTracing), new java.lang.Boolean(enableQueryOptimizerTracing), new java.lang.Boolean(enableExtendedQueryTracing), new java.lang.Integer(dbmsCounterThresholdMs), new java.lang.Boolean(diffDbmsCounters)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.guidewire.ab.webservices.fault.ServerStateException) {
              throw (com.guidewire.ab.webservices.fault.ServerStateException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.guidewire.ab.webservices.fault.PermissionException) {
              throw (com.guidewire.ab.webservices.fault.PermissionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.guidewire.ab.webservices.fault.BadIdentifierException) {
              throw (com.guidewire.ab.webservices.fault.BadIdentifierException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void setEnableProfilerForMessageDestination(boolean enable, int destinationID, boolean hiResTime, boolean enableStackTracing, boolean enableQueryOptimizerTracing, boolean enableExtendedQueryTracing, int dbmsCounterThresholdMs, boolean diffDbmsCounters) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "setEnableProfilerForMessageDestination"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Boolean(enable), new java.lang.Integer(destinationID), new java.lang.Boolean(hiResTime), new java.lang.Boolean(enableStackTracing), new java.lang.Boolean(enableQueryOptimizerTracing), new java.lang.Boolean(enableExtendedQueryTracing), new java.lang.Integer(dbmsCounterThresholdMs), new java.lang.Boolean(diffDbmsCounters)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.guidewire.ab.webservices.fault.ServerStateException) {
              throw (com.guidewire.ab.webservices.fault.ServerStateException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.guidewire.ab.webservices.fault.PermissionException) {
              throw (com.guidewire.ab.webservices.fault.PermissionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.guidewire.ab.webservices.fault.BadIdentifierException) {
              throw (com.guidewire.ab.webservices.fault.BadIdentifierException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void setEnableProfilerForStartablePlugin(boolean enable, java.lang.String pluginName, boolean hiResTime, boolean enableStackTracing, boolean enableQueryOptimizerTracing, boolean enableExtendedQueryTracing, int dbmsCounterThresholdMs, boolean diffDbmsCounters) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "setEnableProfilerForStartablePlugin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Boolean(enable), pluginName, new java.lang.Boolean(hiResTime), new java.lang.Boolean(enableStackTracing), new java.lang.Boolean(enableQueryOptimizerTracing), new java.lang.Boolean(enableExtendedQueryTracing), new java.lang.Integer(dbmsCounterThresholdMs), new java.lang.Boolean(diffDbmsCounters)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.guidewire.ab.webservices.fault.ServerStateException) {
              throw (com.guidewire.ab.webservices.fault.ServerStateException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.guidewire.ab.webservices.fault.PermissionException) {
              throw (com.guidewire.ab.webservices.fault.PermissionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.guidewire.ab.webservices.fault.BadIdentifierException) {
              throw (com.guidewire.ab.webservices.fault.BadIdentifierException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void setEnableProfilerForSubsequentWebSessions(java.lang.String name, boolean enable, boolean hiResTime, boolean enableStackTracing, boolean enableQueryOptimizerTracing, boolean enableExtendedQueryTracing, int dbmsCounterThresholdMs, boolean diffDbmsCounters) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "setEnableProfilerForSubsequentWebSessions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {name, new java.lang.Boolean(enable), new java.lang.Boolean(hiResTime), new java.lang.Boolean(enableStackTracing), new java.lang.Boolean(enableQueryOptimizerTracing), new java.lang.Boolean(enableExtendedQueryTracing), new java.lang.Integer(dbmsCounterThresholdMs), new java.lang.Boolean(diffDbmsCounters)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.guidewire.ab.webservices.fault.ServerStateException) {
              throw (com.guidewire.ab.webservices.fault.ServerStateException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.guidewire.ab.webservices.fault.PermissionException) {
              throw (com.guidewire.ab.webservices.fault.PermissionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.guidewire.ab.webservices.fault.BadIdentifierException) {
              throw (com.guidewire.ab.webservices.fault.BadIdentifierException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void setEnableProfilerForWebService(boolean enable, java.lang.String serviceName, java.lang.String operationName, boolean hiResTime, boolean enableStackTracing, boolean enableQueryOptimizerTracing, boolean enableExtendedQueryTracing, int dbmsCounterThresholdMs, boolean diffDbmsCounters) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "setEnableProfilerForWebService"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Boolean(enable), serviceName, operationName, new java.lang.Boolean(hiResTime), new java.lang.Boolean(enableStackTracing), new java.lang.Boolean(enableQueryOptimizerTracing), new java.lang.Boolean(enableExtendedQueryTracing), new java.lang.Integer(dbmsCounterThresholdMs), new java.lang.Boolean(diffDbmsCounters)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.guidewire.ab.webservices.fault.ServerStateException) {
              throw (com.guidewire.ab.webservices.fault.ServerStateException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.guidewire.ab.webservices.fault.PermissionException) {
              throw (com.guidewire.ab.webservices.fault.PermissionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.guidewire.ab.webservices.fault.BadIdentifierException) {
              throw (com.guidewire.ab.webservices.fault.BadIdentifierException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void setEnableProfilerForWorkQueue(boolean enable, com.guidewire.ab.webservices.enumeration.BatchProcessType type, boolean hiResTime, boolean enableStackTracing, boolean enableQueryOptimizerTracing, boolean enableExtendedQueryTracing, int dbmsCounterThresholdMs, boolean diffDbmsCounters) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "setEnableProfilerForWorkQueue"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Boolean(enable), type, new java.lang.Boolean(hiResTime), new java.lang.Boolean(enableStackTracing), new java.lang.Boolean(enableQueryOptimizerTracing), new java.lang.Boolean(enableExtendedQueryTracing), new java.lang.Integer(dbmsCounterThresholdMs), new java.lang.Boolean(diffDbmsCounters)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.guidewire.ab.webservices.fault.ServerStateException) {
              throw (com.guidewire.ab.webservices.fault.ServerStateException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.guidewire.ab.webservices.fault.PermissionException) {
              throw (com.guidewire.ab.webservices.fault.PermissionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.guidewire.ab.webservices.fault.BadIdentifierException) {
              throw (com.guidewire.ab.webservices.fault.BadIdentifierException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
