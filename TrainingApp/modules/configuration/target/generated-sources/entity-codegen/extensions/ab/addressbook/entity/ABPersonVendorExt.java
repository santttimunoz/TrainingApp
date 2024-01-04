
package extensions.ab.addressbook.entity;

import extensions.ab.contact.entity.GlobalContactNameExt;
import extensions.ab.contact.entity.GlobalPersonNameExt;
import extensions.ab.internal.domain.addressbook.impl.ABPersonVendorExtMethods;
import gw.ab.addressbook.entity.ABPersonVendor;

public interface ABPersonVendorExt
    extends ABContactExt, ABPersonExt, GlobalContactNameExt, GlobalPersonNameExt, ABPersonVendorExtMethods, ABPersonVendor
{


}
