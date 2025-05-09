package Revision.chainofresponsiblity.service;


import Revision.chainofresponsiblity.dto.LogRequest;
import Revision.chainofresponsiblity.enums.LogLevel;

public abstract class Logger {

    private final Logger next;

    Logger(Logger next) {
        this.next = next;
    }

    public void produceLog(LogRequest request) {
        if(canHandleRequest(request.getLogLevel())) {
            handleRequest(request);
        } else if(null != next) {
            next.produceLog(request);
        } else {
            System.out.println("No Such logger level is available");
        }
    }

    public abstract boolean  canHandleRequest(LogLevel requiredLevel);

    public abstract void handleRequest(LogRequest request);

}
