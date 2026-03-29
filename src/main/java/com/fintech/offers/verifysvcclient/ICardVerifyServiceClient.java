package com.fintech.offers.verifysvcclient;

import com.fintech.offers.model.CardVerifyRequest;
import com.fintech.offers.model.CardVerifyResponse;

public interface ICardVerifyServiceClient {

    CardVerifyResponse  verifyCard(CardVerifyRequest cardVerifyRequest);
}
