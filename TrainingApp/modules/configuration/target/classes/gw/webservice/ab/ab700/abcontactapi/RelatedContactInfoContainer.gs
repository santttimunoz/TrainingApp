package gw.webservice.ab.ab700.abcontactapi

@Deprecated("Since 8.0.0.  Please use the ab800 package.")
@Export
@gw.xml.ws.annotation.WsiExportable( "http://guidewire.com/ab/ws/gw/webservice/ab/ab700/abcontactapi/RelatedContactInfoContainer" )
final class RelatedContactInfoContainer {
  public var SourceRelatedContacts : ABContactAPIRelatedContact[]
  public var TargetRelatedContacts : ABContactAPIRelatedContact[]
}
