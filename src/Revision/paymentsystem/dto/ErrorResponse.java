package Revision.paymentsystem.dto;

public class ErrorResponse {

    private final String errorCode;
    private final String status;
    private final String errorDescription;

    public ErrorResponse(String errorCode, String status, String errorDescription) {
        this.errorCode = errorCode;
        this.status = status;
        this.errorDescription = errorDescription;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getStatus() {
        return status;
    }

    public String getErrorDescription() {
        return errorDescription;
    }
}
