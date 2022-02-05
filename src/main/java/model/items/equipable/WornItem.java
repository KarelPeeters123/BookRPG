package model.items.equipable;

import model.items.Item;
import model.stats.StatBlock;

import java.util.HashMap;
import java.util.Map;

public abstract class WornItem extends Item {
    private StatBlock stats;

    public WornItem(String name, String description, int intelligence, int accuracy, int defense, int cooperation) {
        super(name, description);
        stats = new StatBlock();
    }
}
