package Rooms;

import Fighters.Weapon;

public enum Enemy {
    TROLL("Troll",Weapon.CLUB),
    ORC("Orc", Weapon.MACE);

    String name;
    Weapon weapon;

    Enemy(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    }

