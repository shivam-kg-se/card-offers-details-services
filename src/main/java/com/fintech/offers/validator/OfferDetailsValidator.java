package com.fintech.offers.validator;

import com.fintech.offers.exception.OffersInvalidRequestDataException;
import com.fintech.offers.model.OffersRequest;
import org.springframework.stereotype.Component;

@Component
public class OfferDetailsValidator {



    public static void validateRequest(OffersRequest offersRequest) throws OffersInvalidRequestDataException {
// this method is used to validate the request data , if the request is invalid then
//  throw the user define exception

        if(offersRequest.getClientId() == null || "".equals(offersRequest.getClientId())) {
            throw new OffersInvalidRequestDataException("100","Client Id invalid");
        }

    }
}
