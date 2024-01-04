/**
 * Group.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Groups of users.
 */
public class Group  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        Type of group (describes its function). NOTE: when inserting a
 * Group this field must be non-null.
     */ 
    private com.guidewire.ab.webservices.enumeration.GroupType GroupType;
    /** 
        Percentage value of normal workload to be given to this group.
 * This is used for round-robin assignment.
     */ 
    private java.lang.Integer LoadFactor;
    /** 
        The group name; this must be unique. NOTE: when inserting a Group
 * this field must be non-null.
     */ 
    private java.lang.String Name;
    /** 
        The group name in Kanji. Used only for Japanese and will be null
 * otherwise.
     */ 
    private java.lang.String NameKanji;
    /** 
        The Organization that this group belongs to.
     */ 
    private com.guidewire.ab.webservices.entity.Organization Organization;
    /** 
        The group's parent group. NOTE: value is the PublicId of the Group.
     */ 
    private java.lang.String Parent;
    /** 
        Security zone to which the group belongs. NOTE: value is the PublicId
 * of the SecurityZone.
     */ 
    private java.lang.String SecurityZone;
    /** 
        Supervisor of the group. NOTE: value is the PublicId of the User.
     */ 
    private java.lang.String Supervisor;
    /** 
        Group that defines the visibility zone for this group. A visibility
 * zone is defined by a direct child of the root group. The visibility
 * zone of the root group will always be null. NOTE: value is the PublicId
 * of the Group.
     */ 
    private java.lang.String VisibilityZone;
    /** 
        If true, this group is visible to all users, regardless of what
 * groups they belong to.
     */ 
    private java.lang.Boolean WorldVisible;

    public Group() {
    }

    public Group(
           java.lang.Integer BeanVersion,
           com.guidewire.ab.webservices.enumeration.GroupType GroupType,
           java.lang.Integer LoadFactor,
           java.lang.String Name,
           java.lang.String NameKanji,
           com.guidewire.ab.webservices.entity.Organization Organization,
           java.lang.String Parent,
           java.lang.String SecurityZone,
           java.lang.String Supervisor,
           java.lang.String VisibilityZone,
           java.lang.Boolean WorldVisible) {
           this.BeanVersion = BeanVersion;
           this.GroupType = GroupType;
           this.LoadFactor = LoadFactor;
           this.Name = Name;
           this.NameKanji = NameKanji;
           this.Organization = Organization;
           this.Parent = Parent;
           this.SecurityZone = SecurityZone;
           this.Supervisor = Supervisor;
           this.VisibilityZone = VisibilityZone;
           this.WorldVisible = WorldVisible;
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
     *  Type of group (describes its function). NOTE: when inserting a
 * Group this field must be non-null.
     * 
     * @return GroupType Type of group (describes its function). NOTE: when inserting a
 * Group this field must be non-null.
     */
    public com.guidewire.ab.webservices.enumeration.GroupType getGroupType() {
        return GroupType;
    }


    /**
     *  Type of group (describes its function). NOTE: when inserting a
 * Group this field must be non-null.
     * 
     * @param GroupType Type of group (describes its function). NOTE: when inserting a
 * Group this field must be non-null.
     */
    public void setGroupType(com.guidewire.ab.webservices.enumeration.GroupType GroupType) {
        this.GroupType = GroupType;
    }


    /**
     *  Percentage value of normal workload to be given to this group.
 * This is used for round-robin assignment.
     * 
     * @return LoadFactor Percentage value of normal workload to be given to this group.
 * This is used for round-robin assignment.
     */
    public java.lang.Integer getLoadFactor() {
        return LoadFactor;
    }


    /**
     *  Percentage value of normal workload to be given to this group.
 * This is used for round-robin assignment.
     * 
     * @param LoadFactor Percentage value of normal workload to be given to this group.
 * This is used for round-robin assignment.
     */
    public void setLoadFactor(java.lang.Integer LoadFactor) {
        this.LoadFactor = LoadFactor;
    }


    /**
     *  The group name; this must be unique. NOTE: when inserting a Group
 * this field must be non-null.
     * 
     * @return Name The group name; this must be unique. NOTE: when inserting a Group
 * this field must be non-null.
     */
    public java.lang.String getName() {
        return Name;
    }


    /**
     *  The group name; this must be unique. NOTE: when inserting a Group
 * this field must be non-null.
     * 
     * @param Name The group name; this must be unique. NOTE: when inserting a Group
 * this field must be non-null.
     */
    public void setName(java.lang.String Name) {
        this.Name = Name;
    }


    /**
     *  The group name in Kanji. Used only for Japanese and will be null
 * otherwise.
     * 
     * @return NameKanji The group name in Kanji. Used only for Japanese and will be null
 * otherwise.
     */
    public java.lang.String getNameKanji() {
        return NameKanji;
    }


    /**
     *  The group name in Kanji. Used only for Japanese and will be null
 * otherwise.
     * 
     * @param NameKanji The group name in Kanji. Used only for Japanese and will be null
 * otherwise.
     */
    public void setNameKanji(java.lang.String NameKanji) {
        this.NameKanji = NameKanji;
    }


    /**
     *  The Organization that this group belongs to.
     * 
     * @return Organization The Organization that this group belongs to.
     */
    public com.guidewire.ab.webservices.entity.Organization getOrganization() {
        return Organization;
    }


    /**
     *  The Organization that this group belongs to.
     * 
     * @param Organization The Organization that this group belongs to.
     */
    public void setOrganization(com.guidewire.ab.webservices.entity.Organization Organization) {
        this.Organization = Organization;
    }


    /**
     *  The group's parent group. NOTE: value is the PublicId of the Group.
     * 
     * @return Parent The group's parent group. NOTE: value is the PublicId of the Group.
     */
    public java.lang.String getParent() {
        return Parent;
    }


    /**
     *  The group's parent group. NOTE: value is the PublicId of the Group.
     * 
     * @param Parent The group's parent group. NOTE: value is the PublicId of the Group.
     */
    public void setParent(java.lang.String Parent) {
        this.Parent = Parent;
    }


    /**
     *  Security zone to which the group belongs. NOTE: value is the PublicId
 * of the SecurityZone.
     * 
     * @return SecurityZone Security zone to which the group belongs. NOTE: value is the PublicId
 * of the SecurityZone.
     */
    public java.lang.String getSecurityZone() {
        return SecurityZone;
    }


    /**
     *  Security zone to which the group belongs. NOTE: value is the PublicId
 * of the SecurityZone.
     * 
     * @param SecurityZone Security zone to which the group belongs. NOTE: value is the PublicId
 * of the SecurityZone.
     */
    public void setSecurityZone(java.lang.String SecurityZone) {
        this.SecurityZone = SecurityZone;
    }


    /**
     *  Supervisor of the group. NOTE: value is the PublicId of the User.
     * 
     * @return Supervisor Supervisor of the group. NOTE: value is the PublicId of the User.
     */
    public java.lang.String getSupervisor() {
        return Supervisor;
    }


    /**
     *  Supervisor of the group. NOTE: value is the PublicId of the User.
     * 
     * @param Supervisor Supervisor of the group. NOTE: value is the PublicId of the User.
     */
    public void setSupervisor(java.lang.String Supervisor) {
        this.Supervisor = Supervisor;
    }


    /**
     *  Group that defines the visibility zone for this group. A visibility
 * zone is defined by a direct child of the root group. The visibility
 * zone of the root group will always be null. NOTE: value is the PublicId
 * of the Group.
     * 
     * @return VisibilityZone Group that defines the visibility zone for this group. A visibility
 * zone is defined by a direct child of the root group. The visibility
 * zone of the root group will always be null. NOTE: value is the PublicId
 * of the Group.
     */
    public java.lang.String getVisibilityZone() {
        return VisibilityZone;
    }


    /**
     *  Group that defines the visibility zone for this group. A visibility
 * zone is defined by a direct child of the root group. The visibility
 * zone of the root group will always be null. NOTE: value is the PublicId
 * of the Group.
     * 
     * @param VisibilityZone Group that defines the visibility zone for this group. A visibility
 * zone is defined by a direct child of the root group. The visibility
 * zone of the root group will always be null. NOTE: value is the PublicId
 * of the Group.
     */
    public void setVisibilityZone(java.lang.String VisibilityZone) {
        this.VisibilityZone = VisibilityZone;
    }


    /**
     *  If true, this group is visible to all users, regardless of what
 * groups they belong to.
     * 
     * @return WorldVisible If true, this group is visible to all users, regardless of what
 * groups they belong to.
     */
    public java.lang.Boolean getWorldVisible() {
        return WorldVisible;
    }


    /**
     *  If true, this group is visible to all users, regardless of what
 * groups they belong to.
     * 
     * @param WorldVisible If true, this group is visible to all users, regardless of what
 * groups they belong to.
     */
    public void setWorldVisible(java.lang.Boolean WorldVisible) {
        this.WorldVisible = WorldVisible;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Group.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Group"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beanVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BeanVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GroupType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "GroupType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loadFactor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LoadFactor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("organization");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Organization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Organization"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityZone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SecurityZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supervisor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Supervisor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visibilityZone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VisibilityZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("worldVisible");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WorldVisible"));
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
