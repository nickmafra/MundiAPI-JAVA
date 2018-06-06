/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UpdatePlanRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5674320509262724015L;
    private String name;
    private String description;
    private List<Integer> installments;
    private String statementDescriptor;
    private String currency;
    private String interval;
    private int intervalCount;
    private List<String> paymentMethods;
    private String billingType;
    private String status;
    private boolean shippable;
    private List<Integer> billingDays;
    private LinkedHashMap<String, String> metadata;
    private Integer minimumPrice;
    private Integer trialPeriodDays;
    /** GETTER
     * Plan's name
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * Plan's name
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * Description
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * Description
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * Number os installments
     */
    @JsonGetter("installments")
    public List<Integer> getInstallments ( ) { 
        return this.installments;
    }
    
    /** SETTER
     * Number os installments
     */
    @JsonSetter("installments")
    public void setInstallments (List<Integer> value) { 
        this.installments = value;
    }
 
    /** GETTER
     * Text that will be shown on the credit card's statement
     */
    @JsonGetter("statement_descriptor")
    public String getStatementDescriptor ( ) { 
        return this.statementDescriptor;
    }
    
    /** SETTER
     * Text that will be shown on the credit card's statement
     */
    @JsonSetter("statement_descriptor")
    public void setStatementDescriptor (String value) { 
        this.statementDescriptor = value;
    }
 
    /** GETTER
     * Currency
     */
    @JsonGetter("currency")
    public String getCurrency ( ) { 
        return this.currency;
    }
    
    /** SETTER
     * Currency
     */
    @JsonSetter("currency")
    public void setCurrency (String value) { 
        this.currency = value;
    }
 
    /** GETTER
     * Interval
     */
    @JsonGetter("interval")
    public String getInterval ( ) { 
        return this.interval;
    }
    
    /** SETTER
     * Interval
     */
    @JsonSetter("interval")
    public void setInterval (String value) { 
        this.interval = value;
    }
 
    /** GETTER
     * Interval count
     */
    @JsonGetter("interval_count")
    public int getIntervalCount ( ) { 
        return this.intervalCount;
    }
    
    /** SETTER
     * Interval count
     */
    @JsonSetter("interval_count")
    public void setIntervalCount (int value) { 
        this.intervalCount = value;
    }
 
    /** GETTER
     * Payment methods accepted by the plan
     */
    @JsonGetter("payment_methods")
    public List<String> getPaymentMethods ( ) { 
        return this.paymentMethods;
    }
    
    /** SETTER
     * Payment methods accepted by the plan
     */
    @JsonSetter("payment_methods")
    public void setPaymentMethods (List<String> value) { 
        this.paymentMethods = value;
    }
 
    /** GETTER
     * Billing type
     */
    @JsonGetter("billing_type")
    public String getBillingType ( ) { 
        return this.billingType;
    }
    
    /** SETTER
     * Billing type
     */
    @JsonSetter("billing_type")
    public void setBillingType (String value) { 
        this.billingType = value;
    }
 
    /** GETTER
     * Plan status
     */
    @JsonGetter("status")
    public String getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * Plan status
     */
    @JsonSetter("status")
    public void setStatus (String value) { 
        this.status = value;
    }
 
    /** GETTER
     * Indicates if the plan is shippable
     */
    @JsonGetter("shippable")
    public boolean getShippable ( ) { 
        return this.shippable;
    }
    
    /** SETTER
     * Indicates if the plan is shippable
     */
    @JsonSetter("shippable")
    public void setShippable (boolean value) { 
        this.shippable = value;
    }
 
    /** GETTER
     * Billing days accepted by the plan
     */
    @JsonGetter("billing_days")
    public List<Integer> getBillingDays ( ) { 
        return this.billingDays;
    }
    
    /** SETTER
     * Billing days accepted by the plan
     */
    @JsonSetter("billing_days")
    public void setBillingDays (List<Integer> value) { 
        this.billingDays = value;
    }
 
    /** GETTER
     * Metadata
     */
    @JsonGetter("metadata")
    public LinkedHashMap<String, String> getMetadata ( ) { 
        return this.metadata;
    }
    
    /** SETTER
     * Metadata
     */
    @JsonSetter("metadata")
    public void setMetadata (LinkedHashMap<String, String> value) { 
        this.metadata = value;
    }
 
    /** GETTER
     * Minimum price
     */
    @JsonGetter("minimum_price")
    public Integer getMinimumPrice ( ) { 
        return this.minimumPrice;
    }
    
    /** SETTER
     * Minimum price
     */
    @JsonSetter("minimum_price")
    public void setMinimumPrice (Integer value) { 
        this.minimumPrice = value;
    }
 
    /** GETTER
     * Number of trial period in days, where the customer will not be charged
     */
    @JsonGetter("trial_period_days")
    public Integer getTrialPeriodDays ( ) { 
        return this.trialPeriodDays;
    }
    
    /** SETTER
     * Number of trial period in days, where the customer will not be charged
     */
    @JsonSetter("trial_period_days")
    public void setTrialPeriodDays (Integer value) { 
        this.trialPeriodDays = value;
    }
 
}
 