package model.items.equipable;

import model.creatures.Adventurer;

public interface Equipable {
    Equipable equip(Adventurer self);
    Equipable unequip(Adventurer self);
}
