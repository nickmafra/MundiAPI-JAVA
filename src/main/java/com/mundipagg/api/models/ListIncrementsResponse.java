/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListIncrementsResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5306829364886334953L;
    private List<GetIncrementResponse> data;
    private PagingResponse paging;
    /** GETTER
     * The Increments response
     */
    @JsonGetter("data")
    public List<GetIncrementResponse> getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * The Increments response
     */
    @JsonSetter("data")
    public void setData (List<GetIncrementResponse> value) { 
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
 