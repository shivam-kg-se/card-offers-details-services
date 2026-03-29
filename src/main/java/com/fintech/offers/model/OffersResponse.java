package com.fintech.offers.model;

import lombok.Data;
import java.util.List;

@Data
//@JsonPropertyOrder({"statusBlock","offersDetails"})
public class OffersResponse {


    private List<OfferDetails> offersDetails;
    private StatusBlock statusBlock;
}
