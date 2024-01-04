/**
 * ObjectFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * An ObjectFilter, given a graph of objects, will extract a subgraph
 * of "interesting" objects.  It is designed to be
 * used in places such as webservices where returning a large graph of
 * objects may lead to performance problems.
 * <p/>
 * At a lower level, an ObjectFilter represents a set of rules which
 * are applied recursively to a object (which we will
 * call the "root object").  Each ObjectFilter consists of an array of
 * {@link FieldFilter} objects, and each {@link FieldFilter} object
 * defines a one-to-many relation from an entity name to a list of field
 * names. The graph described by a given
 * ObjectFilter and root object is calculated using the following algorithm:
 * <p/>
 * <ol> <li> Find the entity name for the current object.
 * <p/>
 * <li> Look through the ObjectFilter for a {@link FieldFilter} whose
 * entity name correponds to the entity name of the current
 * object.
 * <p/>
 * <li> If there is no such {@link FieldFilter}, set every property of
 * the current object to null. object.
 * <p/>
 * <li> Take the {@link FieldFilter} with the matching entity name (if
 * there is more than one such {@link FieldFilter}, choose one of
 * them arbitrarily)
 * <p/>
 * <li> Fetch the list of field names from the {@link FieldFilter}
 * <p/>
 * <li> Set each field on the current object to null <b>unless</b> the
 * field's name appears in the {@link FieldFilter}'s list of
 * field names.
 * <p/>
 * <li> Recursively apply this procedure to each object which is a property
 * of the current object. </ol>
 * <p/>
 * Applying this procedure to the root object yields the directed graph.
 * @deprecated The ObjectFilter class is deprecated. Instead, rewrite
 * integration code as custom web service APIs for
 * each integration point, defining most application logic within the
 * web service. Before this release, external code
 * requested large objects and used ObjectFilter to define arbitrary
 * fields to return so that the data transfer is not
 * too large. Instead, design your new custom web services to return
 * only what is needed. You might want to create new
 * Gosu classes or non-persistent business entities for some integration
 * points to encapsulate data passed to the
 * web service or returned from the web service.
 */
public class ObjectFilter  implements java.io.Serializable {
    /** 
        Returns an array containing the field filters for this ObjectFilter.
     */ 
    private com.guidewire.ab.webservices.entity.FieldFilter[] FieldFilters;

    public ObjectFilter() {
    }

    public ObjectFilter(
           com.guidewire.ab.webservices.entity.FieldFilter[] FieldFilters) {
           this.FieldFilters = FieldFilters;
    }


    /**
     *  Returns an array containing the field filters for this ObjectFilter.
     * 
     * @return FieldFilters Returns an array containing the field filters for this ObjectFilter.
     */
    public com.guidewire.ab.webservices.entity.FieldFilter[] getFieldFilters() {
        return FieldFilters;
    }


    /**
     *  Returns an array containing the field filters for this ObjectFilter.
     * 
     * @param FieldFilters Returns an array containing the field filters for this ObjectFilter.
     */
    public void setFieldFilters(com.guidewire.ab.webservices.entity.FieldFilter[] FieldFilters) {
        this.FieldFilters = FieldFilters;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObjectFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ObjectFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldFilters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FieldFilters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "FieldFilter"));
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
