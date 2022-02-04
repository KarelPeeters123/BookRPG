package model.items.consumable;

import model.Adventurer;
import model.items.Item;
import model.items.consumable.Consumable;

public class ManaPotion extends Item implements Consumable {
    int mana;
    public ManaPotion(String name, String description, int buyPrice, int sellPrice, int mana) {
        super(name, description, buyPrice, sellPrice);
        this.mana = mana;
    }

    @Override
    public void consume(Adventurer self) {
        self.replenishMana(mana);
    }
}
