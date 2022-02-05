import model.stats.ReplenishableStat;
import model.stats.Stat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatTest {

    @Test
    public void hasValidCurrentValue() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    Stat newStat = new ReplenishableStat(-1, 10);
                }
        );
        assertThrows(IllegalArgumentException.class,
                () -> {
                    Stat newStat = new ReplenishableStat(11, 10);
                }
        );
    }
    @Test
    public void hasValidMaximumValue() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    Stat newStat = new ReplenishableStat(0, -1);
                }
        );
        assertThrows(IllegalArgumentException.class,
                () -> {
                    Stat newStat = new ReplenishableStat(5, 1);
                }
        );
    }
    @Test
    public void canAccessVariables() {
        ReplenishableStat myStat = new ReplenishableStat(5, 10);
        assertEquals(5, myStat.getCurrent());
        assertEquals(10, myStat.getMaximum());
    }
    @Test
    public void increaseCurrentTest() {
        ReplenishableStat myStat = new ReplenishableStat(5, 10);
        assertEquals(5, myStat.getCurrent());
        myStat.increaseBy(1);
        assertEquals(6, myStat.getCurrent());
        myStat.increaseBy(2);
        assertEquals(8, myStat.getCurrent());
        myStat.increaseBy(5);
        assertEquals(10, myStat.getCurrent());
    }
    @Test
    public void decreaseCurrentTest() {
        ReplenishableStat myStat = new ReplenishableStat(5, 10);
        assertEquals(5, myStat.getCurrent());
        myStat.decreaseBy(1);
        assertEquals(4, myStat.getCurrent());
        myStat.decreaseBy(2);
        assertEquals(2, myStat.getCurrent());
        myStat.decreaseBy(5);
        assertEquals(0, myStat.getCurrent());
    }

}
