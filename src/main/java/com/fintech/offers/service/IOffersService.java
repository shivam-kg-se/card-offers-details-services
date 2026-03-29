package com.fintech.offers.service;

import com.fintech.offers.model.OffersRequest;
import com.fintech.offers.model.OffersResponse;

public interface IOffersService {


    OffersResponse getOffers(OffersRequest offersRequest);
}
