package examples.pl.plugins.messaging;

import gw.pl.messaging.entity.Message;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * Simulates an asynchronous message queue for testing the sample
 * {@link MessageTransportImpl} and {@link MessageReplyImpl} plugins.
 * The {@link MessageReplyImpl} instance registers a listener with the
 * queue using {@link #listen(QueueListener)} which is invoked when a
 * message is added to the queue.  QueueSimulator maintains its own
 * dispatch thread which is used to invoke the listener, accurately
 * simulating a true asynchronous message queue.
 *
 * @author jseybold
 */
public class QueueSimulator {
  private static QueueSimulator _instance;
  private final LinkedBlockingQueue<Message> _messages;
  private QueueListener _listener;
  private boolean _shutdown;

  /**
   * Returns the singleton instance of the QueueSimulator
   */
  public static synchronized QueueSimulator getInstance() {
    if (_instance == null) {
      _instance = new QueueSimulator();
    }
    return _instance;
  }

  private QueueSimulator() {
    _messages = new LinkedBlockingQueue<>();
    _shutdown = false;
    new Worker().start();

  }

  /**
   * Add a message to the queue.  The {@link QueueListener} registered
   * with the queue will be notified asynchronously on the QueueSimulator's thread.
   */
  public void put(Message message) throws InterruptedException {
    _messages.put(message);
  }

  /**
   * Register a {@link QueueListener} for notifications when a message
   * is added to the queue.
   */
  public void listen(QueueListener listener) {
    _listener = listener;
  }

  /**
   * Dispatch thread for the QueueSimulator that waits until messages
   * are added to the queue.  When notified, it empties the queue,
   * calling the listener's responseReceived() method for each message.
   */
  private class Worker extends Thread {
    @Override
    public void run() {
      while (!_shutdown) {
        Message message = null;
        try {
          message = _messages.take();
        } catch (InterruptedException e) {
          System.err.println("Worker thread interrupted. Shutting down...");
          _shutdown = true;
        }
        if (message != null) {
          // Run listener inside the synch block so that listener's work
          // is done when waitUntilEmpty() returns.  You wouldn't do this for real...
          _listener.responseReceived(message.getID().getValue());
          _instance.notifyAll();
        }
      }
    }
  }
}
