package gw.webservice.ab.ab801.abcontactapi

@Export
@gw.xml.ws.annotation.WsiExportable( "http://guidewire.com/ab/ws/gw/webservice/ab/ab801/abcontactapi/RelatedContactInfoContainer" )
final class RelatedContactInfoContainer {
  public var SourceRelatedContacts : ABContactAPIRelatedContact[]
  public var TargetRelatedContacts : ABContactAPIRelatedContact[]
}
