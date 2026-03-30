package com.fintech.offers.controller;

import com.fintech.offers.exception.BusinessException;
import com.fintech.offers.exception.OffersInvalidRequestDataException;
import com.fintech.offers.exception.SystemException;
import com.fintech.offers.model.OffersResponse;
import com.fintech.offers.model.StatusBlock;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice   // is annotation ka  kam hai sare controller exception ko ak hi jagah handel karna
public class OfferDetialsControllerAdvice {

    @ExceptionHandler(OffersInvalidRequestDataException.class)
    public OffersResponse handleRequestInvalidDataException(OffersInvalidRequestDataException exception){

        OffersResponse offersResponse = new OffersResponse();
        StatusBlock statusBlock = new StatusBlock();

        statusBlock.setRespCode(exception.getRespCode());
        statusBlock.setRespMsg(exception.getRespMessage());
        offersResponse.setStatusBlock(statusBlock);


        return offersResponse;
    }



    @ExceptionHandler(BusinessException.class)
    public OffersResponse handleRequestInvalidDataException(BusinessException exception){

        OffersResponse offersResponse = new OffersResponse();
        StatusBlock statusBlock = new StatusBlock();

        statusBlock.setRespCode(exception.getRespCode());
        statusBlock.setRespMsg(exception.getRespMessage());
        offersResponse.setStatusBlock(statusBlock);


        return offersResponse;
    }



    @ExceptionHandler(SystemException.class)
    public OffersResponse handleRequestInvalidDataException(SystemException exception){

        OffersResponse offersResponse = new OffersResponse();
        StatusBlock statusBlock = new StatusBlock();

        statusBlock.setRespCode(exception.getRespCode());
        statusBlock.setRespMsg(exception.getRespMessage());
        offersResponse.setStatusBlock(statusBlock);


        return offersResponse;
    }


    @ExceptionHandler(Exception.class)
    public OffersResponse handleRequestInvalidDataException(Exception exception){

        OffersResponse offersResponse = new OffersResponse();
        StatusBlock statusBlock = new StatusBlock();

        statusBlock.setRespCode("888888888");
        statusBlock.setRespMsg("unknown from database");
        offersResponse.setStatusBlock(statusBlock);


        return offersResponse;
    }
}
