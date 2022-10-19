package Fighters;

public class Dwarf extends Fighter{

    int tenacity;

    public Dwarf(String name, Weapon weapon, int gold, int health, int tenacity) {
        super(name, weapon, gold, health);
        this.tenacity = tenacity;
    }

    @Override
    public String fight(Weapon weapon) {
        return "Dwarf is fighting with " + weapon.getName();
    }

}
