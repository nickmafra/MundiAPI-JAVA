/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListSubscriptionsResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4779970723007778783L;
    private List<GetSubscriptionResponse> data;
    private PagingResponse paging;
    /** GETTER
     * The subscription objects
     */
    @JsonGetter("data")
    public List<GetSubscriptionResponse> getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * The subscription objects
     */
    @JsonSetter("data")
    public void setData (List<GetSubscriptionResponse> value) { 
        this.data = value;
    }
 
    /** GETTER
     * Paging object
     */
    @JsonGetter("paging")
    public PagingResponse getPaging ( ) { 
        return this.paging;
    }
    
    /** SETTER
     * Paging object
     */
    @JsonSetter("paging")
    public void setPaging (PagingResponse value) { 
        this.paging = value;
    }
 
}
 