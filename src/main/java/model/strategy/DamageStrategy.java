package model.strategy;

import model.creatures.Creature;

public interface DamageStrategy {
    int calculateDamage(Creature attacker);
}
