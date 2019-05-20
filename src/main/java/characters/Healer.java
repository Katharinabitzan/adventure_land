package characters;

import GameLogic.Player;
import objects.HealingTool;

public class Healer extends Character {

    private HealingTool healingTool;

    public Healer(HealerType characterType, HealingTool potion) {
        super(characterType);
        this.healingTool = potion;
    }

    public HealingTool getHealingTool() {
        return healingTool;
    }

    public void changeSpell(HealingTool healingTool){
        this.healingTool = healingTool;
    }

    public int getAttackPotential(){
        return super.getAttack();
    }

    public int getDefencePotential(){
        return super.getDefence();
    }

    public void healPlayer(Player player){
        player.changeHealth(this.healingTool.getHealed());
    }
}
