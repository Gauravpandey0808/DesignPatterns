package behaviouraldesignpattern.chainofresponsiblity.service;

import behaviouraldesignpattern.chainofresponsiblity.dto.LogRequest;
import behaviouraldesignpattern.chainofresponsiblity.enums.LoggerLevel;

import java.util.Objects;

public class ErrorLogger  extends Logger {


    @Override
    boolean canHandleRequest(LoggerLevel level) {
        return Objects.equals(level.getLevel(), LoggerLevel.ERROR.getLevel());
    }

    @Override
    void writeLog(LogRequest request) {
        System.out.println("[ERROR]: " + request.getErrorMessage());
    }
}
