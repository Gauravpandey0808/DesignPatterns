package Revision.paymentsystemcor;

import Revision.paymentsystemcor.dto.TransactionRequest;
import Revision.paymentsystemcor.enums.TransactionType;
import Revision.paymentsystemcor.paymentservice.BankTransferPaymentService;
import Revision.paymentsystemcor.paymentservice.CreditCardPaymentService;
import Revision.paymentsystemcor.paymentservice.PayPalPaymentService;
import Revision.paymentsystemcor.paymentservice.PaymentProcessor;

public class PaymentSystemMain {

    public static void main(String[] args) {
        TransactionRequest newRequest = new TransactionRequest(
                "AH1111",
                TransactionType.CREDIT_CARD,
                2000.00,
                5000.00);

        PaymentProcessor processor = new CreditCardPaymentService(
                new PayPalPaymentService(
                        new BankTransferPaymentService(
                                null)));

        processor.proceedTransaction(newRequest);
    }
}
