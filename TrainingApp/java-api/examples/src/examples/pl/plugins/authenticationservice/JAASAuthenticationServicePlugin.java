/*
 * Guidewire ClaimCenter
 *
 * Copyright 2003 Guidewire Software, Inc. All Rights Reserved.
 * Guidewire Software, Guidewire ClaimCenter, and the Guidewire logo are trademarks of Guidewire Software, Inc.
 */

package examples.pl.plugins.authenticationservice;

import gw.plugin.security.AuthenticationServicePluginCallbackHandler;
import gw.plugin.security.AuthenticationSource;
import gw.plugin.security.UserNamePasswordAuthenticationSource;
import aQute.bnd.annotation.component.Activate;
import aQute.bnd.annotation.component.Component;
import aQute.bnd.annotation.component.ConfigurationPolicy;
import gw.plugin.security.AuthenticationServicePlugin;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.security.auth.login.FailedLoginException;
import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;
import java.io.IOException;
import java.util.Map;

/**
 * Sample authentication service to be used with WebSEAL.
 */
@Component(configurationPolicy = ConfigurationPolicy.require)
public class JAASAuthenticationServicePlugin implements AuthenticationServicePlugin {
  private static final String JAAS_CONTEXT_NAME_PROPERTY = "context";

  AuthenticationServicePluginCallbackHandler _handler = null;
  private String _jaasContextName;

  @Activate
  void start(Map<?, ?> properties) {
    _jaasContextName = (String) properties.get(JAAS_CONTEXT_NAME_PROPERTY);
  }

  /**
   * Simple user name and password callback handler.
   */
  private static class JaasCallbackHandler implements CallbackHandler {
    private UserNamePasswordAuthenticationSource _source;

    public JaasCallbackHandler(UserNamePasswordAuthenticationSource source) {
      _source = source;
    }

    @Override
    public void handle(Callback[] callbacks)
            throws IOException, UnsupportedCallbackException {
      for (Callback callback : callbacks) {
        if (callback instanceof NameCallback) {
          ((NameCallback) callback).setName(_source.getUsername());
        } else if (callback instanceof PasswordCallback) {
          ((PasswordCallback) callback).setPassword(_source.getPassword().toCharArray());
        } else {
          throw new UnsupportedCallbackException(callback);
        }
      }
    }
  }

  /**
   * Authenticates the user specified in the source in the configured JAAS context.
   *
   * @param source the source to authenticate
   * @return the public id of the user that authenticated
   * @throws javax.security.auth.login.LoginException if the user does not authenticate or if the user is not found in our system.
   */
  @Override
  public String authenticate(AuthenticationSource source) throws LoginException {
    if (!(source instanceof UserNamePasswordAuthenticationSource)) {
      throw new IllegalArgumentException("Authentication source type " + source.getClass().getName() + " is not known to this plugin");
    }

    assert _handler != null : "Callback handler not set";

    UserNamePasswordAuthenticationSource uNameSource = (UserNamePasswordAuthenticationSource) source;
    LoginContext context;

    // Setup the JAAS context
    context = new LoginContext(_jaasContextName, new JaasCallbackHandler(uNameSource));

    // Authenticate the user.
    context.login();

    String username = uNameSource.getUsername();
    String userPublicId = _handler.findUser(username);
    if (userPublicId == null) {
      throw new FailedLoginException("Bad user name " + username);
    }

    return userPublicId;
  }

  @Override
  public void setCallback(AuthenticationServicePluginCallbackHandler callbackHandler) {
    _handler = callbackHandler;
  }
}
