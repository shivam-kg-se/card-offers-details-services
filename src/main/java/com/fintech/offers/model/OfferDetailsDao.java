package com.fintech.offers.model;


import lombok.Data;

@Data
public class OfferDetailsDao {
    public OfferDetails offerDeatialsDao;
    private String offerId;
    private String offerName;
    private String imageUrl;
    private String desc;
    private String date;
    private String status;

}
