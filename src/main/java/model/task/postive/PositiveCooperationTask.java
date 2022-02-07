package model.task.postive;

import model.creatures.Adventurer;
import model.droptable.DropTable;

public class PositiveCooperationTask  extends PositiveTask{
    public PositiveCooperationTask(String title, int points, DropTable dropTable) {
        super(title, points, dropTable);
    }

    @Override
    public void completeTask(Adventurer adventurer) {
        super.completeTask(adventurer);
        adventurer.increaseCooperation(points);
    }
}
