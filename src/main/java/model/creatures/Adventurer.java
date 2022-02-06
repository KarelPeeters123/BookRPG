package model.creatures;

import model.exceptions.ItemNotInInventoryException;
import model.items.Equipment;
import model.items.Item;
import model.items.equipable.Equipable;
import model.stats.CreatureStatBlock;
import model.stats.StatBlock;

import java.util.ArrayList;
import java.util.List;

public class Adventurer extends Creature{
    private Party party;
    private List<Item> inventory;
    private Equipment equipment;

    public Adventurer(String name) {
        super(name, new CreatureStatBlock(CreatureType.ADVENTURER));
        this.inventory = new ArrayList<>();
        this.equipment = new Equipment();
    }

    public void equipItem(Equipable item) {
        if (!inventory.contains((Item)item)) {
            throw new ItemNotInInventoryException("you don't have this item in your inventory");
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

    public void joinParty(Party newParty) {
        if (this.party != null) {
            this.party.removeAdventurer(this);
        }
        this.party = newParty;
    }
    public void leaveParty() {
        this.party = null;
    }
    public boolean hasParty() {
        return party != null;
    }

    @Override
    public int getIntelligence() {
        return super.getIntelligence() + equipment.getTotalIntelligenceBonus() + party.getCooperationBonus(this);
    }
    @Override
    public int getAccuracy() {
        return super.getAccuracy() + equipment.getTotalAccuracyBonus() + party.getCooperationBonus(this);
    }
    @Override
    public int getDefense() {
        return super.getDefense() + equipment.getTotalDefenseBonus() + party.getCooperationBonus(this);
    }
    @Override
    public int getCooperation() {
        return super.getCooperation() + equipment.getTotalCooperationBonus();
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public List<Item> getInventory() {
        return inventory;
    }


}
