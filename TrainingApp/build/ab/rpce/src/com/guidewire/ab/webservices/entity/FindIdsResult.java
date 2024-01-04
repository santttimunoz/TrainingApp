/**
 * FindIdsResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Deprecated interface. This class was used by the <code>IDataObjectAPI</code>
 * to return
 * object Ids.
 * @deprecated Part of IDataObjectAPI
 */
public class FindIdsResult  implements java.io.Serializable {
    /** 
        A string array containing object Ids.
 * @deprecated
     */ 
    private java.lang.String[] Ids;
    /** 
        null
 * @deprecated
     */ 
    private int NumResults;

    public FindIdsResult() {
    }

    public FindIdsResult(
           java.lang.String[] Ids,
           int NumResults) {
           this.Ids = Ids;
           this.NumResults = NumResults;
    }


    /**
     *  A string array containing object Ids.
 * @deprecated
     * 
     * @return Ids A string array containing object Ids.
 * @deprecated
     */
    public java.lang.String[] getIds() {
        return Ids;
    }


    /**
     *  A string array containing object Ids.
 * @deprecated
     * 
     * @param Ids A string array containing object Ids.
 * @deprecated
     */
    public void setIds(java.lang.String[] Ids) {
        this.Ids = Ids;
    }


    /**
     *  null
 * @deprecated
     * 
     * @return NumResults null
 * @deprecated
     */
    public int getNumResults() {
        return NumResults;
    }


    /**
     *  null
 * @deprecated
     * 
     * @param NumResults null
 * @deprecated
     */
    public void setNumResults(int NumResults) {
        this.NumResults = NumResults;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FindIdsResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "FindIdsResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ids");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numResults");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
