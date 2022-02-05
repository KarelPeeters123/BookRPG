package model.items.equipable;

import model.creatures.Adventurer;

import java.util.Map;

public class Boots extends WornItem implements Equipable{
    public Boots(String name, String description, int intelligence, int accuracy, int defense, int cooperation) {
        super(name, description, intelligence, accuracy, defense, cooperation);
    }

    @Override
    public Equipable equip(Adventurer self) {
        return self.getEquipment().equipItem(this);
    }

    @Override
    public Equipable unequip(Adventurer self) {
        if (!self.getEquipment().getBoots().equals(this)) {
            throw new IllegalArgumentException("this item is not currently equipped");
        }
        return self.getEquipment().unequipItem(this);
    }
}
