package MagicPeople;

public enum Spell {
    FIENDFYRE("fiendfyre", "This sets fire to things", 40),
    FLIPENDO("flipendo", "This will knock your enemies back", 30),
    MELOFORS("melofors", "This will encase your enemy's head in a pumpkin", 10);

    String name;
    String desc;
    int power;

    Spell(String name, String desc, int power) {
        this.name = name;
        this.desc = desc;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }


    public int getPower() {
        return power;
    }

}
