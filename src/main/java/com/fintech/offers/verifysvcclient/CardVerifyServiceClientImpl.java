package com.fintech.offers.verifysvcclient;


import com.fintech.offers.model.CardVerifyRequest;
import com.fintech.offers.model.CardVerifyResponse;
import org.springframework.stereotype.Component;

@Component
public class CardVerifyServiceClientImpl implements  ICardVerifyServiceClient {


    @Override
    public CardVerifyResponse verifyCard(CardVerifyRequest cardVerifyRequest) {

        return null;
    }
}
