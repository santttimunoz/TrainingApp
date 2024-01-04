package examples.pl.plugins.abauthentication;

import gw.plugin.dbauth.UsernamePasswordPair;

import aQute.bnd.annotation.component.Component;
import gw.pl.util.FileUtil;
import gw.plugin.addressbook.ABAuthenticationPlugin;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * Simple class that returns a username/password pair with a null username and a db password retrieved
 * from a file specified by the "filename" property.
 */
@Component
public class FileABAuthPlugin implements ABAuthenticationPlugin {
  private static final String PASSWORD_FILE_PROPERTY = "passwordfile";
  private static final String USERNAME_FILE_PROPERTY = "usernamefile";

  @Override
  public UsernamePasswordPair retrieveUsernameAndPassword(Map properties) {
    String passwordfile = (String) properties.get(PASSWORD_FILE_PROPERTY);
    String usernamefile = (String) properties.get(USERNAME_FILE_PROPERTY);
    try {
      String password = null;
      if (passwordfile != null) {
        password = readLine(new File(passwordfile));
      }
      String username = null;
      if (usernamefile != null) {
        username = readLine(new File(usernamefile));
      }
      return new UsernamePasswordPair(username, password);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private static String readLine(File file) throws IOException {
    BufferedReader reader = new BufferedReader(FileUtil.getFileReader(file));
    String line = reader.readLine();
    reader.close();
    return line;
  }
}
