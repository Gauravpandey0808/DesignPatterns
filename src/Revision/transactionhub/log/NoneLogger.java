package Revision.transactionhub.log;

import Revision.transactionhub.enums.LogType;

public class NoneLogger extends AbstractLogger {

    public NoneLogger(AbstractLogger logger) {
        super(logger);
    }
    @Override
    public boolean isLogCurrentLogTypeSame(LogType logType) {
        return true;
    }

    @Override
    public void initiateLogging(String data) {
        System.out.println("[Error]: There is no such category of logger -> " + data );
    }
}