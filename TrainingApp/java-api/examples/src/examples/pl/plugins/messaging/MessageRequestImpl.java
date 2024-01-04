package examples.pl.plugins.messaging;

import gw.plugin.messaging.InitializationException;
import aQute.bnd.annotation.component.Component;
import gw.pl.messaging.entity.Message;
import gw.plugin.messaging.MessageRequest;

@Component
public class MessageRequestImpl implements MessageRequest {

  @Override
  public String beforeSend(Message message) throws Exception {
    return message.getPayload();
  }

  @Override
  public void afterSend(Message message) throws Exception {
  }

  @Override
  public void shutdown() {
  }

  @Override
  public void suspend() {
  }

  @Override
  public void resume() throws InitializationException {
  }

  @Override
  public void setDestinationID(int destinationID) {
  }
}
