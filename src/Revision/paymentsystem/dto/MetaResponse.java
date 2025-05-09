package Revision.paymentsystem.dto;

public class MetaResponse {

    private final String status;
    private final String code;
    private final String description;

    public MetaResponse(String status, String code, String description) {
        this.status = status;
        this.code = code;
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

}
