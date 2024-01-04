
package extensions.ab.internal.domain.contact.gen;

import com.guidewire.commons.metadata.types.ColumnPropertyInfoCache;
import com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference;
import com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache;
import extensions.ab.addressbook.typekey.LegalSpecialty;
import extensions.ab.contact.entity.ABAttorney;
import gw.ab.addressbook.entity.ABPersonVendor;
import gw.entity.IColumnPropertyInfo;
import gw.entity.ITypekeyPropertyInfo;
import gw.pl.persistence.type.EntityPropertyInfoReference;
import gw.pl.persistence.type.EntityTypeReference;

public interface ABAttorneyStubI
    extends ABPersonVendor
{

    EntityTypeReference<ABAttorney> TYPE = new EntityIntrinsicTypeReference<ABAttorney>("entity.ABAttorney");
    EntityPropertyInfoReference<IColumnPropertyInfo> ATTORNEYLICENSE_PROP = new ColumnPropertyInfoCache(TYPE, "AttorneyLicense");
    EntityPropertyInfoReference<ITypekeyPropertyInfo> ATTORNEYSPECIALTY_PROP = new TypekeyPropertyInfoCache(TYPE, "AttorneySpecialty");

    /**
     * Gets the value of the AttorneyLicense field.
     * Attorney's business license number.
     * 
     */
    String getAttorneyLicense();

    /**
     * Sets the value of the AttorneyLicense field.
     * 
     */
    void setAttorneyLicense(String value);

    /**
     * Gets the value of the AttorneySpecialty field.
     * Attorney's specialty
     * 
     */
    LegalSpecialty getAttorneySpecialty();

    /**
     * Sets the value of the AttorneySpecialty field.
     * 
     */
    void setAttorneySpecialty(LegalSpecialty value);

}
