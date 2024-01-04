package acme.ta.messaging.bank
uses gw.plugin.messaging.MessageTransport

class BankAccountVerificationTransport implements MessageTransport {
  construct() {
  }

  override function resume() {
    //## todo: Implement me
  }

  override function setDestinationID(p0: int) {
    //## todo: Implement me
  }

  override function shutdown() {
    //## todo: Implement me
  }

  override function suspend() {
    //## todo: Implement me
  }

  /*  Back account payloads are simply "sent" to the console (via print statements).
      For educational purposes, the method also identifies if the payload was transformed
      in the beforeSend method or not. Finally, all messages are automatically acknowledged
      unless for some reason the routing number is null. If the routing number starts with
      "000", the bank account is marked as invalid. Otherwise, it is verified.
  */
 override function send(aMessage: Message, transformedPayload: String) {
    var output : String
    output =  "\n*** Stage 3(b) -- Sending the message *** "
    output += "\n    Transport plugin: BankAccountVerificationTransport -- send()"
    if (aMessage.Payload == transformedPayload) {
      output += "\n    The Request Plugin did NOT transform the payload"
    } else {
      output += "\n    The Request Plugin transformed the payload"
    }
    // send payload to console
    output +=  String.format("    Sending payload to console for Message ID %s as: \n %s \n", {aMessage.ID, transformedPayload})
    // Synchronously acknowledging message that is sent to the console
    output += "\n*** Stage 4 -- Message acknowledgement *** "
    output += "\n    Transport plugin: BankAccountVerificationTransport -- send()"
    var isVerified = !((aMessage.MessageRoot as BankAccount).RoutingNumber.startsWith("000"))
    if (isVerified == null) {   // normally would throw an exception and manage the message retries
      aMessage.reportError()   //  a problem occurred with the message
      output += "\n    Error: No response received for message " + aMessage.ID
    } else {
      // Acknowledge message synchronously and update bank account as appropriate.
      if (isVerified != null) {
          aMessage.reportAck()
        output += "\n    Acknowledged Message ID " + aMessage.ID + " synchronously"
          if (isVerified) {
            (aMessage.MessageRoot as BankAccount).IsVerified = VerificationStatus.TC_VERIFIED
          output += "\n    Verification status for IsVerified field is Verified"
          } else {
            (aMessage.MessageRoot as BankAccount).IsVerified = VerificationStatus.TC_INVALID
          }
      }
    }
    print(output)
  }
}


