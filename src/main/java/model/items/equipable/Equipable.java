package model.items.equipable;

import model.Adventurer;

public interface Equipable {
    Equipable equip(Adventurer self);
    Equipable unequip(Adventurer self);
}
