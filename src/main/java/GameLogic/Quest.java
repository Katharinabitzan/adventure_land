package GameLogic;

import java.util.ArrayList;

public class Quest {

    private Player player1;
    private Player player2;
    private ArrayList<Room> rooms;

    public Quest(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.rooms = new ArrayList<>();
    }

    public void startQuest(){
        player1.changeRoom(this.rooms.get(0));
    }

}
