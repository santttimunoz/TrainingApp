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

else if (Guidewire_TopicMatch(TOPIC,"Guidewire PolicyCenter\u00ae") && Guidewire_FMSourceFileMatch(SRCFILE,"cover-config.html") ) { return "cover-config.html";}
else if (Guidewire_TopicMatch(TOPIC,"About PolicyCenter Documentation") && Guidewire_FMSourceFileMatch(SRCFILE,"about.html") ) { return "about.html";}
else if (Guidewire_TopicMatch(TOPIC,"PolicyCenter Configuration Basics") && Guidewire_FMSourceFileMatch(SRCFILE,"p-basics.html") ) { return "p-basics.html";}
else if (Guidewire_TopicMatch(TOPIC,"Overview of PolicyCenter Configuration") && Guidewire_FMSourceFileMatch(SRCFILE,"overview.04.1.html") ) { return "overview.04.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"What You Can Configure") && Guidewire_FMSourceFileMatch(SRCFILE,"overview.04.2.html") ) { return "overview.04.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"How You Configure PolicyCenter") && Guidewire_FMSourceFileMatch(SRCFILE,"overview.04.3.html") ) { return "overview.04.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Types of Application Environments") && Guidewire_FMSourceFileMatch(SRCFILE,"overview.04.4.html") ) { return "overview.04.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Deploying Configuration Files") && Guidewire_FMSourceFileMatch(SRCFILE,"overview.04.5.html") ) { return "overview.04.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Regenerating the Data Dictionary and Security Dictionary") && Guidewire_FMSourceFileMatch(SRCFILE,"overview.04.6.html") ) { return "overview.04.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"Managing Configuration Changes") && Guidewire_FMSourceFileMatch(SRCFILE,"overview.04.7.html") ) { return "overview.04.7.html";}
else if (Guidewire_TopicMatch(TOPIC,"Application Configuration Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"params.05.01.html") ) { return "params.05.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Configuration Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"params.05.02.html") ) { return "params.05.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Archive Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"params.05.03.html") ) { return "params.05.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Assignment Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"params.05.04.html") ) { return "params.05.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Batch Process Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"params.05.05.html") ) { return "params.05.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Business Calendar Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"params.05.06.html") ) { return "params.05.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Cache Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"params.05.07.html") ) { return "params.05.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Clustering Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"params.05.08.html") ) { return "params.05.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Database Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"params.05.09.html") ) { return "params.05.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Desktop and Team Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"params.05.10.html") ) { return "params.05.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Document Creation and Document Management Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"params.05.11.html") ) { return "params.05.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Domain Graph Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"params.05.12.html") ) { return "params.05.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"Environment Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"params.05.13.html") ) { return "params.05.13.html";}
else if (Guidewire_TopicMatch(TOPIC,"Financial Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"params.05.14.html") ) { return "params.05.14.html";}
else if (Guidewire_TopicMatch(TOPIC,"Geocoding Feature Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"params.05.15.html") ) { return "params.05.15.html";}
else if (Guidewire_TopicMatch(TOPIC,"Globalization Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"params.05.16.html") ) { return "params.05.16.html";}
else if (Guidewire_TopicMatch(TOPIC,"Integration Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"params.05.17.html") ) { return "params.05.17.html";}
else if (Guidewire_TopicMatch(TOPIC,"Job Expiration Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"params.05.18.html") ) { return "params.05.18.html";}
else if (Guidewire_TopicMatch(TOPIC,"Logging Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"params.05.19.html") ) { return "params.05.19.html";}
else if (Guidewire_TopicMatch(TOPIC,"Lookup Table Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"params.05.20.html") ) { return "params.05.20.html";}
else if (Guidewire_TopicMatch(TOPIC,"Miscellaneous Job-Related Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"params.05.21.html") ) { return "params.05.21.html";}
else if (Guidewire_TopicMatch(TOPIC,"Miscellaneous Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"params.05.22.html") ) { return "params.05.22.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Exception Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"params.05.23.html") ) { return "params.05.23.html";}
else if (Guidewire_TopicMatch(TOPIC,"PDF Print Settings Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"params.05.24.html") ) { return "params.05.24.html";}
else if (Guidewire_TopicMatch(TOPIC,"Product Model") && Guidewire_FMSourceFileMatch(SRCFILE,"params.05.25.html") ) { return "params.05.25.html";}
else if (Guidewire_TopicMatch(TOPIC,"Quote Purging Configuration Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"params.05.26.html") ) { return "params.05.26.html";}
else if (Guidewire_TopicMatch(TOPIC,"Rating Management Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"params.05.27.html") ) { return "params.05.27.html";}
else if (Guidewire_TopicMatch(TOPIC,"Scheduler and Workflow Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"params.05.28.html") ) { return "params.05.28.html";}
else if (Guidewire_TopicMatch(TOPIC,"Search Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"params.05.29.html") ) { return "params.05.29.html";}
else if (Guidewire_TopicMatch(TOPIC,"Security Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"params.05.30.html") ) { return "params.05.30.html";}
else if (Guidewire_TopicMatch(TOPIC,"Side-by-Side Quoting Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"params.05.31.html") ) { return "params.05.31.html";}
else if (Guidewire_TopicMatch(TOPIC,"User Interface Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"params.05.32.html") ) { return "params.05.32.html";}
else if (Guidewire_TopicMatch(TOPIC,"Work Queue Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"params.05.33.html") ) { return "params.05.33.html";}
else if (Guidewire_TopicMatch(TOPIC,"The Guidewire Development Environment") && Guidewire_FMSourceFileMatch(SRCFILE,"p-datamodel.html") ) { return "p-datamodel.html";}
else if (Guidewire_TopicMatch(TOPIC,"Getting Started") && Guidewire_FMSourceFileMatch(SRCFILE,"studio.07.01.html") ) { return "studio.07.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"What Is Guidewire Studio") && Guidewire_FMSourceFileMatch(SRCFILE,"studio.07.02.html") ) { return "studio.07.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"The Studio Development Environment") && Guidewire_FMSourceFileMatch(SRCFILE,"studio.07.03.html") ) { return "studio.07.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with the QuickStart Development Server") && Guidewire_FMSourceFileMatch(SRCFILE,"studio.07.04.html") ) { return "studio.07.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"PolicyCenter Configuration Files") && Guidewire_FMSourceFileMatch(SRCFILE,"studio.07.05.html") ) { return "studio.07.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Using Studio with IntelliJ IDEA Ultimate Edition") && Guidewire_FMSourceFileMatch(SRCFILE,"studio.07.06.html") ) { return "studio.07.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Studio and the DCE VM") && Guidewire_FMSourceFileMatch(SRCFILE,"studio.07.07.html") ) { return "studio.07.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Starting Guidewire Studio") && Guidewire_FMSourceFileMatch(SRCFILE,"studio.07.08.html") ) { return "studio.07.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Restarting Studio") && Guidewire_FMSourceFileMatch(SRCFILE,"studio.07.09.html") ) { return "studio.07.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Using the Studio Interface") && Guidewire_FMSourceFileMatch(SRCFILE,"studio.07.10.html") ) { return "studio.07.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working in Guidewire Studio") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_using.08.01.html") ) { return "studio_using.08.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"Entering Valid Code") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_using.08.02.html") ) { return "studio_using.08.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Accessing Reference Information") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_using.08.03.html") ) { return "studio_using.08.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Using Studio Keyboard Shortcuts") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_using.08.04.html") ) { return "studio_using.08.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Viewing Keyboard Shortcuts in PolicyCenter") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_using.08.05.html") ) { return "studio_using.08.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Using Text Editing Commands") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_using.08.06.html") ) { return "studio_using.08.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Navigating Tables") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_using.08.07.html") ) { return "studio_using.08.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Refactoring Gosu Code") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_using.08.08.html") ) { return "studio_using.08.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Saving Your Work") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_using.08.09.html") ) { return "studio_using.08.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Validating Studio Resources") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_using.08.10.html") ) { return "studio_using.08.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Guidewire Studio") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_configure.09.1.html") ) { return "studio_configure.09.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Improving Studio Performance") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_configure.09.2.html") ) { return "studio_configure.09.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Setting Font Display Options") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_configure.09.3.html") ) { return "studio_configure.09.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"PolicyCenter Studio and Gosu") && Guidewire_FMSourceFileMatch(SRCFILE,"building_blocks.10.01.html") ) { return "building_blocks.10.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"Gosu Building Blocks") && Guidewire_FMSourceFileMatch(SRCFILE,"building_blocks.10.02.html") ) { return "building_blocks.10.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Gosu Case Sensitivity") && Guidewire_FMSourceFileMatch(SRCFILE,"building_blocks.10.03.html") ) { return "building_blocks.10.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Gosu in PolicyCenter Studio") && Guidewire_FMSourceFileMatch(SRCFILE,"building_blocks.10.04.html") ) { return "building_blocks.10.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Gosu Packages") && Guidewire_FMSourceFileMatch(SRCFILE,"building_blocks.10.05.html") ) { return "building_blocks.10.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Gosu Classes") && Guidewire_FMSourceFileMatch(SRCFILE,"building_blocks.10.06.html") ) { return "building_blocks.10.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"PolicyCenter Base Configuration Classes") && Guidewire_FMSourceFileMatch(SRCFILE,"building_blocks.10.07.html") ) { return "building_blocks.10.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Class Visibility in Studio") && Guidewire_FMSourceFileMatch(SRCFILE,"building_blocks.10.08.html") ) { return "building_blocks.10.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Preloading Gosu Classes") && Guidewire_FMSourceFileMatch(SRCFILE,"building_blocks.10.09.html") ) { return "building_blocks.10.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Gosu Enhancements") && Guidewire_FMSourceFileMatch(SRCFILE,"building_blocks.10.10.html") ) { return "building_blocks.10.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"The Guidewire XML Model") && Guidewire_FMSourceFileMatch(SRCFILE,"building_blocks.10.11.html") ) { return "building_blocks.10.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Script Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"building_blocks.10.12.html") ) { return "building_blocks.10.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Script Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"building_blocks.10.13.html") ) { return "building_blocks.10.13.html";}
else if (Guidewire_TopicMatch(TOPIC,"Referencing a Script Parameter in Gosu") && Guidewire_FMSourceFileMatch(SRCFILE,"building_blocks.10.14.html") ) { return "building_blocks.10.14.html";}
else if (Guidewire_TopicMatch(TOPIC,"PolicyCenter Script Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"building_blocks.10.15.html") ) { return "building_blocks.10.15.html";}
else if (Guidewire_TopicMatch(TOPIC,"Guidewire Studio Editors") && Guidewire_FMSourceFileMatch(SRCFILE,"p-editors.html") ) { return "p-editors.html";}
else if (Guidewire_TopicMatch(TOPIC,"Using the Studio Editors") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_editors.12.1.html") ) { return "studio_editors.12.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Editing in Guidewire Studio") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_editors.12.2.html") ) { return "studio_editors.12.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working in the Gosu Editor") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_editors.12.3.html") ) { return "studio_editors.12.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Using Product Designer to Edit the Product Model") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_editors.12.4.html") ) { return "studio_editors.12.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Using the Plugins Registry Editor") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_plugins.13.1.html") ) { return "studio_plugins.13.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"What Are Plugins") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_plugins.13.2.html") ) { return "studio_plugins.13.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Plugins") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_plugins.13.3.html") ) { return "studio_plugins.13.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Customizing Plugin Functionality") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_plugins.13.4.html") ) { return "studio_plugins.13.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Plugin Versions") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_plugins.13.5.html") ) { return "studio_plugins.13.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Web Services") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_web_services.14.1.html") ) { return "studio_web_services.14.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Web Services and Guidewire Studio") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_web_services.14.2.html") ) { return "studio_web_services.14.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Using the Web Service Editor") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_web_services.14.3.html") ) { return "studio_web_services.14.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Defining a Web Service Collection") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_web_services.14.4.html") ) { return "studio_web_services.14.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Implementing QuickJump Commands") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_quickjump.15.1.html") ) { return "studio_quickjump.15.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"What Is QuickJump") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_quickjump.15.2.html") ) { return "studio_quickjump.15.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding a QuickJump Navigation Command") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_quickjump.15.3.html") ) { return "studio_quickjump.15.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Implementing QuickJumpCommandRef Commands") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_quickjump.15.4.html") ) { return "studio_quickjump.15.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Implementing StaticNavigationCommandRef Commands") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_quickjump.15.5.html") ) { return "studio_quickjump.15.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Implementing ContextualNavigationCommandRef Commands") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_quickjump.15.6.html") ) { return "studio_quickjump.15.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"Checking Permissions on QuickJump Navigation Commands") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_quickjump.15.7.html") ) { return "studio_quickjump.15.7.html";}
else if (Guidewire_TopicMatch(TOPIC,"Using the Entity Names Editor") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_entity_names.16.1.html") ) { return "studio_entity_names.16.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Entity Names Editor") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_entity_names.16.2.html") ) { return "studio_entity_names.16.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Variable Table") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_entity_names.16.3.html") ) { return "studio_entity_names.16.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Gosu Text Editor") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_entity_names.16.4.html") ) { return "studio_entity_names.16.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Including Data from Subentities") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_entity_names.16.5.html") ) { return "studio_entity_names.16.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Entity Name Types") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_entity_names.16.6.html") ) { return "studio_entity_names.16.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"Using the Messaging Editor") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_messaging.17.1.html") ) { return "studio_messaging.17.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Messaging Editor") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_messaging.17.2.html") ) { return "studio_messaging.17.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Using the Display Keys Editor") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_displaykey_editor.18.1.html") ) { return "studio_displaykey_editor.18.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Display Keys Editor") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_displaykey_editor.18.2.html") ) { return "studio_displaykey_editor.18.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Creating Display Keys in a Gosu Editor") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_displaykey_editor.18.3.html") ) { return "studio_displaykey_editor.18.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Retrieving the Value of a Display Key") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_displaykey_editor.18.4.html") ) { return "studio_displaykey_editor.18.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Data Model Configuration") && Guidewire_FMSourceFileMatch(SRCFILE,"p-datamodel_2.html") ) { return "p-datamodel_2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with the Data Dictionary") && Guidewire_FMSourceFileMatch(SRCFILE,"data_dictionary.20.1.html") ) { return "data_dictionary.20.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"What is the Data Dictionary") && Guidewire_FMSourceFileMatch(SRCFILE,"data_dictionary.20.2.html") ) { return "data_dictionary.20.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"What Can You View in the Data Dictionary") && Guidewire_FMSourceFileMatch(SRCFILE,"data_dictionary.20.3.html") ) { return "data_dictionary.20.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Using the Data Dictionary") && Guidewire_FMSourceFileMatch(SRCFILE,"data_dictionary.20.4.html") ) { return "data_dictionary.20.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"The PolicyCenter Data Model") && Guidewire_FMSourceFileMatch(SRCFILE,"entities.21.01.html") ) { return "entities.21.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"What is the Data Model") && Guidewire_FMSourceFileMatch(SRCFILE,"entities.21.02.html") ) { return "entities.21.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Overview of Data Entities") && Guidewire_FMSourceFileMatch(SRCFILE,"entities.21.03.html") ) { return "entities.21.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Base PolicyCenter Data Objects") && Guidewire_FMSourceFileMatch(SRCFILE,"entities.21.04.html") ) { return "entities.21.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Delegate Data Objects") && Guidewire_FMSourceFileMatch(SRCFILE,"entities.21.05.html") ) { return "entities.21.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Entity Data Objects") && Guidewire_FMSourceFileMatch(SRCFILE,"entities.21.06.html") ) { return "entities.21.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Extension Data Objects") && Guidewire_FMSourceFileMatch(SRCFILE,"entities.21.07.html") ) { return "entities.21.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Non-persistent Entity Data Objects") && Guidewire_FMSourceFileMatch(SRCFILE,"entities.21.08.html") ) { return "entities.21.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Subtype Data Objects") && Guidewire_FMSourceFileMatch(SRCFILE,"entities.21.09.html") ) { return "entities.21.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"View Entity Data Objects") && Guidewire_FMSourceFileMatch(SRCFILE,"entities.21.10.html") ) { return "entities.21.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"View Entity Extension Data Objects") && Guidewire_FMSourceFileMatch(SRCFILE,"entities.21.11.html") ) { return "entities.21.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Data Object Subelements") && Guidewire_FMSourceFileMatch(SRCFILE,"entities.21.12.html") ) { return "entities.21.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"(array)") && Guidewire_FMSourceFileMatch(SRCFILE,"entities.21.13.html") ) { return "entities.21.13.html";}
else if (Guidewire_TopicMatch(TOPIC,"(column)") && Guidewire_FMSourceFileMatch(SRCFILE,"entities.21.14.html") ) { return "entities.21.14.html";}
else if (Guidewire_TopicMatch(TOPIC,"(componentref)") && Guidewire_FMSourceFileMatch(SRCFILE,"entities.21.15.html") ) { return "entities.21.15.html";}
else if (Guidewire_TopicMatch(TOPIC,"(edgeForeignKey)") && Guidewire_FMSourceFileMatch(SRCFILE,"entities.21.16.html") ) { return "entities.21.16.html";}
else if (Guidewire_TopicMatch(TOPIC,"(events)") && Guidewire_FMSourceFileMatch(SRCFILE,"entities.21.17.html") ) { return "entities.21.17.html";}
else if (Guidewire_TopicMatch(TOPIC,"(foreignkey)") && Guidewire_FMSourceFileMatch(SRCFILE,"entities.21.18.html") ) { return "entities.21.18.html";}
else if (Guidewire_TopicMatch(TOPIC,"(fulldescription)") && Guidewire_FMSourceFileMatch(SRCFILE,"entities.21.19.html") ) { return "entities.21.19.html";}
else if (Guidewire_TopicMatch(TOPIC,"(implementsEntity)") && Guidewire_FMSourceFileMatch(SRCFILE,"entities.21.20.html") ) { return "entities.21.20.html";}
else if (Guidewire_TopicMatch(TOPIC,"(implementsInterface)") && Guidewire_FMSourceFileMatch(SRCFILE,"entities.21.21.html") ) { return "entities.21.21.html";}
else if (Guidewire_TopicMatch(TOPIC,"(index)") && Guidewire_FMSourceFileMatch(SRCFILE,"entities.21.22.html") ) { return "entities.21.22.html";}
else if (Guidewire_TopicMatch(TOPIC,"(onetoone)") && Guidewire_FMSourceFileMatch(SRCFILE,"entities.21.23.html") ) { return "entities.21.23.html";}
else if (Guidewire_TopicMatch(TOPIC,"(remove-index)") && Guidewire_FMSourceFileMatch(SRCFILE,"entities.21.24.html") ) { return "entities.21.24.html";}
else if (Guidewire_TopicMatch(TOPIC,"(typekey)") && Guidewire_FMSourceFileMatch(SRCFILE,"entities.21.25.html") ) { return "entities.21.25.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Associative Arrays") && Guidewire_FMSourceFileMatch(SRCFILE,"associative_arrays.22.1.html") ) { return "associative_arrays.22.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Overview of Associative Arrays") && Guidewire_FMSourceFileMatch(SRCFILE,"associative_arrays.22.2.html") ) { return "associative_arrays.22.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Subtype Mapping Associative Arrays") && Guidewire_FMSourceFileMatch(SRCFILE,"associative_arrays.22.3.html") ) { return "associative_arrays.22.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Typelist Mapping Associative Arrays") && Guidewire_FMSourceFileMatch(SRCFILE,"associative_arrays.22.4.html") ) { return "associative_arrays.22.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Modifying the Base Data Model") && Guidewire_FMSourceFileMatch(SRCFILE,"extenddm.23.01.html") ) { return "extenddm.23.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"Planning Changes to the Base Data Model") && Guidewire_FMSourceFileMatch(SRCFILE,"extenddm.23.02.html") ) { return "extenddm.23.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Defining a New Data Entity") && Guidewire_FMSourceFileMatch(SRCFILE,"extenddm.23.03.html") ) { return "extenddm.23.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Extending a Base Configuration Entity") && Guidewire_FMSourceFileMatch(SRCFILE,"extenddm.23.04.html") ) { return "extenddm.23.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Attribute Overrides") && Guidewire_FMSourceFileMatch(SRCFILE,"extenddm.23.05.html") ) { return "extenddm.23.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Extending the Base Data Model: Examples") && Guidewire_FMSourceFileMatch(SRCFILE,"extenddm.23.06.html") ) { return "extenddm.23.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Creating a New Delegate Object") && Guidewire_FMSourceFileMatch(SRCFILE,"extenddm.23.07.html") ) { return "extenddm.23.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Extending a Delegate Object") && Guidewire_FMSourceFileMatch(SRCFILE,"extenddm.23.08.html") ) { return "extenddm.23.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Defining a Subtype") && Guidewire_FMSourceFileMatch(SRCFILE,"extenddm.23.09.html") ) { return "extenddm.23.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Defining a Reference Entity") && Guidewire_FMSourceFileMatch(SRCFILE,"extenddm.23.10.html") ) { return "extenddm.23.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Defining an Entity Array") && Guidewire_FMSourceFileMatch(SRCFILE,"extenddm.23.11.html") ) { return "extenddm.23.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Implementing a Many-to-Many Relationship Between Entity Types") && Guidewire_FMSourceFileMatch(SRCFILE,"extenddm.23.12.html") ) { return "extenddm.23.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"Extending an Existing View Entity") && Guidewire_FMSourceFileMatch(SRCFILE,"extenddm.23.13.html") ) { return "extenddm.23.13.html";}
else if (Guidewire_TopicMatch(TOPIC,"Removing Objects from the Base Configuration Data Model") && Guidewire_FMSourceFileMatch(SRCFILE,"extenddm.23.14.html") ) { return "extenddm.23.14.html";}
else if (Guidewire_TopicMatch(TOPIC,"Deploying Data Model Changes to the Application Server") && Guidewire_FMSourceFileMatch(SRCFILE,"extenddm.23.15.html") ) { return "extenddm.23.15.html";}
else if (Guidewire_TopicMatch(TOPIC,"Data Types") && Guidewire_FMSourceFileMatch(SRCFILE,"datatypes.24.1.html") ) { return "datatypes.24.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Overview of Data Types") && Guidewire_FMSourceFileMatch(SRCFILE,"datatypes.24.2.html") ) { return "datatypes.24.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"The Data Types Configuration File") && Guidewire_FMSourceFileMatch(SRCFILE,"datatypes.24.3.html") ) { return "datatypes.24.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Customizing Base Configuration Data Types") && Guidewire_FMSourceFileMatch(SRCFILE,"datatypes.24.4.html") ) { return "datatypes.24.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with the Medium Text Data Type (Oracle)") && Guidewire_FMSourceFileMatch(SRCFILE,"datatypes.24.5.html") ) { return "datatypes.24.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"The Data Type API") && Guidewire_FMSourceFileMatch(SRCFILE,"datatypes.24.6.html") ) { return "datatypes.24.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"Defining a New Data Type: Required Steps") && Guidewire_FMSourceFileMatch(SRCFILE,"datatypes.24.7.html") ) { return "datatypes.24.7.html";}
else if (Guidewire_TopicMatch(TOPIC,"Defining a New Tax Identification Number Data Type") && Guidewire_FMSourceFileMatch(SRCFILE,"datatypes.24.8.html") ) { return "datatypes.24.8.html";}
else if (Guidewire_TopicMatch(TOPIC,"The Archiving Domain Graph") && Guidewire_FMSourceFileMatch(SRCFILE,"domain_graph.25.01.html") ) { return "domain_graph.25.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"Domain Graph Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"domain_graph.25.02.html") ) { return "domain_graph.25.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Object Ownership in the Domain Graph") && Guidewire_FMSourceFileMatch(SRCFILE,"domain_graph.25.03.html") ) { return "domain_graph.25.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Accessing the Domain Graph") && Guidewire_FMSourceFileMatch(SRCFILE,"domain_graph.25.04.html") ) { return "domain_graph.25.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Including Objects in the Domain Graph") && Guidewire_FMSourceFileMatch(SRCFILE,"domain_graph.25.05.html") ) { return "domain_graph.25.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Implementing the Correct Delegate") && Guidewire_FMSourceFileMatch(SRCFILE,"domain_graph.25.06.html") ) { return "domain_graph.25.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Defining Ownership Relations Between Objects") && Guidewire_FMSourceFileMatch(SRCFILE,"domain_graph.25.07.html") ) { return "domain_graph.25.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Domain Graph Validation") && Guidewire_FMSourceFileMatch(SRCFILE,"domain_graph.25.08.html") ) { return "domain_graph.25.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Changes to the Data Model") && Guidewire_FMSourceFileMatch(SRCFILE,"domain_graph.25.09.html") ) { return "domain_graph.25.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Shared Entity Data") && Guidewire_FMSourceFileMatch(SRCFILE,"domain_graph.25.10.html") ) { return "domain_graph.25.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Eliminating Cycles From the Domain Graph") && Guidewire_FMSourceFileMatch(SRCFILE,"domain_graph.25.11.html") ) { return "domain_graph.25.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Field Validation") && Guidewire_FMSourceFileMatch(SRCFILE,"fieldvalidators.26.1.html") ) { return "fieldvalidators.26.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Field Validators") && Guidewire_FMSourceFileMatch(SRCFILE,"fieldvalidators.26.2.html") ) { return "fieldvalidators.26.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Field Validator Definitions") && Guidewire_FMSourceFileMatch(SRCFILE,"fieldvalidators.26.3.html") ) { return "fieldvalidators.26.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"(FieldValidators)") && Guidewire_FMSourceFileMatch(SRCFILE,"fieldvalidators.26.4.html") ) { return "fieldvalidators.26.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Modifying Field Validators") && Guidewire_FMSourceFileMatch(SRCFILE,"fieldvalidators.26.5.html") ) { return "fieldvalidators.26.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Typelists") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_typelist.27.01.html") ) { return "studio_typelist.27.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"What is a Typelist") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_typelist.27.02.html") ) { return "studio_typelist.27.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Terms Related to Typelists") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_typelist.27.03.html") ) { return "studio_typelist.27.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Typelists and Typecodes") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_typelist.27.04.html") ) { return "studio_typelist.27.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Typelist Definition Files") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_typelist.27.05.html") ) { return "studio_typelist.27.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Different Kinds of Typelists") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_typelist.27.06.html") ) { return "studio_typelist.27.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Typelists in Studio") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_typelist.27.07.html") ) { return "studio_typelist.27.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Typekey Fields") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_typelist.27.08.html") ) { return "studio_typelist.27.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Removing or Retiring a Typekey") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_typelist.27.09.html") ) { return "studio_typelist.27.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Typelist Filters") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_typelist.27.10.html") ) { return "studio_typelist.27.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Static Filters") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_typelist.27.11.html") ) { return "studio_typelist.27.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Dynamic Filters") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_typelist.27.12.html") ) { return "studio_typelist.27.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"Typecode References in Gosu") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_typelist.27.13.html") ) { return "studio_typelist.27.13.html";}
else if (Guidewire_TopicMatch(TOPIC,"Mapping Typecodes to External System Codes") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_typelist.27.14.html") ) { return "studio_typelist.27.14.html";}
else if (Guidewire_TopicMatch(TOPIC,"User Interface Configuration") && Guidewire_FMSourceFileMatch(SRCFILE,"p-ui.html") ) { return "p-ui.html";}
else if (Guidewire_TopicMatch(TOPIC,"Using the PCF Editor") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_pcf.29.01.html") ) { return "studio_pcf.29.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"Page Configuration (PCF) Editor") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_pcf.29.02.html") ) { return "studio_pcf.29.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Page Canvas Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_pcf.29.03.html") ) { return "studio_pcf.29.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Creating a New PCF File") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_pcf.29.04.html") ) { return "studio_pcf.29.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Shared or Included Files") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_pcf.29.05.html") ) { return "studio_pcf.29.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Page Config Menu") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_pcf.29.06.html") ) { return "studio_pcf.29.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Toolbox Tab") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_pcf.29.07.html") ) { return "studio_pcf.29.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Structure Tab") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_pcf.29.08.html") ) { return "studio_pcf.29.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Properties Tab") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_pcf.29.09.html") ) { return "studio_pcf.29.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"PCF Elements") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_pcf.29.10.html") ) { return "studio_pcf.29.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Elements") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_pcf.29.11.html") ) { return "studio_pcf.29.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Introduction to Page Configuration") && Guidewire_FMSourceFileMatch(SRCFILE,"pageconfig.30.1.html") ) { return "pageconfig.30.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Page Configuration Files") && Guidewire_FMSourceFileMatch(SRCFILE,"pageconfig.30.2.html") ) { return "pageconfig.30.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Page Configuration Elements") && Guidewire_FMSourceFileMatch(SRCFILE,"pageconfig.30.3.html") ) { return "pageconfig.30.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Getting Started Configuring Pages") && Guidewire_FMSourceFileMatch(SRCFILE,"pageconfig.30.4.html") ) { return "pageconfig.30.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Modifying Style and Theme Elements") && Guidewire_FMSourceFileMatch(SRCFILE,"pageconfig.30.5.html") ) { return "pageconfig.30.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Data Panels") && Guidewire_FMSourceFileMatch(SRCFILE,"panels.31.1.html") ) { return "panels.31.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Panel Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"panels.31.2.html") ) { return "panels.31.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Detail View Panel") && Guidewire_FMSourceFileMatch(SRCFILE,"panels.31.3.html") ) { return "panels.31.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"List View Panel") && Guidewire_FMSourceFileMatch(SRCFILE,"panels.31.4.html") ) { return "panels.31.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Navigation") && Guidewire_FMSourceFileMatch(SRCFILE,"nav.32.1.html") ) { return "nav.32.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Navigation Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"nav.32.2.html") ) { return "nav.32.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Tab Bars") && Guidewire_FMSourceFileMatch(SRCFILE,"nav.32.3.html") ) { return "nav.32.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Tabs") && Guidewire_FMSourceFileMatch(SRCFILE,"nav.32.4.html") ) { return "nav.32.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Search Functionality") && Guidewire_FMSourceFileMatch(SRCFILE,"search.33.01.html") ) { return "search.33.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"Database Search Configuration") && Guidewire_FMSourceFileMatch(SRCFILE,"search.33.02.html") ) { return "search.33.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"PolicyCenter Database Search Functionality") && Guidewire_FMSourceFileMatch(SRCFILE,"search.33.03.html") ) { return "search.33.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring PolicyCenter Database Search") && Guidewire_FMSourceFileMatch(SRCFILE,"search.33.04.html") ) { return "search.33.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Database Search Criteria in XML") && Guidewire_FMSourceFileMatch(SRCFILE,"search.33.05.html") ) { return "search.33.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Database Search Criteria in Gosu") && Guidewire_FMSourceFileMatch(SRCFILE,"search.33.06.html") ) { return "search.33.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Free-text Search Configuration") && Guidewire_FMSourceFileMatch(SRCFILE,"search.33.07.html") ) { return "search.33.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Free-text Search System Architecture") && Guidewire_FMSourceFileMatch(SRCFILE,"search.33.08.html") ) { return "search.33.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Enabling Free-text Search in PolicyCenter") && Guidewire_FMSourceFileMatch(SRCFILE,"search.33.09.html") ) { return "search.33.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring the Guidewire Solr Extension") && Guidewire_FMSourceFileMatch(SRCFILE,"search.33.10.html") ) { return "search.33.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Free-text Search for Indexing and Searching") && Guidewire_FMSourceFileMatch(SRCFILE,"search.33.11.html") ) { return "search.33.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring the Free-text Batch Load Command") && Guidewire_FMSourceFileMatch(SRCFILE,"search.33.12.html") ) { return "search.33.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring the Basic Search Screen for Free-text Search") && Guidewire_FMSourceFileMatch(SRCFILE,"search.33.13.html") ) { return "search.33.13.html";}
else if (Guidewire_TopicMatch(TOPIC,"Modifying Free-text Search for Additional Fields") && Guidewire_FMSourceFileMatch(SRCFILE,"search.33.14.html") ) { return "search.33.14.html";}
else if (Guidewire_TopicMatch(TOPIC,"Localizing Free-text Search") && Guidewire_FMSourceFileMatch(SRCFILE,"search.33.15.html") ) { return "search.33.15.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Special Page Functions") && Guidewire_FMSourceFileMatch(SRCFILE,"pagefunc.34.1.html") ) { return "pagefunc.34.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding Print Capabilities") && Guidewire_FMSourceFileMatch(SRCFILE,"pagefunc.34.2.html") ) { return "pagefunc.34.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Linking to a Specific Page: Using an EntryPoint PCF") && Guidewire_FMSourceFileMatch(SRCFILE,"pagefunc.34.3.html") ) { return "pagefunc.34.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Linking to a Specific Page: Using an ExitPoint PCF") && Guidewire_FMSourceFileMatch(SRCFILE,"pagefunc.34.4.html") ) { return "pagefunc.34.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Workflow and Activity Configuration") && Guidewire_FMSourceFileMatch(SRCFILE,"p-workflow.html") ) { return "p-workflow.html";}
else if (Guidewire_TopicMatch(TOPIC,"Using the Workflow Editor") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_workflow.36.1.html") ) { return "studio_workflow.36.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Workflow in Guidewire PolicyCenter") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_workflow.36.2.html") ) { return "studio_workflow.36.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Workflow in Guidewire Studio") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_workflow.36.3.html") ) { return "studio_workflow.36.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Understanding Workflow Steps") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_workflow.36.4.html") ) { return "studio_workflow.36.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Using the Workflow Right-Click Menu") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_workflow.36.5.html") ) { return "studio_workflow.36.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Using Search with Workflow") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_workflow.36.6.html") ) { return "studio_workflow.36.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"Guidewire Workflow") && Guidewire_FMSourceFileMatch(SRCFILE,"workflow.37.01.html") ) { return "workflow.37.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"Understanding Workflow") && Guidewire_FMSourceFileMatch(SRCFILE,"workflow.37.02.html") ) { return "workflow.37.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Workflow Instances") && Guidewire_FMSourceFileMatch(SRCFILE,"workflow.37.03.html") ) { return "workflow.37.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Work Items") && Guidewire_FMSourceFileMatch(SRCFILE,"workflow.37.04.html") ) { return "workflow.37.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Workflow Process Format") && Guidewire_FMSourceFileMatch(SRCFILE,"workflow.37.05.html") ) { return "workflow.37.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Workflow Gosu") && Guidewire_FMSourceFileMatch(SRCFILE,"workflow.37.06.html") ) { return "workflow.37.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Workflow Versioning") && Guidewire_FMSourceFileMatch(SRCFILE,"workflow.37.07.html") ) { return "workflow.37.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Workflow Localization") && Guidewire_FMSourceFileMatch(SRCFILE,"workflow.37.08.html") ) { return "workflow.37.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Workflow Structural Elements") && Guidewire_FMSourceFileMatch(SRCFILE,"workflow.37.09.html") ) { return "workflow.37.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"(Context)") && Guidewire_FMSourceFileMatch(SRCFILE,"workflow.37.10.html") ) { return "workflow.37.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"(Start)") && Guidewire_FMSourceFileMatch(SRCFILE,"workflow.37.11.html") ) { return "workflow.37.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"(Finish)") && Guidewire_FMSourceFileMatch(SRCFILE,"workflow.37.12.html") ) { return "workflow.37.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"Common Step Elements") && Guidewire_FMSourceFileMatch(SRCFILE,"workflow.37.13.html") ) { return "workflow.37.13.html";}
else if (Guidewire_TopicMatch(TOPIC,"Enter and Exit Scripts") && Guidewire_FMSourceFileMatch(SRCFILE,"workflow.37.14.html") ) { return "workflow.37.14.html";}
else if (Guidewire_TopicMatch(TOPIC,"Asserts") && Guidewire_FMSourceFileMatch(SRCFILE,"workflow.37.15.html") ) { return "workflow.37.15.html";}
else if (Guidewire_TopicMatch(TOPIC,"Events") && Guidewire_FMSourceFileMatch(SRCFILE,"workflow.37.16.html") ) { return "workflow.37.16.html";}
else if (Guidewire_TopicMatch(TOPIC,"Notifications") && Guidewire_FMSourceFileMatch(SRCFILE,"workflow.37.17.html") ) { return "workflow.37.17.html";}
else if (Guidewire_TopicMatch(TOPIC,"Branch IDs") && Guidewire_FMSourceFileMatch(SRCFILE,"workflow.37.18.html") ) { return "workflow.37.18.html";}
else if (Guidewire_TopicMatch(TOPIC,"Basic Workflow Steps") && Guidewire_FMSourceFileMatch(SRCFILE,"workflow.37.19.html") ) { return "workflow.37.19.html";}
else if (Guidewire_TopicMatch(TOPIC,"AutoStep") && Guidewire_FMSourceFileMatch(SRCFILE,"workflow.37.20.html") ) { return "workflow.37.20.html";}
else if (Guidewire_TopicMatch(TOPIC,"MessageStep") && Guidewire_FMSourceFileMatch(SRCFILE,"workflow.37.21.html") ) { return "workflow.37.21.html";}
else if (Guidewire_TopicMatch(TOPIC,"ActivityStep") && Guidewire_FMSourceFileMatch(SRCFILE,"workflow.37.22.html") ) { return "workflow.37.22.html";}
else if (Guidewire_TopicMatch(TOPIC,"ManualStep") && Guidewire_FMSourceFileMatch(SRCFILE,"workflow.37.23.html") ) { return "workflow.37.23.html";}
else if (Guidewire_TopicMatch(TOPIC,"Outcome") && Guidewire_FMSourceFileMatch(SRCFILE,"workflow.37.24.html") ) { return "workflow.37.24.html";}
else if (Guidewire_TopicMatch(TOPIC,"Step Branches") && Guidewire_FMSourceFileMatch(SRCFILE,"workflow.37.25.html") ) { return "workflow.37.25.html";}
else if (Guidewire_TopicMatch(TOPIC,"Working with Branch IDs") && Guidewire_FMSourceFileMatch(SRCFILE,"workflow.37.26.html") ) { return "workflow.37.26.html";}
else if (Guidewire_TopicMatch(TOPIC,"GO") && Guidewire_FMSourceFileMatch(SRCFILE,"workflow.37.27.html") ) { return "workflow.37.27.html";}
else if (Guidewire_TopicMatch(TOPIC,"TRIGGER") && Guidewire_FMSourceFileMatch(SRCFILE,"workflow.37.28.html") ) { return "workflow.37.28.html";}
else if (Guidewire_TopicMatch(TOPIC,"TIMEOUT") && Guidewire_FMSourceFileMatch(SRCFILE,"workflow.37.29.html") ) { return "workflow.37.29.html";}
else if (Guidewire_TopicMatch(TOPIC,"Creating New Workflows") && Guidewire_FMSourceFileMatch(SRCFILE,"workflow.37.30.html") ) { return "workflow.37.30.html";}
else if (Guidewire_TopicMatch(TOPIC,"Extending a Workflow: A Simple Example") && Guidewire_FMSourceFileMatch(SRCFILE,"workflow.37.31.html") ) { return "workflow.37.31.html";}
else if (Guidewire_TopicMatch(TOPIC,"Instantiating a Workflow") && Guidewire_FMSourceFileMatch(SRCFILE,"workflow.37.32.html") ) { return "workflow.37.32.html";}
else if (Guidewire_TopicMatch(TOPIC,"The Workflow Engine") && Guidewire_FMSourceFileMatch(SRCFILE,"workflow.37.33.html") ) { return "workflow.37.33.html";}
else if (Guidewire_TopicMatch(TOPIC,"Synchronicity, Transactions, and Errors") && Guidewire_FMSourceFileMatch(SRCFILE,"workflow.37.34.html") ) { return "workflow.37.34.html";}
else if (Guidewire_TopicMatch(TOPIC,"Workflow Subflows") && Guidewire_FMSourceFileMatch(SRCFILE,"workflow.37.35.html") ) { return "workflow.37.35.html";}
else if (Guidewire_TopicMatch(TOPIC,"Workflow Administration") && Guidewire_FMSourceFileMatch(SRCFILE,"workflow.37.36.html") ) { return "workflow.37.36.html";}
else if (Guidewire_TopicMatch(TOPIC,"Workflow Debugging, Logging, and Testing") && Guidewire_FMSourceFileMatch(SRCFILE,"workflow.37.37.html") ) { return "workflow.37.37.html";}
else if (Guidewire_TopicMatch(TOPIC,"Defining Activity Patterns") && Guidewire_FMSourceFileMatch(SRCFILE,"activity-patterns.38.1.html") ) { return "activity-patterns.38.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"What is an Activity Pattern") && Guidewire_FMSourceFileMatch(SRCFILE,"activity-patterns.38.2.html") ) { return "activity-patterns.38.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Pattern Types and Categories") && Guidewire_FMSourceFileMatch(SRCFILE,"activity-patterns.38.3.html") ) { return "activity-patterns.38.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Using Activity Patterns in Gosu") && Guidewire_FMSourceFileMatch(SRCFILE,"activity-patterns.38.4.html") ) { return "activity-patterns.38.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Calculating Activity Due Dates") && Guidewire_FMSourceFileMatch(SRCFILE,"activity-patterns.38.5.html") ) { return "activity-patterns.38.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Activity Patterns") && Guidewire_FMSourceFileMatch(SRCFILE,"activity-patterns.38.6.html") ) { return "activity-patterns.38.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"Using Activity Patterns with Documents and Emails") && Guidewire_FMSourceFileMatch(SRCFILE,"activity-patterns.38.7.html") ) { return "activity-patterns.38.7.html";}
else if (Guidewire_TopicMatch(TOPIC,"Localizing Activity Patterns") && Guidewire_FMSourceFileMatch(SRCFILE,"activity-patterns.38.8.html") ) { return "activity-patterns.38.8.html";}
else if (Guidewire_TopicMatch(TOPIC,"Testing Gosu Code") && Guidewire_FMSourceFileMatch(SRCFILE,"p-testing.html") ) { return "p-testing.html";}
else if (Guidewire_TopicMatch(TOPIC,"Testing and Debugging Your Configuration") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_debugging.40.1.html") ) { return "studio_debugging.40.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Testing PolicyCenter With Guidewire Studio") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_debugging.40.2.html") ) { return "studio_debugging.40.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"The Studio Debugger") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_debugging.40.3.html") ) { return "studio_debugging.40.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Setting Breakpoints") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_debugging.40.4.html") ) { return "studio_debugging.40.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Stepping Through Code") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_debugging.40.5.html") ) { return "studio_debugging.40.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Viewing Current Values") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_debugging.40.6.html") ) { return "studio_debugging.40.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"Resuming Execution") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_debugging.40.7.html") ) { return "studio_debugging.40.7.html";}
else if (Guidewire_TopicMatch(TOPIC,"Using the Gosu Scratchpad") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_debugging.40.8.html") ) { return "studio_debugging.40.8.html";}
else if (Guidewire_TopicMatch(TOPIC,"Suggestions for Testing Rules") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_debugging.40.9.html") ) { return "studio_debugging.40.9.html";}
else if (Guidewire_TopicMatch(TOPIC,"Using GUnit") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_GUnit_tester.41.01.html") ) { return "studio_GUnit_tester.41.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"The TestBase Class") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_GUnit_tester.41.02.html") ) { return "studio_GUnit_tester.41.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Overriding TestBase Methods") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_GUnit_tester.41.03.html") ) { return "studio_GUnit_tester.41.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring the Server Environment") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_GUnit_tester.41.04.html") ) { return "studio_GUnit_tester.41.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring the Test Environment") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_GUnit_tester.41.05.html") ) { return "studio_GUnit_tester.41.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuration Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_GUnit_tester.41.06.html") ) { return "studio_GUnit_tester.41.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Creating a GUnit Test Class") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_GUnit_tester.41.07.html") ) { return "studio_GUnit_tester.41.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Using Entity Builders to Create Test Data") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_GUnit_tester.41.08.html") ) { return "studio_GUnit_tester.41.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Creating an Entity Builder") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_GUnit_tester.41.09.html") ) { return "studio_GUnit_tester.41.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Entity Builder Examples") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_GUnit_tester.41.10.html") ) { return "studio_GUnit_tester.41.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Creating New Builders") && Guidewire_FMSourceFileMatch(SRCFILE,"studio_GUnit_tester.41.11.html") ) { return "studio_GUnit_tester.41.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Guidewire PolicyCenter Configuration") && Guidewire_FMSourceFileMatch(SRCFILE,"p-PolicyCenter.html") ) { return "p-PolicyCenter.html";}
else if (Guidewire_TopicMatch(TOPIC,"PolicyCenter Configuration Guidelines") && Guidewire_FMSourceFileMatch(SRCFILE,"overview-pc.43.1.html") ) { return "overview-pc.43.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Guidelines for Modularizing Line-of-business Code") && Guidewire_FMSourceFileMatch(SRCFILE,"overview-pc.43.2.html") ) { return "overview-pc.43.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Policy Archiving") && Guidewire_FMSourceFileMatch(SRCFILE,"archiving.44.01.html") ) { return "archiving.44.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"Archiving and the Domain Graph") && Guidewire_FMSourceFileMatch(SRCFILE,"archiving.44.02.html") ) { return "archiving.44.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Archiving in Guidewire PolicyCenter") && Guidewire_FMSourceFileMatch(SRCFILE,"archiving.44.03.html") ) { return "archiving.44.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Archiving and Encryption") && Guidewire_FMSourceFileMatch(SRCFILE,"archiving.44.04.html") ) { return "archiving.44.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Selecting Policy Terms for Archive Eligibility") && Guidewire_FMSourceFileMatch(SRCFILE,"archiving.44.05.html") ) { return "archiving.44.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Batch Processes and Archiving") && Guidewire_FMSourceFileMatch(SRCFILE,"archiving.44.06.html") ) { return "archiving.44.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Monitoring Archiving Activity") && Guidewire_FMSourceFileMatch(SRCFILE,"archiving.44.07.html") ) { return "archiving.44.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Archiving") && Guidewire_FMSourceFileMatch(SRCFILE,"archiving.44.08.html") ) { return "archiving.44.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Data Model for Archiving") && Guidewire_FMSourceFileMatch(SRCFILE,"archiving.44.09.html") ) { return "archiving.44.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Archiving-related Configuration Parameters") && Guidewire_FMSourceFileMatch(SRCFILE,"archiving.44.10.html") ) { return "archiving.44.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Gosu Code and Archiving") && Guidewire_FMSourceFileMatch(SRCFILE,"archiving.44.11.html") ) { return "archiving.44.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Archive Work Queue") && Guidewire_FMSourceFileMatch(SRCFILE,"archiving.44.12.html") ) { return "archiving.44.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"Archiving Plugins") && Guidewire_FMSourceFileMatch(SRCFILE,"archiving.44.13.html") ) { return "archiving.44.13.html";}
else if (Guidewire_TopicMatch(TOPIC,"Archiving Test Tool") && Guidewire_FMSourceFileMatch(SRCFILE,"archiving.44.14.html") ) { return "archiving.44.14.html";}
else if (Guidewire_TopicMatch(TOPIC,"Archive Term by Job Number") && Guidewire_FMSourceFileMatch(SRCFILE,"archiving.44.15.html") ) { return "archiving.44.15.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Quote Purging") && Guidewire_FMSourceFileMatch(SRCFILE,"quotepurging-config.45.1.html") ) { return "quotepurging-config.45.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Quote Purging Configuration Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"quotepurging-config.45.2.html") ) { return "quotepurging-config.45.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Quote Purging Object Model") && Guidewire_FMSourceFileMatch(SRCFILE,"quotepurging-config.45.3.html") ) { return "quotepurging-config.45.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Quote Purging Batch Processes") && Guidewire_FMSourceFileMatch(SRCFILE,"quotepurging-config.45.4.html") ) { return "quotepurging-config.45.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Purging Test Tool") && Guidewire_FMSourceFileMatch(SRCFILE,"quotepurging-config.45.5.html") ) { return "quotepurging-config.45.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Quote Cloning for Business Intelligence") && Guidewire_FMSourceFileMatch(SRCFILE,"quotecloning-config.46.1.html") ) { return "quotecloning-config.46.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Quote Cloning Configuration Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"quotecloning-config.46.2.html") ) { return "quotecloning-config.46.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Quote Cloning Object Model") && Guidewire_FMSourceFileMatch(SRCFILE,"quotecloning-config.46.3.html") ) { return "quotecloning-config.46.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Enabling Quote Cloning") && Guidewire_FMSourceFileMatch(SRCFILE,"quotecloning-config.46.4.html") ) { return "quotecloning-config.46.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Quote Clone Plugin") && Guidewire_FMSourceFileMatch(SRCFILE,"quotecloning-config.46.5.html") ) { return "quotecloning-config.46.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Purge Quote Clones Batch Processing") && Guidewire_FMSourceFileMatch(SRCFILE,"quotecloning-config.46.6.html") ) { return "quotecloning-config.46.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Underwriting Authority") && Guidewire_FMSourceFileMatch(SRCFILE,"uw_issues_config.47.01.html") ) { return "uw_issues_config.47.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"Overview of Configuring Underwriting Authority") && Guidewire_FMSourceFileMatch(SRCFILE,"uw_issues_config.47.02.html") ) { return "uw_issues_config.47.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Implementing Underwriting Authority") && Guidewire_FMSourceFileMatch(SRCFILE,"uw_issues_config.47.03.html") ) { return "uw_issues_config.47.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Defining an Underwriting Issue") && Guidewire_FMSourceFileMatch(SRCFILE,"uw_issues_config.47.04.html") ) { return "uw_issues_config.47.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Creating Underwriting Issues") && Guidewire_FMSourceFileMatch(SRCFILE,"uw_issues_config.47.05.html") ) { return "uw_issues_config.47.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding a New Checking Set") && Guidewire_FMSourceFileMatch(SRCFILE,"uw_issues_config.47.06.html") ) { return "uw_issues_config.47.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding a New Value Comparator") && Guidewire_FMSourceFileMatch(SRCFILE,"uw_issues_config.47.07.html") ) { return "uw_issues_config.47.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding a New Value Formatter") && Guidewire_FMSourceFileMatch(SRCFILE,"uw_issues_config.47.08.html") ) { return "uw_issues_config.47.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Authority Grants") && Guidewire_FMSourceFileMatch(SRCFILE,"uw_issues_config.47.09.html") ) { return "uw_issues_config.47.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Underwriting Issues") && Guidewire_FMSourceFileMatch(SRCFILE,"uw_issues_config.47.10.html") ) { return "uw_issues_config.47.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Underwriting Issue Object Model") && Guidewire_FMSourceFileMatch(SRCFILE,"uw_issues_config.47.11.html") ) { return "uw_issues_config.47.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Checking Sets and Evaluators") && Guidewire_FMSourceFileMatch(SRCFILE,"uw_issues_config.47.12.html") ) { return "uw_issues_config.47.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"Removing Orphaned Issues") && Guidewire_FMSourceFileMatch(SRCFILE,"uw_issues_config.47.13.html") ) { return "uw_issues_config.47.13.html";}
else if (Guidewire_TopicMatch(TOPIC,"Blocking Points") && Guidewire_FMSourceFileMatch(SRCFILE,"uw_issues_config.47.14.html") ) { return "uw_issues_config.47.14.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Underwriting Referral Reasons") && Guidewire_FMSourceFileMatch(SRCFILE,"uw_issues_config.47.15.html") ) { return "uw_issues_config.47.15.html";}
else if (Guidewire_TopicMatch(TOPIC,"Job Interactions with Underwriting Issues") && Guidewire_FMSourceFileMatch(SRCFILE,"uw_issues_config.47.16.html") ) { return "uw_issues_config.47.16.html";}
else if (Guidewire_TopicMatch(TOPIC,"Issue Keys") && Guidewire_FMSourceFileMatch(SRCFILE,"uw_issues_config.47.17.html") ) { return "uw_issues_config.47.17.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Underwriting Issue History") && Guidewire_FMSourceFileMatch(SRCFILE,"uw_issues_config.47.18.html") ) { return "uw_issues_config.47.18.html";}
else if (Guidewire_TopicMatch(TOPIC,"Comparing Issue Values") && Guidewire_FMSourceFileMatch(SRCFILE,"uw_issues_config.47.19.html") ) { return "uw_issues_config.47.19.html";}
else if (Guidewire_TopicMatch(TOPIC,"Underwriting Issue Type System Table") && Guidewire_FMSourceFileMatch(SRCFILE,"uw_issues_config.47.20.html") ) { return "uw_issues_config.47.20.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Approvals") && Guidewire_FMSourceFileMatch(SRCFILE,"uw_issues_config.47.21.html") ) { return "uw_issues_config.47.21.html";}
else if (Guidewire_TopicMatch(TOPIC,"Handling Underwriting Issues in Policy Revisions") && Guidewire_FMSourceFileMatch(SRCFILE,"uw_issues_config.47.22.html") ) { return "uw_issues_config.47.22.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring the Account Holder Info Screen") && Guidewire_FMSourceFileMatch(SRCFILE,"customer_summary_config.48.1.html") ) { return "customer_summary_config.48.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Ways to Configure the Account Holder Info Screen") && Guidewire_FMSourceFileMatch(SRCFILE,"customer_summary_config.48.2.html") ) { return "customer_summary_config.48.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuration Files for the Account Holder Info Screen") && Guidewire_FMSourceFileMatch(SRCFILE,"customer_summary_config.48.3.html") ) { return "customer_summary_config.48.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Policy Data Spreadsheet ImportExport") && Guidewire_FMSourceFileMatch(SRCFILE,"spreadsheet_config.49.1.html") ) { return "spreadsheet_config.49.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changing the Spreadsheet Protection Password") && Guidewire_FMSourceFileMatch(SRCFILE,"spreadsheet_config.49.2.html") ) { return "spreadsheet_config.49.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Spreadsheet ImportExport in Commercial Property") && Guidewire_FMSourceFileMatch(SRCFILE,"spreadsheet_config.49.3.html") ) { return "spreadsheet_config.49.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding Spreadsheet ImportExport to Other Entities") && Guidewire_FMSourceFileMatch(SRCFILE,"spreadsheet_config.49.4.html") ) { return "spreadsheet_config.49.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Earned Premium") && Guidewire_FMSourceFileMatch(SRCFILE,"earned-premium-config.50.1.html") ) { return "earned-premium-config.50.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"How PolicyCenter Calculates Earned Premium") && Guidewire_FMSourceFileMatch(SRCFILE,"earned-premium-config.50.2.html") ) { return "earned-premium-config.50.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Methods that Calculate Earned Premium") && Guidewire_FMSourceFileMatch(SRCFILE,"earned-premium-config.50.3.html") ) { return "earned-premium-config.50.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"PCF Files that Display Earned Premium") && Guidewire_FMSourceFileMatch(SRCFILE,"earned-premium-config.50.4.html") ) { return "earned-premium-config.50.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring the Team Tab") && Guidewire_FMSourceFileMatch(SRCFILE,"team_config.51.1.html") ) { return "team_config.51.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring the Team Screens Batch Process for Team Statistics") && Guidewire_FMSourceFileMatch(SRCFILE,"team_config.51.2.html") ) { return "team_config.51.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Setting the Window Size for Team Statistics") && Guidewire_FMSourceFileMatch(SRCFILE,"team_config.51.3.html") ) { return "team_config.51.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"How PolicyCenter Calculates Reporting Categories") && Guidewire_FMSourceFileMatch(SRCFILE,"team_config.51.4.html") ) { return "team_config.51.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Setting the Maximum Number of Rows on the Team Screens") && Guidewire_FMSourceFileMatch(SRCFILE,"team_config.51.5.html") ) { return "team_config.51.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Rating Management") && Guidewire_FMSourceFileMatch(SRCFILE,"ratingmgmt_config.52.01.html") ) { return "ratingmgmt_config.52.01.html";}
else if (Guidewire_TopicMatch(TOPIC,"Rating Management Data Model") && Guidewire_FMSourceFileMatch(SRCFILE,"ratingmgmt_config.52.02.html") ) { return "ratingmgmt_config.52.02.html";}
else if (Guidewire_TopicMatch(TOPIC,"Improving Rate Table Performance") && Guidewire_FMSourceFileMatch(SRCFILE,"ratingmgmt_config.52.03.html") ) { return "ratingmgmt_config.52.03.html";}
else if (Guidewire_TopicMatch(TOPIC,"Parameters and Properties for Rating Management") && Guidewire_FMSourceFileMatch(SRCFILE,"ratingmgmt_config.52.04.html") ) { return "ratingmgmt_config.52.04.html";}
else if (Guidewire_TopicMatch(TOPIC,"Third Party Libraries for Rating Management") && Guidewire_FMSourceFileMatch(SRCFILE,"ratingmgmt_config.52.05.html") ) { return "ratingmgmt_config.52.05.html";}
else if (Guidewire_TopicMatch(TOPIC,"User Authority and Permissions for Rating Management") && Guidewire_FMSourceFileMatch(SRCFILE,"ratingmgmt_config.52.06.html") ) { return "ratingmgmt_config.52.06.html";}
else if (Guidewire_TopicMatch(TOPIC,"Custom Physical Tables for Rating Management") && Guidewire_FMSourceFileMatch(SRCFILE,"ratingmgmt_config.52.07.html") ) { return "ratingmgmt_config.52.07.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Value Providers") && Guidewire_FMSourceFileMatch(SRCFILE,"ratingmgmt_config.52.08.html") ) { return "ratingmgmt_config.52.08.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Matching Rule Operations") && Guidewire_FMSourceFileMatch(SRCFILE,"ratingmgmt_config.52.09.html") ) { return "ratingmgmt_config.52.09.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Rate Routines") && Guidewire_FMSourceFileMatch(SRCFILE,"ratingmgmt_config.52.10.html") ) { return "ratingmgmt_config.52.10.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring New Parameters in Parameter Sets") && Guidewire_FMSourceFileMatch(SRCFILE,"ratingmgmt_config.52.11.html") ) { return "ratingmgmt_config.52.11.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Rating Worksheets") && Guidewire_FMSourceFileMatch(SRCFILE,"ratingmgmt_config.52.12.html") ) { return "ratingmgmt_config.52.12.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Impact Testing") && Guidewire_FMSourceFileMatch(SRCFILE,"ratingmgmt_config.52.13.html") ) { return "ratingmgmt_config.52.13.html";}
else if (Guidewire_TopicMatch(TOPIC,"Rating Management Plugins and Interfaces") && Guidewire_FMSourceFileMatch(SRCFILE,"ratingmgmt_config.52.14.html") ) { return "ratingmgmt_config.52.14.html";}
else if (Guidewire_TopicMatch(TOPIC,"Rate Routine Plugin") && Guidewire_FMSourceFileMatch(SRCFILE,"ratingmgmt_config.52.15.html") ) { return "ratingmgmt_config.52.15.html";}
else if (Guidewire_TopicMatch(TOPIC,"Impact Testing Plugin") && Guidewire_FMSourceFileMatch(SRCFILE,"ratingmgmt_config.52.16.html") ) { return "ratingmgmt_config.52.16.html";}
else if (Guidewire_TopicMatch(TOPIC,"Adding Line-specific Cost Methods Using Cost Adapters") && Guidewire_FMSourceFileMatch(SRCFILE,"ratingmgmt_config.52.17.html") ) { return "ratingmgmt_config.52.17.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Reinsurance Management") && Guidewire_FMSourceFileMatch(SRCFILE,"reinsurance_config.53.1.html") ) { return "reinsurance_config.53.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Reinsurance Management Object Model") && Guidewire_FMSourceFileMatch(SRCFILE,"reinsurance_config.53.2.html") ) { return "reinsurance_config.53.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Reinsurance Program Object Model") && Guidewire_FMSourceFileMatch(SRCFILE,"reinsurance_config.53.3.html") ) { return "reinsurance_config.53.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Reinsurance Agreement Object Model") && Guidewire_FMSourceFileMatch(SRCFILE,"reinsurance_config.53.4.html") ) { return "reinsurance_config.53.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Reinsurance Coverage Group Object Model") && Guidewire_FMSourceFileMatch(SRCFILE,"reinsurance_config.53.5.html") ) { return "reinsurance_config.53.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Period Reinsurance Object Model") && Guidewire_FMSourceFileMatch(SRCFILE,"reinsurance_config.53.6.html") ) { return "reinsurance_config.53.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"Reinsurance Management Permissions") && Guidewire_FMSourceFileMatch(SRCFILE,"reinsurance_config.53.7.html") ) { return "reinsurance_config.53.7.html";}
else if (Guidewire_TopicMatch(TOPIC,"Reinsurance Management Underwriting Issues") && Guidewire_FMSourceFileMatch(SRCFILE,"reinsurance_config.53.8.html") ) { return "reinsurance_config.53.8.html";}
else if (Guidewire_TopicMatch(TOPIC,"Implementing Gosu Methods for Reinsurance Management") && Guidewire_FMSourceFileMatch(SRCFILE,"reinsurance_config.53.9.html") ) { return "reinsurance_config.53.9.html";}
else if (Guidewire_TopicMatch(TOPIC,"Handling High Volume Quote Requests") && Guidewire_FMSourceFileMatch(SRCFILE,"quoterequests.54.1.html") ) { return "quoterequests.54.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"High Volume Quotes Implementation Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"quoterequests.54.2.html") ) { return "quoterequests.54.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Quoting Processor Class") && Guidewire_FMSourceFileMatch(SRCFILE,"quoterequests.54.3.html") ) { return "quoterequests.54.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Quoting Data Plugin") && Guidewire_FMSourceFileMatch(SRCFILE,"quoterequests.54.4.html") ) { return "quoterequests.54.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Multicurrency") && Guidewire_FMSourceFileMatch(SRCFILE,"multicurrency_config_pc.55.1.html") ) { return "multicurrency_config_pc.55.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring PolicyCenter for a Single Currency") && Guidewire_FMSourceFileMatch(SRCFILE,"multicurrency_config_pc.55.2.html") ) { return "multicurrency_config_pc.55.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring the Coverage Currency") && Guidewire_FMSourceFileMatch(SRCFILE,"multicurrency_config_pc.55.3.html") ) { return "multicurrency_config_pc.55.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring the Settlement Currency") && Guidewire_FMSourceFileMatch(SRCFILE,"multicurrency_config_pc.55.4.html") ) { return "multicurrency_config_pc.55.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Multicurrency and Reinsurance") && Guidewire_FMSourceFileMatch(SRCFILE,"multicurrency_config_pc.55.5.html") ) { return "multicurrency_config_pc.55.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Multicurrency and Rating") && Guidewire_FMSourceFileMatch(SRCFILE,"multicurrency_config_pc.55.6.html") ) { return "multicurrency_config_pc.55.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Underwriting Authority and Multicurrency") && Guidewire_FMSourceFileMatch(SRCFILE,"multicurrency_config_pc.55.7.html") ) { return "multicurrency_config_pc.55.7.html";}
else if (Guidewire_TopicMatch(TOPIC,"Implementing an Exchange Rate Service") && Guidewire_FMSourceFileMatch(SRCFILE,"multicurrency_config_pc.55.8.html") ) { return "multicurrency_config_pc.55.8.html";}
else if (Guidewire_TopicMatch(TOPIC,"Enabling Multicurrency Integration") && Guidewire_FMSourceFileMatch(SRCFILE,"multicurrency_config_pc.55.9.html") ) { return "multicurrency_config_pc.55.9.html";}
else if (Guidewire_TopicMatch(TOPIC,"Guidewire PolicyCenter Job Configuration") && Guidewire_FMSourceFileMatch(SRCFILE,"p-PolicyCenter_jobs.html") ) { return "p-PolicyCenter_jobs.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Jobs") && Guidewire_FMSourceFileMatch(SRCFILE,"jobs_config.57.1.html") ) { return "jobs_config.57.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Common Ways to Configure Jobs") && Guidewire_FMSourceFileMatch(SRCFILE,"jobs_config.57.2.html") ) { return "jobs_config.57.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Specific Aspects of a Job") && Guidewire_FMSourceFileMatch(SRCFILE,"jobs_config.57.3.html") ) { return "jobs_config.57.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Submissions") && Guidewire_FMSourceFileMatch(SRCFILE,"job-submission-config.58.1.html") ) { return "job-submission-config.58.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Submissions Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"job-submission-config.58.2.html") ) { return "job-submission-config.58.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Submission Integration") && Guidewire_FMSourceFileMatch(SRCFILE,"job-submission-config.58.3.html") ) { return "job-submission-config.58.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Submission Configuration Examples") && Guidewire_FMSourceFileMatch(SRCFILE,"job-submission-config.58.4.html") ) { return "job-submission-config.58.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Issuance") && Guidewire_FMSourceFileMatch(SRCFILE,"job-issuance-config.59.1.html") ) { return "job-issuance-config.59.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Issuance Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"job-issuance-config.59.2.html") ) { return "job-issuance-config.59.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Issuance Integration") && Guidewire_FMSourceFileMatch(SRCFILE,"job-issuance-config.59.3.html") ) { return "job-issuance-config.59.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Renewals") && Guidewire_FMSourceFileMatch(SRCFILE,"job-renewal-config.60.1.html") ) { return "job-renewal-config.60.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Renewals Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"job-renewal-config.60.2.html") ) { return "job-renewal-config.60.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Renewal Integration") && Guidewire_FMSourceFileMatch(SRCFILE,"job-renewal-config.60.3.html") ) { return "job-renewal-config.60.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Batch Process Renewals") && Guidewire_FMSourceFileMatch(SRCFILE,"job-renewal-config.60.4.html") ) { return "job-renewal-config.60.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Explanations in Pre-renewal Directions") && Guidewire_FMSourceFileMatch(SRCFILE,"job-renewal-config.60.5.html") ) { return "job-renewal-config.60.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Cancellations") && Guidewire_FMSourceFileMatch(SRCFILE,"jobs-cancellation-config.61.1.html") ) { return "jobs-cancellation-config.61.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Cancellations Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"jobs-cancellation-config.61.2.html") ) { return "jobs-cancellation-config.61.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Cancellation Integration") && Guidewire_FMSourceFileMatch(SRCFILE,"jobs-cancellation-config.61.3.html") ) { return "jobs-cancellation-config.61.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Calculating the Cancellation Effective Date") && Guidewire_FMSourceFileMatch(SRCFILE,"jobs-cancellation-config.61.4.html") ) { return "jobs-cancellation-config.61.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring the Premium Calculation Method") && Guidewire_FMSourceFileMatch(SRCFILE,"jobs-cancellation-config.61.5.html") ) { return "jobs-cancellation-config.61.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Policy Change") && Guidewire_FMSourceFileMatch(SRCFILE,"job-policychange-config.62.1.html") ) { return "job-policychange-config.62.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Policy Change Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"job-policychange-config.62.2.html") ) { return "job-policychange-config.62.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Change Process Class") && Guidewire_FMSourceFileMatch(SRCFILE,"job-policychange-config.62.3.html") ) { return "job-policychange-config.62.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Policy Change Integration") && Guidewire_FMSourceFileMatch(SRCFILE,"job-policychange-config.62.4.html") ) { return "job-policychange-config.62.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Reinstatement") && Guidewire_FMSourceFileMatch(SRCFILE,"jobs-reinstatement-config.63.1.html") ) { return "jobs-reinstatement-config.63.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Reinstatement Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"jobs-reinstatement-config.63.2.html") ) { return "jobs-reinstatement-config.63.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Reinstatement Integration") && Guidewire_FMSourceFileMatch(SRCFILE,"jobs-reinstatement-config.63.3.html") ) { return "jobs-reinstatement-config.63.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Rewrite") && Guidewire_FMSourceFileMatch(SRCFILE,"job-rewrite-config.64.1.html") ) { return "job-rewrite-config.64.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Rewrite Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"job-rewrite-config.64.2.html") ) { return "job-rewrite-config.64.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Rewrite Integration") && Guidewire_FMSourceFileMatch(SRCFILE,"job-rewrite-config.64.3.html") ) { return "job-rewrite-config.64.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Rewrite New Account") && Guidewire_FMSourceFileMatch(SRCFILE,"jobs-rewrite-new-account-config.65.1.html") ) { return "jobs-rewrite-new-account-config.65.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring the Rewrite New Account Job Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"jobs-rewrite-new-account-config.65.2.html") ) { return "jobs-rewrite-new-account-config.65.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Premium Audit") && Guidewire_FMSourceFileMatch(SRCFILE,"jobs-audit-config.66.1.html") ) { return "jobs-audit-config.66.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Premium Audit Overview") && Guidewire_FMSourceFileMatch(SRCFILE,"jobs-audit-config.66.2.html") ) { return "jobs-audit-config.66.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Premium Audit Integration") && Guidewire_FMSourceFileMatch(SRCFILE,"jobs-audit-config.66.3.html") ) { return "jobs-audit-config.66.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Defining Audit Schedules") && Guidewire_FMSourceFileMatch(SRCFILE,"jobs-audit-config.66.4.html") ) { return "jobs-audit-config.66.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Audit Types") && Guidewire_FMSourceFileMatch(SRCFILE,"jobs-audit-config.66.5.html") ) { return "jobs-audit-config.66.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Side-by-side Quoting") && Guidewire_FMSourceFileMatch(SRCFILE,"jobs-sidebyside-config.67.1.html") ) { return "jobs-sidebyside-config.67.1.html";}
else if (Guidewire_TopicMatch(TOPIC,"Changing the Maximum Number of Versions in Side-by-side Quoting") && Guidewire_FMSourceFileMatch(SRCFILE,"jobs-sidebyside-config.67.2.html") ) { return "jobs-sidebyside-config.67.2.html";}
else if (Guidewire_TopicMatch(TOPIC,"Marking a Job as Side-by-side") && Guidewire_FMSourceFileMatch(SRCFILE,"jobs-sidebyside-config.67.3.html") ) { return "jobs-sidebyside-config.67.3.html";}
else if (Guidewire_TopicMatch(TOPIC,"Side-by-side Quoting Object Model") && Guidewire_FMSourceFileMatch(SRCFILE,"jobs-sidebyside-config.67.4.html") ) { return "jobs-sidebyside-config.67.4.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring the Side-by-side Quoting Screen") && Guidewire_FMSourceFileMatch(SRCFILE,"jobs-sidebyside-config.67.5.html") ) { return "jobs-sidebyside-config.67.5.html";}
else if (Guidewire_TopicMatch(TOPIC,"Copying Base Data for Side-by-side Quoting") && Guidewire_FMSourceFileMatch(SRCFILE,"jobs-sidebyside-config.67.6.html") ) { return "jobs-sidebyside-config.67.6.html";}
else if (Guidewire_TopicMatch(TOPIC,"Excluding Side-by-side Data from Base Data") && Guidewire_FMSourceFileMatch(SRCFILE,"jobs-sidebyside-config.67.7.html") ) { return "jobs-sidebyside-config.67.7.html";}
else if (Guidewire_TopicMatch(TOPIC,"Configuring Quote All to Ignore Validation Warnings") && Guidewire_FMSourceFileMatch(SRCFILE,"jobs-sidebyside-config.67.8.html") ) { return "jobs-sidebyside-config.67.8.html";}
else { return("../wwhelp/topic_cannot_be_found.html"); } }

function  WWHBookData_MatchTopic(P)
{
var C=null;P=decodeURIComponent(decodeURIComponent(escape(P)));//workaround epub bug with UTF8 processing!
if(P=="Field_Validator_Extensions")C="fieldvalidators.26.1.html";
if (C) { return C } else { return GUIDEWIRE_TOPIC_TO_FILE(P,Guidewire_ExtractSrcFromURL());}
}
