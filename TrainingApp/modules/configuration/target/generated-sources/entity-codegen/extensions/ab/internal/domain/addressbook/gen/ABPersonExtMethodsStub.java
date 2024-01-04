
package extensions.ab.internal.domain.addressbook.gen;

import com.guidewire.pl.system.entity.aspect.AspectBase;
import com.guidewire.pl.system.entity.proxy.BeanProxy;
import gw.ab.addressbook.entity.ABPerson;

public abstract class ABPersonExtMethodsStub
    extends AspectBase
    implements ABPersonExtInternalMethodsStubI
{


    protected ABPersonExtMethodsStub(ABPerson owner) {
        super(((BeanProxy) owner));
    }

    @Override
    public ABPerson getOwner() {
        return ((ABPerson) super.getOwner());
    }

}
