
package extensions.ab.internal.domain.contact.gen;

import com.guidewire.pl.domain.persistence.core.impl.RetireableInternal;
import gw.pl.persistence.core.Key;

public interface LegalCaseInternalStubI
    extends RetireableInternal, LegalCaseStubI
{


    /**
     * Sets the value of the LoadCommandID field.
     * 
     */
    void setLoadCommandID(Long value);

    Key getABContactID();

    void setABContactID(Key value);

}
