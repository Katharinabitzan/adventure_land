package objects;

public enum HealingTool {
    MARIJUAWANA(6),
    IBUPROFIN(3),
    CHILIPEPPER(-1),
    LEECHES(10),
    OCULUSPOTION(4);

    private final int healingPower;

    HealingTool(int healingPower){
        this.healingPower = healingPower;
    }

    public int getHealed(){
        return this.healingPower;
    }

}
