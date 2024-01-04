package examples.pl.plugins.integration.inbound.jmsadapter;

import aQute.bnd.annotation.component.Component;
import gw.plugin.integration.inbound.InboundIntegrationHandlerPlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(provide = SampleJMSMessageListener.class)
public class SampleJMSMessageListener implements InboundIntegrationHandlerPlugin {
  private final static Logger log = LoggerFactory.getLogger(SampleJMSMessageListener.class);

  /* (non-Javadoc)
   * @see javax.jms.MessageListener#onMessage(javax.jms.Message)
   */
  @Override
  public void process(Object message) {
    log.info("{}.onMessage: {}", this, message);
  }

}
