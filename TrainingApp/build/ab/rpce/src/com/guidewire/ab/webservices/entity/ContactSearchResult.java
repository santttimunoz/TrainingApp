/**
 * ContactSearchResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * ContactSearchResult has been deprecated since ClaimCenter 8.0 along
 * with IAddressBookAdapter.
 *       <p>Represents the set of results and additional information
 * returned by an Address Book search.
 *       See the <code>IAddressBookAdapter</code> for information on
 * searching for contacts.
 *       </p>
 */
public class ContactSearchResult  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        Gets the Contact that was matched, or null if none.
     */ 
    private com.guidewire.ab.webservices.entity.Contact Contact;
    /** 
        Provides more detail about the result of the match.
     */ 
    private com.guidewire.ab.webservices.enumeration.ContactMatchResultType ResultType;
    /** 
        Gets the results. Length should not be greater than the maxResults
 * setting
 * in the corresponding RemotableSearchResultSpec. If there is at least
 * one
 * result, the first result should correspond to the startRow setting
 * in the
 * corresponding RemotableSearchResultSpec. Order should depend on the
 * sort
 * settings.
     */ 
    private com.guidewire.ab.webservices.entity.Contact[] Results;
    /** 
        Indicates wheather the search succeeded of failed, and if failed,
 * why.
     */ 
    private com.guidewire.ab.webservices.enumeration.ContactSearchResultType SearchResultType;
    /** 
        Gets the total number of results. This will only be populated if
 * the corresponding ContactSearchResultSpec has includeTotal = true.
     */ 
    private java.lang.Integer TotalResults;

    public ContactSearchResult() {
    }

    public ContactSearchResult(
           java.lang.Integer BeanVersion,
           com.guidewire.ab.webservices.entity.Contact Contact,
           com.guidewire.ab.webservices.enumeration.ContactMatchResultType ResultType,
           com.guidewire.ab.webservices.entity.Contact[] Results,
           com.guidewire.ab.webservices.enumeration.ContactSearchResultType SearchResultType,
           java.lang.Integer TotalResults) {
           this.BeanVersion = BeanVersion;
           this.Contact = Contact;
           this.ResultType = ResultType;
           this.Results = Results;
           this.SearchResultType = SearchResultType;
           this.TotalResults = TotalResults;
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
     *  Gets the Contact that was matched, or null if none.
     * 
     * @return Contact Gets the Contact that was matched, or null if none.
     */
    public com.guidewire.ab.webservices.entity.Contact getContact() {
        return Contact;
    }


    /**
     *  Gets the Contact that was matched, or null if none.
     * 
     * @param Contact Gets the Contact that was matched, or null if none.
     */
    public void setContact(com.guidewire.ab.webservices.entity.Contact Contact) {
        this.Contact = Contact;
    }


    /**
     *  Provides more detail about the result of the match.
     * 
     * @return ResultType Provides more detail about the result of the match.
     */
    public com.guidewire.ab.webservices.enumeration.ContactMatchResultType getResultType() {
        return ResultType;
    }


    /**
     *  Provides more detail about the result of the match.
     * 
     * @param ResultType Provides more detail about the result of the match.
     */
    public void setResultType(com.guidewire.ab.webservices.enumeration.ContactMatchResultType ResultType) {
        this.ResultType = ResultType;
    }


    /**
     *  Gets the results. Length should not be greater than the maxResults
 * setting
 * in the corresponding RemotableSearchResultSpec. If there is at least
 * one
 * result, the first result should correspond to the startRow setting
 * in the
 * corresponding RemotableSearchResultSpec. Order should depend on the
 * sort
 * settings.
     * 
     * @return Results Gets the results. Length should not be greater than the maxResults
 * setting
 * in the corresponding RemotableSearchResultSpec. If there is at least
 * one
 * result, the first result should correspond to the startRow setting
 * in the
 * corresponding RemotableSearchResultSpec. Order should depend on the
 * sort
 * settings.
     */
    public com.guidewire.ab.webservices.entity.Contact[] getResults() {
        return Results;
    }


    /**
     *  Gets the results. Length should not be greater than the maxResults
 * setting
 * in the corresponding RemotableSearchResultSpec. If there is at least
 * one
 * result, the first result should correspond to the startRow setting
 * in the
 * corresponding RemotableSearchResultSpec. Order should depend on the
 * sort
 * settings.
     * 
     * @param Results Gets the results. Length should not be greater than the maxResults
 * setting
 * in the corresponding RemotableSearchResultSpec. If there is at least
 * one
 * result, the first result should correspond to the startRow setting
 * in the
 * corresponding RemotableSearchResultSpec. Order should depend on the
 * sort
 * settings.
     */
    public void setResults(com.guidewire.ab.webservices.entity.Contact[] Results) {
        this.Results = Results;
    }


    /**
     *  Indicates wheather the search succeeded of failed, and if failed,
 * why.
     * 
     * @return SearchResultType Indicates wheather the search succeeded of failed, and if failed,
 * why.
     */
    public com.guidewire.ab.webservices.enumeration.ContactSearchResultType getSearchResultType() {
        return SearchResultType;
    }


    /**
     *  Indicates wheather the search succeeded of failed, and if failed,
 * why.
     * 
     * @param SearchResultType Indicates wheather the search succeeded of failed, and if failed,
 * why.
     */
    public void setSearchResultType(com.guidewire.ab.webservices.enumeration.ContactSearchResultType SearchResultType) {
        this.SearchResultType = SearchResultType;
    }


    /**
     *  Gets the total number of results. This will only be populated if
 * the corresponding ContactSearchResultSpec has includeTotal = true.
     * 
     * @return TotalResults Gets the total number of results. This will only be populated if
 * the corresponding ContactSearchResultSpec has includeTotal = true.
     */
    public java.lang.Integer getTotalResults() {
        return TotalResults;
    }


    /**
     *  Gets the total number of results. This will only be populated if
 * the corresponding ContactSearchResultSpec has includeTotal = true.
     * 
     * @param TotalResults Gets the total number of results. This will only be populated if
 * the corresponding ContactSearchResultSpec has includeTotal = true.
     */
    public void setTotalResults(java.lang.Integer TotalResults) {
        this.TotalResults = TotalResults;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContactSearchResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ContactSearchResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beanVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BeanVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResultType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ContactMatchResultType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("results");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Results"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchResultType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SearchResultType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ContactSearchResultType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalResults");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TotalResults"));
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
