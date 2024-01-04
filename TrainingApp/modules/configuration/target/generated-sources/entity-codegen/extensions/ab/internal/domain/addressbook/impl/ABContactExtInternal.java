
package extensions.ab.internal.domain.addressbook.impl;

import com.guidewire.ab.domain.addressbook.impl.ABContactInternal;
import extensions.ab.addressbook.entity.ABContactExt;
import extensions.ab.internal.domain.contact.impl.GlobalContactNameExtInternal;

public interface ABContactExtInternal
    extends ABContactInternal, ABContactExt, ABContactExtInternalMethods, GlobalContactNameExtInternal
{


}
