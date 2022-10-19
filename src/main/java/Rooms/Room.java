package Rooms;

public class Room {

    String name;
    int availableGold;
    Enemy enemy;

    IPlayable player;

    public Room(String name, int availableGold, Enemy enemy) {
        this.name = name;
        this.availableGold = availableGold;
        this.enemy = enemy;
    }

    public String getName() {
        return name;
    }

    public int getAvailableGold() {
        return availableGold;
    }

    public Enemy getEnemy() {
        return enemy;
    }

}
