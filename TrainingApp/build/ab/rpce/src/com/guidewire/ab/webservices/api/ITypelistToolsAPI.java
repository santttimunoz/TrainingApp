/**
 * ITypelistToolsAPI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;


/**
 * ITypelistToolsAPI provides methods that allow for the extraction
 * of typelist data from the
 * system.
 * @deprecated Use WS-I webservice gw.wsi.pl.TypelistToolsAPI instead.
 */
public interface ITypelistToolsAPI extends java.rmi.Remote {

    /**
     * For use during exports, returns a string corresponding to an
     * alias to an internal typecode given a typelist, a
     * namespace, and an internal code.  If no match is found, returns null.
     * If more than one match is found, throws a
     * SOAPException.
     * <br>
 * @deprecated
     * @param typelist the name of the given typelist (case-insensitive)
     * @param namespace the given namespace (case-insensitive)
     * @param code the given typecode (case-insensitive)
     * @return string corresponding to a typecode; null if no match found
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException if the caller does not have all of the following permissions: ADMIN
     * @throws com.guidewire.ab.webservices.fault.SOAPException if more than one result is found for the given namespace/typecode
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public java.lang.String getAliasByInternalCode(java.lang.String typelist, java.lang.String namespace, java.lang.String code) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * For use during exports, returns an array of strings representing
     * external aliases to internal typecodes given
     * a typelist, a namespace, and an internal code.  If no aliases are
     * found, then a zero-length, non-null array is
     * returned.  A namespace generally corresponds to an external integration
     * source, but multiple namespaces per source
     * are allowed. NOTE: this method allows multiple aliases to correspond
     * to the same namespace-typecode tuple.  If you
     * require a namespace-typecode to resolve to a single alias, please
     * use getAliasByInternalCode.
     * <br>
 * @deprecated
     * @param typelist the name of the given typelist (case-insensitive)
     * @param namespace the given namespace (case-insensitive)
     * @param code the given typecode (case-insensitive)
     * @return string array of aliases, or a zero-length, non-null string array if no aliases match
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException if the caller does not have all of the following permissions: ADMIN
     * @throws com.guidewire.ab.webservices.fault.SOAPException if more than one result is found for the given namespace/typecode
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public java.lang.String[] getAliasesByInternalCode(java.lang.String typelist, java.lang.String namespace, java.lang.String code) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * For use during imports, returns a TypeKeyData instance corresponding
     * to a typecode in the given typelist that
     * matches the given namespace/alias.  If no match is found, returns
     * null.  If more than one match is found, throws a
     * SOAPException.
     * <br>
 * @deprecated
     * @param typelist the name of the given typelist (case-insensitive)
     * @param namespace the given namespace (case-insensitive)
     * @param alias the given alias (case-insensitive)
     * @return TypeKeyData instance corresponding to a typecode; null if no match found
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException if the caller does not have all of the following permissions: ADMIN
     * @throws com.guidewire.ab.webservices.fault.SOAPException if more than one result is found for the given namespace/typecode
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.entity.TypeKeyData getTypeKeyByAlias(java.lang.String typelist, java.lang.String namespace, java.lang.String alias) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * For use during imports, returns an array of TypeKeyData objects
     * given a typelist, a namespace, and an
     * alias.  If no typecodes are found, will return a zero-length, non-null
     * array.  A namespace generally corresponds
     * to an external integration source, but multiple namespaces per source
     * are allowed.  NOTE: this method allows
     * multiple typecodes to use the same namespace-alias tuple.  If you
     * require a namespace-alias to resolve to a
     * single typecode, please use getTypeKeyByAlias.
     * <br>
 * @deprecated
     * @param typelist the name of the given typelist (case-insensitive)
     * @param namespace the given namespace (case-insensitive)
     * @param alias the given alias (case-insensitive)
     * @return array of TypeKeyData objects, or a zero-length, non-null string array if no typecodes match
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException if the caller does not have all of the following permissions: ADMIN
     * @throws com.guidewire.ab.webservices.fault.SOAPException if more than one result is found for the given namespace/typecode
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.entity.TypeKeyData[] getTypeKeysByAlias(java.lang.String typelist, java.lang.String namespace, java.lang.String alias) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Given the name of a typelist, returns an array of all the typekey
     * instances contained within.  An exception is
     * thrown if no typelist exists with the given name.
     * <br>
 * @deprecated
     * @param typelistName the case-insensitive name of the typelist to look up. for example: "accidenttype"
     * @return an array of codes of typekeys contained within the typelist
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException if the caller does not have all of the following permissions: ADMIN
     * @throws com.guidewire.ab.webservices.fault.SOAPException if more than one result is found for the given namespace/typecode
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.entity.TypeKeyData[] getTypelistValues(java.lang.String typelistName) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;
}
