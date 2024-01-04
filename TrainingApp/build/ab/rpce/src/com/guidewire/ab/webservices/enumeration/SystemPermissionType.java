/**
 * SystemPermissionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;

public class SystemPermissionType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SystemPermissionType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_wsdatachangeedit;
    private static java.lang.String _TC_integadmin;
    private static java.lang.String _TC_ruleadmin;
    private static java.lang.String _TC_internaltools;
    private static java.lang.String _TC_archive;
    private static java.lang.String _TC_changecontactsubtype;
    private static java.lang.String _TC_clientapp;
    private static java.lang.String _TC_abcreate;
    private static java.lang.String _TC_abcreatepref;
    private static java.lang.String _TC_anytagcreate;
    private static java.lang.String _TC_groupcreate;
    private static java.lang.String _TC_orgcreate;
    private static java.lang.String _TC_usercreate;
    private static java.lang.String _TC_abdelete;
    private static java.lang.String _TC_abdeletepref;
    private static java.lang.String _TC_anytagdelete;
    private static java.lang.String _TC_groupdelete;
    private static java.lang.String _TC_orgdelete;
    private static java.lang.String _TC_userdelete;
    private static java.lang.String _TC_abedit;
    private static java.lang.String _TC_abeditpref;
    private static java.lang.String _TC_toolsBatchProcessedit;
    private static java.lang.String _TC_toolsClusteredit;
    private static java.lang.String _TC_anytagedit;
    private static java.lang.String _TC_docedit;
    private static java.lang.String _TC_groupedit;
    private static java.lang.String _TC_toolsJProfileredit;
    private static java.lang.String _TC_toolsLogedit;
    private static java.lang.String _TC_toolsJMXBeansEdit;
    private static java.lang.String _TC_orgeditbasic;
    private static java.lang.String _TC_toolsProfileredit;
    private static java.lang.String _TC_toolsPluginedit;
    private static java.lang.String _TC_usereditlang;
    private static java.lang.String _TC_useredit;
    private static java.lang.String _TC_toolsWorkQueueedit;
    private static java.lang.String _TC_admindatachangeexec;
    private static java.lang.String _TC_usergrantroles;
    private static java.lang.String _TC_zonemanage;
    private static java.lang.String _TC_buswkmanage;
    private static java.lang.String _TC_regionmanage;
    private static java.lang.String _TC_rolemanage;
    private static java.lang.String _TC_scrprmmanage;
    private static java.lang.String _TC_workflowmanage;
    private static java.lang.String _TC_purge;
    private static java.lang.String _TC_flagentryresolve;
    private static java.lang.String _TC_resyncmessage;
    private static java.lang.String _TC_retrymessage;
    private static java.lang.String _TC_orgsearch;
    private static java.lang.String _TC_skipmessage;
    private static java.lang.String _TC_soapadmin;
    private static java.lang.String _TC_abviewsearch;
    private static java.lang.String _TC_abview;
    private static java.lang.String _TC_zoneview;
    private static java.lang.String _TC_userviewall;
    private static java.lang.String _TC_toolsBatchProcessview;
    private static java.lang.String _TC_buswkview;
    private static java.lang.String _TC_toolsCacheinfoview;
    private static java.lang.String _TC_toolsClusterview;
    private static java.lang.String _TC_anytagview;
    private static java.lang.String _TC_admindatachangeview;
    private static java.lang.String _TC_eventmessageview;
    private static java.lang.String _TC_grouptreeview;
    private static java.lang.String _TC_groupview;
    private static java.lang.String _TC_toolsInfoview;
    private static java.lang.String _TC_toolsLogview;
    private static java.lang.String _TC_toolsJMXBeansview;
    private static java.lang.String _TC_abviewmerge;
    private static java.lang.String _TC_noteview;
    private static java.lang.String _TC_orgviewbasic;
    private static java.lang.String _TC_abviewpending;
    private static java.lang.String _TC_toolsProfilerview;
    private static java.lang.String _TC_regionview;
    private static java.lang.String _TC_revsumviewlist;
    private static java.lang.String _TC_revsumviewdetail;
    private static java.lang.String _TC_roleview;
    private static java.lang.String _TC_scrprmview;
    private static java.lang.String _TC_toolsPluginview;
    private static java.lang.String _TC_userview;
    private static java.lang.String _TC_workflowview;
    private static java.lang.String _TC_toolsWorkQueueview;
    private static java.lang.String _TC_reporting_admin;
    private static java.lang.String _TC_debugtools;
    private static java.lang.String _TC_actapproveany;
    private static java.lang.String _TC_actcreate;
    private static java.lang.String _TC_actpatcreate;
    private static java.lang.String _TC_doccreate;
    private static java.lang.String _TC_ctccreate;
    private static java.lang.String _TC_notecreate;
    private static java.lang.String _TC_actpatdelete;
    private static java.lang.String _TC_docdelete;
    private static java.lang.String _TC_notedelete;
    private static java.lang.String _TC_actpatedit;
    private static java.lang.String _TC_ctcedit;
    private static java.lang.String _TC_noteedit;
    private static java.lang.String _TC_noteeditbody;
    private static java.lang.String _TC_acteditunowned;
    private static java.lang.String _TC_usereditattrs;
    private static java.lang.String _TC_actqueuenext;
    private static java.lang.String _TC_usergrantauth;
    private static java.lang.String _TC_actmakemand;
    private static java.lang.String _TC_attrmanage;
    private static java.lang.String _TC_holidaymanage;
    private static java.lang.String _TC_manageldfctrs;
    private static java.lang.String _TC_seczonemanage;
    private static java.lang.String _TC_docmodifyall;
    private static java.lang.String _TC_actown;
    private static java.lang.String _TC_actqueuepick;
    private static java.lang.String _TC_lvprint;
    private static java.lang.String _TC_actraown;
    private static java.lang.String _TC_actraunown;
    private static java.lang.String _TC_actreviewassign;
    private static java.lang.String _TC_actview;
    private static java.lang.String _TC_viewactcal;
    private static java.lang.String _TC_actpatview;
    private static java.lang.String _TC_actviewallqueues;
    private static java.lang.String _TC_docviewall;
    private static java.lang.String _TC_attrview;
    private static java.lang.String _TC_alpview;
    private static java.lang.String _TC_viewdesktop;
    private static java.lang.String _TC_docview;
    private static java.lang.String _TC_viewworkload;
    private static java.lang.String _TC_holidayview;
    private static java.lang.String _TC_ctcview;
    private static java.lang.String _TC_reporting_view;
    private static java.lang.String _TC_viewsearch;
    private static java.lang.String _TC_viewteam;

/**
 * Permission to add a data change gosu program.
 */
    public static SystemPermissionType TC_wsdatachangeedit;

/**
 * Permission to administer integration events
 */
    public static SystemPermissionType TC_integadmin;

/**
 * Permission to run Guidewire Studio or import rules
 */
    public static SystemPermissionType TC_ruleadmin;

/**
 * Permission to access all Internal Tools
 */
    public static SystemPermissionType TC_internaltools;

/**
 * Permission to archive objects
 */
    public static SystemPermissionType TC_archive;

/**
 * Permission to change contact subtype
 */
    public static SystemPermissionType TC_changecontactsubtype;

/**
 * Client Application (should not access via UI)
 */
    public static SystemPermissionType TC_clientapp;

/**
 * Permission to create a new contact in the address book
 */
    public static SystemPermissionType TC_abcreate;

/**
 * Permission to add a preferred vendor to the address book
 */
    public static SystemPermissionType TC_abcreatepref;

/**
 * Permission to create a new contact regardless of which tag(s) it
 * has
 */
    public static SystemPermissionType TC_anytagcreate;

/**
 * Permission to create groups
 */
    public static SystemPermissionType TC_groupcreate;

/**
 * Permission to create an organization.
 */
    public static SystemPermissionType TC_orgcreate;

/**
 * Permission to create a new user
 */
    public static SystemPermissionType TC_usercreate;

/**
 * Permission to delete an existing contact in the address book
 */
    public static SystemPermissionType TC_abdelete;

/**
 * Permission to delete an existing preferred vendor address book
 * entry
 */
    public static SystemPermissionType TC_abdeletepref;

/**
 * Permission to delete a contact regardless of which tag(s) it has
 */
    public static SystemPermissionType TC_anytagdelete;

/**
 * Permission to delete groups
 */
    public static SystemPermissionType TC_groupdelete;

/**
 * Permission to delete an organization.
 */
    public static SystemPermissionType TC_orgdelete;

/**
 * Permission to delete a user (Note: if a user has had any activity
 * it's recommended to make them non-active rather than delete)
 */
    public static SystemPermissionType TC_userdelete;

/**
 * Permission to edit an existing contact in the address book
 */
    public static SystemPermissionType TC_abedit;

/**
 * Permission to modify an existing preferred vendor address book
 * entry
 */
    public static SystemPermissionType TC_abeditpref;

/**
 * Permission to edit the BatchProcess Internal Tools page
 */
    public static SystemPermissionType TC_toolsBatchProcessedit;

/**
 * Permission to edit the Cluster Internal Tools page
 */
    public static SystemPermissionType TC_toolsClusteredit;

/**
 * Permission to edit the details of a contact regardless of which
 * tag(s) it has
 */
    public static SystemPermissionType TC_anytagedit;

/**
 * Permission to edit documents
 */
    public static SystemPermissionType TC_docedit;

/**
 * Permission to edit groups
 */
    public static SystemPermissionType TC_groupedit;

/**
 * Permission to edit the JProfiler Internal Tools page
 */
    public static SystemPermissionType TC_toolsJProfileredit;

/**
 * Permission to edit the Log Internal Tools page
 */
    public static SystemPermissionType TC_toolsLogedit;

/**
 * Permission to edit the ManagementBeans presented on Internal Tools
 * page
 */
    public static SystemPermissionType TC_toolsJMXBeansEdit;

/**
 * Permission to edit an organization's basic info.
 */
    public static SystemPermissionType TC_orgeditbasic;

/**
 * Permission to edit the Profiler Internal Tools page
 */
    public static SystemPermissionType TC_toolsProfileredit;

/**
 * Permission to edit the StartablePlugin Internal Tools page
 */
    public static SystemPermissionType TC_toolsPluginedit;

/**
 * Permission to edit language
 */
    public static SystemPermissionType TC_usereditlang;

/**
 * Permission to edit an existing user, except for roles, authority
 * limits, or attributes
 */
    public static SystemPermissionType TC_useredit;

/**
 * Permission to edit the WorkQueue Internal Tools page
 */
    public static SystemPermissionType TC_toolsWorkQueueedit;

/**
 * Permission to execute the data change.
 */
    public static SystemPermissionType TC_admindatachangeexec;

/**
 * Permission to grant or revoke roles
 */
    public static SystemPermissionType TC_usergrantroles;

/**
 * Permission to create, edit, or delete admin zones
 */
    public static SystemPermissionType TC_zonemanage;

/**
 * Permission to create, edit, or delete business week
 */
    public static SystemPermissionType TC_buswkmanage;

/**
 * Permission to create, edit, and delete regions
 */
    public static SystemPermissionType TC_regionmanage;

/**
 * Permission to create, edit, or delete roles
 */
    public static SystemPermissionType TC_rolemanage;

/**
 * Permission to create, edit, or delete script parameters
 */
    public static SystemPermissionType TC_scrprmmanage;

/**
 * Permission to view the ManageWorkflow page
 */
    public static SystemPermissionType TC_workflowmanage;

/**
 * Permission to purge objects from the database
 */
    public static SystemPermissionType TC_purge;

/**
 * Permission to resolve flag entries
 */
    public static SystemPermissionType TC_flagentryresolve;

/**
 * Permission to resync message
 */
    public static SystemPermissionType TC_resyncmessage;

/**
 * Permission to try to resend the failed message
 */
    public static SystemPermissionType TC_retrymessage;

/**
 * Permission to search for organizations.
 */
    public static SystemPermissionType TC_orgsearch;

/**
 * Permission to skip the failed message
 */
    public static SystemPermissionType TC_skipmessage;

/**
 * Permission to use the SOAP APIs
 */
    public static SystemPermissionType TC_soapadmin;

/**
 * Permission to search contact entries in the address book
 */
    public static SystemPermissionType TC_abviewsearch;

/**
 * Permission to view the details of contact entries in the address
 * book
 */
    public static SystemPermissionType TC_abview;

/**
 * Permission to view the list of admin zones
 */
    public static SystemPermissionType TC_zoneview;

/**
 * Permission to see users in all visible groups
 */
    public static SystemPermissionType TC_userviewall;

/**
 * Permission to access the BatchProcess Internal Tools page
 */
    public static SystemPermissionType TC_toolsBatchProcessview;

/**
 * Permission to view the list of business week
 */
    public static SystemPermissionType TC_buswkview;

/**
 * Permission to view the CacheInfo Internal Tools page
 */
    public static SystemPermissionType TC_toolsCacheinfoview;

/**
 * Permission to access the Cluster Internal Tools page
 */
    public static SystemPermissionType TC_toolsClusterview;

/**
 * Permission to view the details of a contact regardless of which
 * tag(s) it has
 */
    public static SystemPermissionType TC_anytagview;

/**
 * Permission to view the data change page.
 */
    public static SystemPermissionType TC_admindatachangeview;

/**
 * Permission to view the event messages page
 */
    public static SystemPermissionType TC_eventmessageview;

/**
 * Permission to see the user/group tree on the Administration tab
 */
    public static SystemPermissionType TC_grouptreeview;

/**
 * Permission to view details of a group
 */
    public static SystemPermissionType TC_groupview;

/**
 * Permission to access the Info Internal Tools page
 */
    public static SystemPermissionType TC_toolsInfoview;

/**
 * Permission to access the Log Internal Tools page
 */
    public static SystemPermissionType TC_toolsLogview;

/**
 * Permission to access the ManagementBeans Internal Tools page
 */
    public static SystemPermissionType TC_toolsJMXBeansview;

/**
 * Permission to view the merge pages
 */
    public static SystemPermissionType TC_abviewmerge;

/**
 * Permission to view notes
 */
    public static SystemPermissionType TC_noteview;

/**
 * Permission to view an organization's basic info.
 */
    public static SystemPermissionType TC_orgviewbasic;

/**
 * Permission to view the pending changes page
 */
    public static SystemPermissionType TC_abviewpending;

/**
 * Permission to access the Profiler Internal Tools page
 */
    public static SystemPermissionType TC_toolsProfilerview;

/**
 * Permission to view the list of regions and region details
 */
    public static SystemPermissionType TC_regionview;

/**
 * Permission to view the list of Reviews Summaries and the reviews
 * tab on an ABContact
 */
    public static SystemPermissionType TC_revsumviewlist;

/**
 * Permission view the Review Summary page to see the category scores
 * for each summarized Review
 */
    public static SystemPermissionType TC_revsumviewdetail;

/**
 * Permission to view the list of roles and role details
 */
    public static SystemPermissionType TC_roleview;

/**
 * Permission to view the list of script parameters or details of
 * an individual script parameter
 */
    public static SystemPermissionType TC_scrprmview;

/**
 * Permission to access the StartablePlugin Internal Tools page
 */
    public static SystemPermissionType TC_toolsPluginview;

/**
 * Permission to view details of a user
 */
    public static SystemPermissionType TC_userview;

/**
 * Permission to view the Workflow page
 */
    public static SystemPermissionType TC_workflowview;

/**
 * Permission to access the WorkQueue Internal Tools page
 */
    public static SystemPermissionType TC_toolsWorkQueueview;

/**
 * Administer report server settings
 */
    public static SystemPermissionType TC_reporting_admin;

/**
 * Permission to access debug tools, even when they are disabled by
 * a configuration parameter
 */
    public static SystemPermissionType TC_debugtools;

/**
 * Permission to approve any approval activity even if the activity
 * is assigned to someone else; the approver is still subject to authority
 * limit restrictions
 */
    public static SystemPermissionType TC_actapproveany;

/**
 * Permission to create new activities
 */
    public static SystemPermissionType TC_actcreate;

/**
 * Permission to create new activity patterns
 */
    public static SystemPermissionType TC_actpatcreate;

/**
 * Permission to add documents
 */
    public static SystemPermissionType TC_doccreate;

/**
 * Permission to create a new local contact
 */
    public static SystemPermissionType TC_ctccreate;

/**
 * Permission to add notes
 */
    public static SystemPermissionType TC_notecreate;

/**
 * Permission to delete activity patterns
 */
    public static SystemPermissionType TC_actpatdelete;

/**
 * Permission to remove documents
 */
    public static SystemPermissionType TC_docdelete;

/**
 * Permission to remove notes
 */
    public static SystemPermissionType TC_notedelete;

/**
 * Permission to edit activity patterns
 */
    public static SystemPermissionType TC_actpatedit;

/**
 * Permission to edit an existing local contact
 */
    public static SystemPermissionType TC_ctcedit;

/**
 * Permission to edit the notes
 */
    public static SystemPermissionType TC_noteedit;

/**
 * Permission to edit the body of notes
 */
    public static SystemPermissionType TC_noteeditbody;

/**
 * Permission to modify (edit/skip/close) activities owned by other
 * users
 */
    public static SystemPermissionType TC_acteditunowned;

/**
 * Permission to edit attributes for a user
 */
    public static SystemPermissionType TC_usereditattrs;

/**
 * Permission to get the next activity off of a queue
 */
    public static SystemPermissionType TC_actqueuenext;

/**
 * Permission to grant or change an authority limit for a user
 */
    public static SystemPermissionType TC_usergrantauth;

/**
 * Permission to set whether an activity is mandatory
 */
    public static SystemPermissionType TC_actmakemand;

/**
 * Permission to create, edit, or delete user attributes
 */
    public static SystemPermissionType TC_attrmanage;

/**
 * Permission to create, edit, and delete holidays
 */
    public static SystemPermissionType TC_holidaymanage;

/**
 * Permission to modify the load factors on all users and groups
 */
    public static SystemPermissionType TC_manageldfctrs;

/**
 * Permission to create, edit, and delete security zones
 */
    public static SystemPermissionType TC_seczonemanage;

/**
 * Permission to edit or delete all documents, regardless of the permissions
 * set on the individual documents
 */
    public static SystemPermissionType TC_docmodifyall;

/**
 * Permission to own an activity and to see the Desktop Activities
 * page
 */
    public static SystemPermissionType TC_actown;

/**
 * Permission to pick an activity from a queue
 */
    public static SystemPermissionType TC_actqueuepick;

/**
 * Permission to print listviews
 */
    public static SystemPermissionType TC_lvprint;

/**
 * Permission to reassign your own activities
 */
    public static SystemPermissionType TC_actraown;

/**
 * Permission to reassign activities owned by other users
 */
    public static SystemPermissionType TC_actraunown;

/**
 * Permission to review and approve manually-approved assignables
 */
    public static SystemPermissionType TC_actreviewassign;

/**
 * Permission to view activities
 */
    public static SystemPermissionType TC_actview;

/**
 * Permission to view activity calendar of other users
 */
    public static SystemPermissionType TC_viewactcal;

/**
 * Permission to view the list of activity patterns or activity pattern
 * details
 */
    public static SystemPermissionType TC_actpatview;

/**
 * Permission to view all activity queues, even those in other security
 * zones
 */
    public static SystemPermissionType TC_actviewallqueues;

/**
 * Permission to view all documents, regardless of the permissions
 * set on the individual documents
 */
    public static SystemPermissionType TC_docviewall;

/**
 * Permission to view the list of user attributes or attribute details
 */
    public static SystemPermissionType TC_attrview;

/**
 * Permission to view authority limit profiles
 */
    public static SystemPermissionType TC_alpview;

/**
 * Permission to view the Desktop
 */
    public static SystemPermissionType TC_viewdesktop;

/**
 * Permission to view documents
 */
    public static SystemPermissionType TC_docview;

/**
 * Permission to view global workload statistics of other users
 */
    public static SystemPermissionType TC_viewworkload;

/**
 * Permission to view a list of holidays or holiday details
 */
    public static SystemPermissionType TC_holidayview;

/**
 * Permission to view and search local contact entries
 */
    public static SystemPermissionType TC_ctcview;

/**
 * Permission to view the Report tab, if the add-on reporting module
 * is installed
 */
    public static SystemPermissionType TC_reporting_view;

/**
 * Permission to view the Search tab
 */
    public static SystemPermissionType TC_viewsearch;

/**
 * Permission to view the Team tab
 */
    public static SystemPermissionType TC_viewteam;

    private static void initValues0() {
      _TC_wsdatachangeedit = "TC_wsdatachangeedit";
      TC_wsdatachangeedit = new SystemPermissionType(_TC_wsdatachangeedit);
      _TC_integadmin = "TC_integadmin";
      TC_integadmin = new SystemPermissionType(_TC_integadmin);
      _TC_ruleadmin = "TC_ruleadmin";
      TC_ruleadmin = new SystemPermissionType(_TC_ruleadmin);
      _TC_internaltools = "TC_internaltools";
      TC_internaltools = new SystemPermissionType(_TC_internaltools);
      _TC_archive = "TC_archive";
      TC_archive = new SystemPermissionType(_TC_archive);
      _TC_changecontactsubtype = "TC_changecontactsubtype";
      TC_changecontactsubtype = new SystemPermissionType(_TC_changecontactsubtype);
      _TC_clientapp = "TC_clientapp";
      TC_clientapp = new SystemPermissionType(_TC_clientapp);
      _TC_abcreate = "TC_abcreate";
      TC_abcreate = new SystemPermissionType(_TC_abcreate);
      _TC_abcreatepref = "TC_abcreatepref";
      TC_abcreatepref = new SystemPermissionType(_TC_abcreatepref);
      _TC_anytagcreate = "TC_anytagcreate";
      TC_anytagcreate = new SystemPermissionType(_TC_anytagcreate);
      _TC_groupcreate = "TC_groupcreate";
      TC_groupcreate = new SystemPermissionType(_TC_groupcreate);
      _TC_orgcreate = "TC_orgcreate";
      TC_orgcreate = new SystemPermissionType(_TC_orgcreate);
      _TC_usercreate = "TC_usercreate";
      TC_usercreate = new SystemPermissionType(_TC_usercreate);
      _TC_abdelete = "TC_abdelete";
      TC_abdelete = new SystemPermissionType(_TC_abdelete);
      _TC_abdeletepref = "TC_abdeletepref";
      TC_abdeletepref = new SystemPermissionType(_TC_abdeletepref);
      _TC_anytagdelete = "TC_anytagdelete";
      TC_anytagdelete = new SystemPermissionType(_TC_anytagdelete);
      _TC_groupdelete = "TC_groupdelete";
      TC_groupdelete = new SystemPermissionType(_TC_groupdelete);
      _TC_orgdelete = "TC_orgdelete";
      TC_orgdelete = new SystemPermissionType(_TC_orgdelete);
      _TC_userdelete = "TC_userdelete";
      TC_userdelete = new SystemPermissionType(_TC_userdelete);
      _TC_abedit = "TC_abedit";
      TC_abedit = new SystemPermissionType(_TC_abedit);
      _TC_abeditpref = "TC_abeditpref";
      TC_abeditpref = new SystemPermissionType(_TC_abeditpref);
      _TC_toolsBatchProcessedit = "TC_toolsBatchProcessedit";
      TC_toolsBatchProcessedit = new SystemPermissionType(_TC_toolsBatchProcessedit);
      _TC_toolsClusteredit = "TC_toolsClusteredit";
      TC_toolsClusteredit = new SystemPermissionType(_TC_toolsClusteredit);
      _TC_anytagedit = "TC_anytagedit";
      TC_anytagedit = new SystemPermissionType(_TC_anytagedit);
      _TC_docedit = "TC_docedit";
      TC_docedit = new SystemPermissionType(_TC_docedit);
      _TC_groupedit = "TC_groupedit";
      TC_groupedit = new SystemPermissionType(_TC_groupedit);
      _TC_toolsJProfileredit = "TC_toolsJProfileredit";
      TC_toolsJProfileredit = new SystemPermissionType(_TC_toolsJProfileredit);
      _TC_toolsLogedit = "TC_toolsLogedit";
      TC_toolsLogedit = new SystemPermissionType(_TC_toolsLogedit);
      _TC_toolsJMXBeansEdit = "TC_toolsJMXBeansEdit";
      TC_toolsJMXBeansEdit = new SystemPermissionType(_TC_toolsJMXBeansEdit);
      _TC_orgeditbasic = "TC_orgeditbasic";
      TC_orgeditbasic = new SystemPermissionType(_TC_orgeditbasic);
      _TC_toolsProfileredit = "TC_toolsProfileredit";
      TC_toolsProfileredit = new SystemPermissionType(_TC_toolsProfileredit);
      _TC_toolsPluginedit = "TC_toolsPluginedit";
      TC_toolsPluginedit = new SystemPermissionType(_TC_toolsPluginedit);
      _TC_usereditlang = "TC_usereditlang";
      TC_usereditlang = new SystemPermissionType(_TC_usereditlang);
      _TC_useredit = "TC_useredit";
      TC_useredit = new SystemPermissionType(_TC_useredit);
      _TC_toolsWorkQueueedit = "TC_toolsWorkQueueedit";
      TC_toolsWorkQueueedit = new SystemPermissionType(_TC_toolsWorkQueueedit);
      _TC_admindatachangeexec = "TC_admindatachangeexec";
      TC_admindatachangeexec = new SystemPermissionType(_TC_admindatachangeexec);
      _TC_usergrantroles = "TC_usergrantroles";
      TC_usergrantroles = new SystemPermissionType(_TC_usergrantroles);
      _TC_zonemanage = "TC_zonemanage";
      TC_zonemanage = new SystemPermissionType(_TC_zonemanage);
      _TC_buswkmanage = "TC_buswkmanage";
      TC_buswkmanage = new SystemPermissionType(_TC_buswkmanage);
      _TC_regionmanage = "TC_regionmanage";
      TC_regionmanage = new SystemPermissionType(_TC_regionmanage);
      _TC_rolemanage = "TC_rolemanage";
      TC_rolemanage = new SystemPermissionType(_TC_rolemanage);
      _TC_scrprmmanage = "TC_scrprmmanage";
      TC_scrprmmanage = new SystemPermissionType(_TC_scrprmmanage);
      _TC_workflowmanage = "TC_workflowmanage";
      TC_workflowmanage = new SystemPermissionType(_TC_workflowmanage);
      _TC_purge = "TC_purge";
      TC_purge = new SystemPermissionType(_TC_purge);
      _TC_flagentryresolve = "TC_flagentryresolve";
      TC_flagentryresolve = new SystemPermissionType(_TC_flagentryresolve);
      _TC_resyncmessage = "TC_resyncmessage";
      TC_resyncmessage = new SystemPermissionType(_TC_resyncmessage);
      _TC_retrymessage = "TC_retrymessage";
      TC_retrymessage = new SystemPermissionType(_TC_retrymessage);
      _TC_orgsearch = "TC_orgsearch";
      TC_orgsearch = new SystemPermissionType(_TC_orgsearch);
      _TC_skipmessage = "TC_skipmessage";
      TC_skipmessage = new SystemPermissionType(_TC_skipmessage);
      _TC_soapadmin = "TC_soapadmin";
      TC_soapadmin = new SystemPermissionType(_TC_soapadmin);
      _TC_abviewsearch = "TC_abviewsearch";
      TC_abviewsearch = new SystemPermissionType(_TC_abviewsearch);
      _TC_abview = "TC_abview";
      TC_abview = new SystemPermissionType(_TC_abview);
      _TC_zoneview = "TC_zoneview";
      TC_zoneview = new SystemPermissionType(_TC_zoneview);
      _TC_userviewall = "TC_userviewall";
      TC_userviewall = new SystemPermissionType(_TC_userviewall);
      _TC_toolsBatchProcessview = "TC_toolsBatchProcessview";
      TC_toolsBatchProcessview = new SystemPermissionType(_TC_toolsBatchProcessview);
      _TC_buswkview = "TC_buswkview";
      TC_buswkview = new SystemPermissionType(_TC_buswkview);
      _TC_toolsCacheinfoview = "TC_toolsCacheinfoview";
      TC_toolsCacheinfoview = new SystemPermissionType(_TC_toolsCacheinfoview);
      _TC_toolsClusterview = "TC_toolsClusterview";
      TC_toolsClusterview = new SystemPermissionType(_TC_toolsClusterview);
      _TC_anytagview = "TC_anytagview";
      TC_anytagview = new SystemPermissionType(_TC_anytagview);
      _TC_admindatachangeview = "TC_admindatachangeview";
      TC_admindatachangeview = new SystemPermissionType(_TC_admindatachangeview);
      _TC_eventmessageview = "TC_eventmessageview";
      TC_eventmessageview = new SystemPermissionType(_TC_eventmessageview);
      _TC_grouptreeview = "TC_grouptreeview";
      TC_grouptreeview = new SystemPermissionType(_TC_grouptreeview);
      _TC_groupview = "TC_groupview";
      TC_groupview = new SystemPermissionType(_TC_groupview);
      _TC_toolsInfoview = "TC_toolsInfoview";
      TC_toolsInfoview = new SystemPermissionType(_TC_toolsInfoview);
      _TC_toolsLogview = "TC_toolsLogview";
      TC_toolsLogview = new SystemPermissionType(_TC_toolsLogview);
      _TC_toolsJMXBeansview = "TC_toolsJMXBeansview";
      TC_toolsJMXBeansview = new SystemPermissionType(_TC_toolsJMXBeansview);
      _TC_abviewmerge = "TC_abviewmerge";
      TC_abviewmerge = new SystemPermissionType(_TC_abviewmerge);
      _TC_noteview = "TC_noteview";
      TC_noteview = new SystemPermissionType(_TC_noteview);
      _TC_orgviewbasic = "TC_orgviewbasic";
      TC_orgviewbasic = new SystemPermissionType(_TC_orgviewbasic);
      _TC_abviewpending = "TC_abviewpending";
      TC_abviewpending = new SystemPermissionType(_TC_abviewpending);
      _TC_toolsProfilerview = "TC_toolsProfilerview";
      TC_toolsProfilerview = new SystemPermissionType(_TC_toolsProfilerview);
      _TC_regionview = "TC_regionview";
      TC_regionview = new SystemPermissionType(_TC_regionview);
      _TC_revsumviewlist = "TC_revsumviewlist";
      TC_revsumviewlist = new SystemPermissionType(_TC_revsumviewlist);
      _TC_revsumviewdetail = "TC_revsumviewdetail";
      TC_revsumviewdetail = new SystemPermissionType(_TC_revsumviewdetail);
      _TC_roleview = "TC_roleview";
      TC_roleview = new SystemPermissionType(_TC_roleview);
      _TC_scrprmview = "TC_scrprmview";
      TC_scrprmview = new SystemPermissionType(_TC_scrprmview);
      _TC_toolsPluginview = "TC_toolsPluginview";
      TC_toolsPluginview = new SystemPermissionType(_TC_toolsPluginview);
      _TC_userview = "TC_userview";
      TC_userview = new SystemPermissionType(_TC_userview);
      _TC_workflowview = "TC_workflowview";
      TC_workflowview = new SystemPermissionType(_TC_workflowview);
      _TC_toolsWorkQueueview = "TC_toolsWorkQueueview";
      TC_toolsWorkQueueview = new SystemPermissionType(_TC_toolsWorkQueueview);
      _TC_reporting_admin = "TC_reporting_admin";
      TC_reporting_admin = new SystemPermissionType(_TC_reporting_admin);
      _TC_debugtools = "TC_debugtools";
      TC_debugtools = new SystemPermissionType(_TC_debugtools);
      _TC_actapproveany = "TC_actapproveany";
      TC_actapproveany = new SystemPermissionType(_TC_actapproveany);
      _TC_actcreate = "TC_actcreate";
      TC_actcreate = new SystemPermissionType(_TC_actcreate);
      _TC_actpatcreate = "TC_actpatcreate";
      TC_actpatcreate = new SystemPermissionType(_TC_actpatcreate);
      _TC_doccreate = "TC_doccreate";
      TC_doccreate = new SystemPermissionType(_TC_doccreate);
      _TC_ctccreate = "TC_ctccreate";
      TC_ctccreate = new SystemPermissionType(_TC_ctccreate);
      _TC_notecreate = "TC_notecreate";
      TC_notecreate = new SystemPermissionType(_TC_notecreate);
      _TC_actpatdelete = "TC_actpatdelete";
      TC_actpatdelete = new SystemPermissionType(_TC_actpatdelete);
      _TC_docdelete = "TC_docdelete";
      TC_docdelete = new SystemPermissionType(_TC_docdelete);
      _TC_notedelete = "TC_notedelete";
      TC_notedelete = new SystemPermissionType(_TC_notedelete);
      _TC_actpatedit = "TC_actpatedit";
      TC_actpatedit = new SystemPermissionType(_TC_actpatedit);
      _TC_ctcedit = "TC_ctcedit";
      TC_ctcedit = new SystemPermissionType(_TC_ctcedit);
      _TC_noteedit = "TC_noteedit";
      TC_noteedit = new SystemPermissionType(_TC_noteedit);
      _TC_noteeditbody = "TC_noteeditbody";
      TC_noteeditbody = new SystemPermissionType(_TC_noteeditbody);
      _TC_acteditunowned = "TC_acteditunowned";
      TC_acteditunowned = new SystemPermissionType(_TC_acteditunowned);
      _TC_usereditattrs = "TC_usereditattrs";
      TC_usereditattrs = new SystemPermissionType(_TC_usereditattrs);
      _TC_actqueuenext = "TC_actqueuenext";
      TC_actqueuenext = new SystemPermissionType(_TC_actqueuenext);
      _TC_usergrantauth = "TC_usergrantauth";
      TC_usergrantauth = new SystemPermissionType(_TC_usergrantauth);
      _TC_actmakemand = "TC_actmakemand";
      TC_actmakemand = new SystemPermissionType(_TC_actmakemand);
      _TC_attrmanage = "TC_attrmanage";
      TC_attrmanage = new SystemPermissionType(_TC_attrmanage);
      _TC_holidaymanage = "TC_holidaymanage";
      TC_holidaymanage = new SystemPermissionType(_TC_holidaymanage);
      _TC_manageldfctrs = "TC_manageldfctrs";
      TC_manageldfctrs = new SystemPermissionType(_TC_manageldfctrs);
      _TC_seczonemanage = "TC_seczonemanage";
      TC_seczonemanage = new SystemPermissionType(_TC_seczonemanage);
      _TC_docmodifyall = "TC_docmodifyall";
      TC_docmodifyall = new SystemPermissionType(_TC_docmodifyall);
      _TC_actown = "TC_actown";
      TC_actown = new SystemPermissionType(_TC_actown);
      _TC_actqueuepick = "TC_actqueuepick";
      TC_actqueuepick = new SystemPermissionType(_TC_actqueuepick);
      _TC_lvprint = "TC_lvprint";
      TC_lvprint = new SystemPermissionType(_TC_lvprint);
      _TC_actraown = "TC_actraown";
      TC_actraown = new SystemPermissionType(_TC_actraown);
      _TC_actraunown = "TC_actraunown";
      TC_actraunown = new SystemPermissionType(_TC_actraunown);
      _TC_actreviewassign = "TC_actreviewassign";
      TC_actreviewassign = new SystemPermissionType(_TC_actreviewassign);
      _TC_actview = "TC_actview";
      TC_actview = new SystemPermissionType(_TC_actview);
      _TC_viewactcal = "TC_viewactcal";
      TC_viewactcal = new SystemPermissionType(_TC_viewactcal);
      _TC_actpatview = "TC_actpatview";
      TC_actpatview = new SystemPermissionType(_TC_actpatview);
      _TC_actviewallqueues = "TC_actviewallqueues";
      TC_actviewallqueues = new SystemPermissionType(_TC_actviewallqueues);
      _TC_docviewall = "TC_docviewall";
      TC_docviewall = new SystemPermissionType(_TC_docviewall);
      _TC_attrview = "TC_attrview";
      TC_attrview = new SystemPermissionType(_TC_attrview);
      _TC_alpview = "TC_alpview";
      TC_alpview = new SystemPermissionType(_TC_alpview);
      _TC_viewdesktop = "TC_viewdesktop";
      TC_viewdesktop = new SystemPermissionType(_TC_viewdesktop);
      _TC_docview = "TC_docview";
      TC_docview = new SystemPermissionType(_TC_docview);
      _TC_viewworkload = "TC_viewworkload";
      TC_viewworkload = new SystemPermissionType(_TC_viewworkload);
      _TC_holidayview = "TC_holidayview";
      TC_holidayview = new SystemPermissionType(_TC_holidayview);
      _TC_ctcview = "TC_ctcview";
      TC_ctcview = new SystemPermissionType(_TC_ctcview);
      _TC_reporting_view = "TC_reporting_view";
      TC_reporting_view = new SystemPermissionType(_TC_reporting_view);
      _TC_viewsearch = "TC_viewsearch";
      TC_viewsearch = new SystemPermissionType(_TC_viewsearch);
      _TC_viewteam = "TC_viewteam";
      TC_viewteam = new SystemPermissionType(_TC_viewteam);
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
    public static SystemPermissionType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SystemPermissionType enumeration = (SystemPermissionType) internalFromCode(value);
        if (enumeration == null) enumeration = (SystemPermissionType) internalFromCode("TC_" + value);
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
    public static SystemPermissionType fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static SystemPermissionType internalFromCode(java.lang.String value){
        SystemPermissionType enumeration = (SystemPermissionType)
            _table_.get(value);
        return enumeration;
    }
    public static SystemPermissionType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SystemPermissionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "SystemPermissionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
