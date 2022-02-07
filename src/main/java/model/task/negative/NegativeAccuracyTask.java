package model.task.negative;

import model.creatures.Adventurer;

public class NegativeAccuracyTask extends NegativeTask{
    public NegativeAccuracyTask(String title, int points, int damage) {
        super(title, points, damage);
    }

    @Override
    public void completeTask(Adventurer adventurer) {
        super.completeTask(adventurer);
        adventurer.decreaseAccuracy(points);
    }
}
