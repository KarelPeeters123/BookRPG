package model.stats;

import model.creatures.CreatureType;

public class CreatureStatBlock extends StatBlock{
    private ReplenishableStat health;
    private ReplenishableStat mana;
    public CreatureStatBlock(CreatureType type) {
        super();
        this.health = new ReplenishableStat(10, 10);
        this.mana = new ReplenishableStat(10, 10);
    }
    public void takeDamage(int damage) {
        this.health.decreaseBy(damage);
    }
    public void heal(int health) {
        this.health.increaseBy(health);
    }
    public void useMana(int mana) {
        this.mana.decreaseBy(mana);
    }
    public void replenishMana(int mana) {
        this.mana.increaseBy(mana);
    }

    public ReplenishableStat getHealth() {
        return health;
    }

    public ReplenishableStat getMana() {
        return mana;
    }
}
