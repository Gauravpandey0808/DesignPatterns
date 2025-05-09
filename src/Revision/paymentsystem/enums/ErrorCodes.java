package Revision.paymentsystem.enums;

import lombok.Getter;

@Getter
public enum ErrorCodes {

    PS000("Successfully done", "0", "200"),
    PS001("Technical Issue please try again later", "2", "502"),
    PS002("Failed - Insufficient Amount", "2", "400"),
    PS003("Invalid Payment ID", "2", "400"),
    PS004("Payment Timeout, please retry", "2", "408"),
    PS005("Invalid PSP ID", "2", "400"),
    PS006("Payment Cancelled by User", "1", "499"),
    PS007("Transaction Already Processed", "1", "409"),
    PS008("Payment in Progress", "1", "202"),
    PS009("Currency Not Supported", "2", "400"),
    PS010("Payment Method Not Allowed", "2", "403"),
    PS011("Invalid Card Details", "2", "422"),
    PS012("Payment Under Review", "1", "202"),
    PS013("Exceeded Transaction Limit", "2", "429"),
    PS014("Payment Gateway Unavailable", "2", "503"),
    PS015("Suspicious Transaction Detected", "2", "451"),
    PS016("Card Expired", "2", "400"),
    PS017("Payment Refunded", "0", "200"),
    PS018("Partial Payment Done", "1", "206"),
    PS019("Duplicate Transaction Detected", "1", "409"),
    PS020("Transaction Failed Due to Network Error", "2", "504"),
    PS021("Authorization Failed", "2", "401"),
    PS022("Internal Server Error", "2", "500"),
    PS023("Invalid Transaction Amount", "2", "400"),
    PS024("Transaction Declined by Bank", "2", "402"),
    PS025("Payment Verification Pending", "1", "202"),
    PS026("Invalid OTP Entered", "2", "403"),
    PS027("Session Expired, please retry", "2", "440"),
    PS028("Payment Blocked by Fraud Detection", "2", "451"),
    PS029("Bank Server Unreachable", "2", "503"),
    PS030("Payment Queued for Processing", "1", "202"),
    PS031("Payment amount is below the minimum allowed limit", "1", "400"),
    PS032("Payment timestamp is invalid or expired", "1", "400"),;

    private final String errorDescription;
    private final String errorStatus;
    private final String errorCode;

    ErrorCodes(String errorDescription, String errorStatus, String errorCode) {
        this.errorDescription = errorDescription;
        this.errorStatus = errorStatus;
        this.errorCode = errorCode;
    }
}
