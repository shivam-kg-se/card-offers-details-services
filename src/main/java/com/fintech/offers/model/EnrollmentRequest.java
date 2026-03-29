package com.fintech.offers.model;

import lombok.Data;

@Data
public class EnrollmentRequest {
    private String cardNumber;
    private String clientId;
    private String correlationId;
}
