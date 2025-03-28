package behaviouraldesignpattern.chainofresponsiblity;

import behaviouraldesignpattern.chainofresponsiblity.dto.LogRequest;
import behaviouraldesignpattern.chainofresponsiblity.enums.LoggerLevel;
import behaviouraldesignpattern.chainofresponsiblity.service.DebugLogger;
import behaviouraldesignpattern.chainofresponsiblity.service.ErrorLogger;
import behaviouraldesignpattern.chainofresponsiblity.service.InfoLogger;
import behaviouraldesignpattern.chainofresponsiblity.service.Logger;

public class LoggerMain {

    public static void main(String[] args) {
        Logger infoLogger = new InfoLogger();
        Logger errorLogger = new ErrorLogger();
        Logger debugLogger = new DebugLogger();

        infoLogger.setNext(errorLogger);
        errorLogger.setNext(debugLogger);
        debugLogger.setNext(null);

        LogRequest logRequest1 = new LogRequest("This is critical issue", LoggerLevel.ERROR);
        LogRequest logRequest2 = new LogRequest("This is just info line", LoggerLevel.INFO);
        LogRequest logRequest3 = new LogRequest("This is debug message", LoggerLevel.DEBUG);
        LogRequest logRequest4 = new LogRequest("This is some other isse", null);

        infoLogger.log(logRequest1);
        infoLogger.log(logRequest2);
        infoLogger.log(logRequest3);
        infoLogger.log(logRequest4);
    }
}
