package com.game;

public class GameState {
    // Step 3.1: Create a private static instance of this class
    private static GameState instance = null;

    // Step 3.2: Variables to maintain the game state
    private int currentLevel = 1;
    private int score = 0;
    private int playerHealth = 100;

    // Step 3.3: Make the constructor private to prevent instantiation
    private GameState() {
    }

    // Step 3.4: Create a public static method to get the single instance of the class
    public static GameState getInstance() {
        if (instance == null) {
            instance = new GameState();
        }
        return instance;
    }

    // Step 3.5: Methods to manipulate game state
    public void nextLevel() {
        currentLevel++;
        System.out.println("Advancing to level: " + currentLevel);
    }

    public void addScore(int points) {
        score += points;
        System.out.println("Score: " + score);
    }

    public void reduceHealth(int damage) {
        playerHealth -= damage;
        System.out.println("Player Health: " + playerHealth);
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public int getScore() {
        return score;
    }

    public int getPlayerHealth() {
        return playerHealth;
    }
}
