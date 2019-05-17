package GameLogic;

import characters.Character;

public class Player {
    private Character character;
    private int health;
    private Room position;

    public Player(Character character, Room position) {
        this.character = character;
        this.health = character.getStartingHealth();
        this.position = position;
    }

    public void changeHealth(int healthAmount){
        this.health += healthAmount;
    }

    public void changeRoom(Room room){
        this.position = room;
    }

    public void attack(Enemy enemy){
        enemy.defend(this.character.getAttack());
        defend(enemy.getAttackPotential());
    }

    public void fightToTheDeath(Enemy enemy){
        attack(enemy);
        if (enemy.getHealth() > 0) {
            attack(enemy);
        }
    }

    public void defend(int damage){
        int damageInflicted = this.health + this.character.getDefence() - damage;
        if (damageInflicted > 0) {
            this.health -= damageInflicted;
            if (this.health < 0) {
                this.health = 0;
            }
        }
    }

    public Character getCharacter() {
        return character;
    }

    public int getHealth() {
        return health;
    }

    public Room getPosition() {
        return position;
    }
}
