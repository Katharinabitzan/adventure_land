package characters;

import objects.Weapon;

public class Warrior extends Character {

    Weapon weapon;

    public Warrior(WarriorType characterType, Weapon weapon) {
        super(characterType);
        this.weapon = weapon;
    }

    public void changeWeapon(Weapon chosenWeapon){
        this.weapon = chosenWeapon;
    }

    public int getAttackPotential(){
        return super.getAttack() + this.weapon.getAttack();
    }

    public int getDefencePotential(){
        return super.getDefence() + this.weapon.getDefence();
    }

}
