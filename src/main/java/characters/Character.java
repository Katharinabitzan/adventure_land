package characters;

import behaviours.IExist;

public abstract class Character implements IExist {

    IExist characterType;

    public Character(IExist characterType) {
        this.characterType = characterType;
    }

    @Override
    public int getStartingHealth() {
        return characterType.getStartingHealth();
    }

    @Override
    public int getAttack() {
        return characterType.getAttack();
    }

    @Override
    public int getDefence() {
        return characterType.getDefence();
    }


}
