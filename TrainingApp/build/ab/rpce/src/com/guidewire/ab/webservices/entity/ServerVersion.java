/**
 * ServerVersion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Data transfer object containing the servers version information.
 */
public class ServerVersion  implements java.io.Serializable {
    /** 
        The version of the application
     */ 
    private java.lang.String AppVersion;
    /** 
        Gets the version of the configuration files
     */ 
    private java.lang.String ConfigVersion;
    /** 
     */ 
    private java.lang.String ConfigVersionModified;
    /** 
        The version of the platform
     */ 
    private java.lang.String PlatformVersion;
    /** 
        The schema version
     */ 
    private java.lang.String SchemaVersion;

    public ServerVersion() {
    }

    public ServerVersion(
           java.lang.String AppVersion,
           java.lang.String ConfigVersion,
           java.lang.String ConfigVersionModified,
           java.lang.String PlatformVersion,
           java.lang.String SchemaVersion) {
           this.AppVersion = AppVersion;
           this.ConfigVersion = ConfigVersion;
           this.ConfigVersionModified = ConfigVersionModified;
           this.PlatformVersion = PlatformVersion;
           this.SchemaVersion = SchemaVersion;
    }


    /**
     *  The version of the application
     * 
     * @return AppVersion The version of the application
     */
    public java.lang.String getAppVersion() {
        return AppVersion;
    }


    /**
     *  The version of the application
     * 
     * @param AppVersion The version of the application
     */
    public void setAppVersion(java.lang.String AppVersion) {
        this.AppVersion = AppVersion;
    }


    /**
     *  Gets the version of the configuration files
     * 
     * @return ConfigVersion Gets the version of the configuration files
     */
    public java.lang.String getConfigVersion() {
        return ConfigVersion;
    }


    /**
     *  Gets the version of the configuration files
     * 
     * @param ConfigVersion Gets the version of the configuration files
     */
    public void setConfigVersion(java.lang.String ConfigVersion) {
        this.ConfigVersion = ConfigVersion;
    }


    /**
     * 
     * 
     * @return ConfigVersionModified
     */
    public java.lang.String getConfigVersionModified() {
        return ConfigVersionModified;
    }


    /**
     * 
     * 
     * @param ConfigVersionModified
     */
    public void setConfigVersionModified(java.lang.String ConfigVersionModified) {
        this.ConfigVersionModified = ConfigVersionModified;
    }


    /**
     *  The version of the platform
     * 
     * @return PlatformVersion The version of the platform
     */
    public java.lang.String getPlatformVersion() {
        return PlatformVersion;
    }


    /**
     *  The version of the platform
     * 
     * @param PlatformVersion The version of the platform
     */
    public void setPlatformVersion(java.lang.String PlatformVersion) {
        this.PlatformVersion = PlatformVersion;
    }


    /**
     *  The schema version
     * 
     * @return SchemaVersion The schema version
     */
    public java.lang.String getSchemaVersion() {
        return SchemaVersion;
    }


    /**
     *  The schema version
     * 
     * @param SchemaVersion The schema version
     */
    public void setSchemaVersion(java.lang.String SchemaVersion) {
        this.SchemaVersion = SchemaVersion;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServerVersion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ServerVersion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AppVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ConfigVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configVersionModified");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ConfigVersionModified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("platformVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PlatformVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schemaVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SchemaVersion"));
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
