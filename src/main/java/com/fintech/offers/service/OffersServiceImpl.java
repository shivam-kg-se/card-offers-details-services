package com.fintech.offers.service;

import com.fintech.offers.builder.OffersRequestBuilder;
import com.fintech.offers.builder.OffersResponseBuilder;
import com.fintech.offers.dao.IOffersDao;
import com.fintech.offers.enrollment.svcclient.IEnrollmentServiceClient;
import com.fintech.offers.exception.BusinessException;
import com.fintech.offers.exception.SystemException;
import com.fintech.offers.model.*;
import com.fintech.offers.verifysvcclient.ICardVerifyServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OffersServiceImpl implements  IOffersService{

    @Autowired
    IEnrollmentServiceClient enrollmentServiceClient;
    @Autowired
    ICardVerifyServiceClient cardVerifyServiceClient;
    @Autowired
    OffersRequestBuilder requestBuilder;
    @Autowired
    OffersResponseBuilder responseBuilder;
    @Autowired
    IOffersDao offersDao;



    @Override
    public OffersResponse getOffers(OffersRequest offersRequest) throws BusinessException, SystemException {

//        1. get the request from controller layer

//        2. prepare the requestBuilder object for cardVerifyRequest object
        CardVerifyRequest cardVerifyRequest= requestBuilder.buildCardVerifyRequest(offersRequest);

//        3. call CardVerifyServiceClient by sending cardVerifyRequest adn get th cardVerifyResponse
        CardVerifyResponse cardVerifyResponse = cardVerifyServiceClient.verifyCard(cardVerifyRequest);

//        4. prepare the request requestBuilder object for enrollmentRequest object
//      ==> ye offerrequest ko enrollment request mai change kar raha hai
        EnrollmentRequest enrollmentRequest = requestBuilder.buildEnrollmentRequest(offersRequest);

//        5. call enrollmentserviceclient by sending enrollmentRequest object and get the EnrollmeantResponse
        EnrollmentResponse enrollmentResponse = enrollmentServiceClient.enrollment(enrollmentRequest);

//        6. apply some business logic on EnrollmentResponse

//

//
//     7. apply business login on cardVerifyResponse

//     8. prepare the request for dao object and convert OffersRequest to offersDaoRequest
          OffersDaoRequest offersDaoRequest =   requestBuilder.buildDaoRequest(offersRequest);

//     9. call dao by sending offersDaoRequest and get the offerdaoResponse

       OffersDaoResponse offersDaoResponse = offersDao.getOffers(offersDaoRequest);


//     10. apply business logic in dao respose

//     11. prepare the offers response
              OffersResponse offersResponse =  responseBuilder.buildOfferResponse(offersDaoResponse, cardVerifyResponse, enrollmentResponse);

/**
//        3. call enrollment serviceClient and get the response
        EnrollmentResponse enrollmentResponse= enrollmentServiceClient.enrollment(enrollmentRequest);

//        4. prepare the request for CardVerifySvcClient
        CardVerifyRequest cardVerifyRequest = new CardVerifyRequest();

//        5. call CardVerifySvcClient and get the response
        CardVerifyResponse cardVerifyResponse = cardVerifyServiceClient.verifyCard(cardVerifyRequest);

//        6. prepare the request for dao/ repository
//        7. call dao and get the response
//        8. prepare the offer response

   */
          StatusBlock statusBlock = new StatusBlock();
          statusBlock.setRespCode(offersDaoResponse.getRespCode());
          statusBlock.setRespMsg(offersDaoResponse.getRespMsg());
          offersResponse.setStatusBlock(statusBlock);
          return offersResponse;
    }
}
