package com.fintech.offers.controller;

import com.fintech.offers.builder.OffersResponseBuilder;
import com.fintech.offers.exception.BusinessException;
import com.fintech.offers.exception.OffersInvalidRequestDataException;
import com.fintech.offers.exception.SystemException;
import com.fintech.offers.model.OffersDaoRequest;
import com.fintech.offers.model.OffersResponse;
import com.fintech.offers.model.StatusBlock;
import com.fintech.offers.util.OfferDetailsConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//@ControllerAdvice// is annotation ka  kam hai sare controller exception ko ak hi jagah handel karna __1way
@RestControllerAdvice // __2way{best}
public class OfferDetialsControllerAdvice {

    @Autowired
    OffersResponseBuilder offersResponseBuilder;


    //    @ResponseBody //__1way
    @ExceptionHandler(OffersInvalidRequestDataException.class)
    public OffersResponse handleRequestInvalidDataException(OffersInvalidRequestDataException exception){

//        OffersResponse offersResponse = new OffersResponse();
//        StatusBlock statusBlock = new StatusBlock();
//
//        statusBlock.setRespCode(exception.getRespCode());
//        statusBlock.setRespMsg(exception.getRespMessage());
//        offersResponse.setStatusBlock(statusBlock);
//        return offersResponse;

//        ye code ko method bana kar kam kar diya line of code
//        iske liye method banaye hai offerresponse builder ami or usko inject kiye hai
//
        return  offersResponseBuilder.buildOfferResponse(exception.getRespCode(),exception.getRespMessage());
    }

// yaha tak shoet kar diya code


    @ExceptionHandler(BusinessException.class)
    public OffersResponse handleBusinessInvalidDataException(BusinessException exception){
        return offersResponseBuilder.buildOfferResponse(exception.getRespCode(),exception.getRespMessage());
    }


    @ExceptionHandler(SystemException.class)
    public OffersResponse handleSystemInvalidDataException(SystemException exception){
        return offersResponseBuilder.buildOfferResponse(exception.getRespCode(),exception.getRespMessage());
    }

    @ExceptionHandler(Exception.class)
    public OffersResponse handleGenericInvalidDataException(Exception exception){
        return offersResponseBuilder.buildOfferResponse(OfferDetailsConstant.GENERIC_ERROR_CODE,OfferDetailsConstant.GENERIC_ERROR_MSG);
    }

}
