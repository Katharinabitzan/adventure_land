package GameLogic;

import behaviours.IExist;

public class Enemy {

    private IExist enemy;
    private int health;

    public Enemy(IExist enemy) {
        this.enemy = enemy;
        this.health = enemy.getStartingHealth();
    }

    public IExist getEnemy() {
        return enemy;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPotential(){
        return enemy.getAttack();
    }

    public int getDefencePotential(){
        return enemy.getDefence();
    }

    public void changeHealth(int healthAmount){
        this.health += healthAmount;
    }

    public void defend(int damage) {
        int damageInflicted = this.health + this.enemy.getDefence() - damage;
        if (damageInflicted > 0) {
            this.health -= damageInflicted;
            if (this.health < 0) {
                this.health = 0;
            }
        }
    }
}
