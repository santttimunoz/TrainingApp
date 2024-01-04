/**
 * Organization.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Defines an organization that has a hierarchy of groups
 */
public class Organization  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        Flag indicating whether this organization corresponds to the carrier
 * itself.
     */ 
    private java.lang.Boolean Carrier;
    /** 
        Contact entry related to the organization.
     */ 
    private com.guidewire.ab.webservices.entity.Contact Contact;
    /** 
        Date organization went or will go public
     */ 
    private java.util.Calendar IPODate_Ext;
    /** 
        Is this organization publicly owned?
     */ 
    private java.lang.Boolean IsPublic_Ext;
    /** 
        Is this organization tax exempt?
     */ 
    private java.lang.Boolean IsTaxExempt_Ext;
    /** 
        Percent of claims over $5000
     */ 
    private java.lang.Integer LargeClaimPercent_Ext;
    /** 
        Flag indicating whether this organization is the superuser organization
 * with admin powers over all organizations.
     */ 
    private java.lang.Boolean MasterAdmin;
    /** 
        The name of the organization. NOTE: when inserting a Organization
 * this field must be non-null.
     */ 
    private java.lang.String Name;
    /** 
        The kanji name of the organization. Used only for Japanese and
 * will be null otherwise.
     */ 
    private java.lang.String NameKanji;
    /** 
        Number of employees
     */ 
    private java.lang.Integer NumberOfEmployees_Ext;
    /** 
        Is PO account verified?
     */ 
    private java.lang.Boolean PurchaseOrderAccountNumberVerified_Ext;
    /** 
        Purchase order account number
     */ 
    private java.lang.String PurchaseOrderAccountNumber_Ext;
    /** 
        Risk to insure
     */ 
    private java.math.BigDecimal RiskFactor_Ext;
    /** 
        The organization's root group.
     */ 
    private com.guidewire.ab.webservices.entity.Group RootGroup;
    /** 
        Price per share (in dollars)
     */ 
    private com.guidewire.ab.webservices.entity.CurrencyAmount StockPrice_Ext;
    /** 
        Stock market symbol
     */ 
    private java.lang.String StockTicker_Ext;
    /** 
        The type of the organization.
     */ 
    private com.guidewire.ab.webservices.enumeration.BusinessType Type;
    /** 
        Link to joiner table for zones to admin.
     */ 
    private com.guidewire.ab.webservices.entity.OrganizationZoneAdmin[] ZonesToAdmin;

    public Organization() {
    }

    public Organization(
           java.lang.Integer BeanVersion,
           java.lang.Boolean Carrier,
           com.guidewire.ab.webservices.entity.Contact Contact,
           java.util.Calendar IPODate_Ext,
           java.lang.Boolean IsPublic_Ext,
           java.lang.Boolean IsTaxExempt_Ext,
           java.lang.Integer LargeClaimPercent_Ext,
           java.lang.Boolean MasterAdmin,
           java.lang.String Name,
           java.lang.String NameKanji,
           java.lang.Integer NumberOfEmployees_Ext,
           java.lang.Boolean PurchaseOrderAccountNumberVerified_Ext,
           java.lang.String PurchaseOrderAccountNumber_Ext,
           java.math.BigDecimal RiskFactor_Ext,
           com.guidewire.ab.webservices.entity.Group RootGroup,
           com.guidewire.ab.webservices.entity.CurrencyAmount StockPrice_Ext,
           java.lang.String StockTicker_Ext,
           com.guidewire.ab.webservices.enumeration.BusinessType Type,
           com.guidewire.ab.webservices.entity.OrganizationZoneAdmin[] ZonesToAdmin) {
           this.BeanVersion = BeanVersion;
           this.Carrier = Carrier;
           this.Contact = Contact;
           this.IPODate_Ext = IPODate_Ext;
           this.IsPublic_Ext = IsPublic_Ext;
           this.IsTaxExempt_Ext = IsTaxExempt_Ext;
           this.LargeClaimPercent_Ext = LargeClaimPercent_Ext;
           this.MasterAdmin = MasterAdmin;
           this.Name = Name;
           this.NameKanji = NameKanji;
           this.NumberOfEmployees_Ext = NumberOfEmployees_Ext;
           this.PurchaseOrderAccountNumberVerified_Ext = PurchaseOrderAccountNumberVerified_Ext;
           this.PurchaseOrderAccountNumber_Ext = PurchaseOrderAccountNumber_Ext;
           this.RiskFactor_Ext = RiskFactor_Ext;
           this.RootGroup = RootGroup;
           this.StockPrice_Ext = StockPrice_Ext;
           this.StockTicker_Ext = StockTicker_Ext;
           this.Type = Type;
           this.ZonesToAdmin = ZonesToAdmin;
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
     *  Flag indicating whether this organization corresponds to the carrier
 * itself.
     * 
     * @return Carrier Flag indicating whether this organization corresponds to the carrier
 * itself.
     */
    public java.lang.Boolean getCarrier() {
        return Carrier;
    }


    /**
     *  Flag indicating whether this organization corresponds to the carrier
 * itself.
     * 
     * @param Carrier Flag indicating whether this organization corresponds to the carrier
 * itself.
     */
    public void setCarrier(java.lang.Boolean Carrier) {
        this.Carrier = Carrier;
    }


    /**
     *  Contact entry related to the organization.
     * 
     * @return Contact Contact entry related to the organization.
     */
    public com.guidewire.ab.webservices.entity.Contact getContact() {
        return Contact;
    }


    /**
     *  Contact entry related to the organization.
     * 
     * @param Contact Contact entry related to the organization.
     */
    public void setContact(com.guidewire.ab.webservices.entity.Contact Contact) {
        this.Contact = Contact;
    }


    /**
     *  Date organization went or will go public
     * 
     * @return IPODate_Ext Date organization went or will go public
     */
    public java.util.Calendar getIPODate_Ext() {
        return IPODate_Ext;
    }


    /**
     *  Date organization went or will go public
     * 
     * @param IPODate_Ext Date organization went or will go public
     */
    public void setIPODate_Ext(java.util.Calendar IPODate_Ext) {
        this.IPODate_Ext = IPODate_Ext;
    }


    /**
     *  Is this organization publicly owned?
     * 
     * @return IsPublic_Ext Is this organization publicly owned?
     */
    public java.lang.Boolean getIsPublic_Ext() {
        return IsPublic_Ext;
    }


    /**
     *  Is this organization publicly owned?
     * 
     * @param IsPublic_Ext Is this organization publicly owned?
     */
    public void setIsPublic_Ext(java.lang.Boolean IsPublic_Ext) {
        this.IsPublic_Ext = IsPublic_Ext;
    }


    /**
     *  Is this organization tax exempt?
     * 
     * @return IsTaxExempt_Ext Is this organization tax exempt?
     */
    public java.lang.Boolean getIsTaxExempt_Ext() {
        return IsTaxExempt_Ext;
    }


    /**
     *  Is this organization tax exempt?
     * 
     * @param IsTaxExempt_Ext Is this organization tax exempt?
     */
    public void setIsTaxExempt_Ext(java.lang.Boolean IsTaxExempt_Ext) {
        this.IsTaxExempt_Ext = IsTaxExempt_Ext;
    }


    /**
     *  Percent of claims over $5000
     * 
     * @return LargeClaimPercent_Ext Percent of claims over $5000
     */
    public java.lang.Integer getLargeClaimPercent_Ext() {
        return LargeClaimPercent_Ext;
    }


    /**
     *  Percent of claims over $5000
     * 
     * @param LargeClaimPercent_Ext Percent of claims over $5000
     */
    public void setLargeClaimPercent_Ext(java.lang.Integer LargeClaimPercent_Ext) {
        this.LargeClaimPercent_Ext = LargeClaimPercent_Ext;
    }


    /**
     *  Flag indicating whether this organization is the superuser organization
 * with admin powers over all organizations.
     * 
     * @return MasterAdmin Flag indicating whether this organization is the superuser organization
 * with admin powers over all organizations.
     */
    public java.lang.Boolean getMasterAdmin() {
        return MasterAdmin;
    }


    /**
     *  Flag indicating whether this organization is the superuser organization
 * with admin powers over all organizations.
     * 
     * @param MasterAdmin Flag indicating whether this organization is the superuser organization
 * with admin powers over all organizations.
     */
    public void setMasterAdmin(java.lang.Boolean MasterAdmin) {
        this.MasterAdmin = MasterAdmin;
    }


    /**
     *  The name of the organization. NOTE: when inserting a Organization
 * this field must be non-null.
     * 
     * @return Name The name of the organization. NOTE: when inserting a Organization
 * this field must be non-null.
     */
    public java.lang.String getName() {
        return Name;
    }


    /**
     *  The name of the organization. NOTE: when inserting a Organization
 * this field must be non-null.
     * 
     * @param Name The name of the organization. NOTE: when inserting a Organization
 * this field must be non-null.
     */
    public void setName(java.lang.String Name) {
        this.Name = Name;
    }


    /**
     *  The kanji name of the organization. Used only for Japanese and
 * will be null otherwise.
     * 
     * @return NameKanji The kanji name of the organization. Used only for Japanese and
 * will be null otherwise.
     */
    public java.lang.String getNameKanji() {
        return NameKanji;
    }


    /**
     *  The kanji name of the organization. Used only for Japanese and
 * will be null otherwise.
     * 
     * @param NameKanji The kanji name of the organization. Used only for Japanese and
 * will be null otherwise.
     */
    public void setNameKanji(java.lang.String NameKanji) {
        this.NameKanji = NameKanji;
    }


    /**
     *  Number of employees
     * 
     * @return NumberOfEmployees_Ext Number of employees
     */
    public java.lang.Integer getNumberOfEmployees_Ext() {
        return NumberOfEmployees_Ext;
    }


    /**
     *  Number of employees
     * 
     * @param NumberOfEmployees_Ext Number of employees
     */
    public void setNumberOfEmployees_Ext(java.lang.Integer NumberOfEmployees_Ext) {
        this.NumberOfEmployees_Ext = NumberOfEmployees_Ext;
    }


    /**
     *  Is PO account verified?
     * 
     * @return PurchaseOrderAccountNumberVerified_Ext Is PO account verified?
     */
    public java.lang.Boolean getPurchaseOrderAccountNumberVerified_Ext() {
        return PurchaseOrderAccountNumberVerified_Ext;
    }


    /**
     *  Is PO account verified?
     * 
     * @param PurchaseOrderAccountNumberVerified_Ext Is PO account verified?
     */
    public void setPurchaseOrderAccountNumberVerified_Ext(java.lang.Boolean PurchaseOrderAccountNumberVerified_Ext) {
        this.PurchaseOrderAccountNumberVerified_Ext = PurchaseOrderAccountNumberVerified_Ext;
    }


    /**
     *  Purchase order account number
     * 
     * @return PurchaseOrderAccountNumber_Ext Purchase order account number
     */
    public java.lang.String getPurchaseOrderAccountNumber_Ext() {
        return PurchaseOrderAccountNumber_Ext;
    }


    /**
     *  Purchase order account number
     * 
     * @param PurchaseOrderAccountNumber_Ext Purchase order account number
     */
    public void setPurchaseOrderAccountNumber_Ext(java.lang.String PurchaseOrderAccountNumber_Ext) {
        this.PurchaseOrderAccountNumber_Ext = PurchaseOrderAccountNumber_Ext;
    }


    /**
     *  Risk to insure
     * 
     * @return RiskFactor_Ext Risk to insure
     */
    public java.math.BigDecimal getRiskFactor_Ext() {
        return RiskFactor_Ext;
    }


    /**
     *  Risk to insure
     * 
     * @param RiskFactor_Ext Risk to insure
     */
    public void setRiskFactor_Ext(java.math.BigDecimal RiskFactor_Ext) {
        this.RiskFactor_Ext = RiskFactor_Ext;
    }


    /**
     *  The organization's root group.
     * 
     * @return RootGroup The organization's root group.
     */
    public com.guidewire.ab.webservices.entity.Group getRootGroup() {
        return RootGroup;
    }


    /**
     *  The organization's root group.
     * 
     * @param RootGroup The organization's root group.
     */
    public void setRootGroup(com.guidewire.ab.webservices.entity.Group RootGroup) {
        this.RootGroup = RootGroup;
    }


    /**
     *  Price per share (in dollars)
     * 
     * @return StockPrice_Ext Price per share (in dollars)
     */
    public com.guidewire.ab.webservices.entity.CurrencyAmount getStockPrice_Ext() {
        return StockPrice_Ext;
    }


    /**
     *  Price per share (in dollars)
     * 
     * @param StockPrice_Ext Price per share (in dollars)
     */
    public void setStockPrice_Ext(com.guidewire.ab.webservices.entity.CurrencyAmount StockPrice_Ext) {
        this.StockPrice_Ext = StockPrice_Ext;
    }


    /**
     *  Stock market symbol
     * 
     * @return StockTicker_Ext Stock market symbol
     */
    public java.lang.String getStockTicker_Ext() {
        return StockTicker_Ext;
    }


    /**
     *  Stock market symbol
     * 
     * @param StockTicker_Ext Stock market symbol
     */
    public void setStockTicker_Ext(java.lang.String StockTicker_Ext) {
        this.StockTicker_Ext = StockTicker_Ext;
    }


    /**
     *  The type of the organization.
     * 
     * @return Type The type of the organization.
     */
    public com.guidewire.ab.webservices.enumeration.BusinessType getType() {
        return Type;
    }


    /**
     *  The type of the organization.
     * 
     * @param Type The type of the organization.
     */
    public void setType(com.guidewire.ab.webservices.enumeration.BusinessType Type) {
        this.Type = Type;
    }


    /**
     *  Link to joiner table for zones to admin.
     * 
     * @return ZonesToAdmin Link to joiner table for zones to admin.
     */
    public com.guidewire.ab.webservices.entity.OrganizationZoneAdmin[] getZonesToAdmin() {
        return ZonesToAdmin;
    }


    /**
     *  Link to joiner table for zones to admin.
     * 
     * @param ZonesToAdmin Link to joiner table for zones to admin.
     */
    public void setZonesToAdmin(com.guidewire.ab.webservices.entity.OrganizationZoneAdmin[] ZonesToAdmin) {
        this.ZonesToAdmin = ZonesToAdmin;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Organization.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Organization"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beanVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BeanVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Carrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
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
        elemField.setFieldName("IPODate_Ext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IPODate_Ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPublic_Ext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsPublic_Ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTaxExempt_Ext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsTaxExempt_Ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("largeClaimPercent_Ext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LargeClaimPercent_Ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterAdmin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MasterAdmin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameKanji");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NameKanji"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfEmployees_Ext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumberOfEmployees_Ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderAccountNumberVerified_Ext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PurchaseOrderAccountNumberVerified_Ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderAccountNumber_Ext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PurchaseOrderAccountNumber_Ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("riskFactor_Ext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RiskFactor_Ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rootGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RootGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Group"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stockPrice_Ext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StockPrice_Ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "CurrencyAmount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stockTicker_Ext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StockTicker_Ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "BusinessType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zonesToAdmin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZonesToAdmin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "OrganizationZoneAdmin"));
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
