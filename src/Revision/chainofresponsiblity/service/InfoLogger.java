package Revision.chainofresponsiblity.service;

import Revision.chainofresponsiblity.dto.LogRequest;
import Revision.chainofresponsiblity.enums.LogLevel;

public class InfoLogger extends Logger {
    public InfoLogger(Logger next) {
        super(next);
    }

    @Override
    public boolean canHandleRequest(LogLevel requiredLevel) {
        return requiredLevel == LogLevel.INFO;
    }

    @Override
    public void handleRequest(LogRequest request) {
        System.out.println("[INFO]: " + request.getErrorMessage());
    }
}
