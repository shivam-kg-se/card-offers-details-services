package com.fintech.offers.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import java.util.List;

@Data
//@JsonPropertyOrder({"statusBlock","offersDetails"})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OffersResponse {


    private List<OfferDetails> offersDetails;
    private StatusBlock statusBlock;
}
