
package extensions.ab.internal.domain.addressbook.impl;

import com.guidewire.ab.domain.addressbook.impl.ABPolicyCompanyInternal;
import extensions.ab.addressbook.entity.ABPolicyCompanyExt;
import extensions.ab.internal.domain.contact.impl.GlobalContactNameExtInternal;

public interface ABPolicyCompanyExtInternal
    extends ABPolicyCompanyInternal, ABPolicyCompanyExt, ABCompanyExtInternal, ABContactExtInternal, ABPolicyCompanyExtInternalMethods, GlobalContactNameExtInternal
{


}
