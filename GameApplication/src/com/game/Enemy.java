package com.game;


abstract class Enemy {
    public abstract void attack();
}


class EasyEnemy extends Enemy {
    public void attack() {
        System.out.println("Easy Enemy attacks lightly.");
    }
}

class MediumEnemy extends Enemy {
    public void attack() {
        System.out.println("Medium Enemy attacks moderately.");
    }
}

class HardEnemy extends Enemy {
    public void attack() {
        System.out.println("Hard Enemy attacks fiercely.");
    }
}


class EnemyFactory {
    public static Enemy createEnemy(String difficulty) {
        switch (difficulty.toLowerCase()) {
            case "easy":
                return new EasyEnemy();
            case "medium":
                return new MediumEnemy();
            case "hard":
                return new HardEnemy();
            default:
                throw new IllegalArgumentException("Unknown difficulty level: " + difficulty);
        }
    }
}
