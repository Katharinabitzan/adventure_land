package characters;

import behaviours.IExist;
import objects.Spell;
import objects.SummonCreature;

public class Magician extends Character{

    Spell spell;
    SummonCreature summonCreature;

    public Magician(MagicianType characterType, Spell spell, SummonCreature creature) {
        super(characterType);
        this.spell = spell;
        this.summonCreature = creature;
    }

    public void changeSpell(Spell chosenSpell){
        this.spell = chosenSpell;
    }

    public int getAttackPotential(){
        return super.getAttack() + this.spell.getAttack();
    }

    public int getDefencePotential(){
        return super.getDefence() + this.summonCreature.getDefence();
    }
}
