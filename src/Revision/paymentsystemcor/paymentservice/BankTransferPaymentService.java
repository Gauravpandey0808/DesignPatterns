package Revision.paymentsystemcor.paymentservice;

import Revision.paymentsystemcor.dto.TransactionRequest;
import Revision.paymentsystemcor.enums.TransactionType;

public class BankTransferPaymentService  extends PaymentProcessor {

    public BankTransferPaymentService(PaymentProcessor processor) {
        super(processor);
    }

    @Override
    public boolean canProceed(TransactionType type) {
        return type.equals(TransactionType.BANK_TRANSFER);
    }

    @Override
    public void executeTransaction(TransactionRequest request) {
        System.out.println("Transaction id : " + request.getTransactionId() + "\n"
                + "Transaction Status : Success" + "\n"
                + "Transaction type : " + request.getTranType() + "\n"
                + "Transaction amount : " + request.getAmount());
    }
}