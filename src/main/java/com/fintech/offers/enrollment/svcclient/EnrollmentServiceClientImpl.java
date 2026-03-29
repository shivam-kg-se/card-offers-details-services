package com.fintech.offers.enrollment.svcclient;


import com.fintech.offers.model.EnrollmentRequest;
import com.fintech.offers.model.EnrollmentResponse;
import org.springframework.stereotype.Component;

@Component
public class EnrollmentServiceClientImpl implements IEnrollmentServiceClient {

    @Override
    public EnrollmentResponse enrollment(EnrollmentRequest enrollmentRequest) {

//        1. get the request from service layer
//        2. prepare the request for enrollment service
//        3. call enrollment service and get the response
        return null;
    }
}
