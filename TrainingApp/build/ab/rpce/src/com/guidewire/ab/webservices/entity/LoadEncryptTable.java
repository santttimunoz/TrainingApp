/**
 * LoadEncryptTable.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Encrypt columns in a staging table
 */
public class LoadEncryptTable  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Total rows read and updated
     */ 
    private java.lang.Integer AffectedRowCount;
    /** 
        Column(s) being encrypted (comma separated)
     */ 
    private java.lang.String ColumnsToEncrypt;
    /** 
        Timestamp when the timing completed.
     */ 
    private java.util.Calendar EndTime;
    /** 
        Parent load command
     */ 
    private com.guidewire.ab.webservices.entity.LoadCommand LoadCommand;
    /** 
     */ 
    private com.guidewire.ab.webservices.entity.LoadEncryptChunk[] LoadEncryptChunks;
    /** 
        Select statement used to read rows NOTE: when inserting a LoadEncryptTable
 * this field must be non-null.
     */ 
    private java.lang.String SelectStmt;
    /** 
        Target number of update executions in each chunk NOTE: when inserting
 * a LoadEncryptTable this field must be non-null.
     */ 
    private java.lang.Integer SizeOfTimedChuck;
    /** 
        Timestamp when the timing began.
     */ 
    private java.util.Calendar StartTime;
    /** 
        Name of table being updated NOTE: when inserting a LoadEncryptTable
 * this field must be non-null.
     */ 
    private java.lang.String TableName;
    /** 
        Update statement used to update rows NOTE: when inserting a LoadEncryptTable
 * this field must be non-null.
     */ 
    private java.lang.String UpdateStmt;

    public LoadEncryptTable() {
    }

    public LoadEncryptTable(
           java.lang.Integer AffectedRowCount,
           java.lang.String ColumnsToEncrypt,
           java.util.Calendar EndTime,
           com.guidewire.ab.webservices.entity.LoadCommand LoadCommand,
           com.guidewire.ab.webservices.entity.LoadEncryptChunk[] LoadEncryptChunks,
           java.lang.String SelectStmt,
           java.lang.Integer SizeOfTimedChuck,
           java.util.Calendar StartTime,
           java.lang.String TableName,
           java.lang.String UpdateStmt) {
           this.AffectedRowCount = AffectedRowCount;
           this.ColumnsToEncrypt = ColumnsToEncrypt;
           this.EndTime = EndTime;
           this.LoadCommand = LoadCommand;
           this.LoadEncryptChunks = LoadEncryptChunks;
           this.SelectStmt = SelectStmt;
           this.SizeOfTimedChuck = SizeOfTimedChuck;
           this.StartTime = StartTime;
           this.TableName = TableName;
           this.UpdateStmt = UpdateStmt;
    }


    /**
     *  Total rows read and updated
     * 
     * @return AffectedRowCount Total rows read and updated
     */
    public java.lang.Integer getAffectedRowCount() {
        return AffectedRowCount;
    }


    /**
     *  Total rows read and updated
     * 
     * @param AffectedRowCount Total rows read and updated
     */
    public void setAffectedRowCount(java.lang.Integer AffectedRowCount) {
        this.AffectedRowCount = AffectedRowCount;
    }


    /**
     *  Column(s) being encrypted (comma separated)
     * 
     * @return ColumnsToEncrypt Column(s) being encrypted (comma separated)
     */
    public java.lang.String getColumnsToEncrypt() {
        return ColumnsToEncrypt;
    }


    /**
     *  Column(s) being encrypted (comma separated)
     * 
     * @param ColumnsToEncrypt Column(s) being encrypted (comma separated)
     */
    public void setColumnsToEncrypt(java.lang.String ColumnsToEncrypt) {
        this.ColumnsToEncrypt = ColumnsToEncrypt;
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
     *  Parent load command
     * 
     * @return LoadCommand Parent load command
     */
    public com.guidewire.ab.webservices.entity.LoadCommand getLoadCommand() {
        return LoadCommand;
    }


    /**
     *  Parent load command
     * 
     * @param LoadCommand Parent load command
     */
    public void setLoadCommand(com.guidewire.ab.webservices.entity.LoadCommand LoadCommand) {
        this.LoadCommand = LoadCommand;
    }


    /**
     * 
     * 
     * @return LoadEncryptChunks
     */
    public com.guidewire.ab.webservices.entity.LoadEncryptChunk[] getLoadEncryptChunks() {
        return LoadEncryptChunks;
    }


    /**
     * 
     * 
     * @param LoadEncryptChunks
     */
    public void setLoadEncryptChunks(com.guidewire.ab.webservices.entity.LoadEncryptChunk[] LoadEncryptChunks) {
        this.LoadEncryptChunks = LoadEncryptChunks;
    }


    /**
     *  Select statement used to read rows NOTE: when inserting a LoadEncryptTable
 * this field must be non-null.
     * 
     * @return SelectStmt Select statement used to read rows NOTE: when inserting a LoadEncryptTable
 * this field must be non-null.
     */
    public java.lang.String getSelectStmt() {
        return SelectStmt;
    }


    /**
     *  Select statement used to read rows NOTE: when inserting a LoadEncryptTable
 * this field must be non-null.
     * 
     * @param SelectStmt Select statement used to read rows NOTE: when inserting a LoadEncryptTable
 * this field must be non-null.
     */
    public void setSelectStmt(java.lang.String SelectStmt) {
        this.SelectStmt = SelectStmt;
    }


    /**
     *  Target number of update executions in each chunk NOTE: when inserting
 * a LoadEncryptTable this field must be non-null.
     * 
     * @return SizeOfTimedChuck Target number of update executions in each chunk NOTE: when inserting
 * a LoadEncryptTable this field must be non-null.
     */
    public java.lang.Integer getSizeOfTimedChuck() {
        return SizeOfTimedChuck;
    }


    /**
     *  Target number of update executions in each chunk NOTE: when inserting
 * a LoadEncryptTable this field must be non-null.
     * 
     * @param SizeOfTimedChuck Target number of update executions in each chunk NOTE: when inserting
 * a LoadEncryptTable this field must be non-null.
     */
    public void setSizeOfTimedChuck(java.lang.Integer SizeOfTimedChuck) {
        this.SizeOfTimedChuck = SizeOfTimedChuck;
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
     *  Name of table being updated NOTE: when inserting a LoadEncryptTable
 * this field must be non-null.
     * 
     * @return TableName Name of table being updated NOTE: when inserting a LoadEncryptTable
 * this field must be non-null.
     */
    public java.lang.String getTableName() {
        return TableName;
    }


    /**
     *  Name of table being updated NOTE: when inserting a LoadEncryptTable
 * this field must be non-null.
     * 
     * @param TableName Name of table being updated NOTE: when inserting a LoadEncryptTable
 * this field must be non-null.
     */
    public void setTableName(java.lang.String TableName) {
        this.TableName = TableName;
    }


    /**
     *  Update statement used to update rows NOTE: when inserting a LoadEncryptTable
 * this field must be non-null.
     * 
     * @return UpdateStmt Update statement used to update rows NOTE: when inserting a LoadEncryptTable
 * this field must be non-null.
     */
    public java.lang.String getUpdateStmt() {
        return UpdateStmt;
    }


    /**
     *  Update statement used to update rows NOTE: when inserting a LoadEncryptTable
 * this field must be non-null.
     * 
     * @param UpdateStmt Update statement used to update rows NOTE: when inserting a LoadEncryptTable
 * this field must be non-null.
     */
    public void setUpdateStmt(java.lang.String UpdateStmt) {
        this.UpdateStmt = UpdateStmt;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoadEncryptTable.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadEncryptTable"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("affectedRowCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AffectedRowCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnsToEncrypt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ColumnsToEncrypt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
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
        elemField.setFieldName("loadCommand");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LoadCommand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadCommand"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loadEncryptChunks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LoadEncryptChunks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadEncryptChunk"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectStmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SelectStmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sizeOfTimedChuck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SizeOfTimedChuck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
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
        elemField.setFieldName("tableName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TableName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateStmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UpdateStmt"));
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
