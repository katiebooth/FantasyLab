package Fighters;

public class Knight extends Fighter {

    int armourStrength;

    public Knight(String name, Weapon weapon, int gold, int health, int armourStrength) {
        super(name, weapon, gold, health);
        this.armourStrength = armourStrength;
    }

    @Override
    public String fight(Weapon weapon) {
        return "Knight is fighting with " + weapon.getName();
    }
}
