
package extensions.ab.addressbook.entity;

import extensions.ab.contact.entity.GlobalContactNameExt;
import extensions.ab.internal.domain.addressbook.impl.ABCompanyVendorExtMethods;
import gw.ab.addressbook.entity.ABCompanyVendor;

public interface ABCompanyVendorExt
    extends ABCompanyExt, ABContactExt, GlobalContactNameExt, ABCompanyVendorExtMethods, ABCompanyVendor
{


}
