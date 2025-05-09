package Revision.transactionhub.log;

import Revision.transactionhub.enums.LogType;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(AbstractLogger logger) {
        super(logger);
    }
    @Override
    public boolean isLogCurrentLogTypeSame(LogType logType) {
        return LogType.ERROR.equals(logType);
    }

    @Override
    public void initiateLogging(String data) {
        System.out.println("[ERROR]:" + data);
    }
}