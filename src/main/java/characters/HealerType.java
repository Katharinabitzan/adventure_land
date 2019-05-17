package characters;

import behaviours.IExist;

public enum HealerType implements IExist {
    PARAMEDIC(10,1,8),
    BUSHDOCTOR(4,1,1);

    private final int startingHealth;
    private final int attack;
    private final int defence;

    HealerType(int startingHealth, int attack, int defence) {
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
