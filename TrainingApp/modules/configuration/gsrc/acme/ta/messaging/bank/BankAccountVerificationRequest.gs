package acme.ta.messaging.bank
uses gw.plugin.messaging.MessageRequest
uses gw.pl.messaging.entity.Message
uses gw.api.util.DateUtil
class BankAccountVerificationRequest implements MessageRequest {

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

/*  For legal reasons, the payload for savings accounts must have an additional
    name/value pair identifying how "stale" the account information is. The template
    that generates the payload adds an "<@@ageOfMessageInSeconds@@>" placeholder if
    the account type is Savings. The beforeSend() method calculates the age of
    the message in seconds (by comparing the time the message was created to the
    current time) and then inserts this into the payload if the payload contains the
    "<@@ageOfMessageInSeconds@@>" placeholder.
*/
  override function beforeSend(aMessage : Message) : String {
    var output : String
    output =  "\n*** Stage 3(a) -- Transforming the message payload with late binding ***"
    output += "\n    Request plugin: BankAccountVerificationRequest -- beforeSend()"
    output += "\n    Message ID is " + aMessage.ID
    var payload = aMessage.Payload
    var ageInSeconds = DateUtil.secondsSince(aMessage.CreationTime) as java.lang.CharSequence
    var token = "<@@ageOfMessageInSeconds@@>"
    if (payload.containsIgnoreCase(token)) {
      payload = payload.replace(token, ageInSeconds )
      output += String.format("\n    Replaced token %s  with value %s" , {token, ageInSeconds})
    }
    output += "\n    Returning payload string"
    print(output)
    return payload    // beforeSend() must return a payload, whether it was transformed or not
  }
}
