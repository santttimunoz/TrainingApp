/**
 * LoadRowCount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Row counts for load history.
 */
public class LoadRowCount  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Parent.
     */ 
    private com.guidewire.ab.webservices.entity.LoadCommand LoadCommand;
    /** 
        Number of blocks in source table.
     */ 
    private java.lang.Integer SourceBlockCount;
    /** 
        Number of rows in source table.
     */ 
    private java.lang.Long SourceRowCount;
    /** 
        Name of source table. NOTE: when inserting a LoadRowCount this
 * field must be non-null.
     */ 
    private java.lang.String SourceTableName;
    /** 
        Number of blocks in staging table.
     */ 
    private java.lang.Integer StagingBlockCount;
    /** 
        Number of rows in staging table.
     */ 
    private java.lang.Long StagingRowCount;
    /** 
        Name of staging table. NOTE: when inserting a LoadRowCount this
 * field must be non-null.
     */ 
    private java.lang.String StagingTableName;

    public LoadRowCount() {
    }

    public LoadRowCount(
           com.guidewire.ab.webservices.entity.LoadCommand LoadCommand,
           java.lang.Integer SourceBlockCount,
           java.lang.Long SourceRowCount,
           java.lang.String SourceTableName,
           java.lang.Integer StagingBlockCount,
           java.lang.Long StagingRowCount,
           java.lang.String StagingTableName) {
           this.LoadCommand = LoadCommand;
           this.SourceBlockCount = SourceBlockCount;
           this.SourceRowCount = SourceRowCount;
           this.SourceTableName = SourceTableName;
           this.StagingBlockCount = StagingBlockCount;
           this.StagingRowCount = StagingRowCount;
           this.StagingTableName = StagingTableName;
    }


    /**
     *  Parent.
     * 
     * @return LoadCommand Parent.
     */
    public com.guidewire.ab.webservices.entity.LoadCommand getLoadCommand() {
        return LoadCommand;
    }


    /**
     *  Parent.
     * 
     * @param LoadCommand Parent.
     */
    public void setLoadCommand(com.guidewire.ab.webservices.entity.LoadCommand LoadCommand) {
        this.LoadCommand = LoadCommand;
    }


    /**
     *  Number of blocks in source table.
     * 
     * @return SourceBlockCount Number of blocks in source table.
     */
    public java.lang.Integer getSourceBlockCount() {
        return SourceBlockCount;
    }


    /**
     *  Number of blocks in source table.
     * 
     * @param SourceBlockCount Number of blocks in source table.
     */
    public void setSourceBlockCount(java.lang.Integer SourceBlockCount) {
        this.SourceBlockCount = SourceBlockCount;
    }


    /**
     *  Number of rows in source table.
     * 
     * @return SourceRowCount Number of rows in source table.
     */
    public java.lang.Long getSourceRowCount() {
        return SourceRowCount;
    }


    /**
     *  Number of rows in source table.
     * 
     * @param SourceRowCount Number of rows in source table.
     */
    public void setSourceRowCount(java.lang.Long SourceRowCount) {
        this.SourceRowCount = SourceRowCount;
    }


    /**
     *  Name of source table. NOTE: when inserting a LoadRowCount this
 * field must be non-null.
     * 
     * @return SourceTableName Name of source table. NOTE: when inserting a LoadRowCount this
 * field must be non-null.
     */
    public java.lang.String getSourceTableName() {
        return SourceTableName;
    }


    /**
     *  Name of source table. NOTE: when inserting a LoadRowCount this
 * field must be non-null.
     * 
     * @param SourceTableName Name of source table. NOTE: when inserting a LoadRowCount this
 * field must be non-null.
     */
    public void setSourceTableName(java.lang.String SourceTableName) {
        this.SourceTableName = SourceTableName;
    }


    /**
     *  Number of blocks in staging table.
     * 
     * @return StagingBlockCount Number of blocks in staging table.
     */
    public java.lang.Integer getStagingBlockCount() {
        return StagingBlockCount;
    }


    /**
     *  Number of blocks in staging table.
     * 
     * @param StagingBlockCount Number of blocks in staging table.
     */
    public void setStagingBlockCount(java.lang.Integer StagingBlockCount) {
        this.StagingBlockCount = StagingBlockCount;
    }


    /**
     *  Number of rows in staging table.
     * 
     * @return StagingRowCount Number of rows in staging table.
     */
    public java.lang.Long getStagingRowCount() {
        return StagingRowCount;
    }


    /**
     *  Number of rows in staging table.
     * 
     * @param StagingRowCount Number of rows in staging table.
     */
    public void setStagingRowCount(java.lang.Long StagingRowCount) {
        this.StagingRowCount = StagingRowCount;
    }


    /**
     *  Name of staging table. NOTE: when inserting a LoadRowCount this
 * field must be non-null.
     * 
     * @return StagingTableName Name of staging table. NOTE: when inserting a LoadRowCount this
 * field must be non-null.
     */
    public java.lang.String getStagingTableName() {
        return StagingTableName;
    }


    /**
     *  Name of staging table. NOTE: when inserting a LoadRowCount this
 * field must be non-null.
     * 
     * @param StagingTableName Name of staging table. NOTE: when inserting a LoadRowCount this
 * field must be non-null.
     */
    public void setStagingTableName(java.lang.String StagingTableName) {
        this.StagingTableName = StagingTableName;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoadRowCount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadRowCount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loadCommand");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LoadCommand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadCommand"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceBlockCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SourceBlockCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceRowCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SourceRowCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceTableName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SourceTableName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stagingBlockCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StagingBlockCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stagingRowCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StagingRowCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stagingTableName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StagingTableName"));
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
