import model.creatures.CreatureType;
import model.stats.StatBlock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatBlockTest {
    @Test
    public void testBaseAdventurerStats() {
        StatBlock adventurerStats = new StatBlock(CreatureType.ADVENTURER);
        assertEquals(10, adventurerStats.getHealth().getCurrent());
        assertEquals(10, adventurerStats.getHealth().getMaximum());
        assertEquals(10, adventurerStats.getMana().getCurrent());
        assertEquals(10, adventurerStats.getMana().getMaximum());
        assertEquals(1, adventurerStats.getIntelligence().getCurrent());
        assertEquals(1, adventurerStats.getAccuracy().getCurrent());
        assertEquals(1, adventurerStats.getCooperation().getCurrent());
        assertEquals(1, adventurerStats.getDefense().getCurrent());
    }
    @Test
    public void damageTest() {
        StatBlock adventurerStats = new StatBlock(CreatureType.ADVENTURER);
        assertEquals(10, adventurerStats.getHealth().getCurrent());
        adventurerStats.takeDamage(5);
        assertEquals(5, adventurerStats.getHealth().getCurrent());
        adventurerStats.takeDamage(100);
        assertEquals(0, adventurerStats.getHealth().getCurrent());
    }
    @Test
    public void healTest() {
        StatBlock adventurerStats = new StatBlock(CreatureType.ADVENTURER);
        assertEquals(10, adventurerStats.getHealth().getCurrent());
        adventurerStats.takeDamage(5);
        assertEquals(5, adventurerStats.getHealth().getCurrent());
        adventurerStats.heal(2);
        assertEquals(7, adventurerStats.getHealth().getCurrent());
        adventurerStats.heal(100);
        assertEquals(10, adventurerStats.getHealth().getCurrent());
    }
    @Test
    public void useManaTest() {
        StatBlock adventurerStats = new StatBlock(CreatureType.ADVENTURER);
        assertEquals(10, adventurerStats.getMana().getCurrent());
        adventurerStats.useMana(5);
        assertEquals(5, adventurerStats.getMana().getCurrent());
        adventurerStats.useMana(100);
        assertEquals(0, adventurerStats.getMana().getCurrent());
    }
    @Test
    public void replenishManaTest() {
        StatBlock adventurerStats = new StatBlock(CreatureType.ADVENTURER);
        assertEquals(10, adventurerStats.getMana().getCurrent());
        adventurerStats.useMana(5);
        assertEquals(5, adventurerStats.getMana().getCurrent());
        adventurerStats.replenishMana(2);
        assertEquals(7, adventurerStats.getMana().getCurrent());
        adventurerStats.replenishMana(100);
        assertEquals(10, adventurerStats.getMana().getCurrent());
    }
//    @Test
//    public void ExperienceTest() {
//        StatBlock adventurerStats = new StatBlock(Entity.ADVENTURER);
//        assertEquals(0, adventurerStats.getExperience().getCurrent());
//        adventurerStats.gainExperience(5);
//        assertEquals(5, adventurerStats.getExperience().getCurrent());
//    }
}
