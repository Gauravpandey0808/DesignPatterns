package Revision.transactionhub.adapter;

import Revision.transactionhub.dto.request.PaymentRequest;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RazorPayAdapter implements PaymentAdapter {
    private Integer paymentId;
    private String name;
    private double amount;

    public RazorPayAdapter(PaymentRequest request) {
        this.paymentId = request.getPaymentId();
        this.name = request.getName();
        this.amount = request.getAmount();
    }

    public void processPayment() {
        System.out.println("Processing Razorpay payment for ID: " + paymentId + ", Name: " + name + ", Amount: " + amount);
    }
}
