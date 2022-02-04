package model;

public class Stat {
    private int current;
    public Stat(int current) {
        if (current < 0) {
            throw new IllegalArgumentException("stat values may not be less than 0");
        }
        this.current = current;
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

    public int getCurrent() {
        return current;
    }

    public int getMaximum() {
        return maximum;
    }
}
