package model.stats;

public class ReplenishableStat extends Stat{
    private int maximum;
    public ReplenishableStat(int current, int maximum) {
        super(current);
        if (maximum < 0) {
            throw new IllegalArgumentException("stat maxima may not be less than 0");
        }
        if (maximum < current) {
            throw new IllegalArgumentException("current may not exceed maximum");
        }
        this.maximum = maximum;
    }
    public void increaseBy(int increment) {
        current = current + increment;
        if (current > maximum) {
            current = maximum;
        }
    }
    public void decreaseBy(int decrement) {
        current = current - decrement;
        if (current < 0) {
            current = 0;
        }
    }

    public int getMaximum() {
        return maximum;
    }
}
