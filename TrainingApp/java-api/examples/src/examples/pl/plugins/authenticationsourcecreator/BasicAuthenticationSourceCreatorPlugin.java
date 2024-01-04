/*
 * Guidewire ClaimCenter
 *
 * Copyright 2003 Guidewire Software, Inc. All Rights Reserved.
 * Guidewire Software, Guidewire ClaimCenter, and the Guidewire logo are trademarks of Guidewire Software, Inc.
 */

package examples.pl.plugins.authenticationsourcecreator;

import gw.plugin.security.AuthenticationSource;
import gw.plugin.security.InvalidAuthenticationSourceData;
import gw.plugin.security.UserNamePasswordAuthenticationSource;
import aQute.bnd.annotation.component.Component;
import gw.plugin.security.AuthenticationSourceCreatorPlugin;
import gw.util.StreamUtil;
import org.apache.commons.codec.binary.Base64;

import javax.servlet.http.HttpServletRequest;

/**
 * Sample authentication source creator.
 */
@Component
public class BasicAuthenticationSourceCreatorPlugin implements AuthenticationSourceCreatorPlugin {

  @Override
  public AuthenticationSource createSourceFromHTTPRequest(HttpServletRequest request) throws InvalidAuthenticationSourceData {
    AuthenticationSource source;
    String authString = request.getHeader("Authorization");
    if (authString != null) {
      byte[] bytes = StreamUtil.toBytes(authString.substring(6));
      String fullAuth = new String(Base64.decodeBase64(bytes));
      int colonIndex = fullAuth.indexOf(':');
      if (colonIndex == -1) {
        throw new InvalidAuthenticationSourceData("Invalid authorization header format");
      }
      String userName = fullAuth.substring(0, colonIndex);
      String password = fullAuth.substring(colonIndex + 1);
      if (userName.length() == 0) {
        throw new InvalidAuthenticationSourceData("Could not find username");
      }
      if (password.length() == 0) {
        throw new InvalidAuthenticationSourceData("Could not find password");
      }
      source = new UserNamePasswordAuthenticationSource(userName, password);
      return source;
    } else {
      throw new InvalidAuthenticationSourceData("Could not find authorization header");
    }
  }
}
