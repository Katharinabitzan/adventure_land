package characters;

import behaviours.IExist;

public enum MagicianType implements IExist {
    WARLOCK(8, 1, 1),
    WIZARD(9, 1, 1),
    WITCH(5, 1, 1);

    private final int startingHealth;
    private final int attack;
    private final int defence;

    MagicianType(int startingHealth, int attack, int defence) {
        this.startingHealth = startingHealth;
        this.attack = attack;
        this.defence = defence;
    }

    public int getStartingHealth() {
        return startingHealth;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }

}
