package characterTests;

import characters.Warrior;
import characters.WarriorType;
import objects.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarriorTest {

    Warrior warrior;

    @Before
    public void before(){
        warrior = new Warrior(WarriorType.BARBARIAN, Weapon.SWORD);
    }


    @Test
    public void canGetStartingHealth(){
        assertEquals(12, warrior.getStartingHealth());
    }

    @Test
    public void canGetAttack(){
        assertEquals(4, warrior.getAttack());
    }

    @Test
    public void canGetDefence(){
        assertEquals(0, warrior.getDefence());
    }

    @Test
    public void canGetTotalAttackPotential(){
        assertEquals(7, warrior.getAttackPotential());
    }

    @Test
    public void canGetTotalDefencePotential(){
        assertEquals(1, warrior.getDefencePotential());
    }

    @Test
    public void canGetWeapon(){
        assertEquals(Weapon.SWORD, warrior.getWeapon());
    }

    @Test
    public void canChangeWeapon(){
        warrior.changeWeapon(Weapon.AXE);
        assertEquals(Weapon.AXE, warrior.getWeapon());
    }


}
