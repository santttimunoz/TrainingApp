
package extensions.ab.internal.domain.community.gen;

import com.guidewire.pl.domain.community.impl.GroupSearchCriteriaImpl;
import extensions.ab.internal.domain.community.impl.GroupSearchCriteriaExtInternal;
import extensions.ab.internal.domain.community.impl.GroupSearchCriteriaExtMethodsImpl;

public class GroupSearchCriteriaExtStub
    extends GroupSearchCriteriaImpl
    implements GroupSearchCriteriaExtInternal
{


    @Override
    public String getGroupNameKanji() {
        return getExtensionDelegate(GroupSearchCriteriaExtMethodsImpl.class).getGroupNameKanji();
    }

    @Override
    public void setGroupNameKanji(String value) {
        getExtensionDelegate(GroupSearchCriteriaExtMethodsImpl.class).setGroupNameKanji(value);
    }

}
