package com.fintech.offers.dao;

import com.fintech.offers.model.OfferDetails;
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

//        1. get the request from services
//        2. prepare the request for database
//        3. call database and get the response


        String dbRespCode="0";
        String dbRespMsg="success";
        OffersDaoResponse offersDaoResponse=new OffersDaoResponse();
        List<OfferDetailsDao> offerDaoList=new ArrayList<>();


        OfferDetailsDao offerDetailsDao1=new OfferDetailsDao();

        offerDetailsDao1.setOfferId("9000001");
        offerDetailsDao1.setOfferName("apple 15x");
        offerDetailsDao1.setImageUrl("https://s3.amazon.com:8080/apple.png");
        offerDetailsDao1.setDesc("good");
        offerDetailsDao1.setDate("12-12-2026");
        offerDetailsDao1.setStatus("active");



        OfferDetailsDao offerDetailsDao2=new OfferDetailsDao();

        offerDetailsDao2.setOfferId("9000001");
        offerDetailsDao2.setOfferName("apple 15x");
        offerDetailsDao2.setImageUrl("https://s3.amazon.com:8080/apple.png");
        offerDetailsDao2.setDesc("good");
        offerDetailsDao2.setDate("12-12-2026");
        offerDetailsDao2.setStatus("active");


        OfferDetailsDao offerDetailsDao3=new OfferDetailsDao();

        offerDetailsDao3.setOfferId("9000001");
        offerDetailsDao3.setOfferName("apple 15x");
        offerDetailsDao3.setImageUrl("https://s3.amazon.com:8080/apple.png");
        offerDetailsDao3.setDesc("good");
        offerDetailsDao3.setDate("12-12-2026");
        offerDetailsDao3.setStatus("active");


        OfferDetailsDao offerDetailsDao4=new OfferDetailsDao();

        offerDetailsDao4.setOfferId("9000001");
        offerDetailsDao4.setOfferName("apple 15x");
        offerDetailsDao4.setImageUrl("https://s3.amazon.com:8080/apple.png");
        offerDetailsDao4.setDesc("good");
        offerDetailsDao4.setDate("12-12-2026");
        offerDetailsDao4.setStatus("active");


        OfferDetailsDao offerDetailsDao5=new OfferDetailsDao();

        offerDetailsDao5.setOfferId("9000001");
        offerDetailsDao5.setOfferName("apple 15x");
        offerDetailsDao5.setImageUrl("https://s3.amazon.com:8080/apple.png");
        offerDetailsDao5.setDesc("good");
        offerDetailsDao5.setDate("12-12-2026");
        offerDetailsDao5.setStatus("active");


        offerDaoList.add(offerDetailsDao1);
        offerDaoList.add(offerDetailsDao2);
        offerDaoList.add(offerDetailsDao3);
        offerDaoList.add(offerDetailsDao4);
        offerDaoList.add(offerDetailsDao5);


        offersDaoResponse.setRespCode("0");
        offersDaoResponse.setRespMsg("success");
        offersDaoResponse.setOfferDaoList(offerDaoList);



        return  offersDaoResponse;
    }
}
