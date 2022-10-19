package MagicPeople;

public enum Creature {
    DRAGON("dragon", 20),
    HIPPOGRIFF("hippogriff", 15),
    FAIRY("fairy", 10),
    ORGE("ogre", 5);

    String name;
    int protectionPower;
    Creature(String name, int protectionPower) {
        this.name = name;
        this.protectionPower = protectionPower;
    }

    public String getName() {
        return name;
    }

    public int getProtectionPower() {
        return protectionPower;
    }
}
