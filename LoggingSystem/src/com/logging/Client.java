package com.logging;

public class Client {
    public static void main(String[] args) {
        
        LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();

        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);

      
        Logger logger = new Logger();
        logger.addCommand(new LogCommand(infoHandler));
        logger.addCommand(new LogCommand(debugHandler));
        logger.addCommand(new LogCommand(errorHandler));

        
        System.out.println("Logging INFO message:");
        logger.executeCommands("INFO: System is starting up.");

        System.out.println("Logging DEBUG message:");
        logger.executeCommands("DEBUG: Debugging the system.");

        System.out.println("Logging ERROR message:");
        logger.executeCommands("ERROR: System encountered an error.");
    }
}
