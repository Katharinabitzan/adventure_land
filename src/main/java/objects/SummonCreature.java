package objects;

public enum SummonCreature {
    BASILISK(5),
    DEMETOR(15),
    PIXIE(1),
    WEREWOLF(7),
    DRAGON(12);

    private final int defence;

    SummonCreature(int defence){
        this.defence = defence;
    }

    public int getDefence(){
        return this.defence;
    }

}
