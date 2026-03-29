package com.fintech.offers.dao;

import com.fintech.offers.model.OfferDetailsDao;
import com.fintech.offers.model.OffersDaoRequest;
import com.fintech.offers.model.OffersDaoResponse;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.awt.image.ImageConsumer;
import java.util.ArrayList;
import java.util.List;

@Repository
@Primary
public class MOffersDaoImpl implements IOffersDao {
    @Override
    public OffersDaoResponse getOffers(OffersDaoRequest offersRequest) {


        String dbRespCode="0";
        String dbRespMsg="success";

        List<OfferDetailsDao> offerRepositoryList=new ArrayList<OfferDetailsDao>();
        OffersDaoResponse offersDaoResponse=new OffersDaoResponse();
        offersDaoResponse.setRespCode(dbRespCode);
        offersDaoResponse.setRespMsg(dbRespMsg);


        return null;
    }
}
