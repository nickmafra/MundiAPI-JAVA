/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class CreateCheckoutBoletoPaymentRequestBuilder {
    //the instance to build
    private CreateCheckoutBoletoPaymentRequest createCheckoutBoletoPaymentRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CreateCheckoutBoletoPaymentRequestBuilder() {
        createCheckoutBoletoPaymentRequest = new CreateCheckoutBoletoPaymentRequest();
    }

    /**
     * Bank identifier
     */
    public CreateCheckoutBoletoPaymentRequestBuilder bank(String bank) {
        createCheckoutBoletoPaymentRequest.setBank(bank);
        return this;
    }

    /**
     * Instructions
     */
    public CreateCheckoutBoletoPaymentRequestBuilder instructions(String instructions) {
        createCheckoutBoletoPaymentRequest.setInstructions(instructions);
        return this;
    }

    /**
     * Due date
     */
    public CreateCheckoutBoletoPaymentRequestBuilder dueAt(DateTime dueAt) {
        createCheckoutBoletoPaymentRequest.setDueAt(dueAt);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateCheckoutBoletoPaymentRequest build() {
        return createCheckoutBoletoPaymentRequest;
    }
}