/**
 * UpdateDBStatisticsCommand.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * DB statistics commands to run after a staging table load.
 */
public class UpdateDBStatisticsCommand  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Parent.
     */ 
    private com.guidewire.ab.webservices.entity.LoadCommand LoadCommand;
    /** 
        Update database statistics command to run. NOTE: when inserting
 * a UpdateDBStatisticsCommand this field must be non-null.
     */ 
    private java.lang.String StatsCommand;
    /** 
        Affected table. NOTE: when inserting a UpdateDBStatisticsCommand
 * this field must be non-null.
     */ 
    private java.lang.String TableName;

    public UpdateDBStatisticsCommand() {
    }

    public UpdateDBStatisticsCommand(
           com.guidewire.ab.webservices.entity.LoadCommand LoadCommand,
           java.lang.String StatsCommand,
           java.lang.String TableName) {
           this.LoadCommand = LoadCommand;
           this.StatsCommand = StatsCommand;
           this.TableName = TableName;
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
     *  Update database statistics command to run. NOTE: when inserting
 * a UpdateDBStatisticsCommand this field must be non-null.
     * 
     * @return StatsCommand Update database statistics command to run. NOTE: when inserting
 * a UpdateDBStatisticsCommand this field must be non-null.
     */
    public java.lang.String getStatsCommand() {
        return StatsCommand;
    }


    /**
     *  Update database statistics command to run. NOTE: when inserting
 * a UpdateDBStatisticsCommand this field must be non-null.
     * 
     * @param StatsCommand Update database statistics command to run. NOTE: when inserting
 * a UpdateDBStatisticsCommand this field must be non-null.
     */
    public void setStatsCommand(java.lang.String StatsCommand) {
        this.StatsCommand = StatsCommand;
    }


    /**
     *  Affected table. NOTE: when inserting a UpdateDBStatisticsCommand
 * this field must be non-null.
     * 
     * @return TableName Affected table. NOTE: when inserting a UpdateDBStatisticsCommand
 * this field must be non-null.
     */
    public java.lang.String getTableName() {
        return TableName;
    }


    /**
     *  Affected table. NOTE: when inserting a UpdateDBStatisticsCommand
 * this field must be non-null.
     * 
     * @param TableName Affected table. NOTE: when inserting a UpdateDBStatisticsCommand
 * this field must be non-null.
     */
    public void setTableName(java.lang.String TableName) {
        this.TableName = TableName;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateDBStatisticsCommand.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "UpdateDBStatisticsCommand"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loadCommand");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LoadCommand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadCommand"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statsCommand");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StatsCommand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tableName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TableName"));
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
