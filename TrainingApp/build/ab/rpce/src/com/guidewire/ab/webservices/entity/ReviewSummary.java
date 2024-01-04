/**
 * ReviewSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * A summary of a service provider review, created from a given Review
 * in ClaimCenter.
 */
public class ReviewSummary  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Associated Contact. NOTE: when inserting a ReviewSummary this field
 * must be non-null.
     */ 
    private com.guidewire.ab.webservices.entity.ABContact ABContact;
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        List of categories and their scores, associated with this Review.
     */ 
    private com.guidewire.ab.webservices.entity.ReviewSummaryCategoryScore[] CategoryScores;
    /** 
        The PublicID of the Review in ClaimCenter, intended as an cross-reference
 * for informational purposes only.
     */ 
    private java.lang.String ClaimCenterUID;
    /** 
        Claim Number associated with this review. NOTE: when inserting
 * a ReviewSummary this field must be non-null.
     */ 
    private java.lang.String ClaimNumber;
    /** 
        Comments about the review.
     */ 
    private java.lang.String Comments;
    /** 
        Description of the accident or loss.
     */ 
    private java.lang.String Description;
    /** 
        Represents the ID used by client applications to link with the
 * Address Book.
     */ 
    private java.lang.String LinkID;
    /** 
        Short name of this review type.
     */ 
    private java.lang.String Name;
    /** 
        Associated part of a claim for this review type.
     */ 
    private java.lang.String RelatedTo;
    /** 
        Name of the Review Type associated with this review. NOTE: when
 * inserting a ReviewSummary this field must be non-null.
     */ 
    private java.lang.String ReviewType;
    /** 
        User who created the review
     */ 
    private java.lang.String ReviewedBy;
    /** 
     */ 
    private java.lang.Integer Score;
    /** 
        Date of the service being reviewed
     */ 
    private java.util.Calendar ServiceDate;
    /** 
     */ 
    private com.guidewire.ab.webservices.enumeration.ReviewServiceType ServiceType;
    /** 
        Optionally associated sub-Contact (Service Person or similar).
     */ 
    private java.lang.String Subcontact;
    /** 
        Boolean field to mark a review as included in the total for the
 * contact.
     */ 
    private java.lang.Boolean Tallied;

    public ReviewSummary() {
    }

    public ReviewSummary(
           com.guidewire.ab.webservices.entity.ABContact ABContact,
           java.lang.Integer BeanVersion,
           com.guidewire.ab.webservices.entity.ReviewSummaryCategoryScore[] CategoryScores,
           java.lang.String ClaimCenterUID,
           java.lang.String ClaimNumber,
           java.lang.String Comments,
           java.lang.String Description,
           java.lang.String LinkID,
           java.lang.String Name,
           java.lang.String RelatedTo,
           java.lang.String ReviewType,
           java.lang.String ReviewedBy,
           java.lang.Integer Score,
           java.util.Calendar ServiceDate,
           com.guidewire.ab.webservices.enumeration.ReviewServiceType ServiceType,
           java.lang.String Subcontact,
           java.lang.Boolean Tallied) {
           this.ABContact = ABContact;
           this.BeanVersion = BeanVersion;
           this.CategoryScores = CategoryScores;
           this.ClaimCenterUID = ClaimCenterUID;
           this.ClaimNumber = ClaimNumber;
           this.Comments = Comments;
           this.Description = Description;
           this.LinkID = LinkID;
           this.Name = Name;
           this.RelatedTo = RelatedTo;
           this.ReviewType = ReviewType;
           this.ReviewedBy = ReviewedBy;
           this.Score = Score;
           this.ServiceDate = ServiceDate;
           this.ServiceType = ServiceType;
           this.Subcontact = Subcontact;
           this.Tallied = Tallied;
    }


    /**
     *  Associated Contact. NOTE: when inserting a ReviewSummary this field
 * must be non-null.
     * 
     * @return ABContact Associated Contact. NOTE: when inserting a ReviewSummary this field
 * must be non-null.
     */
    public com.guidewire.ab.webservices.entity.ABContact getABContact() {
        return ABContact;
    }


    /**
     *  Associated Contact. NOTE: when inserting a ReviewSummary this field
 * must be non-null.
     * 
     * @param ABContact Associated Contact. NOTE: when inserting a ReviewSummary this field
 * must be non-null.
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
     *  List of categories and their scores, associated with this Review.
     * 
     * @return CategoryScores List of categories and their scores, associated with this Review.
     */
    public com.guidewire.ab.webservices.entity.ReviewSummaryCategoryScore[] getCategoryScores() {
        return CategoryScores;
    }


    /**
     *  List of categories and their scores, associated with this Review.
     * 
     * @param CategoryScores List of categories and their scores, associated with this Review.
     */
    public void setCategoryScores(com.guidewire.ab.webservices.entity.ReviewSummaryCategoryScore[] CategoryScores) {
        this.CategoryScores = CategoryScores;
    }


    /**
     *  The PublicID of the Review in ClaimCenter, intended as an cross-reference
 * for informational purposes only.
     * 
     * @return ClaimCenterUID The PublicID of the Review in ClaimCenter, intended as an cross-reference
 * for informational purposes only.
     */
    public java.lang.String getClaimCenterUID() {
        return ClaimCenterUID;
    }


    /**
     *  The PublicID of the Review in ClaimCenter, intended as an cross-reference
 * for informational purposes only.
     * 
     * @param ClaimCenterUID The PublicID of the Review in ClaimCenter, intended as an cross-reference
 * for informational purposes only.
     */
    public void setClaimCenterUID(java.lang.String ClaimCenterUID) {
        this.ClaimCenterUID = ClaimCenterUID;
    }


    /**
     *  Claim Number associated with this review. NOTE: when inserting
 * a ReviewSummary this field must be non-null.
     * 
     * @return ClaimNumber Claim Number associated with this review. NOTE: when inserting
 * a ReviewSummary this field must be non-null.
     */
    public java.lang.String getClaimNumber() {
        return ClaimNumber;
    }


    /**
     *  Claim Number associated with this review. NOTE: when inserting
 * a ReviewSummary this field must be non-null.
     * 
     * @param ClaimNumber Claim Number associated with this review. NOTE: when inserting
 * a ReviewSummary this field must be non-null.
     */
    public void setClaimNumber(java.lang.String ClaimNumber) {
        this.ClaimNumber = ClaimNumber;
    }


    /**
     *  Comments about the review.
     * 
     * @return Comments Comments about the review.
     */
    public java.lang.String getComments() {
        return Comments;
    }


    /**
     *  Comments about the review.
     * 
     * @param Comments Comments about the review.
     */
    public void setComments(java.lang.String Comments) {
        this.Comments = Comments;
    }


    /**
     *  Description of the accident or loss.
     * 
     * @return Description Description of the accident or loss.
     */
    public java.lang.String getDescription() {
        return Description;
    }


    /**
     *  Description of the accident or loss.
     * 
     * @param Description Description of the accident or loss.
     */
    public void setDescription(java.lang.String Description) {
        this.Description = Description;
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
     *  Short name of this review type.
     * 
     * @return Name Short name of this review type.
     */
    public java.lang.String getName() {
        return Name;
    }


    /**
     *  Short name of this review type.
     * 
     * @param Name Short name of this review type.
     */
    public void setName(java.lang.String Name) {
        this.Name = Name;
    }


    /**
     *  Associated part of a claim for this review type.
     * 
     * @return RelatedTo Associated part of a claim for this review type.
     */
    public java.lang.String getRelatedTo() {
        return RelatedTo;
    }


    /**
     *  Associated part of a claim for this review type.
     * 
     * @param RelatedTo Associated part of a claim for this review type.
     */
    public void setRelatedTo(java.lang.String RelatedTo) {
        this.RelatedTo = RelatedTo;
    }


    /**
     *  Name of the Review Type associated with this review. NOTE: when
 * inserting a ReviewSummary this field must be non-null.
     * 
     * @return ReviewType Name of the Review Type associated with this review. NOTE: when
 * inserting a ReviewSummary this field must be non-null.
     */
    public java.lang.String getReviewType() {
        return ReviewType;
    }


    /**
     *  Name of the Review Type associated with this review. NOTE: when
 * inserting a ReviewSummary this field must be non-null.
     * 
     * @param ReviewType Name of the Review Type associated with this review. NOTE: when
 * inserting a ReviewSummary this field must be non-null.
     */
    public void setReviewType(java.lang.String ReviewType) {
        this.ReviewType = ReviewType;
    }


    /**
     *  User who created the review
     * 
     * @return ReviewedBy User who created the review
     */
    public java.lang.String getReviewedBy() {
        return ReviewedBy;
    }


    /**
     *  User who created the review
     * 
     * @param ReviewedBy User who created the review
     */
    public void setReviewedBy(java.lang.String ReviewedBy) {
        this.ReviewedBy = ReviewedBy;
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


    /**
     *  Date of the service being reviewed
     * 
     * @return ServiceDate Date of the service being reviewed
     */
    public java.util.Calendar getServiceDate() {
        return ServiceDate;
    }


    /**
     *  Date of the service being reviewed
     * 
     * @param ServiceDate Date of the service being reviewed
     */
    public void setServiceDate(java.util.Calendar ServiceDate) {
        this.ServiceDate = ServiceDate;
    }


    /**
     * 
     * 
     * @return ServiceType
     */
    public com.guidewire.ab.webservices.enumeration.ReviewServiceType getServiceType() {
        return ServiceType;
    }


    /**
     * 
     * 
     * @param ServiceType
     */
    public void setServiceType(com.guidewire.ab.webservices.enumeration.ReviewServiceType ServiceType) {
        this.ServiceType = ServiceType;
    }


    /**
     *  Optionally associated sub-Contact (Service Person or similar).
     * 
     * @return Subcontact Optionally associated sub-Contact (Service Person or similar).
     */
    public java.lang.String getSubcontact() {
        return Subcontact;
    }


    /**
     *  Optionally associated sub-Contact (Service Person or similar).
     * 
     * @param Subcontact Optionally associated sub-Contact (Service Person or similar).
     */
    public void setSubcontact(java.lang.String Subcontact) {
        this.Subcontact = Subcontact;
    }


    /**
     *  Boolean field to mark a review as included in the total for the
 * contact.
     * 
     * @return Tallied Boolean field to mark a review as included in the total for the
 * contact.
     */
    public java.lang.Boolean getTallied() {
        return Tallied;
    }


    /**
     *  Boolean field to mark a review as included in the total for the
 * contact.
     * 
     * @param Tallied Boolean field to mark a review as included in the total for the
 * contact.
     */
    public void setTallied(java.lang.Boolean Tallied) {
        this.Tallied = Tallied;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReviewSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ReviewSummary"));
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
        elemField.setFieldName("categoryScores");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CategoryScores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ReviewSummaryCategoryScore"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimCenterUID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ClaimCenterUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ClaimNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RelatedTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reviewType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReviewType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reviewedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReviewedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ServiceDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ServiceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ReviewServiceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subcontact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Subcontact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tallied");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Tallied"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
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
