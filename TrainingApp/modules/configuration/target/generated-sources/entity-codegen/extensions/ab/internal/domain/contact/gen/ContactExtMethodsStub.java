
package extensions.ab.internal.domain.contact.gen;

import com.guidewire.pl.system.entity.aspect.AspectBase;
import com.guidewire.pl.system.entity.proxy.BeanProxy;
import gw.pl.contact.entity.Contact;

public abstract class ContactExtMethodsStub
    extends AspectBase
    implements ContactExtInternalMethodsStubI
{


    protected ContactExtMethodsStub(Contact owner) {
        super(((BeanProxy) owner));
    }

    @Override
    public Contact getOwner() {
        return ((Contact) super.getOwner());
    }

}
