package model.strategy;

import model.Creature;

public class Base50AccuracyStrategy implements AccuracyStrategy{

    @Override
    public boolean isHit(Creature creature) {
        double hitroll = Math.random() * 100;
        double hitChance = 50.0 + 5 * Math.sqrt(creature.getStats().getAccuracy().getCurrent());
        return hitroll <= hitChance;
    }
}
