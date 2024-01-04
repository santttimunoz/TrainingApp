
package extensions.ab.internal.domain.community.gen;

import com.guidewire.pl.domain.community.impl.OrganizationSearchCriteriaImpl;
import extensions.ab.internal.domain.community.impl.OrganizationSearchCriteriaExtInternal;
import extensions.ab.internal.domain.community.impl.OrganizationSearchCriteriaExtMethodsImpl;

public class OrganizationSearchCriteriaExtStub
    extends OrganizationSearchCriteriaImpl
    implements OrganizationSearchCriteriaExtInternal
{


    @Override
    public String getNameKanji() {
        return getExtensionDelegate(OrganizationSearchCriteriaExtMethodsImpl.class).getNameKanji();
    }

    @Override
    public void setNameKanji(String value) {
        getExtensionDelegate(OrganizationSearchCriteriaExtMethodsImpl.class).setNameKanji(value);
    }

    @Override
    public String getContactCityKanji() {
        return getExtensionDelegate(OrganizationSearchCriteriaExtMethodsImpl.class).getContactCityKanji();
    }

    @Override
    public void setContactCityKanji(String value) {
        getExtensionDelegate(OrganizationSearchCriteriaExtMethodsImpl.class).setContactCityKanji(value);
    }

}
