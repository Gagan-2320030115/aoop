package com.ridesharing;

public class UserAuthentication {
    // Step 3.1: Create a private static instance of this class
    private static UserAuthentication instance = null;

    // Step 3.2: Variable to maintain authentication state
    private boolean isAuthenticated = false;

    // Step 3.3: Make the constructor private to prevent instantiation
    private UserAuthentication() {
    }

    // Step 3.4: Create a public static method to get the single instance of the class
    public static UserAuthentication getInstance() {
        if (instance == null) {
            instance = new UserAuthentication();
        }
        return instance;
    }

    // Step 3.5: Method to authenticate user
    public void login(String username, String password) {
        if ("user".equals(username) && "password".equals(password)) {
            isAuthenticated = true;
            System.out.println("User authenticated successfully.");
        } else {
            System.out.println("Invalid credentials. Try again.");
        }
    }

    // Method to log out user
    public void logout() {
        isAuthenticated = false;
        System.out.println("User logged out successfully.");
    }

    // Method to check if user is authenticated
    public boolean isAuthenticated() {
        return isAuthenticated;
    }
}
