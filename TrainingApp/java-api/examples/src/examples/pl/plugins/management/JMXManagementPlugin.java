package examples.pl.plugins.management;

import aQute.bnd.annotation.component.Component;
import aQute.bnd.annotation.component.ConfigurationPolicy;
import gw.plugin.management.GWMBean;
import gw.plugin.management.ManagementAuthorizationCallbackHandler;
import gw.plugin.management.Notification;
import gw.plugin.management.NotificationSenderMarker;
import aQute.bnd.annotation.component.Activate;
import gw.pl.logging.LoggerCategory;
import gw.plugin.management.ManagementPlugin;

import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/**
 * Example management plugin using JMX, supports exposing platform JMX server via RMI connector instantiated
 * and started by the plugin.
 * The RMI URL is "service:jmx:rmi://[host]:[_rmiPort]/jndi/rmi://[host]:[_rmiPort]/jrmp"
 * or "service:jmx:rmi:///jndi/rmi://[host]:[_rmiPort]/jrmp" (both URLs are equivalent)
 *
 * If "rmiPort" port parameter is not specified, default value 1099 will be used.
 * If "rmiPort" is set to negative value the RMI connector will not be started. Note that you can still configure
 * remote monitoring via "com.sun.management.jmxremote.port", "com.sun.management.jmxremote.authenticate" and
 * other JVM specific properties.
 *
 * RMI connector does not work on JBoss 6.1.1, see https://issues.jboss.org/browse/AS7-2755, so for JBoss 6.1.1
 * set "rmiPort" to negative value to disable RMI connector.
 */
@Component(configurationPolicy = ConfigurationPolicy.require)
public class JMXManagementPlugin implements ManagementPlugin {
  protected GWMBeanWrapper _notificationSender;
  protected int _rmiPort = 1099; // Default to 1099
  protected JMXRMIConnector _connector;
  protected ManagementAuthorizationCallbackHandler _callbackHandler;

  @Activate
  void start(Map<?, ?> properties) {
    if (properties.containsKey("rmiPort")) {
      _rmiPort = Integer.parseInt((String) properties.get("rmiPort"));
    }

    if (_rmiPort >= 0) {
      LoggerCategory.PLUGIN.info("Starting RMI connector on port " + _rmiPort);
    }
  }

  @Override
  public void start() {
    startConnectors();
  }

  @Override
  public void stop() {
    stopConnectors();
  }

  @Override
  public void setAuthorizationCallbackHandler(ManagementAuthorizationCallbackHandler handler) {
    _callbackHandler = handler;
  }

  @Override
  public void registerBean(GWMBean bean) {
    ArrayList<MBeanServer> mBeanServers = MBeanServerFactory.findMBeanServer(null);
    for (MBeanServer mBeanServer : mBeanServers) {
      try {
        GWMBeanWrapper beanWrapper = new GWMBeanWrapper(bean);
        if (bean instanceof NotificationSenderMarker) {
          _notificationSender = beanWrapper;
        }
        mBeanServer.registerMBean(beanWrapper, ObjectName.getInstance(bean.getBeanName()));
      } catch (Exception e) {
        LoggerCategory.PLUGIN.error("Error registering MBean " + bean.getBeanName()  + " on port " + _rmiPort, e);
      }
    }
  }

  @Override
  public void unregisterBean(GWMBean bean) {
    ArrayList<MBeanServer> mBeanServers = MBeanServerFactory.findMBeanServer(null);
    for (MBeanServer mBeanServer : mBeanServers) {
      try {
        mBeanServer.unregisterMBean(ObjectName.getInstance(bean.getBeanName()));
      } catch (Exception e) {
        LoggerCategory.PLUGIN.error("Error unregistering MBean " + bean.getBeanName() + " on port " + _rmiPort, e);
      }
    }
  }

  @Override
  public void unregisterBeanByNamePrefix(String pattern) {
    ArrayList<MBeanServer> mBeanServers = MBeanServerFactory.findMBeanServer(null);
    for (MBeanServer mBeanServer : mBeanServers) {
      try {
        Set<ObjectName> names = mBeanServer.queryNames(new ObjectName(pattern + "*"), null);
        for (ObjectName name : names) {
          mBeanServer.unregisterMBean(name);
        }
      } catch (Exception e) {
        LoggerCategory.PLUGIN.error("Error unregistering beans with pattern " + pattern + "*" + " on port " + _rmiPort, e);
      }
    }
  }

  @Override
  public void sendNotification(Notification notification) {
    if (_notificationSender != null) {
      _notificationSender.sendNotification(new javax.management.Notification(notification.getType(), notification.getSource(), notification.getSequenceNumber(), notification.getMessage()));
    }
  }

  /**
   * Subclasser hook for starting additional connectors.  By default this just starts the RMI connector, but it
   * can be overridden to do something else instead or in addition to that.
   */
  protected void startConnectors() {
    startRMIConnector();
  }

  /**
   * Subclasser hook for stopping additional connectors.  By default this just stops the RMI connector, but it
   * can be overridden to do something else instead or in addition to that.  This ought to stop anything started
   * in the startConnectors method.
   */
  protected void stopConnectors() {
    stopRMIConnector();
  }

  protected void startRMIConnector() {
    if (_rmiPort < 0) {
      return;
    }
    try {
      _connector = new JMXRMIConnector(_rmiPort, _callbackHandler);
      _connector.registerAdapter(ManagementFactory.getPlatformMBeanServer());
    } catch (Exception e) {
      throw new RuntimeException("Error registering RMI connector on port " + _rmiPort, e);
    }
  }

  protected void stopRMIConnector() {
    if (_rmiPort < 0) {
      return;
    }
    try {
      _connector.unregisterAdapter(ManagementFactory.getPlatformMBeanServer());
    } catch (Exception e) {
      throw new RuntimeException("Error unregistering RMI connector on port " + _rmiPort, e);
    }
  }
}
