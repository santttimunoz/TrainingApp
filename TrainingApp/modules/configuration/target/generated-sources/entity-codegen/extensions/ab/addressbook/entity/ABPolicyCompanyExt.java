
package extensions.ab.addressbook.entity;

import extensions.ab.contact.entity.GlobalContactNameExt;
import extensions.ab.internal.domain.addressbook.impl.ABPolicyCompanyExtMethods;
import gw.ab.addressbook.entity.ABPolicyCompany;

public interface ABPolicyCompanyExt
    extends ABCompanyExt, ABContactExt, GlobalContactNameExt, ABPolicyCompanyExtMethods, ABPolicyCompany
{


}
