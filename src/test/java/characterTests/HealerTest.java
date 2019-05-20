package characterTests;

import characters.Healer;
import characters.HealerType;
import objects.HealingTool;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealerTest {

    Healer healer;

    @Before
    public void before(){
        healer = new Healer(HealerType.BUSHDOCTOR, HealingTool.OCULUSPOTION);
    }

    @Test
    public void canGetStartingHealth(){
        assertEquals(4, healer.getStartingHealth());
    }

    @Test
    public void canGetPotion(){ assertEquals( HealingTool.OCULUSPOTION, healer.getHealingTool());}

    @Test
    public void canGetAttack(){
        assertEquals(1, healer.getAttackPotential());
    }

    @Test
    public void canGetDefence(){
        assertEquals(1, healer.getDefencePotential());
    }

    @Test
    public void canChangeSpell(){
        healer.changeSpell(HealingTool.CHILIPEPPER);
        assertEquals(HealingTool.CHILIPEPPER, healer.getHealingTool());
    }
}

