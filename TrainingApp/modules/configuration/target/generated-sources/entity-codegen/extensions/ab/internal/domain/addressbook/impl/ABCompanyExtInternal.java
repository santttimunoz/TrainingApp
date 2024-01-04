
package extensions.ab.internal.domain.addressbook.impl;

import com.guidewire.ab.domain.addressbook.impl.ABCompanyInternal;
import extensions.ab.addressbook.entity.ABCompanyExt;
import extensions.ab.internal.domain.contact.impl.GlobalContactNameExtInternal;

public interface ABCompanyExtInternal
    extends ABCompanyInternal, ABCompanyExt, ABCompanyExtInternalMethods, ABContactExtInternal, GlobalContactNameExtInternal
{


}
