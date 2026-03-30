package com.fintech.offers.builder;


import com.fintech.offers.model.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OffersResponseBuilder {
    /**
     * description : prepare the OffersResponse with the help of dao response
     * @param offersDaoResponse
     * @param cardVerifyResponse
     * @param enrollmentResponse
     * @return
     */
    public OffersResponse buidOfferResponse(OffersDaoResponse offersDaoResponse, CardVerifyResponse cardVerifyResponse, EnrollmentResponse enrollmentResponse) {
       OffersResponse offersResponse = new OffersResponse();
        List<OfferDetails> offersList = new ArrayList<>();

//        get the list of offer from dao and prepare the service offer object
       for ( OfferDetailsDao offersDaoDtls :offersDaoResponse.getOfferDaoList()){
           OfferDetails offerDetails = new OfferDetails();
           offerDetails.setOfferId(offersDaoDtls.getOfferId());
           offerDetails.setOfferName(offersDaoDtls.getOfferName());
           offerDetails.setDesc(offersDaoDtls.getDesc());
           offerDetails.setStatus(offersDaoDtls.getStatus());
           offerDetails.setImageUrl(offersDaoDtls.getImageUrl());
           offerDetails.setDate(offersDaoDtls.getDate());

           offersList.add(offerDetails);

       }
       offersResponse.setOffersDetails(offersList);
        return offersResponse;
    }
}
