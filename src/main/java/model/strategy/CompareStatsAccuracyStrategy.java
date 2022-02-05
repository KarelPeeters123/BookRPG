package model.strategy;

import model.creatures.Creature;

public class CompareStatsAccuracyStrategy implements AccuracyStrategy{

    private static final double baseChance =  50.0;
    private static final double multiplier = 5.0;
    @Override
    public boolean isHit(Creature attacker, Creature defender) {
        double attackValue = Math.max(Math.random(), Math.random()) * attacker.getStats().getAccuracy().getCurrent();
        double defenseValue = Math.min(Math.random(), Math.random()) * defender.getStats().getDefense().getCurrent();
        return attackValue >= defenseValue;
    }
}
