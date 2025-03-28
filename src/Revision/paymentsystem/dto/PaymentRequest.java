package Revision.paymentsystem.dto;

import java.time.LocalDateTime;

public class PaymentRequest {

    private final String paymentMethod;
    private final String PSP;
    private final double amount;
    private final LocalDateTime paymentTime;
    public int id;

    public PaymentRequest(String paymentMethod, String PSP, double amount, LocalDateTime paymentTime) {
        this.paymentMethod = paymentMethod;
        this.PSP = PSP;
        this.amount = amount;
        this.paymentTime = paymentTime;
    }

    public LocalDateTime getPaymentTime() {
        return paymentTime;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getPSP() {
        return PSP;
    }

    public double getAmount() {
        return amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
