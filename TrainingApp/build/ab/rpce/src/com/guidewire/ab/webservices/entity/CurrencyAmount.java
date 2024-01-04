/**
 * CurrencyAmount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Represents a monetary amount with a currency.
 * <p/>
 * CurrencyAmounts can be used in two "modes". "Strict" CurrencyAmounts
 * require a currency, and further require that their amounts have a
 * scale appropriate for their currency. An attempt
 * to create a "strict" CurrencyAmount
 * ({@link #getStrict(java.math.BigDecimal, gw.pl.currency.typekey.Currency)}
 * either with a null currency,
 * or with a value that cannot be set to the currency scale without rounding,
 * will fail.
 * <p/>
 * "Non-strict" CurrencyAmounts can have any scale and have an optional
 * currency. This mode exists primarily for
 * backwards-compatibility. The methods that operate in "non-strict"
 * mode have been deprecated. In Gosu, mathematical
 * operators (e.g., <tt>+</tt>) can be used with CurrencyAmounts, and
 * CurrencyAmounts are interchangeable with
 * {@link java.math.BigDecimal}s. These operations all occur in "non-strict"
 * mode. That is, the results of these
 * operations should be considered "non-strict" CurrencyAmounts.
 * <p/>
 * This class contains many methods that exist on {@link java.math.BigDecimal},
 * in deprecated form. This is because
 * in prior versions, CurrencyAmount extended {@link java.math.BigDecimal}.
 * Now, it composes a
 * {@link java.math.BigDecimal} and a {@link gw.pl.currency.typekey.Currency}.
 */
public class CurrencyAmount  implements java.io.Serializable {
    /** 
        The BigDecimal amount of the CurrencyAmount. This property will
 * not return null.
     */ 
    private java.math.BigDecimal Amount;
    /** 
        The Currency typekey of this CurrencyAmount.
     */ 
    private com.guidewire.ab.webservices.enumeration.Currency Currency;

    public CurrencyAmount() {
    }

    public CurrencyAmount(
           java.math.BigDecimal Amount,
           com.guidewire.ab.webservices.enumeration.Currency Currency) {
           this.Amount = Amount;
           this.Currency = Currency;
    }


    /**
     *  The BigDecimal amount of the CurrencyAmount. This property will
 * not return null.
     * 
     * @return Amount The BigDecimal amount of the CurrencyAmount. This property will
 * not return null.
     */
    public java.math.BigDecimal getAmount() {
        return Amount;
    }


    /**
     *  The BigDecimal amount of the CurrencyAmount. This property will
 * not return null.
     * 
     * @param Amount The BigDecimal amount of the CurrencyAmount. This property will
 * not return null.
     */
    public void setAmount(java.math.BigDecimal Amount) {
        this.Amount = Amount;
    }


    /**
     *  The Currency typekey of this CurrencyAmount.
     * 
     * @return Currency The Currency typekey of this CurrencyAmount.
     */
    public com.guidewire.ab.webservices.enumeration.Currency getCurrency() {
        return Currency;
    }


    /**
     *  The Currency typekey of this CurrencyAmount.
     * 
     * @param Currency The Currency typekey of this CurrencyAmount.
     */
    public void setCurrency(com.guidewire.ab.webservices.enumeration.Currency Currency) {
        this.Currency = Currency;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CurrencyAmount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "CurrencyAmount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "Currency"));
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
