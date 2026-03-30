package com.fintech.offers.builder;

import com.fintech.offers.model.*;
import org.springframework.stereotype.Component;


@Component
public class OffersRequestBuilder {
    public EnrollmentRequest buildEnrollmentRequest(OffersRequest offersRequest) {
//  1. prepare the EnrollmentRequest with the help of offerRequest
        EnrollmentRequest enrollmentRequest = new EnrollmentRequest();

        enrollmentRequest.setCardNumber(offersRequest.getCardNum());
        offersRequest.setCorrelationId(offersRequest.getCorrelationId());
//

        return enrollmentRequest;
    }

    public CardVerifyRequest buildCardVerifyRequest(OffersRequest offersRequest) {

        return null;
    }


    public OffersDaoRequest buildDaoRequest(OffersRequest offersRequest) {
        OffersDaoRequest offersDaoRequest = new OffersDaoRequest();
        offersDaoRequest.setCardNum(offersDaoRequest.getCardNum());
        offersDaoRequest.setClientId(offersDaoRequest.getClientId());
        offersDaoRequest.setChannelId(offersDaoRequest.getChannelId());
        offersDaoRequest.setTypeOfOffer(offersDaoRequest.getTypeOfOffer());
        return offersDaoRequest;
    }
}
