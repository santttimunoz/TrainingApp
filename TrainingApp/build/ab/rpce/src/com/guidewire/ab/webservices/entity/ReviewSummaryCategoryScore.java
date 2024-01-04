/**
 * ReviewSummaryCategoryScore.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Table linking ReviewsSummaries to Category Scores
 */
public class ReviewSummaryCategoryScore  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        Category of this QuestionSet.
     */ 
    private com.guidewire.ab.webservices.enumeration.ReviewCategory ReviewCategory;
    /** 
        Associated Review.
     */ 
    private com.guidewire.ab.webservices.entity.ReviewSummary ReviewSummary;
    /** 
     */ 
    private java.lang.Integer Score;

    public ReviewSummaryCategoryScore() {
    }

    public ReviewSummaryCategoryScore(
           java.lang.Integer BeanVersion,
           com.guidewire.ab.webservices.enumeration.ReviewCategory ReviewCategory,
           com.guidewire.ab.webservices.entity.ReviewSummary ReviewSummary,
           java.lang.Integer Score) {
           this.BeanVersion = BeanVersion;
           this.ReviewCategory = ReviewCategory;
           this.ReviewSummary = ReviewSummary;
           this.Score = Score;
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
     *  Category of this QuestionSet.
     * 
     * @return ReviewCategory Category of this QuestionSet.
     */
    public com.guidewire.ab.webservices.enumeration.ReviewCategory getReviewCategory() {
        return ReviewCategory;
    }


    /**
     *  Category of this QuestionSet.
     * 
     * @param ReviewCategory Category of this QuestionSet.
     */
    public void setReviewCategory(com.guidewire.ab.webservices.enumeration.ReviewCategory ReviewCategory) {
        this.ReviewCategory = ReviewCategory;
    }


    /**
     *  Associated Review.
     * 
     * @return ReviewSummary Associated Review.
     */
    public com.guidewire.ab.webservices.entity.ReviewSummary getReviewSummary() {
        return ReviewSummary;
    }


    /**
     *  Associated Review.
     * 
     * @param ReviewSummary Associated Review.
     */
    public void setReviewSummary(com.guidewire.ab.webservices.entity.ReviewSummary ReviewSummary) {
        this.ReviewSummary = ReviewSummary;
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
        new org.apache.axis.description.TypeDesc(ReviewSummaryCategoryScore.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ReviewSummaryCategoryScore"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beanVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BeanVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("reviewSummary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReviewSummary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ReviewSummary"));
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
