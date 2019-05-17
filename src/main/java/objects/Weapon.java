package objects;

import behaviours.ITool;

public enum Weapon implements ITool {
    SWORD(3, 1),
    AXE(2, 0),
    CLUB(1, 0),
    HAMMER(2, 0);

    private final int attack;
    private final int defence;

    Weapon(int attack, int defence){
        this.attack = attack;
        this.defence = defence;
    }

    public int getAttack() {
        return this.attack;
    }
    public int getDefence() {return this.defence;}
}
