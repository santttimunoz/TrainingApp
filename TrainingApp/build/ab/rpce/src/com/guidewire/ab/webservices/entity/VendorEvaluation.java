/**
 * VendorEvaluation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Vendor evaluation
 */
public class VendorEvaluation  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Contact under evaluation
     */ 
    private com.guidewire.ab.webservices.entity.ABContact ABContact;
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        Date evaluation occurred
     */ 
    private java.util.Calendar EvaluationDate;
    /** 
        Evaluator
     */ 
    private java.lang.String Evaluator;
    /** 
        Communicator
     */ 
    private java.lang.String EvaluatorComment;
    /** 
        Priority of the verification
     */ 
    private com.guidewire.ab.webservices.enumeration.Priority Priority;
    /** 
        Does this object need verification?
     */ 
    private java.lang.Boolean RequiresVerification;
    /** 
        Score for communication
     */ 
    private java.lang.Integer Score_Communication;
    /** 
        Score for pricing
     */ 
    private java.lang.Integer Score_Pricing;
    /** 
        Score for quality of work
     */ 
    private java.lang.Integer Score_QualityOfWork;
    /** 
        Score for timeliness
     */ 
    private java.lang.Integer Score_Timeliness;
    /** 
        Status of vendor evaluation
     */ 
    private com.guidewire.ab.webservices.enumeration.VendorEvaluationStatus Status;
    /** 
        Total_Score
     */ 
    private java.lang.Integer Total_Score;
    /** 
        Date object was verified
     */ 
    private java.util.Calendar VerificationDate;
    /** 
        Date by which object should be verified
     */ 
    private java.util.Calendar VerificationDueDate;

    public VendorEvaluation() {
    }

    public VendorEvaluation(
           com.guidewire.ab.webservices.entity.ABContact ABContact,
           java.lang.Integer BeanVersion,
           java.util.Calendar EvaluationDate,
           java.lang.String Evaluator,
           java.lang.String EvaluatorComment,
           com.guidewire.ab.webservices.enumeration.Priority Priority,
           java.lang.Boolean RequiresVerification,
           java.lang.Integer Score_Communication,
           java.lang.Integer Score_Pricing,
           java.lang.Integer Score_QualityOfWork,
           java.lang.Integer Score_Timeliness,
           com.guidewire.ab.webservices.enumeration.VendorEvaluationStatus Status,
           java.lang.Integer Total_Score,
           java.util.Calendar VerificationDate,
           java.util.Calendar VerificationDueDate) {
           this.ABContact = ABContact;
           this.BeanVersion = BeanVersion;
           this.EvaluationDate = EvaluationDate;
           this.Evaluator = Evaluator;
           this.EvaluatorComment = EvaluatorComment;
           this.Priority = Priority;
           this.RequiresVerification = RequiresVerification;
           this.Score_Communication = Score_Communication;
           this.Score_Pricing = Score_Pricing;
           this.Score_QualityOfWork = Score_QualityOfWork;
           this.Score_Timeliness = Score_Timeliness;
           this.Status = Status;
           this.Total_Score = Total_Score;
           this.VerificationDate = VerificationDate;
           this.VerificationDueDate = VerificationDueDate;
    }


    /**
     *  Contact under evaluation
     * 
     * @return ABContact Contact under evaluation
     */
    public com.guidewire.ab.webservices.entity.ABContact getABContact() {
        return ABContact;
    }


    /**
     *  Contact under evaluation
     * 
     * @param ABContact Contact under evaluation
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
     *  Date evaluation occurred
     * 
     * @return EvaluationDate Date evaluation occurred
     */
    public java.util.Calendar getEvaluationDate() {
        return EvaluationDate;
    }


    /**
     *  Date evaluation occurred
     * 
     * @param EvaluationDate Date evaluation occurred
     */
    public void setEvaluationDate(java.util.Calendar EvaluationDate) {
        this.EvaluationDate = EvaluationDate;
    }


    /**
     *  Evaluator
     * 
     * @return Evaluator Evaluator
     */
    public java.lang.String getEvaluator() {
        return Evaluator;
    }


    /**
     *  Evaluator
     * 
     * @param Evaluator Evaluator
     */
    public void setEvaluator(java.lang.String Evaluator) {
        this.Evaluator = Evaluator;
    }


    /**
     *  Communicator
     * 
     * @return EvaluatorComment Communicator
     */
    public java.lang.String getEvaluatorComment() {
        return EvaluatorComment;
    }


    /**
     *  Communicator
     * 
     * @param EvaluatorComment Communicator
     */
    public void setEvaluatorComment(java.lang.String EvaluatorComment) {
        this.EvaluatorComment = EvaluatorComment;
    }


    /**
     *  Priority of the verification
     * 
     * @return Priority Priority of the verification
     */
    public com.guidewire.ab.webservices.enumeration.Priority getPriority() {
        return Priority;
    }


    /**
     *  Priority of the verification
     * 
     * @param Priority Priority of the verification
     */
    public void setPriority(com.guidewire.ab.webservices.enumeration.Priority Priority) {
        this.Priority = Priority;
    }


    /**
     *  Does this object need verification?
     * 
     * @return RequiresVerification Does this object need verification?
     */
    public java.lang.Boolean getRequiresVerification() {
        return RequiresVerification;
    }


    /**
     *  Does this object need verification?
     * 
     * @param RequiresVerification Does this object need verification?
     */
    public void setRequiresVerification(java.lang.Boolean RequiresVerification) {
        this.RequiresVerification = RequiresVerification;
    }


    /**
     *  Score for communication
     * 
     * @return Score_Communication Score for communication
     */
    public java.lang.Integer getScore_Communication() {
        return Score_Communication;
    }


    /**
     *  Score for communication
     * 
     * @param Score_Communication Score for communication
     */
    public void setScore_Communication(java.lang.Integer Score_Communication) {
        this.Score_Communication = Score_Communication;
    }


    /**
     *  Score for pricing
     * 
     * @return Score_Pricing Score for pricing
     */
    public java.lang.Integer getScore_Pricing() {
        return Score_Pricing;
    }


    /**
     *  Score for pricing
     * 
     * @param Score_Pricing Score for pricing
     */
    public void setScore_Pricing(java.lang.Integer Score_Pricing) {
        this.Score_Pricing = Score_Pricing;
    }


    /**
     *  Score for quality of work
     * 
     * @return Score_QualityOfWork Score for quality of work
     */
    public java.lang.Integer getScore_QualityOfWork() {
        return Score_QualityOfWork;
    }


    /**
     *  Score for quality of work
     * 
     * @param Score_QualityOfWork Score for quality of work
     */
    public void setScore_QualityOfWork(java.lang.Integer Score_QualityOfWork) {
        this.Score_QualityOfWork = Score_QualityOfWork;
    }


    /**
     *  Score for timeliness
     * 
     * @return Score_Timeliness Score for timeliness
     */
    public java.lang.Integer getScore_Timeliness() {
        return Score_Timeliness;
    }


    /**
     *  Score for timeliness
     * 
     * @param Score_Timeliness Score for timeliness
     */
    public void setScore_Timeliness(java.lang.Integer Score_Timeliness) {
        this.Score_Timeliness = Score_Timeliness;
    }


    /**
     *  Status of vendor evaluation
     * 
     * @return Status Status of vendor evaluation
     */
    public com.guidewire.ab.webservices.enumeration.VendorEvaluationStatus getStatus() {
        return Status;
    }


    /**
     *  Status of vendor evaluation
     * 
     * @param Status Status of vendor evaluation
     */
    public void setStatus(com.guidewire.ab.webservices.enumeration.VendorEvaluationStatus Status) {
        this.Status = Status;
    }


    /**
     *  Total_Score
     * 
     * @return Total_Score Total_Score
     */
    public java.lang.Integer getTotal_Score() {
        return Total_Score;
    }


    /**
     *  Total_Score
     * 
     * @param Total_Score Total_Score
     */
    public void setTotal_Score(java.lang.Integer Total_Score) {
        this.Total_Score = Total_Score;
    }


    /**
     *  Date object was verified
     * 
     * @return VerificationDate Date object was verified
     */
    public java.util.Calendar getVerificationDate() {
        return VerificationDate;
    }


    /**
     *  Date object was verified
     * 
     * @param VerificationDate Date object was verified
     */
    public void setVerificationDate(java.util.Calendar VerificationDate) {
        this.VerificationDate = VerificationDate;
    }


    /**
     *  Date by which object should be verified
     * 
     * @return VerificationDueDate Date by which object should be verified
     */
    public java.util.Calendar getVerificationDueDate() {
        return VerificationDueDate;
    }


    /**
     *  Date by which object should be verified
     * 
     * @param VerificationDueDate Date by which object should be verified
     */
    public void setVerificationDueDate(java.util.Calendar VerificationDueDate) {
        this.VerificationDueDate = VerificationDueDate;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VendorEvaluation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "VendorEvaluation"));
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
        elemField.setFieldName("evaluationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EvaluationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evaluator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Evaluator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evaluatorComment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EvaluatorComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "Priority"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requiresVerification");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RequiresVerification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score_Communication");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Score_Communication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score_Pricing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Score_Pricing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score_QualityOfWork");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Score_QualityOfWork"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score_Timeliness");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Score_Timeliness"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "VendorEvaluationStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_Score");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Total_Score"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verificationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VerificationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verificationDueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VerificationDueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
