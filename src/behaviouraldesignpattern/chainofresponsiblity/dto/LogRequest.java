package behaviouraldesignpattern.chainofresponsiblity.dto;

import behaviouraldesignpattern.chainofresponsiblity.enums.LoggerLevel;
import lombok.Getter;

@Getter
public class LogRequest {

    private final String errorMessage;
    private final LoggerLevel loggerLevel;

    public LogRequest(String errorMessage, LoggerLevel loggerLevel) {
        this.errorMessage = errorMessage;
        this.loggerLevel = loggerLevel;
    }
}
