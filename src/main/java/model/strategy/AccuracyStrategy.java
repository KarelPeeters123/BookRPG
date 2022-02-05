package model.strategy;

import model.creatures.Creature;

public interface AccuracyStrategy {
    boolean isHit(Creature attacker, Creature defender);
}
