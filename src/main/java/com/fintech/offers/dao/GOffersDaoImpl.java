package com.fintech.offers.dao;

import com.fintech.offers.exception.BusinessException;
import com.fintech.offers.exception.OffersInvalidRequestDataException;
import com.fintech.offers.exception.SystemException;
import com.fintech.offers.model.OffersDaoRequest;
import com.fintech.offers.model.OffersDaoResponse;
import org.springframework.stereotype.Repository;


@Repository
public class GOffersDaoImpl implements IOffersDao{


    @Override
    public OffersDaoResponse getOffers(OffersDaoRequest offersRequest) throws BusinessException, SystemException {
        return null;
    }
}
