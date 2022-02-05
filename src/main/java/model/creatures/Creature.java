package model.creatures;

import model.stats.CreatureStatBlock;
import model.stats.StatBlock;
import model.strategy.AccuracyStrategy;
import model.strategy.CompareStatsAccuracyStrategy;
import model.strategy.DamageStrategy;
import model.strategy.ExponentDamageStrategy;

public class Creature {
    protected String name;
    protected CreatureStatBlock stats;
    protected boolean isAlive;

    public Creature(String name, CreatureStatBlock stats) {
        this.name = name;
        this.stats = stats;
        this.isAlive = true;
    }

    public void attack(Creature defender) {
        AccuracyStrategy accuracyStrategy = new CompareStatsAccuracyStrategy();
        DamageStrategy damageStrategy = new ExponentDamageStrategy();
        if (accuracyStrategy.isHit(this, defender)) {
            defender.takeDamage(damageStrategy.calculateDamage(this));
        }
    }

    public void heal(int health) {
        stats.heal(health);
    }
    public void takeDamage(int damage) {
        stats.takeDamage(damage);
    }
    public void replenishMana(int mana) {
        stats.replenishMana(mana);
    }
    public void useMana(int mana) {
        stats.useMana(mana);
    }



    public String getName() {
        return name;
    }

    public StatBlock getStats() {
        return stats;
    }

    public boolean isAlive() {
        return isAlive;
    }


}
