package Fighters;

public class Barbarian extends Fighter{

    public Barbarian(String name, Weapon weapon, int gold, int health) {
        super(name, weapon, gold, health);
    }

    @Override
    public String fight(Weapon weapon) {
        return "Barbarian is fighting with " + weapon.getName();
    }
}
