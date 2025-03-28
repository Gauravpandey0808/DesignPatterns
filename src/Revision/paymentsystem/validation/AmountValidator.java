package Revision.paymentsystem.validation;

import Revision.paymentsystem.dto.PaymentRequest;
import Revision.paymentsystem.enums.ErrorCodes;
import Revision.paymentsystem.exception.PaymentValidationExceptionHandler;

public class AmountValidator  implements BaseValidator {

    @Override
    public void validate(PaymentRequest paymentRequest) throws PaymentValidationExceptionHandler {
        //    As of in spring boot this will be configured in config file or db
        double minAmount = 20.00;
        if(paymentRequest.getAmount() < minAmount) throw new
                PaymentValidationExceptionHandler(ErrorCodes.PS031.getErrorDescription(),
                ErrorCodes.PS031.getErrorCode(),
                ErrorCodes.PS031.getErrorStatus(),
                "Please try again with greater amount");
    }
}
