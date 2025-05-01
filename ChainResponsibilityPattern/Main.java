package ChainResponsibilityPattern;

public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null))); // chain of responsibility

        logProcessor.log(LogProcessor.ERROR, "Error");
        logProcessor.log(LogProcessor.DEBUG, "Debug");
        logProcessor.log(LogProcessor.INFO, "Info");
    }
}
