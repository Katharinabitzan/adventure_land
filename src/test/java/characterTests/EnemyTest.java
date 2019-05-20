package characterTests;

import GameLogic.Enemy;
import GameLogic.EnemyType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Enemy enemy;

    @Before
    public void before(){
        enemy = new Enemy(EnemyType.VAMPIRE);

    }

    @Test
    public void canGetEnemy(){
        assertEquals(EnemyType.VAMPIRE, enemy.getEnemy());
    }

    @Test
    public void canGetAttack(){
        assertEquals(2, enemy.getAttackPotential());
    }

    @Test
    public void canGetDefence(){
        assertEquals(2, enemy.getDefencePotential());
    }

    @Test
    public void canGetHealth(){
        assertEquals(2, enemy.getHealth());
    }

    @Test
    public void canChangeHealth(){
        enemy.changeHealth(3);
        assertEquals(5, enemy.getHealth());
    }

    @Test
    public void canFight(){
        enemy.defend(3);
        assertEquals(1, enemy.getHealth());
    }

}

