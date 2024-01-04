/**
 * DateCriterionChoice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * A component used as part of a larger search criteria entity. Encapsulates
 * the information
 *         entered by the user to restrict the search to a particular
 * date range. Specifies the date
 *         field to be restricted and allows the date range to be restricted
 * either through a typelist of
 *         preset ranges (such as next 30 days) or through a start and
 * end date.
 *         <p>
 *         Very similar to DateCriteria, but DateCriterionChoice supports
 * configurable search.
 *         (See the Configuration Guide for details of customizing search
 * screens.)
 */
public class DateCriterionChoice  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        The chosen configurable search option, specifies the date field
 * to be restricted.
     */ 
    private java.lang.String ChosenOption;
    /** 
        The chosen preset date range, if any. The available ranges are
 * filtered by the SearchType field. Used if DateSearchType is "fromlist".
 * NOTE: when inserting a DateCriterionChoice this field must be non-null.
     */ 
    private com.guidewire.ab.webservices.enumeration.DateRangeChoiceType DateRangeChoice;
    /** 
        The type of date search, either "fromlist" (for a preset range)
 * or "enteredrange" (for an explicitly entered range). NOTE: when inserting
 * a DateCriterionChoice this field must be non-null.
     */ 
    private com.guidewire.ab.webservices.enumeration.DateSearchType DateSearchType;
    /** 
        The end (inclusive) of the date range to which the chosen date
 * field should be restricted.  Used if DateSearchType is "enteredrange".
     */ 
    private java.util.Calendar EndDate;
    /** 
        The type of search, filters the preset ranges allowed in the DateRangeChoice
 * field. NOTE: when inserting a DateCriterionChoice this field must
 * be non-null.
     */ 
    private com.guidewire.ab.webservices.enumeration.SearchObjectType SearchType;
    /** 
        The start (inclusive) of the date range to which the chosen date
 * field should be restricted. Used if DateSearchType is "enteredrange".
     */ 
    private java.util.Calendar StartDate;

    public DateCriterionChoice() {
    }

    public DateCriterionChoice(
           java.lang.Integer BeanVersion,
           java.lang.String ChosenOption,
           com.guidewire.ab.webservices.enumeration.DateRangeChoiceType DateRangeChoice,
           com.guidewire.ab.webservices.enumeration.DateSearchType DateSearchType,
           java.util.Calendar EndDate,
           com.guidewire.ab.webservices.enumeration.SearchObjectType SearchType,
           java.util.Calendar StartDate) {
           this.BeanVersion = BeanVersion;
           this.ChosenOption = ChosenOption;
           this.DateRangeChoice = DateRangeChoice;
           this.DateSearchType = DateSearchType;
           this.EndDate = EndDate;
           this.SearchType = SearchType;
           this.StartDate = StartDate;
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
     *  The chosen configurable search option, specifies the date field
 * to be restricted.
     * 
     * @return ChosenOption The chosen configurable search option, specifies the date field
 * to be restricted.
     */
    public java.lang.String getChosenOption() {
        return ChosenOption;
    }


    /**
     *  The chosen configurable search option, specifies the date field
 * to be restricted.
     * 
     * @param ChosenOption The chosen configurable search option, specifies the date field
 * to be restricted.
     */
    public void setChosenOption(java.lang.String ChosenOption) {
        this.ChosenOption = ChosenOption;
    }


    /**
     *  The chosen preset date range, if any. The available ranges are
 * filtered by the SearchType field. Used if DateSearchType is "fromlist".
 * NOTE: when inserting a DateCriterionChoice this field must be non-null.
     * 
     * @return DateRangeChoice The chosen preset date range, if any. The available ranges are
 * filtered by the SearchType field. Used if DateSearchType is "fromlist".
 * NOTE: when inserting a DateCriterionChoice this field must be non-null.
     */
    public com.guidewire.ab.webservices.enumeration.DateRangeChoiceType getDateRangeChoice() {
        return DateRangeChoice;
    }


    /**
     *  The chosen preset date range, if any. The available ranges are
 * filtered by the SearchType field. Used if DateSearchType is "fromlist".
 * NOTE: when inserting a DateCriterionChoice this field must be non-null.
     * 
     * @param DateRangeChoice The chosen preset date range, if any. The available ranges are
 * filtered by the SearchType field. Used if DateSearchType is "fromlist".
 * NOTE: when inserting a DateCriterionChoice this field must be non-null.
     */
    public void setDateRangeChoice(com.guidewire.ab.webservices.enumeration.DateRangeChoiceType DateRangeChoice) {
        this.DateRangeChoice = DateRangeChoice;
    }


    /**
     *  The type of date search, either "fromlist" (for a preset range)
 * or "enteredrange" (for an explicitly entered range). NOTE: when inserting
 * a DateCriterionChoice this field must be non-null.
     * 
     * @return DateSearchType The type of date search, either "fromlist" (for a preset range)
 * or "enteredrange" (for an explicitly entered range). NOTE: when inserting
 * a DateCriterionChoice this field must be non-null.
     */
    public com.guidewire.ab.webservices.enumeration.DateSearchType getDateSearchType() {
        return DateSearchType;
    }


    /**
     *  The type of date search, either "fromlist" (for a preset range)
 * or "enteredrange" (for an explicitly entered range). NOTE: when inserting
 * a DateCriterionChoice this field must be non-null.
     * 
     * @param DateSearchType The type of date search, either "fromlist" (for a preset range)
 * or "enteredrange" (for an explicitly entered range). NOTE: when inserting
 * a DateCriterionChoice this field must be non-null.
     */
    public void setDateSearchType(com.guidewire.ab.webservices.enumeration.DateSearchType DateSearchType) {
        this.DateSearchType = DateSearchType;
    }


    /**
     *  The end (inclusive) of the date range to which the chosen date
 * field should be restricted.  Used if DateSearchType is "enteredrange".
     * 
     * @return EndDate The end (inclusive) of the date range to which the chosen date
 * field should be restricted.  Used if DateSearchType is "enteredrange".
     */
    public java.util.Calendar getEndDate() {
        return EndDate;
    }


    /**
     *  The end (inclusive) of the date range to which the chosen date
 * field should be restricted.  Used if DateSearchType is "enteredrange".
     * 
     * @param EndDate The end (inclusive) of the date range to which the chosen date
 * field should be restricted.  Used if DateSearchType is "enteredrange".
     */
    public void setEndDate(java.util.Calendar EndDate) {
        this.EndDate = EndDate;
    }


    /**
     *  The type of search, filters the preset ranges allowed in the DateRangeChoice
 * field. NOTE: when inserting a DateCriterionChoice this field must
 * be non-null.
     * 
     * @return SearchType The type of search, filters the preset ranges allowed in the DateRangeChoice
 * field. NOTE: when inserting a DateCriterionChoice this field must
 * be non-null.
     */
    public com.guidewire.ab.webservices.enumeration.SearchObjectType getSearchType() {
        return SearchType;
    }


    /**
     *  The type of search, filters the preset ranges allowed in the DateRangeChoice
 * field. NOTE: when inserting a DateCriterionChoice this field must
 * be non-null.
     * 
     * @param SearchType The type of search, filters the preset ranges allowed in the DateRangeChoice
 * field. NOTE: when inserting a DateCriterionChoice this field must
 * be non-null.
     */
    public void setSearchType(com.guidewire.ab.webservices.enumeration.SearchObjectType SearchType) {
        this.SearchType = SearchType;
    }


    /**
     *  The start (inclusive) of the date range to which the chosen date
 * field should be restricted. Used if DateSearchType is "enteredrange".
     * 
     * @return StartDate The start (inclusive) of the date range to which the chosen date
 * field should be restricted. Used if DateSearchType is "enteredrange".
     */
    public java.util.Calendar getStartDate() {
        return StartDate;
    }


    /**
     *  The start (inclusive) of the date range to which the chosen date
 * field should be restricted. Used if DateSearchType is "enteredrange".
     * 
     * @param StartDate The start (inclusive) of the date range to which the chosen date
 * field should be restricted. Used if DateSearchType is "enteredrange".
     */
    public void setStartDate(java.util.Calendar StartDate) {
        this.StartDate = StartDate;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DateCriterionChoice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "DateCriterionChoice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beanVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BeanVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chosenOption");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ChosenOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateRangeChoice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DateRangeChoice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "DateRangeChoiceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateSearchType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DateSearchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "DateSearchType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SearchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "SearchObjectType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StartDate"));
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
