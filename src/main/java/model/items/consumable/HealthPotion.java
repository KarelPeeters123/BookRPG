package model.items.consumable;

import model.creatures.Adventurer;
import model.items.Item;

public class HealthPotion extends Item implements Consumable {
    int healAmount;

    public HealthPotion(String name, String description, int healAmount) {
        super(name, description);
        this.healAmount = healAmount;
    }

    @Override
    public void consume(Adventurer self) {
        self.heal(healAmount);
    }

}
