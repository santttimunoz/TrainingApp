
package extensions.ab.internal.domain.addressbook.gen;

import java.util.Date;
import com.guidewire.commons.metadata.types.ColumnPropertyInfoCache;
import gw.ab.addressbook.entity.ABCompany;
import gw.entity.IColumnPropertyInfo;
import gw.pl.persistence.type.EntityPropertyInfoReference;

public interface ABCompanyExtMethodsStubI {

    EntityPropertyInfoReference<IColumnPropertyInfo> CANADDEMPLOYEES_PROP = new ColumnPropertyInfoCache(ABCompany.TYPE, "CanAddEmployees");
    EntityPropertyInfoReference<IColumnPropertyInfo> INSPECTIONREQUIRED_PROP = new ColumnPropertyInfoCache(ABCompany.TYPE, "InspectionRequired");
    EntityPropertyInfoReference<IColumnPropertyInfo> INSPECTIONDATE_PROP = new ColumnPropertyInfoCache(ABCompany.TYPE, "InspectionDate");
    EntityPropertyInfoReference<IColumnPropertyInfo> EMPLOYEESCORE_PROP = new ColumnPropertyInfoCache(ABCompany.TYPE, "EmployeeScore");

    /**
     * Gets the value of the CanAddEmployees field.
     * Can employees be added to this company?
     * 
     */
    Boolean isCanAddEmployees();

    /**
     * Sets the value of the CanAddEmployees field.
     * 
     */
    void setCanAddEmployees(Boolean value);

    /**
     * Gets the value of the InspectionRequired field.
     * Is a business inspection required for this company?
     * 
     */
    Boolean isInspectionRequired();

    /**
     * Sets the value of the InspectionRequired field.
     * 
     */
    void setInspectionRequired(Boolean value);

    /**
     * Gets the value of the InspectionDate field.
     * Date of business inspection
     * 
     */
    Date getInspectionDate();

    /**
     * Sets the value of the InspectionDate field.
     * 
     */
    void setInspectionDate(Date value);

    /**
     * Gets the value of the EmployeeScore field.
     * This score measures how satisfied the company's employees are with the company
     * 
     */
    Integer getEmployeeScore();

    /**
     * Sets the value of the EmployeeScore field.
     * 
     */
    void setEmployeeScore(Integer value);

}
