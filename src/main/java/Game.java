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
        System.out.println("The game is in " + room.getName() +" with " + wizard.getName()
                + " and their " +wizard.getCreature().getName()+ ". There are "+room.getAvailableGold()+
                " coins on offer! "
                + wizard.getName()+" is confronted with " + room.getEnemy().getName());

        System.out.println("Player health is "+ wizard.getHealth() + ". " +
                "Enemy health is "+room.getEnemy().getHealth());
        int round = 0;
        while(wizard.getHealth() > 0 && room.getEnemy().getHealth() > 0){
            while(wizard.getHealth() > 20 && room.getEnemy().getHealth() > 0){
                round += 1;
                System.out.println();
                System.out.println("Round : "+round);
                wizard.castSpell(wizard.getSpell(), room.getEnemy());
                    if(room.getEnemy().getHealth() <= 0){
                    wizard.collectCoins(room.getAvailableGold());
                    System.out.println("You have won! Collect your coins!. New coin balance : "+wizard.getGold());
                        break;}
                room.attack(wizard, room.getEnemy().getWeapon());
                if(wizard.getHealth() <= 0){
                System.out.println("You have lost! Please exit the room");
                break;}
                else System.out.println("Now Player health is "+ wizard.getHealth() +".");
        }

        if (wizard.getHealth() > 0 && room.getEnemy().getHealth() > 0) {
            System.out.println("Your health is low, use the cleric to boost it!");
            wizard.boostHealth(room.getCleric());
        }
        }
    }
}
