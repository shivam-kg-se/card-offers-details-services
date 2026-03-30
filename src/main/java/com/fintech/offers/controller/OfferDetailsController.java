package com.fintech.offers.controller;


import com.fintech.offers.exception.OffersInvalidRequestDataException;
import com.fintech.offers.model.OffersRequest;
import com.fintech.offers.model.OffersResponse;
import com.fintech.offers.service.IOffersService;
import com.fintech.offers.validator.OfferDetailsValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class OfferDetailsController {


    @Autowired
    OfferDetailsValidator offerDetailsValidator;
    @Autowired
    IOffersService  offersService;


    /**
     *
     * @param cardNum
     * @param clientId
     * @param channelId
     * @param msgTs
     * @param correlationId
     * @param authToken
     * @return offerresponse
     * @throws com.fintech.offers.exception.OffersInvalidRequestDataException
     */
    @GetMapping("/offers/{cardnumber}")
    OffersResponse getoffer(@PathVariable("cardnumber") String cardNum,
                            @RequestHeader(name = "clientId",required = false) String clientId,
                            @RequestHeader(name = "channelId",required = false)String channelId,
                            @RequestHeader(name = "msgTs",required = false)String msgTs,
                            @RequestHeader(name = "correlationId",required = false)String correlationId,
                            @RequestHeader(name = "authToken",required = false)String authToken
                            ) throws OffersInvalidRequestDataException {

        OffersRequest offersRequest = new OffersRequest();
        offersRequest.setCardNum(cardNum);
        offersRequest.setClientId(clientId);
        offersRequest.setChannelId(channelId);
        offersRequest.setMsgTs(msgTs);
        offersRequest.setCorrelationId(correlationId);
        offersRequest.setAuthToken(authToken);

//  1. validate the request
//         OfferDetailsValidator.validateRequest(offersRequest);
//        System.out.println("controller tak aa gya");
        offerDetailsValidator.validateRequest(offersRequest);
//  2. prepare the request for service laye

//  3. call the service layer and get the response
        OffersResponse offersResponse = offersService.getOffers(offersRequest);



    return offersResponse;
    }
}
