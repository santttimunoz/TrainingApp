
package extensions.ab.addressbook.entity;

import extensions.ab.contact.entity.GlobalContactNameExt;
import extensions.ab.contact.entity.GlobalPersonNameExt;
import extensions.ab.internal.domain.addressbook.impl.ABPersonExtMethods;
import gw.ab.addressbook.entity.ABPerson;

public interface ABPersonExt
    extends ABContactExt, GlobalContactNameExt, GlobalPersonNameExt, ABPersonExtMethods, ABPerson
{


}
