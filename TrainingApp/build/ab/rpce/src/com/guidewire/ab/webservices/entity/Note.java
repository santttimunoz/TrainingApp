/**
 * Note.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Notes added by users
 */
public class Note  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        User who wrote the note. NOTE: value is the PublicId of the User.
     */ 
    private java.lang.String Author;
    /** 
        Date on which the note was originally authored.  If null, the CreateTime
 * seves this purpose.
     */ 
    private java.util.Calendar AuthoringDate;
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        Body of the note.
     */ 
    private java.lang.String Body;
    /** 
        Whether the note is confidential.
     */ 
    private java.lang.Boolean Confidential;
    /** 
        The language in which this note is created.
     */ 
    private com.guidewire.ab.webservices.enumeration.LanguageType Language;
    /** 
        Type of note; used for access-restriction purposes
     */ 
    private com.guidewire.ab.webservices.enumeration.NoteSecurityType SecurityType;
    /** 
        Subject or summary of the note.
     */ 
    private java.lang.String Subject;
    /** 
        Topic to which the note belongs.
     */ 
    private com.guidewire.ab.webservices.enumeration.NoteTopicType Topic;

    public Note() {
    }

    public Note(
           java.lang.String Author,
           java.util.Calendar AuthoringDate,
           java.lang.Integer BeanVersion,
           java.lang.String Body,
           java.lang.Boolean Confidential,
           com.guidewire.ab.webservices.enumeration.LanguageType Language,
           com.guidewire.ab.webservices.enumeration.NoteSecurityType SecurityType,
           java.lang.String Subject,
           com.guidewire.ab.webservices.enumeration.NoteTopicType Topic) {
           this.Author = Author;
           this.AuthoringDate = AuthoringDate;
           this.BeanVersion = BeanVersion;
           this.Body = Body;
           this.Confidential = Confidential;
           this.Language = Language;
           this.SecurityType = SecurityType;
           this.Subject = Subject;
           this.Topic = Topic;
    }


    /**
     *  User who wrote the note. NOTE: value is the PublicId of the User.
     * 
     * @return Author User who wrote the note. NOTE: value is the PublicId of the User.
     */
    public java.lang.String getAuthor() {
        return Author;
    }


    /**
     *  User who wrote the note. NOTE: value is the PublicId of the User.
     * 
     * @param Author User who wrote the note. NOTE: value is the PublicId of the User.
     */
    public void setAuthor(java.lang.String Author) {
        this.Author = Author;
    }


    /**
     *  Date on which the note was originally authored.  If null, the CreateTime
 * seves this purpose.
     * 
     * @return AuthoringDate Date on which the note was originally authored.  If null, the CreateTime
 * seves this purpose.
     */
    public java.util.Calendar getAuthoringDate() {
        return AuthoringDate;
    }


    /**
     *  Date on which the note was originally authored.  If null, the CreateTime
 * seves this purpose.
     * 
     * @param AuthoringDate Date on which the note was originally authored.  If null, the CreateTime
 * seves this purpose.
     */
    public void setAuthoringDate(java.util.Calendar AuthoringDate) {
        this.AuthoringDate = AuthoringDate;
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
     *  Body of the note.
     * 
     * @return Body Body of the note.
     */
    public java.lang.String getBody() {
        return Body;
    }


    /**
     *  Body of the note.
     * 
     * @param Body Body of the note.
     */
    public void setBody(java.lang.String Body) {
        this.Body = Body;
    }


    /**
     *  Whether the note is confidential.
     * 
     * @return Confidential Whether the note is confidential.
     */
    public java.lang.Boolean getConfidential() {
        return Confidential;
    }


    /**
     *  Whether the note is confidential.
     * 
     * @param Confidential Whether the note is confidential.
     */
    public void setConfidential(java.lang.Boolean Confidential) {
        this.Confidential = Confidential;
    }


    /**
     *  The language in which this note is created.
     * 
     * @return Language The language in which this note is created.
     */
    public com.guidewire.ab.webservices.enumeration.LanguageType getLanguage() {
        return Language;
    }


    /**
     *  The language in which this note is created.
     * 
     * @param Language The language in which this note is created.
     */
    public void setLanguage(com.guidewire.ab.webservices.enumeration.LanguageType Language) {
        this.Language = Language;
    }


    /**
     *  Type of note; used for access-restriction purposes
     * 
     * @return SecurityType Type of note; used for access-restriction purposes
     */
    public com.guidewire.ab.webservices.enumeration.NoteSecurityType getSecurityType() {
        return SecurityType;
    }


    /**
     *  Type of note; used for access-restriction purposes
     * 
     * @param SecurityType Type of note; used for access-restriction purposes
     */
    public void setSecurityType(com.guidewire.ab.webservices.enumeration.NoteSecurityType SecurityType) {
        this.SecurityType = SecurityType;
    }


    /**
     *  Subject or summary of the note.
     * 
     * @return Subject Subject or summary of the note.
     */
    public java.lang.String getSubject() {
        return Subject;
    }


    /**
     *  Subject or summary of the note.
     * 
     * @param Subject Subject or summary of the note.
     */
    public void setSubject(java.lang.String Subject) {
        this.Subject = Subject;
    }


    /**
     *  Topic to which the note belongs.
     * 
     * @return Topic Topic to which the note belongs.
     */
    public com.guidewire.ab.webservices.enumeration.NoteTopicType getTopic() {
        return Topic;
    }


    /**
     *  Topic to which the note belongs.
     * 
     * @param Topic Topic to which the note belongs.
     */
    public void setTopic(com.guidewire.ab.webservices.enumeration.NoteTopicType Topic) {
        this.Topic = Topic;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Note.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Note"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("author");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Author"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authoringDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AuthoringDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beanVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BeanVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("body");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Body"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confidential");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Confidential"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "LanguageType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SecurityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "NoteSecurityType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Topic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "NoteTopicType"));
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
