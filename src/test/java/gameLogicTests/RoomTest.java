package gameLogicTests;

import GameLogic.Enemy;
import GameLogic.EnemyType;
import GameLogic.Player;
import GameLogic.Room;
import behaviours.ITool;
import characters.Warrior;
import characters.WarriorType;
import objects.Weapon;
import org.junit.Before;
import org.junit.Test;

import static objects.Weapon.*;
import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Enemy enemy;
    Player player;
    Warrior warrior;


    @Before
    public void before(){
        enemy = new Enemy(EnemyType.GIANT);
        room = new Room();
        warrior = new Warrior(WarriorType.DWARF, Weapon.AXE);
        enemy = new Enemy(EnemyType.VAMPIRE);
        player = new Player(warrior, room);

    }

    @Test
    public void startsEmpty(){
        assertEquals(0, room.enemyCount());
        assertEquals(0, room.playerCount());
    }

    @Test
    public void canAddEnemy(){
        room.addEnemy(enemy);
        assertEquals(1, room.enemyCount());
    }

    @Test
    public void canAddPlayer(){
        room.addPlayer(player);
        assertEquals(1, room.playerCount());
    }

    @Test
    public void canRemovePlayer(){
        room.addPlayer(player);
        room.removePlayer(player);
        assertEquals(0, room.playerCount());
    }

    @Test
    public void canGetEnemy(){
        room.addEnemy(enemy);
        assertEquals(enemy, room.getEnemy());
    }


}
