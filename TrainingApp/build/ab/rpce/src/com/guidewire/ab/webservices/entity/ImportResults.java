/**
 * ImportResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Class that contains information about the results of an import
 * call.  This data structure
 * contains data on which entities were inserted and/or updated, along
 * with any errors
 * that might have occurred during the import.
 */
public class ImportResults  implements java.io.Serializable {
    /** 
        The details of every item that was imported.
     */ 
    private com.guidewire.ab.webservices.entity.ImportResultDetail[] Details;
    /** 
        Contains any error messages that occurred during import.
     */ 
    private java.lang.String[] ErrorLog;
    /** 
        <code>true</code> if the import succeeded, <code>false</code> if
 * it failed (in which case the
 * <code>errorLog</code> field should indicate what the problem is.
     */ 
    private boolean Ok;
    /** 
        The amount of time spent parsing the XML.
     */ 
    private long ParseTime;
    /** 
        A summary of items that were imported, by type.
     */ 
    private com.guidewire.ab.webservices.entity.ImportResultSummary[] Summaries;
    /** 
        The amount of time taken to write to the database.
     */ 
    private long WriteTime;

    public ImportResults() {
    }

    public ImportResults(
           com.guidewire.ab.webservices.entity.ImportResultDetail[] Details,
           java.lang.String[] ErrorLog,
           boolean Ok,
           long ParseTime,
           com.guidewire.ab.webservices.entity.ImportResultSummary[] Summaries,
           long WriteTime) {
           this.Details = Details;
           this.ErrorLog = ErrorLog;
           this.Ok = Ok;
           this.ParseTime = ParseTime;
           this.Summaries = Summaries;
           this.WriteTime = WriteTime;
    }


    /**
     *  The details of every item that was imported.
     * 
     * @return Details The details of every item that was imported.
     */
    public com.guidewire.ab.webservices.entity.ImportResultDetail[] getDetails() {
        return Details;
    }


    /**
     *  The details of every item that was imported.
     * 
     * @param Details The details of every item that was imported.
     */
    public void setDetails(com.guidewire.ab.webservices.entity.ImportResultDetail[] Details) {
        this.Details = Details;
    }


    /**
     *  Contains any error messages that occurred during import.
     * 
     * @return ErrorLog Contains any error messages that occurred during import.
     */
    public java.lang.String[] getErrorLog() {
        return ErrorLog;
    }


    /**
     *  Contains any error messages that occurred during import.
     * 
     * @param ErrorLog Contains any error messages that occurred during import.
     */
    public void setErrorLog(java.lang.String[] ErrorLog) {
        this.ErrorLog = ErrorLog;
    }


    /**
     *  <code>true</code> if the import succeeded, <code>false</code> if
 * it failed (in which case the
 * <code>errorLog</code> field should indicate what the problem is.
     * 
     * @return Ok <code>true</code> if the import succeeded, <code>false</code> if
 * it failed (in which case the
 * <code>errorLog</code> field should indicate what the problem is.
     */
    public boolean isOk() {
        return Ok;
    }


    /**
     *  <code>true</code> if the import succeeded, <code>false</code> if
 * it failed (in which case the
 * <code>errorLog</code> field should indicate what the problem is.
     * 
     * @param Ok <code>true</code> if the import succeeded, <code>false</code> if
 * it failed (in which case the
 * <code>errorLog</code> field should indicate what the problem is.
     */
    public void setOk(boolean Ok) {
        this.Ok = Ok;
    }


    /**
     *  The amount of time spent parsing the XML.
     * 
     * @return ParseTime The amount of time spent parsing the XML.
     */
    public long getParseTime() {
        return ParseTime;
    }


    /**
     *  The amount of time spent parsing the XML.
     * 
     * @param ParseTime The amount of time spent parsing the XML.
     */
    public void setParseTime(long ParseTime) {
        this.ParseTime = ParseTime;
    }


    /**
     *  A summary of items that were imported, by type.
     * 
     * @return Summaries A summary of items that were imported, by type.
     */
    public com.guidewire.ab.webservices.entity.ImportResultSummary[] getSummaries() {
        return Summaries;
    }


    /**
     *  A summary of items that were imported, by type.
     * 
     * @param Summaries A summary of items that were imported, by type.
     */
    public void setSummaries(com.guidewire.ab.webservices.entity.ImportResultSummary[] Summaries) {
        this.Summaries = Summaries;
    }


    /**
     *  The amount of time taken to write to the database.
     * 
     * @return WriteTime The amount of time taken to write to the database.
     */
    public long getWriteTime() {
        return WriteTime;
    }


    /**
     *  The amount of time taken to write to the database.
     * 
     * @param WriteTime The amount of time taken to write to the database.
     */
    public void setWriteTime(long WriteTime) {
        this.WriteTime = WriteTime;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImportResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ImportResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Details"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ImportResultDetail"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorLog");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ErrorLog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ok");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Ok"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parseTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ParseTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summaries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Summaries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ImportResultSummary"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("writeTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WriteTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
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
