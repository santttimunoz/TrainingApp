
package extensions.ab.internal.domain.community.gen;

import com.guidewire.pl.domain.community.impl.UserSearchCriteriaImpl;
import extensions.ab.internal.domain.community.impl.UserSearchCriteriaExtInternal;
import extensions.ab.internal.domain.community.impl.UserSearchCriteriaExtMethodsImpl;

public class UserSearchCriteriaExtStub
    extends UserSearchCriteriaImpl
    implements UserSearchCriteriaExtInternal
{


    @Override
    public String getGroupNameKanji() {
        return getExtensionDelegate(UserSearchCriteriaExtMethodsImpl.class).getGroupNameKanji();
    }

    @Override
    public void setGroupNameKanji(String value) {
        getExtensionDelegate(UserSearchCriteriaExtMethodsImpl.class).setGroupNameKanji(value);
    }

}
