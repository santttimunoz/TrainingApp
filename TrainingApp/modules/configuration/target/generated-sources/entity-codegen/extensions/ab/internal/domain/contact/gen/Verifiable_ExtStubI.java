
package extensions.ab.internal.domain.contact.gen;

import java.util.Date;
import com.guidewire.commons.metadata.types.ColumnDynPropertyInfo;
import com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference;
import com.guidewire.commons.metadata.types.TypekeyDynPropertyInfo;
import extensions.ab.contact.entity.Verifiable_Ext;
import gw.entity.IColumnPropertyInfo;
import gw.entity.ITypekeyPropertyInfo;
import gw.pl.activity.typekey.Priority;
import gw.pl.persistence.core.Bean;
import gw.pl.persistence.type.DynamicEntityPropertyInfoReference;
import gw.pl.persistence.type.EntityTypeReference;

public interface Verifiable_ExtStubI
    extends Bean
{

    EntityTypeReference<Verifiable_Ext> TYPE = new EntityIntrinsicTypeReference<Verifiable_Ext>("entity.Verifiable_Ext");
    DynamicEntityPropertyInfoReference<IColumnPropertyInfo> REQUIRESVERIFICATION_DYNPROP = new ColumnDynPropertyInfo("RequiresVerification", "RequiresVerification");
    DynamicEntityPropertyInfoReference<IColumnPropertyInfo> VERIFICATIONDATE_DYNPROP = new ColumnDynPropertyInfo("VerificationDate", "VerificationDate");
    DynamicEntityPropertyInfoReference<IColumnPropertyInfo> VERIFICATIONDUEDATE_DYNPROP = new ColumnDynPropertyInfo("VerificationDueDate", "VerificationDueDate");
    DynamicEntityPropertyInfoReference<ITypekeyPropertyInfo> PRIORITY_DYNPROP = new TypekeyDynPropertyInfo("Priority", "Priority");

    /**
     * Gets the value of the RequiresVerification field.
     * Does this object need verification?
     * 
     */
    Boolean isRequiresVerification();

    /**
     * Sets the value of the RequiresVerification field.
     * 
     */
    void setRequiresVerification(Boolean value);

    /**
     * Gets the value of the VerificationDate field.
     * Date object was verified
     * 
     */
    Date getVerificationDate();

    /**
     * Sets the value of the VerificationDate field.
     * 
     */
    void setVerificationDate(Date value);

    /**
     * Gets the value of the VerificationDueDate field.
     * Date by which object should be verified
     * 
     */
    Date getVerificationDueDate();

    /**
     * Sets the value of the VerificationDueDate field.
     * 
     */
    void setVerificationDueDate(Date value);

    /**
     * Gets the value of the Priority field.
     * Priority of the verification
     * 
     */
    Priority getPriority();

    /**
     * Sets the value of the Priority field.
     * 
     */
    void setPriority(Priority value);

}
