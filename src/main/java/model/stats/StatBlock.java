package model.stats;

import model.creatures.CreatureType;

public class StatBlock {

    private Stat intelligence;
    private Stat accuracy;
    private Stat defense;
    private Stat cooperation;

    public StatBlock() {
        this(1, 1, 1, 1);
    }
    public StatBlock(int intelligence, int accuracy, int defense, int cooperation) {
        this.intelligence = new Stat(intelligence);
        this.accuracy = new Stat(accuracy);
        this.defense = new Stat(defense);
        this.cooperation = new Stat(cooperation);
    }


    public Stat getIntelligence() {
        return intelligence;
    }

    public Stat getAccuracy() {
        return accuracy;
    }

    public Stat getDefense() {
        return defense;
    }

    public Stat getCooperation() {
        return cooperation;
    }
}
