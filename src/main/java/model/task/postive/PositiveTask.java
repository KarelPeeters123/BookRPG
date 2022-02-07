package model.task.postive;

import model.creatures.Adventurer;
import model.droptable.DropTable;
import model.items.Item;
import model.task.Task;

import java.util.ArrayList;
import java.util.List;

public abstract class PositiveTask extends Task {
    public DropTable dropTable;
    public PositiveTask(String title, int points, DropTable dropTable) {
        super(title, points);
        this.dropTable = dropTable;
    }
    @Override
    public void completeTask(Adventurer adventurer) {
        List<Item> loot = new ArrayList<>();
        if (dropTable.isSuccess()) {
            loot = dropTable.getLoot();
        }
        adventurer.addToInventory(loot);
    }

}
