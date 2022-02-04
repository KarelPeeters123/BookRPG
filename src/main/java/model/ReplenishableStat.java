package model;

public class ReplenishableStat extends Stat{
    public ReplenishableStat(int current, int maximum) {
        if (maximum < 0) {
            throw new IllegalArgumentException("stat maxima may not be less than 0");
        }
        if (maximum < current) {
            throw new IllegalArgumentException("current may not exceed maximum");
        }
        super(current);
        this.maximum = maximum;
    }
}
