/**
 * ABContactCategoryScore.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Table linking Contacts to Category Scores
 */
public class ABContactCategoryScore  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Associated ABContact.
     */ 
    private com.guidewire.ab.webservices.entity.ABContact ABContact;
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        Represents the ID used by client applications to link with the
 * Address Book.
     */ 
    private java.lang.String LinkID;
    /** 
        Category of this Score.
     */ 
    private com.guidewire.ab.webservices.enumeration.ReviewCategory ReviewCategory;
    /** 
     */ 
    private java.lang.Integer Score;

    public ABContactCategoryScore() {
    }

    public ABContactCategoryScore(
           com.guidewire.ab.webservices.entity.ABContact ABContact,
           java.lang.Integer BeanVersion,
           java.lang.String LinkID,
           com.guidewire.ab.webservices.enumeration.ReviewCategory ReviewCategory,
           java.lang.Integer Score) {
           this.ABContact = ABContact;
           this.BeanVersion = BeanVersion;
           this.LinkID = LinkID;
           this.ReviewCategory = ReviewCategory;
           this.Score = Score;
    }


    /**
     *  Associated ABContact.
     * 
     * @return ABContact Associated ABContact.
     */
    public com.guidewire.ab.webservices.entity.ABContact getABContact() {
        return ABContact;
    }


    /**
     *  Associated ABContact.
     * 
     * @param ABContact Associated ABContact.
     */
    public void setABContact(com.guidewire.ab.webservices.entity.ABContact ABContact) {
        this.ABContact = ABContact;
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
     *  Represents the ID used by client applications to link with the
 * Address Book.
     * 
     * @return LinkID Represents the ID used by client applications to link with the
 * Address Book.
     */
    public java.lang.String getLinkID() {
        return LinkID;
    }


    /**
     *  Represents the ID used by client applications to link with the
 * Address Book.
     * 
     * @param LinkID Represents the ID used by client applications to link with the
 * Address Book.
     */
    public void setLinkID(java.lang.String LinkID) {
        this.LinkID = LinkID;
    }


    /**
     *  Category of this Score.
     * 
     * @return ReviewCategory Category of this Score.
     */
    public com.guidewire.ab.webservices.enumeration.ReviewCategory getReviewCategory() {
        return ReviewCategory;
    }


    /**
     *  Category of this Score.
     * 
     * @param ReviewCategory Category of this Score.
     */
    public void setReviewCategory(com.guidewire.ab.webservices.enumeration.ReviewCategory ReviewCategory) {
        this.ReviewCategory = ReviewCategory;
    }


    /**
     * 
     * 
     * @return Score
     */
    public java.lang.Integer getScore() {
        return Score;
    }


    /**
     * 
     * 
     * @param Score
     */
    public void setScore(java.lang.Integer Score) {
        this.Score = Score;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ABContactCategoryScore.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABContactCategoryScore"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ABContact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ABContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABContact"));
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
        elemField.setFieldName("linkID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LinkID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reviewCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReviewCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ReviewCategory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Score"));
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
