package trainingapp.base
uses gw.plugin.messaging.MessageTransport

class DefaultPrintToConsoleTransport implements MessageTransport {

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

/*  This implementation simply prints the message payload to the console.
*/
 override function send(aMessage : Message, transformedPayload : String) {
    
    print ("Executing DefaultPrintToConsoleTransport send() method")
    print ("Payload for message " + aMessage.ID + ": " + transformedPayload)

  }

}
