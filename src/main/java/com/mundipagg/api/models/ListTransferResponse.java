/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListTransferResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5604914007400659371L;
    private List<GetTransferResponse> data;
    private PagingResponse paging;
    /** GETTER
     * Transfers
     */
    @JsonGetter("data")
    public List<GetTransferResponse> getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * Transfers
     */
    @JsonSetter("data")
    public void setData (List<GetTransferResponse> value) { 
        this.data = value;
    }
 
    /** GETTER
     * Paging
     */
    @JsonGetter("paging")
    public PagingResponse getPaging ( ) { 
        return this.paging;
    }
    
    /** SETTER
     * Paging
     */
    @JsonSetter("paging")
    public void setPaging (PagingResponse value) { 
        this.paging = value;
    }
 
}
 