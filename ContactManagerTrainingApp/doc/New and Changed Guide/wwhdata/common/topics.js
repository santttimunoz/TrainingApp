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

else if (Guidewire_TopicMatch(TOPIC,"Guidewire PolicyCenter\u00ae") && Guidewire_FMSourceFileMatch(SRCFILE,"cover-whatsnew.html") ) { return "cover-whatsnew.html";}
else if (Guidewire_TopicMatch(TOPIC,"About PolicyCenter Documentation") && Guidewire_FMSourceFileMatch(SRCFILE,"about.html") ) { return "about.html";}
else if (Guidewire_TopicMatch(TOPIC,"What\u2019s New and Changed in 8.0 Maintenance Releases") && Guidewire_FMSourceFileMatch(SRCFILE,"p-emerald-maint.html") ) { return "p-emerald-maint.html";}
else if (Guidewire_TopicMatch(TOPIC,"New and Changed in PolicyCenter 8.0.4") && Guidewire_FMSourceFileMatch(SRCFILE,"804.04.1.html") ) { return "804.04.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"New in PolicyCenter 8.0.4") && Guidewire_FMSourceFileMatch(SRCFILE,"804.04.2.html") ) { return "804.04.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changed in PolicyCenter 8.0.4") && Guidewire_FMSourceFileMatch(SRCFILE,"804.04.3.html") ) { return "804.04.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"New and Changed in PolicyCenter 8.0.3") && Guidewire_FMSourceFileMatch(SRCFILE,"803.05.1.html") ) { return "803.05.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"New in PolicyCenter 8.0.3") && Guidewire_FMSourceFileMatch(SRCFILE,"803.05.2.html") ) { return "803.05.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changed in PolicyCenter 8.0.3") && Guidewire_FMSourceFileMatch(SRCFILE,"803.05.3.html") ) { return "803.05.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"New and Changed in PolicyCenter 8.0.2") && Guidewire_FMSourceFileMatch(SRCFILE,"802.06.1.html") ) { return "802.06.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"New in PolicyCenter 8.0.2") && Guidewire_FMSourceFileMatch(SRCFILE,"802.06.2.html") ) { return "802.06.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changed in PolicyCenter 8.0.2") && Guidewire_FMSourceFileMatch(SRCFILE,"802.06.3.html") ) { return "802.06.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"New and Changed in PolicyCenter 8.0.1") && Guidewire_FMSourceFileMatch(SRCFILE,"801.07.01.html") ) { return "801.07.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"New in PolicyCenter 8.0.1") && Guidewire_FMSourceFileMatch(SRCFILE,"801.07.02.html") ) { return "801.07.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"New in Rating Management") && Guidewire_FMSourceFileMatch(SRCFILE,"801.07.03.html") ) { return "801.07.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"High Volume Requests for Quotes") && Guidewire_FMSourceFileMatch(SRCFILE,"801.07.04.html") ) { return "801.07.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Affinity Groups") && Guidewire_FMSourceFileMatch(SRCFILE,"801.07.05.html") ) { return "801.07.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"New Support for OSGi Plugins") && Guidewire_FMSourceFileMatch(SRCFILE,"801.07.06.html") ) { return "801.07.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Gosu Using Clause Now Supports Finally Clause") && Guidewire_FMSourceFileMatch(SRCFILE,"801.07.07.html") ) { return "801.07.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changed in PolicyCenter 8.0.1") && Guidewire_FMSourceFileMatch(SRCFILE,"801.07.08.html") ) { return "801.07.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to Rating Management") && Guidewire_FMSourceFileMatch(SRCFILE,"801.07.09.html") ) { return "801.07.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to Web Service Transaction IDs") && Guidewire_FMSourceFileMatch(SRCFILE,"801.07.10.html") ) { return "801.07.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Change to Inbound Integration Configuration") && Guidewire_FMSourceFileMatch(SRCFILE,"801.07.11.html") ) { return "801.07.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Gosu Suppress Warnings Annotation") && Guidewire_FMSourceFileMatch(SRCFILE,"801.07.12.html") ) { return "801.07.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"Gosu Compound Assignment Operators for Logical AND and Logical OR") && Guidewire_FMSourceFileMatch(SRCFILE,"801.07.13.html") ) { return "801.07.13.html";}
else if (Guidewire_TopicMatch(TOPIC,"What\u2019s New and Changed in 8.0.0") && Guidewire_FMSourceFileMatch(SRCFILE,"p-emerald.html") ) { return "p-emerald.html";}
else if (Guidewire_TopicMatch(TOPIC,"New and Changed in PolicyCenter 8.0") && Guidewire_FMSourceFileMatch(SRCFILE,"e-app.09.01.html") ) { return "e-app.09.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"New in PolicyCenter 8.0") && Guidewire_FMSourceFileMatch(SRCFILE,"e-app.09.02.html") ) { return "e-app.09.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Account Holder Info Screen") && Guidewire_FMSourceFileMatch(SRCFILE,"e-app.09.03.html") ) { return "e-app.09.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Data Spreadsheet ImportExport") && Guidewire_FMSourceFileMatch(SRCFILE,"e-app.09.04.html") ) { return "e-app.09.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Multicurrency Policies") && Guidewire_FMSourceFileMatch(SRCFILE,"e-app.09.05.html") ) { return "e-app.09.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Service Tier Field on Account") && Guidewire_FMSourceFileMatch(SRCFILE,"e-app.09.06.html") ) { return "e-app.09.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changed in PolicyCenter 8.0") && Guidewire_FMSourceFileMatch(SRCFILE,"e-app.09.07.html") ) { return "e-app.09.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Transactions") && Guidewire_FMSourceFileMatch(SRCFILE,"e-app.09.08.html") ) { return "e-app.09.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to the Team Tab") && Guidewire_FMSourceFileMatch(SRCFILE,"e-app.09.09.html") ) { return "e-app.09.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Administration Menu Items Reorganized") && Guidewire_FMSourceFileMatch(SRCFILE,"e-app.09.10.html") ) { return "e-app.09.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Rate Routine Label Changed") && Guidewire_FMSourceFileMatch(SRCFILE,"e-app.09.11.html") ) { return "e-app.09.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Service Tier Field on Account") && Guidewire_FMSourceFileMatch(SRCFILE,"e-app.09.12.html") ) { return "e-app.09.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"My Submissions Screen") && Guidewire_FMSourceFileMatch(SRCFILE,"e-app.09.13.html") ) { return "e-app.09.13.html";}
else if (Guidewire_TopicMatch(TOPIC,"My Other Policy Transactions Screen") && Guidewire_FMSourceFileMatch(SRCFILE,"e-app.09.14.html") ) { return "e-app.09.14.html";}
else if (Guidewire_TopicMatch(TOPIC,"Region and Region Search Screens Combined") && Guidewire_FMSourceFileMatch(SRCFILE,"e-app.09.15.html") ) { return "e-app.09.15.html";}
else if (Guidewire_TopicMatch(TOPIC,"Reinsurance Attachment Inclusions") && Guidewire_FMSourceFileMatch(SRCFILE,"e-app.09.16.html") ) { return "e-app.09.16.html";}
else if (Guidewire_TopicMatch(TOPIC,"New and Changed in Configuration in 8.0") && Guidewire_FMSourceFileMatch(SRCFILE,"e-configuration.10.01.html") ) { return "e-configuration.10.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"Important Changes to the Configuration Module") && Guidewire_FMSourceFileMatch(SRCFILE,"e-configuration.10.02.html") ) { return "e-configuration.10.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to the Data Model") && Guidewire_FMSourceFileMatch(SRCFILE,"e-configuration.10.03.html") ) { return "e-configuration.10.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to the Generate Dictionary Command") && Guidewire_FMSourceFileMatch(SRCFILE,"e-configuration.10.04.html") ) { return "e-configuration.10.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to Guidewire Studio") && Guidewire_FMSourceFileMatch(SRCFILE,"e-configuration.10.05.html") ) { return "e-configuration.10.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to Configuration Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"e-configuration.10.06.html") ) { return "e-configuration.10.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to Web Services") && Guidewire_FMSourceFileMatch(SRCFILE,"e-configuration.10.07.html") ) { return "e-configuration.10.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes Related to PCF Files") && Guidewire_FMSourceFileMatch(SRCFILE,"e-configuration.10.08.html") ) { return "e-configuration.10.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to Search Criteria") && Guidewire_FMSourceFileMatch(SRCFILE,"e-configuration.10.09.html") ) { return "e-configuration.10.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to Configuring PolicyCenter") && Guidewire_FMSourceFileMatch(SRCFILE,"e-configuration.10.10.html") ) { return "e-configuration.10.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to Team Tab Configuration") && Guidewire_FMSourceFileMatch(SRCFILE,"e-configuration.10.11.html") ) { return "e-configuration.10.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to Configuring Underwriting Authority") && Guidewire_FMSourceFileMatch(SRCFILE,"e-configuration.10.12.html") ) { return "e-configuration.10.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to the PolicyCenter Product Model") && Guidewire_FMSourceFileMatch(SRCFILE,"e-configuration.10.13.html") ) { return "e-configuration.10.13.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to Configuring Lines of Business") && Guidewire_FMSourceFileMatch(SRCFILE,"e-configuration.10.14.html") ) { return "e-configuration.10.14.html";}
else if (Guidewire_TopicMatch(TOPIC,"Lines of Business Modularization") && Guidewire_FMSourceFileMatch(SRCFILE,"e-configuration.10.15.html") ) { return "e-configuration.10.15.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes Related to Integrating with ContactManager") && Guidewire_FMSourceFileMatch(SRCFILE,"e-configuration.10.16.html") ) { return "e-configuration.10.16.html";}
else if (Guidewire_TopicMatch(TOPIC,"Removal of Preload.txt Lines that Include Run Level") && Guidewire_FMSourceFileMatch(SRCFILE,"e-configuration.10.17.html") ) { return "e-configuration.10.17.html";}
else if (Guidewire_TopicMatch(TOPIC,"New and Changed in Product Designer in 8.0") && Guidewire_FMSourceFileMatch(SRCFILE,"e-designer.html") ) { return "e-designer.html";}
else if (Guidewire_TopicMatch(TOPIC,"New and Changed in Gosu in 8.0") && Guidewire_FMSourceFileMatch(SRCFILE,"e-gosu.12.01.html") ) { return "e-gosu.12.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"New in Gosu in PolicyCenter 8.0") && Guidewire_FMSourceFileMatch(SRCFILE,"e-gosu.12.02.html") ) { return "e-gosu.12.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"New Assert Statement") && Guidewire_FMSourceFileMatch(SRCFILE,"e-gosu.12.03.html") ) { return "e-gosu.12.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"In For Loop Declarations, Local Variable is Now Optional") && Guidewire_FMSourceFileMatch(SRCFILE,"e-gosu.12.04.html") ) { return "e-gosu.12.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Final Variable Initialization Separate from Declaration") && Guidewire_FMSourceFileMatch(SRCFILE,"e-gosu.12.05.html") ) { return "e-gosu.12.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"The new Operator is Now Optionally a Statement") && Guidewire_FMSourceFileMatch(SRCFILE,"e-gosu.12.06.html") ) { return "e-gosu.12.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Support Annotations on Function Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"e-gosu.12.07.html") ) { return "e-gosu.12.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Named Arguments in Annotations") && Guidewire_FMSourceFileMatch(SRCFILE,"e-gosu.12.08.html") ) { return "e-gosu.12.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"New Support for Code Coverage Tools for Gosu Code") && Guidewire_FMSourceFileMatch(SRCFILE,"e-gosu.12.09.html") ) { return "e-gosu.12.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"The Entity Touch API is Changed and No Longer Deprecated") && Guidewire_FMSourceFileMatch(SRCFILE,"e-gosu.12.10.html") ) { return "e-gosu.12.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changed in Gosu in PolicyCenter 8.0") && Guidewire_FMSourceFileMatch(SRCFILE,"e-gosu.12.11.html") ) { return "e-gosu.12.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Bundle Changes from Gosu and Java") && Guidewire_FMSourceFileMatch(SRCFILE,"e-gosu.12.12.html") ) { return "e-gosu.12.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"Gosu Map Enhancement Method Changes") && Guidewire_FMSourceFileMatch(SRCFILE,"e-gosu.12.13.html") ) { return "e-gosu.12.13.html";}
else if (Guidewire_TopicMatch(TOPIC,"Entity Literal Syntax is Deprecated") && Guidewire_FMSourceFileMatch(SRCFILE,"e-gosu.12.14.html") ) { return "e-gosu.12.14.html";}
else if (Guidewire_TopicMatch(TOPIC,"Entity Methods loadByKey, loadByPublicID, and remove Deprecated") && Guidewire_FMSourceFileMatch(SRCFILE,"e-gosu.12.15.html") ) { return "e-gosu.12.15.html";}
else if (Guidewire_TopicMatch(TOPIC,"Packages Changed to Reflect Public and Internal Status") && Guidewire_FMSourceFileMatch(SRCFILE,"e-gosu.12.16.html") ) { return "e-gosu.12.16.html";}
else if (Guidewire_TopicMatch(TOPIC,"Gosu Concurrency API Changes") && Guidewire_FMSourceFileMatch(SRCFILE,"e-gosu.12.17.html") ) { return "e-gosu.12.17.html";}
else if (Guidewire_TopicMatch(TOPIC,"The () Inequality Operator Is Now Invalid") && Guidewire_FMSourceFileMatch(SRCFILE,"e-gosu.12.18.html") ) { return "e-gosu.12.18.html";}
else if (Guidewire_TopicMatch(TOPIC,"The Gosu Command Line Tool Built-in Editor Removed") && Guidewire_FMSourceFileMatch(SRCFILE,"e-gosu.12.19.html") ) { return "e-gosu.12.19.html";}
else if (Guidewire_TopicMatch(TOPIC,"Change in Gosu Named Parameters Usage") && Guidewire_FMSourceFileMatch(SRCFILE,"e-gosu.12.20.html") ) { return "e-gosu.12.20.html";}
else if (Guidewire_TopicMatch(TOPIC,"New and Changed in Integration in 8.0") && Guidewire_FMSourceFileMatch(SRCFILE,"e-integration.13.01.html") ) { return "e-integration.13.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"New in Integration in PolicyCenter 8.0") && Guidewire_FMSourceFileMatch(SRCFILE,"e-integration.13.02.html") ) { return "e-integration.13.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"New Phone Number Normalizer Plugin") && Guidewire_FMSourceFileMatch(SRCFILE,"e-integration.13.03.html") ) { return "e-integration.13.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"High Availability for Free-Text Search with Apache Zookeeper") && Guidewire_FMSourceFileMatch(SRCFILE,"e-integration.13.04.html") ) { return "e-integration.13.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"New MTOM Support for Results of Published WS-I Web Service") && Guidewire_FMSourceFileMatch(SRCFILE,"e-integration.13.05.html") ) { return "e-integration.13.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Multi-threaded Inbound Integration") && Guidewire_FMSourceFileMatch(SRCFILE,"e-integration.13.06.html") ) { return "e-integration.13.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"New PolicyEarnedPremiumAPI Web Service") && Guidewire_FMSourceFileMatch(SRCFILE,"e-integration.13.07.html") ) { return "e-integration.13.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"New Plugin Interface IFXRatePlugin") && Guidewire_FMSourceFileMatch(SRCFILE,"e-integration.13.08.html") ) { return "e-integration.13.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"New Messaging Destination Option for Messages Without Primary Object") && Guidewire_FMSourceFileMatch(SRCFILE,"e-integration.13.09.html") ) { return "e-integration.13.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Regenerating WSDL and XSD in Web Service Collections (regen-from-wsc)") && Guidewire_FMSourceFileMatch(SRCFILE,"e-integration.13.10.html") ) { return "e-integration.13.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changed in Integration in PolicyCenter 8.0") && Guidewire_FMSourceFileMatch(SRCFILE,"e-integration.13.11.html") ) { return "e-integration.13.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"RPCE Web Services Deprecated in 8.0") && Guidewire_FMSourceFileMatch(SRCFILE,"e-integration.13.12.html") ) { return "e-integration.13.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to Existing Web Services") && Guidewire_FMSourceFileMatch(SRCFILE,"e-integration.13.13.html") ) { return "e-integration.13.13.html";}
else if (Guidewire_TopicMatch(TOPIC,"Important Changes for Java Code") && Guidewire_FMSourceFileMatch(SRCFILE,"e-integration.13.14.html") ) { return "e-integration.13.14.html";}
else if (Guidewire_TopicMatch(TOPIC,"Plugin Registry Changes in Studio") && Guidewire_FMSourceFileMatch(SRCFILE,"e-integration.13.15.html") ) { return "e-integration.13.15.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to Importing the PolicyCenter Product Model into ClaimCenter") && Guidewire_FMSourceFileMatch(SRCFILE,"e-integration.13.16.html") ) { return "e-integration.13.16.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to Document Management Integration") && Guidewire_FMSourceFileMatch(SRCFILE,"e-integration.13.17.html") ) { return "e-integration.13.17.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to Plugins and Classes for Line-of-business Modularization") && Guidewire_FMSourceFileMatch(SRCFILE,"e-integration.13.18.html") ) { return "e-integration.13.18.html";}
else if (Guidewire_TopicMatch(TOPIC,"ClaimCenter Typelist Generator Tool") && Guidewire_FMSourceFileMatch(SRCFILE,"e-integration.13.19.html") ) { return "e-integration.13.19.html";}
else if (Guidewire_TopicMatch(TOPIC,"Contact Messaging Flow Changed") && Guidewire_FMSourceFileMatch(SRCFILE,"e-integration.13.20.html") ) { return "e-integration.13.20.html";}
else if (Guidewire_TopicMatch(TOPIC,"PolicyCenter Plugin Changes For Multicurrency") && Guidewire_FMSourceFileMatch(SRCFILE,"e-integration.13.21.html") ) { return "e-integration.13.21.html";}
else if (Guidewire_TopicMatch(TOPIC,"Free-text Search Upgrades") && Guidewire_FMSourceFileMatch(SRCFILE,"e-integration.13.22.html") ) { return "e-integration.13.22.html";}
else if (Guidewire_TopicMatch(TOPIC,"New PCPolicyPublicID Property in Web Services Methods") && Guidewire_FMSourceFileMatch(SRCFILE,"e-integration.13.23.html") ) { return "e-integration.13.23.html";}
else if (Guidewire_TopicMatch(TOPIC,"Populator Plugin Deprecated and No Longer Called") && Guidewire_FMSourceFileMatch(SRCFILE,"e-integration.13.24.html") ) { return "e-integration.13.24.html";}
else if (Guidewire_TopicMatch(TOPIC,"New and Changed in System Administration in 8.0") && Guidewire_FMSourceFileMatch(SRCFILE,"e-administration.14.1.html") ) { return "e-administration.14.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"New in System Administration in 8.0") && Guidewire_FMSourceFileMatch(SRCFILE,"e-administration.14.2.html") ) { return "e-administration.14.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Phone Number Normalizer Work Queue") && Guidewire_FMSourceFileMatch(SRCFILE,"e-administration.14.3.html") ) { return "e-administration.14.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changed in System Administration in 8.0") && Guidewire_FMSourceFileMatch(SRCFILE,"e-administration.14.4.html") ) { return "e-administration.14.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to Database Configuration") && Guidewire_FMSourceFileMatch(SRCFILE,"e-administration.14.5.html") ) { return "e-administration.14.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to Work Queue Configuration") && Guidewire_FMSourceFileMatch(SRCFILE,"e-administration.14.6.html") ) { return "e-administration.14.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to Scheduled Purge Batch Processes") && Guidewire_FMSourceFileMatch(SRCFILE,"e-administration.14.7.html") ) { return "e-administration.14.7.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to Database Statistics Updating") && Guidewire_FMSourceFileMatch(SRCFILE,"e-administration.14.8.html") ) { return "e-administration.14.8.html";}
else if (Guidewire_TopicMatch(TOPIC,"User Batch Process Now Named Team Screens") && Guidewire_FMSourceFileMatch(SRCFILE,"e-administration.14.9.html") ) { return "e-administration.14.9.html";}
else if (Guidewire_TopicMatch(TOPIC,"New and Changed in Rules in 8.0") && Guidewire_FMSourceFileMatch(SRCFILE,"e-rules.15.1.html") ) { return "e-rules.15.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes in Rules in PolicyCenter 8.0") && Guidewire_FMSourceFileMatch(SRCFILE,"e-rules.15.2.html") ) { return "e-rules.15.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Preupdate Rules Removed") && Guidewire_FMSourceFileMatch(SRCFILE,"e-rules.15.3.html") ) { return "e-rules.15.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Evaluation Rule Set Functionality Replaced") && Guidewire_FMSourceFileMatch(SRCFILE,"e-rules.15.4.html") ) { return "e-rules.15.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"New and Changed in Globalization in\u00a08.0") && Guidewire_FMSourceFileMatch(SRCFILE,"e-globalization.16.01.html") ) { return "e-globalization.16.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"New to Globalization in PolicyCenter 8.0") && Guidewire_FMSourceFileMatch(SRCFILE,"e-globalization.16.02.html") ) { return "e-globalization.16.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Separation of Language and Regional Format") && Guidewire_FMSourceFileMatch(SRCFILE,"e-globalization.16.03.html") ) { return "e-globalization.16.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Base Configuration Language Support") && Guidewire_FMSourceFileMatch(SRCFILE,"e-globalization.16.04.html") ) { return "e-globalization.16.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Base Configuration Region Support") && Guidewire_FMSourceFileMatch(SRCFILE,"e-globalization.16.05.html") ) { return "e-globalization.16.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Base Configuration Currency Support") && Guidewire_FMSourceFileMatch(SRCFILE,"e-globalization.16.06.html") ) { return "e-globalization.16.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Base Configuration Geographical Support") && Guidewire_FMSourceFileMatch(SRCFILE,"e-globalization.16.07.html") ) { return "e-globalization.16.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Phone Number Data and Phone Validator Gosu Class") && Guidewire_FMSourceFileMatch(SRCFILE,"e-globalization.16.08.html") ) { return "e-globalization.16.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Automatic Address Completion and Fill-in Plugin Functionality") && Guidewire_FMSourceFileMatch(SRCFILE,"e-globalization.16.09.html") ) { return "e-globalization.16.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Ability to Provide a Sort Order for the Typecodes in a Typelist") && Guidewire_FMSourceFileMatch(SRCFILE,"e-globalization.16.10.html") ) { return "e-globalization.16.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Language Module Installation Utility") && Guidewire_FMSourceFileMatch(SRCFILE,"e-globalization.16.11.html") ) { return "e-globalization.16.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Globalization-related Configuration Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"e-globalization.16.12.html") ) { return "e-globalization.16.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"Globalization-related Typelists") && Guidewire_FMSourceFileMatch(SRCFILE,"e-globalization.16.13.html") ) { return "e-globalization.16.13.html";}
else if (Guidewire_TopicMatch(TOPIC,"Ability to Set First Day of Week by Region") && Guidewire_FMSourceFileMatch(SRCFILE,"e-globalization.16.14.html") ) { return "e-globalization.16.14.html";}
else if (Guidewire_TopicMatch(TOPIC,"New in the PolicyCenter 8.0 Data Model") && Guidewire_FMSourceFileMatch(SRCFILE,"e-globalization.16.15.html") ) { return "e-globalization.16.15.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to Globalization in PolicyCenter 8.0") && Guidewire_FMSourceFileMatch(SRCFILE,"e-globalization.16.16.html") ) { return "e-globalization.16.16.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to Address Configuration 8.0") && Guidewire_FMSourceFileMatch(SRCFILE,"e-globalization.16.17.html") ) { return "e-globalization.16.17.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to Admin Data Localization") && Guidewire_FMSourceFileMatch(SRCFILE,"e-globalization.16.18.html") ) { return "e-globalization.16.18.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to 8.0 Typelists") && Guidewire_FMSourceFileMatch(SRCFILE,"e-globalization.16.19.html") ) { return "e-globalization.16.19.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to Files Used with Globalization") && Guidewire_FMSourceFileMatch(SRCFILE,"e-globalization.16.20.html") ) { return "e-globalization.16.20.html";}
else if (Guidewire_TopicMatch(TOPIC,"What\u2019s New and Changed in 7.0.0") && Guidewire_FMSourceFileMatch(SRCFILE,"part-b.html") ) { return "part-b.html";}
else if (Guidewire_TopicMatch(TOPIC,"New and Changed in PolicyCenter 7.0") && Guidewire_FMSourceFileMatch(SRCFILE,"d-app.18.01.html") ) { return "d-app.18.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"PolicyCenter Lines of Business") && Guidewire_FMSourceFileMatch(SRCFILE,"d-app.18.02.html") ) { return "d-app.18.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"New Commercial Property Blankets") && Guidewire_FMSourceFileMatch(SRCFILE,"d-app.18.03.html") ) { return "d-app.18.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Copying Coverages") && Guidewire_FMSourceFileMatch(SRCFILE,"d-app.18.04.html") ) { return "d-app.18.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to Personal Auto") && Guidewire_FMSourceFileMatch(SRCFILE,"d-app.18.05.html") ) { return "d-app.18.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Business Auto Becomes Commercial Auto") && Guidewire_FMSourceFileMatch(SRCFILE,"d-app.18.06.html") ) { return "d-app.18.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"PolicyCenter Jobs") && Guidewire_FMSourceFileMatch(SRCFILE,"d-app.18.07.html") ) { return "d-app.18.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Side-by-side Quoting") && Guidewire_FMSourceFileMatch(SRCFILE,"d-app.18.08.html") ) { return "d-app.18.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Rescheduling a Cancellation") && Guidewire_FMSourceFileMatch(SRCFILE,"d-app.18.09.html") ) { return "d-app.18.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changing the Effective Date of a Policy Change") && Guidewire_FMSourceFileMatch(SRCFILE,"d-app.18.10.html") ) { return "d-app.18.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Rewrite New Account Job") && Guidewire_FMSourceFileMatch(SRCFILE,"d-app.18.11.html") ) { return "d-app.18.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"PolicyCenter Components") && Guidewire_FMSourceFileMatch(SRCFILE,"d-app.18.12.html") ) { return "d-app.18.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to Activities") && Guidewire_FMSourceFileMatch(SRCFILE,"d-app.18.13.html") ) { return "d-app.18.13.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to Account History Screen and Events") && Guidewire_FMSourceFileMatch(SRCFILE,"d-app.18.14.html") ) { return "d-app.18.14.html";}
else if (Guidewire_TopicMatch(TOPIC,"Account Relationships") && Guidewire_FMSourceFileMatch(SRCFILE,"d-app.18.15.html") ) { return "d-app.18.15.html";}
else if (Guidewire_TopicMatch(TOPIC,"Moving or Rewriting Policies Between Accounts") && Guidewire_FMSourceFileMatch(SRCFILE,"d-app.18.16.html") ) { return "d-app.18.16.html";}
else if (Guidewire_TopicMatch(TOPIC,"Merging Accounts") && Guidewire_FMSourceFileMatch(SRCFILE,"d-app.18.17.html") ) { return "d-app.18.17.html";}
else if (Guidewire_TopicMatch(TOPIC,"Copying Data Between Policies") && Guidewire_FMSourceFileMatch(SRCFILE,"d-app.18.18.html") ) { return "d-app.18.18.html";}
else if (Guidewire_TopicMatch(TOPIC,"Splitting and Spinning Policies") && Guidewire_FMSourceFileMatch(SRCFILE,"d-app.18.19.html") ) { return "d-app.18.19.html";}
else if (Guidewire_TopicMatch(TOPIC,"Contact Tab") && Guidewire_FMSourceFileMatch(SRCFILE,"d-app.18.20.html") ) { return "d-app.18.20.html";}
else if (Guidewire_TopicMatch(TOPIC,"Linking Addresses on Contacts") && Guidewire_FMSourceFileMatch(SRCFILE,"d-app.18.21.html") ) { return "d-app.18.21.html";}
else if (Guidewire_TopicMatch(TOPIC,"Updating Contacts in Effective Time") && Guidewire_FMSourceFileMatch(SRCFILE,"d-app.18.22.html") ) { return "d-app.18.22.html";}
else if (Guidewire_TopicMatch(TOPIC,"Reinsurance") && Guidewire_FMSourceFileMatch(SRCFILE,"d-app.18.23.html") ) { return "d-app.18.23.html";}
else if (Guidewire_TopicMatch(TOPIC,"Change to End Date Field in Underwriting Entities") && Guidewire_FMSourceFileMatch(SRCFILE,"d-app.18.24.html") ) { return "d-app.18.24.html";}
else if (Guidewire_TopicMatch(TOPIC,"Administering PolicyCenter") && Guidewire_FMSourceFileMatch(SRCFILE,"d-app.18.25.html") ) { return "d-app.18.25.html";}
else if (Guidewire_TopicMatch(TOPIC,"Administering Policy Holds") && Guidewire_FMSourceFileMatch(SRCFILE,"d-app.18.26.html") ) { return "d-app.18.26.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to Administering Policy Forms") && Guidewire_FMSourceFileMatch(SRCFILE,"d-app.18.27.html") ) { return "d-app.18.27.html";}
else if (Guidewire_TopicMatch(TOPIC,"Reassigning Job Roles") && Guidewire_FMSourceFileMatch(SRCFILE,"d-app.18.28.html") ) { return "d-app.18.28.html";}
else if (Guidewire_TopicMatch(TOPIC,"Product Integrations") && Guidewire_FMSourceFileMatch(SRCFILE,"d-app.18.29.html") ) { return "d-app.18.29.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to the Billing System Integration") && Guidewire_FMSourceFileMatch(SRCFILE,"d-app.18.30.html") ) { return "d-app.18.30.html";}
else if (Guidewire_TopicMatch(TOPIC,"New and Changed in Configuration in 7.0") && Guidewire_FMSourceFileMatch(SRCFILE,"d-configuration.19.1.html") ) { return "d-configuration.19.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to the Data Model") && Guidewire_FMSourceFileMatch(SRCFILE,"d-configuration.19.2.html") ) { return "d-configuration.19.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to Guidewire Studio") && Guidewire_FMSourceFileMatch(SRCFILE,"d-configuration.19.3.html") ) { return "d-configuration.19.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to Configuration Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"d-configuration.19.4.html") ) { return "d-configuration.19.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to Web Services") && Guidewire_FMSourceFileMatch(SRCFILE,"d-configuration.19.5.html") ) { return "d-configuration.19.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes Related to PCF Files") && Guidewire_FMSourceFileMatch(SRCFILE,"d-configuration.19.6.html") ) { return "d-configuration.19.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to the PolicyCenter Product Model") && Guidewire_FMSourceFileMatch(SRCFILE,"d-configuration.19.7.html") ) { return "d-configuration.19.7.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to Configuring Lines of Business") && Guidewire_FMSourceFileMatch(SRCFILE,"d-configuration.19.8.html") ) { return "d-configuration.19.8.html";}
else if (Guidewire_TopicMatch(TOPIC,"Improvements in Localization") && Guidewire_FMSourceFileMatch(SRCFILE,"d-configuration.19.9.html") ) { return "d-configuration.19.9.html";}
else if (Guidewire_TopicMatch(TOPIC,"New and Changed in Gosu in 7.0") && Guidewire_FMSourceFileMatch(SRCFILE,"d-gosu.20.01.html") ) { return "d-gosu.20.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"New in Gosu in 7.0") && Guidewire_FMSourceFileMatch(SRCFILE,"d-gosu.20.02.html") ) { return "d-gosu.20.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Gosu Support for Intervals") && Guidewire_FMSourceFileMatch(SRCFILE,"d-gosu.20.03.html") ) { return "d-gosu.20.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Gosu Support for Numeric Literals") && Guidewire_FMSourceFileMatch(SRCFILE,"d-gosu.20.04.html") ) { return "d-gosu.20.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"New Null-safe Operators") && Guidewire_FMSourceFileMatch(SRCFILE,"d-gosu.20.05.html") ) { return "d-gosu.20.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"New Named Function Arguments and Argument Defaults") && Guidewire_FMSourceFileMatch(SRCFILE,"d-gosu.20.06.html") ) { return "d-gosu.20.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changed in Gosu in 7.0") && Guidewire_FMSourceFileMatch(SRCFILE,"d-gosu.20.07.html") ) { return "d-gosu.20.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Gosu Compiles to Java Virtual Machine Bytecode") && Guidewire_FMSourceFileMatch(SRCFILE,"d-gosu.20.08.html") ) { return "d-gosu.20.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Gosu Syntax Changes (Compile Time Issues)") && Guidewire_FMSourceFileMatch(SRCFILE,"d-gosu.20.09.html") ) { return "d-gosu.20.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Gosu Behavior Changes (Run Time Issues)") && Guidewire_FMSourceFileMatch(SRCFILE,"d-gosu.20.10.html") ) { return "d-gosu.20.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"New XML APIs and Improved XSD Support Using \u2018XmlElement\u2019") && Guidewire_FMSourceFileMatch(SRCFILE,"d-gosu.20.11.html") ) { return "d-gosu.20.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Guidewire XML Modeler (GX Modeler) Upgraded to Use New XML API") && Guidewire_FMSourceFileMatch(SRCFILE,"d-gosu.20.12.html") ) { return "d-gosu.20.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"Interceptors Removed") && Guidewire_FMSourceFileMatch(SRCFILE,"d-gosu.20.13.html") ) { return "d-gosu.20.13.html";}
else if (Guidewire_TopicMatch(TOPIC,"New and Changed in Integration in 7.0") && Guidewire_FMSourceFileMatch(SRCFILE,"d-integration.21.01.html") ) { return "d-integration.21.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"New in Integration in 7.0") && Guidewire_FMSourceFileMatch(SRCFILE,"d-integration.21.02.html") ) { return "d-integration.21.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Motor Vehicle Record (MVR) Plugin") && Guidewire_FMSourceFileMatch(SRCFILE,"d-integration.21.03.html") ) { return "d-integration.21.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Reinsurance Architecture and Plugin") && Guidewire_FMSourceFileMatch(SRCFILE,"d-integration.21.04.html") ) { return "d-integration.21.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"New ClaimCenter PolicyCenter Integration") && Guidewire_FMSourceFileMatch(SRCFILE,"d-integration.21.05.html") ) { return "d-integration.21.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Hold Evaluation Plugin") && Guidewire_FMSourceFileMatch(SRCFILE,"d-integration.21.06.html") ) { return "d-integration.21.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"New Populator Plugin") && Guidewire_FMSourceFileMatch(SRCFILE,"d-integration.21.07.html") ) { return "d-integration.21.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"New Methods in ProductModelAPI") && Guidewire_FMSourceFileMatch(SRCFILE,"d-integration.21.08.html") ) { return "d-integration.21.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes in Integration in 7.0") && Guidewire_FMSourceFileMatch(SRCFILE,"d-integration.21.09.html") ) { return "d-integration.21.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"WS-I Web Services") && Guidewire_FMSourceFileMatch(SRCFILE,"d-integration.21.10.html") ) { return "d-integration.21.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Setting Locale in WS-I Requests for Guidewire Servers Only") && Guidewire_FMSourceFileMatch(SRCFILE,"d-integration.21.11.html") ) { return "d-integration.21.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to Locally-Accessed RPCE Web Services") && Guidewire_FMSourceFileMatch(SRCFILE,"d-integration.21.12.html") ) { return "d-integration.21.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"IAccountPlugin Web Service Changes for Transferring Policies") && Guidewire_FMSourceFileMatch(SRCFILE,"d-integration.21.13.html") ) { return "d-integration.21.13.html";}
else if (Guidewire_TopicMatch(TOPIC,"SubmissionAPI Changes") && Guidewire_FMSourceFileMatch(SRCFILE,"d-integration.21.14.html") ) { return "d-integration.21.14.html";}
else if (Guidewire_TopicMatch(TOPIC,"PolicyAPI Changes") && Guidewire_FMSourceFileMatch(SRCFILE,"d-integration.21.15.html") ) { return "d-integration.21.15.html";}
else if (Guidewire_TopicMatch(TOPIC,"PolicyRenewalAPI Changes") && Guidewire_FMSourceFileMatch(SRCFILE,"d-integration.21.16.html") ) { return "d-integration.21.16.html";}
else if (Guidewire_TopicMatch(TOPIC,"Confirming Renewals Integration Flow") && Guidewire_FMSourceFileMatch(SRCFILE,"d-integration.21.17.html") ) { return "d-integration.21.17.html";}
else if (Guidewire_TopicMatch(TOPIC,"Guidewire InsuranceSuite Plugin Implementations are Versioned") && Guidewire_FMSourceFileMatch(SRCFILE,"d-integration.21.18.html") ) { return "d-integration.21.18.html";}
else if (Guidewire_TopicMatch(TOPIC,"SOAP Implementation Classes and WSDL Packages Include Version") && Guidewire_FMSourceFileMatch(SRCFILE,"d-integration.21.19.html") ) { return "d-integration.21.19.html";}
else if (Guidewire_TopicMatch(TOPIC,"Geocoding Only Some Addresses") && Guidewire_FMSourceFileMatch(SRCFILE,"d-integration.21.20.html") ) { return "d-integration.21.20.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to PolicyCenter Contact-related Plugins") && Guidewire_FMSourceFileMatch(SRCFILE,"d-integration.21.21.html") ) { return "d-integration.21.21.html";}
else if (Guidewire_TopicMatch(TOPIC,"ContactAPI Web Service Changes") && Guidewire_FMSourceFileMatch(SRCFILE,"d-integration.21.22.html") ) { return "d-integration.21.22.html";}
else if (Guidewire_TopicMatch(TOPIC,"Improvements to Matching Classes") && Guidewire_FMSourceFileMatch(SRCFILE,"d-integration.21.23.html") ) { return "d-integration.21.23.html";}
else if (Guidewire_TopicMatch(TOPIC,"Escalation and Exception Plugins") && Guidewire_FMSourceFileMatch(SRCFILE,"d-integration.21.24.html") ) { return "d-integration.21.24.html";}
else if (Guidewire_TopicMatch(TOPIC,"Billing Plugin Changes") && Guidewire_FMSourceFileMatch(SRCFILE,"d-integration.21.25.html") ) { return "d-integration.21.25.html";}
else if (Guidewire_TopicMatch(TOPIC,"Billing Summary Plugin Changes") && Guidewire_FMSourceFileMatch(SRCFILE,"d-integration.21.26.html") ) { return "d-integration.21.26.html";}
else if (Guidewire_TopicMatch(TOPIC,"For Messaging, a Contact is a Now a Safe-ordered Object") && Guidewire_FMSourceFileMatch(SRCFILE,"d-integration.21.27.html") ) { return "d-integration.21.27.html";}
else if (Guidewire_TopicMatch(TOPIC,"Integrating PolicyCenter 7.0.0 with ClaimCenter 6.0.0") && Guidewire_FMSourceFileMatch(SRCFILE,"d-integration.21.28.html") ) { return "d-integration.21.28.html";}
else if (Guidewire_TopicMatch(TOPIC,"AccountSyncable Changes") && Guidewire_FMSourceFileMatch(SRCFILE,"d-integration.21.29.html") ) { return "d-integration.21.29.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes to Messaging System Safe Ordering") && Guidewire_FMSourceFileMatch(SRCFILE,"d-integration.21.30.html") ) { return "d-integration.21.30.html";}
else if (Guidewire_TopicMatch(TOPIC,"New and Changed in System Administration in 7.0") && Guidewire_FMSourceFileMatch(SRCFILE,"d-administration.22.1.html") ) { return "d-administration.22.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"New in System Administration in 7.0") && Guidewire_FMSourceFileMatch(SRCFILE,"d-administration.22.2.html") ) { return "d-administration.22.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"DCE VM Strongly Recommended for Development Environments") && Guidewire_FMSourceFileMatch(SRCFILE,"d-administration.22.3.html") ) { return "d-administration.22.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Support for Importing and Exporting Policy Forms and Policy Holds") && Guidewire_FMSourceFileMatch(SRCFILE,"d-administration.22.4.html") ) { return "d-administration.22.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changed in System Administration in 7.0") && Guidewire_FMSourceFileMatch(SRCFILE,"d-administration.22.5.html") ) { return "d-administration.22.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Updated System Requirements") && Guidewire_FMSourceFileMatch(SRCFILE,"d-administration.22.6.html") ) { return "d-administration.22.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"Database Configuration Changes") && Guidewire_FMSourceFileMatch(SRCFILE,"d-administration.22.7.html") ) { return "d-administration.22.7.html";}
else if (Guidewire_TopicMatch(TOPIC,"Maximum Contact Search Results Parameter Name") && Guidewire_FMSourceFileMatch(SRCFILE,"d-administration.22.8.html") ) { return "d-administration.22.8.html";}
else if (Guidewire_TopicMatch(TOPIC,"New and Changed in Rules in 7.0") && Guidewire_FMSourceFileMatch(SRCFILE,"d-rules.23.1.html") ) { return "d-rules.23.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changes in Rules in PolicyCenter 7.0") && Guidewire_FMSourceFileMatch(SRCFILE,"d-rules.23.2.html") ) { return "d-rules.23.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Release Notes Archive") && Guidewire_FMSourceFileMatch(SRCFILE,"part-relnotes.html") ) { return "part-relnotes.html";}
else if (Guidewire_TopicMatch(TOPIC,"Guidewire PolicyCenter 8.0.3 Release\u00a0Notes") && Guidewire_FMSourceFileMatch(SRCFILE,"ReleaseNotes-PC803.html") ) { return "ReleaseNotes-PC803.html";}
else if (Guidewire_TopicMatch(TOPIC,"Guidewire PolicyCenter 8.0.2 Release\u00a0Notes") && Guidewire_FMSourceFileMatch(SRCFILE,"ReleaseNotes-PC802.html") ) { return "ReleaseNotes-PC802.html";}
else if (Guidewire_TopicMatch(TOPIC,"Guidewire PolicyCenter 8.0.1 Release\u00a0Notes") && Guidewire_FMSourceFileMatch(SRCFILE,"ReleaseNotes-PC801.html") ) { return "ReleaseNotes-PC801.html";}
else if (Guidewire_TopicMatch(TOPIC,"Guidewire PolicyCenter 8.0.0 Release\u00a0Notes") && Guidewire_FMSourceFileMatch(SRCFILE,"ReleaseNotes-PC800.html") ) { return "ReleaseNotes-PC800.html";}
else if (Guidewire_TopicMatch(TOPIC,"Guidewire PolicyCenter 7.0.9 Release\u00a0Notes") && Guidewire_FMSourceFileMatch(SRCFILE,"ReleaseNotes-PC709.html") ) { return "ReleaseNotes-PC709.html";}
else if (Guidewire_TopicMatch(TOPIC,"Guidewire PolicyCenter 7.0.8 Release\u00a0Notes") && Guidewire_FMSourceFileMatch(SRCFILE,"ReleaseNotes-PC708.html") ) { return "ReleaseNotes-PC708.html";}
else if (Guidewire_TopicMatch(TOPIC,"Guidewire PolicyCenter 7.0.7 Release\u00a0Notes") && Guidewire_FMSourceFileMatch(SRCFILE,"ReleaseNotes-PC707.html") ) { return "ReleaseNotes-PC707.html";}
else if (Guidewire_TopicMatch(TOPIC,"Guidewire PolicyCenter 7.0.6 Release\u00a0Notes") && Guidewire_FMSourceFileMatch(SRCFILE,"ReleaseNotes-PC706.html") ) { return "ReleaseNotes-PC706.html";}
else if (Guidewire_TopicMatch(TOPIC,"Guidewire PolicyCenter 7.0.5 Release\u00a0Notes") && Guidewire_FMSourceFileMatch(SRCFILE,"ReleaseNotes-PC705.html") ) { return "ReleaseNotes-PC705.html";}
else if (Guidewire_TopicMatch(TOPIC,"Guidewire PolicyCenter 7.0.4 Release\u00a0Notes") && Guidewire_FMSourceFileMatch(SRCFILE,"ReleaseNotes-PC704.html") ) { return "ReleaseNotes-PC704.html";}
else if (Guidewire_TopicMatch(TOPIC,"Guidewire PolicyCenter 7.0.3 Release\u00a0Notes") && Guidewire_FMSourceFileMatch(SRCFILE,"ReleaseNotes_PC-703.html") ) { return "ReleaseNotes_PC-703.html";}
else if (Guidewire_TopicMatch(TOPIC,"Guidewire PolicyCenter 7.0.2 Release\u00a0Notes") && Guidewire_FMSourceFileMatch(SRCFILE,"ReleaseNotes_PC-702.html") ) { return "ReleaseNotes_PC-702.html";}
else if (Guidewire_TopicMatch(TOPIC,"Guidewire PolicyCenter 7.0.1 Release\u00a0Notes") && Guidewire_FMSourceFileMatch(SRCFILE,"ReleaseNotes_PC-701.html") ) { return "ReleaseNotes_PC-701.html";}
else if (Guidewire_TopicMatch(TOPIC,"Guidewire PolicyCenter 7.0.0 Release\u00a0Notes") && Guidewire_FMSourceFileMatch(SRCFILE,"ReleaseNotes_PC-700.html") ) { return "ReleaseNotes_PC-700.html";}
else if (Guidewire_TopicMatch(TOPIC,"Guidewire PolicyCenter 4.0.6 Release\u00a0Notes") && Guidewire_FMSourceFileMatch(SRCFILE,"ReleaseNotes_PC-406.html") ) { return "ReleaseNotes_PC-406.html";}
else if (Guidewire_TopicMatch(TOPIC,"Guidewire PolicyCenter 4.0.5 Release\u00a0Notes") && Guidewire_FMSourceFileMatch(SRCFILE,"ReleaseNotes_PC-405.html") ) { return "ReleaseNotes_PC-405.html";}
else if (Guidewire_TopicMatch(TOPIC,"Guidewire PolicyCenter 4.0.4 Release\u00a0Notes") && Guidewire_FMSourceFileMatch(SRCFILE,"relnotes-pc404.html") ) { return "relnotes-pc404.html";}
else if (Guidewire_TopicMatch(TOPIC,"Guidewire PolicyCenter 4.0.3 Release\u00a0Notes") && Guidewire_FMSourceFileMatch(SRCFILE,"relnotes-pc403.html") ) { return "relnotes-pc403.html";}
else if (Guidewire_TopicMatch(TOPIC,"Guidewire PolicyCenter 4.0.2 Release\u00a0Notes") && Guidewire_FMSourceFileMatch(SRCFILE,"relnotes-pc402.html") ) { return "relnotes-pc402.html";}
else if (Guidewire_TopicMatch(TOPIC,"Guidewire PolicyCenter 4.0.1 Release\u00a0Notes") && Guidewire_FMSourceFileMatch(SRCFILE,"relnotes-pc401.html") ) { return "relnotes-pc401.html";}
else if (Guidewire_TopicMatch(TOPIC,"Guidewire PolicyCenter 4.0.0 Release\u00a0Notes") && Guidewire_FMSourceFileMatch(SRCFILE,"relnotes-pc400.html") ) { return "relnotes-pc400.html";}
else { return("../wwhelp/topic_cannot_be_found.html"); } }

function  WWHBookData_MatchTopic(P)
{
var C=null;P=decodeURIComponent(decodeURIComponent(escape(P)));//workaround epub bug with UTF8 processing!
if (C) { return C } else { return GUIDEWIRE_TOPIC_TO_FILE(P,Guidewire_ExtractSrcFromURL());}
}
