/**
 * IReviewSummaryAPIService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;

public interface IReviewSummaryAPIService extends javax.xml.rpc.Service {

/**
 * IReviewSummaryAPI provides methods for creating and deleting review
 * summaries corresponding to contact
 * Reviews on ClaimCenter.
 * @deprecated Since 8.0.0.  Please use the ABVendorEvaluationAPI
 */
    public java.lang.String getIReviewSummaryAPIAddress();

    public com.guidewire.ab.webservices.api.IReviewSummaryAPI getIReviewSummaryAPI() throws javax.xml.rpc.ServiceException;

    public com.guidewire.ab.webservices.api.IReviewSummaryAPI getIReviewSummaryAPI(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
