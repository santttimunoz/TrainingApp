package trainingapp.demo.safeordering
uses gw.plugin.messaging.MessageTransport

class SafeOrderingDemoTransport implements MessageTransport {

  construct() {
  }


  override function resume() {
    //## todo: Implement me
  }

  override function setDestinationID(p0 : int) {
    //## todo: Implement me
  }

  override function shutdown() {
    //## todo: Implement me
  }

  override function suspend() {
    //## todo: Implement me
  }

  override function send(aMessage : Message, transformedPayload : String) {
      
    print ("Safe Order Demo - Sending message:      " + transformedPayload)
    if (aMessage.EventName == "SafeOrderingDemoWithAck") {
      aMessage.reportAck()
      print ("Safe Order Demo - Message acknowledged: " + transformedPayload)   
    }
  }

}

