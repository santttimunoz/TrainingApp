package examples.pl.plugins.messaging;

import gw.plugin.PluginCallbackHandler;
import aQute.bnd.annotation.component.Component;
import gw.pl.messaging.entity.Message;
import gw.plugin.messaging.MessageFinder;
import gw.plugin.messaging.MessageReply;

/**
 * Sample implementation of the MessageReply plugin interface that shows
 * how to acknowledge a message from an asynchronous reply.  Registers
 * a listener to be called whenever a message is posted to
 * a simulated asynchronous queue.  When the listener is called back,
 * uses the PluginCallbackHandler and MessageFinder instances to
 * look up and acknowledge the message.
 */
@Component
public class MessageReplyImpl implements MessageReply {

  private PluginCallbackHandler _pluginCallbackHandler;
  private MessageFinder _messageFinder;

  @Override
  public void initTools(PluginCallbackHandler pluginCallbackHandler, MessageFinder messageFinder) {
    _pluginCallbackHandler = pluginCallbackHandler;
    _messageFinder = messageFinder;
  }

  @Override
  public void shutdown() {
  }

  @Override
  public void suspend() {
  }

  @Override
  public void resume() {
    // Start listening on the queue.
    QueueSimulator.getInstance().listen(new MyQueueListener());
  }

  @Override
  public void setDestinationID(int destinationID) {
  }


  /**
   * Implementation of QueueListener that listens for messages to be posted
   * to the queue and acks them.
   */
  private class MyQueueListener implements QueueListener {

    /**
     * Called when a message is added to the queue.  Looks up the message
     * and acks it using the PluginCallbackHandler instance supplied when the
     * plugin was initialized.
     */
    @Override
    public void responseReceived(final long messageID) {
      PluginCallbackHandler.Block block = new PluginCallbackHandler.Block() {
        @Override
        public void run() throws Throwable {
         // LoggerCategory.MESSAGING.info("Reporting ack on message (" + messageID + ")");
          Message message = _messageFinder.findById(messageID);
          message.reportAck();
        }
      };

      try {
        _pluginCallbackHandler.execute(block);
      } catch (Throwable throwable) {
        throwable.printStackTrace();  // In the real world, we'd log this at least.
      }
    }
  }
}
