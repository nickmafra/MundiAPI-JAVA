/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetUsageResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4762363772192069626L;
    private String id;
    private int quantity;
    private String description;
    private Date usedAt;
    private Date createdAt;
    private GetSubscriptionItemResponse subscriptionItem;
    /** GETTER
     * Id
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * Id
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
    }
 
    /** GETTER
     * Quantity
     */
    @JsonGetter("quantity")
    public int getQuantity ( ) { 
        return this.quantity;
    }
    
    /** SETTER
     * Quantity
     */
    @JsonSetter("quantity")
    public void setQuantity (int value) { 
        this.quantity = value;
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
     * Used at
     */
    @JsonGetter("used_at")
    public Date getUsedAt ( ) { 
        return this.usedAt;
    }
    
    /** SETTER
     * Used at
     */
    @JsonSetter("used_at")
    public void setUsedAt (Date value) { 
        this.usedAt = value;
    }
 
    /** GETTER
     * Creation date
     */
    @JsonGetter("created_at")
    public Date getCreatedAt ( ) { 
        return this.createdAt;
    }
    
    /** SETTER
     * Creation date
     */
    @JsonSetter("created_at")
    public void setCreatedAt (Date value) { 
        this.createdAt = value;
    }
 
    /** GETTER
     * Subscription item
     */
    @JsonGetter("subscription_item")
    public GetSubscriptionItemResponse getSubscriptionItem ( ) { 
        return this.subscriptionItem;
    }
    
    /** SETTER
     * Subscription item
     */
    @JsonSetter("subscription_item")
    public void setSubscriptionItem (GetSubscriptionItemResponse value) { 
        this.subscriptionItem = value;
    }
 
}
 