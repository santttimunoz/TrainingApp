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

else if (Guidewire_TopicMatch(TOPIC,"Guidewire PolicyCenter\u00ae") && Guidewire_FMSourceFileMatch(SRCFILE,"cover-app.html") ) { return "cover-app.html";}
else if (Guidewire_TopicMatch(TOPIC,"About PolicyCenter Documentation") && Guidewire_FMSourceFileMatch(SRCFILE,"about.html") ) { return "about.html";}
else if (Guidewire_TopicMatch(TOPIC,"Introduction") && Guidewire_FMSourceFileMatch(SRCFILE,"p_intro.html") ) { return "p_intro.html";}
else if (Guidewire_TopicMatch(TOPIC,"Introduction to PolicyCenter") && Guidewire_FMSourceFileMatch(SRCFILE,"intro.04.1.html") ) { return "intro.04.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Product Model") && Guidewire_FMSourceFileMatch(SRCFILE,"intro.04.2.html") ) { return "intro.04.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"The Policy Lifecycle") && Guidewire_FMSourceFileMatch(SRCFILE,"intro.04.3.html") ) { return "intro.04.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"PolicyCenter Integration Points") && Guidewire_FMSourceFileMatch(SRCFILE,"intro.04.4.html") ) { return "intro.04.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Integration with Other Guidewire Applications") && Guidewire_FMSourceFileMatch(SRCFILE,"intro.04.5.html") ) { return "intro.04.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"PolicyCenter Users") && Guidewire_FMSourceFileMatch(SRCFILE,"intro.04.6.html") ) { return "intro.04.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"PolicyCenter User Interface") && Guidewire_FMSourceFileMatch(SRCFILE,"p-highlevelui.html") ) { return "p-highlevelui.html";}
else if (Guidewire_TopicMatch(TOPIC,"Navigating PolicyCenter") && Guidewire_FMSourceFileMatch(SRCFILE,"pc_organization.06.1.html") ) { return "pc_organization.06.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Logging into PolicyCenter") && Guidewire_FMSourceFileMatch(SRCFILE,"pc_organization.06.2.html") ) { return "pc_organization.06.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Setting Preferences") && Guidewire_FMSourceFileMatch(SRCFILE,"pc_organization.06.3.html") ) { return "pc_organization.06.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Selecting International Settings in PolicyCenter") && Guidewire_FMSourceFileMatch(SRCFILE,"pc_organization.06.4.html") ) { return "pc_organization.06.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Common Areas in the PolicyCenter User Interface") && Guidewire_FMSourceFileMatch(SRCFILE,"pc_organization.06.5.html") ) { return "pc_organization.06.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"PolicyCenter Tabs") && Guidewire_FMSourceFileMatch(SRCFILE,"pc_organization.06.6.html") ) { return "pc_organization.06.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changing the Screen Layout") && Guidewire_FMSourceFileMatch(SRCFILE,"screenlayout.07.1.html") ) { return "screenlayout.07.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adjusting List Views") && Guidewire_FMSourceFileMatch(SRCFILE,"screenlayout.07.2.html") ) { return "screenlayout.07.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changing the Sidebar Width") && Guidewire_FMSourceFileMatch(SRCFILE,"screenlayout.07.3.html") ) { return "screenlayout.07.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Managing Layout Preferences") && Guidewire_FMSourceFileMatch(SRCFILE,"screenlayout.07.4.html") ) { return "screenlayout.07.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"QuickJump") && Guidewire_FMSourceFileMatch(SRCFILE,"quickjump.08.1.html") ) { return "quickjump.08.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"QuickJump Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"quickjump.08.2.html") ) { return "quickjump.08.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Using QuickJump") && Guidewire_FMSourceFileMatch(SRCFILE,"quickjump.08.3.html") ) { return "quickjump.08.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring QuickJump") && Guidewire_FMSourceFileMatch(SRCFILE,"quickjump.08.4.html") ) { return "quickjump.08.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"QuickJump References") && Guidewire_FMSourceFileMatch(SRCFILE,"quickjump.08.5.html") ) { return "quickjump.08.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Basic Search") && Guidewire_FMSourceFileMatch(SRCFILE,"search_fulltext.09.1.html") ) { return "search_fulltext.09.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Basic Search Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"search_fulltext.09.2.html") ) { return "search_fulltext.09.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Basic Policy Search Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"search_fulltext.09.3.html") ) { return "search_fulltext.09.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Basic Search User Interface") && Guidewire_FMSourceFileMatch(SRCFILE,"search_fulltext.09.4.html") ) { return "search_fulltext.09.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Basic Search") && Guidewire_FMSourceFileMatch(SRCFILE,"search_fulltext.09.5.html") ) { return "search_fulltext.09.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Advanced Search") && Guidewire_FMSourceFileMatch(SRCFILE,"search_db.10.1.html") ) { return "search_db.10.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Advanced Search Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"search_db.10.2.html") ) { return "search_db.10.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with the Advanced Search Tab") && Guidewire_FMSourceFileMatch(SRCFILE,"search_db.10.3.html") ) { return "search_db.10.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Saving Your Work") && Guidewire_FMSourceFileMatch(SRCFILE,"autosave.html") ) { return "autosave.html";}
else if (Guidewire_TopicMatch(TOPIC,"PolicyCenter Policy Transactions") && Guidewire_FMSourceFileMatch(SRCFILE,"p-jobs.html") ) { return "p-jobs.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Transactions") && Guidewire_FMSourceFileMatch(SRCFILE,"jobs.13.1.html") ) { return "jobs.13.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Overview of Policy Transactions") && Guidewire_FMSourceFileMatch(SRCFILE,"jobs.13.2.html") ) { return "jobs.13.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Key Features of Policy Transactions") && Guidewire_FMSourceFileMatch(SRCFILE,"jobs.13.3.html") ) { return "jobs.13.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Policy Transactions") && Guidewire_FMSourceFileMatch(SRCFILE,"jobs.13.4.html") ) { return "jobs.13.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Submission Policy Transaction") && Guidewire_FMSourceFileMatch(SRCFILE,"submission.14.1.html") ) { return "submission.14.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Submission Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"submission.14.2.html") ) { return "submission.14.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Submission General Steps") && Guidewire_FMSourceFileMatch(SRCFILE,"submission.14.3.html") ) { return "submission.14.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Submission Key Features") && Guidewire_FMSourceFileMatch(SRCFILE,"submission.14.4.html") ) { return "submission.14.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"The Submission Manager") && Guidewire_FMSourceFileMatch(SRCFILE,"submission.14.5.html") ) { return "submission.14.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Submissions") && Guidewire_FMSourceFileMatch(SRCFILE,"submission.14.6.html") ) { return "submission.14.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"Creating a Submission") && Guidewire_FMSourceFileMatch(SRCFILE,"submission.14.7.html") ) { return "submission.14.7.html";}
else if (Guidewire_TopicMatch(TOPIC,"Copying a Submission") && Guidewire_FMSourceFileMatch(SRCFILE,"submission.14.8.html") ) { return "submission.14.8.html";}
else if (Guidewire_TopicMatch(TOPIC,"Issuance Policy Transaction") && Guidewire_FMSourceFileMatch(SRCFILE,"issuance.15.1.html") ) { return "issuance.15.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Issuance Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"issuance.15.2.html") ) { return "issuance.15.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Issuance General Steps") && Guidewire_FMSourceFileMatch(SRCFILE,"issuance.15.3.html") ) { return "issuance.15.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Issuances") && Guidewire_FMSourceFileMatch(SRCFILE,"issuance.15.4.html") ) { return "issuance.15.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Renewal Policy Transaction") && Guidewire_FMSourceFileMatch(SRCFILE,"renewals.16.1.html") ) { return "renewals.16.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Renewal Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"renewals.16.2.html") ) { return "renewals.16.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Renewal General Steps") && Guidewire_FMSourceFileMatch(SRCFILE,"renewals.16.3.html") ) { return "renewals.16.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Renewal Key Features") && Guidewire_FMSourceFileMatch(SRCFILE,"renewals.16.4.html") ) { return "renewals.16.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Pre-renewal Directions") && Guidewire_FMSourceFileMatch(SRCFILE,"renewals.16.5.html") ) { return "renewals.16.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Underwriting Issues and Referral Reasons") && Guidewire_FMSourceFileMatch(SRCFILE,"renewals.16.6.html") ) { return "renewals.16.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Renewals") && Guidewire_FMSourceFileMatch(SRCFILE,"renewals.16.7.html") ) { return "renewals.16.7.html";}
else if (Guidewire_TopicMatch(TOPIC,"Cancellation Policy Transaction") && Guidewire_FMSourceFileMatch(SRCFILE,"cancellation.17.1.html") ) { return "cancellation.17.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Cancellation Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"cancellation.17.2.html") ) { return "cancellation.17.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Cancellation General Steps") && Guidewire_FMSourceFileMatch(SRCFILE,"cancellation.17.3.html") ) { return "cancellation.17.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Cancellations") && Guidewire_FMSourceFileMatch(SRCFILE,"cancellation.17.4.html") ) { return "cancellation.17.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Change Transaction") && Guidewire_FMSourceFileMatch(SRCFILE,"policy_change.18.1.html") ) { return "policy_change.18.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Change Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"policy_change.18.2.html") ) { return "policy_change.18.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Change General Steps") && Guidewire_FMSourceFileMatch(SRCFILE,"policy_change.18.3.html") ) { return "policy_change.18.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Change Key Features") && Guidewire_FMSourceFileMatch(SRCFILE,"policy_change.18.4.html") ) { return "policy_change.18.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Policy Changes") && Guidewire_FMSourceFileMatch(SRCFILE,"policy_change.18.5.html") ) { return "policy_change.18.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Creating a Policy Change") && Guidewire_FMSourceFileMatch(SRCFILE,"policy_change.18.6.html") ) { return "policy_change.18.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"Editing the Policy Change Effective Date") && Guidewire_FMSourceFileMatch(SRCFILE,"policy_change.18.7.html") ) { return "policy_change.18.7.html";}
else if (Guidewire_TopicMatch(TOPIC,"Reinstatement Policy Transactions") && Guidewire_FMSourceFileMatch(SRCFILE,"reinstatement.19.1.html") ) { return "reinstatement.19.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Reinstatement Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"reinstatement.19.2.html") ) { return "reinstatement.19.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Reinstatement General Steps") && Guidewire_FMSourceFileMatch(SRCFILE,"reinstatement.19.3.html") ) { return "reinstatement.19.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Reinstatement Key Features") && Guidewire_FMSourceFileMatch(SRCFILE,"reinstatement.19.4.html") ) { return "reinstatement.19.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Reinstatements") && Guidewire_FMSourceFileMatch(SRCFILE,"reinstatement.19.5.html") ) { return "reinstatement.19.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Rewrite Policy Transactions") && Guidewire_FMSourceFileMatch(SRCFILE,"rewrite.20.1.html") ) { return "rewrite.20.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Rewrite Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"rewrite.20.2.html") ) { return "rewrite.20.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Rewrite General Steps") && Guidewire_FMSourceFileMatch(SRCFILE,"rewrite.20.3.html") ) { return "rewrite.20.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Rewrite Key Features") && Guidewire_FMSourceFileMatch(SRCFILE,"rewrite.20.4.html") ) { return "rewrite.20.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Rewrites") && Guidewire_FMSourceFileMatch(SRCFILE,"rewrite.20.5.html") ) { return "rewrite.20.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Rewrite New Account Policy Transaction") && Guidewire_FMSourceFileMatch(SRCFILE,"rewrite_new_account.21.1.html") ) { return "rewrite_new_account.21.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Rewrite New Account Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"rewrite_new_account.21.2.html") ) { return "rewrite_new_account.21.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Rewrite New Account") && Guidewire_FMSourceFileMatch(SRCFILE,"rewrite_new_account.21.3.html") ) { return "rewrite_new_account.21.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Premium Audit Policy Transaction") && Guidewire_FMSourceFileMatch(SRCFILE,"audit.22.1.html") ) { return "audit.22.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Final Audit Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"audit.22.2.html") ) { return "audit.22.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Premium Report Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"audit.22.3.html") ) { return "audit.22.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Audit Roles") && Guidewire_FMSourceFileMatch(SRCFILE,"audit.22.4.html") ) { return "audit.22.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Premium Audit and Other Policy Transactions") && Guidewire_FMSourceFileMatch(SRCFILE,"audit.22.5.html") ) { return "audit.22.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Premium Audit General Steps") && Guidewire_FMSourceFileMatch(SRCFILE,"audit.22.6.html") ) { return "audit.22.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Final Audits") && Guidewire_FMSourceFileMatch(SRCFILE,"audit.22.7.html") ) { return "audit.22.7.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working With Premium Reports") && Guidewire_FMSourceFileMatch(SRCFILE,"audit.22.8.html") ) { return "audit.22.8.html";}
else if (Guidewire_TopicMatch(TOPIC,"Side-by-side Quoting") && Guidewire_FMSourceFileMatch(SRCFILE,"job_sidebyside.23.01.html") ) { return "job_sidebyside.23.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"Side-by-side Quoting Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"job_sidebyside.23.02.html") ) { return "job_sidebyside.23.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Base Data Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"job_sidebyside.23.03.html") ) { return "job_sidebyside.23.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Side-by-side Quoting Process Flow") && Guidewire_FMSourceFileMatch(SRCFILE,"job_sidebyside.23.04.html") ) { return "job_sidebyside.23.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Side-by-side Quoting in the User Interface") && Guidewire_FMSourceFileMatch(SRCFILE,"job_sidebyside.23.05.html") ) { return "job_sidebyside.23.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Tools Menu Items for Side-by-side Quoting") && Guidewire_FMSourceFileMatch(SRCFILE,"job_sidebyside.23.06.html") ) { return "job_sidebyside.23.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Side-by-side Quoting Screen") && Guidewire_FMSourceFileMatch(SRCFILE,"job_sidebyside.23.07.html") ) { return "job_sidebyside.23.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Versions Screen") && Guidewire_FMSourceFileMatch(SRCFILE,"job_sidebyside.23.08.html") ) { return "job_sidebyside.23.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Side-by-side Quoting") && Guidewire_FMSourceFileMatch(SRCFILE,"job_sidebyside.23.09.html") ) { return "job_sidebyside.23.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Selecting Side-by-side Quoting in a Submission") && Guidewire_FMSourceFileMatch(SRCFILE,"job_sidebyside.23.10.html") ) { return "job_sidebyside.23.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Editing a Version in a Policy Transaction with Side-by-side Quoting") && Guidewire_FMSourceFileMatch(SRCFILE,"job_sidebyside.23.11.html") ) { return "job_sidebyside.23.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Binding and Issuing a Side-by-side Submission") && Guidewire_FMSourceFileMatch(SRCFILE,"job_sidebyside.23.12.html") ) { return "job_sidebyside.23.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"Multi-version Quoting") && Guidewire_FMSourceFileMatch(SRCFILE,"multiversion.24.1.html") ) { return "multiversion.24.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Multi-version Quoting and Side-by-side Quoting") && Guidewire_FMSourceFileMatch(SRCFILE,"multiversion.24.2.html") ) { return "multiversion.24.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Multi-version Quoting") && Guidewire_FMSourceFileMatch(SRCFILE,"multiversion.24.3.html") ) { return "multiversion.24.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Setting the Maximum Number of Multi-version Quotes") && Guidewire_FMSourceFileMatch(SRCFILE,"multiversion.24.4.html") ) { return "multiversion.24.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Lines of Business") && Guidewire_FMSourceFileMatch(SRCFILE,"p-lobs.html") ) { return "p-lobs.html";}
else if (Guidewire_TopicMatch(TOPIC,"Line of Business Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_overview.html") ) { return "lob_overview.html";}
else if (Guidewire_TopicMatch(TOPIC,"Commercial Auto") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_ba.27.01.html") ) { return "lob_ba.27.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"Commercial Auto Screens") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_ba.27.02.html") ) { return "lob_ba.27.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Offerings Screen for Commercial Auto") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_ba.27.03.html") ) { return "lob_ba.27.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Qualification Screen for Commercial Auto") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_ba.27.04.html") ) { return "lob_ba.27.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Info Screen for Commercial Auto") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_ba.27.05.html") ) { return "lob_ba.27.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Locations Screen for Commercial Auto") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_ba.27.06.html") ) { return "lob_ba.27.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Vehicles Screen for Commercial Auto") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_ba.27.07.html") ) { return "lob_ba.27.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Commercial Auto Line Screen for Commercial Auto") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_ba.27.08.html") ) { return "lob_ba.27.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Drivers Screen for Commercial Auto") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_ba.27.09.html") ) { return "lob_ba.27.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Modifiers Screen for Commercial Auto") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_ba.27.10.html") ) { return "lob_ba.27.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Risk Analysis Screen for Commercial Auto") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_ba.27.11.html") ) { return "lob_ba.27.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Review Screen for Commercial Auto") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_ba.27.12.html") ) { return "lob_ba.27.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"Forms Screen for Commercial Auto") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_ba.27.13.html") ) { return "lob_ba.27.13.html";}
else if (Guidewire_TopicMatch(TOPIC,"Payment Screen for Commercial Auto") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_ba.27.14.html") ) { return "lob_ba.27.14.html";}
else if (Guidewire_TopicMatch(TOPIC,"Commercial Auto Object Model") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_ba.27.15.html") ) { return "lob_ba.27.15.html";}
else if (Guidewire_TopicMatch(TOPIC,"Businessowners") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_bop.28.01.html") ) { return "lob_bop.28.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"Businessowners Screens") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_bop.28.02.html") ) { return "lob_bop.28.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Offerings Screen for Businessowners") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_bop.28.03.html") ) { return "lob_bop.28.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Qualification Screen for Businessowners") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_bop.28.04.html") ) { return "lob_bop.28.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Info Screen for Businessowners") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_bop.28.05.html") ) { return "lob_bop.28.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Businessowners Line Screen") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_bop.28.06.html") ) { return "lob_bop.28.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Locations Screen for Businessowners") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_bop.28.07.html") ) { return "lob_bop.28.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Buildings and Locations Screen for Businessowners") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_bop.28.08.html") ) { return "lob_bop.28.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Modifiers Screen for Businessowners") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_bop.28.09.html") ) { return "lob_bop.28.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Risk Analysis Screen for Businessowners") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_bop.28.10.html") ) { return "lob_bop.28.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Review Screen for Businessowners") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_bop.28.11.html") ) { return "lob_bop.28.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Quote Screen for Businessowners") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_bop.28.12.html") ) { return "lob_bop.28.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"Forms Screen for Businessowners") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_bop.28.13.html") ) { return "lob_bop.28.13.html";}
else if (Guidewire_TopicMatch(TOPIC,"Payment Screen for Businessowners") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_bop.28.14.html") ) { return "lob_bop.28.14.html";}
else if (Guidewire_TopicMatch(TOPIC,"Businessowners Object Model") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_bop.28.15.html") ) { return "lob_bop.28.15.html";}
else if (Guidewire_TopicMatch(TOPIC,"Commercial Package Policy") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_cpp.29.01.html") ) { return "lob_cpp.29.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"Commercial Package Screens") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_cpp.29.02.html") ) { return "lob_cpp.29.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Offerings Screen for Commercial Package") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_cpp.29.03.html") ) { return "lob_cpp.29.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Qualification Screen for Commercial Package") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_cpp.29.04.html") ) { return "lob_cpp.29.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Info Screen for Commercial Package") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_cpp.29.05.html") ) { return "lob_cpp.29.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Line Selection Screen for Commercial Package") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_cpp.29.06.html") ) { return "lob_cpp.29.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Locations Screen for Commercial Package") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_cpp.29.07.html") ) { return "lob_cpp.29.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Line of Business Screens for Commercial Package") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_cpp.29.08.html") ) { return "lob_cpp.29.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Modifiers Screen for Commercial Package") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_cpp.29.09.html") ) { return "lob_cpp.29.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Risk Analysis Screen for Commercial Package") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_cpp.29.10.html") ) { return "lob_cpp.29.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Quote Screen for Commercial Package") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_cpp.29.11.html") ) { return "lob_cpp.29.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Forms Screen for Commercial Package") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_cpp.29.12.html") ) { return "lob_cpp.29.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"Payment Screen for Commercial Package") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_cpp.29.13.html") ) { return "lob_cpp.29.13.html";}
else if (Guidewire_TopicMatch(TOPIC,"Commercial Package Object Model") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_cpp.29.14.html") ) { return "lob_cpp.29.14.html";}
else if (Guidewire_TopicMatch(TOPIC,"Commercial Package Product Model") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_cpp.29.15.html") ) { return "lob_cpp.29.15.html";}
else if (Guidewire_TopicMatch(TOPIC,"Commercial Property") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_cp.30.01.html") ) { return "lob_cp.30.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Commercial Property") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_cp.30.02.html") ) { return "lob_cp.30.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Commercial Property Screens") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_cp.30.03.html") ) { return "lob_cp.30.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Info Screen for Commercial Property") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_cp.30.04.html") ) { return "lob_cp.30.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Buildings and Locations Screen for Commercial Property") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_cp.30.05.html") ) { return "lob_cp.30.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Blankets Screen for Commercial Property") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_cp.30.06.html") ) { return "lob_cp.30.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Modifiers Screen for Commercial Property") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_cp.30.07.html") ) { return "lob_cp.30.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Risk Analysis Screen for Commercial Property") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_cp.30.08.html") ) { return "lob_cp.30.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Review Screen for Commercial Property") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_cp.30.09.html") ) { return "lob_cp.30.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Quote Screen for Commercial Property") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_cp.30.10.html") ) { return "lob_cp.30.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Forms Screen for Commercial Property") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_cp.30.11.html") ) { return "lob_cp.30.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Payment Screen for Commercial Property") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_cp.30.12.html") ) { return "lob_cp.30.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"Commercial Property Object Model") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_cp.30.13.html") ) { return "lob_cp.30.13.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Commercial Property") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_cp.30.14.html") ) { return "lob_cp.30.14.html";}
else if (Guidewire_TopicMatch(TOPIC,"General Liability") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_gl.31.01.html") ) { return "lob_gl.31.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"General Liability Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_gl.31.02.html") ) { return "lob_gl.31.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"General Liability Screens") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_gl.31.03.html") ) { return "lob_gl.31.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Qualification Screen for General Liability") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_gl.31.04.html") ) { return "lob_gl.31.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Info Screen for General Liability") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_gl.31.05.html") ) { return "lob_gl.31.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Locations Screen for General Liability") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_gl.31.06.html") ) { return "lob_gl.31.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Coverages Screen for General Liability") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_gl.31.07.html") ) { return "lob_gl.31.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Exposures Screen for General Liability") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_gl.31.08.html") ) { return "lob_gl.31.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Modifiers Screen for General Liability") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_gl.31.09.html") ) { return "lob_gl.31.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Risk Analysis Screen for General Liability") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_gl.31.10.html") ) { return "lob_gl.31.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Review Screen for General Liability") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_gl.31.11.html") ) { return "lob_gl.31.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Quote Screen for General Liability") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_gl.31.12.html") ) { return "lob_gl.31.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"Forms Screen for General Liability") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_gl.31.13.html") ) { return "lob_gl.31.13.html";}
else if (Guidewire_TopicMatch(TOPIC,"Payment Screen for General Liability") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_gl.31.14.html") ) { return "lob_gl.31.14.html";}
else if (Guidewire_TopicMatch(TOPIC,"General Liability Object Model") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_gl.31.15.html") ) { return "lob_gl.31.15.html";}
else if (Guidewire_TopicMatch(TOPIC,"Inland Marine") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_im.32.01.html") ) { return "lob_im.32.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"Inland Marine Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_im.32.02.html") ) { return "lob_im.32.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Inland Marine Screens") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_im.32.03.html") ) { return "lob_im.32.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Info Screen for Inland Marine") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_im.32.04.html") ) { return "lob_im.32.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Coverage Part Selection Screen for Inland Marine") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_im.32.05.html") ) { return "lob_im.32.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Buildings and Locations Screen for Inland Marine") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_im.32.06.html") ) { return "lob_im.32.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Accounts Receivable Screen for Inland Marine") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_im.32.07.html") ) { return "lob_im.32.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Contractors Equipment Screen for Inland Marine") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_im.32.08.html") ) { return "lob_im.32.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Signs Screen for Inland Marine") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_im.32.09.html") ) { return "lob_im.32.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Risk Analysis Screen for Inland Marine") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_im.32.10.html") ) { return "lob_im.32.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Review Screen for Inland Marine") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_im.32.11.html") ) { return "lob_im.32.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Quote Screen for Inland Marine") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_im.32.12.html") ) { return "lob_im.32.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"Forms Screen for Inland Marine") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_im.32.13.html") ) { return "lob_im.32.13.html";}
else if (Guidewire_TopicMatch(TOPIC,"Payment Screen for Inland Marine") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_im.32.14.html") ) { return "lob_im.32.14.html";}
else if (Guidewire_TopicMatch(TOPIC,"Inland Marine Object Model") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_im.32.15.html") ) { return "lob_im.32.15.html";}
else if (Guidewire_TopicMatch(TOPIC,"Inland Marine Product Model") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_im.32.16.html") ) { return "lob_im.32.16.html";}
else if (Guidewire_TopicMatch(TOPIC,"Personal Auto") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_pa.33.01.html") ) { return "lob_pa.33.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"Personal Auto Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_pa.33.02.html") ) { return "lob_pa.33.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Personal Auto") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_pa.33.03.html") ) { return "lob_pa.33.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Personal Auto Screens") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_pa.33.04.html") ) { return "lob_pa.33.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Info Screen for Personal Auto") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_pa.33.05.html") ) { return "lob_pa.33.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Drivers Screen for Personal Auto") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_pa.33.06.html") ) { return "lob_pa.33.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Vehicles Screen for Personal Auto") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_pa.33.07.html") ) { return "lob_pa.33.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"PA Coverages Screen for Personal Auto") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_pa.33.08.html") ) { return "lob_pa.33.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Risk Analysis Screen for Personal Auto") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_pa.33.09.html") ) { return "lob_pa.33.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Review Screen for Personal Auto") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_pa.33.10.html") ) { return "lob_pa.33.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Quote Screen for Personal Auto") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_pa.33.11.html") ) { return "lob_pa.33.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Forms Screen for Personal Auto") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_pa.33.12.html") ) { return "lob_pa.33.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"Payment Screen for Personal Auto") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_pa.33.13.html") ) { return "lob_pa.33.13.html";}
else if (Guidewire_TopicMatch(TOPIC,"Personal Auto Object Model") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_pa.33.14.html") ) { return "lob_pa.33.14.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Personal Auto") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_pa.33.15.html") ) { return "lob_pa.33.15.html";}
else if (Guidewire_TopicMatch(TOPIC,"Workers\u2019 Compensation") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_wc.34.01.html") ) { return "lob_wc.34.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"Key Features of Workers\u2019 Compensation") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_wc.34.02.html") ) { return "lob_wc.34.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Workers\u2019 Compensation Screens") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_wc.34.03.html") ) { return "lob_wc.34.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Qualification Screen for Workers\u2019 Compensation") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_wc.34.04.html") ) { return "lob_wc.34.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Info Screen for Workers\u2019 Compensation") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_wc.34.05.html") ) { return "lob_wc.34.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Locations Screen for Workers\u2019 Compensation") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_wc.34.06.html") ) { return "lob_wc.34.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"WC Coverages Screen for Workers\u2019 Compensation") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_wc.34.07.html") ) { return "lob_wc.34.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Supplemental Screen for Workers\u2019 Compensation") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_wc.34.08.html") ) { return "lob_wc.34.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"WC Options Screen for Worker\u2019s Compensation") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_wc.34.09.html") ) { return "lob_wc.34.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Risk Analysis Screen for Workers\u2019 Compensation") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_wc.34.10.html") ) { return "lob_wc.34.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Review Screen for Workers\u2019 Compensation") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_wc.34.11.html") ) { return "lob_wc.34.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Quote Screen for Workers\u2019 Compensation") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_wc.34.12.html") ) { return "lob_wc.34.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"Forms Screen for Workers\u2019 Compensation") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_wc.34.13.html") ) { return "lob_wc.34.13.html";}
else if (Guidewire_TopicMatch(TOPIC,"Payment Screen for Workers\u2019 Compensation") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_wc.34.14.html") ) { return "lob_wc.34.14.html";}
else if (Guidewire_TopicMatch(TOPIC,"Workers\u2019 Compensation Object Models") && Guidewire_FMSourceFileMatch(SRCFILE,"lob_wc.34.15.html") ) { return "lob_wc.34.15.html";}
else if (Guidewire_TopicMatch(TOPIC,"Additional Features of PolicyCenter") && Guidewire_FMSourceFileMatch(SRCFILE,"p-components.html") ) { return "p-components.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy File") && Guidewire_FMSourceFileMatch(SRCFILE,"pc_job_file.36.1.html") ) { return "pc_job_file.36.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy File Screens, Menus, and Actions") && Guidewire_FMSourceFileMatch(SRCFILE,"pc_job_file.36.2.html") ) { return "pc_job_file.36.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Policies") && Guidewire_FMSourceFileMatch(SRCFILE,"pc_job_file.36.3.html") ) { return "pc_job_file.36.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Policies") && Guidewire_FMSourceFileMatch(SRCFILE,"pc_job_file.36.4.html") ) { return "pc_job_file.36.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Copy Data for a Line of Business") && Guidewire_FMSourceFileMatch(SRCFILE,"pc_job_file.36.5.html") ) { return "pc_job_file.36.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Split and Spin-off Policies") && Guidewire_FMSourceFileMatch(SRCFILE,"pc_job_file.36.6.html") ) { return "pc_job_file.36.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"Archiving in PolicyCenter") && Guidewire_FMSourceFileMatch(SRCFILE,"archiving-pc.37.1.html") ) { return "archiving-pc.37.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Archiving Policy Terms") && Guidewire_FMSourceFileMatch(SRCFILE,"archiving-pc.37.2.html") ) { return "archiving-pc.37.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Searching for Archived Policy Periods") && Guidewire_FMSourceFileMatch(SRCFILE,"archiving-pc.37.3.html") ) { return "archiving-pc.37.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Retrieving Archived Policies") && Guidewire_FMSourceFileMatch(SRCFILE,"archiving-pc.37.4.html") ) { return "archiving-pc.37.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Policy Archiving") && Guidewire_FMSourceFileMatch(SRCFILE,"archiving-pc.37.5.html") ) { return "archiving-pc.37.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"More Information on Archiving") && Guidewire_FMSourceFileMatch(SRCFILE,"archiving-pc.37.6.html") ) { return "archiving-pc.37.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"Account File") && Guidewire_FMSourceFileMatch(SRCFILE,"account_management.38.01.html") ) { return "account_management.38.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"Account Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"account_management.38.02.html") ) { return "account_management.38.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Account Screens") && Guidewire_FMSourceFileMatch(SRCFILE,"account_management.38.03.html") ) { return "account_management.38.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Account File Summary Screen") && Guidewire_FMSourceFileMatch(SRCFILE,"account_management.38.04.html") ) { return "account_management.38.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Account File Contacts Screen") && Guidewire_FMSourceFileMatch(SRCFILE,"account_management.38.05.html") ) { return "account_management.38.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Account File Locations Screen") && Guidewire_FMSourceFileMatch(SRCFILE,"account_management.38.06.html") ) { return "account_management.38.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Submission Manager Screen for Accounts") && Guidewire_FMSourceFileMatch(SRCFILE,"account_management.38.07.html") ) { return "account_management.38.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Account File Documents Screen") && Guidewire_FMSourceFileMatch(SRCFILE,"account_management.38.08.html") ) { return "account_management.38.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Billing Screen for Accounts") && Guidewire_FMSourceFileMatch(SRCFILE,"account_management.38.09.html") ) { return "account_management.38.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Account File History Screen") && Guidewire_FMSourceFileMatch(SRCFILE,"account_management.38.10.html") ) { return "account_management.38.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Account Actions") && Guidewire_FMSourceFileMatch(SRCFILE,"account_management.38.11.html") ) { return "account_management.38.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Accounts") && Guidewire_FMSourceFileMatch(SRCFILE,"account_management.38.12.html") ) { return "account_management.38.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"Searching for an Account") && Guidewire_FMSourceFileMatch(SRCFILE,"account_management.38.13.html") ) { return "account_management.38.13.html";}
else if (Guidewire_TopicMatch(TOPIC,"Creating an Account") && Guidewire_FMSourceFileMatch(SRCFILE,"account_management.38.14.html") ) { return "account_management.38.14.html";}
else if (Guidewire_TopicMatch(TOPIC,"Tracking Your Accounts") && Guidewire_FMSourceFileMatch(SRCFILE,"account_management.38.15.html") ) { return "account_management.38.15.html";}
else if (Guidewire_TopicMatch(TOPIC,"Moving a Policy From One Account to Another") && Guidewire_FMSourceFileMatch(SRCFILE,"account_management.38.16.html") ) { return "account_management.38.16.html";}
else if (Guidewire_TopicMatch(TOPIC,"Rewriting Policies From One Account to Another") && Guidewire_FMSourceFileMatch(SRCFILE,"account_management.38.17.html") ) { return "account_management.38.17.html";}
else if (Guidewire_TopicMatch(TOPIC,"Merging Accounts") && Guidewire_FMSourceFileMatch(SRCFILE,"account_management.38.18.html") ) { return "account_management.38.18.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding an Account Relationship") && Guidewire_FMSourceFileMatch(SRCFILE,"account_management.38.19.html") ) { return "account_management.38.19.html";}
else if (Guidewire_TopicMatch(TOPIC,"Modifying an Account Relationship") && Guidewire_FMSourceFileMatch(SRCFILE,"account_management.38.20.html") ) { return "account_management.38.20.html";}
else if (Guidewire_TopicMatch(TOPIC,"Removing an Account Relationship") && Guidewire_FMSourceFileMatch(SRCFILE,"account_management.38.21.html") ) { return "account_management.38.21.html";}
else if (Guidewire_TopicMatch(TOPIC,"Searching for Accounts with a Shared Contact") && Guidewire_FMSourceFileMatch(SRCFILE,"account_management.38.22.html") ) { return "account_management.38.22.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Accounts") && Guidewire_FMSourceFileMatch(SRCFILE,"account_management.38.23.html") ) { return "account_management.38.23.html";}
else if (Guidewire_TopicMatch(TOPIC,"Account Rule Sets") && Guidewire_FMSourceFileMatch(SRCFILE,"account_management.38.24.html") ) { return "account_management.38.24.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Moving Policies Between Accounts") && Guidewire_FMSourceFileMatch(SRCFILE,"account_management.38.25.html") ) { return "account_management.38.25.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Account Relationships") && Guidewire_FMSourceFileMatch(SRCFILE,"account_management.38.26.html") ) { return "account_management.38.26.html";}
else if (Guidewire_TopicMatch(TOPIC,"Account Relationship Rule Sets") && Guidewire_FMSourceFileMatch(SRCFILE,"account_management.38.27.html") ) { return "account_management.38.27.html";}
else if (Guidewire_TopicMatch(TOPIC,"Locations") && Guidewire_FMSourceFileMatch(SRCFILE,"locations.39.1.html") ) { return "locations.39.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Location Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"locations.39.2.html") ) { return "locations.39.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Location Object Model") && Guidewire_FMSourceFileMatch(SRCFILE,"locations.39.3.html") ) { return "locations.39.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Account Synchronization Classes for Locations") && Guidewire_FMSourceFileMatch(SRCFILE,"locations.39.4.html") ) { return "locations.39.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Account Locations") && Guidewire_FMSourceFileMatch(SRCFILE,"locations.39.5.html") ) { return "locations.39.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Policy Locations") && Guidewire_FMSourceFileMatch(SRCFILE,"locations.39.6.html") ) { return "locations.39.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Locations") && Guidewire_FMSourceFileMatch(SRCFILE,"locations.39.7.html") ) { return "locations.39.7.html";}
else if (Guidewire_TopicMatch(TOPIC,"Generic Schedules") && Guidewire_FMSourceFileMatch(SRCFILE,"schedules.40.1.html") ) { return "schedules.40.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Generic Schedule Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"schedules.40.2.html") ) { return "schedules.40.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Types of Schedules") && Guidewire_FMSourceFileMatch(SRCFILE,"schedules.40.3.html") ) { return "schedules.40.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Activities") && Guidewire_FMSourceFileMatch(SRCFILE,"activities.41.1.html") ) { return "activities.41.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Activities Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"activities.41.2.html") ) { return "activities.41.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Activities") && Guidewire_FMSourceFileMatch(SRCFILE,"activities.41.3.html") ) { return "activities.41.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Activity Patterns") && Guidewire_FMSourceFileMatch(SRCFILE,"activities.41.4.html") ) { return "activities.41.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Activity Object Model") && Guidewire_FMSourceFileMatch(SRCFILE,"activities.41.5.html") ) { return "activities.41.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Activity Batch Process") && Guidewire_FMSourceFileMatch(SRCFILE,"activities.41.6.html") ) { return "activities.41.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"PolicyCenter Contacts") && Guidewire_FMSourceFileMatch(SRCFILE,"contacts.42.1.html") ) { return "contacts.42.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Contact Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"contacts.42.2.html") ) { return "contacts.42.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with the Contact Tab") && Guidewire_FMSourceFileMatch(SRCFILE,"contacts.42.3.html") ) { return "contacts.42.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Contacts in Policies and Accounts") && Guidewire_FMSourceFileMatch(SRCFILE,"contacts.42.4.html") ) { return "contacts.42.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Contact Object Model") && Guidewire_FMSourceFileMatch(SRCFILE,"contacts.42.5.html") ) { return "contacts.42.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Account Synchronization Classes for Contacts") && Guidewire_FMSourceFileMatch(SRCFILE,"contacts.42.6.html") ) { return "contacts.42.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Contacts") && Guidewire_FMSourceFileMatch(SRCFILE,"contacts.42.7.html") ) { return "contacts.42.7.html";}
else if (Guidewire_TopicMatch(TOPIC,"Underwriting Authority") && Guidewire_FMSourceFileMatch(SRCFILE,"uw_issues.43.1.html") ) { return "uw_issues.43.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Underwriting Authority Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"uw_issues.43.2.html") ) { return "uw_issues.43.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Underwriting Issues") && Guidewire_FMSourceFileMatch(SRCFILE,"uw_issues.43.3.html") ) { return "uw_issues.43.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Underwriting Referral Reasons") && Guidewire_FMSourceFileMatch(SRCFILE,"uw_issues.43.4.html") ) { return "uw_issues.43.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Quoting and Rating") && Guidewire_FMSourceFileMatch(SRCFILE,"rating.44.01.html") ) { return "rating.44.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Quotes") && Guidewire_FMSourceFileMatch(SRCFILE,"rating.44.02.html") ) { return "rating.44.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Entities Associated with Costs and Transactions") && Guidewire_FMSourceFileMatch(SRCFILE,"rating.44.03.html") ) { return "rating.44.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Cost Delegate") && Guidewire_FMSourceFileMatch(SRCFILE,"rating.44.04.html") ) { return "rating.44.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Transaction Delegate") && Guidewire_FMSourceFileMatch(SRCFILE,"rating.44.05.html") ) { return "rating.44.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Period Fields for Costs and Transactions") && Guidewire_FMSourceFileMatch(SRCFILE,"rating.44.06.html") ) { return "rating.44.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Cost and Transaction Model for Businessowners Line") && Guidewire_FMSourceFileMatch(SRCFILE,"rating.44.07.html") ) { return "rating.44.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Cost and Transaction Model for Commercial Auto Line") && Guidewire_FMSourceFileMatch(SRCFILE,"rating.44.08.html") ) { return "rating.44.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Cost and Transaction Model for Commercial Property Line") && Guidewire_FMSourceFileMatch(SRCFILE,"rating.44.09.html") ) { return "rating.44.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Cost and Transaction Model for General Liability Line") && Guidewire_FMSourceFileMatch(SRCFILE,"rating.44.10.html") ) { return "rating.44.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Cost and Transaction Model for Inland Marine Line") && Guidewire_FMSourceFileMatch(SRCFILE,"rating.44.11.html") ) { return "rating.44.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Cost and Transaction Model for Personal Auto Line") && Guidewire_FMSourceFileMatch(SRCFILE,"rating.44.12.html") ) { return "rating.44.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"Cost and Transaction Model for Workers\u2019 Compensation Line") && Guidewire_FMSourceFileMatch(SRCFILE,"rating.44.13.html") ) { return "rating.44.13.html";}
else if (Guidewire_TopicMatch(TOPIC,"Calculating Transactions") && Guidewire_FMSourceFileMatch(SRCFILE,"rating.44.14.html") ) { return "rating.44.14.html";}
else if (Guidewire_TopicMatch(TOPIC,"Internal Tools for Rating: Financial Transactions Screen") && Guidewire_FMSourceFileMatch(SRCFILE,"rating.44.15.html") ) { return "rating.44.15.html";}
else if (Guidewire_TopicMatch(TOPIC,"Quote Purging") && Guidewire_FMSourceFileMatch(SRCFILE,"quotepurging.45.1.html") ) { return "quotepurging.45.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Quote Purging Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"quotepurging.45.2.html") ) { return "quotepurging.45.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Quote Cloning for Business Intelligence") && Guidewire_FMSourceFileMatch(SRCFILE,"QuoteCloning.46.1.html") ) { return "QuoteCloning.46.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Quote Cloning Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"QuoteCloning.46.2.html") ) { return "QuoteCloning.46.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Quote Cloning Business Example") && Guidewire_FMSourceFileMatch(SRCFILE,"QuoteCloning.46.3.html") ) { return "QuoteCloning.46.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Rating Overrides") && Guidewire_FMSourceFileMatch(SRCFILE,"rating_manualoverrides.47.1.html") ) { return "rating_manualoverrides.47.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Rating Overrides Permissions") && Guidewire_FMSourceFileMatch(SRCFILE,"rating_manualoverrides.47.2.html") ) { return "rating_manualoverrides.47.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Underwriting Issues for Rating Overrides") && Guidewire_FMSourceFileMatch(SRCFILE,"rating_manualoverrides.47.3.html") ) { return "rating_manualoverrides.47.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Processing Overrides Across Policy Transactions") && Guidewire_FMSourceFileMatch(SRCFILE,"rating_manualoverrides.47.4.html") ) { return "rating_manualoverrides.47.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Rating Overrides in the User Interface") && Guidewire_FMSourceFileMatch(SRCFILE,"rating_manualoverrides.47.5.html") ) { return "rating_manualoverrides.47.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Rating Overrides") && Guidewire_FMSourceFileMatch(SRCFILE,"rating_manualoverrides.47.6.html") ) { return "rating_manualoverrides.47.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding Rating Overrides to a Line of Business") && Guidewire_FMSourceFileMatch(SRCFILE,"rating_manualoverrides.47.7.html") ) { return "rating_manualoverrides.47.7.html";}
else if (Guidewire_TopicMatch(TOPIC,"Document Management") && Guidewire_FMSourceFileMatch(SRCFILE,"documents.48.1.html") ) { return "documents.48.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Document Security") && Guidewire_FMSourceFileMatch(SRCFILE,"documents.48.2.html") ) { return "documents.48.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Documents") && Guidewire_FMSourceFileMatch(SRCFILE,"documents.48.3.html") ) { return "documents.48.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Document Management") && Guidewire_FMSourceFileMatch(SRCFILE,"documents.48.4.html") ) { return "documents.48.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Document Management Integration") && Guidewire_FMSourceFileMatch(SRCFILE,"documents.48.5.html") ) { return "documents.48.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Forms") && Guidewire_FMSourceFileMatch(SRCFILE,"forms_handling.49.1.html") ) { return "forms_handling.49.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Forms Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"forms_handling.49.2.html") ) { return "forms_handling.49.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Data Spreadsheet ImportExport") && Guidewire_FMSourceFileMatch(SRCFILE,"spreadsheet.50.1.html") ) { return "spreadsheet.50.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Large Policy Workflow Using Policy Data Spreadsheet ImportExport") && Guidewire_FMSourceFileMatch(SRCFILE,"spreadsheet.50.2.html") ) { return "spreadsheet.50.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Data Spreadsheet ImportExport in Commercial Property") && Guidewire_FMSourceFileMatch(SRCFILE,"spreadsheet.50.3.html") ) { return "spreadsheet.50.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Using Spreadsheets Generated by Policy Data Spreadsheet ImportExport") && Guidewire_FMSourceFileMatch(SRCFILE,"spreadsheet.50.4.html") ) { return "spreadsheet.50.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Product Model Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"product_model.51.01.html") ) { return "product_model.51.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"Product Model Representation") && Guidewire_FMSourceFileMatch(SRCFILE,"product_model.51.02.html") ) { return "product_model.51.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Products Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"product_model.51.03.html") ) { return "product_model.51.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"PolicyLine Pattern Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"product_model.51.04.html") ) { return "product_model.51.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Coverage Pattern Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"product_model.51.05.html") ) { return "product_model.51.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Understanding Categories") && Guidewire_FMSourceFileMatch(SRCFILE,"product_model.51.06.html") ) { return "product_model.51.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Coverages, Exclusions, Conditions, and Coverables Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"product_model.51.07.html") ) { return "product_model.51.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Existence") && Guidewire_FMSourceFileMatch(SRCFILE,"product_model.51.08.html") ) { return "product_model.51.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Coverage Term Pattern Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"product_model.51.09.html") ) { return "product_model.51.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Availability Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"product_model.51.10.html") ) { return "product_model.51.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Understanding Offerings") && Guidewire_FMSourceFileMatch(SRCFILE,"product_model.51.11.html") ) { return "product_model.51.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Revisioning") && Guidewire_FMSourceFileMatch(SRCFILE,"policyrevisions.52.01.html") ) { return "policyrevisions.52.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"What Is a Policy Revision") && Guidewire_FMSourceFileMatch(SRCFILE,"policyrevisions.52.02.html") ) { return "policyrevisions.52.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Structure of Revisioning Across Effective Time") && Guidewire_FMSourceFileMatch(SRCFILE,"policyrevisions.52.03.html") ) { return "policyrevisions.52.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Out-of-sequence Jobs") && Guidewire_FMSourceFileMatch(SRCFILE,"policyrevisions.52.04.html") ) { return "policyrevisions.52.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Preempted Jobs") && Guidewire_FMSourceFileMatch(SRCFILE,"policyrevisions.52.05.html") ) { return "policyrevisions.52.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Applying Changes to Future Renewals") && Guidewire_FMSourceFileMatch(SRCFILE,"policyrevisions.52.06.html") ) { return "policyrevisions.52.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Revisioning Rewrite Jobs") && Guidewire_FMSourceFileMatch(SRCFILE,"policyrevisions.52.07.html") ) { return "policyrevisions.52.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Summary of Revisioning Terminology") && Guidewire_FMSourceFileMatch(SRCFILE,"policyrevisions.52.08.html") ) { return "policyrevisions.52.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Revisioning Properties Reference") && Guidewire_FMSourceFileMatch(SRCFILE,"policyrevisions.52.09.html") ) { return "policyrevisions.52.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Details of Merging and Applying Changes") && Guidewire_FMSourceFileMatch(SRCFILE,"policyrevisions.52.10.html") ) { return "policyrevisions.52.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Differences Between Revisions") && Guidewire_FMSourceFileMatch(SRCFILE,"policyrevisions.52.11.html") ) { return "policyrevisions.52.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Multicurrency Features") && Guidewire_FMSourceFileMatch(SRCFILE,"multicurrency_pc.53.1.html") ) { return "multicurrency_pc.53.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Multicurrency Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"multicurrency_pc.53.2.html") ) { return "multicurrency_pc.53.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Multicurrency Object Model") && Guidewire_FMSourceFileMatch(SRCFILE,"multicurrency_pc.53.3.html") ) { return "multicurrency_pc.53.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Multicurrency User Interface") && Guidewire_FMSourceFileMatch(SRCFILE,"multicurrency_pc.53.4.html") ) { return "multicurrency_pc.53.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Rating Management") && Guidewire_FMSourceFileMatch(SRCFILE,"p-rate_table.html") ) { return "p-rate_table.html";}
else if (Guidewire_TopicMatch(TOPIC,"Rating Management Concepts") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table.55.01.html") ) { return "rate_table.55.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"Rating Management Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table.55.02.html") ) { return "rate_table.55.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Rate Tables") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table.55.03.html") ) { return "rate_table.55.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Matching a Factor in the Rate Table") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table.55.04.html") ) { return "rate_table.55.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Rate Routines") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table.55.05.html") ) { return "rate_table.55.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Parameter Sets") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table.55.06.html") ) { return "rate_table.55.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Rate Books") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table.55.07.html") ) { return "rate_table.55.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Selecting the Rate Book Edition During Policy Rating") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table.55.08.html") ) { return "rate_table.55.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Rate Book Lifecycle and Moving to Production") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table.55.09.html") ) { return "rate_table.55.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Rating Worksheets") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table.55.10.html") ) { return "rate_table.55.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Impact Testing") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table.55.11.html") ) { return "rate_table.55.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Reducing Rating Management Components") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table.55.12.html") ) { return "rate_table.55.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"Rating Management User Interface") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.01.html") ) { return "rate_table_ui.56.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"Preparing to Use Rating Management") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.02.html") ) { return "rate_table_ui.56.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Rate Books") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.03.html") ) { return "rate_table_ui.56.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Searching for a Rate Book") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.04.html") ) { return "rate_table_ui.56.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding a New Rate Book") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.05.html") ) { return "rate_table_ui.56.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Deleting a Rate Book") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.06.html") ) { return "rate_table_ui.56.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Rate Book Screen") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.07.html") ) { return "rate_table_ui.56.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Rate Book Status and Available Actions") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.08.html") ) { return "rate_table_ui.56.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Rate Book Actions and Permissions") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.09.html") ) { return "rate_table_ui.56.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Merging Rate Books") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.10.html") ) { return "rate_table_ui.56.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Exporting Rate Books to Spreadsheet") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.11.html") ) { return "rate_table_ui.56.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Importing and Exporting Rate Books to XML") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.12.html") ) { return "rate_table_ui.56.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Rate Table Definitions") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.13.html") ) { return "rate_table_ui.56.13.html";}
else if (Guidewire_TopicMatch(TOPIC,"Rate Table Definition Screen") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.14.html") ) { return "rate_table_ui.56.14.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with the Rate Table Editor") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.15.html") ) { return "rate_table_ui.56.15.html";}
else if (Guidewire_TopicMatch(TOPIC,"Selecting a Rate Table") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.16.html") ) { return "rate_table_ui.56.16.html";}
else if (Guidewire_TopicMatch(TOPIC,"Rate Table Screen") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.17.html") ) { return "rate_table_ui.56.17.html";}
else if (Guidewire_TopicMatch(TOPIC,"Editing Rate Table Content in PolicyCenter") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.18.html") ) { return "rate_table_ui.56.18.html";}
else if (Guidewire_TopicMatch(TOPIC,"Editing Rate Table Content in Excel") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.19.html") ) { return "rate_table_ui.56.19.html";}
else if (Guidewire_TopicMatch(TOPIC,"Rate Table Update Validations") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.20.html") ) { return "rate_table_ui.56.20.html";}
else if (Guidewire_TopicMatch(TOPIC,"Excel Rate Table Import Validations") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.21.html") ) { return "rate_table_ui.56.21.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Rate Routines") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.22.html") ) { return "rate_table_ui.56.22.html";}
else if (Guidewire_TopicMatch(TOPIC,"Accessing Rate Routines") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.23.html") ) { return "rate_table_ui.56.23.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding a New Rate Routine") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.24.html") ) { return "rate_table_ui.56.24.html";}
else if (Guidewire_TopicMatch(TOPIC,"Deleting a Rate Routine") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.25.html") ) { return "rate_table_ui.56.25.html";}
else if (Guidewire_TopicMatch(TOPIC,"Actions on Rate Routines") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.26.html") ) { return "rate_table_ui.56.26.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding Steps to a Rate Routine") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.27.html") ) { return "rate_table_ui.56.27.html";}
else if (Guidewire_TopicMatch(TOPIC,"Instruction and Operand Types") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.28.html") ) { return "rate_table_ui.56.28.html";}
else if (Guidewire_TopicMatch(TOPIC,"Specifying a Function as the Operand in a Rate Routine Step") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.29.html") ) { return "rate_table_ui.56.29.html";}
else if (Guidewire_TopicMatch(TOPIC,"Creating a Rate Routine for Another Jurisdiction") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.30.html") ) { return "rate_table_ui.56.30.html";}
else if (Guidewire_TopicMatch(TOPIC,"Specifying a Flat-rated Coverage in a Rate Routine") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.31.html") ) { return "rate_table_ui.56.31.html";}
else if (Guidewire_TopicMatch(TOPIC,"Editing Long Rate Routines") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.32.html") ) { return "rate_table_ui.56.32.html";}
else if (Guidewire_TopicMatch(TOPIC,"Viewing Rating Worksheets") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.33.html") ) { return "rate_table_ui.56.33.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Parameter Sets") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.34.html") ) { return "rate_table_ui.56.34.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Impact Testing") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.35.html") ) { return "rate_table_ui.56.35.html";}
else if (Guidewire_TopicMatch(TOPIC,"Examples of Working with Rating Management") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.36.html") ) { return "rate_table_ui.56.36.html";}
else if (Guidewire_TopicMatch(TOPIC,"Creating and Using a Rate Table with a Multiple Factors") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.37.html") ) { return "rate_table_ui.56.37.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding Parameters to an In-use Rate Table Definition") && Guidewire_FMSourceFileMatch(SRCFILE,"rate_table_ui.56.38.html") ) { return "rate_table_ui.56.38.html";}
else if (Guidewire_TopicMatch(TOPIC,"Reinsurance Management") && Guidewire_FMSourceFileMatch(SRCFILE,"p-reinsurance.html") ) { return "p-reinsurance.html";}
else if (Guidewire_TopicMatch(TOPIC,"Reinsurance Management Concepts") && Guidewire_FMSourceFileMatch(SRCFILE,"reinsurance.58.1.html") ) { return "reinsurance.58.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Reinsurance Program Basics") && Guidewire_FMSourceFileMatch(SRCFILE,"reinsurance.58.2.html") ) { return "reinsurance.58.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"How PolicyCenter Links Reinsurance to Policies") && Guidewire_FMSourceFileMatch(SRCFILE,"reinsurance.58.3.html") ) { return "reinsurance.58.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"How PolicyCenter Calculates Ceded Premiums") && Guidewire_FMSourceFileMatch(SRCFILE,"reinsurance.58.4.html") ) { return "reinsurance.58.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Shared Reinsurance Agreements") && Guidewire_FMSourceFileMatch(SRCFILE,"reinsurance.58.5.html") ) { return "reinsurance.58.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Location Groups") && Guidewire_FMSourceFileMatch(SRCFILE,"reinsurance.58.6.html") ) { return "reinsurance.58.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"Reinsurance Management User Interface") && Guidewire_FMSourceFileMatch(SRCFILE,"reinsurance_ui.59.1.html") ) { return "reinsurance_ui.59.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with the Reinsurance Tab") && Guidewire_FMSourceFileMatch(SRCFILE,"reinsurance_ui.59.2.html") ) { return "reinsurance_ui.59.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Reinsurance Management in Policies") && Guidewire_FMSourceFileMatch(SRCFILE,"reinsurance_ui.59.3.html") ) { return "reinsurance_ui.59.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Reinsurance Management Screens") && Guidewire_FMSourceFileMatch(SRCFILE,"reinsurance_ui.59.4.html") ) { return "reinsurance_ui.59.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Treaty or Facultative Agreement Screen") && Guidewire_FMSourceFileMatch(SRCFILE,"reinsurance_ui.59.5.html") ) { return "reinsurance_ui.59.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Reinsurance Program Screen") && Guidewire_FMSourceFileMatch(SRCFILE,"reinsurance_ui.59.6.html") ) { return "reinsurance_ui.59.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"Search Agreements Screen") && Guidewire_FMSourceFileMatch(SRCFILE,"reinsurance_ui.59.7.html") ) { return "reinsurance_ui.59.7.html";}
else if (Guidewire_TopicMatch(TOPIC,"Search Programs Screen") && Guidewire_FMSourceFileMatch(SRCFILE,"reinsurance_ui.59.8.html") ) { return "reinsurance_ui.59.8.html";}
else if (Guidewire_TopicMatch(TOPIC,"Reinsurance Screen in the Policy File") && Guidewire_FMSourceFileMatch(SRCFILE,"reinsurance_ui.59.9.html") ) { return "reinsurance_ui.59.9.html";}
else if (Guidewire_TopicMatch(TOPIC,"PolicyCenter Administration") && Guidewire_FMSourceFileMatch(SRCFILE,"p-administering.html") ) { return "p-administering.html";}
else if (Guidewire_TopicMatch(TOPIC,"Security: Roles, Permissions, and the Community Model") && Guidewire_FMSourceFileMatch(SRCFILE,"pc_security.61.01.html") ) { return "pc_security.61.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"Community Model Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"pc_security.61.02.html") ) { return "pc_security.61.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Security Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"pc_security.61.03.html") ) { return "pc_security.61.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Role-based Security") && Guidewire_FMSourceFileMatch(SRCFILE,"pc_security.61.04.html") ) { return "pc_security.61.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Data-based Security for Accounts and Policies") && Guidewire_FMSourceFileMatch(SRCFILE,"pc_security.61.05.html") ) { return "pc_security.61.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Data-based Security for the Community Model") && Guidewire_FMSourceFileMatch(SRCFILE,"pc_security.61.06.html") ) { return "pc_security.61.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"System and Application Permissions") && Guidewire_FMSourceFileMatch(SRCFILE,"pc_security.61.07.html") ) { return "pc_security.61.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Security Restrictions Using the Status Field") && Guidewire_FMSourceFileMatch(SRCFILE,"pc_security.61.08.html") ) { return "pc_security.61.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Producer of Record and Producer of Service") && Guidewire_FMSourceFileMatch(SRCFILE,"pc_security.61.09.html") ) { return "pc_security.61.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Managing the PolicyCenter Community") && Guidewire_FMSourceFileMatch(SRCFILE,"pc_security.61.10.html") ) { return "pc_security.61.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Security Object Models") && Guidewire_FMSourceFileMatch(SRCFILE,"pc_security.61.11.html") ) { return "pc_security.61.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Users and Security") && Guidewire_FMSourceFileMatch(SRCFILE,"pc_security.61.12.html") ) { return "pc_security.61.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"Security and Configuration Scenarios Related to Producer Codes") && Guidewire_FMSourceFileMatch(SRCFILE,"pc_security.61.13.html") ) { return "pc_security.61.13.html";}
else if (Guidewire_TopicMatch(TOPIC,"Security Dictionary") && Guidewire_FMSourceFileMatch(SRCFILE,"pc_security.61.14.html") ) { return "pc_security.61.14.html";}
else if (Guidewire_TopicMatch(TOPIC,"Access Control for Documents and Notes") && Guidewire_FMSourceFileMatch(SRCFILE,"pc_security.61.15.html") ) { return "pc_security.61.15.html";}
else if (Guidewire_TopicMatch(TOPIC,"Authority Profiles") && Guidewire_FMSourceFileMatch(SRCFILE,"authority_profiles.62.1.html") ) { return "authority_profiles.62.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Authority Profile Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"authority_profiles.62.2.html") ) { return "authority_profiles.62.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Authority Profiles") && Guidewire_FMSourceFileMatch(SRCFILE,"authority_profiles.62.3.html") ) { return "authority_profiles.62.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Team Management") && Guidewire_FMSourceFileMatch(SRCFILE,"team_views.63.1.html") ) { return "team_views.63.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Team Management Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"team_views.63.2.html") ) { return "team_views.63.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Team Tab User Categories") && Guidewire_FMSourceFileMatch(SRCFILE,"team_views.63.3.html") ) { return "team_views.63.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with the Team Tab") && Guidewire_FMSourceFileMatch(SRCFILE,"team_views.63.4.html") ) { return "team_views.63.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Holds Administration") && Guidewire_FMSourceFileMatch(SRCFILE,"admin_policyholds.64.1.html") ) { return "admin_policyholds.64.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Holds Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"admin_policyholds.64.2.html") ) { return "admin_policyholds.64.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Policy Holds") && Guidewire_FMSourceFileMatch(SRCFILE,"admin_policyholds.64.3.html") ) { return "admin_policyholds.64.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Hold Screen") && Guidewire_FMSourceFileMatch(SRCFILE,"admin_policyholds.64.4.html") ) { return "admin_policyholds.64.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Hold Object Model") && Guidewire_FMSourceFileMatch(SRCFILE,"admin_policyholds.64.5.html") ) { return "admin_policyholds.64.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Policy Holds") && Guidewire_FMSourceFileMatch(SRCFILE,"admin_policyholds.64.6.html") ) { return "admin_policyholds.64.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"Importing and Exporting Policy Holds") && Guidewire_FMSourceFileMatch(SRCFILE,"admin_policyholds.64.7.html") ) { return "admin_policyholds.64.7.html";}
else if (Guidewire_TopicMatch(TOPIC,"Holidays and Business Weeks") && Guidewire_FMSourceFileMatch(SRCFILE,"holidays.65.1.html") ) { return "holidays.65.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Specifying Holiday Dates") && Guidewire_FMSourceFileMatch(SRCFILE,"holidays.65.2.html") ) { return "holidays.65.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Holidays, Weekends, and Business Weeks") && Guidewire_FMSourceFileMatch(SRCFILE,"holidays.65.3.html") ) { return "holidays.65.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Using Gosu Methods to Work with Holidays") && Guidewire_FMSourceFileMatch(SRCFILE,"holidays.65.4.html") ) { return "holidays.65.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Business Weeks and Business Hours") && Guidewire_FMSourceFileMatch(SRCFILE,"holidays.65.5.html") ) { return "holidays.65.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Holiday Permissions") && Guidewire_FMSourceFileMatch(SRCFILE,"holidays.65.6.html") ) { return "holidays.65.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Form Pattern Administration") && Guidewire_FMSourceFileMatch(SRCFILE,"forms_admin.66.01.html") ) { return "forms_admin.66.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"About Forms") && Guidewire_FMSourceFileMatch(SRCFILE,"forms_admin.66.02.html") ) { return "forms_admin.66.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Form Patterns") && Guidewire_FMSourceFileMatch(SRCFILE,"forms_admin.66.03.html") ) { return "forms_admin.66.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Searching for a Form Pattern") && Guidewire_FMSourceFileMatch(SRCFILE,"forms_admin.66.04.html") ) { return "forms_admin.66.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding a Form Pattern") && Guidewire_FMSourceFileMatch(SRCFILE,"forms_admin.66.05.html") ) { return "forms_admin.66.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Specifying Removal or Replacement Forms for Policy Changes") && Guidewire_FMSourceFileMatch(SRCFILE,"forms_admin.66.06.html") ) { return "forms_admin.66.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Importing and Exporting Policy Form Patterns") && Guidewire_FMSourceFileMatch(SRCFILE,"forms_admin.66.07.html") ) { return "forms_admin.66.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Form Pattern or New Policy Form Screen") && Guidewire_FMSourceFileMatch(SRCFILE,"forms_admin.66.08.html") ) { return "forms_admin.66.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Basics Tab for Form Patterns") && Guidewire_FMSourceFileMatch(SRCFILE,"forms_admin.66.09.html") ) { return "forms_admin.66.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Products Tab for Form Patterns") && Guidewire_FMSourceFileMatch(SRCFILE,"forms_admin.66.10.html") ) { return "forms_admin.66.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Jurisdictions Tab for Form Patterns") && Guidewire_FMSourceFileMatch(SRCFILE,"forms_admin.66.11.html") ) { return "forms_admin.66.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Change Tab for Form Patterns") && Guidewire_FMSourceFileMatch(SRCFILE,"forms_admin.66.12.html") ) { return "forms_admin.66.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"Inference Tab for Form Patterns") && Guidewire_FMSourceFileMatch(SRCFILE,"forms_admin.66.13.html") ) { return "forms_admin.66.13.html";}
else if (Guidewire_TopicMatch(TOPIC,"Form Configuration") && Guidewire_FMSourceFileMatch(SRCFILE,"forms_admin.66.14.html") ) { return "forms_admin.66.14.html";}
else if (Guidewire_TopicMatch(TOPIC,"Form Pattern Validation") && Guidewire_FMSourceFileMatch(SRCFILE,"forms_admin.66.15.html") ) { return "forms_admin.66.15.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Generic Form Inference") && Guidewire_FMSourceFileMatch(SRCFILE,"forms_admin.66.16.html") ) { return "forms_admin.66.16.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Custom Form Inference") && Guidewire_FMSourceFileMatch(SRCFILE,"forms_admin.66.17.html") ) { return "forms_admin.66.17.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding a Custom Inference Class") && Guidewire_FMSourceFileMatch(SRCFILE,"forms_admin.66.18.html") ) { return "forms_admin.66.18.html";}
else if (Guidewire_TopicMatch(TOPIC,"Administration Utilities") && Guidewire_FMSourceFileMatch(SRCFILE,"admin_utilities.67.1.html") ) { return "admin_utilities.67.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Importing and Exporting Data") && Guidewire_FMSourceFileMatch(SRCFILE,"admin_utilities.67.2.html") ) { return "admin_utilities.67.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Administering Script Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"admin_utilities.67.3.html") ) { return "admin_utilities.67.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Administering Data Changes") && Guidewire_FMSourceFileMatch(SRCFILE,"admin_utilities.67.4.html") ) { return "admin_utilities.67.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Importing and Exporting Policy Data Spreadsheets") && Guidewire_FMSourceFileMatch(SRCFILE,"admin_utilities.67.5.html") ) { return "admin_utilities.67.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"External System Integration") && Guidewire_FMSourceFileMatch(SRCFILE,"p-integrations.html") ) { return "p-integrations.html";}
else if (Guidewire_TopicMatch(TOPIC,"Billing System Integration") && Guidewire_FMSourceFileMatch(SRCFILE,"pc-bc-integration.69.01.html") ) { return "pc-bc-integration.69.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"Billing System Integration Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"pc-bc-integration.69.02.html") ) { return "pc-bc-integration.69.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Transactions That Create a New Policy Period") && Guidewire_FMSourceFileMatch(SRCFILE,"pc-bc-integration.69.03.html") ) { return "pc-bc-integration.69.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Transactions That Create Midterm Changes") && Guidewire_FMSourceFileMatch(SRCFILE,"pc-bc-integration.69.04.html") ) { return "pc-bc-integration.69.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Cancellations in the Billing System Integration") && Guidewire_FMSourceFileMatch(SRCFILE,"pc-bc-integration.69.05.html") ) { return "pc-bc-integration.69.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Reinstatements in the Billing System Integration") && Guidewire_FMSourceFileMatch(SRCFILE,"pc-bc-integration.69.06.html") ) { return "pc-bc-integration.69.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Renewals or Rewrites in the Billing System Integration") && Guidewire_FMSourceFileMatch(SRCFILE,"pc-bc-integration.69.07.html") ) { return "pc-bc-integration.69.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Final Audits in the Billing System Integration") && Guidewire_FMSourceFileMatch(SRCFILE,"pc-bc-integration.69.08.html") ) { return "pc-bc-integration.69.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Premium Reporting in the Billing System Integration") && Guidewire_FMSourceFileMatch(SRCFILE,"pc-bc-integration.69.09.html") ) { return "pc-bc-integration.69.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with the Billing System Integration") && Guidewire_FMSourceFileMatch(SRCFILE,"pc-bc-integration.69.10.html") ) { return "pc-bc-integration.69.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with the Payment Screen in the Billing System Integration") && Guidewire_FMSourceFileMatch(SRCFILE,"pc-bc-integration.69.11.html") ) { return "pc-bc-integration.69.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Viewing the Policy Period in BillingCenter") && Guidewire_FMSourceFileMatch(SRCFILE,"pc-bc-integration.69.12.html") ) { return "pc-bc-integration.69.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Accounts from the Billing System") && Guidewire_FMSourceFileMatch(SRCFILE,"pc-bc-integration.69.13.html") ) { return "pc-bc-integration.69.13.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Policies in the Billing System Integration") && Guidewire_FMSourceFileMatch(SRCFILE,"pc-bc-integration.69.14.html") ) { return "pc-bc-integration.69.14.html";}
else if (Guidewire_TopicMatch(TOPIC,"Multicurrency Integration Between BillingCenter and PolicyCenter") && Guidewire_FMSourceFileMatch(SRCFILE,"pc-bc-integration.69.15.html") ) { return "pc-bc-integration.69.15.html";}
else if (Guidewire_TopicMatch(TOPIC,"Claim System Integration") && Guidewire_FMSourceFileMatch(SRCFILE,"pc-cc-integration.70.1.html") ) { return "pc-cc-integration.70.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Claim System Integration Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"pc-cc-integration.70.2.html") ) { return "pc-cc-integration.70.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Accessing Summary Loss Information from the Claim System") && Guidewire_FMSourceFileMatch(SRCFILE,"pc-cc-integration.70.3.html") ) { return "pc-cc-integration.70.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Viewing Loss Claims for Policies") && Guidewire_FMSourceFileMatch(SRCFILE,"pc-cc-integration.70.4.html") ) { return "pc-cc-integration.70.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Viewing Loss Claims from an Account") && Guidewire_FMSourceFileMatch(SRCFILE,"pc-cc-integration.70.5.html") ) { return "pc-cc-integration.70.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Loss Claims Notification at Renewal") && Guidewire_FMSourceFileMatch(SRCFILE,"pc-cc-integration.70.6.html") ) { return "pc-cc-integration.70.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"Large Loss Notification") && Guidewire_FMSourceFileMatch(SRCFILE,"pc-cc-integration.70.7.html") ) { return "pc-cc-integration.70.7.html";}
else if (Guidewire_TopicMatch(TOPIC,"Permissions for Working with Claims") && Guidewire_FMSourceFileMatch(SRCFILE,"pc-cc-integration.70.8.html") ) { return "pc-cc-integration.70.8.html";}
else if (Guidewire_TopicMatch(TOPIC,"Claim Search Plugin") && Guidewire_FMSourceFileMatch(SRCFILE,"pc-cc-integration.70.9.html") ) { return "pc-cc-integration.70.9.html";}
else if (Guidewire_TopicMatch(TOPIC,"Contact Management System Integration") && Guidewire_FMSourceFileMatch(SRCFILE,"pc-ab-integration.71.1.html") ) { return "pc-ab-integration.71.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Contact Management System Integration Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"pc-ab-integration.71.2.html") ) { return "pc-ab-integration.71.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Searching for Contacts Within a Contact Management System") && Guidewire_FMSourceFileMatch(SRCFILE,"pc-ab-integration.71.3.html") ) { return "pc-ab-integration.71.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"New and Updated Contacts") && Guidewire_FMSourceFileMatch(SRCFILE,"pc-ab-integration.71.4.html") ) { return "pc-ab-integration.71.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Detecting Duplicates in the Contact Management System") && Guidewire_FMSourceFileMatch(SRCFILE,"pc-ab-integration.71.5.html") ) { return "pc-ab-integration.71.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Duplicate Contacts in PolicyCenter") && Guidewire_FMSourceFileMatch(SRCFILE,"pc-ab-integration.71.6.html") ) { return "pc-ab-integration.71.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"Deleting, Removing, and Inactivating a Contact") && Guidewire_FMSourceFileMatch(SRCFILE,"pc-ab-integration.71.7.html") ) { return "pc-ab-integration.71.7.html";}
else if (Guidewire_TopicMatch(TOPIC,"Customizing the Contact Management System Integration") && Guidewire_FMSourceFileMatch(SRCFILE,"pc-ab-integration.71.8.html") ) { return "pc-ab-integration.71.8.html";}
else { return("../wwhelp/topic_cannot_be_found.html"); } }

function  WWHBookData_MatchTopic(P)
{
var C=null;P=decodeURIComponent(decodeURIComponent(escape(P)));//workaround epub bug with UTF8 processing!
if(P=="Documents_and_Their_Management")C="documents.48.1.html";
if(P=="Forms_Handling")C="forms_handling.49.1.html";
if (C) { return C } else { return GUIDEWIRE_TOPIC_TO_FILE(P,Guidewire_ExtractSrcFromURL());}
}
