package Revision.paymentsystem.entity;

import lombok.Data;

@Data
public class PaymentMethods {

    private final Integer id;

    private final String paymentMethod;

    private final Boolean isActive;

    public PaymentMethods(Integer id, String paymentMethod, Boolean isActive) {
        this.id = id;
        this.paymentMethod = paymentMethod;
        this.isActive = isActive;
    }
}
