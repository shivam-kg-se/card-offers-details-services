package com.fintech.offers.model;


import lombok.Data;

import java.util.Objects;

@Data
public class OffersRequest {

 private String cardNum;
 private  String clientId;
 private String channelId;
 private String msgTs;
 private String correlationId;
 private String authToken;
}
