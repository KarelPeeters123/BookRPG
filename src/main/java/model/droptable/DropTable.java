package model.droptable;

import model.items.Item;

import java.util.ArrayList;
import java.util.List;

public class DropTable {
    private int dropRate;
    private List<DropTableItem> dropTable;
    public boolean isSuccess() {
        return (int)(Math.random()*100) >= dropRate;
    }
    public List<Item> getLoot() {
        DropTableItem dropTableItem = dropTable.get((int)(Math.random()* dropTable.size()));
        int amountOfItems = dropTableItem.getAmountOfItems();
        List<Item> loot = new ArrayList<>();
        for (int i = 0; i < amountOfItems; i++) {
            loot.add(dropTableItem.getItem());
        }
        return loot;
    }
}
