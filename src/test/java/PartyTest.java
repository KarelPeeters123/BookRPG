import model.creatures.Adventurer;
import model.creatures.Party;
import model.exceptions.AdventurerNotInPartyException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PartyTest {
    Adventurer kalenz;
    Adventurer landar;
    Party party;
    Party secondParty;
    @BeforeEach
    public void setUp() {
        kalenz = new Adventurer("Kalenz");
        landar =  new Adventurer("Landar");
        party = new Party();
        secondParty = new Party();
    }
    @Test
    public void addToParty() {
        assertEquals(0, party.getMembers().size());
        party.addAdventurer(kalenz);
        assertTrue(kalenz.hasParty());
        assertEquals(1, party.getMembers().size());
        assertEquals(1, party.getPartySize());
        assertEquals(0, secondParty.getPartySize());
    }
    @Test
    public void addSecondAdventurerToPartyTest() {
        party.addAdventurer(kalenz);
        party.addAdventurer(landar);
        assertTrue(kalenz.hasParty());
        assertTrue(landar.hasParty());
        assertEquals(2, party.getPartySize());
        assertEquals(0, secondParty.getPartySize());
    }
    @Test
    public void addToPartyWhileAlreadyInPartyTest() {
        party.addAdventurer(kalenz);
        secondParty.addAdventurer(kalenz);
        assertTrue(kalenz.hasParty());
        assertEquals(0, party.getPartySize());
        assertEquals(1, secondParty.getPartySize());
    }
    @Test
    public void removeFromPartyTest() {
        party.addAdventurer(kalenz);
        party.removeAdventurer(kalenz);
        assertFalse(kalenz.hasParty());
    }
    @Test
    public void removingAdventurerNotInPartyThrowsException() {
        assertThrows(AdventurerNotInPartyException.class,
                () -> party.removeAdventurer(kalenz)
        );
    }
    @Test
    public void addingAdventurerAlreadyInPartyThrowsException() {
        party.addAdventurer(kalenz);
        party.addAdventurer(kalenz);
        assertEquals(1, party.getPartySize());
    }
}
