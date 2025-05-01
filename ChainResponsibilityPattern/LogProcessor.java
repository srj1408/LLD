package ChainResponsibilityPattern;

public abstract class LogProcessor {

    // log levels
    static final int INFO = 1;
    static final int DEBUG = 2;
    static final int ERROR = 3;

    LogProcessor nextLogProcessor;

    // sets the next log processor in chain
    LogProcessor(LogProcessor logProcessor){
        nextLogProcessor = logProcessor;
    }

    // calls the log method of next log processor
    public void log(int logLevel, String message) {
        if(nextLogProcessor != null) nextLogProcessor.log(logLevel,message);
    }
}
