package Revision.paymentsystemcor.paymentservice;

import Revision.paymentsystemcor.dto.TransactionRequest;
import Revision.paymentsystemcor.enums.TransactionType;

public abstract class PaymentProcessor {

    PaymentProcessor next;

    public PaymentProcessor(PaymentProcessor next) {
        this.next = next;
    }

    public void proceedTransaction(TransactionRequest request) {
        if(canProceed(request.getTranType())) {
            this.executeTransaction(request);
        } else if(next != null) {
            next.proceedTransaction(request);
        } else {
            System.out.println("No tran type matched");
        }
    }

    public abstract boolean canProceed(TransactionType type);
    public abstract void executeTransaction(TransactionRequest request);
}
