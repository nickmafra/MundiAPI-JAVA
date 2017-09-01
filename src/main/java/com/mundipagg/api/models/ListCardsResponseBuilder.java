/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class ListCardsResponseBuilder {
    //the instance to build
    private ListCardsResponse listCardsResponse;

    /**
     * Default constructor to initialize the instance
     */
    public ListCardsResponseBuilder() {
        listCardsResponse = new ListCardsResponse();
    }

    /**
     * The card objects
     */
    public ListCardsResponseBuilder data(List<GetCardResponse> data) {
        listCardsResponse.setData(data);
        return this;
    }

    /**
     * Paging object
     */
    public ListCardsResponseBuilder paging(PagingResponse paging) {
        listCardsResponse.setPaging(paging);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListCardsResponse build() {
        return listCardsResponse;
    }
}