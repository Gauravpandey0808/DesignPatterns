package Revision.paymentsystemcor.dto;

import Revision.paymentsystemcor.enums.TransactionType;
import lombok.Getter;

@Getter
public class TransactionRequest {

    private final String transactionId;
    private final TransactionType tranType;
    private final Double amount;

    public TransactionRequest(String transactionId, TransactionType tranType, Double amount, Double bankBalance) {
        this.transactionId = transactionId;
        this.tranType = tranType;
        this.amount = amount;
        this.bankBalance = bankBalance;
    }

    private final Double bankBalance;


}
