package model.task.postive;

import model.creatures.Adventurer;
import model.droptable.DropTable;

public class PositiveIntelligenceTask extends PositiveTask{

    public PositiveIntelligenceTask(String title, int points, DropTable dropTable) {
        super(title, points, dropTable);
    }

    @Override
    public void completeTask(Adventurer adventurer) {
        super.completeTask(adventurer);
        adventurer.increaseIntelligence(points);
    }
}
