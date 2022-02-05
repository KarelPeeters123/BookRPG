package model.items.equipable;

import model.items.Item;

import java.util.HashMap;
import java.util.Map;

public abstract class WornItem extends Item {
    private HashMap<String, Integer> statbonus;

    public WornItem(String name, String description, int buyPrice, int sellPrice, Map<String, Integer> statbonus) {
        super(name, description, buyPrice, sellPrice);
    }
}
