package Revision.chainofresponsiblity;


import Revision.chainofresponsiblity.dto.LogRequest;
import Revision.chainofresponsiblity.enums.LogLevel;
import Revision.chainofresponsiblity.service.DebugLogger;
import Revision.chainofresponsiblity.service.ErrorLogger;
import Revision.chainofresponsiblity.service.InfoLogger;
import Revision.chainofresponsiblity.service.Logger;

public class LoggerMain {

    public static void main(String[] args) {
        Logger infoLogger = new InfoLogger(new DebugLogger(new ErrorLogger(null)));

        infoLogger.produceLog(new LogRequest("Added two items in the jar", LogLevel.INFO));
        infoLogger.produceLog(new LogRequest("Aadhaar no is being added 12352344523212", LogLevel.DEBUG));
        infoLogger.produceLog(new LogRequest("Unable to connect to the db", LogLevel.ERROR));
        infoLogger.produceLog(new LogRequest("Added two items in the jar", null));

    }
}
