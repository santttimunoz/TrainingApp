
package extensions.ab.addressbook.entity;

import extensions.ab.contact.entity.GlobalContactNameExt;
import extensions.ab.internal.domain.addressbook.impl.ABCompanyExtMethods;
import gw.ab.addressbook.entity.ABCompany;

public interface ABCompanyExt
    extends ABContactExt, GlobalContactNameExt, ABCompanyExtMethods, ABCompany
{


}
