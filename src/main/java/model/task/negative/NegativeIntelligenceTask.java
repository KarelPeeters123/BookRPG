package model.task.negative;

import model.creatures.Adventurer;

public class NegativeIntelligenceTask extends NegativeTask{

    public NegativeIntelligenceTask(String title, int points, int damage) {
        super(title, points, damage);
    }

    @Override
    public void completeTask(Adventurer adventurer) {
        super.completeTask(adventurer);
        adventurer.decreaseIntelligence(points);
    }
}
