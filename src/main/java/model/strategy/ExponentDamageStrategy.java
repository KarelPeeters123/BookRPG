package model.strategy;

import model.Creature;

public class ExponentDamageStrategy implements DamageStrategy{
    @Override
    public int calculateDamage(Creature attacker) {
        int strength = attacker.getStats().getStrength().getCurrent();
        double maxHit =  Math.pow((double)strength/3, 1.5);
        maxHit = Math.ceil(maxHit);
        double attackRoll = Math.max(Math.random(), Math.random());
        double damage = maxHit*attackRoll;
        return (int)Math.ceil(damage);
    }
}
