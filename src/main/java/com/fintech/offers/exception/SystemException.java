package com.fintech.offers.exception;


import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class SystemException extends Exception {

    private static final long serialVersionUID = 1L;
    private String respCode;
    private String respMessage;

    public SystemException(String respCode, String respMessage) {
        this.respCode = respCode;
        this.respMessage = respMessage;
    }
}