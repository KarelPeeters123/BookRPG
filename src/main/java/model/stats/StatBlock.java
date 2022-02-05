package model.stats;

import model.creatures.CreatureType;

public class StatBlock {
    private ReplenishableStat health;
    private ReplenishableStat mana;
    private Stat intelligence;
    private Stat accuracy;
    private Stat defense;
    private Stat cooperation;

    public StatBlock(CreatureType type) {
        if (type == CreatureType.ADVENTURER) {
            this.health = new ReplenishableStat(10, 10);
            this.mana = new ReplenishableStat(10, 10);
            this.intelligence = new Stat(1);
            this.accuracy = new Stat(1);
            this.defense = new Stat(1);
            this.cooperation = new Stat(1);
        }
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

    public Stat getIntelligence() {
        return intelligence;
    }

    public Stat getAccuracy() {
        return accuracy;
    }

    public Stat getDefense() {
        return defense;
    }

    public Stat getCooperation() {
        return cooperation;
    }
}
