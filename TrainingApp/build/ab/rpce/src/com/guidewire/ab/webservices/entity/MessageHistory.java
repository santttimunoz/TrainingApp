/**
 * MessageHistory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Completed messages.
 */
public class MessageHistory  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Associated ABContact, if applicable.
     */ 
    private com.guidewire.ab.webservices.entity.ABContact ABContact;
    /** 
        Custom field that may be defined when acknowledging.  This field
 * is deprecated, please define a new custom extension field instead.
 * @deprecated Custom field that may be defined when acknowledging. 
 * This field is deprecated, please define a new custom extension field
 * instead.
     */ 
    private java.lang.String AckCode;
    /** 
        Number of acks received. NOTE: when inserting a MessageHistory
 * this field must be non-null.
     */ 
    private java.lang.Integer AckCount;
    /** 
        Time of ack.
     */ 
    private java.util.Calendar AckedTime;
    /** 
        Time of completion of afterSend method.
     */ 
    private java.util.Calendar AfterSendTime;
    /** 
        Time of attempting to get lock before the call to beforeSend transformations.
     */ 
    private java.util.Calendar BeforeSendLockTime;
    /** 
        Time of after acquired lock before the call to beforeSend transformations.
     */ 
    private java.util.Calendar BeforeSendLockedTime;
    /** 
        Time of completion of beforeSend transformations.
     */ 
    private java.util.Calendar BeforeSendTime;
    /** 
        Time of creating the message. NOTE: when inserting a MessageHistory
 * this field must be non-null.
     */ 
    private java.util.Calendar CreationTime;
    /** 
        Short description of the message.
     */ 
    private java.lang.String Description;
    /** 
        Identifies the message destination to send this message to. NOTE:
 * when inserting a MessageHistory this field must be non-null.
     */ 
    private java.lang.Integer DestinationID;
    /** 
        Number of duplicate errors received.
     */ 
    private java.lang.Integer DuplicateCount;
    /** 
        Type of error if the message is in error.
     */ 
    private com.guidewire.ab.webservices.enumeration.ErrorCategory ErrorCategory;
    /** 
        Detailed description of error condition (set in the message destination).
     */ 
    private java.lang.String ErrorDescription;
    /** 
        Name of the event. NOTE: when inserting a MessageHistory this field
 * must be non-null.
     */ 
    private java.lang.String EventName;
    /** 
        Key of event root/cause, encoded as type:id.
     */ 
    private java.lang.String EventRootKey;
    /** 
        A CSV representation of the key->object ID map.
     */ 
    private java.lang.String KeyMap;
    /** 
        Whether the payload contains late-bound fields.  This field is
 * obsolete and no longer set/used.
 * @deprecated Whether the payload contains late-bound fields.  This
 * field is obsolete and no longer set/used.
     */ 
    private java.lang.Boolean LateBound;
    /** 
        Custom field that may be defined during message creation.  This
 * field is deprecated, please define a new custom extension field instead.
 * @deprecated Custom field that may be defined during message creation.
 * This field is deprecated, please define a new custom extension field
 * instead.
     */ 
    private java.lang.String MessageCode;
    /** 
        Key of template root object, encoded as type:id.
     */ 
    private java.lang.String ObjectKey;
    /** 
        Custom field that may be set at message creation time.  This field
 * is deprecated, please define a new custom extension field instead.
 * @deprecated Custom field that may be set at message creation time.
 * This field is deprecated, please define a new custom extension field
 * instead.
     */ 
    private java.lang.Integer OptionalInt;
    /** 
        Custom field that may be set at message creation time.  This field
 * is deprecated, please define a new custom extension field instead.
 * @deprecated Custom field that may be set at message creation time.
 * This field is deprecated, please define a new custom extension field
 * instead.
     */ 
    private java.math.BigDecimal OptionalMoney;
    /** 
        Custom field that may be set at message creation time.  This field
 * is deprecated, please define a new custom extension field instead.
 * @deprecated Custom field that may be set at message creation time.
 * This field is deprecated, please define a new custom extension field
 * instead.
     */ 
    private java.lang.String OptionalString;
    /** 
        Identifies the id of the original message. NOTE: when inserting
 * a MessageHistory this field must be non-null.
     */ 
    private java.lang.Long OrigMsgId;
    /** 
        Contents of the message.
     */ 
    private java.lang.String Payload;
    /** 
        Time of of query selecting message to be processed.
     */ 
    private java.util.Calendar QueryTime;
    /** 
        Number of times message has been retried.
     */ 
    private java.lang.Integer RetryCount;
    /** 
        Time in the future at which to retry the message in error, applicable
 * only to retryable error messages.
     */ 
    private java.util.Calendar RetryTime;
    /** 
        Time of attempting to lock before the sending the message.
     */ 
    private java.util.Calendar SendLockTime;
    /** 
        Time of after acquired lock lock before the sending the message.
     */ 
    private java.util.Calendar SendLockedTime;
    /** 
        Order in which to send messages. NOTE: when inserting a MessageHistory
 * this field must be non-null.
     */ 
    private java.lang.Integer SendOrder;
    /** 
        Time of completion of sending the message.
     */ 
    private java.util.Calendar SendTime;
    /** 
        Optional sender reference set at message send time.
     */ 
    private java.lang.String SenderRefID;
    /** 
        Message status: 10-Acked; 11-Error cleared; 12-Error retried; 13-Skipped
 * NOTE: when inserting a MessageHistory this field must be non-null.
     */ 
    private java.lang.Integer Status;
    /** 
        The user who created this message.
     */ 
    private com.guidewire.ab.webservices.entity.User User;

    public MessageHistory() {
    }

    public MessageHistory(
           com.guidewire.ab.webservices.entity.ABContact ABContact,
           java.lang.String AckCode,
           java.lang.Integer AckCount,
           java.util.Calendar AckedTime,
           java.util.Calendar AfterSendTime,
           java.util.Calendar BeforeSendLockTime,
           java.util.Calendar BeforeSendLockedTime,
           java.util.Calendar BeforeSendTime,
           java.util.Calendar CreationTime,
           java.lang.String Description,
           java.lang.Integer DestinationID,
           java.lang.Integer DuplicateCount,
           com.guidewire.ab.webservices.enumeration.ErrorCategory ErrorCategory,
           java.lang.String ErrorDescription,
           java.lang.String EventName,
           java.lang.String EventRootKey,
           java.lang.String KeyMap,
           java.lang.Boolean LateBound,
           java.lang.String MessageCode,
           java.lang.String ObjectKey,
           java.lang.Integer OptionalInt,
           java.math.BigDecimal OptionalMoney,
           java.lang.String OptionalString,
           java.lang.Long OrigMsgId,
           java.lang.String Payload,
           java.util.Calendar QueryTime,
           java.lang.Integer RetryCount,
           java.util.Calendar RetryTime,
           java.util.Calendar SendLockTime,
           java.util.Calendar SendLockedTime,
           java.lang.Integer SendOrder,
           java.util.Calendar SendTime,
           java.lang.String SenderRefID,
           java.lang.Integer Status,
           com.guidewire.ab.webservices.entity.User User) {
           this.ABContact = ABContact;
           this.AckCode = AckCode;
           this.AckCount = AckCount;
           this.AckedTime = AckedTime;
           this.AfterSendTime = AfterSendTime;
           this.BeforeSendLockTime = BeforeSendLockTime;
           this.BeforeSendLockedTime = BeforeSendLockedTime;
           this.BeforeSendTime = BeforeSendTime;
           this.CreationTime = CreationTime;
           this.Description = Description;
           this.DestinationID = DestinationID;
           this.DuplicateCount = DuplicateCount;
           this.ErrorCategory = ErrorCategory;
           this.ErrorDescription = ErrorDescription;
           this.EventName = EventName;
           this.EventRootKey = EventRootKey;
           this.KeyMap = KeyMap;
           this.LateBound = LateBound;
           this.MessageCode = MessageCode;
           this.ObjectKey = ObjectKey;
           this.OptionalInt = OptionalInt;
           this.OptionalMoney = OptionalMoney;
           this.OptionalString = OptionalString;
           this.OrigMsgId = OrigMsgId;
           this.Payload = Payload;
           this.QueryTime = QueryTime;
           this.RetryCount = RetryCount;
           this.RetryTime = RetryTime;
           this.SendLockTime = SendLockTime;
           this.SendLockedTime = SendLockedTime;
           this.SendOrder = SendOrder;
           this.SendTime = SendTime;
           this.SenderRefID = SenderRefID;
           this.Status = Status;
           this.User = User;
    }


    /**
     *  Associated ABContact, if applicable.
     * 
     * @return ABContact Associated ABContact, if applicable.
     */
    public com.guidewire.ab.webservices.entity.ABContact getABContact() {
        return ABContact;
    }


    /**
     *  Associated ABContact, if applicable.
     * 
     * @param ABContact Associated ABContact, if applicable.
     */
    public void setABContact(com.guidewire.ab.webservices.entity.ABContact ABContact) {
        this.ABContact = ABContact;
    }


    /**
     *  Custom field that may be defined when acknowledging.  This field
 * is deprecated, please define a new custom extension field instead.
 * @deprecated Custom field that may be defined when acknowledging. 
 * This field is deprecated, please define a new custom extension field
 * instead.
     * 
     * @return AckCode Custom field that may be defined when acknowledging.  This field
 * is deprecated, please define a new custom extension field instead.
 * @deprecated Custom field that may be defined when acknowledging. 
 * This field is deprecated, please define a new custom extension field
 * instead.
     */
    public java.lang.String getAckCode() {
        return AckCode;
    }


    /**
     *  Custom field that may be defined when acknowledging.  This field
 * is deprecated, please define a new custom extension field instead.
 * @deprecated Custom field that may be defined when acknowledging. 
 * This field is deprecated, please define a new custom extension field
 * instead.
     * 
     * @param AckCode Custom field that may be defined when acknowledging.  This field
 * is deprecated, please define a new custom extension field instead.
 * @deprecated Custom field that may be defined when acknowledging. 
 * This field is deprecated, please define a new custom extension field
 * instead.
     */
    public void setAckCode(java.lang.String AckCode) {
        this.AckCode = AckCode;
    }


    /**
     *  Number of acks received. NOTE: when inserting a MessageHistory
 * this field must be non-null.
     * 
     * @return AckCount Number of acks received. NOTE: when inserting a MessageHistory
 * this field must be non-null.
     */
    public java.lang.Integer getAckCount() {
        return AckCount;
    }


    /**
     *  Number of acks received. NOTE: when inserting a MessageHistory
 * this field must be non-null.
     * 
     * @param AckCount Number of acks received. NOTE: when inserting a MessageHistory
 * this field must be non-null.
     */
    public void setAckCount(java.lang.Integer AckCount) {
        this.AckCount = AckCount;
    }


    /**
     *  Time of ack.
     * 
     * @return AckedTime Time of ack.
     */
    public java.util.Calendar getAckedTime() {
        return AckedTime;
    }


    /**
     *  Time of ack.
     * 
     * @param AckedTime Time of ack.
     */
    public void setAckedTime(java.util.Calendar AckedTime) {
        this.AckedTime = AckedTime;
    }


    /**
     *  Time of completion of afterSend method.
     * 
     * @return AfterSendTime Time of completion of afterSend method.
     */
    public java.util.Calendar getAfterSendTime() {
        return AfterSendTime;
    }


    /**
     *  Time of completion of afterSend method.
     * 
     * @param AfterSendTime Time of completion of afterSend method.
     */
    public void setAfterSendTime(java.util.Calendar AfterSendTime) {
        this.AfterSendTime = AfterSendTime;
    }


    /**
     *  Time of attempting to get lock before the call to beforeSend transformations.
     * 
     * @return BeforeSendLockTime Time of attempting to get lock before the call to beforeSend transformations.
     */
    public java.util.Calendar getBeforeSendLockTime() {
        return BeforeSendLockTime;
    }


    /**
     *  Time of attempting to get lock before the call to beforeSend transformations.
     * 
     * @param BeforeSendLockTime Time of attempting to get lock before the call to beforeSend transformations.
     */
    public void setBeforeSendLockTime(java.util.Calendar BeforeSendLockTime) {
        this.BeforeSendLockTime = BeforeSendLockTime;
    }


    /**
     *  Time of after acquired lock before the call to beforeSend transformations.
     * 
     * @return BeforeSendLockedTime Time of after acquired lock before the call to beforeSend transformations.
     */
    public java.util.Calendar getBeforeSendLockedTime() {
        return BeforeSendLockedTime;
    }


    /**
     *  Time of after acquired lock before the call to beforeSend transformations.
     * 
     * @param BeforeSendLockedTime Time of after acquired lock before the call to beforeSend transformations.
     */
    public void setBeforeSendLockedTime(java.util.Calendar BeforeSendLockedTime) {
        this.BeforeSendLockedTime = BeforeSendLockedTime;
    }


    /**
     *  Time of completion of beforeSend transformations.
     * 
     * @return BeforeSendTime Time of completion of beforeSend transformations.
     */
    public java.util.Calendar getBeforeSendTime() {
        return BeforeSendTime;
    }


    /**
     *  Time of completion of beforeSend transformations.
     * 
     * @param BeforeSendTime Time of completion of beforeSend transformations.
     */
    public void setBeforeSendTime(java.util.Calendar BeforeSendTime) {
        this.BeforeSendTime = BeforeSendTime;
    }


    /**
     *  Time of creating the message. NOTE: when inserting a MessageHistory
 * this field must be non-null.
     * 
     * @return CreationTime Time of creating the message. NOTE: when inserting a MessageHistory
 * this field must be non-null.
     */
    public java.util.Calendar getCreationTime() {
        return CreationTime;
    }


    /**
     *  Time of creating the message. NOTE: when inserting a MessageHistory
 * this field must be non-null.
     * 
     * @param CreationTime Time of creating the message. NOTE: when inserting a MessageHistory
 * this field must be non-null.
     */
    public void setCreationTime(java.util.Calendar CreationTime) {
        this.CreationTime = CreationTime;
    }


    /**
     *  Short description of the message.
     * 
     * @return Description Short description of the message.
     */
    public java.lang.String getDescription() {
        return Description;
    }


    /**
     *  Short description of the message.
     * 
     * @param Description Short description of the message.
     */
    public void setDescription(java.lang.String Description) {
        this.Description = Description;
    }


    /**
     *  Identifies the message destination to send this message to. NOTE:
 * when inserting a MessageHistory this field must be non-null.
     * 
     * @return DestinationID Identifies the message destination to send this message to. NOTE:
 * when inserting a MessageHistory this field must be non-null.
     */
    public java.lang.Integer getDestinationID() {
        return DestinationID;
    }


    /**
     *  Identifies the message destination to send this message to. NOTE:
 * when inserting a MessageHistory this field must be non-null.
     * 
     * @param DestinationID Identifies the message destination to send this message to. NOTE:
 * when inserting a MessageHistory this field must be non-null.
     */
    public void setDestinationID(java.lang.Integer DestinationID) {
        this.DestinationID = DestinationID;
    }


    /**
     *  Number of duplicate errors received.
     * 
     * @return DuplicateCount Number of duplicate errors received.
     */
    public java.lang.Integer getDuplicateCount() {
        return DuplicateCount;
    }


    /**
     *  Number of duplicate errors received.
     * 
     * @param DuplicateCount Number of duplicate errors received.
     */
    public void setDuplicateCount(java.lang.Integer DuplicateCount) {
        this.DuplicateCount = DuplicateCount;
    }


    /**
     *  Type of error if the message is in error.
     * 
     * @return ErrorCategory Type of error if the message is in error.
     */
    public com.guidewire.ab.webservices.enumeration.ErrorCategory getErrorCategory() {
        return ErrorCategory;
    }


    /**
     *  Type of error if the message is in error.
     * 
     * @param ErrorCategory Type of error if the message is in error.
     */
    public void setErrorCategory(com.guidewire.ab.webservices.enumeration.ErrorCategory ErrorCategory) {
        this.ErrorCategory = ErrorCategory;
    }


    /**
     *  Detailed description of error condition (set in the message destination).
     * 
     * @return ErrorDescription Detailed description of error condition (set in the message destination).
     */
    public java.lang.String getErrorDescription() {
        return ErrorDescription;
    }


    /**
     *  Detailed description of error condition (set in the message destination).
     * 
     * @param ErrorDescription Detailed description of error condition (set in the message destination).
     */
    public void setErrorDescription(java.lang.String ErrorDescription) {
        this.ErrorDescription = ErrorDescription;
    }


    /**
     *  Name of the event. NOTE: when inserting a MessageHistory this field
 * must be non-null.
     * 
     * @return EventName Name of the event. NOTE: when inserting a MessageHistory this field
 * must be non-null.
     */
    public java.lang.String getEventName() {
        return EventName;
    }


    /**
     *  Name of the event. NOTE: when inserting a MessageHistory this field
 * must be non-null.
     * 
     * @param EventName Name of the event. NOTE: when inserting a MessageHistory this field
 * must be non-null.
     */
    public void setEventName(java.lang.String EventName) {
        this.EventName = EventName;
    }


    /**
     *  Key of event root/cause, encoded as type:id.
     * 
     * @return EventRootKey Key of event root/cause, encoded as type:id.
     */
    public java.lang.String getEventRootKey() {
        return EventRootKey;
    }


    /**
     *  Key of event root/cause, encoded as type:id.
     * 
     * @param EventRootKey Key of event root/cause, encoded as type:id.
     */
    public void setEventRootKey(java.lang.String EventRootKey) {
        this.EventRootKey = EventRootKey;
    }


    /**
     *  A CSV representation of the key->object ID map.
     * 
     * @return KeyMap A CSV representation of the key->object ID map.
     */
    public java.lang.String getKeyMap() {
        return KeyMap;
    }


    /**
     *  A CSV representation of the key->object ID map.
     * 
     * @param KeyMap A CSV representation of the key->object ID map.
     */
    public void setKeyMap(java.lang.String KeyMap) {
        this.KeyMap = KeyMap;
    }


    /**
     *  Whether the payload contains late-bound fields.  This field is
 * obsolete and no longer set/used.
 * @deprecated Whether the payload contains late-bound fields.  This
 * field is obsolete and no longer set/used.
     * 
     * @return LateBound Whether the payload contains late-bound fields.  This field is
 * obsolete and no longer set/used.
 * @deprecated Whether the payload contains late-bound fields.  This
 * field is obsolete and no longer set/used.
     */
    public java.lang.Boolean getLateBound() {
        return LateBound;
    }


    /**
     *  Whether the payload contains late-bound fields.  This field is
 * obsolete and no longer set/used.
 * @deprecated Whether the payload contains late-bound fields.  This
 * field is obsolete and no longer set/used.
     * 
     * @param LateBound Whether the payload contains late-bound fields.  This field is
 * obsolete and no longer set/used.
 * @deprecated Whether the payload contains late-bound fields.  This
 * field is obsolete and no longer set/used.
     */
    public void setLateBound(java.lang.Boolean LateBound) {
        this.LateBound = LateBound;
    }


    /**
     *  Custom field that may be defined during message creation.  This
 * field is deprecated, please define a new custom extension field instead.
 * @deprecated Custom field that may be defined during message creation.
 * This field is deprecated, please define a new custom extension field
 * instead.
     * 
     * @return MessageCode Custom field that may be defined during message creation.  This
 * field is deprecated, please define a new custom extension field instead.
 * @deprecated Custom field that may be defined during message creation.
 * This field is deprecated, please define a new custom extension field
 * instead.
     */
    public java.lang.String getMessageCode() {
        return MessageCode;
    }


    /**
     *  Custom field that may be defined during message creation.  This
 * field is deprecated, please define a new custom extension field instead.
 * @deprecated Custom field that may be defined during message creation.
 * This field is deprecated, please define a new custom extension field
 * instead.
     * 
     * @param MessageCode Custom field that may be defined during message creation.  This
 * field is deprecated, please define a new custom extension field instead.
 * @deprecated Custom field that may be defined during message creation.
 * This field is deprecated, please define a new custom extension field
 * instead.
     */
    public void setMessageCode(java.lang.String MessageCode) {
        this.MessageCode = MessageCode;
    }


    /**
     *  Key of template root object, encoded as type:id.
     * 
     * @return ObjectKey Key of template root object, encoded as type:id.
     */
    public java.lang.String getObjectKey() {
        return ObjectKey;
    }


    /**
     *  Key of template root object, encoded as type:id.
     * 
     * @param ObjectKey Key of template root object, encoded as type:id.
     */
    public void setObjectKey(java.lang.String ObjectKey) {
        this.ObjectKey = ObjectKey;
    }


    /**
     *  Custom field that may be set at message creation time.  This field
 * is deprecated, please define a new custom extension field instead.
 * @deprecated Custom field that may be set at message creation time.
 * This field is deprecated, please define a new custom extension field
 * instead.
     * 
     * @return OptionalInt Custom field that may be set at message creation time.  This field
 * is deprecated, please define a new custom extension field instead.
 * @deprecated Custom field that may be set at message creation time.
 * This field is deprecated, please define a new custom extension field
 * instead.
     */
    public java.lang.Integer getOptionalInt() {
        return OptionalInt;
    }


    /**
     *  Custom field that may be set at message creation time.  This field
 * is deprecated, please define a new custom extension field instead.
 * @deprecated Custom field that may be set at message creation time.
 * This field is deprecated, please define a new custom extension field
 * instead.
     * 
     * @param OptionalInt Custom field that may be set at message creation time.  This field
 * is deprecated, please define a new custom extension field instead.
 * @deprecated Custom field that may be set at message creation time.
 * This field is deprecated, please define a new custom extension field
 * instead.
     */
    public void setOptionalInt(java.lang.Integer OptionalInt) {
        this.OptionalInt = OptionalInt;
    }


    /**
     *  Custom field that may be set at message creation time.  This field
 * is deprecated, please define a new custom extension field instead.
 * @deprecated Custom field that may be set at message creation time.
 * This field is deprecated, please define a new custom extension field
 * instead.
     * 
     * @return OptionalMoney Custom field that may be set at message creation time.  This field
 * is deprecated, please define a new custom extension field instead.
 * @deprecated Custom field that may be set at message creation time.
 * This field is deprecated, please define a new custom extension field
 * instead.
     */
    public java.math.BigDecimal getOptionalMoney() {
        return OptionalMoney;
    }


    /**
     *  Custom field that may be set at message creation time.  This field
 * is deprecated, please define a new custom extension field instead.
 * @deprecated Custom field that may be set at message creation time.
 * This field is deprecated, please define a new custom extension field
 * instead.
     * 
     * @param OptionalMoney Custom field that may be set at message creation time.  This field
 * is deprecated, please define a new custom extension field instead.
 * @deprecated Custom field that may be set at message creation time.
 * This field is deprecated, please define a new custom extension field
 * instead.
     */
    public void setOptionalMoney(java.math.BigDecimal OptionalMoney) {
        this.OptionalMoney = OptionalMoney;
    }


    /**
     *  Custom field that may be set at message creation time.  This field
 * is deprecated, please define a new custom extension field instead.
 * @deprecated Custom field that may be set at message creation time.
 * This field is deprecated, please define a new custom extension field
 * instead.
     * 
     * @return OptionalString Custom field that may be set at message creation time.  This field
 * is deprecated, please define a new custom extension field instead.
 * @deprecated Custom field that may be set at message creation time.
 * This field is deprecated, please define a new custom extension field
 * instead.
     */
    public java.lang.String getOptionalString() {
        return OptionalString;
    }


    /**
     *  Custom field that may be set at message creation time.  This field
 * is deprecated, please define a new custom extension field instead.
 * @deprecated Custom field that may be set at message creation time.
 * This field is deprecated, please define a new custom extension field
 * instead.
     * 
     * @param OptionalString Custom field that may be set at message creation time.  This field
 * is deprecated, please define a new custom extension field instead.
 * @deprecated Custom field that may be set at message creation time.
 * This field is deprecated, please define a new custom extension field
 * instead.
     */
    public void setOptionalString(java.lang.String OptionalString) {
        this.OptionalString = OptionalString;
    }


    /**
     *  Identifies the id of the original message. NOTE: when inserting
 * a MessageHistory this field must be non-null.
     * 
     * @return OrigMsgId Identifies the id of the original message. NOTE: when inserting
 * a MessageHistory this field must be non-null.
     */
    public java.lang.Long getOrigMsgId() {
        return OrigMsgId;
    }


    /**
     *  Identifies the id of the original message. NOTE: when inserting
 * a MessageHistory this field must be non-null.
     * 
     * @param OrigMsgId Identifies the id of the original message. NOTE: when inserting
 * a MessageHistory this field must be non-null.
     */
    public void setOrigMsgId(java.lang.Long OrigMsgId) {
        this.OrigMsgId = OrigMsgId;
    }


    /**
     *  Contents of the message.
     * 
     * @return Payload Contents of the message.
     */
    public java.lang.String getPayload() {
        return Payload;
    }


    /**
     *  Contents of the message.
     * 
     * @param Payload Contents of the message.
     */
    public void setPayload(java.lang.String Payload) {
        this.Payload = Payload;
    }


    /**
     *  Time of of query selecting message to be processed.
     * 
     * @return QueryTime Time of of query selecting message to be processed.
     */
    public java.util.Calendar getQueryTime() {
        return QueryTime;
    }


    /**
     *  Time of of query selecting message to be processed.
     * 
     * @param QueryTime Time of of query selecting message to be processed.
     */
    public void setQueryTime(java.util.Calendar QueryTime) {
        this.QueryTime = QueryTime;
    }


    /**
     *  Number of times message has been retried.
     * 
     * @return RetryCount Number of times message has been retried.
     */
    public java.lang.Integer getRetryCount() {
        return RetryCount;
    }


    /**
     *  Number of times message has been retried.
     * 
     * @param RetryCount Number of times message has been retried.
     */
    public void setRetryCount(java.lang.Integer RetryCount) {
        this.RetryCount = RetryCount;
    }


    /**
     *  Time in the future at which to retry the message in error, applicable
 * only to retryable error messages.
     * 
     * @return RetryTime Time in the future at which to retry the message in error, applicable
 * only to retryable error messages.
     */
    public java.util.Calendar getRetryTime() {
        return RetryTime;
    }


    /**
     *  Time in the future at which to retry the message in error, applicable
 * only to retryable error messages.
     * 
     * @param RetryTime Time in the future at which to retry the message in error, applicable
 * only to retryable error messages.
     */
    public void setRetryTime(java.util.Calendar RetryTime) {
        this.RetryTime = RetryTime;
    }


    /**
     *  Time of attempting to lock before the sending the message.
     * 
     * @return SendLockTime Time of attempting to lock before the sending the message.
     */
    public java.util.Calendar getSendLockTime() {
        return SendLockTime;
    }


    /**
     *  Time of attempting to lock before the sending the message.
     * 
     * @param SendLockTime Time of attempting to lock before the sending the message.
     */
    public void setSendLockTime(java.util.Calendar SendLockTime) {
        this.SendLockTime = SendLockTime;
    }


    /**
     *  Time of after acquired lock lock before the sending the message.
     * 
     * @return SendLockedTime Time of after acquired lock lock before the sending the message.
     */
    public java.util.Calendar getSendLockedTime() {
        return SendLockedTime;
    }


    /**
     *  Time of after acquired lock lock before the sending the message.
     * 
     * @param SendLockedTime Time of after acquired lock lock before the sending the message.
     */
    public void setSendLockedTime(java.util.Calendar SendLockedTime) {
        this.SendLockedTime = SendLockedTime;
    }


    /**
     *  Order in which to send messages. NOTE: when inserting a MessageHistory
 * this field must be non-null.
     * 
     * @return SendOrder Order in which to send messages. NOTE: when inserting a MessageHistory
 * this field must be non-null.
     */
    public java.lang.Integer getSendOrder() {
        return SendOrder;
    }


    /**
     *  Order in which to send messages. NOTE: when inserting a MessageHistory
 * this field must be non-null.
     * 
     * @param SendOrder Order in which to send messages. NOTE: when inserting a MessageHistory
 * this field must be non-null.
     */
    public void setSendOrder(java.lang.Integer SendOrder) {
        this.SendOrder = SendOrder;
    }


    /**
     *  Time of completion of sending the message.
     * 
     * @return SendTime Time of completion of sending the message.
     */
    public java.util.Calendar getSendTime() {
        return SendTime;
    }


    /**
     *  Time of completion of sending the message.
     * 
     * @param SendTime Time of completion of sending the message.
     */
    public void setSendTime(java.util.Calendar SendTime) {
        this.SendTime = SendTime;
    }


    /**
     *  Optional sender reference set at message send time.
     * 
     * @return SenderRefID Optional sender reference set at message send time.
     */
    public java.lang.String getSenderRefID() {
        return SenderRefID;
    }


    /**
     *  Optional sender reference set at message send time.
     * 
     * @param SenderRefID Optional sender reference set at message send time.
     */
    public void setSenderRefID(java.lang.String SenderRefID) {
        this.SenderRefID = SenderRefID;
    }


    /**
     *  Message status: 10-Acked; 11-Error cleared; 12-Error retried; 13-Skipped
 * NOTE: when inserting a MessageHistory this field must be non-null.
     * 
     * @return Status Message status: 10-Acked; 11-Error cleared; 12-Error retried; 13-Skipped
 * NOTE: when inserting a MessageHistory this field must be non-null.
     */
    public java.lang.Integer getStatus() {
        return Status;
    }


    /**
     *  Message status: 10-Acked; 11-Error cleared; 12-Error retried; 13-Skipped
 * NOTE: when inserting a MessageHistory this field must be non-null.
     * 
     * @param Status Message status: 10-Acked; 11-Error cleared; 12-Error retried; 13-Skipped
 * NOTE: when inserting a MessageHistory this field must be non-null.
     */
    public void setStatus(java.lang.Integer Status) {
        this.Status = Status;
    }


    /**
     *  The user who created this message.
     * 
     * @return User The user who created this message.
     */
    public com.guidewire.ab.webservices.entity.User getUser() {
        return User;
    }


    /**
     *  The user who created this message.
     * 
     * @param User The user who created this message.
     */
    public void setUser(com.guidewire.ab.webservices.entity.User User) {
        this.User = User;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MessageHistory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "MessageHistory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ABContact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ABContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABContact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ackCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AckCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ackCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AckCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ackedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AckedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("afterSendTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AfterSendTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beforeSendLockTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BeforeSendLockTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beforeSendLockedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BeforeSendLockedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beforeSendTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BeforeSendTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("destinationID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DestinationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duplicateCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DuplicateCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ErrorCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ErrorCategory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ErrorDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EventName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventRootKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EventRootKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyMap");
        elemField.setXmlName(new javax.xml.namespace.QName("", "KeyMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lateBound");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LateBound"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MessageCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ObjectKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionalInt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OptionalInt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionalMoney");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OptionalMoney"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionalString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OptionalString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origMsgId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OrigMsgId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payload");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Payload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QueryTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retryCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RetryCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retryTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RetryTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendLockTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SendLockTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendLockedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SendLockedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SendOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SendTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderRefID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SenderRefID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "User"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "User"));
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
