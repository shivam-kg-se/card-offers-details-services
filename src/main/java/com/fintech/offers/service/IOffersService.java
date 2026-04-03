package com.fintech.offers.service;

import com.fintech.offers.exception.BusinessException;
import com.fintech.offers.exception.SystemException;
import com.fintech.offers.model.OffersRequest;
import com.fintech.offers.model.OffersResponse;

public interface IOffersService {


    OffersResponse getOffers(OffersRequest offersRequest) throws BusinessException, SystemException;
}
