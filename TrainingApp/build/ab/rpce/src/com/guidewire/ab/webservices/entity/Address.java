/**
 * Address.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Represents a street or mailing address. Addresses are normally
 * associated with
 *       a Contact, either as a Primary Address for that Contact or via
 * the ContactAddress table. Addresses can
 *       have geographic location information stored for proximity searches.<p/>
 * {@see com.guidewire.pl.domain.contact.Contact}<br/>
 *       {@see com.guidewire.pl.domain.contact.ContactAddress}
 */
public class Address  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        The system uses this value when it is integrated with ContactManager
 * and the related contact             is linked.  In this case, the
 * ID represents the ID of this </code>Address</code> object's associated
 * <code>ABAddress</code> in ContactManager. This value is Null if the
 * object is not linked.
     */ 
    private java.lang.String AddressBookUID;
    /** 
        First line of mailing address.
     */ 
    private java.lang.String AddressLine1;
    /** 
        First line of mailing address in kanji (used only for Japanese
 * addresses and will be null otherwise)
     */ 
    private java.lang.String AddressLine1Kanji;
    /** 
        Second line of mailing address.
     */ 
    private java.lang.String AddressLine2;
    /** 
        Second line of mailing address in kanji (used only for Japanese
 * addresses and will be null otherwise)
     */ 
    private java.lang.String AddressLine2Kanji;
    /** 
        Third line of mailing address.
     */ 
    private java.lang.String AddressLine3;
    /** 
        Type of this address record.
     */ 
    private com.guidewire.ab.webservices.enumeration.AddressType AddressType;
    /** 
        Boolean field to mark an address to be geocoded (if needed) by
 * the batch geocoding work queue.
     */ 
    private java.lang.Boolean BatchGeocode;
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        CEDEX: Special business mail delivery flag (used only for French
 * addresses and will be null otherwise)
     */ 
    private java.lang.Boolean CEDEX;
    /** 
        CEDEX: Special business mail delivery bureau (used only for French
 * addresses and will be null otherwise)
     */ 
    private java.lang.String CEDEXBureau;
    /** 
        City.
     */ 
    private java.lang.String City;
    /** 
        City in kanji (used only for Japanese addresses and will be null
 * otherwise)
     */ 
    private java.lang.String CityKanji;
    /** 
        Country.
     */ 
    private com.guidewire.ab.webservices.enumeration.Country Country;
    /** 
        County.
     */ 
    private java.lang.String County;
    /** 
        Additional description of mailing address.
     */ 
    private java.lang.String Description;
    /** 
        Enum giving the status of the latitude and longitude data.
     */ 
    private com.guidewire.ab.webservices.enumeration.GeocodeStatus GeocodeStatus;
    /** 
        Represents the ID used by client applications to link with the
 * Address Book.
     */ 
    private java.lang.String LinkID;
    /** 
        Postal code; string to handle Zip+4 and international codes.
     */ 
    private java.lang.String PostalCode;
    /** 
        Represents the LinkID of the address that replaced this address
 * in the event of a merge.
     */ 
    private java.lang.String ReplacingAddressLinkID;
    /** 
        Latitude and longitude of this address, represented as an instance
 * of SpatialPoint.
     */ 
    private com.guidewire.ab.webservices.entity.SpatialPoint SpatialPoint;
    /** 
        State.
     */ 
    private com.guidewire.ab.webservices.enumeration.State State;
    /** 
        Latest date that this address is valid.
     */ 
    private java.util.Calendar ValidUntil;

    public Address() {
    }

    public Address(
           java.lang.String AddressBookUID,
           java.lang.String AddressLine1,
           java.lang.String AddressLine1Kanji,
           java.lang.String AddressLine2,
           java.lang.String AddressLine2Kanji,
           java.lang.String AddressLine3,
           com.guidewire.ab.webservices.enumeration.AddressType AddressType,
           java.lang.Boolean BatchGeocode,
           java.lang.Integer BeanVersion,
           java.lang.Boolean CEDEX,
           java.lang.String CEDEXBureau,
           java.lang.String City,
           java.lang.String CityKanji,
           com.guidewire.ab.webservices.enumeration.Country Country,
           java.lang.String County,
           java.lang.String Description,
           com.guidewire.ab.webservices.enumeration.GeocodeStatus GeocodeStatus,
           java.lang.String LinkID,
           java.lang.String PostalCode,
           java.lang.String ReplacingAddressLinkID,
           com.guidewire.ab.webservices.entity.SpatialPoint SpatialPoint,
           com.guidewire.ab.webservices.enumeration.State State,
           java.util.Calendar ValidUntil) {
           this.AddressBookUID = AddressBookUID;
           this.AddressLine1 = AddressLine1;
           this.AddressLine1Kanji = AddressLine1Kanji;
           this.AddressLine2 = AddressLine2;
           this.AddressLine2Kanji = AddressLine2Kanji;
           this.AddressLine3 = AddressLine3;
           this.AddressType = AddressType;
           this.BatchGeocode = BatchGeocode;
           this.BeanVersion = BeanVersion;
           this.CEDEX = CEDEX;
           this.CEDEXBureau = CEDEXBureau;
           this.City = City;
           this.CityKanji = CityKanji;
           this.Country = Country;
           this.County = County;
           this.Description = Description;
           this.GeocodeStatus = GeocodeStatus;
           this.LinkID = LinkID;
           this.PostalCode = PostalCode;
           this.ReplacingAddressLinkID = ReplacingAddressLinkID;
           this.SpatialPoint = SpatialPoint;
           this.State = State;
           this.ValidUntil = ValidUntil;
    }


    /**
     *  The system uses this value when it is integrated with ContactManager
 * and the related contact             is linked.  In this case, the
 * ID represents the ID of this </code>Address</code> object's associated
 * <code>ABAddress</code> in ContactManager. This value is Null if the
 * object is not linked.
     * 
     * @return AddressBookUID The system uses this value when it is integrated with ContactManager
 * and the related contact             is linked.  In this case, the
 * ID represents the ID of this </code>Address</code> object's associated
 * <code>ABAddress</code> in ContactManager. This value is Null if the
 * object is not linked.
     */
    public java.lang.String getAddressBookUID() {
        return AddressBookUID;
    }


    /**
     *  The system uses this value when it is integrated with ContactManager
 * and the related contact             is linked.  In this case, the
 * ID represents the ID of this </code>Address</code> object's associated
 * <code>ABAddress</code> in ContactManager. This value is Null if the
 * object is not linked.
     * 
     * @param AddressBookUID The system uses this value when it is integrated with ContactManager
 * and the related contact             is linked.  In this case, the
 * ID represents the ID of this </code>Address</code> object's associated
 * <code>ABAddress</code> in ContactManager. This value is Null if the
 * object is not linked.
     */
    public void setAddressBookUID(java.lang.String AddressBookUID) {
        this.AddressBookUID = AddressBookUID;
    }


    /**
     *  First line of mailing address.
     * 
     * @return AddressLine1 First line of mailing address.
     */
    public java.lang.String getAddressLine1() {
        return AddressLine1;
    }


    /**
     *  First line of mailing address.
     * 
     * @param AddressLine1 First line of mailing address.
     */
    public void setAddressLine1(java.lang.String AddressLine1) {
        this.AddressLine1 = AddressLine1;
    }


    /**
     *  First line of mailing address in kanji (used only for Japanese
 * addresses and will be null otherwise)
     * 
     * @return AddressLine1Kanji First line of mailing address in kanji (used only for Japanese
 * addresses and will be null otherwise)
     */
    public java.lang.String getAddressLine1Kanji() {
        return AddressLine1Kanji;
    }


    /**
     *  First line of mailing address in kanji (used only for Japanese
 * addresses and will be null otherwise)
     * 
     * @param AddressLine1Kanji First line of mailing address in kanji (used only for Japanese
 * addresses and will be null otherwise)
     */
    public void setAddressLine1Kanji(java.lang.String AddressLine1Kanji) {
        this.AddressLine1Kanji = AddressLine1Kanji;
    }


    /**
     *  Second line of mailing address.
     * 
     * @return AddressLine2 Second line of mailing address.
     */
    public java.lang.String getAddressLine2() {
        return AddressLine2;
    }


    /**
     *  Second line of mailing address.
     * 
     * @param AddressLine2 Second line of mailing address.
     */
    public void setAddressLine2(java.lang.String AddressLine2) {
        this.AddressLine2 = AddressLine2;
    }


    /**
     *  Second line of mailing address in kanji (used only for Japanese
 * addresses and will be null otherwise)
     * 
     * @return AddressLine2Kanji Second line of mailing address in kanji (used only for Japanese
 * addresses and will be null otherwise)
     */
    public java.lang.String getAddressLine2Kanji() {
        return AddressLine2Kanji;
    }


    /**
     *  Second line of mailing address in kanji (used only for Japanese
 * addresses and will be null otherwise)
     * 
     * @param AddressLine2Kanji Second line of mailing address in kanji (used only for Japanese
 * addresses and will be null otherwise)
     */
    public void setAddressLine2Kanji(java.lang.String AddressLine2Kanji) {
        this.AddressLine2Kanji = AddressLine2Kanji;
    }


    /**
     *  Third line of mailing address.
     * 
     * @return AddressLine3 Third line of mailing address.
     */
    public java.lang.String getAddressLine3() {
        return AddressLine3;
    }


    /**
     *  Third line of mailing address.
     * 
     * @param AddressLine3 Third line of mailing address.
     */
    public void setAddressLine3(java.lang.String AddressLine3) {
        this.AddressLine3 = AddressLine3;
    }


    /**
     *  Type of this address record.
     * 
     * @return AddressType Type of this address record.
     */
    public com.guidewire.ab.webservices.enumeration.AddressType getAddressType() {
        return AddressType;
    }


    /**
     *  Type of this address record.
     * 
     * @param AddressType Type of this address record.
     */
    public void setAddressType(com.guidewire.ab.webservices.enumeration.AddressType AddressType) {
        this.AddressType = AddressType;
    }


    /**
     *  Boolean field to mark an address to be geocoded (if needed) by
 * the batch geocoding work queue.
     * 
     * @return BatchGeocode Boolean field to mark an address to be geocoded (if needed) by
 * the batch geocoding work queue.
     */
    public java.lang.Boolean getBatchGeocode() {
        return BatchGeocode;
    }


    /**
     *  Boolean field to mark an address to be geocoded (if needed) by
 * the batch geocoding work queue.
     * 
     * @param BatchGeocode Boolean field to mark an address to be geocoded (if needed) by
 * the batch geocoding work queue.
     */
    public void setBatchGeocode(java.lang.Boolean BatchGeocode) {
        this.BatchGeocode = BatchGeocode;
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
     *  CEDEX: Special business mail delivery flag (used only for French
 * addresses and will be null otherwise)
     * 
     * @return CEDEX CEDEX: Special business mail delivery flag (used only for French
 * addresses and will be null otherwise)
     */
    public java.lang.Boolean getCEDEX() {
        return CEDEX;
    }


    /**
     *  CEDEX: Special business mail delivery flag (used only for French
 * addresses and will be null otherwise)
     * 
     * @param CEDEX CEDEX: Special business mail delivery flag (used only for French
 * addresses and will be null otherwise)
     */
    public void setCEDEX(java.lang.Boolean CEDEX) {
        this.CEDEX = CEDEX;
    }


    /**
     *  CEDEX: Special business mail delivery bureau (used only for French
 * addresses and will be null otherwise)
     * 
     * @return CEDEXBureau CEDEX: Special business mail delivery bureau (used only for French
 * addresses and will be null otherwise)
     */
    public java.lang.String getCEDEXBureau() {
        return CEDEXBureau;
    }


    /**
     *  CEDEX: Special business mail delivery bureau (used only for French
 * addresses and will be null otherwise)
     * 
     * @param CEDEXBureau CEDEX: Special business mail delivery bureau (used only for French
 * addresses and will be null otherwise)
     */
    public void setCEDEXBureau(java.lang.String CEDEXBureau) {
        this.CEDEXBureau = CEDEXBureau;
    }


    /**
     *  City.
     * 
     * @return City City.
     */
    public java.lang.String getCity() {
        return City;
    }


    /**
     *  City.
     * 
     * @param City City.
     */
    public void setCity(java.lang.String City) {
        this.City = City;
    }


    /**
     *  City in kanji (used only for Japanese addresses and will be null
 * otherwise)
     * 
     * @return CityKanji City in kanji (used only for Japanese addresses and will be null
 * otherwise)
     */
    public java.lang.String getCityKanji() {
        return CityKanji;
    }


    /**
     *  City in kanji (used only for Japanese addresses and will be null
 * otherwise)
     * 
     * @param CityKanji City in kanji (used only for Japanese addresses and will be null
 * otherwise)
     */
    public void setCityKanji(java.lang.String CityKanji) {
        this.CityKanji = CityKanji;
    }


    /**
     *  Country.
     * 
     * @return Country Country.
     */
    public com.guidewire.ab.webservices.enumeration.Country getCountry() {
        return Country;
    }


    /**
     *  Country.
     * 
     * @param Country Country.
     */
    public void setCountry(com.guidewire.ab.webservices.enumeration.Country Country) {
        this.Country = Country;
    }


    /**
     *  County.
     * 
     * @return County County.
     */
    public java.lang.String getCounty() {
        return County;
    }


    /**
     *  County.
     * 
     * @param County County.
     */
    public void setCounty(java.lang.String County) {
        this.County = County;
    }


    /**
     *  Additional description of mailing address.
     * 
     * @return Description Additional description of mailing address.
     */
    public java.lang.String getDescription() {
        return Description;
    }


    /**
     *  Additional description of mailing address.
     * 
     * @param Description Additional description of mailing address.
     */
    public void setDescription(java.lang.String Description) {
        this.Description = Description;
    }


    /**
     *  Enum giving the status of the latitude and longitude data.
     * 
     * @return GeocodeStatus Enum giving the status of the latitude and longitude data.
     */
    public com.guidewire.ab.webservices.enumeration.GeocodeStatus getGeocodeStatus() {
        return GeocodeStatus;
    }


    /**
     *  Enum giving the status of the latitude and longitude data.
     * 
     * @param GeocodeStatus Enum giving the status of the latitude and longitude data.
     */
    public void setGeocodeStatus(com.guidewire.ab.webservices.enumeration.GeocodeStatus GeocodeStatus) {
        this.GeocodeStatus = GeocodeStatus;
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
     *  Postal code; string to handle Zip+4 and international codes.
     * 
     * @return PostalCode Postal code; string to handle Zip+4 and international codes.
     */
    public java.lang.String getPostalCode() {
        return PostalCode;
    }


    /**
     *  Postal code; string to handle Zip+4 and international codes.
     * 
     * @param PostalCode Postal code; string to handle Zip+4 and international codes.
     */
    public void setPostalCode(java.lang.String PostalCode) {
        this.PostalCode = PostalCode;
    }


    /**
     *  Represents the LinkID of the address that replaced this address
 * in the event of a merge.
     * 
     * @return ReplacingAddressLinkID Represents the LinkID of the address that replaced this address
 * in the event of a merge.
     */
    public java.lang.String getReplacingAddressLinkID() {
        return ReplacingAddressLinkID;
    }


    /**
     *  Represents the LinkID of the address that replaced this address
 * in the event of a merge.
     * 
     * @param ReplacingAddressLinkID Represents the LinkID of the address that replaced this address
 * in the event of a merge.
     */
    public void setReplacingAddressLinkID(java.lang.String ReplacingAddressLinkID) {
        this.ReplacingAddressLinkID = ReplacingAddressLinkID;
    }


    /**
     *  Latitude and longitude of this address, represented as an instance
 * of SpatialPoint.
     * 
     * @return SpatialPoint Latitude and longitude of this address, represented as an instance
 * of SpatialPoint.
     */
    public com.guidewire.ab.webservices.entity.SpatialPoint getSpatialPoint() {
        return SpatialPoint;
    }


    /**
     *  Latitude and longitude of this address, represented as an instance
 * of SpatialPoint.
     * 
     * @param SpatialPoint Latitude and longitude of this address, represented as an instance
 * of SpatialPoint.
     */
    public void setSpatialPoint(com.guidewire.ab.webservices.entity.SpatialPoint SpatialPoint) {
        this.SpatialPoint = SpatialPoint;
    }


    /**
     *  State.
     * 
     * @return State State.
     */
    public com.guidewire.ab.webservices.enumeration.State getState() {
        return State;
    }


    /**
     *  State.
     * 
     * @param State State.
     */
    public void setState(com.guidewire.ab.webservices.enumeration.State State) {
        this.State = State;
    }


    /**
     *  Latest date that this address is valid.
     * 
     * @return ValidUntil Latest date that this address is valid.
     */
    public java.util.Calendar getValidUntil() {
        return ValidUntil;
    }


    /**
     *  Latest date that this address is valid.
     * 
     * @param ValidUntil Latest date that this address is valid.
     */
    public void setValidUntil(java.util.Calendar ValidUntil) {
        this.ValidUntil = ValidUntil;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Address.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Address"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressBookUID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AddressBookUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AddressLine1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine1Kanji");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AddressLine1Kanji"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AddressLine2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine2Kanji");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AddressLine2Kanji"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AddressLine3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AddressType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "AddressType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchGeocode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BatchGeocode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
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
        elemField.setFieldName("CEDEX");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CEDEX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CEDEXBureau");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CEDEXBureau"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityKanji");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CityKanji"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "Country"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("county");
        elemField.setXmlName(new javax.xml.namespace.QName("", "County"));
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
        elemField.setFieldName("geocodeStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GeocodeStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "GeocodeStatus"));
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
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replacingAddressLinkID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReplacingAddressLinkID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spatialPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SpatialPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "SpatialPoint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "State"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validUntil");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ValidUntil"));
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
