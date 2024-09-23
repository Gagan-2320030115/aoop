package com.logging;


public class DebugHandler extends LogHandler {

    @Override
    public void handleMessage(String message) {
        if (message.startsWith("DEBUG")) {
            System.out.println("DEBUG: " + message);
        } else if (nextHandler != null) {
            nextHandler.handleMessage(message);
        }
    }
}
