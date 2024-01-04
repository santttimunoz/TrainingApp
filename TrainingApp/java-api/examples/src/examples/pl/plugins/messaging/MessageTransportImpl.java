package examples.pl.plugins.messaging;

import gw.plugin.messaging.InitializationException;
import aQute.bnd.annotation.component.Component;
import gw.pl.messaging.entity.Message;
import gw.plugin.messaging.MessageTransport;

@Component
public class MessageTransportImpl implements MessageTransport {

  @Override
  public void send(Message message, String transformedPayload) throws Exception {
    //LoggerCategory.MESSAGING.info("Received (" + message.getID() + "): " + transformedPayload);
    QueueSimulator.getInstance().put(message);
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
