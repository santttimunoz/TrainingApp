
package extensions.ab.addressbook.entity;

import extensions.ab.contact.entity.GlobalContactNameExt;
import extensions.ab.contact.entity.GlobalPersonNameExt;
import extensions.ab.internal.domain.addressbook.impl.ABPolicyPersonExtMethods;
import gw.ab.addressbook.entity.ABPolicyPerson;

public interface ABPolicyPersonExt
    extends ABContactExt, ABPersonExt, GlobalContactNameExt, GlobalPersonNameExt, ABPolicyPersonExtMethods, ABPolicyPerson
{


}
