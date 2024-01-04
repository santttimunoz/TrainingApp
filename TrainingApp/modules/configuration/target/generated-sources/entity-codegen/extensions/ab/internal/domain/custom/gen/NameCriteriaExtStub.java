
package extensions.ab.internal.domain.custom.gen;

import com.guidewire.pl.domain.custom.impl.NameCriteriaImpl;
import extensions.ab.internal.domain.custom.impl.NameCriteriaExtInternal;
import extensions.ab.internal.domain.custom.impl.NameCriteriaExtMethodsImpl;

public class NameCriteriaExtStub
    extends NameCriteriaImpl
    implements NameCriteriaExtInternal
{


    @Override
    public String getCompanyNameKanji() {
        return getExtensionDelegate(NameCriteriaExtMethodsImpl.class).getCompanyNameKanji();
    }

    @Override
    public void setCompanyNameKanji(String value) {
        getExtensionDelegate(NameCriteriaExtMethodsImpl.class).setCompanyNameKanji(value);
    }

    @Override
    public String getFirstNameKanji() {
        return getExtensionDelegate(NameCriteriaExtMethodsImpl.class).getFirstNameKanji();
    }

    @Override
    public void setFirstNameKanji(String value) {
        getExtensionDelegate(NameCriteriaExtMethodsImpl.class).setFirstNameKanji(value);
    }

    @Override
    public String getLastNameKanji() {
        return getExtensionDelegate(NameCriteriaExtMethodsImpl.class).getLastNameKanji();
    }

    @Override
    public void setLastNameKanji(String value) {
        getExtensionDelegate(NameCriteriaExtMethodsImpl.class).setLastNameKanji(value);
    }

    @Override
    public String getNameKanji() {
        return getExtensionDelegate(NameCriteriaExtMethodsImpl.class).getNameKanji();
    }

    @Override
    public void setNameKanji(String value) {
        getExtensionDelegate(NameCriteriaExtMethodsImpl.class).setNameKanji(value);
    }

}
