package model;

import model.items.Item;
import model.items.equipable.Equipable;
import model.items.equipable.Helmet;
import model.items.equipable.WornItem;

import java.util.ArrayList;
import java.util.List;

public class Adventurer extends Creature{
    private AdventurerClass adventurerClass;
    private List<Item> inventory;
    private Equipment equipment;

    public Adventurer(String name, AdventurerClass adventurerClass) {
        super(name, new StatBlock(Entity.ADVENTURER));
        this.adventurerClass = adventurerClass;
        this.inventory = new ArrayList<>();
        this.equipment = new Equipment();
    }
    public void heal(int health) {
        stats.heal(health);
    }
    public void replenishMana(int mana) {
        stats.replenishMana(mana);
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
