package model.task.negative;

import model.creatures.Adventurer;

public class NegativeCooperationTask extends NegativeTask{
    public NegativeCooperationTask(String title, int points, int damage) {
        super(title, points, damage);
    }

    @Override
    public void completeTask(Adventurer adventurer) {
        super.completeTask(adventurer);
        adventurer.decreaseCooperation(points);
    }
}
