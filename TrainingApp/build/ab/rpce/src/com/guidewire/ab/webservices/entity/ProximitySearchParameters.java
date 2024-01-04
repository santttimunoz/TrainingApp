/**
 * ProximitySearchParameters.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * <p>
 *       Encapsulates the set of additional criteria needed to perform
 * a proximity search. This entity is
 *       a child object to the <code>ContactSearchCriteria</code> entity.
 * </p><p>
 *       Note that there are two ways to specify the origin location
 * for a proximity search: the Geocode fields on
 *       the <code>ProximitySearchParameters</code> itself (SpatialPoint/GeocodeStatus)
 * or the
 *       <code>ConstactSearchCriteria.ProximitySearchCenter</code> field.
 * If both are set prior to performing the search,
 *       the system will use Geocode fields and ignore the <code>ProximitySearchCenter</code>
 * field.</p>
 *       <p>
 *       See <code>ContactSearchCriteria</code> for more information
 */
public class ProximitySearchParameters  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        The corrected address (if any) corresponding to the SpatialPoint
 * of that is being searched for, in localized/user-displayable form.
 * This is normally set by the ProximitySearchPageHelper.
     */ 
    private java.lang.String CorrectedSearchCenter;
    /** 
        Indicates whether this is a distance based search (within n-mi/km)
 * or an ordinal search (nearest-n)
     */ 
    private java.lang.Boolean DistanceBasedSearch;
    /** 
        Gives the status of the provided SpatialPoint; this is normally
 * copied from the a Geocodable entity.
     */ 
    private com.guidewire.ab.webservices.enumeration.GeocodeStatus GeocodeStatus;
    /** 
        Indicates either the radius (in UnitOfDistance units) if a distance
 * based search, or the number of results to return if an ordinal search.
     */ 
    private java.lang.Integer Number;
    /** 
        Indicates the maximum number of items to return on a radius search.
 * Ignored if DistanceBasedSearch is false; if DistanceBasedSearch is
 * true, and this value is null, zero, or negative, the search will be
 * limited by the value of ProximityRadiusSearchDefaultMaxResultCount
     */ 
    private java.lang.Integer RadiusSearchMaxResults;
    /** 
        Used internally by ProximitySearchPageHelper to save the search
 * center address (if any) in standardized form; DO NOT USE unless you
 * are overriding the standard performProximitySearch() method.
     */ 
    private java.lang.String SavedSearchCenter;
    /** 
        SpatialPoint to do a proximity search from; this is normally copied
 * from the a Geocodable entity.
     */ 
    private com.guidewire.ab.webservices.entity.SpatialPoint SpatialPoint;
    /** 
        Indicates the UnitOfDistance to use, both to return distances in
 * results and to indicate the unit of radius for distance-based searches.
     */ 
    private com.guidewire.ab.webservices.enumeration.UnitOfDistance UnitOfDistance;

    public ProximitySearchParameters() {
    }

    public ProximitySearchParameters(
           java.lang.Integer BeanVersion,
           java.lang.String CorrectedSearchCenter,
           java.lang.Boolean DistanceBasedSearch,
           com.guidewire.ab.webservices.enumeration.GeocodeStatus GeocodeStatus,
           java.lang.Integer Number,
           java.lang.Integer RadiusSearchMaxResults,
           java.lang.String SavedSearchCenter,
           com.guidewire.ab.webservices.entity.SpatialPoint SpatialPoint,
           com.guidewire.ab.webservices.enumeration.UnitOfDistance UnitOfDistance) {
           this.BeanVersion = BeanVersion;
           this.CorrectedSearchCenter = CorrectedSearchCenter;
           this.DistanceBasedSearch = DistanceBasedSearch;
           this.GeocodeStatus = GeocodeStatus;
           this.Number = Number;
           this.RadiusSearchMaxResults = RadiusSearchMaxResults;
           this.SavedSearchCenter = SavedSearchCenter;
           this.SpatialPoint = SpatialPoint;
           this.UnitOfDistance = UnitOfDistance;
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
     *  The corrected address (if any) corresponding to the SpatialPoint
 * of that is being searched for, in localized/user-displayable form.
 * This is normally set by the ProximitySearchPageHelper.
     * 
     * @return CorrectedSearchCenter The corrected address (if any) corresponding to the SpatialPoint
 * of that is being searched for, in localized/user-displayable form.
 * This is normally set by the ProximitySearchPageHelper.
     */
    public java.lang.String getCorrectedSearchCenter() {
        return CorrectedSearchCenter;
    }


    /**
     *  The corrected address (if any) corresponding to the SpatialPoint
 * of that is being searched for, in localized/user-displayable form.
 * This is normally set by the ProximitySearchPageHelper.
     * 
     * @param CorrectedSearchCenter The corrected address (if any) corresponding to the SpatialPoint
 * of that is being searched for, in localized/user-displayable form.
 * This is normally set by the ProximitySearchPageHelper.
     */
    public void setCorrectedSearchCenter(java.lang.String CorrectedSearchCenter) {
        this.CorrectedSearchCenter = CorrectedSearchCenter;
    }


    /**
     *  Indicates whether this is a distance based search (within n-mi/km)
 * or an ordinal search (nearest-n)
     * 
     * @return DistanceBasedSearch Indicates whether this is a distance based search (within n-mi/km)
 * or an ordinal search (nearest-n)
     */
    public java.lang.Boolean getDistanceBasedSearch() {
        return DistanceBasedSearch;
    }


    /**
     *  Indicates whether this is a distance based search (within n-mi/km)
 * or an ordinal search (nearest-n)
     * 
     * @param DistanceBasedSearch Indicates whether this is a distance based search (within n-mi/km)
 * or an ordinal search (nearest-n)
     */
    public void setDistanceBasedSearch(java.lang.Boolean DistanceBasedSearch) {
        this.DistanceBasedSearch = DistanceBasedSearch;
    }


    /**
     *  Gives the status of the provided SpatialPoint; this is normally
 * copied from the a Geocodable entity.
     * 
     * @return GeocodeStatus Gives the status of the provided SpatialPoint; this is normally
 * copied from the a Geocodable entity.
     */
    public com.guidewire.ab.webservices.enumeration.GeocodeStatus getGeocodeStatus() {
        return GeocodeStatus;
    }


    /**
     *  Gives the status of the provided SpatialPoint; this is normally
 * copied from the a Geocodable entity.
     * 
     * @param GeocodeStatus Gives the status of the provided SpatialPoint; this is normally
 * copied from the a Geocodable entity.
     */
    public void setGeocodeStatus(com.guidewire.ab.webservices.enumeration.GeocodeStatus GeocodeStatus) {
        this.GeocodeStatus = GeocodeStatus;
    }


    /**
     *  Indicates either the radius (in UnitOfDistance units) if a distance
 * based search, or the number of results to return if an ordinal search.
     * 
     * @return Number Indicates either the radius (in UnitOfDistance units) if a distance
 * based search, or the number of results to return if an ordinal search.
     */
    public java.lang.Integer getNumber() {
        return Number;
    }


    /**
     *  Indicates either the radius (in UnitOfDistance units) if a distance
 * based search, or the number of results to return if an ordinal search.
     * 
     * @param Number Indicates either the radius (in UnitOfDistance units) if a distance
 * based search, or the number of results to return if an ordinal search.
     */
    public void setNumber(java.lang.Integer Number) {
        this.Number = Number;
    }


    /**
     *  Indicates the maximum number of items to return on a radius search.
 * Ignored if DistanceBasedSearch is false; if DistanceBasedSearch is
 * true, and this value is null, zero, or negative, the search will be
 * limited by the value of ProximityRadiusSearchDefaultMaxResultCount
     * 
     * @return RadiusSearchMaxResults Indicates the maximum number of items to return on a radius search.
 * Ignored if DistanceBasedSearch is false; if DistanceBasedSearch is
 * true, and this value is null, zero, or negative, the search will be
 * limited by the value of ProximityRadiusSearchDefaultMaxResultCount
     */
    public java.lang.Integer getRadiusSearchMaxResults() {
        return RadiusSearchMaxResults;
    }


    /**
     *  Indicates the maximum number of items to return on a radius search.
 * Ignored if DistanceBasedSearch is false; if DistanceBasedSearch is
 * true, and this value is null, zero, or negative, the search will be
 * limited by the value of ProximityRadiusSearchDefaultMaxResultCount
     * 
     * @param RadiusSearchMaxResults Indicates the maximum number of items to return on a radius search.
 * Ignored if DistanceBasedSearch is false; if DistanceBasedSearch is
 * true, and this value is null, zero, or negative, the search will be
 * limited by the value of ProximityRadiusSearchDefaultMaxResultCount
     */
    public void setRadiusSearchMaxResults(java.lang.Integer RadiusSearchMaxResults) {
        this.RadiusSearchMaxResults = RadiusSearchMaxResults;
    }


    /**
     *  Used internally by ProximitySearchPageHelper to save the search
 * center address (if any) in standardized form; DO NOT USE unless you
 * are overriding the standard performProximitySearch() method.
     * 
     * @return SavedSearchCenter Used internally by ProximitySearchPageHelper to save the search
 * center address (if any) in standardized form; DO NOT USE unless you
 * are overriding the standard performProximitySearch() method.
     */
    public java.lang.String getSavedSearchCenter() {
        return SavedSearchCenter;
    }


    /**
     *  Used internally by ProximitySearchPageHelper to save the search
 * center address (if any) in standardized form; DO NOT USE unless you
 * are overriding the standard performProximitySearch() method.
     * 
     * @param SavedSearchCenter Used internally by ProximitySearchPageHelper to save the search
 * center address (if any) in standardized form; DO NOT USE unless you
 * are overriding the standard performProximitySearch() method.
     */
    public void setSavedSearchCenter(java.lang.String SavedSearchCenter) {
        this.SavedSearchCenter = SavedSearchCenter;
    }


    /**
     *  SpatialPoint to do a proximity search from; this is normally copied
 * from the a Geocodable entity.
     * 
     * @return SpatialPoint SpatialPoint to do a proximity search from; this is normally copied
 * from the a Geocodable entity.
     */
    public com.guidewire.ab.webservices.entity.SpatialPoint getSpatialPoint() {
        return SpatialPoint;
    }


    /**
     *  SpatialPoint to do a proximity search from; this is normally copied
 * from the a Geocodable entity.
     * 
     * @param SpatialPoint SpatialPoint to do a proximity search from; this is normally copied
 * from the a Geocodable entity.
     */
    public void setSpatialPoint(com.guidewire.ab.webservices.entity.SpatialPoint SpatialPoint) {
        this.SpatialPoint = SpatialPoint;
    }


    /**
     *  Indicates the UnitOfDistance to use, both to return distances in
 * results and to indicate the unit of radius for distance-based searches.
     * 
     * @return UnitOfDistance Indicates the UnitOfDistance to use, both to return distances in
 * results and to indicate the unit of radius for distance-based searches.
     */
    public com.guidewire.ab.webservices.enumeration.UnitOfDistance getUnitOfDistance() {
        return UnitOfDistance;
    }


    /**
     *  Indicates the UnitOfDistance to use, both to return distances in
 * results and to indicate the unit of radius for distance-based searches.
     * 
     * @param UnitOfDistance Indicates the UnitOfDistance to use, both to return distances in
 * results and to indicate the unit of radius for distance-based searches.
     */
    public void setUnitOfDistance(com.guidewire.ab.webservices.enumeration.UnitOfDistance UnitOfDistance) {
        this.UnitOfDistance = UnitOfDistance;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProximitySearchParameters.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ProximitySearchParameters"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beanVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BeanVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correctedSearchCenter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CorrectedSearchCenter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distanceBasedSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DistanceBasedSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
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
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiusSearchMaxResults");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RadiusSearchMaxResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("savedSearchCenter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SavedSearchCenter"));
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
        elemField.setFieldName("unitOfDistance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UnitOfDistance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "UnitOfDistance"));
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
