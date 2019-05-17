package GameLogic;

import behaviours.IExist;

public enum EnemyType implements IExist {

    GOBLIN(4, 3, 3),
    TROLL(12, 10, 2),
    GIANT(8, 2, 10),
    KRAKEN(10, 10, 2),
    GOGMAGOG(10, 10, 10),
    VAMPIRE(2, 2, 2);


    private final int startingHealth;
    private final int attack;
    private final int defence;

    EnemyType(int startingHealth, int attack, int defence){
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
