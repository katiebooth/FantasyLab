package MagicPeople;

public enum Creature {
    DRAGON("dragon", 50),
    HIPPOGRIFF("hippogriff", 40),
    FAIRY("fairy", 30),
    ORGE("ogre", 5);

    String name;
    int protectionPower;
    Creature(String name, int protectionPower) {
    }

    public String getName() {
        return name;
    }

    public int getProtectionPower() {
        return protectionPower;
    }
}
