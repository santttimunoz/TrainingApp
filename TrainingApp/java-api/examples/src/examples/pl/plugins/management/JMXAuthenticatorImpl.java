package examples.pl.plugins.management;

import gw.pl.logging.LoggerFactory;
import gw.plugin.management.ManagementAuthorizationCallbackHandler;

import javax.management.remote.JMXAuthenticator;
import javax.security.auth.Subject;

public class JMXAuthenticatorImpl implements JMXAuthenticator {
  private ManagementAuthorizationCallbackHandler _callbackHandler;

  public JMXAuthenticatorImpl(ManagementAuthorizationCallbackHandler callbackHandler) {
    _callbackHandler = callbackHandler;
  }

  @Override
  public Subject authenticate(Object o) throws SecurityException {
    if (o instanceof String[]) {
      String username = ((String[]) o)[0];
      String password = ((String[]) o)[1];

      if (_callbackHandler.hasManagementPermission(username, password)) {
        return new Subject();
      } else {
        throw new SecurityException("Invalid credentials");
      }
    }

    // Log the error and return null if it's not an object we can interpret
    LoggerFactory.getLogger(getClass()).error("JMX Authenticator was passed an object of type " + o.getClass().getName() + " rather than a String[]");
    return null;
  }
}
