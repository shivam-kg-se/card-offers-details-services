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
            throw new OffersInvalidRequestDataException("offsvc001","Client Id invalid");
        }
        if(offersRequest.getCardNum() == null || "".equals(offersRequest.getCardNum()) || offersRequest.getCardNum().length()<16) {
            throw new OffersInvalidRequestDataException("offsvc001","Card Num id lesser than 16 characters");
        }
        if(offersRequest.getAuthToken() == null || "".equals(offersRequest.getAuthToken())) {
            throw new OffersInvalidRequestDataException("offsvc001","Auth Token invalid");
        }
        if(offersRequest.getMsgTs() == null || "".equals(offersRequest.getMsgTs())) {
            throw new OffersInvalidRequestDataException("offsvc001","Msg Ts invalid");
        }

        if(offersRequest.getCorrelationId() == null || "".equals(offersRequest.getCorrelationId())) {
            throw new OffersInvalidRequestDataException("offsvc001","Correlation Id invalid");

        }
    }
}
