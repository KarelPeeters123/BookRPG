package model.strategy;

import model.Creature;

public interface AccuracyStrategy {
    boolean isHit(Creature creature);
}
