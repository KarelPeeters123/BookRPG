package model.droptable;

import model.items.Item;

public class DropTableItem {
    private Item item;
    private int minimum;
    private int maximum;

    public DropTableItem(Item item, int minimum, int maximum) {
        this.item = item;
        this.minimum = minimum;
        this.maximum = maximum;
    }
    public int getAmountOfItems() {
        int range = maximum - minimum;
        return minimum + (int)(Math.random() * range);
    }

    public Item getItem() {
        return item;
    }
}
