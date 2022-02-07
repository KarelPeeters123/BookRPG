package model.task;

import model.creatures.Adventurer;

public abstract class Task {
    protected String title;
    protected int points;

    public Task(String title, int points) {
        this.title = title;
        this.points = points;
    }

    public abstract void completeTask(Adventurer adventurer);
}
