package Revision.transactionhub.log;

import Revision.transactionhub.enums.LogType;

public class DebugLogger extends AbstractLogger {

    public DebugLogger(AbstractLogger logger) {
        super(logger);
    }
    @Override
    public boolean isLogCurrentLogTypeSame(LogType logType) {
        return LogType.DEBUG.equals(logType);
    }

    @Override
    public void initiateLogging(String data) {
        System.out.println("[DEBUG]:" + data);

    }
}
