
package extensions.ab.internal.domain.addressbook.impl;

import com.guidewire.ab.domain.addressbook.impl.ABPersonInternal;
import extensions.ab.addressbook.entity.ABPersonExt;
import extensions.ab.internal.domain.contact.impl.GlobalContactNameExtInternal;
import extensions.ab.internal.domain.contact.impl.GlobalPersonNameExtInternal;

public interface ABPersonExtInternal
    extends ABPersonInternal, ABPersonExt, ABContactExtInternal, ABPersonExtInternalMethods, GlobalContactNameExtInternal, GlobalPersonNameExtInternal
{


}
