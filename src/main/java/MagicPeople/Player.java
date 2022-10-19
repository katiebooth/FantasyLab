package MagicPeople;

public abstract class Player {
    private String name;
    private int gold;
    protected int health;

    public Player(String name, int gold, int health) {
        this.name = name;
        this.gold = gold;
        this.health = health;
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


}
