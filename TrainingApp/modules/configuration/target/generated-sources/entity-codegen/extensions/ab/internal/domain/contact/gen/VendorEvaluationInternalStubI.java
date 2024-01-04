
package extensions.ab.internal.domain.contact.gen;

import com.guidewire.pl.domain.persistence.core.impl.RetireableInternal;
import extensions.ab.internal.domain.contact.impl.Verifiable_ExtInternal;
import gw.pl.persistence.core.Key;

public interface VendorEvaluationInternalStubI
    extends RetireableInternal, VendorEvaluationStubI, Verifiable_ExtInternal
{


    /**
     * Sets the value of the LoadCommandID field.
     * 
     */
    void setLoadCommandID(Long value);

    Key getABContactID();

    void setABContactID(Key value);

}
