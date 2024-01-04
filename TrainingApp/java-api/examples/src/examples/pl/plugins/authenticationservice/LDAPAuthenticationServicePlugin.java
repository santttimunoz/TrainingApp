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
import org.apache.commons.lang.StringUtils;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.InitialDirContext;
import javax.security.auth.login.FailedLoginException;
import javax.security.auth.login.LoginException;
import java.util.Hashtable;
import java.util.Map;

/**
 * Sample authentication service to be used with any LDAP server that supports simple authentication.
 */
@Component(configurationPolicy = ConfigurationPolicy.require)
public class LDAPAuthenticationServicePlugin implements AuthenticationServicePlugin {
  private static final String SERVER_NAME_PROPERTY = "serverName";
  private static final String SERVER_PORT_PROPERTY = "serverPort";
  private static final String DOMAIN_NAME_PROPERTY = "domainName";

  AuthenticationServicePluginCallbackHandler _handler = null;

  private String _serverName;
  private String _serverPort;
  private String _domainName;

  @Activate
  void start(Map<?, ?> properties) {
    _serverName = (String) properties.get(SERVER_NAME_PROPERTY);
    _serverPort = (String) properties.get(SERVER_PORT_PROPERTY);
    _domainName = (String) properties.get(DOMAIN_NAME_PROPERTY);
  }

  /**
   * Authenticates the user specified in the source using clear text simple LDAP authentication.
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

    Hashtable<String, String> env = new Hashtable<>();

    env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
    env.put(Context.PROVIDER_URL, "LDAP://" + _serverName + ":" + _serverPort);
    env.put(Context.SECURITY_AUTHENTICATION, "simple");
    String userName = uNameSource.getUsername();
    if (StringUtils.isNotBlank(_domainName)) {
      userName = _domainName + "\\" + userName;
    }

    env.put(Context.SECURITY_PRINCIPAL, userName);
    env.put(Context.SECURITY_CREDENTIALS, uNameSource.getPassword());

    try {
      // Try to login.
      new InitialDirContext(env);
      // Here would could get the result to the above and modify the user in some way if we needed to
    } catch (NamingException e) {
      throw new LoginException(e.getMessage());
    }

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
