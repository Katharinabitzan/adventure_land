package characters;

import behaviours.IExist;
import objects.Spell;
import objects.SummonCreature;

import java.util.ArrayList;

public class Magician extends Character{

Spell spell;
SummonCreature summonCreature;

    public Magician(MagicianType characterType, Spell spell, SummonCreature creature) {
        super(characterType);
        this.spell = spell;
        this.summonCreature = creature;
    }


    public Spell getSpell() {
        return spell;
    }

    public SummonCreature getSummonCreature() {
        return summonCreature;
    }

    public void changeSpell(Spell spell){
        this.spell = spell;
    }

    public int getDefencePotential(){
        return super.getDefence() + this.summonCreature.getDefence();
    }

}
