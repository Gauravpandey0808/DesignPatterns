package Revision.paymentsystemcor.paymentservice;

import Revision.paymentsystemcor.dto.TransactionRequest;
import Revision.paymentsystemcor.enums.TransactionType;

public class CreditCardPaymentService extends PaymentProcessor{

    public CreditCardPaymentService(PaymentProcessor processor) {
        super(processor);
    }
    @Override
    public boolean canProceed(TransactionType type) {
        return type.equals(TransactionType.CREDIT_CARD);
    }

    @Override
    public void executeTransaction(TransactionRequest request) {
        System.out.println("Transaction id : " + request.getTransactionId() + "\n"
        + "Transaction Status : Success" + "\n"
        + "Transaction type : " + request.getTranType() + "\n"
        + "Transaction amount : " + request.getAmount());
    }
}
