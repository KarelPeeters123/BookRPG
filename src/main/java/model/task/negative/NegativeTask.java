package model.task.negative;

import model.creatures.Adventurer;
import model.task.Task;

public abstract class NegativeTask extends Task {
    private int damage;

    public NegativeTask(String title, int points, int damage) {
        super(title, points);
        this.damage = damage;
    }

    @Override
    public void completeTask(Adventurer adventurer) {
        adventurer.takeDamage(damage);
    }
}
