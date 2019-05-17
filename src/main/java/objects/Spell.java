package objects;

public enum Spell {
    EXPELLIARMUS(6),
    RIDDIKULUS(1),
    CRUCIO(10),
    AVADAKADAVRA(100);

    private final int attack;

    Spell(int attack){
        this.attack = attack;
    }

    public int getAttack() {
        return attack;
    }
}
