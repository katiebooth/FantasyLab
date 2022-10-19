public abstract class PlayableCharacter {

    private String name;
    private int gold;
    private int health;

    public PlayableCharacter(String name, int gold, int health) {
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
