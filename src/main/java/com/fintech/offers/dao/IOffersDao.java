package com.fintech.offers.dao;

import com.fintech.offers.exception.BusinessException;
import com.fintech.offers.exception.OffersInvalidRequestDataException;
import com.fintech.offers.exception.SystemException;
import com.fintech.offers.model.OffersDaoRequest;
import com.fintech.offers.model.OffersDaoResponse;
import org.springframework.stereotype.Component;


public interface IOffersDao {
        OffersDaoResponse getOffers(OffersDaoRequest offersRequest) throws BusinessException, SystemException ;
}
