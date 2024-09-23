package com.game;


interface ItemFactory {
    Weapon createWeapon();
    PowerUp createPowerUp();
}


abstract class Weapon {
    public abstract void use();
}

abstract class PowerUp {
    public abstract void activate();
}


class Sword extends Weapon {
    public void use() {
        System.out.println("Swinging a sword!");
    }
}

class Gun extends Weapon {
    public void use() {
        System.out.println("Shooting a gun!");
    }
}


class HealthPack extends PowerUp {
    public void activate() {
        System.out.println("Using a health pack!");
    }
}

class Shield extends PowerUp {
    public void activate() {
        System.out.println("Activating a shield!");
    }
}


class EasyItemFactory implements ItemFactory {
    public Weapon createWeapon() {
        return new Sword();
    }

    public PowerUp createPowerUp() {
        return new HealthPack();
    }
}

class HardItemFactory implements ItemFactory {
    public Weapon createWeapon() {
        return new Gun();
    }

    public PowerUp createPowerUp() {
        return new Shield();
    }
}
