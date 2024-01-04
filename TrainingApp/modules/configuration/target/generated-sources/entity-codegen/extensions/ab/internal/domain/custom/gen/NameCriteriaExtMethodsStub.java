
package extensions.ab.internal.domain.custom.gen;

import com.guidewire.pl.system.entity.aspect.AspectBase;
import com.guidewire.pl.system.entity.proxy.BeanProxy;
import gw.pl.custom.entity.NameCriteria;

public abstract class NameCriteriaExtMethodsStub
    extends AspectBase
    implements NameCriteriaExtInternalMethodsStubI
{


    protected NameCriteriaExtMethodsStub(NameCriteria owner) {
        super(((BeanProxy) owner));
    }

    @Override
    public NameCriteria getOwner() {
        return ((NameCriteria) super.getOwner());
    }

    @Override
    public String getCompanyNameKanji() {
        return ((String) getFieldValueForCodegen(COMPANYNAMEKANJI_PROP.get()));
    }

    @Override
    public void setCompanyNameKanji(String value) {
        setFieldValueForCodegen(COMPANYNAMEKANJI_PROP.get(), value);
    }

    @Override
    public String getFirstNameKanji() {
        return ((String) getFieldValueForCodegen(FIRSTNAMEKANJI_PROP.get()));
    }

    @Override
    public void setFirstNameKanji(String value) {
        setFieldValueForCodegen(FIRSTNAMEKANJI_PROP.get(), value);
    }

    @Override
    public String getLastNameKanji() {
        return ((String) getFieldValueForCodegen(LASTNAMEKANJI_PROP.get()));
    }

    @Override
    public void setLastNameKanji(String value) {
        setFieldValueForCodegen(LASTNAMEKANJI_PROP.get(), value);
    }

    @Override
    public String getNameKanji() {
        return ((String) getFieldValueForCodegen(NAMEKANJI_PROP.get()));
    }

    @Override
    public void setNameKanji(String value) {
        setFieldValueForCodegen(NAMEKANJI_PROP.get(), value);
    }

}
