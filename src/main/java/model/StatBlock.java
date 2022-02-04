package model;

public class StatBlock {
    private Stat health;
    private Stat mana;
    private Stat intelligence;
    private Stat accuracy;
    private Stat defense;
    private Stat cooperation;

    public StatBlock(Entity type) {
        if (type == Entity.ADVENTURER) {
            this.health = new Stat(10, 10);
            this.mana = new Stat(10, 10);
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

    public Stat getHealth() {
        return health;
    }

    public Stat getMana() {
        return mana;
    }

    public Stat getStrength() {
        return strength;
    }

    public Stat getAccuracy() {
        return accuracy;
    }

    public Stat getMagic() {
        return magic;
    }

    public Stat getDefense() {
        return defense;
    }
}
