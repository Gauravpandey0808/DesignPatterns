package Revision.chainofresponsiblity.dto;

import Revision.chainofresponsiblity.enums.LogLevel;
import lombok.Getter;

@Getter
public class LogRequest {

    private  final String errorMessage;
    private  final LogLevel logLevel;


    public LogRequest(String errorMessage, LogLevel logLevel) {
        this.errorMessage = errorMessage;
        this.logLevel = logLevel;
    }
}
