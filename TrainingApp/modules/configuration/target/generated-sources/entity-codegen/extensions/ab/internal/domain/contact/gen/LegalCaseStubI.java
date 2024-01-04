
package extensions.ab.internal.domain.contact.gen;

import java.util.Date;
import com.guidewire.commons.metadata.types.ColumnPropertyInfoCache;
import com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference;
import com.guidewire.commons.metadata.types.LinkPropertyInfoCache;
import com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache;
import extensions.ab.contact.entity.LegalCase;
import extensions.ab.contact.typekey.LegalCaseStatus;
import extensions.ab.contact.typekey.LegalCaseType;
import gw.ab.addressbook.entity.ABContact;
import gw.entity.IColumnPropertyInfo;
import gw.entity.ILinkPropertyInfo;
import gw.entity.ITypekeyPropertyInfo;
import gw.pl.persistence.core.entity.Retireable;
import gw.pl.persistence.type.EntityPropertyInfoReference;
import gw.pl.persistence.type.EntityTypeReference;

public interface LegalCaseStubI
    extends Retireable
{

    EntityTypeReference<LegalCase> TYPE = new EntityIntrinsicTypeReference<LegalCase>("entity.LegalCase");
    EntityPropertyInfoReference<IColumnPropertyInfo> LOADCOMMANDID_PROP = new ColumnPropertyInfoCache(TYPE, "LoadCommandID");
    EntityPropertyInfoReference<IColumnPropertyInfo> FILEDATE_PROP = new ColumnPropertyInfoCache(TYPE, "FileDate");
    EntityPropertyInfoReference<IColumnPropertyInfo> FILEDBYCONTACT_PROP = new ColumnPropertyInfoCache(TYPE, "FiledByContact");
    EntityPropertyInfoReference<IColumnPropertyInfo> PLAINTIFF_PROP = new ColumnPropertyInfoCache(TYPE, "Plaintiff");
    EntityPropertyInfoReference<IColumnPropertyInfo> DEFENDANT_PROP = new ColumnPropertyInfoCache(TYPE, "Defendant");
    EntityPropertyInfoReference<ITypekeyPropertyInfo> CASETYPE_PROP = new TypekeyPropertyInfoCache(TYPE, "CaseType");
    EntityPropertyInfoReference<ITypekeyPropertyInfo> STATUS_PROP = new TypekeyPropertyInfoCache(TYPE, "Status");
    EntityPropertyInfoReference<ILinkPropertyInfo> ABCONTACT_PROP = new LinkPropertyInfoCache(TYPE, "ABContact");
    EntityPropertyInfoReference<IColumnPropertyInfo> RETIREDVALUE_PROP = new ColumnPropertyInfoCache(TYPE, "RetiredValue");
    EntityPropertyInfoReference<IColumnPropertyInfo> CREATETIME_PROP = new ColumnPropertyInfoCache(TYPE, "CreateTime");
    EntityPropertyInfoReference<IColumnPropertyInfo> UPDATETIME_PROP = new ColumnPropertyInfoCache(TYPE, "UpdateTime");
    EntityPropertyInfoReference<ILinkPropertyInfo> CREATEUSER_PROP = new LinkPropertyInfoCache(TYPE, "CreateUser");
    EntityPropertyInfoReference<ILinkPropertyInfo> UPDATEUSER_PROP = new LinkPropertyInfoCache(TYPE, "UpdateUser");
    EntityPropertyInfoReference<IColumnPropertyInfo> BEANVERSION_PROP = new ColumnPropertyInfoCache(TYPE, "BeanVersion");
    EntityPropertyInfoReference<IColumnPropertyInfo> ID_PROP = new ColumnPropertyInfoCache(TYPE, "ID");
    EntityPropertyInfoReference<IColumnPropertyInfo> PUBLICID_PROP = new ColumnPropertyInfoCache(TYPE, "PublicID");

    /**
     * Gets the value of the LoadCommandID field.
     * 
     * 
     */
    Long getLoadCommandID();

    /**
     * Gets the value of the FileDate field.
     * Date the case was filed with the courts
     * 
     */
    Date getFileDate();

    /**
     * Sets the value of the FileDate field.
     * 
     */
    void setFileDate(Date value);

    /**
     * Gets the value of the FiledByContact field.
     * Did the contact file this case?
     * 
     */
    Boolean isFiledByContact();

    /**
     * Sets the value of the FiledByContact field.
     * 
     */
    void setFiledByContact(Boolean value);

    /**
     * Gets the value of the Plaintiff field.
     * Plaintiff of the lawsuit (if contact is defendant)
     * 
     */
    String getPlaintiff();

    /**
     * Sets the value of the Plaintiff field.
     * 
     */
    void setPlaintiff(String value);

    /**
     * Gets the value of the Defendant field.
     * Defendant of the lawsuit (if contact is the plaintiff)
     * 
     */
    String getDefendant();

    /**
     * Sets the value of the Defendant field.
     * 
     */
    void setDefendant(String value);

    /**
     * Gets the value of the CaseType field.
     * Type of case
     * 
     */
    LegalCaseType getCaseType();

    /**
     * Sets the value of the CaseType field.
     * 
     */
    void setCaseType(LegalCaseType value);

    /**
     * Gets the value of the Status field.
     * Status of case
     * 
     */
    LegalCaseStatus getStatus();

    /**
     * Sets the value of the Status field.
     * 
     */
    void setStatus(LegalCaseStatus value);

    /**
     * Gets the value of the ABContact field.
     * Associated contact
     * 
     */
    ABContact getABContact();

    /**
     * Sets the value of the ABContact field.
     * 
     */
    void setABContact(ABContact value);

}
