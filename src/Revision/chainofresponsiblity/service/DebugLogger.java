package Revision.chainofresponsiblity.service;

import Revision.chainofresponsiblity.dto.LogRequest;
import Revision.chainofresponsiblity.enums.LogLevel;


public class DebugLogger extends Logger {
    public DebugLogger(Logger next) {
        super(next);
    }

    @Override
    public boolean canHandleRequest(LogLevel requiredLevel) {
        return requiredLevel == LogLevel.DEBUG;
    }

    @Override
    public void handleRequest(LogRequest request) {
        System.out.println("[DEBUG]: " + request.getErrorMessage());
    }
}
