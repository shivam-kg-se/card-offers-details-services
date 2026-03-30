package com.fintech.offers.exception;
/**
 * this class is just like entity for exception handling
 *
 */

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class OffersInvalidRequestDataException extends Exception {

    private static final long serialVersionUID = 1L;
    private String respCode;
    private String respMessage;

    public OffersInvalidRequestDataException(String respCode, String respMessage) {

        this.respCode = respCode;
        this.respMessage = respMessage;

    }
}
