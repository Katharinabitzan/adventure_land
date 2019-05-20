package characterTests;

import GameLogic.Enemy;
import GameLogic.EnemyType;
import GameLogic.Player;
import GameLogic.Room;
import characters.Warrior;
import characters.WarriorType;
import objects.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Warrior warrior;
    Room room;
    Enemy enemy;
    Enemy strongEnemy;
    Object object;


    @Before
    public void before(){
        warrior = new Warrior(WarriorType.DWARF, Weapon.AXE);
        enemy = new Enemy(EnemyType.VAMPIRE);
        strongEnemy = new Enemy(EnemyType.GOGMAGOG);
        room = new Room();
        player = new Player(warrior, room);
        room.addEnemy(enemy);
    }

    @Test
    public void canGetHealth(){
        assertEquals(10, player.getHealth());
    }

    @Test
    public void canFightToDeath(){
        player.fightToTheDeath(enemy);
        assertEquals(0, enemy.getHealth());
    }

    @Test
    public void canGetPosition(){
        assertEquals(room, player.getPosition());
    }

    @Test
    public void canAttack(){
        this.player.fightToTheDeath(room.getEnemy());
        assertEquals(0, this.enemy.getHealth());
    }


}
