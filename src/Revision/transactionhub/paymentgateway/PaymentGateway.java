package Revision.transactionhub.paymentgateway;


import Revision.transactionhub.adapter.PayPalAdapter;
import Revision.transactionhub.adapter.PaymentAdapter;

public interface PaymentGateway {
    public void initiatePayment(PaymentAdapter adapter);
}
