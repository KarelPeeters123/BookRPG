package model.stats;

public class Stat {
    protected int current;
    public Stat(int current) {
        if (current < 0) {
            throw new IllegalArgumentException("stat values may not be less than 0");
        }
        this.current = current;
    }


    public int getCurrent() {
        return current;
    }


}
