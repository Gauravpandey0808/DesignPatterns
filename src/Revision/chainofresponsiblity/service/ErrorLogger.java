package Revision.chainofresponsiblity.service;

import Revision.chainofresponsiblity.dto.LogRequest;
import Revision.chainofresponsiblity.enums.LogLevel;

public class ErrorLogger extends Logger {
    public ErrorLogger(Logger next) {
        super(next);
    }

    @Override
    public boolean canHandleRequest(LogLevel requiredLevel) {
        return requiredLevel == LogLevel.ERROR;
    }

    @Override
    public void handleRequest(LogRequest request) {
        System.out.println("[ERROR]: " + request.getErrorMessage());
    }
}
