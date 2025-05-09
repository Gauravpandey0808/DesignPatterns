package Revision.transactionhub.adapter;

import lombok.Getter;
import lombok.Setter;
import Revision.transactionhub.dto.request.PaymentRequest;

@Getter
@Setter
public class PayPalAdapter implements PaymentAdapter {

    private Integer paymentId;
    private String name;
    private double amount;

    public PayPalAdapter(PaymentRequest request) {
        this.paymentId = request.getPaymentId();
        this.name = request.getName();
        this.amount = request.getAmount();
    }

    public void processPayment() {
        System.out.println("Processing PayPal payment for ID: " + paymentId + ", Name: " + name + ", Amount: " + amount);
    }
}
