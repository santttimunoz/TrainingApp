
package extensions.ab.internal.domain.contact.gen;

import java.util.Date;
import com.guidewire.commons.metadata.types.ColumnPropertyInfoCache;
import com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference;
import com.guidewire.commons.metadata.types.LinkPropertyInfoCache;
import com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache;
import extensions.ab.contact.entity.VendorEvaluation;
import extensions.ab.contact.entity.Verifiable_Ext;
import extensions.ab.contact.typekey.VendorEvaluationStatus;
import gw.ab.addressbook.entity.ABContact;
import gw.entity.IColumnPropertyInfo;
import gw.entity.ILinkPropertyInfo;
import gw.entity.ITypekeyPropertyInfo;
import gw.pl.persistence.core.entity.Retireable;
import gw.pl.persistence.type.EntityPropertyInfoReference;
import gw.pl.persistence.type.EntityTypeReference;

public interface VendorEvaluationStubI
    extends Verifiable_Ext, Retireable
{

    EntityTypeReference<VendorEvaluation> TYPE = new EntityIntrinsicTypeReference<VendorEvaluation>("entity.VendorEvaluation");
    EntityPropertyInfoReference<IColumnPropertyInfo> LOADCOMMANDID_PROP = new ColumnPropertyInfoCache(TYPE, "LoadCommandID");
    EntityPropertyInfoReference<IColumnPropertyInfo> EVALUATOR_PROP = new ColumnPropertyInfoCache(TYPE, "Evaluator");
    EntityPropertyInfoReference<IColumnPropertyInfo> EVALUATIONDATE_PROP = new ColumnPropertyInfoCache(TYPE, "EvaluationDate");
    EntityPropertyInfoReference<IColumnPropertyInfo> SCORE_TIMELINESS_PROP = new ColumnPropertyInfoCache(TYPE, "Score_Timeliness");
    EntityPropertyInfoReference<IColumnPropertyInfo> SCORE_COMMUNICATION_PROP = new ColumnPropertyInfoCache(TYPE, "Score_Communication");
    EntityPropertyInfoReference<IColumnPropertyInfo> SCORE_QUALITYOFWORK_PROP = new ColumnPropertyInfoCache(TYPE, "Score_QualityOfWork");
    EntityPropertyInfoReference<IColumnPropertyInfo> SCORE_PRICING_PROP = new ColumnPropertyInfoCache(TYPE, "Score_Pricing");
    EntityPropertyInfoReference<IColumnPropertyInfo> TOTAL_SCORE_PROP = new ColumnPropertyInfoCache(TYPE, "Total_Score");
    EntityPropertyInfoReference<IColumnPropertyInfo> EVALUATORCOMMENT_PROP = new ColumnPropertyInfoCache(TYPE, "EvaluatorComment");
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
    EntityPropertyInfoReference<IColumnPropertyInfo> REQUIRESVERIFICATION_PROP = new ColumnPropertyInfoCache(TYPE, "RequiresVerification");
    EntityPropertyInfoReference<IColumnPropertyInfo> VERIFICATIONDATE_PROP = new ColumnPropertyInfoCache(TYPE, "VerificationDate");
    EntityPropertyInfoReference<IColumnPropertyInfo> VERIFICATIONDUEDATE_PROP = new ColumnPropertyInfoCache(TYPE, "VerificationDueDate");
    EntityPropertyInfoReference<ITypekeyPropertyInfo> PRIORITY_PROP = new TypekeyPropertyInfoCache(TYPE, "Priority");

    /**
     * Gets the value of the LoadCommandID field.
     * 
     * 
     */
    Long getLoadCommandID();

    /**
     * Gets the value of the Evaluator field.
     * Evaluator
     * 
     */
    String getEvaluator();

    /**
     * Sets the value of the Evaluator field.
     * 
     */
    void setEvaluator(String value);

    /**
     * Gets the value of the EvaluationDate field.
     * Date evaluation occurred
     * 
     */
    Date getEvaluationDate();

    /**
     * Sets the value of the EvaluationDate field.
     * 
     */
    void setEvaluationDate(Date value);

    /**
     * Gets the value of the Score_Timeliness field.
     * Score for timeliness
     * 
     */
    Integer getScore_Timeliness();

    /**
     * Sets the value of the Score_Timeliness field.
     * 
     */
    void setScore_Timeliness(Integer value);

    /**
     * Gets the value of the Score_Communication field.
     * Score for communication
     * 
     */
    Integer getScore_Communication();

    /**
     * Sets the value of the Score_Communication field.
     * 
     */
    void setScore_Communication(Integer value);

    /**
     * Gets the value of the Score_QualityOfWork field.
     * Score for quality of work
     * 
     */
    Integer getScore_QualityOfWork();

    /**
     * Sets the value of the Score_QualityOfWork field.
     * 
     */
    void setScore_QualityOfWork(Integer value);

    /**
     * Gets the value of the Score_Pricing field.
     * Score for pricing
     * 
     */
    Integer getScore_Pricing();

    /**
     * Sets the value of the Score_Pricing field.
     * 
     */
    void setScore_Pricing(Integer value);

    /**
     * Gets the value of the Total_Score field.
     * Total_Score
     * 
     */
    Integer getTotal_Score();

    /**
     * Sets the value of the Total_Score field.
     * 
     */
    void setTotal_Score(Integer value);

    /**
     * Gets the value of the EvaluatorComment field.
     * Communicator
     * 
     */
    String getEvaluatorComment();

    /**
     * Sets the value of the EvaluatorComment field.
     * 
     */
    void setEvaluatorComment(String value);

    /**
     * Gets the value of the Status field.
     * Status of vendor evaluation
     * 
     */
    VendorEvaluationStatus getStatus();

    /**
     * Sets the value of the Status field.
     * 
     */
    void setStatus(VendorEvaluationStatus value);

    /**
     * Gets the value of the ABContact field.
     * Contact under evaluation
     * 
     */
    ABContact getABContact();

    /**
     * Sets the value of the ABContact field.
     * 
     */
    void setABContact(ABContact value);

}
