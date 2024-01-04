
package extensions.ab.internal.domain.contact.gen;

import com.guidewire.commons.metadata.types.ColumnPropertyInfoCache;
import com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference;
import com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache;
import extensions.ab.addressbook.typekey.AdjudicativeDomain;
import extensions.ab.contact.entity.ABAdjudicator;
import gw.ab.addressbook.entity.ABPerson;
import gw.entity.IColumnPropertyInfo;
import gw.entity.ITypekeyPropertyInfo;
import gw.pl.persistence.type.EntityPropertyInfoReference;
import gw.pl.persistence.type.EntityTypeReference;

public interface ABAdjudicatorStubI
    extends ABPerson
{

    EntityTypeReference<ABAdjudicator> TYPE = new EntityIntrinsicTypeReference<ABAdjudicator>("entity.ABAdjudicator");
    EntityPropertyInfoReference<IColumnPropertyInfo> ADJUDICATORLICENSE_PROP = new ColumnPropertyInfoCache(TYPE, "AdjudicatorLicense");
    EntityPropertyInfoReference<ITypekeyPropertyInfo> ADJUDICATIVEDOMAIN_PROP = new TypekeyPropertyInfoCache(TYPE, "AdjudicativeDomain");

    /**
     * Gets the value of the AdjudicatorLicense field.
     * Adjudicator's business license number.
     * 
     */
    String getAdjudicatorLicense();

    /**
     * Sets the value of the AdjudicatorLicense field.
     * 
     */
    void setAdjudicatorLicense(String value);

    /**
     * Gets the value of the AdjudicativeDomain field.
     * Adjudicative Domain
     * 
     */
    AdjudicativeDomain getAdjudicativeDomain();

    /**
     * Sets the value of the AdjudicativeDomain field.
     * 
     */
    void setAdjudicativeDomain(AdjudicativeDomain value);

}
