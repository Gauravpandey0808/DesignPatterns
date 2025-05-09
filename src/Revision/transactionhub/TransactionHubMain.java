package Revision.transactionhub;

import Revision.transactionhub.dto.request.PaymentRequest;
import Revision.transactionhub.enums.PaymentGateway;
import Revision.transactionhub.service.PaymentGatewayServiceImpl;

public class TransactionHubMain {
    public static void main(String[] args) {
        PaymentGatewayServiceImpl service = new PaymentGatewayServiceImpl();
        PaymentRequest request = new PaymentRequest.PaymentRequestBuilder()
                .paymentId(101)
                .name("John Doe")
                .paymentGateway(PaymentGateway.PAYPAL)
                .amount(150.75)
                .build();

        service.getPaymentInitiated(request);
    }
}
