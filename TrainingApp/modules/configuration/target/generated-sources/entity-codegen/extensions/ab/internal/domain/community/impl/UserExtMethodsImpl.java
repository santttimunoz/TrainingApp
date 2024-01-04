
package extensions.ab.internal.domain.community.impl;

import extensions.ab.internal.domain.community.gen.UserExtMethodsStub;
import gw.pl.community.entity.User;

public class UserExtMethodsImpl
    extends UserExtMethodsStub
    implements UserExtInternalMethods
{


    public UserExtMethodsImpl(User owner) {
        super(owner);
    }

}
