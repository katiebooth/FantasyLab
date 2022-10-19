import MagicPeople.Wizard;

import Rooms.Room;

public class Game {
    Room room;
    Wizard wizard;

    public Game(Room room, Wizard wizard) {
        this.room = room;
        this.wizard = wizard;
    }

    public Room getRoom() {
        return room;
    }

    public Wizard getWizard() {
        return wizard;
    }

    public void playGame(){
        System.out.println("Game is in " + room.getName() +" with " + wizard.getName()
                + " and their " +wizard.getCreature().getName()+". "
                + wizard.getName()+" is confronted with " + room.getEnemy().getName());
        System.out.println("Player health is "+ wizard.getHealth() + ". " +
                "Enemy health is "+room.getEnemy().getHealth());
        wizard.castSpell(wizard.getSpell(), room.getEnemy());
        room.attack(wizard, room.getEnemy().getWeapon());
        System.out.println("Now Player health is "+ wizard.getHealth() +".");
    }
}
