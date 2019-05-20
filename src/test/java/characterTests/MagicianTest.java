package characterTests;

import characters.Magician;
import characters.MagicianType;
import objects.Spell;
import objects.SummonCreature;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MagicianTest {

    Magician magician;

    @Before
    public void before(){
        magician = new Magician(MagicianType.WIZARD, Spell.CRUCIO, SummonCreature.BASILISK);
    }

    @Test
    public void canGetStartingHealth(){
        assertEquals(9, magician.getStartingHealth());
    }

    @Test
    public void canGetPotion(){ assertEquals( Spell.CRUCIO, magician.getSpell());}

    @Test
    public void canGetSummonCreature() { assertEquals(SummonCreature.BASILISK, magician.getSummonCreature());}


    @Test
    public void canGetDefence(){
        assertEquals(6, magician.getDefencePotential());
    }

    @Test
    public void canChangeSpell(){
        magician.changeSpell(Spell.AVADAKADAVRA);
        assertEquals(Spell.AVADAKADAVRA, magician.getSpell());
    }
}

