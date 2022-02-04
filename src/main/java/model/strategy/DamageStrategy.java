package model.strategy;

import model.Creature;

public interface DamageStrategy {
    int calculateDamage(Creature attacker);
}
