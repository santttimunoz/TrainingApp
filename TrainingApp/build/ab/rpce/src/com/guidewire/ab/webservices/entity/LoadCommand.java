/**
 * LoadCommand.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Staging table load history.
 */
public class LoadCommand  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Timed loader callbacks.
     */ 
    private com.guidewire.ab.webservices.entity.LoadCallback[] Callbacks;
    /** 
        ID of the user who executed the operation. NOTE: when inserting
 * a LoadCommand this field must be non-null.
     */ 
    private com.guidewire.ab.webservices.entity.User CallingUser;
    /** 
        Type of load command. NOTE: when inserting a LoadCommand this field
 * must be non-null.
     */ 
    private com.guidewire.ab.webservices.enumeration.LoadCommandType CommandType;
    /** 
        Description of the load history event.
     */ 
    private java.lang.String Description;
    /** 
        Timed loader table columns encryptions.
     */ 
    private com.guidewire.ab.webservices.entity.LoadEncryptTable[] EncryptTables;
    /** 
        Timestamp when the timing completed.
     */ 
    private java.util.Calendar EndTime;
    /** 
        Total number of integrity check errors detected for all affected
 * tables (if applicable).
     */ 
    private java.lang.Integer ErrorCount;
    /** 
        Timed loader insert/selects.
     */ 
    private com.guidewire.ab.webservices.entity.LoadInsertSelect[] InsertSelects;
    /** 
        Timed loader integrity checks.
     */ 
    private com.guidewire.ab.webservices.entity.LoadIntegrityCheck[] IntegrityChecks;
    /** 
        Parameter values for command.
     */ 
    private com.guidewire.ab.webservices.entity.LoadParameter[] ParameterNameValuePairs;
    /** 
        Row counts.
     */ 
    private com.guidewire.ab.webservices.entity.LoadRowCount[] RowCounts;
    /** 
        Timestamp when the timing began.
     */ 
    private java.util.Calendar StartTime;
    /** 
        Steps.
     */ 
    private com.guidewire.ab.webservices.entity.LoadStep[] Steps;
    /** 
        UpdateDBStatisticsCommands.
     */ 
    private com.guidewire.ab.webservices.entity.UpdateDBStatisticsCommand[] UpdateDBStatisticsCommands;

    public LoadCommand() {
    }

    public LoadCommand(
           com.guidewire.ab.webservices.entity.LoadCallback[] Callbacks,
           com.guidewire.ab.webservices.entity.User CallingUser,
           com.guidewire.ab.webservices.enumeration.LoadCommandType CommandType,
           java.lang.String Description,
           com.guidewire.ab.webservices.entity.LoadEncryptTable[] EncryptTables,
           java.util.Calendar EndTime,
           java.lang.Integer ErrorCount,
           com.guidewire.ab.webservices.entity.LoadInsertSelect[] InsertSelects,
           com.guidewire.ab.webservices.entity.LoadIntegrityCheck[] IntegrityChecks,
           com.guidewire.ab.webservices.entity.LoadParameter[] ParameterNameValuePairs,
           com.guidewire.ab.webservices.entity.LoadRowCount[] RowCounts,
           java.util.Calendar StartTime,
           com.guidewire.ab.webservices.entity.LoadStep[] Steps,
           com.guidewire.ab.webservices.entity.UpdateDBStatisticsCommand[] UpdateDBStatisticsCommands) {
           this.Callbacks = Callbacks;
           this.CallingUser = CallingUser;
           this.CommandType = CommandType;
           this.Description = Description;
           this.EncryptTables = EncryptTables;
           this.EndTime = EndTime;
           this.ErrorCount = ErrorCount;
           this.InsertSelects = InsertSelects;
           this.IntegrityChecks = IntegrityChecks;
           this.ParameterNameValuePairs = ParameterNameValuePairs;
           this.RowCounts = RowCounts;
           this.StartTime = StartTime;
           this.Steps = Steps;
           this.UpdateDBStatisticsCommands = UpdateDBStatisticsCommands;
    }


    /**
     *  Timed loader callbacks.
     * 
     * @return Callbacks Timed loader callbacks.
     */
    public com.guidewire.ab.webservices.entity.LoadCallback[] getCallbacks() {
        return Callbacks;
    }


    /**
     *  Timed loader callbacks.
     * 
     * @param Callbacks Timed loader callbacks.
     */
    public void setCallbacks(com.guidewire.ab.webservices.entity.LoadCallback[] Callbacks) {
        this.Callbacks = Callbacks;
    }


    /**
     *  ID of the user who executed the operation. NOTE: when inserting
 * a LoadCommand this field must be non-null.
     * 
     * @return CallingUser ID of the user who executed the operation. NOTE: when inserting
 * a LoadCommand this field must be non-null.
     */
    public com.guidewire.ab.webservices.entity.User getCallingUser() {
        return CallingUser;
    }


    /**
     *  ID of the user who executed the operation. NOTE: when inserting
 * a LoadCommand this field must be non-null.
     * 
     * @param CallingUser ID of the user who executed the operation. NOTE: when inserting
 * a LoadCommand this field must be non-null.
     */
    public void setCallingUser(com.guidewire.ab.webservices.entity.User CallingUser) {
        this.CallingUser = CallingUser;
    }


    /**
     *  Type of load command. NOTE: when inserting a LoadCommand this field
 * must be non-null.
     * 
     * @return CommandType Type of load command. NOTE: when inserting a LoadCommand this field
 * must be non-null.
     */
    public com.guidewire.ab.webservices.enumeration.LoadCommandType getCommandType() {
        return CommandType;
    }


    /**
     *  Type of load command. NOTE: when inserting a LoadCommand this field
 * must be non-null.
     * 
     * @param CommandType Type of load command. NOTE: when inserting a LoadCommand this field
 * must be non-null.
     */
    public void setCommandType(com.guidewire.ab.webservices.enumeration.LoadCommandType CommandType) {
        this.CommandType = CommandType;
    }


    /**
     *  Description of the load history event.
     * 
     * @return Description Description of the load history event.
     */
    public java.lang.String getDescription() {
        return Description;
    }


    /**
     *  Description of the load history event.
     * 
     * @param Description Description of the load history event.
     */
    public void setDescription(java.lang.String Description) {
        this.Description = Description;
    }


    /**
     *  Timed loader table columns encryptions.
     * 
     * @return EncryptTables Timed loader table columns encryptions.
     */
    public com.guidewire.ab.webservices.entity.LoadEncryptTable[] getEncryptTables() {
        return EncryptTables;
    }


    /**
     *  Timed loader table columns encryptions.
     * 
     * @param EncryptTables Timed loader table columns encryptions.
     */
    public void setEncryptTables(com.guidewire.ab.webservices.entity.LoadEncryptTable[] EncryptTables) {
        this.EncryptTables = EncryptTables;
    }


    /**
     *  Timestamp when the timing completed.
     * 
     * @return EndTime Timestamp when the timing completed.
     */
    public java.util.Calendar getEndTime() {
        return EndTime;
    }


    /**
     *  Timestamp when the timing completed.
     * 
     * @param EndTime Timestamp when the timing completed.
     */
    public void setEndTime(java.util.Calendar EndTime) {
        this.EndTime = EndTime;
    }


    /**
     *  Total number of integrity check errors detected for all affected
 * tables (if applicable).
     * 
     * @return ErrorCount Total number of integrity check errors detected for all affected
 * tables (if applicable).
     */
    public java.lang.Integer getErrorCount() {
        return ErrorCount;
    }


    /**
     *  Total number of integrity check errors detected for all affected
 * tables (if applicable).
     * 
     * @param ErrorCount Total number of integrity check errors detected for all affected
 * tables (if applicable).
     */
    public void setErrorCount(java.lang.Integer ErrorCount) {
        this.ErrorCount = ErrorCount;
    }


    /**
     *  Timed loader insert/selects.
     * 
     * @return InsertSelects Timed loader insert/selects.
     */
    public com.guidewire.ab.webservices.entity.LoadInsertSelect[] getInsertSelects() {
        return InsertSelects;
    }


    /**
     *  Timed loader insert/selects.
     * 
     * @param InsertSelects Timed loader insert/selects.
     */
    public void setInsertSelects(com.guidewire.ab.webservices.entity.LoadInsertSelect[] InsertSelects) {
        this.InsertSelects = InsertSelects;
    }


    /**
     *  Timed loader integrity checks.
     * 
     * @return IntegrityChecks Timed loader integrity checks.
     */
    public com.guidewire.ab.webservices.entity.LoadIntegrityCheck[] getIntegrityChecks() {
        return IntegrityChecks;
    }


    /**
     *  Timed loader integrity checks.
     * 
     * @param IntegrityChecks Timed loader integrity checks.
     */
    public void setIntegrityChecks(com.guidewire.ab.webservices.entity.LoadIntegrityCheck[] IntegrityChecks) {
        this.IntegrityChecks = IntegrityChecks;
    }


    /**
     *  Parameter values for command.
     * 
     * @return ParameterNameValuePairs Parameter values for command.
     */
    public com.guidewire.ab.webservices.entity.LoadParameter[] getParameterNameValuePairs() {
        return ParameterNameValuePairs;
    }


    /**
     *  Parameter values for command.
     * 
     * @param ParameterNameValuePairs Parameter values for command.
     */
    public void setParameterNameValuePairs(com.guidewire.ab.webservices.entity.LoadParameter[] ParameterNameValuePairs) {
        this.ParameterNameValuePairs = ParameterNameValuePairs;
    }


    /**
     *  Row counts.
     * 
     * @return RowCounts Row counts.
     */
    public com.guidewire.ab.webservices.entity.LoadRowCount[] getRowCounts() {
        return RowCounts;
    }


    /**
     *  Row counts.
     * 
     * @param RowCounts Row counts.
     */
    public void setRowCounts(com.guidewire.ab.webservices.entity.LoadRowCount[] RowCounts) {
        this.RowCounts = RowCounts;
    }


    /**
     *  Timestamp when the timing began.
     * 
     * @return StartTime Timestamp when the timing began.
     */
    public java.util.Calendar getStartTime() {
        return StartTime;
    }


    /**
     *  Timestamp when the timing began.
     * 
     * @param StartTime Timestamp when the timing began.
     */
    public void setStartTime(java.util.Calendar StartTime) {
        this.StartTime = StartTime;
    }


    /**
     *  Steps.
     * 
     * @return Steps Steps.
     */
    public com.guidewire.ab.webservices.entity.LoadStep[] getSteps() {
        return Steps;
    }


    /**
     *  Steps.
     * 
     * @param Steps Steps.
     */
    public void setSteps(com.guidewire.ab.webservices.entity.LoadStep[] Steps) {
        this.Steps = Steps;
    }


    /**
     *  UpdateDBStatisticsCommands.
     * 
     * @return UpdateDBStatisticsCommands UpdateDBStatisticsCommands.
     */
    public com.guidewire.ab.webservices.entity.UpdateDBStatisticsCommand[] getUpdateDBStatisticsCommands() {
        return UpdateDBStatisticsCommands;
    }


    /**
     *  UpdateDBStatisticsCommands.
     * 
     * @param UpdateDBStatisticsCommands UpdateDBStatisticsCommands.
     */
    public void setUpdateDBStatisticsCommands(com.guidewire.ab.webservices.entity.UpdateDBStatisticsCommand[] UpdateDBStatisticsCommands) {
        this.UpdateDBStatisticsCommands = UpdateDBStatisticsCommands;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoadCommand.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadCommand"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callbacks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Callbacks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadCallback"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CallingUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commandType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CommandType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "LoadCommandType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptTables");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EncryptTables"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadEncryptTable"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ErrorCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertSelects");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InsertSelects"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadInsertSelect"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integrityChecks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IntegrityChecks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadIntegrityCheck"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterNameValuePairs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ParameterNameValuePairs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadParameter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowCounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RowCounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadRowCount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("steps");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Steps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadStep"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateDBStatisticsCommands");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UpdateDBStatisticsCommands"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "UpdateDBStatisticsCommand"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
