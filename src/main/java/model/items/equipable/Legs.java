package model.items.equipable;

import model.Adventurer;

import java.util.Map;

public class Legs extends WornItem implements Equipable{
    public Legs(String name, String description, int buyPrice, int sellPrice, Map<String, Integer> statbonus) {
        super(name, description, buyPrice, sellPrice, statbonus);
    }

    @Override
    public Equipable equip(Adventurer self) {
        return self.getEquipment().equipItem(this);
    }

    @Override
    public Equipable unequip(Adventurer self) {
        if (!self.getEquipment().getLegs().equals(this)) {
            throw new IllegalArgumentException("this item is not currently equipped");
        }
        return self.getEquipment().unequipItem(this);
    }
}
