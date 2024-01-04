/**
 * ActivityPattern.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * An activity pattern is a template for an activity. An activity
 * pattern is not assigned to a user, nor does it belong to a claim;
 * it is used only to create new activity instances. To create a new
 * activity, an activity pattern is first chosen, and the values in the
 * activity pattern are used to seed the values of the new activity instance.
 */
public class ActivityPattern  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        The class of the activity.
     */ 
    private com.guidewire.ab.webservices.enumeration.ActivityClass ActivityClass;
    /** 
        True if the activity pattern is used only by automated additions
 * to the workplan. If true, the pattern won't be shown as an option
 * for users to choose in the application's interface.
     */ 
    private java.lang.Boolean AutomatedOnly;
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        Category used to organize the activity pattern.
     */ 
    private com.guidewire.ab.webservices.enumeration.ActivityCategory Category;
    /** 
        The concise name of the activity pattern, used to identify the
 * pattern within rules.
     */ 
    private java.lang.String Code;
    /** 
        A Gosu command to execute for this activity.
     */ 
    private java.lang.String Command;
    /** 
        Description of the activity pattern.
     */ 
    private java.lang.String Description;
    /** 
        The id of an associated document template. The id gets passed to
 * IDocumentTemplateSource to retrieve the DocumentTemplateDescriptor.
     */ 
    private java.lang.String DocumentTemplate;
    /** 
        The id of an associated email template. The id gets passed to IEmailTemplateSource
 * to retrieve the EmailTemplateDescriptor.
     */ 
    private java.lang.String EmailTemplate;
    /** 
        Location bean path to use for business calendar in calculating
 * EscalationDate, if applicable.
     */ 
    private java.lang.String EscBusCalLocPath;
    /** 
        Holiday tag code to use for business calendar in calculating EscalationDate,
 * if applicable.
     */ 
    private com.guidewire.ab.webservices.enumeration.HolidayTagCode EscalationBusCalTag;
    /** 
        Used in conjunction with EscalationStartPoint and EscalationIncludedDays
 * to calculate the EscalationDate of the activity.
     */ 
    private java.lang.Integer EscalationDays;
    /** 
        Used in conjunction with EscalationStartPoint and EscalationIncludedDays
 * to calculate the EscalationDate of the activity.
     */ 
    private java.lang.Integer EscalationHours;
    /** 
        Which days to include in calculating the EscalationDate.
     */ 
    private com.guidewire.ab.webservices.enumeration.IncludeDaysType EscalationInclDays;
    /** 
        Which existing date on the activity or associated claim to use
 * as the starting date for the EscalationDate.
     */ 
    private com.guidewire.ab.webservices.enumeration.StartPointType EscalationStartPt;
    /** 
        Whether completion of the activity is mandatory.
     */ 
    private java.lang.Boolean Mandatory;
    /** 
        Priority of the activity with respect to other activities.
     */ 
    private com.guidewire.ab.webservices.enumeration.Priority Priority;
    /** 
        Whether this activity is recurring.
     */ 
    private java.lang.Boolean Recurring;
    /** 
        Short subject field of the activity. For use in small areas e.g.,
 * a calendar event entry.
     */ 
    private java.lang.String ShortSubject;
    /** 
        Subject field of the activity.
     */ 
    private java.lang.String Subject;
    /** 
        Location bean path to use for business calendar in calculating
 * TargetDate, if applicable.
     */ 
    private java.lang.String TargetBusCalLocPath;
    /** 
        Holiday tag code to use for business calendar in calculating TargetDate,
 * if applicable.
     */ 
    private com.guidewire.ab.webservices.enumeration.HolidayTagCode TargetBusCalTag;
    /** 
        Used in conjunction with TargetStartPoint and TargetIncludedDays
 * to calculate the ActionDate of the activity.
     */ 
    private java.lang.Integer TargetDays;
    /** 
        Used in conjunction with TargetStartPoint and TargetIncludedDays
 * to calculate the ActionDate of the activity.
     */ 
    private java.lang.Integer TargetHours;
    /** 
        Which days to include in calculating the TargetDate.
     */ 
    private com.guidewire.ab.webservices.enumeration.IncludeDaysType TargetIncludeDays;
    /** 
        Which existing date on the activity or associated claim to use
 * as the starting date for the TargetDate.
     */ 
    private com.guidewire.ab.webservices.enumeration.StartPointType TargetStartPoint;
    /** 
        Type of the activity.
     */ 
    private com.guidewire.ab.webservices.enumeration.ActivityType Type;

    public ActivityPattern() {
    }

    public ActivityPattern(
           com.guidewire.ab.webservices.enumeration.ActivityClass ActivityClass,
           java.lang.Boolean AutomatedOnly,
           java.lang.Integer BeanVersion,
           com.guidewire.ab.webservices.enumeration.ActivityCategory Category,
           java.lang.String Code,
           java.lang.String Command,
           java.lang.String Description,
           java.lang.String DocumentTemplate,
           java.lang.String EmailTemplate,
           java.lang.String EscBusCalLocPath,
           com.guidewire.ab.webservices.enumeration.HolidayTagCode EscalationBusCalTag,
           java.lang.Integer EscalationDays,
           java.lang.Integer EscalationHours,
           com.guidewire.ab.webservices.enumeration.IncludeDaysType EscalationInclDays,
           com.guidewire.ab.webservices.enumeration.StartPointType EscalationStartPt,
           java.lang.Boolean Mandatory,
           com.guidewire.ab.webservices.enumeration.Priority Priority,
           java.lang.Boolean Recurring,
           java.lang.String ShortSubject,
           java.lang.String Subject,
           java.lang.String TargetBusCalLocPath,
           com.guidewire.ab.webservices.enumeration.HolidayTagCode TargetBusCalTag,
           java.lang.Integer TargetDays,
           java.lang.Integer TargetHours,
           com.guidewire.ab.webservices.enumeration.IncludeDaysType TargetIncludeDays,
           com.guidewire.ab.webservices.enumeration.StartPointType TargetStartPoint,
           com.guidewire.ab.webservices.enumeration.ActivityType Type) {
           this.ActivityClass = ActivityClass;
           this.AutomatedOnly = AutomatedOnly;
           this.BeanVersion = BeanVersion;
           this.Category = Category;
           this.Code = Code;
           this.Command = Command;
           this.Description = Description;
           this.DocumentTemplate = DocumentTemplate;
           this.EmailTemplate = EmailTemplate;
           this.EscBusCalLocPath = EscBusCalLocPath;
           this.EscalationBusCalTag = EscalationBusCalTag;
           this.EscalationDays = EscalationDays;
           this.EscalationHours = EscalationHours;
           this.EscalationInclDays = EscalationInclDays;
           this.EscalationStartPt = EscalationStartPt;
           this.Mandatory = Mandatory;
           this.Priority = Priority;
           this.Recurring = Recurring;
           this.ShortSubject = ShortSubject;
           this.Subject = Subject;
           this.TargetBusCalLocPath = TargetBusCalLocPath;
           this.TargetBusCalTag = TargetBusCalTag;
           this.TargetDays = TargetDays;
           this.TargetHours = TargetHours;
           this.TargetIncludeDays = TargetIncludeDays;
           this.TargetStartPoint = TargetStartPoint;
           this.Type = Type;
    }


    /**
     *  The class of the activity.
     * 
     * @return ActivityClass The class of the activity.
     */
    public com.guidewire.ab.webservices.enumeration.ActivityClass getActivityClass() {
        return ActivityClass;
    }


    /**
     *  The class of the activity.
     * 
     * @param ActivityClass The class of the activity.
     */
    public void setActivityClass(com.guidewire.ab.webservices.enumeration.ActivityClass ActivityClass) {
        this.ActivityClass = ActivityClass;
    }


    /**
     *  True if the activity pattern is used only by automated additions
 * to the workplan. If true, the pattern won't be shown as an option
 * for users to choose in the application's interface.
     * 
     * @return AutomatedOnly True if the activity pattern is used only by automated additions
 * to the workplan. If true, the pattern won't be shown as an option
 * for users to choose in the application's interface.
     */
    public java.lang.Boolean getAutomatedOnly() {
        return AutomatedOnly;
    }


    /**
     *  True if the activity pattern is used only by automated additions
 * to the workplan. If true, the pattern won't be shown as an option
 * for users to choose in the application's interface.
     * 
     * @param AutomatedOnly True if the activity pattern is used only by automated additions
 * to the workplan. If true, the pattern won't be shown as an option
 * for users to choose in the application's interface.
     */
    public void setAutomatedOnly(java.lang.Boolean AutomatedOnly) {
        this.AutomatedOnly = AutomatedOnly;
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
     *  Category used to organize the activity pattern.
     * 
     * @return Category Category used to organize the activity pattern.
     */
    public com.guidewire.ab.webservices.enumeration.ActivityCategory getCategory() {
        return Category;
    }


    /**
     *  Category used to organize the activity pattern.
     * 
     * @param Category Category used to organize the activity pattern.
     */
    public void setCategory(com.guidewire.ab.webservices.enumeration.ActivityCategory Category) {
        this.Category = Category;
    }


    /**
     *  The concise name of the activity pattern, used to identify the
 * pattern within rules.
     * 
     * @return Code The concise name of the activity pattern, used to identify the
 * pattern within rules.
     */
    public java.lang.String getCode() {
        return Code;
    }


    /**
     *  The concise name of the activity pattern, used to identify the
 * pattern within rules.
     * 
     * @param Code The concise name of the activity pattern, used to identify the
 * pattern within rules.
     */
    public void setCode(java.lang.String Code) {
        this.Code = Code;
    }


    /**
     *  A Gosu command to execute for this activity.
     * 
     * @return Command A Gosu command to execute for this activity.
     */
    public java.lang.String getCommand() {
        return Command;
    }


    /**
     *  A Gosu command to execute for this activity.
     * 
     * @param Command A Gosu command to execute for this activity.
     */
    public void setCommand(java.lang.String Command) {
        this.Command = Command;
    }


    /**
     *  Description of the activity pattern.
     * 
     * @return Description Description of the activity pattern.
     */
    public java.lang.String getDescription() {
        return Description;
    }


    /**
     *  Description of the activity pattern.
     * 
     * @param Description Description of the activity pattern.
     */
    public void setDescription(java.lang.String Description) {
        this.Description = Description;
    }


    /**
     *  The id of an associated document template. The id gets passed to
 * IDocumentTemplateSource to retrieve the DocumentTemplateDescriptor.
     * 
     * @return DocumentTemplate The id of an associated document template. The id gets passed to
 * IDocumentTemplateSource to retrieve the DocumentTemplateDescriptor.
     */
    public java.lang.String getDocumentTemplate() {
        return DocumentTemplate;
    }


    /**
     *  The id of an associated document template. The id gets passed to
 * IDocumentTemplateSource to retrieve the DocumentTemplateDescriptor.
     * 
     * @param DocumentTemplate The id of an associated document template. The id gets passed to
 * IDocumentTemplateSource to retrieve the DocumentTemplateDescriptor.
     */
    public void setDocumentTemplate(java.lang.String DocumentTemplate) {
        this.DocumentTemplate = DocumentTemplate;
    }


    /**
     *  The id of an associated email template. The id gets passed to IEmailTemplateSource
 * to retrieve the EmailTemplateDescriptor.
     * 
     * @return EmailTemplate The id of an associated email template. The id gets passed to IEmailTemplateSource
 * to retrieve the EmailTemplateDescriptor.
     */
    public java.lang.String getEmailTemplate() {
        return EmailTemplate;
    }


    /**
     *  The id of an associated email template. The id gets passed to IEmailTemplateSource
 * to retrieve the EmailTemplateDescriptor.
     * 
     * @param EmailTemplate The id of an associated email template. The id gets passed to IEmailTemplateSource
 * to retrieve the EmailTemplateDescriptor.
     */
    public void setEmailTemplate(java.lang.String EmailTemplate) {
        this.EmailTemplate = EmailTemplate;
    }


    /**
     *  Location bean path to use for business calendar in calculating
 * EscalationDate, if applicable.
     * 
     * @return EscBusCalLocPath Location bean path to use for business calendar in calculating
 * EscalationDate, if applicable.
     */
    public java.lang.String getEscBusCalLocPath() {
        return EscBusCalLocPath;
    }


    /**
     *  Location bean path to use for business calendar in calculating
 * EscalationDate, if applicable.
     * 
     * @param EscBusCalLocPath Location bean path to use for business calendar in calculating
 * EscalationDate, if applicable.
     */
    public void setEscBusCalLocPath(java.lang.String EscBusCalLocPath) {
        this.EscBusCalLocPath = EscBusCalLocPath;
    }


    /**
     *  Holiday tag code to use for business calendar in calculating EscalationDate,
 * if applicable.
     * 
     * @return EscalationBusCalTag Holiday tag code to use for business calendar in calculating EscalationDate,
 * if applicable.
     */
    public com.guidewire.ab.webservices.enumeration.HolidayTagCode getEscalationBusCalTag() {
        return EscalationBusCalTag;
    }


    /**
     *  Holiday tag code to use for business calendar in calculating EscalationDate,
 * if applicable.
     * 
     * @param EscalationBusCalTag Holiday tag code to use for business calendar in calculating EscalationDate,
 * if applicable.
     */
    public void setEscalationBusCalTag(com.guidewire.ab.webservices.enumeration.HolidayTagCode EscalationBusCalTag) {
        this.EscalationBusCalTag = EscalationBusCalTag;
    }


    /**
     *  Used in conjunction with EscalationStartPoint and EscalationIncludedDays
 * to calculate the EscalationDate of the activity.
     * 
     * @return EscalationDays Used in conjunction with EscalationStartPoint and EscalationIncludedDays
 * to calculate the EscalationDate of the activity.
     */
    public java.lang.Integer getEscalationDays() {
        return EscalationDays;
    }


    /**
     *  Used in conjunction with EscalationStartPoint and EscalationIncludedDays
 * to calculate the EscalationDate of the activity.
     * 
     * @param EscalationDays Used in conjunction with EscalationStartPoint and EscalationIncludedDays
 * to calculate the EscalationDate of the activity.
     */
    public void setEscalationDays(java.lang.Integer EscalationDays) {
        this.EscalationDays = EscalationDays;
    }


    /**
     *  Used in conjunction with EscalationStartPoint and EscalationIncludedDays
 * to calculate the EscalationDate of the activity.
     * 
     * @return EscalationHours Used in conjunction with EscalationStartPoint and EscalationIncludedDays
 * to calculate the EscalationDate of the activity.
     */
    public java.lang.Integer getEscalationHours() {
        return EscalationHours;
    }


    /**
     *  Used in conjunction with EscalationStartPoint and EscalationIncludedDays
 * to calculate the EscalationDate of the activity.
     * 
     * @param EscalationHours Used in conjunction with EscalationStartPoint and EscalationIncludedDays
 * to calculate the EscalationDate of the activity.
     */
    public void setEscalationHours(java.lang.Integer EscalationHours) {
        this.EscalationHours = EscalationHours;
    }


    /**
     *  Which days to include in calculating the EscalationDate.
     * 
     * @return EscalationInclDays Which days to include in calculating the EscalationDate.
     */
    public com.guidewire.ab.webservices.enumeration.IncludeDaysType getEscalationInclDays() {
        return EscalationInclDays;
    }


    /**
     *  Which days to include in calculating the EscalationDate.
     * 
     * @param EscalationInclDays Which days to include in calculating the EscalationDate.
     */
    public void setEscalationInclDays(com.guidewire.ab.webservices.enumeration.IncludeDaysType EscalationInclDays) {
        this.EscalationInclDays = EscalationInclDays;
    }


    /**
     *  Which existing date on the activity or associated claim to use
 * as the starting date for the EscalationDate.
     * 
     * @return EscalationStartPt Which existing date on the activity or associated claim to use
 * as the starting date for the EscalationDate.
     */
    public com.guidewire.ab.webservices.enumeration.StartPointType getEscalationStartPt() {
        return EscalationStartPt;
    }


    /**
     *  Which existing date on the activity or associated claim to use
 * as the starting date for the EscalationDate.
     * 
     * @param EscalationStartPt Which existing date on the activity or associated claim to use
 * as the starting date for the EscalationDate.
     */
    public void setEscalationStartPt(com.guidewire.ab.webservices.enumeration.StartPointType EscalationStartPt) {
        this.EscalationStartPt = EscalationStartPt;
    }


    /**
     *  Whether completion of the activity is mandatory.
     * 
     * @return Mandatory Whether completion of the activity is mandatory.
     */
    public java.lang.Boolean getMandatory() {
        return Mandatory;
    }


    /**
     *  Whether completion of the activity is mandatory.
     * 
     * @param Mandatory Whether completion of the activity is mandatory.
     */
    public void setMandatory(java.lang.Boolean Mandatory) {
        this.Mandatory = Mandatory;
    }


    /**
     *  Priority of the activity with respect to other activities.
     * 
     * @return Priority Priority of the activity with respect to other activities.
     */
    public com.guidewire.ab.webservices.enumeration.Priority getPriority() {
        return Priority;
    }


    /**
     *  Priority of the activity with respect to other activities.
     * 
     * @param Priority Priority of the activity with respect to other activities.
     */
    public void setPriority(com.guidewire.ab.webservices.enumeration.Priority Priority) {
        this.Priority = Priority;
    }


    /**
     *  Whether this activity is recurring.
     * 
     * @return Recurring Whether this activity is recurring.
     */
    public java.lang.Boolean getRecurring() {
        return Recurring;
    }


    /**
     *  Whether this activity is recurring.
     * 
     * @param Recurring Whether this activity is recurring.
     */
    public void setRecurring(java.lang.Boolean Recurring) {
        this.Recurring = Recurring;
    }


    /**
     *  Short subject field of the activity. For use in small areas e.g.,
 * a calendar event entry.
     * 
     * @return ShortSubject Short subject field of the activity. For use in small areas e.g.,
 * a calendar event entry.
     */
    public java.lang.String getShortSubject() {
        return ShortSubject;
    }


    /**
     *  Short subject field of the activity. For use in small areas e.g.,
 * a calendar event entry.
     * 
     * @param ShortSubject Short subject field of the activity. For use in small areas e.g.,
 * a calendar event entry.
     */
    public void setShortSubject(java.lang.String ShortSubject) {
        this.ShortSubject = ShortSubject;
    }


    /**
     *  Subject field of the activity.
     * 
     * @return Subject Subject field of the activity.
     */
    public java.lang.String getSubject() {
        return Subject;
    }


    /**
     *  Subject field of the activity.
     * 
     * @param Subject Subject field of the activity.
     */
    public void setSubject(java.lang.String Subject) {
        this.Subject = Subject;
    }


    /**
     *  Location bean path to use for business calendar in calculating
 * TargetDate, if applicable.
     * 
     * @return TargetBusCalLocPath Location bean path to use for business calendar in calculating
 * TargetDate, if applicable.
     */
    public java.lang.String getTargetBusCalLocPath() {
        return TargetBusCalLocPath;
    }


    /**
     *  Location bean path to use for business calendar in calculating
 * TargetDate, if applicable.
     * 
     * @param TargetBusCalLocPath Location bean path to use for business calendar in calculating
 * TargetDate, if applicable.
     */
    public void setTargetBusCalLocPath(java.lang.String TargetBusCalLocPath) {
        this.TargetBusCalLocPath = TargetBusCalLocPath;
    }


    /**
     *  Holiday tag code to use for business calendar in calculating TargetDate,
 * if applicable.
     * 
     * @return TargetBusCalTag Holiday tag code to use for business calendar in calculating TargetDate,
 * if applicable.
     */
    public com.guidewire.ab.webservices.enumeration.HolidayTagCode getTargetBusCalTag() {
        return TargetBusCalTag;
    }


    /**
     *  Holiday tag code to use for business calendar in calculating TargetDate,
 * if applicable.
     * 
     * @param TargetBusCalTag Holiday tag code to use for business calendar in calculating TargetDate,
 * if applicable.
     */
    public void setTargetBusCalTag(com.guidewire.ab.webservices.enumeration.HolidayTagCode TargetBusCalTag) {
        this.TargetBusCalTag = TargetBusCalTag;
    }


    /**
     *  Used in conjunction with TargetStartPoint and TargetIncludedDays
 * to calculate the ActionDate of the activity.
     * 
     * @return TargetDays Used in conjunction with TargetStartPoint and TargetIncludedDays
 * to calculate the ActionDate of the activity.
     */
    public java.lang.Integer getTargetDays() {
        return TargetDays;
    }


    /**
     *  Used in conjunction with TargetStartPoint and TargetIncludedDays
 * to calculate the ActionDate of the activity.
     * 
     * @param TargetDays Used in conjunction with TargetStartPoint and TargetIncludedDays
 * to calculate the ActionDate of the activity.
     */
    public void setTargetDays(java.lang.Integer TargetDays) {
        this.TargetDays = TargetDays;
    }


    /**
     *  Used in conjunction with TargetStartPoint and TargetIncludedDays
 * to calculate the ActionDate of the activity.
     * 
     * @return TargetHours Used in conjunction with TargetStartPoint and TargetIncludedDays
 * to calculate the ActionDate of the activity.
     */
    public java.lang.Integer getTargetHours() {
        return TargetHours;
    }


    /**
     *  Used in conjunction with TargetStartPoint and TargetIncludedDays
 * to calculate the ActionDate of the activity.
     * 
     * @param TargetHours Used in conjunction with TargetStartPoint and TargetIncludedDays
 * to calculate the ActionDate of the activity.
     */
    public void setTargetHours(java.lang.Integer TargetHours) {
        this.TargetHours = TargetHours;
    }


    /**
     *  Which days to include in calculating the TargetDate.
     * 
     * @return TargetIncludeDays Which days to include in calculating the TargetDate.
     */
    public com.guidewire.ab.webservices.enumeration.IncludeDaysType getTargetIncludeDays() {
        return TargetIncludeDays;
    }


    /**
     *  Which days to include in calculating the TargetDate.
     * 
     * @param TargetIncludeDays Which days to include in calculating the TargetDate.
     */
    public void setTargetIncludeDays(com.guidewire.ab.webservices.enumeration.IncludeDaysType TargetIncludeDays) {
        this.TargetIncludeDays = TargetIncludeDays;
    }


    /**
     *  Which existing date on the activity or associated claim to use
 * as the starting date for the TargetDate.
     * 
     * @return TargetStartPoint Which existing date on the activity or associated claim to use
 * as the starting date for the TargetDate.
     */
    public com.guidewire.ab.webservices.enumeration.StartPointType getTargetStartPoint() {
        return TargetStartPoint;
    }


    /**
     *  Which existing date on the activity or associated claim to use
 * as the starting date for the TargetDate.
     * 
     * @param TargetStartPoint Which existing date on the activity or associated claim to use
 * as the starting date for the TargetDate.
     */
    public void setTargetStartPoint(com.guidewire.ab.webservices.enumeration.StartPointType TargetStartPoint) {
        this.TargetStartPoint = TargetStartPoint;
    }


    /**
     *  Type of the activity.
     * 
     * @return Type Type of the activity.
     */
    public com.guidewire.ab.webservices.enumeration.ActivityType getType() {
        return Type;
    }


    /**
     *  Type of the activity.
     * 
     * @param Type Type of the activity.
     */
    public void setType(com.guidewire.ab.webservices.enumeration.ActivityType Type) {
        this.Type = Type;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ActivityPattern.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ActivityPattern"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityClass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ActivityClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ActivityClass"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("automatedOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AutomatedOnly"));
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
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ActivityCategory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("command");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Command"));
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
        elemField.setFieldName("documentTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DocumentTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EmailTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escBusCalLocPath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EscBusCalLocPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalationBusCalTag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EscalationBusCalTag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "HolidayTagCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalationDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EscalationDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalationHours");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EscalationHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalationInclDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EscalationInclDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "IncludeDaysType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalationStartPt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EscalationStartPt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "StartPointType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mandatory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Mandatory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "Priority"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurring");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Recurring"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shortSubject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ShortSubject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetBusCalLocPath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TargetBusCalLocPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetBusCalTag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TargetBusCalTag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "HolidayTagCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TargetDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetHours");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TargetHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetIncludeDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TargetIncludeDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "IncludeDaysType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetStartPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TargetStartPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "StartPointType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ActivityType"));
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
