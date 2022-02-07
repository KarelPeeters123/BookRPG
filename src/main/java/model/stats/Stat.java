package model.stats;

public class Stat {
    protected int current;
    public Stat(int current) {
        if (current < 0) {
            throw new IllegalArgumentException("stat values may not be less than 0");
        }
        this.current = current;
    }
    public void increaseBy(int increment) {
        current = current + increment;
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


}
