package Fighters;

import MagicPeople.Player;

public abstract class Fighter extends Player implements IFight {
    String name;
    int gold;
    int health;
    Weapon weapon;


    public Fighter(String name, Weapon weapon, int gold, int health) {
        super(name, gold, health);
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
