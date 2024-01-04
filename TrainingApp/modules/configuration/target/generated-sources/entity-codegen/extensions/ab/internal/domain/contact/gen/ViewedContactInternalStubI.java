
package extensions.ab.internal.domain.contact.gen;

import com.guidewire.pl.domain.persistence.core.impl.RetireableInternal;
import gw.pl.persistence.core.Key;

public interface ViewedContactInternalStubI
    extends RetireableInternal, ViewedContactStubI
{


    /**
     * Sets the value of the LoadCommandID field.
     * 
     */
    void setLoadCommandID(Long value);

    Key getViewingUserID();

    void setViewingUserID(Key value);

    Key getViewedContactID();

    void setViewedContactID(Key value);

}
