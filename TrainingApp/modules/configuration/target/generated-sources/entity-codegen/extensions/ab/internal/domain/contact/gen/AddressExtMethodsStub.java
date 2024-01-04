
package extensions.ab.internal.domain.contact.gen;

import com.guidewire.pl.system.entity.aspect.AspectBase;
import com.guidewire.pl.system.entity.proxy.BeanProxy;
import gw.pl.contact.entity.Address;

public abstract class AddressExtMethodsStub
    extends AspectBase
    implements AddressExtInternalMethodsStubI
{


    protected AddressExtMethodsStub(Address owner) {
        super(((BeanProxy) owner));
    }

    @Override
    public Address getOwner() {
        return ((Address) super.getOwner());
    }

}
