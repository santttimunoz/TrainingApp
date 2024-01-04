
package extensions.ab.internal.domain.addressbook.impl;

import com.guidewire.ab.domain.addressbook.impl.ABPersonVendorInternal;
import extensions.ab.addressbook.entity.ABPersonVendorExt;
import extensions.ab.internal.domain.contact.impl.GlobalContactNameExtInternal;
import extensions.ab.internal.domain.contact.impl.GlobalPersonNameExtInternal;

public interface ABPersonVendorExtInternal
    extends ABPersonVendorInternal, ABPersonVendorExt, ABContactExtInternal, ABPersonExtInternal, ABPersonVendorExtInternalMethods, GlobalContactNameExtInternal, GlobalPersonNameExtInternal
{


}
