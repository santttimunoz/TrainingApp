
package extensions.ab.internal.domain.contact.gen;

import com.guidewire.pl.system.entity.aspect.AspectBase;
import com.guidewire.pl.system.entity.proxy.BeanProxy;
import gw.ab.contact.entity.EFTData;

public abstract class EFTDataExtMethodsStub
    extends AspectBase
    implements EFTDataExtInternalMethodsStubI
{


    protected EFTDataExtMethodsStub(EFTData owner) {
        super(((BeanProxy) owner));
    }

    @Override
    public EFTData getOwner() {
        return ((EFTData) super.getOwner());
    }

}
