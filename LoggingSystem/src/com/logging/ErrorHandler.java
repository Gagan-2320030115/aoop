package com.logging;


public class ErrorHandler extends LogHandler {

    @Override
    public void handleMessage(String message) {
        if (message.startsWith("ERROR")) {
            System.out.println("ERROR: " + message);
        } else if (nextHandler != null) {
            nextHandler.handleMessage(message);
        }
    }
}
