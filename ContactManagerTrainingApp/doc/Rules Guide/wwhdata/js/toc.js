function  WWHBookData_AddTOCEntries(P)
{
var A=P.fN("About PolicyCenter Documentation","1");
var B=A.fN("Conventions in This Document","1#2127576");
B=A.fN("Support","1#2127622");
A=P.fN("Gosu Business Rules","2#998418");
B=A.fN("Rules: A Background","3");
var C=B.fN("Introduction to Business Rules","4");
var D=C.fN("Rule Hierarchy","4#1545138");
D=C.fN("Rule Execution","4#1541631");
D=C.fN("Rule Management","4#4497223");
D=C.fN("Sample Rules","4#2874201");
C=B.fN("Business Rule Terminology","5");
C=B.fN("Overview of PolicyCenter Rule Set Categories","6");
B=A.fN("Rules Overview","7");
C=B.fN("Rule Design Template","8");
C=B.fN("Rule Structure","9");
D=C.fN("Rule Syntax","9#1280967");
D=C.fN("Rule Members","9#3594231");
D=C.fN("Defining the Rule Conditions","9#1247025");
D=C.fN("Defining the Rule Actions","9#1247047");
C=B.fN("Exiting a Rule","10");
C=B.fN("Gosu Annotations and PolicyCenter Business Rules","11");
C=B.fN("Invoking a Gosu Rule from Gosu Code","12");
B=A.fN("Using the Rules Editor","13");
C=B.fN("Working with Rules","14");
D=C.fN("Renaming or Deleting a Rule","15");
C=B.fN("Changing the Root Entity of a Rule","16");
D=C.fN("Why Change a Root Entity?","16#3374698");
C=B.fN("Making a Rule Active or Inactive","17");
B=A.fN("Writing Rules: Testing and Debugging","18");
C=B.fN("Generating Rule Debugging Information","19");
D=C.fN("Printing Debugging Information","19#1097940");
D=C.fN("Logging Debugging Information","19#1098387");
C=B.fN("Using Custom Logging Methods to Debug Rule Issues","20");
B=A.fN("Writing Rules: Examples","21");
C=B.fN("Accessing Fields on Subtypes","22");
C=B.fN("Looking for One or More Items Meeting Conditions","23");
C=B.fN("Taking Actions on More Than One Subitem","24");
C=B.fN("Checking Permissions","25");
B=A.fN("Rule Set Categories","26");
C=B.fN("Rule Set Summaries","27");
C=B.fN("Assignment","28");
D=C.fN("The Assignment Engine","29");
C=B.fN("Audit","30");
D=C.fN("Reporting Trend Analysis","30#16904585");
C=B.fN("Event Message","31");
D=C.fN("Event Fired","32");
C=B.fN("Exception","33");
D=C.fN("Activity Escalation Rules","33#16512060");
D=C.fN("Group Exception Rules","33#16512098");
D=C.fN("Policy Exception Rules","33#17147488");
D=C.fN("User Exception Rules","33#17083497");
C=B.fN("Renewal","34");
D=C.fN("Renewal AutoUpdate","34#16512317");
C=B.fN("Validation","35");
D=C.fN("Validation in the User Interface","36");
D=C.fN("Validatable Entities","37");
D=C.fN("Validation Levels","38");
D=C.fN("Adding New Validation Levels","38#17011254");
D=C.fN("Triggering Validation","39");
D=C.fN("The validate Method","40");
D=C.fN("Account Validation Rule Example","41");
B=A.fN("PolicyCenter Rule Reports","42");
C=B.fN("Generating a Rule Repository Report","43");
C=B.fN("Generating a Profiler Rule Execution Report","44");
D=C.fN("Interpreting a Rule Execution Report","44#16850819");
C=B.fN("Viewing Rule Information in the Profiler Chrono Report","45");
A=P.fN("Advanced Topics","46#998418");
B=A.fN("Assignment in PolicyCenter","47");
C=B.fN("Understanding Assignment","48");
C=B.fN("Primary and Secondary Assignment","49");
D=C.fN("Primary (User-based) Assignment","49#16238140");
D=C.fN("Secondary (Role-based) Assignment","49#16231919");
D=C.fN("Assignment within the Assignment Rules","49#16232565");
C=B.fN("Role Assignment","50");
C=B.fN("Gosu Support for Assignment Entities","51");
C=B.fN("Assignment Success or Failure","52");
C=B.fN("Assignment Events","53");
C=B.fN("Assignment Method Reference","54");
D=C.fN("Queue Assignment","55");
D=C.fN("Immediate Assignment","56");
D=C.fN("Condition-based Assignment","57");
D=C.fN("Round-robin Assignment","58");
D=C.fN("Dynamic Assignment","59");
C=B.fN("Using Assignment Methods in Assignment Pop-ups","60");
B=A.fN("Performing Class-Based Validation","61");
C=B.fN("What is Class-Based Validation?","62");
C=B.fN("Class-Based Validation: An Overview","63");
C=B.fN("Field-Level Validation: A Review","64");
C=B.fN("Validation Levels: A Review","65");
C=B.fN("Class-Based Validation Configuration","66");
D=C.fN("PCValidation","67");
D=C.fN("PCValidationBase","68");
D=C.fN("PCValidationContext","69");
D=C.fN("PCValidationResult","70");
C=B.fN("Base Configuration Validation Classes","71");
C=B.fN("Validation Chaining","72");
D=C.fN("PolicyPeriodValidation: validateImpl Method","73");
D=C.fN("PolicyPeriodValidation Validation Checks","74");
D=C.fN("Invariant Validation Checks","75");
D=C.fN("Static Validation Checks","76");
C=B.fN("Invoking Class-Based Validation","77");
D=C.fN("Example: Invoking Validation in a Job Wizard Step","78");
B=A.fN("Performing Rule-based Validation","79");
C=B.fN("What is Rule-based Validation?","80");
C=B.fN("Rule-based Validation: An Overview","81");
C=B.fN("The Validation Graph","82");
D=C.fN("Traversing the Validation Graph","83");
D=C.fN("Top-level Entities that Trigger Full Validation","84");
D=C.fN("ValidationTrigger Example","85");
D=C.fN("Overriding Validation Triggers","86");
C=B.fN("Validation Performance Issues","87");
D=C.fN("Administration Objects","87#4141675");
D=C.fN("Query Path Length","87#4141677");
D=C.fN("Links Between Top-level Objects","87#4141679");
D=C.fN("Graph Direction Consistency","87#4141681");
D=C.fN("Illegal Links and Arrays","87#4141683");
C=B.fN("Debugging the Validation Graph","88");
B=A.fN("Sending Emails","89");
C=B.fN("Guidewire PolicyCenter and Email","90");
C=B.fN("The Email Object Model","91");
C=B.fN("Email Utility Methods","92");
C=B.fN("Email Transmission","93");
C=B.fN("Understanding Email Templates","94");
C=B.fN("Creating an Email Template","95");
C=B.fN("Localizing an Email Template","96");
C=B.fN("The IEmailTemplateSource Plugin","97");
D=C.fN("Class LocalEmailTemplateSource","97#3206297");
C=B.fN("Configuring PolicyCenter to Send Emails","98");
D=C.fN("Class EmailMessageTransport","98#3206563");
D=C.fN("Class JavaxEmailMessageTransport","98#3206565");
D=C.fN("Working with Email Attachments","98#3209876");
C=B.fN("Sending Emails from Gosu","99");
C=B.fN("Saving an Email Message as a Document","100");
B=A.fN("Document Creation","101");
C=B.fN("Synchronous and Asynchronous Document Production","102");
C=B.fN("Integrating Document Functionality with PolicyCenter","103");
C=B.fN("The IDocumentTemplateDescriptor Interface","104");
C=B.fN("The IDocumentTemplateDescriptor API","105");
D=C.fN("Template Metadata","105#3217772");
D=C.fN("Document Metadata","105#3217939");
D=C.fN("Context Objects","105#3227224");
D=C.fN("Form Fields","105#3217953");
D=C.fN("Document Locale","105#3377218");
C=B.fN("The DocumentProduction Class","106");
D=C.fN("How to Determine the Supported Document Creation Type","106#2161714");
D=C.fN("Asynchronous Document Creation Methods","106#3225965");
D=C.fN("Synchronous Document Creation Methods","106#2279287");
C=B.fN("Document Templates","107");
C=B.fN("Document Creation Examples","108");
D=C.fN("Method createAndStoreDocumentSynchronously Example 1","108#3216639");
D=C.fN("Method createAndStoreDocumentSynchronously Example 2","108#3216685");
C=B.fN("Troubleshooting","109");
D=C.fN("IDocumentContentSource.addDocument Called with Null InputStream","109#3230389");
D=C.fN("IDocumentMetadataSource.saveDocument Called Twice","109#3511860");
D=C.fN("UnsupportedOperationException Exception","109#3230443");
D=C.fN("Document Template Descriptor Upgrade Errors","109#3230449");
D=C.fN("\u201cAutomation server cannot create object\u201d Error","109#3230454");
D=C.fN("\u201cIDocumentProduction implementation must return document...\u201d Error","109#3580319");
D=C.fN("Large Size Microsoft Word Documents","109#3549168");
}
