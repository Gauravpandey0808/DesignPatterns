package Revision.transactionhub.service;


import Revision.transactionhub.adapter.PaymentAdapter;
import Revision.transactionhub.dto.request.PaymentRequest;
import Revision.transactionhub.factories.PaymentGatewayAdapterFactory;
import Revision.transactionhub.factories.PaymentGatewayFactory;
import Revision.transactionhub.paymentgateway.PaymentGateway;

public class PaymentGatewayServiceImpl {
    private final PaymentGatewayAdapterFactory adapterFactory;
    private final PaymentGatewayFactory paymentGatewayFactory;

    public PaymentGatewayServiceImpl() {
        this.adapterFactory = new PaymentGatewayAdapterFactory();
        this.paymentGatewayFactory = new PaymentGatewayFactory();
    }
    public void getPaymentInitiated(PaymentRequest request) {
        PaymentAdapter currentPaymentPayload = adapterFactory.getPaymentGatewayAdapter(request);
        PaymentGateway paymentGateway = paymentGatewayFactory.getPaymentGateway(request.getPaymentGateway());
        paymentGateway.initiatePayment(currentPaymentPayload);
    }
}
