import model.Stat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatTest {

    @Test
    public void hasValidCurrentValue() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    Stat newStat = new Stat(-1, 10);
                }
        );
        assertThrows(IllegalArgumentException.class,
                () -> {
                    Stat newStat = new Stat(11, 10);
                }
        );
    }
    @Test
    public void hasValidMaximumValue() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    Stat newStat = new Stat(0, -1);
                }
        );
        assertThrows(IllegalArgumentException.class,
                () -> {
                    Stat newStat = new Stat(5, 1);
                }
        );
    }
    @Test
    public void canAccessVariables() {
        Stat myStat = new Stat(5, 10);
        assertEquals(5, myStat.getCurrent());
        assertEquals(10, myStat.getMaximum());
    }
    @Test
    public void increaseCurrentTest() {
        Stat myStat = new Stat(5, 10);
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
        Stat myStat = new Stat(5, 10);
        assertEquals(5, myStat.getCurrent());
        myStat.decreaseBy(1);
        assertEquals(4, myStat.getCurrent());
        myStat.decreaseBy(2);
        assertEquals(2, myStat.getCurrent());
        myStat.decreaseBy(5);
        assertEquals(0, myStat.getCurrent());
    }

}
