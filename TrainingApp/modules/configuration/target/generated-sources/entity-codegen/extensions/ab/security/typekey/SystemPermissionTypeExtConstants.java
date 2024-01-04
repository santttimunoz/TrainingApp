
package extensions.ab.security.typekey;

import com.guidewire.commons.metadata.types.TypeKeyCache;
import gw.pl.persistence.typelist.TypeKeyReference;
import gw.pl.security.typekey.SystemPermissionType;

public final class SystemPermissionTypeExtConstants {

    /**
     * Create address book contacts
     * Permission to create a new contact in the address book
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ABCREATE = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "abcreate");
    /**
     * Create address book preferred vendors
     * Permission to add a preferred vendor to the address book
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ABCREATEPREF = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "abcreatepref");
    /**
     * Delete address book contacts
     * Permission to delete an existing contact in the address book
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ABDELETE = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "abdelete");
    /**
     * Delete address book preferred vendors
     * Permission to delete an existing preferred vendor address book entry
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ABDELETEPREF = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "abdeletepref");
    /**
     * Edit address book contacts
     * Permission to edit an existing contact in the address book
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ABEDIT = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "abedit");
    /**
     * Edit address book preferred vendors
     * Permission to modify an existing preferred vendor address book entry
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ABEDITPREF = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "abeditpref");
    /**
     * View address book contacts
     * Permission to view the details of contact entries in the address book
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ABVIEW = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "abview");
    /**
     * View merge
     * Permission to view the merge pages
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ABVIEWMERGE = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "abviewmerge");
    /**
     * View pending
     * Permission to view the pending changes page
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ABVIEWPENDING = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "abviewpending");
    /**
     * View address book contact search pages
     * Permission to search contact entries in the address book
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ABVIEWSEARCH = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "abviewsearch");
    /**
     * Approve any approval activity
     * Permission to approve any approval activity even if the activity is assigned to someone else; the approver is still subject to authority limit restrictions
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ACTAPPROVEANY = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "actapproveany");
    /**
     * Create activities
     * Permission to create new activities
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ACTCREATE = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "actcreate");
    /**
     * Edit unowned activities
     * Permission to modify (edit/skip/close) activities owned by other users
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ACTEDITUNOWNED = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "acteditunowned");
    /**
     * Make activities mandatory
     * Permission to set whether an activity is mandatory
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ACTMAKEMAND = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "actmakemand");
    /**
     * Own activity
     * Permission to own an activity and to see the Desktop Activities page
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ACTOWN = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "actown");
    /**
     * Create activity pattern
     * Permission to create new activity patterns
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ACTPATCREATE = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "actpatcreate");
    /**
     * Delete activity pattern
     * Permission to delete activity patterns
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ACTPATDELETE = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "actpatdelete");
    /**
     * Edit activity pattern
     * Permission to edit activity patterns
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ACTPATEDIT = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "actpatedit");
    /**
     * View activity pattern
     * Permission to view the list of activity patterns or activity pattern details
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ACTPATVIEW = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "actpatview");
    /**
     * Get next activity from queue
     * Permission to get the next activity off of a queue
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ACTQUEUENEXT = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "actqueuenext");
    /**
     * Pick activity from queue
     * Permission to pick an activity from a queue
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ACTQUEUEPICK = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "actqueuepick");
    /**
     * Reassign owned activities
     * Permission to reassign your own activities
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ACTRAOWN = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "actraown");
    /**
     * Reassign unowned activities
     * Permission to reassign activities owned by other users
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ACTRAUNOWN = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "actraunown");
    /**
     * Review assignments
     * Permission to review and approve manually-approved assignables
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ACTREVIEWASSIGN = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "actreviewassign");
    /**
     * View activities
     * Permission to view activities
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ACTVIEW = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "actview");
    /**
     * View all activity queues
     * Permission to view all activity queues, even those in other security zones
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ACTVIEWALLQUEUES = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "actviewallqueues");
    /**
     * Execute Data Change
     * Permission to execute the data change.
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ADMINDATACHANGEEXEC = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "admindatachangeexec");
    /**
     * View Data Change
     * Permission to view the data change page.
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ADMINDATACHANGEVIEW = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "admindatachangeview");
    /**
     * View authority limit profiles
     * Permission to view authority limit profiles
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ALPVIEW = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "alpview");
    /**
     * Create contact with any tag
     * Permission to create a new contact regardless of which tag(s) it has
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ANYTAGCREATE = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "anytagcreate");
    /**
     * Delete contact with any tag
     * Permission to delete a contact regardless of which tag(s) it has
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ANYTAGDELETE = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "anytagdelete");
    /**
     * Edit contact with any tag
     * Permission to edit the details of a contact regardless of which tag(s) it has
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ANYTAGEDIT = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "anytagedit");
    /**
     * View contact with any tag
     * Permission to view the details of a contact regardless of which tag(s) it has
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ANYTAGVIEW = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "anytagview");
    /**
     * Archive objects
     * Permission to archive objects
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ARCHIVE = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "archive");
    /**
     * Manage attributes
     * Permission to create, edit, or delete user attributes
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ATTRMANAGE = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "attrmanage");
    /**
     * View attributes
     * Permission to view the list of user attributes or attribute details
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ATTRVIEW = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "attrview");
    /**
     * Manage business week
     * Permission to create, edit, or delete business week
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_BUSWKMANAGE = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "buswkmanage");
    /**
     * View business week
     * Permission to view the list of business week
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_BUSWKVIEW = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "buswkview");
    /**
     * Change Contact Subtype
     * Permission to change contact subtype
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_CHANGECONTACTSUBTYPE = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "changecontactsubtype");
    /**
     * Client Application
     * Client Application (should not access via UI)
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_CLIENTAPP = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "clientapp");
    /**
     * Create local contacts
     * Permission to create a new local contact
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_CTCCREATE = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "ctccreate");
    /**
     * Edit local contacts
     * Permission to edit an existing local contact
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_CTCEDIT = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "ctcedit");
    /**
     * View local contacts
     * Permission to view and search local contact entries
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_CTCVIEW = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "ctcview");
    /**
     * Always access debug tools
     * Permission to access debug tools, even when they are disabled by a configuration parameter
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_DEBUGTOOLS = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "debugtools");
    /**
     * Create documents
     * Permission to add documents
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_DOCCREATE = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "doccreate");
    /**
     * Delete documents
     * Permission to remove documents
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_DOCDELETE = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "docdelete");
    /**
     * Edit documents
     * Permission to edit documents
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_DOCEDIT = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "docedit");
    /**
     * Modify all documents
     * Permission to edit or delete all documents, regardless of the permissions set on the individual documents
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_DOCMODIFYALL = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "docmodifyall");
    /**
     * View documents
     * Permission to view documents
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_DOCVIEW = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "docview");
    /**
     * View all documents
     * Permission to view all documents, regardless of the permissions set on the individual documents
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_DOCVIEWALL = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "docviewall");
    /**
     * View event messages
     * Permission to view the event messages page
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_EVENTMESSAGEVIEW = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "eventmessageview");
    /**
     * Resolve flag entries
     * Permission to resolve flag entries
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_FLAGENTRYRESOLVE = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "flagentryresolve");
    /**
     * Create groups
     * Permission to create groups
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_GROUPCREATE = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "groupcreate");
    /**
     * Delete groups
     * Permission to delete groups
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_GROUPDELETE = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "groupdelete");
    /**
     * Edit groups
     * Permission to edit groups
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_GROUPEDIT = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "groupedit");
    /**
     * View group tree
     * Permission to see the user/group tree on the Administration tab
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_GROUPTREEVIEW = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "grouptreeview");
    /**
     * View groups
     * Permission to view details of a group
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_GROUPVIEW = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "groupview");
    /**
     * Manage holidays
     * Permission to create, edit, and delete holidays
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_HOLIDAYMANAGE = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "holidaymanage");
    /**
     * View holidays
     * Permission to view a list of holidays or holiday details
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_HOLIDAYVIEW = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "holidayview");
    /**
     * Administer integration
     * Permission to administer integration events
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_INTEGADMIN = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "integadmin");
    /**
     * All internal tools
     * Permission to access all Internal Tools
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_INTERNALTOOLS = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "internaltools");
    /**
     * Print listviews
     * Permission to print listviews
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_LVPRINT = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "lvprint");
    /**
     * Manage load factors
     * Permission to modify the load factors on all users and groups
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_MANAGELDFCTRS = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "manageldfctrs");
    /**
     * Create notes
     * Permission to add notes
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_NOTECREATE = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "notecreate");
    /**
     * Delete notes
     * Permission to remove notes
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_NOTEDELETE = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "notedelete");
    /**
     * Edit note
     * Permission to edit the notes
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_NOTEEDIT = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "noteedit");
    /**
     * Edit note body
     * Permission to edit the body of notes
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_NOTEEDITBODY = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "noteeditbody");
    /**
     * View notes
     * Permission to view notes
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_NOTEVIEW = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "noteview");
    /**
     * Create organization
     * Permission to create an organization.
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ORGCREATE = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "orgcreate");
    /**
     * Delete organization
     * Permission to delete an organization.
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ORGDELETE = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "orgdelete");
    /**
     * Edit organization basic info
     * Permission to edit an organization's basic info.
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ORGEDITBASIC = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "orgeditbasic");
    /**
     * Search for organization
     * Permission to search for organizations.
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ORGSEARCH = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "orgsearch");
    /**
     * View organization basic info
     * Permission to view an organization's basic info.
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ORGVIEWBASIC = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "orgviewbasic");
    /**
     * Purge objects
     * Permission to purge objects from the database
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_PURGE = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "purge");
    /**
     * Manage regions
     * Permission to create, edit, and delete regions
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_REGIONMANAGE = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "regionmanage");
    /**
     * View regions
     * Permission to view the list of regions and region details
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_REGIONVIEW = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "regionview");
    /**
     * Administer reports
     * Administer report server settings
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_REPORTING_ADMIN = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "reporting_admin");
    /**
     * View Report tab
     * Permission to view the Report tab, if the add-on reporting module is installed
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_REPORTING_VIEW = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "reporting_view");
    /**
     * Resync message
     * Permission to resync message
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_RESYNCMESSAGE = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "resyncmessage");
    /**
     * Retry message
     * Permission to try to resend the failed message
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_RETRYMESSAGE = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "retrymessage");
    /**
     * View review summary details
     * Permission view the Review Summary page to see the category scores for each summarized Review
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_REVSUMVIEWDETAIL = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "revsumviewdetail");
    /**
     * View review summaries list
     * Permission to view the list of Reviews Summaries and the reviews tab on an ABContact
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_REVSUMVIEWLIST = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "revsumviewlist");
    /**
     * Manage roles
     * Permission to create, edit, or delete roles
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ROLEMANAGE = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "rolemanage");
    /**
     * View roles
     * Permission to view the list of roles and role details
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ROLEVIEW = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "roleview");
    /**
     * Administer rules
     * Permission to run Guidewire Studio or import rules
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_RULEADMIN = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "ruleadmin");
    /**
     * Manage script parameters
     * Permission to create, edit, or delete script parameters
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_SCRPRMMANAGE = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "scrprmmanage");
    /**
     * View script parameters
     * Permission to view the list of script parameters or details of an individual script parameter
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_SCRPRMVIEW = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "scrprmview");
    /**
     * Manage security zones
     * Permission to create, edit, and delete security zones
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_SECZONEMANAGE = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "seczonemanage");
    /**
     * Skip message
     * Permission to skip the failed message
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_SKIPMESSAGE = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "skipmessage");
    /**
     * SOAP administration
     * Permission to use the SOAP APIs
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_SOAPADMIN = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "soapadmin");
    /**
     * Edit BatchProcess tools page
     * Permission to edit the BatchProcess Internal Tools page
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_TOOLSBATCHPROCESSEDIT = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "toolsBatchProcessedit");
    /**
     * View BatchProcess tools page
     * Permission to access the BatchProcess Internal Tools page
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_TOOLSBATCHPROCESSVIEW = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "toolsBatchProcessview");
    /**
     * View Cache Info page
     * Permission to view the CacheInfo Internal Tools page
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_TOOLSCACHEINFOVIEW = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "toolsCacheinfoview");
    /**
     * Edit Cluster tools page
     * Permission to edit the Cluster Internal Tools page
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_TOOLSCLUSTEREDIT = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "toolsClusteredit");
    /**
     * View Cluster tools page
     * Permission to access the Cluster Internal Tools page
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_TOOLSCLUSTERVIEW = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "toolsClusterview");
    /**
     * View Info tools page
     * Permission to access the Info Internal Tools page
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_TOOLSINFOVIEW = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "toolsInfoview");
    /**
     * Edit ManagementBeans tools page
     * Permission to edit the ManagementBeans presented on Internal Tools page
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_TOOLSJMXBEANSEDIT = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "toolsJMXBeansEdit");
    /**
     * View ManagementBeans tools page
     * Permission to access the ManagementBeans Internal Tools page
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_TOOLSJMXBEANSVIEW = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "toolsJMXBeansview");
    /**
     * Edit JProfiler tools page
     * Permission to edit the JProfiler Internal Tools page
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_TOOLSJPROFILEREDIT = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "toolsJProfileredit");
    /**
     * Edit Log tools page
     * Permission to edit the Log Internal Tools page
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_TOOLSLOGEDIT = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "toolsLogedit");
    /**
     * View Log tools page
     * Permission to access the Log Internal Tools page
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_TOOLSLOGVIEW = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "toolsLogview");
    /**
     * Edit StartablePlugin tools page
     * Permission to edit the StartablePlugin Internal Tools page
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_TOOLSPLUGINEDIT = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "toolsPluginedit");
    /**
     * View StartablePlugin tools page
     * Permission to access the StartablePlugin Internal Tools page
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_TOOLSPLUGINVIEW = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "toolsPluginview");
    /**
     * Edit Profiler tools page
     * Permission to edit the Profiler Internal Tools page
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_TOOLSPROFILEREDIT = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "toolsProfileredit");
    /**
     * View Profiler tools page
     * Permission to access the Profiler Internal Tools page
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_TOOLSPROFILERVIEW = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "toolsProfilerview");
    /**
     * Edit WorkQueue tools page
     * Permission to edit the WorkQueue Internal Tools page
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_TOOLSWORKQUEUEEDIT = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "toolsWorkQueueedit");
    /**
     * View WorkQueue tools page
     * Permission to access the WorkQueue Internal Tools page
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_TOOLSWORKQUEUEVIEW = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "toolsWorkQueueview");
    /**
     * Create users
     * Permission to create a new user
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_USERCREATE = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "usercreate");
    /**
     * Delete users
     * Permission to delete a user (Note: if a user has had any activity it's recommended to make them non-active rather than delete)
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_USERDELETE = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "userdelete");
    /**
     * Edit users
     * Permission to edit an existing user, except for roles, authority limits, or attributes
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_USEREDIT = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "useredit");
    /**
     * Edit user attributes
     * Permission to edit attributes for a user
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_USEREDITATTRS = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "usereditattrs");
    /**
     * Edit user language
     * Permission to edit language
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_USEREDITLANG = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "usereditlang");
    /**
     * Grant authority limits
     * Permission to grant or change an authority limit for a user
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_USERGRANTAUTH = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "usergrantauth");
    /**
     * Grant roles to users
     * Permission to grant or revoke roles
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_USERGRANTROLES = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "usergrantroles");
    /**
     * View user
     * Permission to view details of a user
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_USERVIEW = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "userview");
    /**
     * View all users
     * Permission to see users in all visible groups
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_USERVIEWALL = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "userviewall");
    /**
     * View activity calendar
     * Permission to view activity calendar of other users
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_VIEWACTCAL = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "viewactcal");
    /**
     * View Desktop
     * Permission to view the Desktop
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_VIEWDESKTOP = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "viewdesktop");
    /**
     * View Search
     * Permission to view the Search tab
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_VIEWSEARCH = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "viewsearch");
    /**
     * View team
     * Permission to view the Team tab
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_VIEWTEAM = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "viewteam");
    /**
     * View global workload
     * Permission to view global workload statistics of other users
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_VIEWWORKLOAD = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "viewworkload");
    /**
     * Manage workflow
     * Permission to view the ManageWorkflow page
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_WORKFLOWMANAGE = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "workflowmanage");
    /**
     * View workflow
     * Permission to view the Workflow page
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_WORKFLOWVIEW = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "workflowview");
    /**
     * Add Data Change
     * Permission to add a data change gosu program.
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_WSDATACHANGEEDIT = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "wsdatachangeedit");
    /**
     * Manage admin zones
     * Permission to create, edit, or delete admin zones
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ZONEMANAGE = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "zonemanage");
    /**
     * View admin zones
     * Permission to view the list of admin zones
     * 
     */
    public final static TypeKeyReference<SystemPermissionType> TC_ZONEVIEW = new TypeKeyCache<SystemPermissionType>(SystemPermissionType.TYPE, "zoneview");

}
