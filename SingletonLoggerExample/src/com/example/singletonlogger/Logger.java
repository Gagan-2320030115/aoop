package com.example.singletonlogger;

public class Logger {
    // Step 1: Create a private static variable to hold the single instance of the Logger
    private static Logger instance;

    // Step 2: Make the constructor private so it cannot be instantiated from outside the class
    private Logger() {
        // Private constructor to prevent instantiation
    }

    // Step 3: Provide a public static method to get the single instance of the Logger
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Method to log messages
    public void log(String message) {
        System.out.println("Log message: " + message);
    }

    // Main method to demonstrate the Singleton pattern
    public static void main(String[] args) {
        // Step 4: Get the single instance of Logger and use it to log messages
        Logger logger = Logger.getInstance();
        logger.log("Starting the application...");
        
        // Attempt to get another instance and log another message
        Logger anotherLogger = Logger.getInstance();
        anotherLogger.log("Application is running...");

        // Check if both logger instances are the same
        if (logger == anotherLogger) {
            System.out.println("Both loggers are the same instance.");
        }
    }
}
