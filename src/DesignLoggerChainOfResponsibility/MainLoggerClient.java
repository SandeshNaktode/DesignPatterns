package DesignLoggerChainOfResponsibility;

public class MainLoggerClient {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new EroorLogProcessor(null)));

        logProcessor.log(LogProcessor.ERROR, "Exception ocuured");
        logProcessor.log(LogProcessor.DEBUG, "Please Debug This");
        logProcessor.log(LogProcessor.INFO, "For Your Information");
    }
}
