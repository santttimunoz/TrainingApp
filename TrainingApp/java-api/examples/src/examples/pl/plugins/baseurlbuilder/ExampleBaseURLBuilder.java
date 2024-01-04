/**
 * Guidewire Software
 *
 * Creator information:
 * User: tmorris
 * Date: Jul 14, 2005 12:16:37 PM
 *
 */
package examples.pl.plugins.baseurlbuilder;

import aQute.bnd.annotation.component.Component;
import gw.plugin.baseurlbuilder.IBaseURLBuilder;

import javax.servlet.http.HttpServletRequest;

/**
 * Example URL builder, for testing only. Very like the built in URL builder except that it upper
 * cases the scheme (HTTP or HTTPS). This doesn't have any effect but is useful for testing, to
 * see if the example URL builder is being called instead of the built in builder
 */
@Component
public class ExampleBaseURLBuilder implements IBaseURLBuilder {

  @Override
  public String getApplicationBaseURL(HttpServletRequest request) {
    return buildURL(request, request.getContextPath());
  }

  @Override
  public String getPageBaseURL(HttpServletRequest request) {
    return buildURL(request, request.getRequestURI());
  }

  private String buildURL(HttpServletRequest request, String tail) {
    StringBuilder buffer = new StringBuilder();
    String scheme = request.getScheme();
    int port = request.getServerPort();
    // Upper case just so can see that example builder is being used
    buffer.append(scheme.toUpperCase());
    buffer.append("://");
    buffer.append(request.getServerName());
    if (!canOmitPort(scheme, port)) {
      buffer.append(":");
      buffer.append(port);
    }
    buffer.append(tail);
    return buffer.toString();
  }

  private boolean canOmitPort(String scheme, int port) {
    return ("http".equalsIgnoreCase(scheme) && port == 80)
            || ("https".equalsIgnoreCase(scheme) && port == 443);
  }
}