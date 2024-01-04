
package extensions.ab.internal.domain.contact.gen;

import com.guidewire.ab.domain.contact.impl.UserContactCoreExtImpl;
import extensions.ab.internal.domain.contact.impl.ContactExtInternal;
import extensions.ab.internal.domain.contact.impl.GlobalContactNameExtInternal;
import extensions.ab.internal.domain.contact.impl.GlobalContactNameExtMethodsImpl;
import extensions.ab.internal.domain.contact.impl.GlobalPersonNameExtInternal;
import extensions.ab.internal.domain.contact.impl.GlobalPersonNameExtMethodsImpl;

public class UserContactExtStub
    extends UserContactCoreExtImpl
    implements ContactExtInternal, GlobalContactNameExtInternal, GlobalPersonNameExtInternal
{


    @Override
    public String getNameKanji() {
        return getExtensionDelegate(GlobalContactNameExtMethodsImpl.class).getNameKanji();
    }

    @Override
    public void setNameKanji(String value) {
        getExtensionDelegate(GlobalContactNameExtMethodsImpl.class).setNameKanji(value);
    }

    @Override
    public String getFirstNameKanji() {
        return getExtensionDelegate(GlobalPersonNameExtMethodsImpl.class).getFirstNameKanji();
    }

    @Override
    public void setFirstNameKanji(String value) {
        getExtensionDelegate(GlobalPersonNameExtMethodsImpl.class).setFirstNameKanji(value);
    }

    @Override
    public String getLastNameKanji() {
        return getExtensionDelegate(GlobalPersonNameExtMethodsImpl.class).getLastNameKanji();
    }

    @Override
    public void setLastNameKanji(String value) {
        getExtensionDelegate(GlobalPersonNameExtMethodsImpl.class).setLastNameKanji(value);
    }

    @Override
    public String getParticle() {
        return getExtensionDelegate(GlobalPersonNameExtMethodsImpl.class).getParticle();
    }

    @Override
    public void setParticle(String value) {
        getExtensionDelegate(GlobalPersonNameExtMethodsImpl.class).setParticle(value);
    }

}
