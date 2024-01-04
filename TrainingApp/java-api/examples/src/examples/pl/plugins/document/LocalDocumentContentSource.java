/*
 * Guidewire ClaimCenter
 *
 * Copyright 2003 Guidewire Software, Inc. All Rights Reserved.
 * Guidewire Software, Guidewire ClaimCenter, and the Guidewire logo are trademarks of Guidewire Software, Inc.
 */

package examples.pl.plugins.document;

import aQute.bnd.annotation.component.Activate;
import aQute.bnd.annotation.component.Component;
import aQute.bnd.annotation.component.ConfigurationPolicy;
import gw.config.CommonServices;
import gw.document.DocumentContentsInfo;
import gw.document.DocumentExistsException;
import gw.pl.document.entity.Document;
import gw.pl.logging.LoggerCategory;
import gw.pl.util.FileUtil;
import gw.pl.util.StringUtil;
import gw.plugin.document.IDocumentContentSourceBase;
import org.apache.commons.lang.StringUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Date;
import java.util.Map;

import static gw.plugin.InitializablePlugin.ROOT_DIR;
import static gw.plugin.InitializablePlugin.TEMP_DIR;

/**
 * Implementation of {@link gw.plugin.document.IDocumentContentSourceBase}. This implementation is provided
 * primarily as a proof-of-concept; it lacks many features of standard DMS systems like versioning, etc.
 */
@Component(configurationPolicy = ConfigurationPolicy.require)
public class LocalDocumentContentSource implements IDocumentContentSourceBase {

  //These mode parameters are provided for testing purposes; they allow simulation of different kinds of
  // content responses. See the documentation for DocumentContentsInfo for more details on the various modes.
  // Note that not all of the simulated modes faithfully transmit the actual document contents.
  // Generally speaking, the mode parameter should not be used in production.
  private static final String MODE_PARAM = "mode";
  private static final String CONTENT_MODE = "content";
  //Determine whether a hidden frame should be targeted
  private static final String TARGET_PARAM = "target";
  private static final String URL_MODE = "url";
  private static final String URL_PARAM = "url";
  private static final String DOCUMENTS_PATH = "documents.path";

  private String _contentMode = "content";
  private boolean _targetHiddenFrame = false;
  private String _contentURL;
  private String _documentsURL;
  private String _documentsPath;
  private String _demoDocumentsPath;

  @Activate
  void start(Map<?, ?> properties) {
    String rootDir = (String) properties.get(ROOT_DIR);
    String tempDir = (String) properties.get(TEMP_DIR);
    String documentsPath = (String) properties.get(DOCUMENTS_PATH);
    if (!StringUtils.isEmpty(documentsPath)) {
      _demoDocumentsPath = getAbsolutePath(documentsPath, rootDir);
      String demoDocumentsURL = getUrlFromPath(documentsPath, rootDir);
      if (!new File(_demoDocumentsPath).equals(new File(documentsPath))) {
        //If they're not equal, then documentsPath was a relative path, not an absolute path, which should not be the case in production
        LoggerCategory.PLUGIN.warn("LocalDocumentContentSource has a relative path specified for its documents.path parameter, so it will store documents in the app container's temporary directory. For production use, the configuration should be changed to a full directory path, not a relative path");
        _documentsPath = getAbsolutePath(documentsPath, tempDir);
        _documentsURL = getUrlFromPath(documentsPath, tempDir);
      } else {
        _documentsPath = _demoDocumentsPath;
        _documentsURL = demoDocumentsURL;
      }
    }
    String mode = (String) properties.get(MODE_PARAM);
    if (!StringUtils.isEmpty(mode)) {
      _contentMode = mode;
      if (URL_MODE.equals(_contentMode)) {
        _contentURL = (String) properties.get(URL_PARAM);
      }
    }
    String target = (String) properties.get(TARGET_PARAM);
    if (!StringUtils.isEmpty(target)) {
      _targetHiddenFrame = "hidden".equals(target);
    }
  }

  public String getDocumentsPath() {
    return _documentsPath;
  }

  public String getDocumentsURL() {
    return _documentsURL;
  }

  public String getDemoDocumentsPath() {
    return _demoDocumentsPath;
  }

  protected static String encodeSpaces(String strUrl) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < strUrl.length(); i++) {
      char c = strUrl.charAt(i);
      if (c == ' ') {
        sb.append("%20");
      } else {
        sb.append(c);
      }
    }

    return sb.toString();
  }

  public static String getUrlFromPath(String strPath, String rootPath) {
    return encodeSpaces("file:///" + rootPath + "/" + forwardSlashify(strPath));
  }

  /**
   * A path is absolute if it begins with a "/" or a "\" or a drive letter "<drive-letter>:".
   * This method returns absolute paths as-is. Relative paths are prepended with the root
   * application directory.
   */
  private static String getAbsolutePath(String path, String rootPath) {
    String retVal;
    if (path.startsWith("\\") ||
            path.startsWith("/") ||
            (path.length() > 1 && path.charAt(1) == ':')) {
      retVal = path;
    } else {
      retVal = rootPath + File.separator + path;
    }
    try {
      retVal = (new File(retVal)).getCanonicalPath();
    } catch (IOException e) {
      throw new RuntimeException("Could not get absolute path from relative path: " + path, e);
    }
    return forwardSlashify(retVal);
  }

  /**
   * Changes all '//' slashes to '\' to turn path into a valid uri.
   */
  private static String forwardSlashify(String url) {
    // replaces "\\" with "/"
    return url.replaceAll("\\\\", "/");
  }

  @Override
  public boolean isInboundAvailable() {
    return true;
  }

  @Override
  public boolean isOutboundAvailable() {
    return true;
  }
  /**
   * Builds the DocumentContentsInfo containing the document contents information. Most of the code in this method
   * exists for the testing-time "mode" parameter; see the CONTENT_MODE section for the standard content-returning scenario.
   * @param strDocUID The DocUID of the document whose contents should be returned
   * @param includeContents If true, the actual contents of the document should be included in the DocumentContentsInfo
   * @return A DocumentContentsInfo object with the metadata of the Document Contents, and possibly the contents themselves
   */
  protected DocumentContentsInfo getDocumentContents(String strDocUID, boolean includeContents) {
    DocumentContentsInfo response = null;
    if (CONTENT_MODE.equals(_contentMode)) {
      response = new DocumentContentsInfo(DocumentContentsInfo.DOCUMENT_CONTENTS, includeContents ? getContentStream(strDocUID) : null, null);
    } else if (URL_MODE.equals(_contentMode)) {
      response = new DocumentContentsInfo(DocumentContentsInfo.URL, includeContents ? _contentURL : null, null);
    }
    if (response != null) {
      response.setTargetHiddenFrame(_targetHiddenFrame);
    }
    return response;
  }

  //Given a DocUID, create an InputStream containing the contents corresponding to that DocUID
  private InputStream getContentStream(String strDocumentId) {
    String url = getDocumentsURL() + '/' + strDocumentId;
    InputStream responseStream;
    try {
      if (url.toLowerCase().startsWith("file:")) {
        responseStream = new FileInputStream(getDocumentFile(strDocumentId, true));
      } else {
        url = StringUtil.encodeURLCharacters(url);
        //      try {
//        return CommonServices.getFileSystem().getIFile(new File(url.toURI()));
//      } catch (URISyntaxException e) {
//        throw new RuntimeException(e);
//      }
        responseStream = CommonServices.getFileSystem().getIFile(new URL(url)).openInputStream();
      }
    } catch (Exception e) {
      throw new RuntimeException("Exception encountered trying to get the content stream for DocID: " + strDocumentId, e);
    }
    return responseStream;
  }

  // Store a new set of contents for the given DocUID
  protected void updateDocument(String docId, InputStream isDocument) {
    try {
      File file = getDocumentFile(docId);
      if (!FileUtil.isFile(file)) {
        throw new IllegalArgumentException("Document " + docId + " does not exist!");
      }
      // Rather than just overwriting the file in place, move the old file,
      // upload the new contents, and then delete the old file. This helps avoid file corruption
      // if a user views the file while it is being updated.
      File backupFile = new File(file.getPath() + ".bak");
      if (!file.renameTo(backupFile)) {
        throw new IOException("rename failed from <" + file.getAbsolutePath() + "> to <" + backupFile.getAbsolutePath() + ">");
      }

      copyToFile(isDocument, file);

      //Kill the backup file, to avoid conflicts in the future
      if (!backupFile.delete()) {
        throw new IOException("deleting file failed <" + backupFile.getAbsolutePath() + ">");
      }

    } catch (Exception e) {
      throw new RuntimeException("Exception encountered trying to update document with doc id: " + docId, e);
    }
  }

  protected String getDocUID(Document doc) {
    String strDocumentName = FileUtil.makeValidPortableFileName(doc.getName());
    if (strDocumentName == null) {
      throw new IllegalArgumentException("Document name is null.");
    }

    // The id is a relative (but unique) path to the document. Allows for mobile document source.
    return convertBackSlashPathToSlashPath(strDocumentName);
  }

  private String convertBackSlashPathToSlashPath(String strPath) {
    if (strPath == null || strPath.length() == 0) {
      return strPath;
    }

    return strPath.replace('\\', '/');
  }

  // Remove the contents identified by the given DocUID
  protected void removeDocumentById(String strDocumentId) {
    try {
      //This assumes the current implementation, that the Id describes the location of the file
      File file = getDocumentFile(strDocumentId);
      if (!file.exists()) {
        //For now, do nothing but return. It's possible that the file got deleted out from under, by a deploy
        //      or something; since this is mainly a proof of concept implementation, we should be tolerant.
        return;
      }

      //Remove the file from the filesystem
      if (!file.delete()) {
        throw new IllegalStateException("Document could not be deleted: " + file.getName());
      }
    } catch (Exception e) {
      throw new RuntimeException("Exception encountered trying to remove document with doc id: " + strDocumentId, e);
    }
  }

  // ------------------------------------ Private helper methods ------------------------------------------

  protected void copyToFile(InputStream is, File file) throws IOException {
    FileOutputStream os = new FileOutputStream(file);
    byte[] bytes = new byte[4096];
    while (true) {
      int i = is.read(bytes);
      if (i < 0) {
        break;
      }
      os.write(bytes, 0, i);
    }
    is.close();
    os.close();
  }

  protected boolean isDocumentFile(Document doc) {
    try {
      String strName = doc.getName();
      if (StringUtils.isEmpty(strName)) {
        throw new IllegalArgumentException("Document name is null or empty.");
      }

      File file = getDocumentFile(doc, true);

      return FileUtil.isFile(file);
    } catch (Throwable t) {
      throw new RuntimeException("Exception encountered trying to test for the existiance of document named: " + doc.getName(), t);
    }
  }

  private File getDocumentFile(Document doc, boolean checkDemoFolder) {
    File dirDoc = new File(getDocumentsDir());
    if (!dirDoc.isDirectory()) {
      if (!dirDoc.mkdirs()) {
        throw new IllegalStateException("Error creating directory <" + dirDoc.getAbsolutePath() + ">");
      }
    }

    return getDocumentFile(FileUtil.makeValidPortableFileName(doc.getName()), checkDemoFolder);
  }

  protected String getDocumentsDir() {
    return getDocumentsPath() + File.separator;
  }

  protected String getDemoDocumentsDir() {
    return getDemoDocumentsPath() + File.separator;
  }

  protected File getDocumentFile(String relativePath) {
    return getDocumentFile(relativePath, false);
  }

  protected File getDocumentFile(String relativePath, boolean checkDemoFolder) {
    File file = new File(getDocumentsDir(), relativePath);
    if (!file.exists() && checkDemoFolder) {
      file = new File(getDemoDocumentsDir(), relativePath);
    }
    return file;
  }

  @Override
  public boolean addDocument(InputStream documentContents, Document document) {
    String docUID;
    docUID = getDocUID(document);
    File file = getDocumentFile(document, false);
    try {
      if (FileUtil.isFile(file)) {
        throw new DocumentExistsException(docUID + " already exists.");
      }
      copyToFile(documentContents, file);
    } catch (Exception e) {
      throw new RuntimeException("Exception encountered trying to add document with doc id: " + getDocUID(document), e);
    }
    document.setDateModified(new Date());
    document.setDocUID(docUID);
    return false;
  }

  @Override
  public boolean isDocument(Document document) {
    if (document.getDocUID() != null) {
      File docFile = getDocumentFile(document.getDocUID());
      return docFile.isFile() && docFile.exists();
    } else {
      return isDocumentFile(document);
    }
  }

  @Override
  public DocumentContentsInfo getDocumentContentsInfo(Document document, boolean includeContents) {
    DocumentContentsInfo dci = getDocumentContents(document.getDocUID(), includeContents);
    dci.setResponseMimeType(document.getMimeType());
    return dci;
  }


  @Override
  public DocumentContentsInfo getDocumentContentsInfoForExternalUse(Document document) {
    throw new UnsupportedOperationException("Not implemented");
  }

  @Override
  public boolean updateDocument(Document document, InputStream isDocument) {
    updateDocument(document.getDocUID(), isDocument);
    document.setDateModified(new Date());
    return false;
  }

  @Override
  public boolean removeDocument(Document document) {
    removeDocumentById(document.getDocUID());
    return false;
  }
}
