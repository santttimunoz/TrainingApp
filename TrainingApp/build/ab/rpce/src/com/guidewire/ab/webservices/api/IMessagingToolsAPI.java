/**
 * IMessagingToolsAPI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;


/**
 * MessagingTools is a remote interface to a set of tools to get messaging
 * statistics and perform operations on messages.
 * @deprecated Since 8.0.0.  Please use the ab800 package.
 */
public interface IMessagingToolsAPI extends java.rmi.Remote {

    /**
     * Acknowledges message
     * <br>
 * @deprecated
     * @param ack The acknowledgement to report
     * @return optional message fields that can be set
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException If the ack could not be committed to the database
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.entity.MessageOptionalFields acknowledgeMessage(com.guidewire.ab.webservices.entity.Acknowledgement ack) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Gets the message id for a message with a specific sender ref
     * id and a specific destination id.
     * If the destination id passed in is -1, then this would find messages
     * from any destination that matches the sender ref id.
     * Returns -1 if no message is found that has given sender ref id and
     * destination id.
     * If there are multiple messages that match, this will return the first
     * one.
     * <br>
 * @deprecated
     * @param senderRefID The sender ref id for the message we want to get
     * @param destinationID The destination id for the message we want to get. -1 would match all destination ids.
     * @return message id, or -1 if message is not found
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException If the ack could not be committed to the database
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public int getMessageId(java.lang.String senderRefID, int destinationID) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Gets all the message statistics of a given destination and
     * safe ordered object.
     * <br>
 * @deprecated
     * @param destID The destination to get the message statistics.
     * @param safeOrderedObjectId The public id of the safe ordered object of interest
     * @return the message statistics for the specified destination and safe order object
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException If the ack could not be committed to the database
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.entity.MessageStatisticsData getMessageStatisticsForSafeOrderedObject(int destID, java.lang.String safeOrderedObjectId) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Gets all the message statistics of a given destination.
     * <br>
 * @deprecated
     * @param destID The destination to get the message statistics.
     * @return the message statistics for the specified destination
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException If the ack could not be committed to the database
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.entity.MessageStatisticsData getTotalStatistics(int destID) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Purges the message history table of completed messages.
     * Deletes all messages with send time less than supplied before date.
     * <br>
 * @deprecated
     * @param cutoff Remove messages with send time less than this date.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException If the ack could not be committed to the database
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void purgeCompletedMessages(java.util.Calendar cutoff) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Resumes the destination with the specified destination id
     * <br>
 * @deprecated
     * @param destID The destination id of the destination to resume
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException If the ack could not be committed to the database
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void resumeDestination(int destID) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Resync the abcontact against specified destination
     * <br>
 * @deprecated
     * @param destID The destination against which the abcontact should be resynced.
     * @param abcontactID The identifier of the abcontact that should be resynced.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.DataConversionException If abcontact cannot be found
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException If the ack could not be committed to the database
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void resyncABContact(int destID, java.lang.String abcontactID) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.DataConversionException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Retries a single message (retryable error or inflight).
     * <br>
 * @deprecated
     * @param messageID The message to retry.
     * @return Returns whether or not the message was successfully retried.
If the message with this messageID does not exist, this returns false.
If the message is not a retryable error message or an inflight message, this returns false.
Returning true does not necessarily mean that the retry was successful; it just means that the message was retried.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException If the ack could not be committed to the database
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public boolean retryMessage(int messageID) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Retries all messages in retryable error state for the given
     * destination.
     * <br>
 * @deprecated
     * @param destID The destination that should be retried.
     * @return Returns true if all messages were successfully retried; false if any errors occurred.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException If the ack could not be committed to the database
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public boolean retryRetryableErrorMessages(int destID) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Retries messages in retryable error state for the given destination
     * where the message
     * has previously been retried fewer than retryLimit times.  Each message
     * maintains a retry
     * count; attempts to retry the message increment the retry count.  If
     * there are messages
     * whose retry count >= retryLimit, they will not be retried.
     * <p/>
     * Specifying a retryLimit of 0 retries all retryable error messages,
     * and is identical to retryRetryableErrorMessages(int destID).
     * <br>
 * @deprecated
     * @param destID The destination that should be retried.
     * @param retryLimit Retry only messages with retryCount < retryLimit; if retryLimit
is 0, retry all messages.
     * @return Returns true if all messages were successfully retried; false if any errors occurred.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException If the ack could not be committed to the database
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public boolean retryRetryableErrorMessages(int destID, int retryLimit) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Retries messages in retryable error state for the given destination
     * and error category,
     * <br>
 * @deprecated
     * @param destID The destination that should be retried.
     * @param category The error category of the messages that should be retried.
     * @return Returns true if all messages were successfully retried; false if any errors occurred.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException If the ack could not be committed to the database
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public boolean retryRetryableErrorMessagesForCategory(int destID, com.guidewire.ab.webservices.enumeration.ErrorCategory category) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Skips a single message (error or inflight).
     * <br>
 * @deprecated
     * @param messageID The message to skip.
     * @return Returns whether the message was successfully skipped.
If the message with this messageId does not exist, this returns false.
If the message is not in an active state(active states are:
pending send, inflight, error, retryable error and pending retry),
this returns false.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException If the ack could not be committed to the database
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public boolean skipMessage(int messageID) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Suspends the destination with the specified destination id
     * <br>
 * @deprecated
     * @param destID The destination id of the destination to suspend
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException If the ack could not be committed to the database
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void suspendDestination(int destID) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;
}
