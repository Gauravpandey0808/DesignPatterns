package Revision.paymentsystem.dto;

import java.time.LocalDateTime;

public class PaymentResponse {

    private final int id;
    private final String PSP;
    private final String paymentMethod;
    private final boolean isSuccessful;
    private final double amount;
    private final LocalDateTime paymentTime;
    private final MetaResponse metaResponse;


    public PaymentResponse(int id, String PSP, String paymentMethod, boolean isSuccessful, double amount, LocalDateTime paymentTime, MetaResponse metaResponse) {
        this.id = id;
        this.PSP = PSP;
        this.paymentMethod = paymentMethod;
        this.isSuccessful = isSuccessful;
        this.amount = amount;
        this.paymentTime = paymentTime;
        this.metaResponse = metaResponse;
    }

    public LocalDateTime getPaymentTime() {
        return paymentTime;
    }

    public MetaResponse getMetaResponse() {
        return metaResponse;
    }

    public int getId() {
        return id;
    }

    public String getPSP() {
        return PSP;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public boolean isSuccessful() {
        return isSuccessful;
    }

    public double getAmount() {
        return amount;
    }
}
