/**
 * Document.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Internal representation of a physical or electronic document.
 */
public class Document  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Name of the person who created the document.
     */ 
    private java.lang.String Author;
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        Whether this document has content stored in a Document Management
 * System.
     */ 
    private java.lang.Boolean DMS;
    /** 
        Date and time the document was created.
     */ 
    private java.util.Calendar DateCreated;
    /** 
        Date and time the document was last modified.
     */ 
    private java.util.Calendar DateModified;
    /** 
        Description of the document.
     */ 
    private java.lang.String Description;
    /** 
        The Unique Identifier (UID) for this document.     The format of
 * this UID is specific to the deployed Document Management System (DMS),
 * and is passed to the configured IDocumentContentSource implementation.
     */ 
    private java.lang.String DocUID;
    /** 
        Short human-readable identifier for the document, often used as
 * an extra storage location for form codes, when name and documenttype
 * are inadequate.
     */ 
    private java.lang.String DocumentIdentifier;
    /** 
        Whether the document is an inbound, outbound, or stationary (null)
 * document
     */ 
    private java.lang.Boolean Inbound;
    /** 
        The language in which this document is created.
     */ 
    private com.guidewire.ab.webservices.enumeration.LanguageType Language;
    /** 
        The MIME type of this document; for example, application/msword
 * for a Microsoft Word document.
     */ 
    private java.lang.String MimeType;
    /** 
        Human-readable name of the document.
     */ 
    private java.lang.String Name;
    /** 
        If true, the information in the document can no longer be relied
 * upon to be up-to-date and relevant. This is often used instead of
 * deletion to preserve history.
     */ 
    private java.lang.Boolean Obsolete;
    /** 
        The document is pending, and it's pending storage has Unique Identifier
 * (UID).     The format of this UID is specific to the IDCS implementation.
     */ 
    private java.lang.String PendingDocUID;
    /** 
        Name of the intended recipient of the document (if any).
     */ 
    private java.lang.String Recipient;
    /** 
        The section to which this document belongs, if any.
     */ 
    private com.guidewire.ab.webservices.enumeration.DocumentSection Section;
    /** 
        Type of document used for access-restriction purposes, in conjunction
 * with the information in security-config.xml.
     */ 
    private com.guidewire.ab.webservices.enumeration.DocumentSecurityType SecurityType;
    /** 
        The current status of the document, if any.
     */ 
    private com.guidewire.ab.webservices.enumeration.DocumentStatusType Status;
    /** 
        The specific type of the document, if any.
     */ 
    private com.guidewire.ab.webservices.enumeration.DocumentType Type;

    public Document() {
    }

    public Document(
           java.lang.String Author,
           java.lang.Integer BeanVersion,
           java.lang.Boolean DMS,
           java.util.Calendar DateCreated,
           java.util.Calendar DateModified,
           java.lang.String Description,
           java.lang.String DocUID,
           java.lang.String DocumentIdentifier,
           java.lang.Boolean Inbound,
           com.guidewire.ab.webservices.enumeration.LanguageType Language,
           java.lang.String MimeType,
           java.lang.String Name,
           java.lang.Boolean Obsolete,
           java.lang.String PendingDocUID,
           java.lang.String Recipient,
           com.guidewire.ab.webservices.enumeration.DocumentSection Section,
           com.guidewire.ab.webservices.enumeration.DocumentSecurityType SecurityType,
           com.guidewire.ab.webservices.enumeration.DocumentStatusType Status,
           com.guidewire.ab.webservices.enumeration.DocumentType Type) {
           this.Author = Author;
           this.BeanVersion = BeanVersion;
           this.DMS = DMS;
           this.DateCreated = DateCreated;
           this.DateModified = DateModified;
           this.Description = Description;
           this.DocUID = DocUID;
           this.DocumentIdentifier = DocumentIdentifier;
           this.Inbound = Inbound;
           this.Language = Language;
           this.MimeType = MimeType;
           this.Name = Name;
           this.Obsolete = Obsolete;
           this.PendingDocUID = PendingDocUID;
           this.Recipient = Recipient;
           this.Section = Section;
           this.SecurityType = SecurityType;
           this.Status = Status;
           this.Type = Type;
    }


    /**
     *  Name of the person who created the document.
     * 
     * @return Author Name of the person who created the document.
     */
    public java.lang.String getAuthor() {
        return Author;
    }


    /**
     *  Name of the person who created the document.
     * 
     * @param Author Name of the person who created the document.
     */
    public void setAuthor(java.lang.String Author) {
        this.Author = Author;
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
     *  Whether this document has content stored in a Document Management
 * System.
     * 
     * @return DMS Whether this document has content stored in a Document Management
 * System.
     */
    public java.lang.Boolean getDMS() {
        return DMS;
    }


    /**
     *  Whether this document has content stored in a Document Management
 * System.
     * 
     * @param DMS Whether this document has content stored in a Document Management
 * System.
     */
    public void setDMS(java.lang.Boolean DMS) {
        this.DMS = DMS;
    }


    /**
     *  Date and time the document was created.
     * 
     * @return DateCreated Date and time the document was created.
     */
    public java.util.Calendar getDateCreated() {
        return DateCreated;
    }


    /**
     *  Date and time the document was created.
     * 
     * @param DateCreated Date and time the document was created.
     */
    public void setDateCreated(java.util.Calendar DateCreated) {
        this.DateCreated = DateCreated;
    }


    /**
     *  Date and time the document was last modified.
     * 
     * @return DateModified Date and time the document was last modified.
     */
    public java.util.Calendar getDateModified() {
        return DateModified;
    }


    /**
     *  Date and time the document was last modified.
     * 
     * @param DateModified Date and time the document was last modified.
     */
    public void setDateModified(java.util.Calendar DateModified) {
        this.DateModified = DateModified;
    }


    /**
     *  Description of the document.
     * 
     * @return Description Description of the document.
     */
    public java.lang.String getDescription() {
        return Description;
    }


    /**
     *  Description of the document.
     * 
     * @param Description Description of the document.
     */
    public void setDescription(java.lang.String Description) {
        this.Description = Description;
    }


    /**
     *  The Unique Identifier (UID) for this document.     The format of
 * this UID is specific to the deployed Document Management System (DMS),
 * and is passed to the configured IDocumentContentSource implementation.
     * 
     * @return DocUID The Unique Identifier (UID) for this document.     The format of
 * this UID is specific to the deployed Document Management System (DMS),
 * and is passed to the configured IDocumentContentSource implementation.
     */
    public java.lang.String getDocUID() {
        return DocUID;
    }


    /**
     *  The Unique Identifier (UID) for this document.     The format of
 * this UID is specific to the deployed Document Management System (DMS),
 * and is passed to the configured IDocumentContentSource implementation.
     * 
     * @param DocUID The Unique Identifier (UID) for this document.     The format of
 * this UID is specific to the deployed Document Management System (DMS),
 * and is passed to the configured IDocumentContentSource implementation.
     */
    public void setDocUID(java.lang.String DocUID) {
        this.DocUID = DocUID;
    }


    /**
     *  Short human-readable identifier for the document, often used as
 * an extra storage location for form codes, when name and documenttype
 * are inadequate.
     * 
     * @return DocumentIdentifier Short human-readable identifier for the document, often used as
 * an extra storage location for form codes, when name and documenttype
 * are inadequate.
     */
    public java.lang.String getDocumentIdentifier() {
        return DocumentIdentifier;
    }


    /**
     *  Short human-readable identifier for the document, often used as
 * an extra storage location for form codes, when name and documenttype
 * are inadequate.
     * 
     * @param DocumentIdentifier Short human-readable identifier for the document, often used as
 * an extra storage location for form codes, when name and documenttype
 * are inadequate.
     */
    public void setDocumentIdentifier(java.lang.String DocumentIdentifier) {
        this.DocumentIdentifier = DocumentIdentifier;
    }


    /**
     *  Whether the document is an inbound, outbound, or stationary (null)
 * document
     * 
     * @return Inbound Whether the document is an inbound, outbound, or stationary (null)
 * document
     */
    public java.lang.Boolean getInbound() {
        return Inbound;
    }


    /**
     *  Whether the document is an inbound, outbound, or stationary (null)
 * document
     * 
     * @param Inbound Whether the document is an inbound, outbound, or stationary (null)
 * document
     */
    public void setInbound(java.lang.Boolean Inbound) {
        this.Inbound = Inbound;
    }


    /**
     *  The language in which this document is created.
     * 
     * @return Language The language in which this document is created.
     */
    public com.guidewire.ab.webservices.enumeration.LanguageType getLanguage() {
        return Language;
    }


    /**
     *  The language in which this document is created.
     * 
     * @param Language The language in which this document is created.
     */
    public void setLanguage(com.guidewire.ab.webservices.enumeration.LanguageType Language) {
        this.Language = Language;
    }


    /**
     *  The MIME type of this document; for example, application/msword
 * for a Microsoft Word document.
     * 
     * @return MimeType The MIME type of this document; for example, application/msword
 * for a Microsoft Word document.
     */
    public java.lang.String getMimeType() {
        return MimeType;
    }


    /**
     *  The MIME type of this document; for example, application/msword
 * for a Microsoft Word document.
     * 
     * @param MimeType The MIME type of this document; for example, application/msword
 * for a Microsoft Word document.
     */
    public void setMimeType(java.lang.String MimeType) {
        this.MimeType = MimeType;
    }


    /**
     *  Human-readable name of the document.
     * 
     * @return Name Human-readable name of the document.
     */
    public java.lang.String getName() {
        return Name;
    }


    /**
     *  Human-readable name of the document.
     * 
     * @param Name Human-readable name of the document.
     */
    public void setName(java.lang.String Name) {
        this.Name = Name;
    }


    /**
     *  If true, the information in the document can no longer be relied
 * upon to be up-to-date and relevant. This is often used instead of
 * deletion to preserve history.
     * 
     * @return Obsolete If true, the information in the document can no longer be relied
 * upon to be up-to-date and relevant. This is often used instead of
 * deletion to preserve history.
     */
    public java.lang.Boolean getObsolete() {
        return Obsolete;
    }


    /**
     *  If true, the information in the document can no longer be relied
 * upon to be up-to-date and relevant. This is often used instead of
 * deletion to preserve history.
     * 
     * @param Obsolete If true, the information in the document can no longer be relied
 * upon to be up-to-date and relevant. This is often used instead of
 * deletion to preserve history.
     */
    public void setObsolete(java.lang.Boolean Obsolete) {
        this.Obsolete = Obsolete;
    }


    /**
     *  The document is pending, and it's pending storage has Unique Identifier
 * (UID).     The format of this UID is specific to the IDCS implementation.
     * 
     * @return PendingDocUID The document is pending, and it's pending storage has Unique Identifier
 * (UID).     The format of this UID is specific to the IDCS implementation.
     */
    public java.lang.String getPendingDocUID() {
        return PendingDocUID;
    }


    /**
     *  The document is pending, and it's pending storage has Unique Identifier
 * (UID).     The format of this UID is specific to the IDCS implementation.
     * 
     * @param PendingDocUID The document is pending, and it's pending storage has Unique Identifier
 * (UID).     The format of this UID is specific to the IDCS implementation.
     */
    public void setPendingDocUID(java.lang.String PendingDocUID) {
        this.PendingDocUID = PendingDocUID;
    }


    /**
     *  Name of the intended recipient of the document (if any).
     * 
     * @return Recipient Name of the intended recipient of the document (if any).
     */
    public java.lang.String getRecipient() {
        return Recipient;
    }


    /**
     *  Name of the intended recipient of the document (if any).
     * 
     * @param Recipient Name of the intended recipient of the document (if any).
     */
    public void setRecipient(java.lang.String Recipient) {
        this.Recipient = Recipient;
    }


    /**
     *  The section to which this document belongs, if any.
     * 
     * @return Section The section to which this document belongs, if any.
     */
    public com.guidewire.ab.webservices.enumeration.DocumentSection getSection() {
        return Section;
    }


    /**
     *  The section to which this document belongs, if any.
     * 
     * @param Section The section to which this document belongs, if any.
     */
    public void setSection(com.guidewire.ab.webservices.enumeration.DocumentSection Section) {
        this.Section = Section;
    }


    /**
     *  Type of document used for access-restriction purposes, in conjunction
 * with the information in security-config.xml.
     * 
     * @return SecurityType Type of document used for access-restriction purposes, in conjunction
 * with the information in security-config.xml.
     */
    public com.guidewire.ab.webservices.enumeration.DocumentSecurityType getSecurityType() {
        return SecurityType;
    }


    /**
     *  Type of document used for access-restriction purposes, in conjunction
 * with the information in security-config.xml.
     * 
     * @param SecurityType Type of document used for access-restriction purposes, in conjunction
 * with the information in security-config.xml.
     */
    public void setSecurityType(com.guidewire.ab.webservices.enumeration.DocumentSecurityType SecurityType) {
        this.SecurityType = SecurityType;
    }


    /**
     *  The current status of the document, if any.
     * 
     * @return Status The current status of the document, if any.
     */
    public com.guidewire.ab.webservices.enumeration.DocumentStatusType getStatus() {
        return Status;
    }


    /**
     *  The current status of the document, if any.
     * 
     * @param Status The current status of the document, if any.
     */
    public void setStatus(com.guidewire.ab.webservices.enumeration.DocumentStatusType Status) {
        this.Status = Status;
    }


    /**
     *  The specific type of the document, if any.
     * 
     * @return Type The specific type of the document, if any.
     */
    public com.guidewire.ab.webservices.enumeration.DocumentType getType() {
        return Type;
    }


    /**
     *  The specific type of the document, if any.
     * 
     * @param Type The specific type of the document, if any.
     */
    public void setType(com.guidewire.ab.webservices.enumeration.DocumentType Type) {
        this.Type = Type;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Document.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Document"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("author");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Author"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("DMS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DMS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DateCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateModified");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DateModified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("docUID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DocUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DocumentIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inbound");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Inbound"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "LanguageType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MimeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
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
        elemField.setFieldName("obsolete");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Obsolete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pendingDocUID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PendingDocUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipient");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Recipient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("section");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Section"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "DocumentSection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SecurityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "DocumentSecurityType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "DocumentStatusType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "DocumentType"));
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
