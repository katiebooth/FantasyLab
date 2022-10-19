package Fighters;

public enum Weapon {
    SWORD("sword", 50),
    AXE("axe", 40),
    CLUB("club", 30),
    MACE("mace", 20);
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
