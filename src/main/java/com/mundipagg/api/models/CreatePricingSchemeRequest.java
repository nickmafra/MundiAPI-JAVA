/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreatePricingSchemeRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5557971986952113786L;
    private String schemeType;
    private List<CreatePriceBracketRequest> priceBrackets;
    private Integer price;
    private Integer minimumPrice;
    /** GETTER
     * Scheme type
     */
    @JsonGetter("scheme_type")
    public String getSchemeType ( ) { 
        return this.schemeType;
    }
    
    /** SETTER
     * Scheme type
     */
    @JsonSetter("scheme_type")
    public void setSchemeType (String value) { 
        this.schemeType = value;
    }
 
    /** GETTER
     * Price brackets
     */
    @JsonGetter("price_brackets")
    public List<CreatePriceBracketRequest> getPriceBrackets ( ) { 
        return this.priceBrackets;
    }
    
    /** SETTER
     * Price brackets
     */
    @JsonSetter("price_brackets")
    public void setPriceBrackets (List<CreatePriceBracketRequest> value) { 
        this.priceBrackets = value;
    }
 
    /** GETTER
     * Price
     */
    @JsonGetter("price")
    public Integer getPrice ( ) { 
        return this.price;
    }
    
    /** SETTER
     * Price
     */
    @JsonSetter("price")
    public void setPrice (Integer value) { 
        this.price = value;
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
 
}
 