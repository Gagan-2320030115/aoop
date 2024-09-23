package com.example.singletonlogger;

public class UserLoginStateManager {
    private static UserLoginStateManager instance;
    private boolean loggedIn;

    private UserLoginStateManager() {
        // Private constructor to prevent external instantiation
        loggedIn = false; // Initialize login state
    }

    public static UserLoginStateManager getInstance() {
        if (instance == null) {
            instance = new UserLoginStateManager();
        }
        return instance;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void login() {
        loggedIn = true;
        // Additional logic for login (e.g., setting user details)
    }

    public void logout() {
        loggedIn = false;
        // Additional logic for logout (e.g., clearing user details)
    }
}
public class BankAccount {
    public void viewBalance() {
        UserLoginStateManager loginStateManager = UserLoginStateManager.getInstance();
        if (loginStateManager.isLoggedIn()) {
            // Display balance
        } else {
            System.out.println("Please log in first.");
        }
    }
}
