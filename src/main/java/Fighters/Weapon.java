package Fighters;

public enum Weapon {
    SWORD("sword", 40),
    AXE("axe", 30),
    CLUB("club", 20),
    MACE("mace", 5);
    ;

    int power;
    String name;

    Weapon(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public String getName() {
        return name;
    }
}
