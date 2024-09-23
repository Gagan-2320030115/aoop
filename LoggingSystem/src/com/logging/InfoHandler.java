package com.logging;


public class InfoHandler extends LogHandler {

    @Override
    public void handleMessage(String message) {
        if (message.startsWith("INFO")) {
            System.out.println("INFO: " + message);
        } else if (nextHandler != null) {
            nextHandler.handleMessage(message);
        }
    }
}
