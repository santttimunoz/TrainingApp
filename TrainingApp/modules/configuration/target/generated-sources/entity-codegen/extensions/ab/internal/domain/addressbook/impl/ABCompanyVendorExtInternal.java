
package extensions.ab.internal.domain.addressbook.impl;

import com.guidewire.ab.domain.addressbook.impl.ABCompanyVendorInternal;
import extensions.ab.addressbook.entity.ABCompanyVendorExt;
import extensions.ab.internal.domain.contact.impl.GlobalContactNameExtInternal;

public interface ABCompanyVendorExtInternal
    extends ABCompanyVendorInternal, ABCompanyVendorExt, ABCompanyExtInternal, ABCompanyVendorExtInternalMethods, ABContactExtInternal, GlobalContactNameExtInternal
{


}
