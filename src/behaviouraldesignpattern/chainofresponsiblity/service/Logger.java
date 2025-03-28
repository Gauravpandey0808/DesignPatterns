package behaviouraldesignpattern.chainofresponsiblity.service;

import behaviouraldesignpattern.chainofresponsiblity.dto.LogRequest;
import behaviouraldesignpattern.chainofresponsiblity.enums.LoggerLevel;

public abstract class Logger {
    private Logger next;

    public void setNext(Logger next) {
        this.next = next;
    }

    public void log(LogRequest request) {
        if(canHandleRequest(request.getLoggerLevel())) {
            writeLog(request);
        } else if (next != null) {
            next.log(request);
        } else {
            System.out.println("No logger available for level: ");
        }
    }

    abstract boolean canHandleRequest(LoggerLevel level);
    abstract void  writeLog(LogRequest request);
}
