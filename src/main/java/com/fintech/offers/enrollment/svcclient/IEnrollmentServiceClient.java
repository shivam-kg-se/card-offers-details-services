package com.fintech.offers.enrollment.svcclient;

import com.fintech.offers.model.EnrollmentRequest;
import com.fintech.offers.model.EnrollmentResponse;

public interface IEnrollmentServiceClient {

    EnrollmentResponse enrollment(EnrollmentRequest enrollmentRequest);
}
