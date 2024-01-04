
package extensions.ab.internal.domain.addressbook.impl;

import com.guidewire.ab.domain.addressbook.impl.ABPolicyPersonInternal;
import extensions.ab.addressbook.entity.ABPolicyPersonExt;
import extensions.ab.internal.domain.contact.impl.GlobalContactNameExtInternal;
import extensions.ab.internal.domain.contact.impl.GlobalPersonNameExtInternal;

public interface ABPolicyPersonExtInternal
    extends ABPolicyPersonInternal, ABPolicyPersonExt, ABContactExtInternal, ABPersonExtInternal, ABPolicyPersonExtInternalMethods, GlobalContactNameExtInternal, GlobalPersonNameExtInternal
{


}
