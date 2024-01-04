
package extensions.ab.internal.domain.contact.gen;

import com.guidewire.pl.domain.messaging.impl.EventAwareInternal;
import com.guidewire.pl.domain.persistence.core.impl.RetireableInternal;

public interface MessageGeneratorInternalStubI
    extends EventAwareInternal, RetireableInternal, MessageGeneratorStubI
{


    /**
     * Sets the value of the LoadCommandID field.
     * 
     */
    void setLoadCommandID(Long value);

}
