
package extensions.ab.internal.domain.contact.gen;

import com.guidewire.pl.domain.persistence.core.impl.RetireableInternal;
import gw.pl.persistence.core.Key;

public interface FlagEntryInternalStubI
    extends RetireableInternal, FlagEntryStubI
{


    /**
     * Sets the value of the LoadCommandID field.
     * 
     */
    void setLoadCommandID(Long value);

    Key getABContactID();

    void setABContactID(Key value);

    Key getUnflagUserID();

    void setUnflagUserID(Key value);

}
