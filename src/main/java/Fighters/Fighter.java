package Fighters;

import Rooms.IPlayable;

public abstract class Fighter implements IFight, IPlayable {
    String name;
    int gold;
    int health;
    Weapon weapon;


    public Fighter(String name, Weapon weapon, int gold, int health) {
        this.name = name;
        this.gold = gold;
        this.health = health;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getGold() {
        return gold;
    }

    public int getHealth() {
        return health;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


}
