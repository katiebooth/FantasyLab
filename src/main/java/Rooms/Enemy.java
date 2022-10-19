package Rooms;

import Fighters.Weapon;

public class Enemy {

    String name;
    Weapon weapon;
    int health;

    public Enemy(String name, Weapon weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage){
        health -= damage;
    }

}
