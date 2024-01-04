/**
 * AssignableQueue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * A queue of assignable entities. Entities can be assigned to a queue
 * (rather than a user) and
 *         any entity assigned to a queue is said to be "in the queue".
 * A queue belongs to a group
 *         and is typically used to organize items which can be handled
 * by any user in its group.
 *         When a user has time to tackle a new item they look at the
 * items in the queue and reassign
 *         the top item to themselves.
 */
public class AssignableQueue  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        The description of what this queue is for.
     */ 
    private java.lang.String Description;
    /** 
        The group to which the queue belongs.
     */ 
    private com.guidewire.ab.webservices.entity.Group Group;
    /** 
        The name of this queue.
     */ 
    private java.lang.String Name;
    /** 
        If true the queue is visible from sub-groups of the group to which
 * it belongs.
     */ 
    private java.lang.Boolean SubGroupVisible;

    public AssignableQueue() {
    }

    public AssignableQueue(
           java.lang.Integer BeanVersion,
           java.lang.String Description,
           com.guidewire.ab.webservices.entity.Group Group,
           java.lang.String Name,
           java.lang.Boolean SubGroupVisible) {
           this.BeanVersion = BeanVersion;
           this.Description = Description;
           this.Group = Group;
           this.Name = Name;
           this.SubGroupVisible = SubGroupVisible;
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
     *  The description of what this queue is for.
     * 
     * @return Description The description of what this queue is for.
     */
    public java.lang.String getDescription() {
        return Description;
    }


    /**
     *  The description of what this queue is for.
     * 
     * @param Description The description of what this queue is for.
     */
    public void setDescription(java.lang.String Description) {
        this.Description = Description;
    }


    /**
     *  The group to which the queue belongs.
     * 
     * @return Group The group to which the queue belongs.
     */
    public com.guidewire.ab.webservices.entity.Group getGroup() {
        return Group;
    }


    /**
     *  The group to which the queue belongs.
     * 
     * @param Group The group to which the queue belongs.
     */
    public void setGroup(com.guidewire.ab.webservices.entity.Group Group) {
        this.Group = Group;
    }


    /**
     *  The name of this queue.
     * 
     * @return Name The name of this queue.
     */
    public java.lang.String getName() {
        return Name;
    }


    /**
     *  The name of this queue.
     * 
     * @param Name The name of this queue.
     */
    public void setName(java.lang.String Name) {
        this.Name = Name;
    }


    /**
     *  If true the queue is visible from sub-groups of the group to which
 * it belongs.
     * 
     * @return SubGroupVisible If true the queue is visible from sub-groups of the group to which
 * it belongs.
     */
    public java.lang.Boolean getSubGroupVisible() {
        return SubGroupVisible;
    }


    /**
     *  If true the queue is visible from sub-groups of the group to which
 * it belongs.
     * 
     * @param SubGroupVisible If true the queue is visible from sub-groups of the group to which
 * it belongs.
     */
    public void setSubGroupVisible(java.lang.Boolean SubGroupVisible) {
        this.SubGroupVisible = SubGroupVisible;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AssignableQueue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "AssignableQueue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beanVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BeanVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
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
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Group"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("subGroupVisible");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubGroupVisible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
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
