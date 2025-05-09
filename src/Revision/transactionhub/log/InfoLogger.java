package Revision.transactionhub.log;

import Revision.transactionhub.enums.LogType;

public class InfoLogger extends AbstractLogger {

    public InfoLogger(AbstractLogger logger) {
        super(logger);
    }
    @Override
    public boolean isLogCurrentLogTypeSame(LogType logType) {
        return LogType.INFO.equals(logType);
    }

    @Override
    public void initiateLogging(String data) {
        System.out.println("[Info]:" + data);
    }
}