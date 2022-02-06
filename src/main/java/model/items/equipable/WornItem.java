package model.items.equipable;

import model.items.Item;
import model.stats.StatBlock;

import java.util.HashMap;
import java.util.Map;

public abstract class WornItem extends Item implements Equipable{
    private StatBlock stats;

    public WornItem(String name, String description, int intelligence, int accuracy, int defense, int cooperation) {
        super(name, description);
        stats = new StatBlock(intelligence, accuracy, defense, cooperation);
    }
    public int getIntelligence() {
        return stats.getIntelligence().getCurrent();
    }
    public int getAccuracy() {
        return stats.getAccuracy().getCurrent();
    }
    public int getDefense() {
        return stats.getDefense().getCurrent();
    }
    public int getCooperation() {
        return stats.getCooperation().getCurrent();
    }
}
