package com.bank;

public class BankingOperations {
    public static void main(String[] args) {
        // Step 8: Get the single instance of LoginManager
        LoginManager loginManager = LoginManager.getInstance();

        // Try to perform banking operations
        loginManager.loginUser(); // Should print: "User logged in successfully."
        loginManager.loginUser(); // Should print: "User is already logged in."

        if (loginManager.isUserLoggedIn()) {
            System.out.println("Performing view balance operation...");
            System.out.println("Performing deposit operation...");
            System.out.println("Performing withdraw operation...");
        }

        loginManager.logoutUser(); // Should print: "User logged out successfully."
        loginManager.logoutUser(); // Should print: "User is not logged in."
    }
}
