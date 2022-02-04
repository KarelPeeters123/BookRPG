package model.items.consumable;

import model.Adventurer;
import model.items.Item;
import model.items.consumable.Consumable;

public class HealthPotion extends Item implements Consumable {
    int healAmount;

    public HealthPotion(String name, String description, int buyPrice, int sellPrice, int healAmount) {
        super(name, description, buyPrice, sellPrice);
        this.healAmount = healAmount;
    }

    @Override
    public void consume(Adventurer self) {
        self.heal(healAmount);
    }

}
