package Revision.transactionhub.log;

import Revision.transactionhub.enums.LogType;

public abstract class AbstractLogger {
    private final AbstractLogger next;

    protected AbstractLogger(AbstractLogger next) {
        this.next = next;
    }

    public void log(String data, LogType logType) {
        if(isLogCurrentLogTypeSame(logType)) initiateLogging(data);
        else next.log(data, logType);
    }

    public abstract boolean isLogCurrentLogTypeSame(LogType logType);

    public abstract void initiateLogging(String data);
}
