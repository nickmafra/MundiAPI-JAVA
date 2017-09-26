/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class CreateCheckoutCardPaymentRequestBuilder {
    //the instance to build
    private CreateCheckoutCardPaymentRequest createCheckoutCardPaymentRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CreateCheckoutCardPaymentRequestBuilder() {
        createCheckoutCardPaymentRequest = new CreateCheckoutCardPaymentRequest();
    }

    /**
     * Card invoice text descriptor
     */
    public CreateCheckoutCardPaymentRequestBuilder statementDescriptor(String statementDescriptor) {
        createCheckoutCardPaymentRequest.setStatementDescriptor(statementDescriptor);
        return this;
    }

    /**
     * Payment installment options
     */
    public CreateCheckoutCardPaymentRequestBuilder installments(List<CreateCheckoutCardInstallmentOptionRequest> installments) {
        createCheckoutCardPaymentRequest.setInstallments(installments);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateCheckoutCardPaymentRequest build() {
        return createCheckoutCardPaymentRequest;
    }
}