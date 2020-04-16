/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class CreateCreditCardPaymentRequestBuilder {
    //the instance to build
    private CreateCreditCardPaymentRequest createCreditCardPaymentRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CreateCreditCardPaymentRequestBuilder() {
        createCreditCardPaymentRequest = new CreateCreditCardPaymentRequest();
    }

    /**
     * Number of installments
     */
    public CreateCreditCardPaymentRequestBuilder installments(Integer installments) {
        createCreditCardPaymentRequest.setInstallments(installments);
        return this;
    }

    /**
     * The text that will be shown on the credit card's statement
     */
    public CreateCreditCardPaymentRequestBuilder statementDescriptor(String statementDescriptor) {
        createCreditCardPaymentRequest.setStatementDescriptor(statementDescriptor);
        return this;
    }

    /**
     * Credit card data
     */
    public CreateCreditCardPaymentRequestBuilder card(CreateCardRequest card) {
        createCreditCardPaymentRequest.setCard(card);
        return this;
    }

    /**
     * The credit card id
     */
    public CreateCreditCardPaymentRequestBuilder cardId(String cardId) {
        createCreditCardPaymentRequest.setCardId(cardId);
        return this;
    }

    public CreateCreditCardPaymentRequestBuilder cardToken(String cardToken) {
        createCreditCardPaymentRequest.setCardToken(cardToken);
        return this;
    }

    /**
     * Indicates a recurrence
     */
    public CreateCreditCardPaymentRequestBuilder recurrence(Boolean recurrence) {
        createCreditCardPaymentRequest.setRecurrence(recurrence);
        return this;
    }

    /**
     * Indicates if the operation should be only authorization or auth and capture.
     */
    public CreateCreditCardPaymentRequestBuilder capture(Boolean capture) {
        createCreditCardPaymentRequest.setCapture(capture);
        return this;
    }

    /**
     * Indicates whether the extended label (private label) is enabled
     */
    public CreateCreditCardPaymentRequestBuilder extendedLimitEnabled(Boolean extendedLimitEnabled) {
        createCreditCardPaymentRequest.setExtendedLimitEnabled(extendedLimitEnabled);
        return this;
    }

    /**
     * Extended Limit Code
     */
    public CreateCreditCardPaymentRequestBuilder extendedLimitCode(String extendedLimitCode) {
        createCreditCardPaymentRequest.setExtendedLimitCode(extendedLimitCode);
        return this;
    }

    /**
     * Customer business segment code
     */
    public CreateCreditCardPaymentRequestBuilder merchantCategoryCode(Long merchantCategoryCode) {
        createCreditCardPaymentRequest.setMerchantCategoryCode(merchantCategoryCode);
        return this;
    }

    /**
     * The payment authentication request
     */
    public CreateCreditCardPaymentRequestBuilder authentication(CreatePaymentAuthenticationRequest authentication) {
        createCreditCardPaymentRequest.setAuthentication(authentication);
        return this;
    }

    /**
     * The Credit card payment contactless request
     */
    public CreateCreditCardPaymentRequestBuilder contactless(CreateCardPaymentContactlessRequest contactless) {
        createCreditCardPaymentRequest.setContactless(contactless);
        return this;
    }

    /**
     * Indicates whether a particular payment will enter the offline retry flow
     */
    public CreateCreditCardPaymentRequestBuilder autoRecovery(Boolean autoRecovery) {
        createCreditCardPaymentRequest.setAutoRecovery(autoRecovery);
        return this;
    }

    /**
     * AuthOnly, AuthAndCapture, PreAuth
     */
    public CreateCreditCardPaymentRequestBuilder operationType(String operationType) {
        createCreditCardPaymentRequest.setOperationType(operationType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateCreditCardPaymentRequest build() {
        return createCreditCardPaymentRequest;
    }
}