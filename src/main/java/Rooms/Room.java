package Rooms;

import Healers.Cleric;

public class Room {

    String name;
    int availableGold;
    Enemy enemy;
    Cleric cleric;

    public Room(String name, int availableGold, Enemy enemy, Cleric cleric) {
        this.name = name;
        this.availableGold = availableGold;
        this.enemy = enemy;
        this.cleric = cleric;
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
