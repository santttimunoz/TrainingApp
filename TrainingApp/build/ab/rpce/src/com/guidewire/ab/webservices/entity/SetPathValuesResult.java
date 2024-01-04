/**
 * SetPathValuesResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * deprecated Part of IDataObjectAPI
 */
public class SetPathValuesResult  implements java.io.Serializable {
    /** 
        null
 * @deprecated
     */ 
    private com.guidewire.ab.webservices.entity.SetPathValuesIDRef[] NewObjects;

    public SetPathValuesResult() {
    }

    public SetPathValuesResult(
           com.guidewire.ab.webservices.entity.SetPathValuesIDRef[] NewObjects) {
           this.NewObjects = NewObjects;
    }


    /**
     *  null
 * @deprecated
     * 
     * @return NewObjects null
 * @deprecated
     */
    public com.guidewire.ab.webservices.entity.SetPathValuesIDRef[] getNewObjects() {
        return NewObjects;
    }


    /**
     *  null
 * @deprecated
     * 
     * @param NewObjects null
 * @deprecated
     */
    public void setNewObjects(com.guidewire.ab.webservices.entity.SetPathValuesIDRef[] NewObjects) {
        this.NewObjects = NewObjects;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetPathValuesResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "SetPathValuesResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newObjects");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NewObjects"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "SetPathValuesIDRef"));
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
