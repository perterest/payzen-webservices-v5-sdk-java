
package com.lyra.vads.ws.v5;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PaymentAPI", targetNamespace = "http://v5.ws.vads.lyra.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PaymentAPI {


    /**
     * 
     * @param commonRequest
     * @param paymentRequest
     * @param queryRequest
     * @return
     *     returns com.lyra.vads.ws.v5.RefundPaymentResponse.RefundPaymentResult
     */
    @WebMethod
    @WebResult(name = "refundPaymentResult", targetNamespace = "")
    @RequestWrapper(localName = "refundPayment", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.RefundPayment")
    @ResponseWrapper(localName = "refundPaymentResponse", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.RefundPaymentResponse")
    public com.lyra.vads.ws.v5.RefundPaymentResponse.RefundPaymentResult refundPayment(
        @WebParam(name = "commonRequest", targetNamespace = "")
        CommonRequest commonRequest,
        @WebParam(name = "paymentRequest", targetNamespace = "")
        PaymentRequest paymentRequest,
        @WebParam(name = "queryRequest", targetNamespace = "")
        QueryRequest queryRequest);

    /**
     * 
     * @param settlementRequest
     * @return
     *     returns com.lyra.vads.ws.v5.CapturePaymentResponse.CapturePaymentResult
     */
    @WebMethod
    @WebResult(name = "capturePaymentResult", targetNamespace = "")
    @RequestWrapper(localName = "capturePayment", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.CapturePayment")
    @ResponseWrapper(localName = "capturePaymentResponse", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.CapturePaymentResponse")
    public com.lyra.vads.ws.v5.CapturePaymentResponse.CapturePaymentResult capturePayment(
        @WebParam(name = "settlementRequest", targetNamespace = "")
        SettlementRequest settlementRequest);

    /**
     * 
     * @param queryRequest
     * @return
     *     returns com.lyra.vads.ws.v5.ReactivateTokenResponse.ReactivateTokenResult
     */
    @WebMethod
    @WebResult(name = "reactivateTokenResult", targetNamespace = "")
    @RequestWrapper(localName = "reactivateToken", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.ReactivateToken")
    @ResponseWrapper(localName = "reactivateTokenResponse", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.ReactivateTokenResponse")
    public com.lyra.vads.ws.v5.ReactivateTokenResponse.ReactivateTokenResult reactivateToken(
        @WebParam(name = "queryRequest", targetNamespace = "")
        QueryRequest queryRequest);

    /**
     * 
     * @param commonRequest
     * @param orderRequest
     * @param paymentRequest
     * @param queryRequest
     * @return
     *     returns com.lyra.vads.ws.v5.DuplicatePaymentResponse.DuplicatePaymentResult
     */
    @WebMethod
    @WebResult(name = "duplicatePaymentResult", targetNamespace = "")
    @RequestWrapper(localName = "duplicatePayment", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.DuplicatePayment")
    @ResponseWrapper(localName = "duplicatePaymentResponse", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.DuplicatePaymentResponse")
    public com.lyra.vads.ws.v5.DuplicatePaymentResponse.DuplicatePaymentResult duplicatePayment(
        @WebParam(name = "commonRequest", targetNamespace = "")
        CommonRequest commonRequest,
        @WebParam(name = "paymentRequest", targetNamespace = "")
        PaymentRequest paymentRequest,
        @WebParam(name = "orderRequest", targetNamespace = "")
        OrderRequest orderRequest,
        @WebParam(name = "queryRequest", targetNamespace = "")
        QueryRequest queryRequest);

    /**
     * 
     * @param cardRequest
     * @param commonRequest
     * @param techRequest
     * @param paymentRequest
     * @return
     *     returns com.lyra.vads.ws.v5.VerifyThreeDSEnrollmentResponse.VerifyThreeDSEnrollmentResult
     */
    @WebMethod
    @WebResult(name = "verifyThreeDSEnrollmentResult", targetNamespace = "")
    @RequestWrapper(localName = "verifyThreeDSEnrollment", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.VerifyThreeDSEnrollment")
    @ResponseWrapper(localName = "verifyThreeDSEnrollmentResponse", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.VerifyThreeDSEnrollmentResponse")
    public com.lyra.vads.ws.v5.VerifyThreeDSEnrollmentResponse.VerifyThreeDSEnrollmentResult verifyThreeDSEnrollment(
        @WebParam(name = "commonRequest", targetNamespace = "")
        CommonRequest commonRequest,
        @WebParam(name = "paymentRequest", targetNamespace = "")
        PaymentRequest paymentRequest,
        @WebParam(name = "cardRequest", targetNamespace = "")
        CardRequest cardRequest,
        @WebParam(name = "techRequest", targetNamespace = "")
        TechRequest techRequest);

    /**
     * 
     * @param commonRequest
     * @param queryRequest
     * @return
     *     returns com.lyra.vads.ws.v5.ValidatePaymentResponse.ValidatePaymentResult
     */
    @WebMethod
    @WebResult(name = "validatePaymentResult", targetNamespace = "")
    @RequestWrapper(localName = "validatePayment", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.ValidatePayment")
    @ResponseWrapper(localName = "validatePaymentResponse", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.ValidatePaymentResponse")
    public com.lyra.vads.ws.v5.ValidatePaymentResponse.ValidatePaymentResult validatePayment(
        @WebParam(name = "commonRequest", targetNamespace = "")
        CommonRequest commonRequest,
        @WebParam(name = "queryRequest", targetNamespace = "")
        QueryRequest queryRequest);

    /**
     * 
     * @param commonRequest
     * @param queryRequest
     * @return
     *     returns com.lyra.vads.ws.v5.CancelPaymentResponse.CancelPaymentResult
     */
    @WebMethod
    @WebResult(name = "cancelPaymentResult", targetNamespace = "")
    @RequestWrapper(localName = "cancelPayment", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.CancelPayment")
    @ResponseWrapper(localName = "cancelPaymentResponse", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.CancelPaymentResponse")
    public com.lyra.vads.ws.v5.CancelPaymentResponse.CancelPaymentResult cancelPayment(
        @WebParam(name = "commonRequest", targetNamespace = "")
        CommonRequest commonRequest,
        @WebParam(name = "queryRequest", targetNamespace = "")
        QueryRequest queryRequest);

    /**
     * 
     * @param threeDSRequest
     * @param commonRequest
     * @return
     *     returns com.lyra.vads.ws.v5.CheckThreeDSAuthenticationResponse.CheckThreeDSAuthenticationResult
     */
    @WebMethod
    @WebResult(name = "checkThreeDSAuthenticationResult", targetNamespace = "")
    @RequestWrapper(localName = "checkThreeDSAuthentication", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.CheckThreeDSAuthentication")
    @ResponseWrapper(localName = "checkThreeDSAuthenticationResponse", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.CheckThreeDSAuthenticationResponse")
    public com.lyra.vads.ws.v5.CheckThreeDSAuthenticationResponse.CheckThreeDSAuthenticationResult checkThreeDSAuthentication(
        @WebParam(name = "commonRequest", targetNamespace = "")
        CommonRequest commonRequest,
        @WebParam(name = "threeDSRequest", targetNamespace = "")
        ThreeDSRequest threeDSRequest);

    /**
     * 
     * @param legacyTransactionKeyRequest
     * @return
     *     returns com.lyra.vads.ws.v5.GetPaymentUuidResponse.LegacyTransactionKeyResult
     */
    @WebMethod
    @WebResult(name = "legacyTransactionKeyResult", targetNamespace = "")
    @RequestWrapper(localName = "getPaymentUuid", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.GetPaymentUuid")
    @ResponseWrapper(localName = "getPaymentUuidResponse", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.GetPaymentUuidResponse")
    public com.lyra.vads.ws.v5.GetPaymentUuidResponse.LegacyTransactionKeyResult getPaymentUuid(
        @WebParam(name = "legacyTransactionKeyRequest", targetNamespace = "")
        LegacyTransactionKeyRequest legacyTransactionKeyRequest);

    /**
     * 
     * @param commonRequest
     * @param queryRequest
     * @param paymentRequest
     * @return
     *     returns com.lyra.vads.ws.v5.UpdatePaymentResponse.UpdatePaymentResult
     */
    @WebMethod
    @WebResult(name = "updatePaymentResult", targetNamespace = "")
    @RequestWrapper(localName = "updatePayment", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.UpdatePayment")
    @ResponseWrapper(localName = "updatePaymentResponse", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.UpdatePaymentResponse")
    public com.lyra.vads.ws.v5.UpdatePaymentResponse.UpdatePaymentResult updatePayment(
        @WebParam(name = "commonRequest", targetNamespace = "")
        CommonRequest commonRequest,
        @WebParam(name = "queryRequest", targetNamespace = "")
        QueryRequest queryRequest,
        @WebParam(name = "paymentRequest", targetNamespace = "")
        PaymentRequest paymentRequest);

    /**
     * 
     * @param threeDSRequest
     * @param cardRequest
     * @param commonRequest
     * @param orderRequest
     * @param techRequest
     * @param shoppingCartRequest
     * @param paymentRequest
     * @param customerRequest
     * @return
     *     returns com.lyra.vads.ws.v5.CreatePaymentResponse.CreatePaymentResult
     */
    @WebMethod
    @WebResult(name = "createPaymentResult", targetNamespace = "")
    @RequestWrapper(localName = "createPayment", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.CreatePayment")
    @ResponseWrapper(localName = "createPaymentResponse", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.CreatePaymentResponse")
    public com.lyra.vads.ws.v5.CreatePaymentResponse.CreatePaymentResult createPayment(
        @WebParam(name = "commonRequest", targetNamespace = "")
        CommonRequest commonRequest,
        @WebParam(name = "threeDSRequest", targetNamespace = "")
        ThreeDSRequest threeDSRequest,
        @WebParam(name = "paymentRequest", targetNamespace = "")
        PaymentRequest paymentRequest,
        @WebParam(name = "orderRequest", targetNamespace = "")
        OrderRequest orderRequest,
        @WebParam(name = "cardRequest", targetNamespace = "")
        CardRequest cardRequest,
        @WebParam(name = "customerRequest", targetNamespace = "")
        CustomerRequest customerRequest,
        @WebParam(name = "techRequest", targetNamespace = "")
        TechRequest techRequest,
        @WebParam(name = "shoppingCartRequest", targetNamespace = "")
        ShoppingCartRequest shoppingCartRequest);

    /**
     * 
     * @param cardRequest
     * @param commonRequest
     * @param orderRequest
     * @param subscriptionRequest
     * @return
     *     returns com.lyra.vads.ws.v5.CreateSubscriptionResponse.CreateSubscriptionResult
     */
    @WebMethod
    @WebResult(name = "createSubscriptionResult", targetNamespace = "")
    @RequestWrapper(localName = "createSubscription", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.CreateSubscription")
    @ResponseWrapper(localName = "createSubscriptionResponse", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.CreateSubscriptionResponse")
    public com.lyra.vads.ws.v5.CreateSubscriptionResponse.CreateSubscriptionResult createSubscription(
        @WebParam(name = "commonRequest", targetNamespace = "")
        CommonRequest commonRequest,
        @WebParam(name = "orderRequest", targetNamespace = "")
        OrderRequest orderRequest,
        @WebParam(name = "subscriptionRequest", targetNamespace = "")
        SubscriptionRequest subscriptionRequest,
        @WebParam(name = "cardRequest", targetNamespace = "")
        CardRequest cardRequest);

    /**
     * 
     * @param queryRequest
     * @return
     *     returns com.lyra.vads.ws.v5.GetSubscriptionDetailsResponse.GetSubscriptionDetailsResult
     */
    @WebMethod
    @WebResult(name = "getSubscriptionDetailsResult", targetNamespace = "")
    @RequestWrapper(localName = "getSubscriptionDetails", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.GetSubscriptionDetails")
    @ResponseWrapper(localName = "getSubscriptionDetailsResponse", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.GetSubscriptionDetailsResponse")
    public com.lyra.vads.ws.v5.GetSubscriptionDetailsResponse.GetSubscriptionDetailsResult getSubscriptionDetails(
        @WebParam(name = "queryRequest", targetNamespace = "")
        QueryRequest queryRequest);

    /**
     * 
     * @param commonRequest
     * @param queryRequest
     * @param subscriptionRequest
     * @return
     *     returns com.lyra.vads.ws.v5.UpdateSubscriptionResponse.UpdateSubscriptionResult
     */
    @WebMethod
    @WebResult(name = "updateSubscriptionResult", targetNamespace = "")
    @RequestWrapper(localName = "updateSubscription", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.UpdateSubscription")
    @ResponseWrapper(localName = "updateSubscriptionResponse", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.UpdateSubscriptionResponse")
    public com.lyra.vads.ws.v5.UpdateSubscriptionResponse.UpdateSubscriptionResult updateSubscription(
        @WebParam(name = "commonRequest", targetNamespace = "")
        CommonRequest commonRequest,
        @WebParam(name = "queryRequest", targetNamespace = "")
        QueryRequest queryRequest,
        @WebParam(name = "subscriptionRequest", targetNamespace = "")
        SubscriptionRequest subscriptionRequest);

    /**
     * 
     * @param commonRequest
     * @param queryRequest
     * @return
     *     returns com.lyra.vads.ws.v5.CancelTokenResponse.CancelTokenResult
     */
    @WebMethod
    @WebResult(name = "cancelTokenResult", targetNamespace = "")
    @RequestWrapper(localName = "cancelToken", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.CancelToken")
    @ResponseWrapper(localName = "cancelTokenResponse", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.CancelTokenResponse")
    public com.lyra.vads.ws.v5.CancelTokenResponse.CancelTokenResult cancelToken(
        @WebParam(name = "commonRequest", targetNamespace = "")
        CommonRequest commonRequest,
        @WebParam(name = "queryRequest", targetNamespace = "")
        QueryRequest queryRequest);

    /**
     * 
     * @param cardRequest
     * @param commonRequest
     * @param customerRequest
     * @return
     *     returns com.lyra.vads.ws.v5.CreateTokenResponse.CreateTokenResult
     */
    @WebMethod
    @WebResult(name = "createTokenResult", targetNamespace = "")
    @RequestWrapper(localName = "createToken", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.CreateToken")
    @ResponseWrapper(localName = "createTokenResponse", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.CreateTokenResponse")
    public com.lyra.vads.ws.v5.CreateTokenResponse.CreateTokenResult createToken(
        @WebParam(name = "commonRequest", targetNamespace = "")
        CommonRequest commonRequest,
        @WebParam(name = "cardRequest", targetNamespace = "")
        CardRequest cardRequest,
        @WebParam(name = "customerRequest", targetNamespace = "")
        CustomerRequest customerRequest);

    /**
     * 
     * @param queryRequest
     * @return
     *     returns com.lyra.vads.ws.v5.FindPaymentsResponse.FindPaymentsResult
     */
    @WebMethod
    @WebResult(name = "findPaymentsResult", targetNamespace = "")
    @RequestWrapper(localName = "findPayments", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.FindPayments")
    @ResponseWrapper(localName = "findPaymentsResponse", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.FindPaymentsResponse")
    public com.lyra.vads.ws.v5.FindPaymentsResponse.FindPaymentsResult findPayments(
        @WebParam(name = "queryRequest", targetNamespace = "")
        QueryRequest queryRequest);

    /**
     * 
     * @param queryRequest
     * @return
     *     returns com.lyra.vads.ws.v5.GetPaymentDetailsResponse.GetPaymentDetailsResult
     */
    @WebMethod
    @WebResult(name = "getPaymentDetailsResult", targetNamespace = "")
    @RequestWrapper(localName = "getPaymentDetails", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.GetPaymentDetails")
    @ResponseWrapper(localName = "getPaymentDetailsResponse", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.GetPaymentDetailsResponse")
    public com.lyra.vads.ws.v5.GetPaymentDetailsResponse.GetPaymentDetailsResult getPaymentDetails(
        @WebParam(name = "queryRequest", targetNamespace = "")
        QueryRequest queryRequest);

    /**
     * 
     * @param cardRequest
     * @param commonRequest
     * @param queryRequest
     * @param customerRequest
     * @return
     *     returns com.lyra.vads.ws.v5.UpdateTokenResponse.UpdateTokenResult
     */
    @WebMethod
    @WebResult(name = "updateTokenResult", targetNamespace = "")
    @RequestWrapper(localName = "updateToken", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.UpdateToken")
    @ResponseWrapper(localName = "updateTokenResponse", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.UpdateTokenResponse")
    public com.lyra.vads.ws.v5.UpdateTokenResponse.UpdateTokenResult updateToken(
        @WebParam(name = "commonRequest", targetNamespace = "")
        CommonRequest commonRequest,
        @WebParam(name = "queryRequest", targetNamespace = "")
        QueryRequest queryRequest,
        @WebParam(name = "cardRequest", targetNamespace = "")
        CardRequest cardRequest,
        @WebParam(name = "customerRequest", targetNamespace = "")
        CustomerRequest customerRequest);

    /**
     * 
     * @param commonRequest
     * @param queryRequest
     * @return
     *     returns com.lyra.vads.ws.v5.CancelSubscriptionResponse.CancelSubscriptionResult
     */
    @WebMethod
    @WebResult(name = "cancelSubscriptionResult", targetNamespace = "")
    @RequestWrapper(localName = "cancelSubscription", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.CancelSubscription")
    @ResponseWrapper(localName = "cancelSubscriptionResponse", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.CancelSubscriptionResponse")
    public com.lyra.vads.ws.v5.CancelSubscriptionResponse.CancelSubscriptionResult cancelSubscription(
        @WebParam(name = "commonRequest", targetNamespace = "")
        CommonRequest commonRequest,
        @WebParam(name = "queryRequest", targetNamespace = "")
        QueryRequest queryRequest);

    /**
     * 
     * @param queryRequest
     * @return
     *     returns com.lyra.vads.ws.v5.GetTokenDetailsResponse.GetTokenDetailsResult
     */
    @WebMethod
    @WebResult(name = "getTokenDetailsResult", targetNamespace = "")
    @RequestWrapper(localName = "getTokenDetails", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.GetTokenDetails")
    @ResponseWrapper(localName = "getTokenDetailsResponse", targetNamespace = "http://v5.ws.vads.lyra.com/", className = "com.lyra.vads.ws.v5.GetTokenDetailsResponse")
    public com.lyra.vads.ws.v5.GetTokenDetailsResponse.GetTokenDetailsResult getTokenDetails(
        @WebParam(name = "queryRequest", targetNamespace = "")
        QueryRequest queryRequest);

}
