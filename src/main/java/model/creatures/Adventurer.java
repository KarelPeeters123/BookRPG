package model.creatures;

import model.items.Equipment;
import model.items.Item;
import model.items.equipable.Equipable;
import model.stats.StatBlock;

import java.util.ArrayList;
import java.util.List;

public class Adventurer extends Creature{
    private List<Item> inventory;
    private Equipment equipment;

    public Adventurer(String name) {
        super(name, new StatBlock(CreatureType.ADVENTURER));
        this.inventory = new ArrayList<>();
        this.equipment = new Equipment();
    }

    public void equipItem(Equipable item) {
        if (!inventory.contains((Item)item)) {
            throw new IllegalArgumentException("you don't have this item in your inventory");
        }
        inventory.remove((Item)item);
        Equipable previousItem = item.equip(this);
        if (previousItem != null) {
            addToInventory((Item) previousItem);
        }
    }
    public void unequipItem(Equipable item) {

        item.unequip(this);
        addToInventory((Item)item);
    }
    public void addToInventory(Item item) {
        inventory.add(item);
    }
    public void removeFromInventory(Item item) {
        inventory.remove(item);
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public List<Item> getInventory() {
        return inventory;
    }
}