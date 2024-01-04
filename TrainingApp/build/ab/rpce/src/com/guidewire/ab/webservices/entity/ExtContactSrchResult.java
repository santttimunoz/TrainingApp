/**
 * ExtContactSrchResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * <p>
 *       Results of an external contact search ( <code>IContactSearchAdapter.searchContacts()</code>)
 * containing a set of
 *       contact summary objects. Not all resulting contacts may be returned.
 * If the matching results exceeds the maximum
 *       number of result rows, then only the system returns only the
 * first <i>n</i> contact summary objects.
 *       See <code>IContactSearchAdapter</code> for details about external
 * searches.</p>
 */
public class ExtContactSrchResult  extends com.guidewire.ab.webservices.entity.SearchResult  implements java.io.Serializable {
    /** 
        Set of contact summaries returned from the search. If no results
 * match the search criteria,
 * then this is empty (not null).
     */ 
    private com.guidewire.ab.webservices.entity.Contact[] Results;

    public ExtContactSrchResult() {
    }

    public ExtContactSrchResult(
           com.guidewire.ab.webservices.entity.Contact[] Results) {
           this.Results = Results;
    }


    /**
     *  Set of contact summaries returned from the search. If no results
 * match the search criteria,
 * then this is empty (not null).
     * 
     * @return Results Set of contact summaries returned from the search. If no results
 * match the search criteria,
 * then this is empty (not null).
     */
    public com.guidewire.ab.webservices.entity.Contact[] getResults() {
        return Results;
    }


    /**
     *  Set of contact summaries returned from the search. If no results
 * match the search criteria,
 * then this is empty (not null).
     * 
     * @param Results Set of contact summaries returned from the search. If no results
 * match the search criteria,
 * then this is empty (not null).
     */
    public void setResults(com.guidewire.ab.webservices.entity.Contact[] Results) {
        this.Results = Results;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExtContactSrchResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ExtContactSrchResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("results");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Results"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Contact"));
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
