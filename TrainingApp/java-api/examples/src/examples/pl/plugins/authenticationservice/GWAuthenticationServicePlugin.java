/*
 * Guidewire ClaimCenter
 *
 * Copyright 2003 Guidewire Software, Inc. All Rights Reserved.
 * Guidewire Software, Guidewire ClaimCenter, and the Guidewire logo are trademarks of Guidewire Software, Inc.
 */

package examples.pl.plugins.authenticationservice;

import gw.plugin.security.AuthenticationServicePluginCallbackHandler;
import gw.plugin.security.AuthenticationSource;
import gw.plugin.security.CredentialVerificationResult;
import gw.plugin.security.LockedCredentialException;
import gw.plugin.security.MustWaitToRetryException;
import gw.plugin.security.UserNamePasswordAuthenticationSource;

import aQute.bnd.annotation.component.Component;
import gw.plugin.security.AuthenticationServicePlugin;

import javax.security.auth.login.FailedLoginException;
import javax.security.auth.login.LoginException;

/**
 * Sample authentication service that uses credentials managed with the Guidewire application.
 */
@Component
public class GWAuthenticationServicePlugin implements AuthenticationServicePlugin {

  AuthenticationServicePluginCallbackHandler _handler = null;

  @Override
  public String authenticate(AuthenticationSource source) throws LoginException {
    if (!(source instanceof UserNamePasswordAuthenticationSource)) {
      throw new IllegalArgumentException("Authentication source type " + source.getClass().getName() + " is not known to this plugin");
    }

    assert _handler != null : "Callback handler not set";

    UserNamePasswordAuthenticationSource uNameSource = (UserNamePasswordAuthenticationSource) source;
    String username = uNameSource.getUsername();
    String userPublicId = _handler.findUser(username);
    if (userPublicId == null) {
      throw new FailedLoginException("Bad user name " + username);
    }

    CredentialVerificationResult returnCode = _handler.verifyInternalCredential(userPublicId, uNameSource.getPassword());
    if (returnCode == CredentialVerificationResult.BAD_USER_ID) {
      throw new FailedLoginException("Bad user name " + username);
    } else if (returnCode == CredentialVerificationResult.WAIT_TO_RETRY) {
      throw new MustWaitToRetryException("Still within the login retry delay period");
    } else if (returnCode == CredentialVerificationResult.CREDENTIAL_LOCKED) {
      throw new LockedCredentialException("The specified account has been locked");
    } else if (returnCode == CredentialVerificationResult.PASSWORD_MISMATCH) {
      throw new FailedLoginException("Bad password for user " + username);
    }

    return userPublicId;
  }

  @Override
  public void setCallback(AuthenticationServicePluginCallbackHandler callbackHandler) {
    _handler = callbackHandler;
  }
}
