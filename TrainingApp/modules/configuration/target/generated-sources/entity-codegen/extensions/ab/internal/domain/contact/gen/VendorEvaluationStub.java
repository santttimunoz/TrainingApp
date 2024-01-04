
package extensions.ab.internal.domain.contact.gen;

import java.util.Date;
import com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy;
import extensions.ab.contact.entity.Verifiable_Ext;
import extensions.ab.contact.typekey.VendorEvaluationStatus;
import extensions.ab.internal.domain.contact.impl.Verifiable_ExtInternal;
import gw.ab.addressbook.entity.ABContact;
import gw.pl.activity.typekey.Priority;
import gw.pl.persistence.core.Key;

public abstract class VendorEvaluationStub
    extends AbstractEditableRetireableBeanProxy
    implements VendorEvaluationInternalStubI
{


    @Override
    public Long getLoadCommandID() {
        return ((Long) getFieldValue(LOADCOMMANDID_PROP.get()));
    }

    @Override
    public void setLoadCommandID(Long value) {
        setFieldValue(LOADCOMMANDID_PROP.get(), value);
    }

    @Override
    public String getEvaluator() {
        return ((String) getFieldValueForCodegen(EVALUATOR_PROP.get()));
    }

    @Override
    public void setEvaluator(String value) {
        setFieldValueForCodegen(EVALUATOR_PROP.get(), value);
    }

    @Override
    public Date getEvaluationDate() {
        return ((Date) getFieldValue(EVALUATIONDATE_PROP.get()));
    }

    @Override
    public void setEvaluationDate(Date value) {
        setFieldValue(EVALUATIONDATE_PROP.get(), value);
    }

    @Override
    public Integer getScore_Timeliness() {
        return ((Integer) getFieldValue(SCORE_TIMELINESS_PROP.get()));
    }

    @Override
    public void setScore_Timeliness(Integer value) {
        setFieldValue(SCORE_TIMELINESS_PROP.get(), value);
    }

    @Override
    public Integer getScore_Communication() {
        return ((Integer) getFieldValue(SCORE_COMMUNICATION_PROP.get()));
    }

    @Override
    public void setScore_Communication(Integer value) {
        setFieldValue(SCORE_COMMUNICATION_PROP.get(), value);
    }

    @Override
    public Integer getScore_QualityOfWork() {
        return ((Integer) getFieldValue(SCORE_QUALITYOFWORK_PROP.get()));
    }

    @Override
    public void setScore_QualityOfWork(Integer value) {
        setFieldValue(SCORE_QUALITYOFWORK_PROP.get(), value);
    }

    @Override
    public Integer getScore_Pricing() {
        return ((Integer) getFieldValue(SCORE_PRICING_PROP.get()));
    }

    @Override
    public void setScore_Pricing(Integer value) {
        setFieldValue(SCORE_PRICING_PROP.get(), value);
    }

    @Override
    public Integer getTotal_Score() {
        return ((Integer) getFieldValue(TOTAL_SCORE_PROP.get()));
    }

    @Override
    public void setTotal_Score(Integer value) {
        setFieldValue(TOTAL_SCORE_PROP.get(), value);
    }

    @Override
    public String getEvaluatorComment() {
        return ((String) getFieldValueForCodegen(EVALUATORCOMMENT_PROP.get()));
    }

    @Override
    public void setEvaluatorComment(String value) {
        setFieldValueForCodegen(EVALUATORCOMMENT_PROP.get(), value);
    }

    @Override
    public VendorEvaluationStatus getStatus() {
        return ((VendorEvaluationStatus) getFieldValue(STATUS_PROP.get()));
    }

    @Override
    public void setStatus(VendorEvaluationStatus value) {
        setFieldValue(STATUS_PROP.get(), value);
    }

    @Override
    public ABContact getABContact() {
        return ((ABContact) getFieldValue(ABCONTACT_PROP.get()));
    }

    @Override
    public void setABContact(ABContact value) {
        setFieldValue(ABCONTACT_PROP.get(), value);
    }

    @Override
    public Key getABContactID() {
        return ((Key) getRawFieldValue(ABCONTACT_PROP.get()));
    }

    @Override
    public void setABContactID(Key value) {
        setFieldValue(ABCONTACT_PROP.get(), value);
    }

    @Override
    public Boolean isRequiresVerification() {
        return ((Verifiable_ExtInternal) getEntityDelegate(Verifiable_Ext.class)).isRequiresVerification();
    }

    @Override
    public void setRequiresVerification(Boolean value) {
        ((Verifiable_ExtInternal) getEntityDelegate(Verifiable_Ext.class)).setRequiresVerification(value);
    }

    @Override
    public Date getVerificationDate() {
        return ((Verifiable_ExtInternal) getEntityDelegate(Verifiable_Ext.class)).getVerificationDate();
    }

    @Override
    public void setVerificationDate(Date value) {
        ((Verifiable_ExtInternal) getEntityDelegate(Verifiable_Ext.class)).setVerificationDate(value);
    }

    @Override
    public Date getVerificationDueDate() {
        return ((Verifiable_ExtInternal) getEntityDelegate(Verifiable_Ext.class)).getVerificationDueDate();
    }

    @Override
    public void setVerificationDueDate(Date value) {
        ((Verifiable_ExtInternal) getEntityDelegate(Verifiable_Ext.class)).setVerificationDueDate(value);
    }

    @Override
    public Priority getPriority() {
        return ((Verifiable_ExtInternal) getEntityDelegate(Verifiable_Ext.class)).getPriority();
    }

    @Override
    public void setPriority(Priority value) {
        ((Verifiable_ExtInternal) getEntityDelegate(Verifiable_Ext.class)).setPriority(value);
    }

}
