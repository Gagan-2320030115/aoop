package com.bank;

public class LoginManager {
    // Step 4: Create a private static instance of this class
    private static LoginManager instance = null;

    // Step 5: Create a private variable to maintain login state
    private boolean isLoggedIn = false;

    // Step 6: Make the constructor private to prevent instantiation
    private LoginManager() {
    }

    // Step 7: Create a public static method to get the single instance of the class
    public static LoginManager getInstance() {
        if (instance == null) {
            instance = new LoginManager();
        }
        return instance;
    }

    // Method to log in the user
    public void loginUser() {
        if (!isLoggedIn) {
            isLoggedIn = true;
            System.out.println("User logged in successfully.");
        } else {
            System.out.println("User is already logged in.");
        }
    }

    // Method to log out the user
    public void logoutUser() {
        if (isLoggedIn) {
            isLoggedIn = false;
            System.out.println("User logged out successfully.");
        } else {
            System.out.println("User is not logged in.");
        }
    }

    // Method to check if the user is logged in
    public boolean isUserLoggedIn() {
        return isLoggedIn;
    }
}
