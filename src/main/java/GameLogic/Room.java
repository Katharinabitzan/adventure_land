package GameLogic;

import java.util.ArrayList;

public class Room {

    private ArrayList<Enemy> enemies;
    private ArrayList<Object> objects;
    private ArrayList<Player> players;

    public Room() {
        this.enemies = new ArrayList<>();
        this.objects = new ArrayList<>();
        this.players = new ArrayList<>();
    }

    public void addObject(Object object){
        this.objects.add(object);
    }

    public void addEnemy(Enemy enemy){
        this.enemies.add(enemy);
    }

    public int playerCount() {
        return players.size();
    }
    public void addPlayer(Player player){
        players.add(player);
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }

    public int enemyCount(){ return enemies.size();}

    public Enemy getEnemy() { return enemies.get(0);
    }
}
