function  WWHBookData_AddTOCEntries(P)
{
var A=P.fN("About PolicyCenter Documentation","1");
var B=A.fN("Conventions in This Document","1#2127434");
B=A.fN("Support","1#2127480");
A=P.fN("Planning the Upgrade","2#1034444");
B=A.fN("Planning Your PolicyCenter Upgrade","3");
var C=B.fN("Supported Starting Version","4");
var D=C.fN("Upgrading from Version 3.0","4#1651883");
C=B.fN("Upgrading Language Packs","5");
C=B.fN("Roadmap for Planning the Upgrade","6");
C=B.fN("Upgrade Assessment","7");
C=B.fN("Preparing for the Upgrade","8");
C=B.fN("Project Inception","9");
C=B.fN("Design and Development","10");
C=B.fN("System Test","11");
C=B.fN("Deployment and Support","12");
D=C.fN("Sample Deployment Plan","12#1119035");
A=P.fN("Upgrading from 8.0.x","13#1340660");
B=A.fN("Upgrading the PolicyCenter 8.0.x Configuration","14");
C=B.fN("Overview of ContactManager Upgrade","15");
C=B.fN("Obtaining Configurations and Tools","16");
D=C.fN("Viewing Differences Between Base and Target Releases","16#1919294");
D=C.fN("Specifying Configuration and Tool Locations","16#1919316");
C=B.fN("Creating a Configuration Backup","17");
D=C.fN("Backing up the Configuration","17#1919455");
D=C.fN("Backing up the Product Model","17#1919469");
C=B.fN("Removing Patches","18");
C=B.fN("Removing Language Packs","19");
C=B.fN("Updating Infrastructure","20");
C=B.fN("Launching the PolicyCenter 8.0.4 Configuration Upgrade Tool","21");
D=C.fN("Restarting the Configuration Upgrade Tool","21#1919547");
C=B.fN("Configuration Upgrade Tool Automated Steps","22");
D=C.fN("Copying Custom Rules and Adding PolicyCenter 8.0.4 Default Rules","22#1919608");
D=C.fN("Renaming Parameter","22#1919624");
D=C.fN("Updating Product Model Structure","22#1919626");
C=B.fN("Using the PolicyCenter 8.0.4 Upgrade Tool Interface","23");
D=C.fN("Filters","23#1919686");
D=C.fN("Configuration File Tree","23#1919878");
D=C.fN("File Details Panel","23#1919880");
D=C.fN("Accepting Files that Do Not Require Merging","23#1919911");
D=C.fN("Merging and Accepting Files","23#1919921");
C=B.fN("Merging Product Model Files","24");
C=B.fN("Configuration Merging Guidelines","25");
C=B.fN("Data Model Merging Guidelines","26");
D=C.fN("Merging Typelists \u2013 Overview","26#1919964");
D=C.fN("Merging Typelists \u2013 Simple Typelists","26#1919974");
D=C.fN("Merging Typelists \u2013 Complex Typelists","26#1919995");
D=C.fN("Reviewing Shared Typekey Configuration","26#1920026");
D=C.fN("Merging Entity Extensions","26#1920078");
D=C.fN("Reviewing Custom Extensions","26#1920101");
D=C.fN("Reconciling the Database with Custom Extensions","26#1920116");
C=B.fN("Updating Product Model API Calls","27");
C=B.fN("Merging Display Properties","28");
C=B.fN("Upgrading Rules to PolicyCenter 8.0.4","29");
C=B.fN("Translating New Display Properties and Typecodes","30");
C=B.fN("Validating the PolicyCenter 8.0.4 Configuration","31");
D=C.fN("Using Studio to Verify Files","31#1920440");
D=C.fN("Starting PolicyCenter and Resolving Errors","31#1920466");
C=B.fN("Importing Policy Forms","32");
C=B.fN("Building and Deploying PolicyCenter 8.0.4","33");
B=A.fN("Upgrading the PolicyCenter 8.0.x Database","34");
C=B.fN("Upgrading Administration Data for Testing","35");
C=B.fN("Identifying Data Model Issues","36");
C=B.fN("Verifying Batch Process and Work Queue Completion","37");
C=B.fN("Purging Data Prior to Upgrade","38");
D=C.fN("Purging Old Messages from the Database","38#1913324");
D=C.fN("Purging Completed Workflows and Workflow Logs","38#1913370");
C=B.fN("Validating the Database Schema","39");
C=B.fN("Checking Database Consistency","40");
C=B.fN("Creating a Data Distribution Report","41");
C=B.fN("Generating Database Statistics","42");
C=B.fN("Creating a Database Backup","43");
C=B.fN("Updating Database Infrastructure","44");
C=B.fN("Preparing the Database for Upgrade","45");
D=C.fN("Ensuring Adequate Free Space","45#1914227");
D=C.fN("Disabling Replication","45#1914229");
D=C.fN("Assigning Default Tablespace (Oracle only)","45#1914231");
C=B.fN("Setting Linguistic Search Collation","46");
C=B.fN("Customizing the Upgrade","47");
D=C.fN("Running Custom Version Checks and Triggers","47#1913556");
D=C.fN("IDatamodelUpgrade API Examples","47#1913741");
D=C.fN("Upgrading Archived Entities","47#1914081");
C=B.fN("Configuring the Database Upgrade","48");
D=C.fN("Adjusting Commit Size for Encryption","48#1914255");
D=C.fN("Configuring Version Trigger Elements","48#1914271");
D=C.fN("Deferring Creation of Nonessential Indexes","48#1914360");
D=C.fN("Configuring the Upgrade on Oracle","48#1914409");
D=C.fN("Configuring the Upgrade on SQL Server","48#1914499");
D=C.fN("Downloading Database Upgrade Instrumentation Details","48#1845518");
C=B.fN("Checking the Database Before Upgrade","49");
C=B.fN("Disabling the Scheduler","50");
C=B.fN("Suspending Message Destinations","51");
C=B.fN("Starting the Server to Begin Automatic Database Upgrade","52");
D=C.fN("Test the Database Upgrade","52#1914553");
D=C.fN("Integrations and Starting the Server","52#1914564");
D=C.fN("Understanding the Automatic Database Upgrade","52#1914570");
D=C.fN("Version Trigger Descriptions","52#1914589");
C=B.fN("Viewing Detailed Database Upgrade Information","53");
C=B.fN("Dropping Unused Columns on Oracle","54");
C=B.fN("Reloading Rating Sample Data","55");
C=B.fN("Exporting Administration Data for Testing","56");
C=B.fN("Final Steps After The Database Upgrade is Complete","57");
D=C.fN("Checking that Contacts Have Unique Addresses","57#1888838");
D=C.fN("Completing Deferred Upgrade","57#1885327");
D=C.fN("Reenabling Database Logging","57#1895788");
D=C.fN("Backing up the Database After Upgrade","57#1500506");
B=A.fN("Upgrading PolicyCenter from 8.0.x for ContactManager","58");
C=B.fN("Manually Upgrading PolicyCenter to Integrate with ContactManager","59");
C=B.fN("File Changes in PolicyCenter Related to ContactManager","60");
D=C.fN("Web Service Version Changes","60#2264226");
D=C.fN("PolicyCenter Can Generate and Send Unique IDs for New Contacts","60#2265391");
B=A.fN("Upgrading ContactManager from 8.0.x","61");
C=B.fN("Manually Upgrading the ContactManager Configuration","62");
D=C.fN("Manually Configuring Changed Files","62#2272626");
D=C.fN("BillingCenter Web Services Version Change","62#2272836");
A=P.fN("Upgrading from 7.0.x","63#1340660");
B=A.fN("Upgrading the PolicyCenter 7.0.x Configuration","64");
C=B.fN("Overview of ContactManager Upgrade","65");
C=B.fN("Obtaining Configurations and Tools","66");
D=C.fN("Viewing Differences Between Base and Target Releases","66#1932325");
D=C.fN("Specifying Configuration and Tool Locations","66#1932347");
C=B.fN("Creating a Configuration Backup","67");
D=C.fN("Backing up the Configuration","67#1932486");
D=C.fN("Backing up the Product Model","67#1932500");
C=B.fN("Removing Patches","68");
C=B.fN("Removing Language Packs","69");
C=B.fN("Updating Infrastructure","70");
C=B.fN("Launching the PolicyCenter 8.0.4 Configuration Upgrade Tool","71");
D=C.fN("Restarting the Configuration Upgrade Tool","71#1932578");
C=B.fN("Configuration Upgrade Tool Automated Steps","72");
D=C.fN("Removing Template Pages","72#1932658");
D=C.fN("Updating PCF Files","72#1932666");
D=C.fN("Upgrading Work Queue Configuration","72#1932826");
D=C.fN("Upgrading Database Configuration","72#1932836");
D=C.fN("Splitting Localization.xml into Separate Files for each Locale","72#1932897");
D=C.fN("Splitting address-config.xml into Separate Files for each Country","72#1932905");
D=C.fN("Splitting zone-config.xml into Separate Files for each Country","72#1932913");
D=C.fN("Splitting currencies.xml into Separate Files for each Currency","72#1932921");
D=C.fN("Moving Country-based Field Validator Definition Files","72#1932926");
D=C.fN("Moving Rules Files up One Directory","72#1932928");
D=C.fN("Reformatting Rules for Display in Studio Rules Editor","72#1932930");
D=C.fN("Copying Custom Rules and Adding PolicyCenter 8.0.4 Default Rules","72#1932938");
D=C.fN("Renaming SOAP Web Services from XML to RWS","72#1932954");
D=C.fN("Renaming Plugins from XML to GWP","72#1932956");
D=C.fN("Renaming Display Names Files from XML to EN","72#1932958");
D=C.fN("Upgrading Display Keys","72#1932961");
D=C.fN("Adding nullok=\"true\" to Entity and Extension Foreign Key Columns","72#1932982");
D=C.fN("Removing deletefk Attribute from Entity and Extension Foreign Keys","72#1932987");
D=C.fN("Setting XML Namespace on Metadata Files","72#1932989");
D=C.fN("Upgrading Document Assistant Parameters","72#1933002");
D=C.fN("Separating Entities and Typelists","72#1933016");
D=C.fN("Adding Default Currency on CovTermOpt and CovTermPack Nodes","72#1933026");
D=C.fN("Adding Currency Filters to Choice Lookup Table Configurations","72#1933028");
D=C.fN("Adding CovTermLimits to DirectCovTermPattern","72#1933030");
D=C.fN("Adding CovTermDefault to OptionCovTermPattern","72#1933032");
D=C.fN("Adding Default Currency to PolicyLinePattern","72#1933034");
D=C.fN("Setting Default Answer for Questions with BooleanCheckbox Format","72#1933036");
D=C.fN("Setting questionPostOnChange to auto","72#1933038");
D=C.fN("Normalizing Dates in the Product Model to a Standard Format","72#1933040");
D=C.fN("Removing splitOnAnniversary from Product Line Configuration","72#1933042");
C=B.fN("Using the PolicyCenter 8.0.4 Upgrade Tool Interface","73");
D=C.fN("Filters","73#1933087");
D=C.fN("Configuration File Tree","73#1933279");
D=C.fN("File Details Panel","73#1933281");
D=C.fN("Accepting Files that Do Not Require Merging","73#1933312");
D=C.fN("Merging and Accepting Files","73#1933322");
C=B.fN("Merging Product Model Files","74");
D=C.fN("Specifying ValueType on Coverage Terms","74#1935007");
D=C.fN("Dropping Custom Rating Worksheet Tables","74#1935060");
D=C.fN("Deleting CoverageSymbolGroup from Coverage","74#1934985");
C=B.fN("Configuration Merging Guidelines","75");
C=B.fN("Data Model Merging Guidelines","76");
D=C.fN("Updating Data Types for Case Sensitivity","76#1933365");
D=C.fN("Merging Typelists \u2013 Overview","76#1933373");
D=C.fN("Merging Typelists \u2013 Simple Typelists","76#1933383");
D=C.fN("Merging Typelists \u2013 Complex Typelists","76#1933404");
D=C.fN("Reviewing Shared Typekey Configuration","76#1933435");
D=C.fN("Adding State Typelist Extensions to Jurisdiction","76#1933463");
D=C.fN("Merging Entity Extensions","76#1933497");
D=C.fN("Reviewing Custom Extensions","76#1933555");
D=C.fN("Reconciling the Database with Custom Extensions","76#1933570");
D=C.fN("Removing Obsolete Attributes","76#1933572");
D=C.fN("Updating Extractable Edge Foreign Keys","76#1933574");
D=C.fN("Converting Money to MonetaryAmount","76#1933580");
C=B.fN("Updating Product Model API Calls","77");
C=B.fN("Merging PolicyCenter Typelists","78");
D=C.fN("GLCoverageFormType","78#1933640");
D=C.fN("PercentDuplicated","78#1933696");
D=C.fN("ReceptacleType","78#1933699");
D=C.fN("GLStateCostType","78#1933702");
C=B.fN("Changes to the Logging API","79");
D=C.fN("Conceptual Changes to Logging","79#1933720");
D=C.fN("Instantiating Loggers","79#1933777");
D=C.fN("Logging Messages","79#1933807");
D=C.fN("Passing Loggers as Parameters","79#1933820");
C=B.fN("Merging Enhancements","80");
C=B.fN("Updating PolicyPeriodPlugin.gs","81");
C=B.fN("Consider Enabling Check for Small Cost Changes","82");
C=B.fN("Merging Claim Details PCF Files","83");
C=B.fN("Adding DDL Configuration Options to database-config.xml","84");
C=B.fN("Merging Changes to Field Validators","85");
C=B.fN("Renaming PCF files According to Their Modes","86");
C=B.fN("Refactoring Line of Business Code","87");
C=B.fN("Merging Display Properties","88");
C=B.fN("Merging Other Files","89");
C=B.fN("Fixing Gosu Issues","90");
D=C.fN("Gosu Case Sensitivity","90#1934229");
D=C.fN("Inequality Operator","90#1934250");
D=C.fN("Ambiguous Method Calls","90#1934267");
D=C.fN("Nested Comments","90#1934287");
C=B.fN("Upgrading Rules to PolicyCenter 8.0.4","91");
D=C.fN("Rules Required for Free Text Search","91#1934556");
C=B.fN("Translating New Display Properties and Typecodes","92");
C=B.fN("Validating the PolicyCenter 8.0.4 Configuration","93");
D=C.fN("Using Studio to Verify Files","93#1934786");
D=C.fN("Starting PolicyCenter and Resolving Errors","93#1934812");
C=B.fN("Importing Policy Forms","94");
C=B.fN("Building and Deploying PolicyCenter 8.0.4","95");
B=A.fN("Upgrading the PolicyCenter 7.0.x Database","96");
C=B.fN("Upgrading Administration Data for Testing","97");
C=B.fN("Identifying Data Model Issues","98");
C=B.fN("Verifying Batch Process and Work Queue Completion","99");
C=B.fN("Purging Data Prior to Upgrade","100");
D=C.fN("Purging Old Messages from the Database","100#1930189");
D=C.fN("Purging Completed Workflows and Workflow Logs","100#1930235");
C=B.fN("Validating the Database Schema","101");
C=B.fN("Checking Database Consistency","102");
C=B.fN("Creating a Data Distribution Report","103");
C=B.fN("Generating Database Statistics","104");
C=B.fN("Creating a Database Backup","105");
C=B.fN("Updating Database Infrastructure","106");
C=B.fN("Preparing the Database for Upgrade","107");
D=C.fN("Ensuring Adequate Free Space","107#1930444");
D=C.fN("Disabling Replication","107#1930446");
D=C.fN("Assigning Default Tablespace (Oracle only)","107#1930448");
C=B.fN("Setting Linguistic Search Collation","108");
C=B.fN("Customizing the Upgrade","109");
D=C.fN("Running Custom Version Checks and Triggers","109#1930606");
D=C.fN("IDatamodelUpgrade API Examples","109#1930791");
D=C.fN("Upgrading Archived Entities","109#1931131");
C=B.fN("Configuring the Database Upgrade","110");
D=C.fN("Adjusting Commit Size for Encryption","110#1931286");
D=C.fN("Configuring Version Trigger Elements","110#1931302");
D=C.fN("Deferring Creation of Nonessential Indexes","110#1931391");
D=C.fN("Configuring the Upgrade on Oracle","110#1931440");
D=C.fN("Configuring the Upgrade on SQL Server","110#1931530");
D=C.fN("Downloading Database Upgrade Instrumentation Details","110#1845518");
C=B.fN("Checking the Database Before Upgrade","111");
C=B.fN("Disabling the Scheduler","112");
C=B.fN("Suspending Message Destinations","113");
C=B.fN("Starting the Server to Begin Automatic Database Upgrade","114");
D=C.fN("Test the Database Upgrade","114#1931588");
D=C.fN("Integrations and Starting the Server","114#1931599");
D=C.fN("Understanding the Automatic Database Upgrade","114#1931605");
D=C.fN("Version Trigger Descriptions","114#1931624");
C=B.fN("Viewing Detailed Database Upgrade Information","115");
C=B.fN("Dropping Unused Columns on Oracle","116");
C=B.fN("Reloading Rating Sample Data","117");
C=B.fN("Exporting Administration Data for Testing","118");
C=B.fN("Upgrading Phone Numbers","119");
C=B.fN("Final Steps After The Database Upgrade is Complete","120");
D=C.fN("Completing Deferred Upgrade","120#1885327");
D=C.fN("Reenabling Database Logging","120#1901897");
D=C.fN("Checking that Contacts Have Unique Addresses","120#1901927");
D=C.fN("Backing up the Database After Upgrade","120#1500506");
B=A.fN("Upgrading PolicyCenter from 7.0.x for ContactManager","121");
C=B.fN("Configuration File Changes in PolicyCenter","122");
C=B.fN("Manually Upgrading PolicyCenter to Integrate with ContactManager","123");
D=C.fN("Mapping Your Contact Extensions","123#2260247");
D=C.fN("Parameter transactionId Removed from ContactManager Web Services","123#2261203");
B=A.fN("Upgrading ContactManager from 7.0.x","124");
C=B.fN("Database Upgrade Steps in ContactManager","125");
D=C.fN("Preserving MatchSetKey Column Data","125#2271909");
D=C.fN("Ensuring that LinkID Is Unique","125#2271944");
C=B.fN("Configuration File Changes in ContactManager","126");
D=C.fN("Manually Configuring Changed Files","126#2251100");
A=P.fN("Upgrading from 4.0.x","127#1340664");
B=A.fN("Upgrading the PolicyCenter 4.0.x Configuration","128");
C=B.fN("Obtaining Configurations","129");
D=C.fN("Viewing Differences Between Base and Target Releases","129#1888709");
D=C.fN("Specifying Configuration Locations for PolicyCenter 7.0 Upgrade Tool","129#1888724");
C=B.fN("Creating a Configuration Backup","130");
D=C.fN("Backing up the Configuration","130#1953015");
D=C.fN("Backing up the Product Model","130#1953029");
C=B.fN("Removing Patches","131");
C=B.fN("Removing Language Packs","132");
C=B.fN("Updating Infrastructure","133");
C=B.fN("Upgrading the PolicyCenter 4.0 Configuration to 7.0","134");
D=C.fN("Launching the PolicyCenter 7.0 Configuration Upgrade Tool","134#1889011");
D=C.fN("Restarting the Configuration Upgrade Tool","134#1889033");
C=B.fN("PolicyCenter 7.0 Upgrade Tool Automated Steps","135");
D=C.fN("Moving Typelist Localizations into typelist.properties Files","135#1951857");
D=C.fN("Removing Redundant TTX Files","135#1951874");
D=C.fN("Removing searchTypeVisible Attribute from DateCriterionChoiceInputNode","135#1951881");
D=C.fN("Copying Display Properties Files into Target Configuration","135#1951883");
D=C.fN("Copying Custom Rules and Adding PolicyCenter 8.0.4 Default Rules","135#1951899");
D=C.fN("Referencing XSD Files","135#1951919");
D=C.fN("Removing AdminTable Delegate from Custom Extensions","135#1951924");
D=C.fN("Converting sessiontimeoutsecs Security Element to Parameter","135#1951927");
D=C.fN("Removing Redundant Batch Server Parameter","135#1951933");
D=C.fN("Upgrading Question Sets and Questions","135#1951974");
D=C.fN("Converting Form Pattern XML into Import XML","135#1952014");
D=C.fN("Mapping Custom Inference Classes to Form Codes","135#1952022");
D=C.fN("Deleting Form Pattern Files and Directories","135#1952024");
D=C.fN("Deleting Form Display Keys","135#1952026");
D=C.fN("Creating Jurisdiction Typelist","135#1952028");
D=C.fN("Renaming System Tables","135#1952038");
C=B.fN("Configuring the PolicyCenter 8.0 Upgrade Tool","136");
C=B.fN("Launching the PolicyCenter 8.0 Configuration Upgrade Tool","137");
D=C.fN("Restarting the Configuration Upgrade Tool","137#1889774");
C=B.fN("PolicyCenter 8.0.4 Configuration Upgrade Tool Automated Steps","138");
D=C.fN("Removing Template Pages","138#1950716");
D=C.fN("Updating PCF Files","138#1950724");
D=C.fN("Upgrading Work Queue Configuration","138#1950884");
D=C.fN("Upgrading Database Configuration","138#1950894");
D=C.fN("Splitting Localization.xml into Separate Files for each Locale","138#1950955");
D=C.fN("Splitting address-config.xml into Separate Files for each Country","138#1950963");
D=C.fN("Splitting zone-config.xml into Separate Files for each Country","138#1950971");
D=C.fN("Splitting currencies.xml into Separate Files for each Currency","138#1950979");
D=C.fN("Moving Country-based Field Validator Definition Files","138#1950984");
D=C.fN("Moving Rules Files up One Directory","138#1950986");
D=C.fN("Reformatting Rules for Display in Studio Rules Editor","138#1950988");
D=C.fN("Copying Custom Rules and Adding PolicyCenter 8.0.4 Default Rules","138#1950996");
D=C.fN("Renaming SOAP Web Services from XML to RWS","138#1951012");
D=C.fN("Renaming Plugins from XML to GWP","138#1951014");
D=C.fN("Renaming Display Names Files from XML to EN","138#1951016");
D=C.fN("Upgrading Display Keys","138#1951019");
D=C.fN("Adding nullok=\"true\" to Entity and Extension Foreign Key Columns","138#1951040");
D=C.fN("Removing deletefk Attribute from Entity and Extension Foreign Keys","138#1951045");
D=C.fN("Setting XML Namespace on Metadata Files","138#1951047");
D=C.fN("Upgrading Document Assistant Parameters","138#1951060");
D=C.fN("Separating Entities and Typelists","138#1951074");
D=C.fN("Adding Default Currency on CovTermOpt and CovTermPack Nodes","138#1951084");
D=C.fN("Adding Currency Filters to Choice Lookup Table Configurations","138#1951086");
D=C.fN("Adding CovTermLimits to DirectCovTermPattern","138#1951088");
D=C.fN("Adding CovTermDefault to OptionCovTermPattern","138#1951090");
D=C.fN("Adding Default Currency to PolicyLinePattern","138#1951092");
D=C.fN("Setting Default Answer for Questions with BooleanCheckbox Format","138#1951094");
D=C.fN("Setting questionPostOnChange to auto","138#1951096");
D=C.fN("Normalizing Dates in the Product Model to a Standard Format","138#1951098");
D=C.fN("Removing splitOnAnniversary from Product Line Configuration","138#1951100");
C=B.fN("Using the PolicyCenter 8.0.4 Upgrade Tool Interface","139");
D=C.fN("Filters","139#1950434");
D=C.fN("Configuration File Tree","139#1950626");
D=C.fN("File Details Panel","139#1950628");
D=C.fN("Accepting Files that Do Not Require Merging","139#1950659");
D=C.fN("Merging and Accepting Files","139#1950669");
C=B.fN("Merging Product Model Files","140");
D=C.fN("Specifying ValueType on Coverage Terms","140#1953283");
D=C.fN("Dropping Custom Rating Worksheet Tables","140#1953336");
D=C.fN("Deleting CoverageSymbolGroup from Coverage","140#1953261");
C=B.fN("Configuration Merging Guidelines","141");
C=B.fN("Data Model Merging Guidelines","142");
D=C.fN("Updating Data Types for Case Sensitivity","142#1951333");
D=C.fN("Merging Typelists \u2013 Overview","142#1951341");
D=C.fN("Merging Typelists \u2013 Simple Typelists","142#1951351");
D=C.fN("Merging Typelists \u2013 Complex Typelists","142#1951372");
D=C.fN("Reviewing Shared Typekey Configuration","142#1951403");
D=C.fN("Adding State Typelist Extensions to Jurisdiction","142#1951431");
D=C.fN("Merging Entity Extensions","142#1951465");
D=C.fN("Reviewing Custom Extensions","142#1951523");
D=C.fN("Reconciling the Database with Custom Extensions","142#1951538");
D=C.fN("Removing Obsolete Attributes","142#1951540");
D=C.fN("Updating Extractable Edge Foreign Keys","142#1951542");
D=C.fN("Converting Money to MonetaryAmount","142#1951548");
C=B.fN("Updating Product Model API Calls","143");
C=B.fN("Merging PolicyCenter Typelists","144");
D=C.fN("GLCoverageFormType","144#1952756");
D=C.fN("PercentDuplicated","144#1952812");
D=C.fN("ReceptacleType","144#1952815");
D=C.fN("GLStateCostType","144#1952818");
C=B.fN("Upgrading the Business Auto Line Configuration","145");
C=B.fN("Changes to the Logging API","146");
D=C.fN("Conceptual Changes to Logging","146#1952836");
D=C.fN("Instantiating Loggers","146#1952893");
D=C.fN("Logging Messages","146#1952923");
D=C.fN("Passing Loggers as Parameters","146#1952936");
C=B.fN("Merging CADiffTree.xml and BADiffTree.xml","147");
C=B.fN("Changes to Iterators in PCF Files","148");
C=B.fN("Updating Namespace on Files Loaded by GX Models","149");
C=B.fN("Merging Enhancements","150");
C=B.fN("Updating PolicyPeriodPlugin.gs","151");
C=B.fN("Consider Enabling Check for Small Cost Changes","152");
C=B.fN("Merging systables.xml","153");
C=B.fN("Merging Claim Details PCF Files","154");
C=B.fN("Adding DDL Configuration Options to database-config.xml","155");
C=B.fN("Merging Changes to Field Validators","156");
C=B.fN("Renaming PCF files According to Their Modes","157");
C=B.fN("Refactoring Line of Business Code","158");
C=B.fN("Merging compatibility-xsd.xml","159");
C=B.fN("Merging Display Properties","160");
C=B.fN("Merging Other Files","161");
C=B.fN("Migrating to 64-bit IDs During Upgrade (SQL Server Only)","162");
C=B.fN("Fixing Gosu Issues","163");
D=C.fN("Gosu Case Sensitivity","163#1951620");
D=C.fN("Inequality Operator","163#1951641");
D=C.fN("Ambiguous Method Calls","163#1951658");
D=C.fN("Nested Comments","163#1951678");
C=B.fN("Upgrading Rules to PolicyCenter 8.0.4","164");
D=C.fN("Rules Required for Free Text Search","164#1952726");
C=B.fN("Running PCF Iterator Upgrade","165");
C=B.fN("Translating New Display Properties and Typecodes","166");
C=B.fN("Validating the PolicyCenter 8.0.4 Configuration","167");
D=C.fN("Using Studio to Verify Files","167#1952128");
D=C.fN("Starting PolicyCenter and Resolving Errors","167#1952154");
C=B.fN("Importing Policy Forms","168");
C=B.fN("Building and Deploying PolicyCenter 8.0.4","169");
B=A.fN("Upgrading the PolicyCenter 4.0.x Database","170");
C=B.fN("Upgrading Administration Data for Testing","171");
C=B.fN("Identifying Data Model Issues","172");
C=B.fN("Verifying Batch Process and Work Queue Completion","173");
C=B.fN("Purging Data Prior to Upgrade","174");
D=C.fN("Purging Old Messages from the Database","174#2025297");
D=C.fN("Purging Completed Workflows and Workflow Logs","174#2025348");
C=B.fN("Validating the Database Schema","175");
C=B.fN("Checking Database Consistency","176");
C=B.fN("Creating a Data Distribution Report","177");
C=B.fN("Generating Database Statistics","178");
C=B.fN("Creating a Database Backup","179");
C=B.fN("Updating Database Infrastructure","180");
C=B.fN("Preparing the Database for Upgrade","181");
D=C.fN("Ensuring Adequate Free Space","181#2026210");
D=C.fN("Disabling Replication","181#2026212");
D=C.fN("Assigning Default Tablespace (Oracle only)","181#2026214");
C=B.fN("Setting Linguistic Search Collation","182");
C=B.fN("Customizing the Upgrade","183");
D=C.fN("Running Custom Version Checks and Triggers","183#2025539");
D=C.fN("IDatamodelUpgrade API Examples","183#2025724");
D=C.fN("Upgrading Archived Entities","183#2026064");
C=B.fN("Configuring the Database Upgrade","184");
D=C.fN("Adjusting Commit Size for Encryption","184#2026238");
D=C.fN("Configuring Version Trigger Elements","184#2026254");
D=C.fN("Deferring Creation of Nonessential Indexes","184#2026343");
D=C.fN("Configuring the Upgrade on Oracle","184#2026392");
D=C.fN("Configuring the Upgrade on SQL Server","184#2026482");
D=C.fN("Downloading Database Upgrade Instrumentation Details","184#1845518");
C=B.fN("Checking the Database Before Upgrade","185");
C=B.fN("Disabling the Scheduler","186");
C=B.fN("Suspending Message Destinations","187");
C=B.fN("Starting the Server to Begin Automatic Database Upgrade","188");
D=C.fN("Test the Database Upgrade","188#2026548");
D=C.fN("Integrations and Starting the Server","188#2026559");
D=C.fN("Understanding the Automatic Database Upgrade","188#2026565");
D=C.fN("Version Trigger Descriptions","188#2026584");
C=B.fN("Viewing Detailed Database Upgrade Information","189");
C=B.fN("Dropping Unused Columns on Oracle","190");
C=B.fN("Reloading Rating Sample Data","191");
C=B.fN("Exporting Administration Data for Testing","192");
C=B.fN("Upgrading Phone Numbers","193");
C=B.fN("Final Steps After The Database Upgrade is Complete","194");
D=C.fN("Checking that Contacts Have Unique Addresses","194#1940313");
D=C.fN("Completing Deferred Upgrade","194#1933739");
D=C.fN("Reenabling Database Logging","194#1955851");
D=C.fN("Migrating to 64-bit IDs After Upgrade (SQL Server Only)","194#1955153");
D=C.fN("Backing up the Database After Upgrade","194#1955144");
B=A.fN("Upgrading Integrations and Gosu from 4.0.x","195");
C=B.fN("Overview of Upgrading Integration Plugins and Code","196");
C=B.fN("Tasks Required Before Starting the Server","196#2211359");
C=B.fN("Tasks Required Before Deploying a Production Server","196#2136086");
C=B.fN("Tasks Required Before the Next Upgrade","196#2136692");
}