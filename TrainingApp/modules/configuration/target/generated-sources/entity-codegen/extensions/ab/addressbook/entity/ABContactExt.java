
package extensions.ab.addressbook.entity;

import extensions.ab.contact.entity.GlobalContactNameExt;
import extensions.ab.internal.domain.addressbook.impl.ABContactExtMethods;
import gw.ab.addressbook.entity.ABContact;

public interface ABContactExt
    extends GlobalContactNameExt, ABContactExtMethods, ABContact
{


}
