/**
 * SessionData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Returns session information for a server session.
 */
public class SessionData  implements java.io.Serializable {
    /** 
        The session id for this entry.
     */ 
    private java.lang.String SessionId;
    /** 
        The user id in the session
     */ 
    private java.lang.String UserId;
    /** 
        The name of the user's credential
     */ 
    private java.lang.String UserName;

    public SessionData() {
    }

    public SessionData(
           java.lang.String SessionId,
           java.lang.String UserId,
           java.lang.String UserName) {
           this.SessionId = SessionId;
           this.UserId = UserId;
           this.UserName = UserName;
    }


    /**
     *  The session id for this entry.
     * 
     * @return SessionId The session id for this entry.
     */
    public java.lang.String getSessionId() {
        return SessionId;
    }


    /**
     *  The session id for this entry.
     * 
     * @param SessionId The session id for this entry.
     */
    public void setSessionId(java.lang.String SessionId) {
        this.SessionId = SessionId;
    }


    /**
     *  The user id in the session
     * 
     * @return UserId The user id in the session
     */
    public java.lang.String getUserId() {
        return UserId;
    }


    /**
     *  The user id in the session
     * 
     * @param UserId The user id in the session
     */
    public void setUserId(java.lang.String UserId) {
        this.UserId = UserId;
    }


    /**
     *  The name of the user's credential
     * 
     * @return UserName The name of the user's credential
     */
    public java.lang.String getUserName() {
        return UserName;
    }


    /**
     *  The name of the user's credential
     * 
     * @param UserName The name of the user's credential
     */
    public void setUserName(java.lang.String UserName) {
        this.UserName = UserName;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SessionData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "SessionData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserName"));
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
