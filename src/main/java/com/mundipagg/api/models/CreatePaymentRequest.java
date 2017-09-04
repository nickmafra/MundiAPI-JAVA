/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreatePaymentRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5150263770212336166L;
    private String paymentMethod;
    private CreateCreditCardPaymentRequest creditCard;
    private CreateBoletoPaymentRequest boleto;
    private String currency;
    private CreateVoucherPaymentRequest voucher;
    private CreateBankTransferPaymentRequest bankTransfer;
    private String gatewayAffiliationId;
    private Integer amount;
    /** GETTER
     * Payment method
     */
    @JsonGetter("payment_method")
    public String getPaymentMethod ( ) { 
        return this.paymentMethod;
    }
    
    /** SETTER
     * Payment method
     */
    @JsonSetter("payment_method")
    public void setPaymentMethod (String value) { 
        this.paymentMethod = value;
    }
 
    /** GETTER
     * Settings for credit card payment
     */
    @JsonGetter("credit_card")
    public CreateCreditCardPaymentRequest getCreditCard ( ) { 
        return this.creditCard;
    }
    
    /** SETTER
     * Settings for credit card payment
     */
    @JsonSetter("credit_card")
    public void setCreditCard (CreateCreditCardPaymentRequest value) { 
        this.creditCard = value;
    }
 
    /** GETTER
     * Settings for boleto payment
     */
    @JsonGetter("boleto")
    public CreateBoletoPaymentRequest getBoleto ( ) { 
        return this.boleto;
    }
    
    /** SETTER
     * Settings for boleto payment
     */
    @JsonSetter("boleto")
    public void setBoleto (CreateBoletoPaymentRequest value) { 
        this.boleto = value;
    }
 
    /** GETTER
     * Currency. Must be informed using 3 characters
     */
    @JsonGetter("currency")
    public String getCurrency ( ) { 
        return this.currency;
    }
    
    /** SETTER
     * Currency. Must be informed using 3 characters
     */
    @JsonSetter("currency")
    public void setCurrency (String value) { 
        this.currency = value;
    }
 
    /** GETTER
     * Settings for voucher payment
     */
    @JsonGetter("voucher")
    public CreateVoucherPaymentRequest getVoucher ( ) { 
        return this.voucher;
    }
    
    /** SETTER
     * Settings for voucher payment
     */
    @JsonSetter("voucher")
    public void setVoucher (CreateVoucherPaymentRequest value) { 
        this.voucher = value;
    }
 
    /** GETTER
     * Settings for bank transfer payment
     */
    @JsonGetter("bank_transfer")
    public CreateBankTransferPaymentRequest getBankTransfer ( ) { 
        return this.bankTransfer;
    }
    
    /** SETTER
     * Settings for bank transfer payment
     */
    @JsonSetter("bank_transfer")
    public void setBankTransfer (CreateBankTransferPaymentRequest value) { 
        this.bankTransfer = value;
    }
 
    /** GETTER
     * Gateway affiliation code
     */
    @JsonGetter("gateway_affiliation_id")
    public String getGatewayAffiliationId ( ) { 
        return this.gatewayAffiliationId;
    }
    
    /** SETTER
     * Gateway affiliation code
     */
    @JsonSetter("gateway_affiliation_id")
    public void setGatewayAffiliationId (String value) { 
        this.gatewayAffiliationId = value;
    }
 
    /** GETTER
     * The amount of the payment, in cents
     */
    @JsonGetter("amount")
    public Integer getAmount ( ) { 
        return this.amount;
    }
    
    /** SETTER
     * The amount of the payment, in cents
     */
    @JsonSetter("amount")
    public void setAmount (Integer value) { 
        this.amount = value;
    }
 
}
 