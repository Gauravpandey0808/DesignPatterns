package Revision.transactionhub.factories;

import Revision.transactionhub.adapter.PayPalAdapter;
import Revision.transactionhub.adapter.PaymentAdapter;
import Revision.transactionhub.adapter.RazorPayAdapter;
import Revision.transactionhub.adapter.StripeAdapter;
import Revision.transactionhub.dto.request.PaymentRequest;
import Revision.transactionhub.enums.PaymentGateway;

public class PaymentGatewayAdapterFactory {
    public PaymentAdapter getPaymentGatewayAdapter(PaymentRequest request) {
        PaymentGateway currentPaymentGateway = request.getPaymentGateway();
        return switch (currentPaymentGateway) {
            case PAYPAL -> new PayPalAdapter(request);
            case STRIPE -> new StripeAdapter(request);
            case RAZORPAY -> new RazorPayAdapter(request);
        };
    }
}
