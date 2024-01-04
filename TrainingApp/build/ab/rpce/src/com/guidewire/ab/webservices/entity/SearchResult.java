/**
 * SearchResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Base class use for the results of plugin search methods. The result
 * encapsulates a Boolean value
 *         indicating if results were capped, and optionally the total
 * number of matches that would have
 *         been returned had the results not been capped. The total number
 * of matches is relevant only when
 *         the capped Boolean value is true.
 *         <p>
 *         This base class is of little interest on its own but provides
 * basic functionality that may be
 *         useful for application specific subclasses.
 */
public class SearchResult  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        Returns true if and only if the results of the search have been
 * capped, that is, if fewer results are contained in this result than
 * actually satisfied the search criteria.
     */ 
    private java.lang.Boolean ResultsCapped;
    /** 
        Returns the total number of matches that would have been returned
 * had the results not been capped, or null if the value is unknown.
 * The result of this method is relevant only if ResultsCapped returns
 * true.
     */ 
    private java.lang.Integer UncappedResultCount;

    public SearchResult() {
    }

    public SearchResult(
           java.lang.Integer BeanVersion,
           java.lang.Boolean ResultsCapped,
           java.lang.Integer UncappedResultCount) {
           this.BeanVersion = BeanVersion;
           this.ResultsCapped = ResultsCapped;
           this.UncappedResultCount = UncappedResultCount;
    }


    /**
     *  Auto-incremented object version
     * 
     * @return BeanVersion Auto-incremented object version
     */
    public java.lang.Integer getBeanVersion() {
        return BeanVersion;
    }


    /**
     *  Auto-incremented object version
     * 
     * @param BeanVersion Auto-incremented object version
     */
    public void setBeanVersion(java.lang.Integer BeanVersion) {
        this.BeanVersion = BeanVersion;
    }


    /**
     *  Returns true if and only if the results of the search have been
 * capped, that is, if fewer results are contained in this result than
 * actually satisfied the search criteria.
     * 
     * @return ResultsCapped Returns true if and only if the results of the search have been
 * capped, that is, if fewer results are contained in this result than
 * actually satisfied the search criteria.
     */
    public java.lang.Boolean getResultsCapped() {
        return ResultsCapped;
    }


    /**
     *  Returns true if and only if the results of the search have been
 * capped, that is, if fewer results are contained in this result than
 * actually satisfied the search criteria.
     * 
     * @param ResultsCapped Returns true if and only if the results of the search have been
 * capped, that is, if fewer results are contained in this result than
 * actually satisfied the search criteria.
     */
    public void setResultsCapped(java.lang.Boolean ResultsCapped) {
        this.ResultsCapped = ResultsCapped;
    }


    /**
     *  Returns the total number of matches that would have been returned
 * had the results not been capped, or null if the value is unknown.
 * The result of this method is relevant only if ResultsCapped returns
 * true.
     * 
     * @return UncappedResultCount Returns the total number of matches that would have been returned
 * had the results not been capped, or null if the value is unknown.
 * The result of this method is relevant only if ResultsCapped returns
 * true.
     */
    public java.lang.Integer getUncappedResultCount() {
        return UncappedResultCount;
    }


    /**
     *  Returns the total number of matches that would have been returned
 * had the results not been capped, or null if the value is unknown.
 * The result of this method is relevant only if ResultsCapped returns
 * true.
     * 
     * @param UncappedResultCount Returns the total number of matches that would have been returned
 * had the results not been capped, or null if the value is unknown.
 * The result of this method is relevant only if ResultsCapped returns
 * true.
     */
    public void setUncappedResultCount(java.lang.Integer UncappedResultCount) {
        this.UncappedResultCount = UncappedResultCount;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "SearchResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beanVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BeanVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultsCapped");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResultsCapped"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uncappedResultCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UncappedResultCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
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
