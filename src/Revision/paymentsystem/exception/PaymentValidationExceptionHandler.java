package Revision.paymentsystem.exception;

import lombok.Getter;

@Getter
public class PaymentValidationExceptionHandler extends RuntimeException {
    private final String message;
    private final String errorCode;
    private final String status;
    private final String description;

    public PaymentValidationExceptionHandler(String message, String errorCode, String status, String description) {
        super(message);
        this.message = message;
        this.errorCode = errorCode;
        this.status = status;
        this.description = description;
    }

}
