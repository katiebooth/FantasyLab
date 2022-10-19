import Fighters.Fighter;
import MagicPeople.Player;
import Rooms.Room;

public class Game {
    Room room;
    Player player;

    public Game(Room room, Player player) {
        this.room = room;
        this.player = player;
    }

    public Room getRoom() {
        return room;
    }

    public Player getPlayer() {
        return player;
    }

    public String playGame(Room room, Player player){
        return "Game is in room " + room.getName() +" with "+ player.getName();
    }
}
