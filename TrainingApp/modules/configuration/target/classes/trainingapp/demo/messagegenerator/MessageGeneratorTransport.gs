package trainingapp.demo.messagegenerator
uses gw.plugin.messaging.MessageTransport
uses gw.api.util.RetryableException

class MessageGeneratorTransport implements MessageTransport {

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

    print ("Message Generator - Beginning send() for message " + (aMessage.MessageRoot as MessageGenerator).Name)

    if ((aMessage.MessageRoot as MessageGenerator).ThrowExceptionInTransport) {
      var demoException : RetryableException
      throw demoException
    }
    
    print ("Message Generator - Sending message:      " + transformedPayload)
    if ((aMessage.MessageRoot as MessageGenerator).AutoAckMessage) {
      aMessage.reportAck()
      print ("Message Generator - Message acknowledged: " + transformedPayload) 
    }
    
  }

}

