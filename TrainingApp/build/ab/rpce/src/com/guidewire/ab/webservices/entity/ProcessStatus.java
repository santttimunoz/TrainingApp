/**
 * ProcessStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Contains information about the status of a previously started batch
 * process.  This could contain status
 * information for a process that is currently running or for a process
 * that ran was run in the past.
 * If the process is not currently running, the opsCompleted and failedOps
 * fields won't have any useful information.
 */
public class ProcessStatus  implements java.io.Serializable {
    /** 
        The date that the process completed
     */ 
    private java.util.Calendar DateCompleted;
    /** 
     */ 
    private java.lang.String DetailedStatus;
    /** 
        The number of operations that failed
     */ 
    private java.lang.Integer FailedOps;
    /** 
        If the process didn't succeed, the reason that the process failed
     */ 
    private java.lang.String FailureReason;
    /** 
        The number of operations completed by the process
     */ 
    private java.lang.Integer OpsCompleted;
    /** 
        The number of operations expected to be completed by the process
     */ 
    private java.lang.Integer OpsExpected;
    /** 
     */ 
    private java.lang.String Progress;
    /** 
        Whether or not the process is currently running
     */ 
    private boolean Running;
    /** 
        The date that the process started running
     */ 
    private java.util.Calendar StartDate;
    /** 
        Whether or not the process finished successfully, or null if the
 * process has not finished its work.
     */ 
    private java.lang.Boolean Success;
    /** 
        The type of process
     */ 
    private java.lang.String Type;

    public ProcessStatus() {
    }

    public ProcessStatus(
           java.util.Calendar DateCompleted,
           java.lang.String DetailedStatus,
           java.lang.Integer FailedOps,
           java.lang.String FailureReason,
           java.lang.Integer OpsCompleted,
           java.lang.Integer OpsExpected,
           java.lang.String Progress,
           boolean Running,
           java.util.Calendar StartDate,
           java.lang.Boolean Success,
           java.lang.String Type) {
           this.DateCompleted = DateCompleted;
           this.DetailedStatus = DetailedStatus;
           this.FailedOps = FailedOps;
           this.FailureReason = FailureReason;
           this.OpsCompleted = OpsCompleted;
           this.OpsExpected = OpsExpected;
           this.Progress = Progress;
           this.Running = Running;
           this.StartDate = StartDate;
           this.Success = Success;
           this.Type = Type;
    }


    /**
     *  The date that the process completed
     * 
     * @return DateCompleted The date that the process completed
     */
    public java.util.Calendar getDateCompleted() {
        return DateCompleted;
    }


    /**
     *  The date that the process completed
     * 
     * @param DateCompleted The date that the process completed
     */
    public void setDateCompleted(java.util.Calendar DateCompleted) {
        this.DateCompleted = DateCompleted;
    }


    /**
     * 
     * 
     * @return DetailedStatus
     */
    public java.lang.String getDetailedStatus() {
        return DetailedStatus;
    }


    /**
     * 
     * 
     * @param DetailedStatus
     */
    public void setDetailedStatus(java.lang.String DetailedStatus) {
        this.DetailedStatus = DetailedStatus;
    }


    /**
     *  The number of operations that failed
     * 
     * @return FailedOps The number of operations that failed
     */
    public java.lang.Integer getFailedOps() {
        return FailedOps;
    }


    /**
     *  The number of operations that failed
     * 
     * @param FailedOps The number of operations that failed
     */
    public void setFailedOps(java.lang.Integer FailedOps) {
        this.FailedOps = FailedOps;
    }


    /**
     *  If the process didn't succeed, the reason that the process failed
     * 
     * @return FailureReason If the process didn't succeed, the reason that the process failed
     */
    public java.lang.String getFailureReason() {
        return FailureReason;
    }


    /**
     *  If the process didn't succeed, the reason that the process failed
     * 
     * @param FailureReason If the process didn't succeed, the reason that the process failed
     */
    public void setFailureReason(java.lang.String FailureReason) {
        this.FailureReason = FailureReason;
    }


    /**
     *  The number of operations completed by the process
     * 
     * @return OpsCompleted The number of operations completed by the process
     */
    public java.lang.Integer getOpsCompleted() {
        return OpsCompleted;
    }


    /**
     *  The number of operations completed by the process
     * 
     * @param OpsCompleted The number of operations completed by the process
     */
    public void setOpsCompleted(java.lang.Integer OpsCompleted) {
        this.OpsCompleted = OpsCompleted;
    }


    /**
     *  The number of operations expected to be completed by the process
     * 
     * @return OpsExpected The number of operations expected to be completed by the process
     */
    public java.lang.Integer getOpsExpected() {
        return OpsExpected;
    }


    /**
     *  The number of operations expected to be completed by the process
     * 
     * @param OpsExpected The number of operations expected to be completed by the process
     */
    public void setOpsExpected(java.lang.Integer OpsExpected) {
        this.OpsExpected = OpsExpected;
    }


    /**
     * 
     * 
     * @return Progress
     */
    public java.lang.String getProgress() {
        return Progress;
    }


    /**
     * 
     * 
     * @param Progress
     */
    public void setProgress(java.lang.String Progress) {
        this.Progress = Progress;
    }


    /**
     *  Whether or not the process is currently running
     * 
     * @return Running Whether or not the process is currently running
     */
    public boolean isRunning() {
        return Running;
    }


    /**
     *  Whether or not the process is currently running
     * 
     * @param Running Whether or not the process is currently running
     */
    public void setRunning(boolean Running) {
        this.Running = Running;
    }


    /**
     *  The date that the process started running
     * 
     * @return StartDate The date that the process started running
     */
    public java.util.Calendar getStartDate() {
        return StartDate;
    }


    /**
     *  The date that the process started running
     * 
     * @param StartDate The date that the process started running
     */
    public void setStartDate(java.util.Calendar StartDate) {
        this.StartDate = StartDate;
    }


    /**
     *  Whether or not the process finished successfully, or null if the
 * process has not finished its work.
     * 
     * @return Success Whether or not the process finished successfully, or null if the
 * process has not finished its work.
     */
    public java.lang.Boolean getSuccess() {
        return Success;
    }


    /**
     *  Whether or not the process finished successfully, or null if the
 * process has not finished its work.
     * 
     * @param Success Whether or not the process finished successfully, or null if the
 * process has not finished its work.
     */
    public void setSuccess(java.lang.Boolean Success) {
        this.Success = Success;
    }


    /**
     *  The type of process
     * 
     * @return Type The type of process
     */
    public java.lang.String getType() {
        return Type;
    }


    /**
     *  The type of process
     * 
     * @param Type The type of process
     */
    public void setType(java.lang.String Type) {
        this.Type = Type;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ProcessStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCompleted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DateCompleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailedStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DetailedStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedOps");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FailedOps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failureReason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FailureReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opsCompleted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OpsCompleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opsExpected");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OpsExpected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("progress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Progress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("running");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Running"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
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
