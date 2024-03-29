package model.items.consumable;

import model.creatures.Adventurer;
import model.items.Item;

public class ManaPotion extends Item implements Consumable {
    int mana;
    public ManaPotion(String name, String description, int mana) {
        super(name, description);
        this.mana = mana;
    }

    @Override
    public void consume(Adventurer self) {
        self.replenishMana(mana);
    }
}
