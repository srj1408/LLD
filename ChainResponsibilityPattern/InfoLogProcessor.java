package ChainResponsibilityPattern;

public class InfoLogProcessor extends LogProcessor{

    InfoLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    public void log(int logLevel, String message) {
        if(logLevel == INFO) System.out.println("INFO: "+message); //if log level is info then prints message
        else super.log(logLevel, message); // calls log method of log processor which in turn calls log method of next log processor in chain
    }
}
