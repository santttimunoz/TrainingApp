package trainingapp.demo.messagegenerator
uses gw.plugin.messaging.MessageRequest
uses gw.api.util.RetryableException

class MessageGeneratorRequest implements MessageRequest {

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

  override function afterSend(p0 : Message) {
    //## todo: Implement me
  }

  override function beforeSend(aMessage : Message) : String {
    // This function does not transform the payload in any way.
    // It exists only to throw an exception during the request plugin, when necessary.

    print ("Message Generator - Beginning beforeSend() for message " + (aMessage.MessageRoot as MessageGenerator).Name)

    if ((aMessage.MessageRoot as MessageGenerator).ThrowExceptionInRequest) {
      var demoException : RetryableException
      throw demoException
    }

    if (aMessage.SenderRefID == null) {
      aMessage.SenderRefID = (aMessage.MessageRoot as MessageGenerator).Name
      // append retry count to SenderRefID if retry count is greater than 0
      if (aMessage.RetryCount > 0) {
        aMessage.SenderRefID = aMessage.SenderRefID + "-" + aMessage.RetryCount
      }
    }
    
    return aMessage.Payload
  }

}
