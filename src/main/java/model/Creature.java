package model;

import model.items.Item;

import java.util.List;

public class Creature {
    protected String name;
    protected StatBlock stats;
    protected boolean isAlive;

    public Creature(String name, StatBlock stats) {
        this.name = name;
        this.stats = stats;
        this.isAlive = true;
    }

    public String getName() {
        return name;
    }

    public StatBlock getStats() {
        return stats;
    }

    public boolean isAlive() {
        return isAlive;
    }
}
