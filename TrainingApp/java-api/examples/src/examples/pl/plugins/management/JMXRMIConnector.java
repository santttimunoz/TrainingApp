package examples.pl.plugins.management;

import gw.plugin.management.ManagementAuthorizationCallbackHandler;

import javax.management.MBeanServer;
import javax.management.remote.JMXConnectorServer;
import javax.management.remote.JMXServiceURL;
import javax.management.remote.rmi.RMIConnectorServer;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

/**
 * Exposes given {@link MBeanServer} via RMI.
 */
public class JMXRMIConnector {
  private Registry _rmiRegistry;
  private RMIConnectorServer _rmiServer;

  private int _rmiPort;
  private ManagementAuthorizationCallbackHandler _callbackHandler;

  public JMXRMIConnector(int rmiPort, ManagementAuthorizationCallbackHandler callbackHandler) {
    _rmiPort = rmiPort;
    _callbackHandler = callbackHandler;
  }

  public void registerAdapter(MBeanServer mBeanServer) throws Exception {
    _rmiRegistry = LocateRegistry.createRegistry(_rmiPort);
    String svc ="service:jmx:rmi://localhost:" + _rmiPort + "/jndi/rmi://localhost:" + _rmiPort + "/jrmp";

    JMXServiceURL url = new JMXServiceURL(svc);
    Map<String, Object> environment = new HashMap<>();
    environment.put(JMXConnectorServer.AUTHENTICATOR, new JMXAuthenticatorImpl(_callbackHandler));

    _rmiServer = new RMIConnectorServer(url, environment, mBeanServer);
    _rmiServer.start();
  }

  public void unregisterAdapter(MBeanServer mBeanServer) throws Exception {
    // Shut down the RMI Connector
    try {
      if (_rmiServer != null) {
        _rmiServer.stop();
        _rmiServer = null;
      }
    } finally {
      if (_rmiRegistry != null) {
        UnicastRemoteObject.unexportObject(_rmiRegistry, true);
        _rmiRegistry = null;
      }
    }
  }
}
