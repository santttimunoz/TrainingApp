package examples.pl.plugins.integration.inbound.fileadapter;

import aQute.bnd.annotation.component.Activate;
import aQute.bnd.annotation.component.Component;
import gw.plugin.integration.inbound.InboundIntegrationHandlerPlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(provide = SampleLineProcessor.class)
public class SampleLineProcessor implements InboundIntegrationHandlerPlugin {
  private final static Logger log = LoggerFactory.getLogger(SampleLineProcessor.class);

  @Activate
  public void init() {
    log.info("SampleLineProcessor init()");
  }

  @Override
  public void process(final Object line) {
    log.info("{}.processLine: {}", SampleLineProcessor.class.getName(), line);
  }

}
