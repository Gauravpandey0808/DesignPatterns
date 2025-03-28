package Revision.paymentsystem.paymentstrategies;

import Revision.paymentsystem.dto.PaymentRequest;
import Revision.paymentsystem.dto.PaymentResponse;

public interface Payment {

    PaymentResponse initiatePayment(PaymentRequest request);
}
