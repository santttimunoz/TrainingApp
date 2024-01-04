/*
 *   Title: TopicUtils-JavaScript.js
 *   
 *  JavaScript related to the TopicUtils code. This file gets COPIED into the output webworks files to support
 *  the link to this page code.
 */

 
// extracts the src=myfilename from the URL
function Guidewire_ExtractSrcFromURL() {
	var VarDocumentURL = window.WWHFrame.location;
	var TheParametersArray = VarDocumentURL.hash.split("&");
	var thisParam;
	var FMSourceFile = "UNKNOWN_FRAMEMAKER_SOURCE_FILE";

	k = TheParametersArray.length;
	for (i= 0 ; i < k; i++) {
	   thisParam = unescape(TheParametersArray[i]);
	   if (thisParam.search(/^src=/) != -1) {
		  FMSourceFile = thisParam.substring(4); // strip off the "src=" at the beginning
		}
	 }
	return FMSourceFile;
}

// takes a file name of format "myfilename.4.3" and gets the beginning part and returns "myfilename" only
function Guidewire_FMSourceFileExtract(FullFileName)
{
  var VarSplitURL= FullFileName.split(".");
  return VarSplitURL[0];
}

// is the src=myfile arg from the URL (which means it was from myfile.fm) match the desired file
// generally speaking we do not care since we just want it unique per book
// so we just say yes, but we say false if it's a special file that allows duplicates in one book
function Guidewire_FMSourceFileMatch(FROM_URL,LOCAL_FILENAME) {
	var varFileURL = FROM_URL.toLowerCase();
	var varFileActual = LOCAL_FILENAME.toLowerCase();

	// SPECIAL CASE FOR UPGRADE GUIDE PROCEDURES -- BASICALLY 
	if (varFileURL.search(/^procedure-/) != -1) {
	  if  (varFileActual.search(/^procedure-/) != -1)  { 
		  return (varFileURL == Guidewire_FMSourceFileExtract(varFileActual)); 
		} else { 
		 return false; 
	   }
	 }
	else {
	   // basically, the default is to say they match... 
	   // if it's one of these specially-handled files, just let it work  
	   return true; 
	}
}


// this function takes a topic Name and converts it to a simpler string, such as underscores instead of space chars
// This is also important because FrameMaker + ePubs's  native handling of topic alias names mirror this behavior
//
// IMPORTANT: IF YOU CHANGE THIS CODE IN CONTROLS.JS (IN TEMPLATE OVERRIDES), ALSO CHANGE THE MIRROR FUNCTION IN TOPICUTILS-JAVASCRIPT.JS
// IMPORTANT: IF YOU CHANGE THIS CODE IN TOPICUTILS.FSL, ALSO CHANGE THE MIRROR FUNCTION IN CONTROLS.JS (IN TEMPLATE OVERRIDES)
// THE CONTROLS.JS FUNCTION ENCODES THE URL, AND THIS FUNCTION ENCODES it and compares against the input string with the full name for each topic (potentially with funny characters)
function Guidewire_SafeTopicName(theTitle) {
theTitle = theTitle.replace(/ /g, "_");  // converts space char
theTitle = theTitle.replace(/\u00a0/g, "_");  // converts nbsp char
// censor (remove) characters that mess up epublisher in URLs: forward slash, backslash, question mark, &amp;
theTitle= theTitle.replace(/[\\\/\?]/g, "");
theTitle = theTitle.replace(/&/g, "");
theTitle = theTitle.replace(/\u201c/g, ""); // double quote smart L
theTitle = theTitle.replace(/\u201d/g, "");// double quote smart R
theTitle = theTitle.replace(/\u2018/g, "");// single quote smart L
theTitle = theTitle.replace(/\u2019/g, "");// single quote smart R
theTitle = theTitle.replace(/\u2022/g, "");// trademark
theTitle = theTitle.replace(/'/g, "");// apparently a dumb single quote gets stripped by webworks
theTitle = theTitle.replace(/"/g, "");// to be safe let us strip double quotes too
theTitle = theTitle.replace(/\</g, "(");  // open bracket
theTitle = theTitle.replace(/\>/g, ")");   // close bracket
theTitle = theTitle.replace(/:/g, "_");    // colon
theTitle = theTitle.replace(/&/g, "");
return (theTitle);  }




function Guidewire_TopicMatch(FROMEPUB,WHATTOMATCH) {
var varLower1 = FROMEPUB.toLowerCase();
var varLower2 = WHATTOMATCH.toLowerCase();
var varLower2Safe = Guidewire_SafeTopicName(varLower2)

// match positively if they naturally match, or they match the safe version (convert spaces to underscores...)
var varMatches = (varLower1 == varLower2 || varLower1 == Guidewire_SafeTopicName(varLower2))

// console.log(Guidewire_TopicMatch, varLower1, varLower2, varLower2Safe, varMatches)
return varMatches
}
function GUIDEWIRE_TOPIC_TO_FILE(TOPIC, SRCFILE) { 
if (Guidewire_TopicMatch(TOPIC,"cover")) return "index.html"

else if (Guidewire_TopicMatch(TOPIC,"Guidewire PolicyCenter\u00ae") && Guidewire_FMSourceFileMatch(SRCFILE,"cover-productmodel.html") ) { return "cover-productmodel.html";}
else if (Guidewire_TopicMatch(TOPIC,"About PolicyCenter Documentation") && Guidewire_FMSourceFileMatch(SRCFILE,"about.html") ) { return "about.html";}
else if (Guidewire_TopicMatch(TOPIC,"PolicyCenter Product Model") && Guidewire_FMSourceFileMatch(SRCFILE,"p-productmodel.html") ) { return "p-productmodel.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring the Product Model") && Guidewire_FMSourceFileMatch(SRCFILE,"product_model.04.01.html") ) { return "product_model.04.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"Product Model Patterns") && Guidewire_FMSourceFileMatch(SRCFILE,"product_model.04.02.html") ) { return "product_model.04.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Product and Policy Objects") && Guidewire_FMSourceFileMatch(SRCFILE,"product_model.04.03.html") ) { return "product_model.04.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Products") && Guidewire_FMSourceFileMatch(SRCFILE,"product_model.04.04.html") ) { return "product_model.04.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Products Pages") && Guidewire_FMSourceFileMatch(SRCFILE,"product_model.04.05.html") ) { return "product_model.04.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Defining a Product") && Guidewire_FMSourceFileMatch(SRCFILE,"product_model.04.06.html") ) { return "product_model.04.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Deleting a Product") && Guidewire_FMSourceFileMatch(SRCFILE,"product_model.04.07.html") ) { return "product_model.04.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Associating a Policy Line with a Product") && Guidewire_FMSourceFileMatch(SRCFILE,"product_model.04.08.html") ) { return "product_model.04.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Specifying Policy Terms") && Guidewire_FMSourceFileMatch(SRCFILE,"product_model.04.09.html") ) { return "product_model.04.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Specifying Advanced Settings for a Product") && Guidewire_FMSourceFileMatch(SRCFILE,"product_model.04.10.html") ) { return "product_model.04.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding an Initialization Script") && Guidewire_FMSourceFileMatch(SRCFILE,"product_model.04.11.html") ) { return "product_model.04.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding Document Templates to a Product") && Guidewire_FMSourceFileMatch(SRCFILE,"product_model.04.12.html") ) { return "product_model.04.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Policy Lines") && Guidewire_FMSourceFileMatch(SRCFILE,"policy_lines.05.01.html") ) { return "policy_lines.05.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Policy Lines") && Guidewire_FMSourceFileMatch(SRCFILE,"policy_lines.05.02.html") ) { return "policy_lines.05.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding Coverages to a Policy Line") && Guidewire_FMSourceFileMatch(SRCFILE,"policy_lines.05.03.html") ) { return "policy_lines.05.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Coverages and Coverables") && Guidewire_FMSourceFileMatch(SRCFILE,"policy_lines.05.04.html") ) { return "policy_lines.05.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Covered Objects") && Guidewire_FMSourceFileMatch(SRCFILE,"policy_lines.05.05.html") ) { return "policy_lines.05.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Coverables and Coverage Tables") && Guidewire_FMSourceFileMatch(SRCFILE,"policy_lines.05.06.html") ) { return "policy_lines.05.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Coverables and Delegates") && Guidewire_FMSourceFileMatch(SRCFILE,"policy_lines.05.07.html") ) { return "policy_lines.05.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"CoveragePattern and Coverage Objects") && Guidewire_FMSourceFileMatch(SRCFILE,"policy_lines.05.08.html") ) { return "policy_lines.05.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding a New Coverage") && Guidewire_FMSourceFileMatch(SRCFILE,"policy_lines.05.09.html") ) { return "policy_lines.05.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Coverages in PCF Files") && Guidewire_FMSourceFileMatch(SRCFILE,"policy_lines.05.10.html") ) { return "policy_lines.05.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Rendering Common Coverages") && Guidewire_FMSourceFileMatch(SRCFILE,"policy_lines.05.11.html") ) { return "policy_lines.05.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Defining Coverage Terms") && Guidewire_FMSourceFileMatch(SRCFILE,"policy_lines.05.12.html") ) { return "policy_lines.05.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"Coverage Term Types") && Guidewire_FMSourceFileMatch(SRCFILE,"policy_lines.05.13.html") ) { return "policy_lines.05.13.html";}
else if (Guidewire_TopicMatch(TOPIC,"Coverage Term Model Types") && Guidewire_FMSourceFileMatch(SRCFILE,"policy_lines.05.14.html") ) { return "policy_lines.05.14.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding New Coverage Term Patterns") && Guidewire_FMSourceFileMatch(SRCFILE,"policy_lines.05.15.html") ) { return "policy_lines.05.15.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding Exclusions to a Policy Line") && Guidewire_FMSourceFileMatch(SRCFILE,"policy_lines.05.16.html") ) { return "policy_lines.05.16.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding Conditions to a Policy Line") && Guidewire_FMSourceFileMatch(SRCFILE,"policy_lines.05.17.html") ) { return "policy_lines.05.17.html";}
else if (Guidewire_TopicMatch(TOPIC,"Defining Categories") && Guidewire_FMSourceFileMatch(SRCFILE,"policy_lines.05.18.html") ) { return "policy_lines.05.18.html";}
else if (Guidewire_TopicMatch(TOPIC,"Defining a Coverage Symbol Group") && Guidewire_FMSourceFileMatch(SRCFILE,"policy_lines.05.19.html") ) { return "policy_lines.05.19.html";}
else if (Guidewire_TopicMatch(TOPIC,"Defining Official IDs") && Guidewire_FMSourceFileMatch(SRCFILE,"policy_lines.05.20.html") ) { return "policy_lines.05.20.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding Quote Modifiers to a Policy Line") && Guidewire_FMSourceFileMatch(SRCFILE,"policy_lines.05.21.html") ) { return "policy_lines.05.21.html";}
else if (Guidewire_TopicMatch(TOPIC,"Quote Modifiers") && Guidewire_FMSourceFileMatch(SRCFILE,"modifiers.06.1.html") ) { return "modifiers.06.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Terms Associated with Modifiers") && Guidewire_FMSourceFileMatch(SRCFILE,"modifiers.06.2.html") ) { return "modifiers.06.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Modifiers in Product Designer") && Guidewire_FMSourceFileMatch(SRCFILE,"modifiers.06.3.html") ) { return "modifiers.06.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Display Section") && Guidewire_FMSourceFileMatch(SRCFILE,"modifiers.06.4.html") ) { return "modifiers.06.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Rate Factors Page") && Guidewire_FMSourceFileMatch(SRCFILE,"modifiers.06.5.html") ) { return "modifiers.06.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"State MinMax Page") && Guidewire_FMSourceFileMatch(SRCFILE,"modifiers.06.6.html") ) { return "modifiers.06.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"Question Sets") && Guidewire_FMSourceFileMatch(SRCFILE,"questionsets.07.01.html") ) { return "questionsets.07.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"Question Set Basics") && Guidewire_FMSourceFileMatch(SRCFILE,"questionsets.07.02.html") ) { return "questionsets.07.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Question Sets in Product Designer") && Guidewire_FMSourceFileMatch(SRCFILE,"questionsets.07.03.html") ) { return "questionsets.07.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding a New Question Set") && Guidewire_FMSourceFileMatch(SRCFILE,"questionsets.07.04.html") ) { return "questionsets.07.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Offerings for Question Sets") && Guidewire_FMSourceFileMatch(SRCFILE,"questionsets.07.05.html") ) { return "questionsets.07.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Defining New Questions") && Guidewire_FMSourceFileMatch(SRCFILE,"questionsets.07.06.html") ) { return "questionsets.07.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Question Behavior") && Guidewire_FMSourceFileMatch(SRCFILE,"questionsets.07.07.html") ) { return "questionsets.07.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Question Dependencies") && Guidewire_FMSourceFileMatch(SRCFILE,"questionsets.07.08.html") ) { return "questionsets.07.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Incorrect Answer Behavior") && Guidewire_FMSourceFileMatch(SRCFILE,"questionsets.07.09.html") ) { return "questionsets.07.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Question Choices") && Guidewire_FMSourceFileMatch(SRCFILE,"questionsets.07.10.html") ) { return "questionsets.07.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Question Help Text") && Guidewire_FMSourceFileMatch(SRCFILE,"questionsets.07.11.html") ) { return "questionsets.07.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Question Set Object Model") && Guidewire_FMSourceFileMatch(SRCFILE,"questionsets.07.12.html") ) { return "questionsets.07.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"Defining Answer Containers and Question Sets for Other Entities") && Guidewire_FMSourceFileMatch(SRCFILE,"questionsets.07.13.html") ) { return "questionsets.07.13.html";}
else if (Guidewire_TopicMatch(TOPIC,"Triggering Actions when Incorrect Answers are Changed") && Guidewire_FMSourceFileMatch(SRCFILE,"questionsets.07.14.html") ) { return "questionsets.07.14.html";}
else if (Guidewire_TopicMatch(TOPIC,"System Tables") && Guidewire_FMSourceFileMatch(SRCFILE,"systables.08.1.html") ) { return "systables.08.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"What Are System Tables") && Guidewire_FMSourceFileMatch(SRCFILE,"systables.08.2.html") ) { return "systables.08.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring System Tables") && Guidewire_FMSourceFileMatch(SRCFILE,"systables.08.3.html") ) { return "systables.08.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding a System Table in Studio") && Guidewire_FMSourceFileMatch(SRCFILE,"systables.08.4.html") ) { return "systables.08.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring File Loading of System Tables") && Guidewire_FMSourceFileMatch(SRCFILE,"systables.08.5.html") ) { return "systables.08.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Verifying System Tables") && Guidewire_FMSourceFileMatch(SRCFILE,"systables.08.6.html") ) { return "systables.08.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"Class Codes with Multiple Descriptions") && Guidewire_FMSourceFileMatch(SRCFILE,"systables.08.7.html") ) { return "systables.08.7.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding a New System Table") && Guidewire_FMSourceFileMatch(SRCFILE,"systables.08.8.html") ) { return "systables.08.8.html";}
else if (Guidewire_TopicMatch(TOPIC,"Notification Config System Table") && Guidewire_FMSourceFileMatch(SRCFILE,"systables.08.9.html") ) { return "systables.08.9.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Availability") && Guidewire_FMSourceFileMatch(SRCFILE,"lookup_tables.09.01.html") ) { return "lookup_tables.09.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"What is Availability") && Guidewire_FMSourceFileMatch(SRCFILE,"lookup_tables.09.02.html") ) { return "lookup_tables.09.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Grandfathering and Offerings") && Guidewire_FMSourceFileMatch(SRCFILE,"lookup_tables.09.03.html") ) { return "lookup_tables.09.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Defining Availability") && Guidewire_FMSourceFileMatch(SRCFILE,"lookup_tables.09.04.html") ) { return "lookup_tables.09.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Defining Availability in Lookup Tables") && Guidewire_FMSourceFileMatch(SRCFILE,"lookup_tables.09.05.html") ) { return "lookup_tables.09.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Setting the Reference Date") && Guidewire_FMSourceFileMatch(SRCFILE,"lookup_tables.09.06.html") ) { return "lookup_tables.09.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Extending an Availability Lookup Table") && Guidewire_FMSourceFileMatch(SRCFILE,"lookup_tables.09.07.html") ) { return "lookup_tables.09.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Step 1: Extend an Availability Lookup Entity") && Guidewire_FMSourceFileMatch(SRCFILE,"lookup_tables.09.08.html") ) { return "lookup_tables.09.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Step 2: Define the Column in the Availability Lookup Table") && Guidewire_FMSourceFileMatch(SRCFILE,"lookup_tables.09.09.html") ) { return "lookup_tables.09.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Step 3: Using the Updated Availability Column") && Guidewire_FMSourceFileMatch(SRCFILE,"lookup_tables.09.10.html") ) { return "lookup_tables.09.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Reloading Availability Data") && Guidewire_FMSourceFileMatch(SRCFILE,"lookup_tables.09.11.html") ) { return "lookup_tables.09.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Reloading Availability Example") && Guidewire_FMSourceFileMatch(SRCFILE,"lookup_tables.09.12.html") ) { return "lookup_tables.09.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Offerings") && Guidewire_FMSourceFileMatch(SRCFILE,"offerings.10.1.html") ) { return "offerings.10.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Offerings in the Product Model") && Guidewire_FMSourceFileMatch(SRCFILE,"offerings.10.2.html") ) { return "offerings.10.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Product Offerings Page") && Guidewire_FMSourceFileMatch(SRCFILE,"offerings.10.3.html") ) { return "offerings.10.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Product Selections Page") && Guidewire_FMSourceFileMatch(SRCFILE,"offerings.10.4.html") ) { return "offerings.10.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Product Model Pattern Offerings Page") && Guidewire_FMSourceFileMatch(SRCFILE,"offerings.10.5.html") ) { return "offerings.10.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Product Offerings Availability Page") && Guidewire_FMSourceFileMatch(SRCFILE,"offerings.10.6.html") ) { return "offerings.10.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"Offerings and Question Sets") && Guidewire_FMSourceFileMatch(SRCFILE,"offerings.10.7.html") ) { return "offerings.10.7.html";}
else if (Guidewire_TopicMatch(TOPIC,"Checking Product Model Availability") && Guidewire_FMSourceFileMatch(SRCFILE,"product_model_synchronization.11.1.html") ) { return "product_model_synchronization.11.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"What Is Product Model Availability") && Guidewire_FMSourceFileMatch(SRCFILE,"product_model_synchronization.11.2.html") ) { return "product_model_synchronization.11.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Types of Availability Issues") && Guidewire_FMSourceFileMatch(SRCFILE,"product_model_synchronization.11.3.html") ) { return "product_model_synchronization.11.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Product Model Issue Matrix") && Guidewire_FMSourceFileMatch(SRCFILE,"product_model_synchronization.11.4.html") ) { return "product_model_synchronization.11.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Product Model Availability Checks") && Guidewire_FMSourceFileMatch(SRCFILE,"product_model_synchronization.11.5.html") ) { return "product_model_synchronization.11.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Important Classes and Methods Related to Availability Checking") && Guidewire_FMSourceFileMatch(SRCFILE,"product_model_synchronization.11.6.html") ) { return "product_model_synchronization.11.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"Preventing Illegal Product Model Changes") && Guidewire_FMSourceFileMatch(SRCFILE,"product_model_verification.12.1.html") ) { return "product_model_verification.12.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"PolicyCenter Product Model Verification") && Guidewire_FMSourceFileMatch(SRCFILE,"product_model_verification.12.2.html") ) { return "product_model_verification.12.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Product Model Immutable Field Verification") && Guidewire_FMSourceFileMatch(SRCFILE,"product_model_verification.12.3.html") ) { return "product_model_verification.12.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Product Model Modification Checks") && Guidewire_FMSourceFileMatch(SRCFILE,"product_model_verification.12.4.html") ) { return "product_model_verification.12.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Deleted Pattern Checks") && Guidewire_FMSourceFileMatch(SRCFILE,"product_model_verification.12.5.html") ) { return "product_model_verification.12.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Entity Instance Modified Field Checks") && Guidewire_FMSourceFileMatch(SRCFILE,"product_model_verification.12.6.html") ) { return "product_model_verification.12.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"Additional Checks") && Guidewire_FMSourceFileMatch(SRCFILE,"product_model_verification.12.7.html") ) { return "product_model_verification.12.7.html";}
else if (Guidewire_TopicMatch(TOPIC,"Verifying the Product Model") && Guidewire_FMSourceFileMatch(SRCFILE,"invariant_checking.13.1.html") ) { return "invariant_checking.13.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"What Is Product Model Verification") && Guidewire_FMSourceFileMatch(SRCFILE,"invariant_checking.13.2.html") ) { return "invariant_checking.13.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Product Model Error Messages") && Guidewire_FMSourceFileMatch(SRCFILE,"invariant_checking.13.3.html") ) { return "invariant_checking.13.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Product Model Verification Checks") && Guidewire_FMSourceFileMatch(SRCFILE,"invariant_checking.13.4.html") ) { return "invariant_checking.13.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Product Model Loader") && Guidewire_FMSourceFileMatch(SRCFILE,"pmloader.14.1.html") ) { return "pmloader.14.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Overview of Product Model Loader") && Guidewire_FMSourceFileMatch(SRCFILE,"pmloader.14.2.html") ) { return "pmloader.14.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"ETL Database Tables and Entities") && Guidewire_FMSourceFileMatch(SRCFILE,"pmloader.14.3.html") ) { return "pmloader.14.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"ETL Database Query Example") && Guidewire_FMSourceFileMatch(SRCFILE,"pmloader.14.4.html") ) { return "pmloader.14.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Generic Schedules") && Guidewire_FMSourceFileMatch(SRCFILE,"genericschedules.15.1.html") ) { return "genericschedules.15.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Generic Schedule Data Model") && Guidewire_FMSourceFileMatch(SRCFILE,"genericschedules.15.2.html") ) { return "genericschedules.15.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring the Generic Schedule User Interface") && Guidewire_FMSourceFileMatch(SRCFILE,"genericschedules.15.3.html") ) { return "genericschedules.15.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Implementing Schedules in Lines That Do Not Have Schedules") && Guidewire_FMSourceFileMatch(SRCFILE,"genericschedules.15.4.html") ) { return "genericschedules.15.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Lines of Business") && Guidewire_FMSourceFileMatch(SRCFILE,"p-lob.html") ) { return "p-lob.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding a New Line of Business") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.01.html") ) { return "lob.17.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"Step 1: Define the Data Model for the New Line of Business") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.02.html") ) { return "lob.17.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Step 2: Register the New Line of Business") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.03.html") ) { return "lob.17.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Step 3: Add a Policy Line Package and Configuration Class") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.04.html") ) { return "lob.17.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Step 4: Add Coverages to the New Line of Business") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.05.html") ) { return "lob.17.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Creating the Basic Policy Line and Coverable Entities") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.06.html") ) { return "lob.17.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Creating the Coverage Entity for the Coverable Object") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.07.html") ) { return "lob.17.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Understanding the Coverable and Coverage Adapters") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.08.html") ) { return "lob.17.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Creating the Coverable Adapter") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.09.html") ) { return "lob.17.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Creating the Coverage Adapter") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.10.html") ) { return "lob.17.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Updating Policy Line Methods for the New Coverages") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.11.html") ) { return "lob.17.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding Availability Lookup Tables for Coverages") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.12.html") ) { return "lob.17.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding a Coverage Pattern in the Policy Line") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.13.html") ) { return "lob.17.13.html";}
else if (Guidewire_TopicMatch(TOPIC,"Step 5: Add Rate Modifiers to the New Line of Business") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.14.html") ) { return "lob.17.14.html";}
else if (Guidewire_TopicMatch(TOPIC,"Creating the Modifier Entity") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.15.html") ) { return "lob.17.15.html";}
else if (Guidewire_TopicMatch(TOPIC,"Creating the Modifiable Adapter") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.16.html") ) { return "lob.17.16.html";}
else if (Guidewire_TopicMatch(TOPIC,"Creating the Modifier Adapter") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.17.html") ) { return "lob.17.17.html";}
else if (Guidewire_TopicMatch(TOPIC,"Creating the Modifier Matcher") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.18.html") ) { return "lob.17.18.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding an Availability Lookup Table for Modifiers") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.19.html") ) { return "lob.17.19.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding a Modifier Pattern to the Policy Line") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.20.html") ) { return "lob.17.20.html";}
else if (Guidewire_TopicMatch(TOPIC,"Creating Rate Factors") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.21.html") ) { return "lob.17.21.html";}
else if (Guidewire_TopicMatch(TOPIC,"Creating the Rate Factor Delegate") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.22.html") ) { return "lob.17.22.html";}
else if (Guidewire_TopicMatch(TOPIC,"Creating the Rate Factor Matcher") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.23.html") ) { return "lob.17.23.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding Availability Lookup for Rating Factors") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.24.html") ) { return "lob.17.24.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding a Modifier Pattern with Rate Factors in the Policy Line") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.25.html") ) { return "lob.17.25.html";}
else if (Guidewire_TopicMatch(TOPIC,"Step 6: Add Optional Features to a Policy Line") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.26.html") ) { return "lob.17.26.html";}
else if (Guidewire_TopicMatch(TOPIC,"Step 7: Build the Product Model for the New Line of Business") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.27.html") ) { return "lob.17.27.html";}
else if (Guidewire_TopicMatch(TOPIC,"Creating the Policy Line") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.28.html") ) { return "lob.17.28.html";}
else if (Guidewire_TopicMatch(TOPIC,"Creating the Product") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.29.html") ) { return "lob.17.29.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding Icons for the Product and Policy Line") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.30.html") ) { return "lob.17.30.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding Product and Policy Line Icons to Product Designer") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.31.html") ) { return "lob.17.31.html";}
else if (Guidewire_TopicMatch(TOPIC,"Step 8: Define the Data Model for Rating in the New Line of Business") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.32.html") ) { return "lob.17.32.html";}
else if (Guidewire_TopicMatch(TOPIC,"Defining the Data Model for Rating") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.33.html") ) { return "lob.17.33.html";}
else if (Guidewire_TopicMatch(TOPIC,"Creating the Abstract Cost Entity") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.34.html") ) { return "lob.17.34.html";}
else if (Guidewire_TopicMatch(TOPIC,"Creating the Transaction Entity") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.35.html") ) { return "lob.17.35.html";}
else if (Guidewire_TopicMatch(TOPIC,"Creating Cost and Transaction Adapters") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.36.html") ) { return "lob.17.36.html";}
else if (Guidewire_TopicMatch(TOPIC,"Creating Cost Subtypes") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.37.html") ) { return "lob.17.37.html";}
else if (Guidewire_TopicMatch(TOPIC,"Creating Cost Methods") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.38.html") ) { return "lob.17.38.html";}
else if (Guidewire_TopicMatch(TOPIC,"Reflection in the Policy Period Plugin") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.39.html") ) { return "lob.17.39.html";}
else if (Guidewire_TopicMatch(TOPIC,"Step 9: Design the User Interface for the New Line of Business") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.40.html") ) { return "lob.17.40.html";}
else if (Guidewire_TopicMatch(TOPIC,"PCF Files and Folders for a Line of Business") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.41.html") ) { return "lob.17.41.html";}
else if (Guidewire_TopicMatch(TOPIC,"Creating the Wizard for Your Line of Business") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.42.html") ) { return "lob.17.42.html";}
else if (Guidewire_TopicMatch(TOPIC,"Completing the Line Wizard Step Set for Your Line of Business") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.43.html") ) { return "lob.17.43.html";}
else if (Guidewire_TopicMatch(TOPIC,"Creating the Policy Screens") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.44.html") ) { return "lob.17.44.html";}
else if (Guidewire_TopicMatch(TOPIC,"Creating the Policy File Screens") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.45.html") ) { return "lob.17.45.html";}
else if (Guidewire_TopicMatch(TOPIC,"Step 10: Set ClaimCenter Typelist Generator Options (Optional)") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.46.html") ) { return "lob.17.46.html";}
else if (Guidewire_TopicMatch(TOPIC,"Lines of Business \u2013 Advanced Topics") && Guidewire_FMSourceFileMatch(SRCFILE,"lob.17.47.html") ) { return "lob.17.47.html";}
else if (Guidewire_TopicMatch(TOPIC,"Creating a Multi-line Product") && Guidewire_FMSourceFileMatch(SRCFILE,"lob-multiline.18.01.html") ) { return "lob-multiline.18.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"Step 1: Define the Multi-line Product") && Guidewire_FMSourceFileMatch(SRCFILE,"lob-multiline.18.02.html") ) { return "lob-multiline.18.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Step 2: Design the Wizard for Your Multi-line Product") && Guidewire_FMSourceFileMatch(SRCFILE,"lob-multiline.18.03.html") ) { return "lob-multiline.18.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding the Line Wizard Step Set for Your Multi-line Product") && Guidewire_FMSourceFileMatch(SRCFILE,"lob-multiline.18.04.html") ) { return "lob-multiline.18.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Completing the Line Wizard Step Set for Your Multi-line Product") && Guidewire_FMSourceFileMatch(SRCFILE,"lob-multiline.18.05.html") ) { return "lob-multiline.18.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Step 3: Create the Policy Screens") && Guidewire_FMSourceFileMatch(SRCFILE,"lob-multiline.18.06.html") ) { return "lob-multiline.18.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding a Line Selection Screen for a Multi-line Product") && Guidewire_FMSourceFileMatch(SRCFILE,"lob-multiline.18.07.html") ) { return "lob-multiline.18.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding Line Review Screens for a Multi-line Product") && Guidewire_FMSourceFileMatch(SRCFILE,"lob-multiline.18.08.html") ) { return "lob-multiline.18.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding Quote Screens for a Multi-line Product") && Guidewire_FMSourceFileMatch(SRCFILE,"lob-multiline.18.09.html") ) { return "lob-multiline.18.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Step 4: Create the Policy File Screens") && Guidewire_FMSourceFileMatch(SRCFILE,"lob-multiline.18.10.html") ) { return "lob-multiline.18.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding Premium Audit to a Line of Business") && Guidewire_FMSourceFileMatch(SRCFILE,"premium_audit.19.1.html") ) { return "premium_audit.19.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Step 1: Add Audited Basis to the Data Model") && Guidewire_FMSourceFileMatch(SRCFILE,"premium_audit.19.2.html") ) { return "premium_audit.19.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Step 2: Add the Line of Business to the Audit Wizard") && Guidewire_FMSourceFileMatch(SRCFILE,"premium_audit.19.3.html") ) { return "premium_audit.19.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Step 3: Add Gosu Code for Final Audit") && Guidewire_FMSourceFileMatch(SRCFILE,"premium_audit.19.4.html") ) { return "premium_audit.19.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Step 4: Select the Audit Schedule for Final Audit") && Guidewire_FMSourceFileMatch(SRCFILE,"premium_audit.19.5.html") ) { return "premium_audit.19.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Step 5: Enable Premium Reports") && Guidewire_FMSourceFileMatch(SRCFILE,"premium_audit.19.6.html") ) { return "premium_audit.19.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"Step 6: Add Premium Audit to a Multi-line Product") && Guidewire_FMSourceFileMatch(SRCFILE,"premium_audit.19.7.html") ) { return "premium_audit.19.7.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Copy Data in a Line of Business") && Guidewire_FMSourceFileMatch(SRCFILE,"lob-copydata.20.1.html") ) { return "lob-copydata.20.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Overview of Configuring Copy Data") && Guidewire_FMSourceFileMatch(SRCFILE,"lob-copydata.20.2.html") ) { return "lob-copydata.20.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Copy Data Screens") && Guidewire_FMSourceFileMatch(SRCFILE,"lob-copydata.20.3.html") ) { return "lob-copydata.20.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Understanding Copiers") && Guidewire_FMSourceFileMatch(SRCFILE,"lob-copydata.20.4.html") ) { return "lob-copydata.20.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Copier API Classes") && Guidewire_FMSourceFileMatch(SRCFILE,"lob-copydata.20.5.html") ) { return "lob-copydata.20.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding Locations to a Line of Business") && Guidewire_FMSourceFileMatch(SRCFILE,"lob-locations.21.1.html") ) { return "lob-locations.21.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Methods to Remove a Location from a Policy Line") && Guidewire_FMSourceFileMatch(SRCFILE,"lob-locations.21.2.html") ) { return "lob-locations.21.2.html";}
else { return("../wwhelp/topic_cannot_be_found.html"); } }

function  WWHBookData_MatchTopic(P)
{
var C=null;P=decodeURIComponent(decodeURIComponent(escape(P)));//workaround epub bug with UTF8 processing!
if (C) { return C } else { return GUIDEWIRE_TOPIC_TO_FILE(P,Guidewire_ExtractSrcFromURL());}
}
