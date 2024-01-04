/**
 * GW_Events.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;


/**
 * Typelist containing all events that can be fired
 */
public class GW_Events implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GW_Events(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _ABContactAdded;
    private static java.lang.String _ABContactChanged;
    private static java.lang.String _ABContactCreatedApproved;
    private static java.lang.String _ABContactPendingChangeRejected;
    private static java.lang.String _ABContactRemoved;
    private static java.lang.String _ABContactResync;
    private static java.lang.String _ActivityAdded;
    private static java.lang.String _ActivityChanged;
    private static java.lang.String _ActivityRemoved;
    private static java.lang.String _BankAccountAdded;
    private static java.lang.String _BankAccountChanged;
    private static java.lang.String _BankAccountRemoved;
    private static java.lang.String _ContactAdded;
    private static java.lang.String _ContactAutoSyncFailed;
    private static java.lang.String _ContactAutoSyncWorkItemAdded;
    private static java.lang.String _ContactAutoSyncWorkItemChanged;
    private static java.lang.String _ContactAutoSyncWorkItemRemoved;
    private static java.lang.String _ContactChanged;
    private static java.lang.String _ContactRemoved;
    private static java.lang.String _DataChangeAdded;
    private static java.lang.String _DataChangeChanged;
    private static java.lang.String _DataChangeEditorIsExecutor;
    private static java.lang.String _DataChangeRemoved;
    private static java.lang.String _DocumentAdded;
    private static java.lang.String _DocumentChanged;
    private static java.lang.String _DocumentRemoved;
    private static java.lang.String _DocumentStore;
    private static java.lang.String _DynamicAssignmentStateAdded;
    private static java.lang.String _DynamicAssignmentStateChanged;
    private static java.lang.String _DynamicAssignmentStateRemoved;
    private static java.lang.String _GroupAdded;
    private static java.lang.String _GroupAssignmentStateAdded;
    private static java.lang.String _GroupAssignmentStateChanged;
    private static java.lang.String _GroupAssignmentStateRemoved;
    private static java.lang.String _GroupChanged;
    private static java.lang.String _GroupRemoved;
    private static java.lang.String _GroupUserAdded;
    private static java.lang.String _GroupUserChanged;
    private static java.lang.String _GroupUserRemoved;
    private static java.lang.String _InboundHistoryAdded;
    private static java.lang.String _InboundHistoryChanged;
    private static java.lang.String _InboundHistoryRemoved;
    private static java.lang.String _MessageGeneratorAdded;
    private static java.lang.String _MessageGeneratorChanged;
    private static java.lang.String _MessageGeneratorRemoved;
    private static java.lang.String _NoteAdded;
    private static java.lang.String _NoteChanged;
    private static java.lang.String _NoteRemoved;
    private static java.lang.String _OrganizationAdded;
    private static java.lang.String _OrganizationChanged;
    private static java.lang.String _OrganizationRemoved;
    private static java.lang.String _ProcessHistoryAdded;
    private static java.lang.String _ProcessHistoryChanged;
    private static java.lang.String _ProcessHistoryRemoved;
    private static java.lang.String _PurgedRootInfoAdded;
    private static java.lang.String _PurgedRootInfoChanged;
    private static java.lang.String _PurgedRootInfoRemoved;
    private static java.lang.String _RoleAdded;
    private static java.lang.String _RoleChanged;
    private static java.lang.String _RoleRemoved;
    private static java.lang.String _SoapCallHistoryAdded;
    private static java.lang.String _SoapCallHistoryChanged;
    private static java.lang.String _SoapCallHistoryRemoved;
    private static java.lang.String _StartablePluginHistoryAdded;
    private static java.lang.String _StartablePluginHistoryChanged;
    private static java.lang.String _StartablePluginHistoryRemoved;
    private static java.lang.String _UserAdded;
    private static java.lang.String _UserChanged;
    private static java.lang.String _UserRemoved;
    private static java.lang.String _UserRoleAssignmentAdded;
    private static java.lang.String _UserRoleAssignmentChanged;
    private static java.lang.String _UserRoleAssignmentRemoved;
    private static java.lang.String _UserSettingsAdded;
    private static java.lang.String _UserSettingsChanged;
    private static java.lang.String _UserSettingsRemoved;

/**
 * ABContact was added
 */
    public static GW_Events ABContactAdded;

/**
 * ABContact was changed
 */
    public static GW_Events ABContactChanged;

/**
 * ABContact is created with a status of Approved via the 800 ABContactAPI
 */
    public static GW_Events ABContactCreatedApproved;

/**
 * PendingChangeRejected event. Generated when a PendingContactChange
 * is rejected.
 */
    public static GW_Events ABContactPendingChangeRejected;

/**
 * ABContact was removed
 */
    public static GW_Events ABContactRemoved;

/**
 * ABContact resync event. Generated only as a result of an administrator
 * requesting an abcontact resync.  All pending messages for the abcontact
 * are dumped and the event is fired.  Implementors will generally handle
 * this event to dump the entire abcontact to bring the remote system
 * up to date.
 */
    public static GW_Events ABContactResync;

/**
 * Activity was added
 */
    public static GW_Events ActivityAdded;

/**
 * Activity was changed
 */
    public static GW_Events ActivityChanged;

/**
 * Activity was removed
 */
    public static GW_Events ActivityRemoved;

/**
 * BankAccount was added
 */
    public static GW_Events BankAccountAdded;

/**
 * BankAccount was changed
 */
    public static GW_Events BankAccountChanged;

/**
 * BankAccount was removed
 */
    public static GW_Events BankAccountRemoved;

/**
 * Contact was added
 */
    public static GW_Events ContactAdded;

/**
 * Fired when a contact auto sync work item is failed to process.
 */
    public static GW_Events ContactAutoSyncFailed;

/**
 * ContactAutoSyncWorkItem was added
 */
    public static GW_Events ContactAutoSyncWorkItemAdded;

/**
 * ContactAutoSyncWorkItem was changed
 */
    public static GW_Events ContactAutoSyncWorkItemChanged;

/**
 * ContactAutoSyncWorkItem was removed
 */
    public static GW_Events ContactAutoSyncWorkItemRemoved;

/**
 * Contact was changed
 */
    public static GW_Events ContactChanged;

/**
 * Contact was removed
 */
    public static GW_Events ContactRemoved;

/**
 * DataChange was added
 */
    public static GW_Events DataChangeAdded;

/**
 * DataChange was changed
 */
    public static GW_Events DataChangeChanged;

/**
 * This event is raised if editor of the gosu script is the same person
 * who executed the gosu script
 */
    public static GW_Events DataChangeEditorIsExecutor;

/**
 * DataChange was removed
 */
    public static GW_Events DataChangeRemoved;

/**
 * Document was added
 */
    public static GW_Events DocumentAdded;

/**
 * Document was changed
 */
    public static GW_Events DocumentChanged;

/**
 * Document was removed
 */
    public static GW_Events DocumentRemoved;

/**
 * This is used by the asynchronous storage to inform the transport
 * that this document needs to be processed.
 */
    public static GW_Events DocumentStore;

/**
 * DynamicAssignmentState was added
 */
    public static GW_Events DynamicAssignmentStateAdded;

/**
 * DynamicAssignmentState was changed
 */
    public static GW_Events DynamicAssignmentStateChanged;

/**
 * DynamicAssignmentState was removed
 */
    public static GW_Events DynamicAssignmentStateRemoved;

/**
 * Group was added
 */
    public static GW_Events GroupAdded;

/**
 * GroupAssignmentState was added
 */
    public static GW_Events GroupAssignmentStateAdded;

/**
 * GroupAssignmentState was changed
 */
    public static GW_Events GroupAssignmentStateChanged;

/**
 * GroupAssignmentState was removed
 */
    public static GW_Events GroupAssignmentStateRemoved;

/**
 * Group was changed
 */
    public static GW_Events GroupChanged;

/**
 * Group was removed
 */
    public static GW_Events GroupRemoved;

/**
 * GroupUser was added
 */
    public static GW_Events GroupUserAdded;

/**
 * GroupUser was changed
 */
    public static GW_Events GroupUserChanged;

/**
 * GroupUser was removed
 */
    public static GW_Events GroupUserRemoved;

/**
 * InboundHistory was added
 */
    public static GW_Events InboundHistoryAdded;

/**
 * InboundHistory was changed
 */
    public static GW_Events InboundHistoryChanged;

/**
 * InboundHistory was removed
 */
    public static GW_Events InboundHistoryRemoved;

/**
 * MessageGenerator was added
 */
    public static GW_Events MessageGeneratorAdded;

/**
 * MessageGenerator was changed
 */
    public static GW_Events MessageGeneratorChanged;

/**
 * MessageGenerator was removed
 */
    public static GW_Events MessageGeneratorRemoved;

/**
 * Note was added
 */
    public static GW_Events NoteAdded;

/**
 * Note was changed
 */
    public static GW_Events NoteChanged;

/**
 * Note was removed
 */
    public static GW_Events NoteRemoved;

/**
 * Organization was added
 */
    public static GW_Events OrganizationAdded;

/**
 * Organization was changed
 */
    public static GW_Events OrganizationChanged;

/**
 * Organization was removed
 */
    public static GW_Events OrganizationRemoved;

/**
 * ProcessHistory was added
 */
    public static GW_Events ProcessHistoryAdded;

/**
 * ProcessHistory was changed
 */
    public static GW_Events ProcessHistoryChanged;

/**
 * ProcessHistory was removed
 */
    public static GW_Events ProcessHistoryRemoved;

/**
 * PurgedRootInfo was added
 */
    public static GW_Events PurgedRootInfoAdded;

/**
 * PurgedRootInfo was changed
 */
    public static GW_Events PurgedRootInfoChanged;

/**
 * PurgedRootInfo was removed
 */
    public static GW_Events PurgedRootInfoRemoved;

/**
 * Role was added
 */
    public static GW_Events RoleAdded;

/**
 * Role was changed
 */
    public static GW_Events RoleChanged;

/**
 * Role was removed
 */
    public static GW_Events RoleRemoved;

/**
 * SoapCallHistory was added
 */
    public static GW_Events SoapCallHistoryAdded;

/**
 * SoapCallHistory was changed
 */
    public static GW_Events SoapCallHistoryChanged;

/**
 * SoapCallHistory was removed
 */
    public static GW_Events SoapCallHistoryRemoved;

/**
 * StartablePluginHistory was added
 */
    public static GW_Events StartablePluginHistoryAdded;

/**
 * StartablePluginHistory was changed
 */
    public static GW_Events StartablePluginHistoryChanged;

/**
 * StartablePluginHistory was removed
 */
    public static GW_Events StartablePluginHistoryRemoved;

/**
 * User was added
 */
    public static GW_Events UserAdded;

/**
 * User was changed
 */
    public static GW_Events UserChanged;

/**
 * User was removed
 */
    public static GW_Events UserRemoved;

/**
 * UserRoleAssignment was added
 */
    public static GW_Events UserRoleAssignmentAdded;

/**
 * UserRoleAssignment was changed
 */
    public static GW_Events UserRoleAssignmentChanged;

/**
 * UserRoleAssignment was removed
 */
    public static GW_Events UserRoleAssignmentRemoved;

/**
 * UserSettings was added
 */
    public static GW_Events UserSettingsAdded;

/**
 * UserSettings was changed
 */
    public static GW_Events UserSettingsChanged;

/**
 * UserSettings was removed
 */
    public static GW_Events UserSettingsRemoved;

    private static void initValues0() {
      _ABContactAdded = "ABContactAdded";
      ABContactAdded = new GW_Events(_ABContactAdded);
      _ABContactChanged = "ABContactChanged";
      ABContactChanged = new GW_Events(_ABContactChanged);
      _ABContactCreatedApproved = "ABContactCreatedApproved";
      ABContactCreatedApproved = new GW_Events(_ABContactCreatedApproved);
      _ABContactPendingChangeRejected = "ABContactPendingChangeRejected";
      ABContactPendingChangeRejected = new GW_Events(_ABContactPendingChangeRejected);
      _ABContactRemoved = "ABContactRemoved";
      ABContactRemoved = new GW_Events(_ABContactRemoved);
      _ABContactResync = "ABContactResync";
      ABContactResync = new GW_Events(_ABContactResync);
      _ActivityAdded = "ActivityAdded";
      ActivityAdded = new GW_Events(_ActivityAdded);
      _ActivityChanged = "ActivityChanged";
      ActivityChanged = new GW_Events(_ActivityChanged);
      _ActivityRemoved = "ActivityRemoved";
      ActivityRemoved = new GW_Events(_ActivityRemoved);
      _BankAccountAdded = "BankAccountAdded";
      BankAccountAdded = new GW_Events(_BankAccountAdded);
      _BankAccountChanged = "BankAccountChanged";
      BankAccountChanged = new GW_Events(_BankAccountChanged);
      _BankAccountRemoved = "BankAccountRemoved";
      BankAccountRemoved = new GW_Events(_BankAccountRemoved);
      _ContactAdded = "ContactAdded";
      ContactAdded = new GW_Events(_ContactAdded);
      _ContactAutoSyncFailed = "ContactAutoSyncFailed";
      ContactAutoSyncFailed = new GW_Events(_ContactAutoSyncFailed);
      _ContactAutoSyncWorkItemAdded = "ContactAutoSyncWorkItemAdded";
      ContactAutoSyncWorkItemAdded = new GW_Events(_ContactAutoSyncWorkItemAdded);
      _ContactAutoSyncWorkItemChanged = "ContactAutoSyncWorkItemChanged";
      ContactAutoSyncWorkItemChanged = new GW_Events(_ContactAutoSyncWorkItemChanged);
      _ContactAutoSyncWorkItemRemoved = "ContactAutoSyncWorkItemRemoved";
      ContactAutoSyncWorkItemRemoved = new GW_Events(_ContactAutoSyncWorkItemRemoved);
      _ContactChanged = "ContactChanged";
      ContactChanged = new GW_Events(_ContactChanged);
      _ContactRemoved = "ContactRemoved";
      ContactRemoved = new GW_Events(_ContactRemoved);
      _DataChangeAdded = "DataChangeAdded";
      DataChangeAdded = new GW_Events(_DataChangeAdded);
      _DataChangeChanged = "DataChangeChanged";
      DataChangeChanged = new GW_Events(_DataChangeChanged);
      _DataChangeEditorIsExecutor = "DataChangeEditorIsExecutor";
      DataChangeEditorIsExecutor = new GW_Events(_DataChangeEditorIsExecutor);
      _DataChangeRemoved = "DataChangeRemoved";
      DataChangeRemoved = new GW_Events(_DataChangeRemoved);
      _DocumentAdded = "DocumentAdded";
      DocumentAdded = new GW_Events(_DocumentAdded);
      _DocumentChanged = "DocumentChanged";
      DocumentChanged = new GW_Events(_DocumentChanged);
      _DocumentRemoved = "DocumentRemoved";
      DocumentRemoved = new GW_Events(_DocumentRemoved);
      _DocumentStore = "DocumentStore";
      DocumentStore = new GW_Events(_DocumentStore);
      _DynamicAssignmentStateAdded = "DynamicAssignmentStateAdded";
      DynamicAssignmentStateAdded = new GW_Events(_DynamicAssignmentStateAdded);
      _DynamicAssignmentStateChanged = "DynamicAssignmentStateChanged";
      DynamicAssignmentStateChanged = new GW_Events(_DynamicAssignmentStateChanged);
      _DynamicAssignmentStateRemoved = "DynamicAssignmentStateRemoved";
      DynamicAssignmentStateRemoved = new GW_Events(_DynamicAssignmentStateRemoved);
      _GroupAdded = "GroupAdded";
      GroupAdded = new GW_Events(_GroupAdded);
      _GroupAssignmentStateAdded = "GroupAssignmentStateAdded";
      GroupAssignmentStateAdded = new GW_Events(_GroupAssignmentStateAdded);
      _GroupAssignmentStateChanged = "GroupAssignmentStateChanged";
      GroupAssignmentStateChanged = new GW_Events(_GroupAssignmentStateChanged);
      _GroupAssignmentStateRemoved = "GroupAssignmentStateRemoved";
      GroupAssignmentStateRemoved = new GW_Events(_GroupAssignmentStateRemoved);
      _GroupChanged = "GroupChanged";
      GroupChanged = new GW_Events(_GroupChanged);
      _GroupRemoved = "GroupRemoved";
      GroupRemoved = new GW_Events(_GroupRemoved);
      _GroupUserAdded = "GroupUserAdded";
      GroupUserAdded = new GW_Events(_GroupUserAdded);
      _GroupUserChanged = "GroupUserChanged";
      GroupUserChanged = new GW_Events(_GroupUserChanged);
      _GroupUserRemoved = "GroupUserRemoved";
      GroupUserRemoved = new GW_Events(_GroupUserRemoved);
      _InboundHistoryAdded = "InboundHistoryAdded";
      InboundHistoryAdded = new GW_Events(_InboundHistoryAdded);
      _InboundHistoryChanged = "InboundHistoryChanged";
      InboundHistoryChanged = new GW_Events(_InboundHistoryChanged);
      _InboundHistoryRemoved = "InboundHistoryRemoved";
      InboundHistoryRemoved = new GW_Events(_InboundHistoryRemoved);
      _MessageGeneratorAdded = "MessageGeneratorAdded";
      MessageGeneratorAdded = new GW_Events(_MessageGeneratorAdded);
      _MessageGeneratorChanged = "MessageGeneratorChanged";
      MessageGeneratorChanged = new GW_Events(_MessageGeneratorChanged);
      _MessageGeneratorRemoved = "MessageGeneratorRemoved";
      MessageGeneratorRemoved = new GW_Events(_MessageGeneratorRemoved);
      _NoteAdded = "NoteAdded";
      NoteAdded = new GW_Events(_NoteAdded);
      _NoteChanged = "NoteChanged";
      NoteChanged = new GW_Events(_NoteChanged);
      _NoteRemoved = "NoteRemoved";
      NoteRemoved = new GW_Events(_NoteRemoved);
      _OrganizationAdded = "OrganizationAdded";
      OrganizationAdded = new GW_Events(_OrganizationAdded);
      _OrganizationChanged = "OrganizationChanged";
      OrganizationChanged = new GW_Events(_OrganizationChanged);
      _OrganizationRemoved = "OrganizationRemoved";
      OrganizationRemoved = new GW_Events(_OrganizationRemoved);
      _ProcessHistoryAdded = "ProcessHistoryAdded";
      ProcessHistoryAdded = new GW_Events(_ProcessHistoryAdded);
      _ProcessHistoryChanged = "ProcessHistoryChanged";
      ProcessHistoryChanged = new GW_Events(_ProcessHistoryChanged);
      _ProcessHistoryRemoved = "ProcessHistoryRemoved";
      ProcessHistoryRemoved = new GW_Events(_ProcessHistoryRemoved);
      _PurgedRootInfoAdded = "PurgedRootInfoAdded";
      PurgedRootInfoAdded = new GW_Events(_PurgedRootInfoAdded);
      _PurgedRootInfoChanged = "PurgedRootInfoChanged";
      PurgedRootInfoChanged = new GW_Events(_PurgedRootInfoChanged);
      _PurgedRootInfoRemoved = "PurgedRootInfoRemoved";
      PurgedRootInfoRemoved = new GW_Events(_PurgedRootInfoRemoved);
      _RoleAdded = "RoleAdded";
      RoleAdded = new GW_Events(_RoleAdded);
      _RoleChanged = "RoleChanged";
      RoleChanged = new GW_Events(_RoleChanged);
      _RoleRemoved = "RoleRemoved";
      RoleRemoved = new GW_Events(_RoleRemoved);
      _SoapCallHistoryAdded = "SoapCallHistoryAdded";
      SoapCallHistoryAdded = new GW_Events(_SoapCallHistoryAdded);
      _SoapCallHistoryChanged = "SoapCallHistoryChanged";
      SoapCallHistoryChanged = new GW_Events(_SoapCallHistoryChanged);
      _SoapCallHistoryRemoved = "SoapCallHistoryRemoved";
      SoapCallHistoryRemoved = new GW_Events(_SoapCallHistoryRemoved);
      _StartablePluginHistoryAdded = "StartablePluginHistoryAdded";
      StartablePluginHistoryAdded = new GW_Events(_StartablePluginHistoryAdded);
      _StartablePluginHistoryChanged = "StartablePluginHistoryChanged";
      StartablePluginHistoryChanged = new GW_Events(_StartablePluginHistoryChanged);
      _StartablePluginHistoryRemoved = "StartablePluginHistoryRemoved";
      StartablePluginHistoryRemoved = new GW_Events(_StartablePluginHistoryRemoved);
      _UserAdded = "UserAdded";
      UserAdded = new GW_Events(_UserAdded);
      _UserChanged = "UserChanged";
      UserChanged = new GW_Events(_UserChanged);
      _UserRemoved = "UserRemoved";
      UserRemoved = new GW_Events(_UserRemoved);
      _UserRoleAssignmentAdded = "UserRoleAssignmentAdded";
      UserRoleAssignmentAdded = new GW_Events(_UserRoleAssignmentAdded);
      _UserRoleAssignmentChanged = "UserRoleAssignmentChanged";
      UserRoleAssignmentChanged = new GW_Events(_UserRoleAssignmentChanged);
      _UserRoleAssignmentRemoved = "UserRoleAssignmentRemoved";
      UserRoleAssignmentRemoved = new GW_Events(_UserRoleAssignmentRemoved);
      _UserSettingsAdded = "UserSettingsAdded";
      UserSettingsAdded = new GW_Events(_UserSettingsAdded);
      _UserSettingsChanged = "UserSettingsChanged";
      UserSettingsChanged = new GW_Events(_UserSettingsChanged);
      _UserSettingsRemoved = "UserSettingsRemoved";
      UserSettingsRemoved = new GW_Events(_UserSettingsRemoved);
    }

    static {
      initValues0();
    }
/**
Returns the String representation of the enumeration, equivalent to toString()
 */
    public java.lang.String getValue() { return _value_;}
/**
Returns the enumeration instance which matches the String.<p><b>Note:</b> Requires a preceding "TC_" to be appended to the code value of a typekey
 */
    public static GW_Events fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GW_Events enumeration = (GW_Events) internalFromCode(value);
        if (enumeration == null) enumeration = (GW_Events) internalFromCode("TC_" + value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public java.lang.String toCode() {
        if (_value_.length() <= 3 || _value_ == null){
            return _value_;
        }
        if (_value_.startsWith("TC_")){
            return _value_.substring(3);
        }
        return toString();
    }
    public static GW_Events fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static GW_Events internalFromCode(java.lang.String value){
        GW_Events enumeration = (GW_Events)
            _table_.get(value);
        return enumeration;
    }
    public static GW_Events fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GW_Events.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "GW_Events"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
