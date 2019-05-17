package GameLogic;

public class Room {

    private Enemy enemy;
//    private Object object;

    public Room(Enemy enemy) {
        this.enemy = enemy;
//        this.object = object;
    }

    public Enemy getEnemy() {
        return enemy;
    }

//    public Object getObject() {
//        return object;
//    }
}
