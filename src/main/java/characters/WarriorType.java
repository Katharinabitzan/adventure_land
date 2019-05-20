package characters;

import behaviours.IExist;

public enum WarriorType implements IExist {
    DWARF(10, 1, 3),
    KNIGHT(6, 3, 4),
    BARBARIAN(12, 4, 0);

    private final int startingHealth;
    private final int attack;
    private final int defence;

    WarriorType(int startingHealth, int attack, int defence) {
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
