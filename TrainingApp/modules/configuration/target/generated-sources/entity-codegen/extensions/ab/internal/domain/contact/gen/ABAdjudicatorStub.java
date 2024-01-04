
package extensions.ab.internal.domain.contact.gen;

import com.guidewire.ab.domain.addressbook.impl.ABPersonImpl;
import extensions.ab.addressbook.typekey.AdjudicativeDomain;

public abstract class ABAdjudicatorStub
    extends ABPersonImpl
    implements ABAdjudicatorInternalStubI
{


    @Override
    public String getAdjudicatorLicense() {
        return ((String) getFieldValueForCodegen(ADJUDICATORLICENSE_PROP.get()));
    }

    @Override
    public void setAdjudicatorLicense(String value) {
        setFieldValueForCodegen(ADJUDICATORLICENSE_PROP.get(), value);
    }

    @Override
    public AdjudicativeDomain getAdjudicativeDomain() {
        return ((AdjudicativeDomain) getFieldValue(ADJUDICATIVEDOMAIN_PROP.get()));
    }

    @Override
    public void setAdjudicativeDomain(AdjudicativeDomain value) {
        setFieldValue(ADJUDICATIVEDOMAIN_PROP.get(), value);
    }

}
