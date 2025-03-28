package Revision.transactionhub.dto.request;

import Revision.transactionhub.enums.PaymentGateway;
import lombok.Getter;

@Getter
public class PaymentRequest {

    private final Integer paymentId;
    private final String  name;
    private final PaymentGateway paymentGateway;
    private final double amount;

    private PaymentRequest(PaymentRequestBuilder builder) {
        this.paymentId = builder.paymentId;
        this.name = builder.name;
        this.paymentGateway = builder.paymentGateway;
        this.amount = builder.amount;
    }


    public static class PaymentRequestBuilder {
        Integer paymentId;
        String  name;
        PaymentGateway paymentGateway;
        double amount;

        public PaymentRequestBuilder paymentId(Integer paymentId) {
            this.paymentId = paymentId;
            return this;
        }

        public PaymentRequestBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PaymentRequestBuilder paymentGateway(PaymentGateway paymentGateway) {
            this.paymentGateway = paymentGateway;
            return this;
        }

        public PaymentRequestBuilder amount(double amount) {
            this.amount = amount;
            return this;
        }

        public PaymentRequest build() {
            return new PaymentRequest(this);
        }
    }
}

