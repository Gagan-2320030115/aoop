package com.game;

public class Game {
    public static void main(String[] args) {
       
        GameState gameState = GameState.getInstance();

       
        Enemy easyEnemy = EnemyFactory.createEnemy("easy");
        easyEnemy.attack();

        Enemy hardEnemy = EnemyFactory.createEnemy("hard");
        hardEnemy.attack();

        
        ItemFactory easyItemFactory = new EasyItemFactory();
        Weapon easyWeapon = easyItemFactory.createWeapon();
        PowerUp easyPowerUp = easyItemFactory.createPowerUp();

        easyWeapon.use();
        easyPowerUp.activate();

        ItemFactory hardItemFactory = new HardItemFactory();
        Weapon hardWeapon = hardItemFactory.createWeapon();
        PowerUp hardPowerUp = hardItemFactory.createPowerUp();

        hardWeapon.use();
        hardPowerUp.activate();

        
        gameState.nextLevel();
        gameState.addScore(50);
        gameState.reduceHealth(20);
    }
}
