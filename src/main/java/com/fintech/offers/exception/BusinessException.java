package com.fintech.offers.exception;


import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class BusinessException extends  Exception{

//    serialVersionUID is unique version id used in java serialization
//    serialization - change java object into byte stream
//    deserialization - change byte stream into java object
    private static final long serialVersionUID = 1L;

    private String respCode;
    private String respMessage;

    public BusinessException(String respCode, String respMessage) {
        this.respCode = respCode;
        this.respMessage = respMessage;
    }
}
