package model.creatures;

import model.exceptions.AdventurerNotInPartyException;

import java.util.ArrayList;
import java.util.List;

public class Party {
    private List<Adventurer> members;

    public Party() {
        this.members = new ArrayList<>();
    }
    public void addAdventurer(Adventurer adventurer) {
        this.members.add(adventurer);
        adventurer.joinParty(this);
    }
    public void removeAdventurer(Adventurer adventurer) {
        if (!members.contains(adventurer)) {
            throw new AdventurerNotInPartyException("Adventurer is not a member of this party!");
        }
        members.remove(adventurer);
        adventurer.leaveParty();
    }

    public int getCooperationBonus(Adventurer adventurer) {
        int cooperation = 0;
        for (Adventurer member: members) {
            if (!member.equals(adventurer)) {
                cooperation += member.getCooperation();
            }
        }
        return cooperation;
    }
    public List<Adventurer> getMembers() {
        return members;
    }
    public int getPartySize() {
        return members.size();
    }
}
