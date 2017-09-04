/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetCreditCardTransactionResponse 
        extends GetTransactionResponse {
    private static final long serialVersionUID = 4854853910754411290L;
    private String statementDescriptor;
    private String acquirerName;
    private String acquirerAffiliationCode;
    private String acquirerTid;
    private String acquirerNsu;
    private String acquirerAuthCode;
    private String operationType;
    private GetCardResponse card;
    private String acquirerMessage;
    private Integer installments;
    /** GETTER
     * Text that will appear on the credit card's statement
     */
    @JsonGetter("statement_descriptor")
    public String getStatementDescriptor ( ) { 
        return this.statementDescriptor;
    }
    
    /** SETTER
     * Text that will appear on the credit card's statement
     */
    @JsonSetter("statement_descriptor")
    public void setStatementDescriptor (String value) { 
        this.statementDescriptor = value;
    }
 
    /** GETTER
     * Acquirer name
     */
    @JsonGetter("acquirer_name")
    public String getAcquirerName ( ) { 
        return this.acquirerName;
    }
    
    /** SETTER
     * Acquirer name
     */
    @JsonSetter("acquirer_name")
    public void setAcquirerName (String value) { 
        this.acquirerName = value;
    }
 
    /** GETTER
     * Aquirer affiliation code
     */
    @JsonGetter("acquirer_affiliation_code")
    public String getAcquirerAffiliationCode ( ) { 
        return this.acquirerAffiliationCode;
    }
    
    /** SETTER
     * Aquirer affiliation code
     */
    @JsonSetter("acquirer_affiliation_code")
    public void setAcquirerAffiliationCode (String value) { 
        this.acquirerAffiliationCode = value;
    }
 
    /** GETTER
     * Acquirer TID
     */
    @JsonGetter("acquirer_tid")
    public String getAcquirerTid ( ) { 
        return this.acquirerTid;
    }
    
    /** SETTER
     * Acquirer TID
     */
    @JsonSetter("acquirer_tid")
    public void setAcquirerTid (String value) { 
        this.acquirerTid = value;
    }
 
    /** GETTER
     * Acquirer NSU
     */
    @JsonGetter("acquirer_nsu")
    public String getAcquirerNsu ( ) { 
        return this.acquirerNsu;
    }
    
    /** SETTER
     * Acquirer NSU
     */
    @JsonSetter("acquirer_nsu")
    public void setAcquirerNsu (String value) { 
        this.acquirerNsu = value;
    }
 
    /** GETTER
     * Acquirer authorization code
     */
    @JsonGetter("acquirer_auth_code")
    public String getAcquirerAuthCode ( ) { 
        return this.acquirerAuthCode;
    }
    
    /** SETTER
     * Acquirer authorization code
     */
    @JsonSetter("acquirer_auth_code")
    public void setAcquirerAuthCode (String value) { 
        this.acquirerAuthCode = value;
    }
 
    /** GETTER
     * Operation type
     */
    @JsonGetter("operation_type")
    public String getOperationType ( ) { 
        return this.operationType;
    }
    
    /** SETTER
     * Operation type
     */
    @JsonSetter("operation_type")
    public void setOperationType (String value) { 
        this.operationType = value;
    }
 
    /** GETTER
     * Card data
     */
    @JsonGetter("card")
    public GetCardResponse getCard ( ) { 
        return this.card;
    }
    
    /** SETTER
     * Card data
     */
    @JsonSetter("card")
    public void setCard (GetCardResponse value) { 
        this.card = value;
    }
 
    /** GETTER
     * Acquirer message
     */
    @JsonGetter("acquirer_message")
    public String getAcquirerMessage ( ) { 
        return this.acquirerMessage;
    }
    
    /** SETTER
     * Acquirer message
     */
    @JsonSetter("acquirer_message")
    public void setAcquirerMessage (String value) { 
        this.acquirerMessage = value;
    }
 
    /** GETTER
     * Number of installments
     */
    @JsonGetter("installments")
    public Integer getInstallments ( ) { 
        return this.installments;
    }
    
    /** SETTER
     * Number of installments
     */
    @JsonSetter("installments")
    public void setInstallments (Integer value) { 
        this.installments = value;
    }
 
}
 