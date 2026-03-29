package com.fintech.offers.model;

import lombok.Data;

@Data
public class OfferDetails {
    private String offerId;
    private String offerName;
    private String imageUrl;
    private String desc;
    private String date;
    private String status;

}
