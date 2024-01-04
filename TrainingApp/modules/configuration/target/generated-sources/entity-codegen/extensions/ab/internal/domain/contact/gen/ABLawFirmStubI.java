
package extensions.ab.internal.domain.contact.gen;

import com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference;
import com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache;
import extensions.ab.addressbook.typekey.LegalSpecialty;
import extensions.ab.contact.entity.ABLawFirm;
import gw.ab.addressbook.entity.ABCompanyVendor;
import gw.entity.ITypekeyPropertyInfo;
import gw.pl.persistence.type.EntityPropertyInfoReference;
import gw.pl.persistence.type.EntityTypeReference;

public interface ABLawFirmStubI
    extends ABCompanyVendor
{

    EntityTypeReference<ABLawFirm> TYPE = new EntityIntrinsicTypeReference<ABLawFirm>("entity.ABLawFirm");
    EntityPropertyInfoReference<ITypekeyPropertyInfo> LAWFIRMSPECIALTY_PROP = new TypekeyPropertyInfoCache(TYPE, "LawFirmSpecialty");

    /**
     * Gets the value of the LawFirmSpecialty field.
     * Law firm specialty
     * 
     */
    LegalSpecialty getLawFirmSpecialty();

    /**
     * Sets the value of the LawFirmSpecialty field.
     * 
     */
    void setLawFirmSpecialty(LegalSpecialty value);

}
