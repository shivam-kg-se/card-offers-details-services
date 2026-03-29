package com.fintech.offers.model;

import tools.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class JsonSerialization {
    public static void main(String[] args) {

        OffersResponse offersResponse = new OffersResponse();

        StatusBlock statusBlock = new StatusBlock();

        statusBlock.setRespCode("0");
        statusBlock.setRespMsg("success");

        List<OfferDetails>  offersList = new ArrayList<>();

        OfferDetails offers1 = new OfferDetails();
        offers1.setOfferId("9000001");
        offers1.setOfferName("apple 15x");
        offers1.setImageUrl("https://s3.amazon.com:8080/apple.png");
        offers1.setDesc("good");
        offers1.setDate("12-12-2026");
        offers1.setStatus("active");

        OfferDetails offers2 = new OfferDetails();
        offers2.setOfferId("9000001");
        offers2.setOfferName("apple 15x");
        offers2.setImageUrl("https://s3.amazon.com:8080/apple.png");
        offers2.setDesc("good");
        offers2.setDate("12-12-2026");
        offers2.setStatus("active");


        OfferDetails offers3 = new OfferDetails();
        offers3.setOfferId("9000001");
        offers3.setOfferName("apple 15x");
        offers3.setImageUrl("https://s3.amazon.com:8080/apple.png");
        offers3.setDesc("good");
        offers3.setDate("12-12-2026");
        offers3.setStatus("active");


        OfferDetails offers4 = new OfferDetails();
        offers4.setOfferId("9000001");
        offers4.setOfferName("apple 15x");
        offers4.setImageUrl("https://s3.amazon.com:8080/apple.png");
        offers4.setDesc("good");
        offers4.setDate("12-12-2026");
        offers4.setStatus("active");


        OfferDetails offers5 = new OfferDetails();
        offers5.setOfferId("9000001");
        offers5.setOfferName("apple 15x");
        offers5.setImageUrl("https://s3.amazon.com:8080/apple.png");
        offers5.setDesc("good");
        offers5.setDate("12-12-2026");
        offers5.setStatus("active");

        offersList.add(offers1);
        offersList.add(offers2);
        offersList.add(offers3);
        offersList.add(offers4);
        offersList.add(offers5);


        offersResponse.setStatusBlock(statusBlock);
        offersResponse.setOffersDetails(offersList);
//    this program is for serialization . seri means data converted java object to json
        ObjectMapper  objectMapper = new ObjectMapper();
        String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(offersResponse);
        System.out.println("Json data is : " +json);
    }
}
