/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateGooglePayHeaderRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = -9662179824826571L;
    private String ephemeralPublicKey;
    /** GETTER
     * X.509 encoded key bytes, Base64 encoded as a string
     */
    @JsonGetter("ephemeral_public_key")
    public String getEphemeralPublicKey ( ) { 
        return this.ephemeralPublicKey;
    }
    
    /** SETTER
     * X.509 encoded key bytes, Base64 encoded as a string
     */
    @JsonSetter("ephemeral_public_key")
    public void setEphemeralPublicKey (String value) { 
        this.ephemeralPublicKey = value;
    }
 
}