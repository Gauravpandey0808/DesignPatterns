package Revision.transactionhub.factories;

import Revision.transactionhub.paymentgateway.PayPalService;
import Revision.transactionhub.paymentgateway.PaymentGateway;
import Revision.transactionhub.paymentgateway.RazorPayService;
import Revision.transactionhub.paymentgateway.StripeService;

public class PaymentGatewayFactory {

    public PaymentGateway getPaymentGateway(Revision.transactionhub.enums.PaymentGateway currentPaymentGateway) {
        return switch (currentPaymentGateway) {
            case PAYPAL -> new PayPalService();
            case STRIPE -> new StripeService();
            case RAZORPAY -> new RazorPayService();
        };
    }
}
