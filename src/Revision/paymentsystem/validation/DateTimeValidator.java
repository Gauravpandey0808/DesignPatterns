package Revision.paymentsystem.validation;

import Revision.paymentsystem.dto.PaymentRequest;
import Revision.paymentsystem.enums.ErrorCodes;
import Revision.paymentsystem.exception.PaymentValidationExceptionHandler;

import java.time.Duration;
import java.time.LocalDateTime;

public class DateTimeValidator implements BaseValidator {

    @Override
    public void validate(PaymentRequest paymentRequest) throws PaymentValidationExceptionHandler {

        LocalDateTime currentTime = LocalDateTime.now();

        boolean isTimeInDuration = Duration.between(paymentRequest.getPaymentTime(), currentTime).abs().toMinutes() <= 2;
        if(!isTimeInDuration) throw new PaymentValidationExceptionHandler(
                ErrorCodes.PS032.getErrorDescription(),
                ErrorCodes.PS032.getErrorCode(),
                ErrorCodes.PS032.getErrorStatus(),
                "Time Stamp is invalid"
        );

    }
}
