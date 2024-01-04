
package extensions.ab.messaging.typekey;

import com.guidewire.commons.metadata.types.TypeKeyCache;
import gw.pl.messaging.typekey.ErrorCategory;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class ErrorCategoryExtConstants {

    /**
     * Database Contention
     * Contention with external system database
     * 
     */
    public final static TypeKeyReference<ErrorCategory> TC_DATABASE_CONTENTION = new TypeKeyCache<ErrorCategory>(ErrorCategory.TYPE, "database_contention");
    /**
     * No Connection
     * Cannot connect to external system
     * 
     */
    public final static TypeKeyReference<ErrorCategory> TC_NO_CONNECTION = new TypeKeyCache<ErrorCategory>(ErrorCategory.TYPE, "no_connection");
    /**
     * Payload Format
     * Issue with the format of the message payload reported by external system
     * 
     */
    public final static TypeKeyReference<ErrorCategory> TC_PAYLOAD_FORMAT = new TypeKeyCache<ErrorCategory>(ErrorCategory.TYPE, "payload_format");
    /**
     * Permanent Error
     * There is a permanent error related to sending and/or processing this message.
     * 
     */
    public final static TypeKeyReference<ErrorCategory> TC_PERMANENT_ERROR = new TypeKeyCache<ErrorCategory>(ErrorCategory.TYPE, "permanent_error");
    /**
     * Unexpected Error
     * There was an unexpected error.
     * 
     */
    public final static TypeKeyReference<ErrorCategory> TC_UNEXPECTED_ERROR = new TypeKeyCache<ErrorCategory>(ErrorCategory.TYPE, "unexpected_error");
    /**
     * User Authentication
     * User account doesn't get authenticated
     * 
     */
    public final static TypeKeyReference<ErrorCategory> TC_USER_AUTHENTICATION = new TypeKeyCache<ErrorCategory>(ErrorCategory.TYPE, "user_authentication");

}
