package Revision.paymentsystem.validation;

import Revision.paymentsystem.dto.PaymentRequest;
import Revision.paymentsystem.exception.PaymentValidationExceptionHandler;

public interface BaseValidator {

    void validate(PaymentRequest paymentRequest) throws PaymentValidationExceptionHandler;
}