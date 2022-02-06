import model.creatures.Adventurer;
import model.creatures.Party;
import model.items.equipable.Equipable;
import model.items.equipable.Shield;
import model.items.equipable.Weapon;
import model.items.equipable.WornItem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class CooperationTest {
    Adventurer kalenz;
    Adventurer landar;
    Adventurer arguilas;
    Party party;
    WornItem staffOfMagic;
    WornItem staffOfHealing;
    WornItem bookOfWisdom;
    @BeforeEach
    public void setUp() {
        kalenz = new Adventurer("Kalenz");
        landar =  new Adventurer("Landar");
        arguilas =  new Adventurer("arguilas");
        party = new Party();
        staffOfMagic = new Weapon("Staff of Magic", "a staff with strong magical energy", 30, 20, 0, 0);
        staffOfHealing = new Weapon("Staff of Healing", "a staff with strong healing magic", 30, 0, 10, 30);
        bookOfWisdom = new Shield("Book of Wisdom", "a book filled with knowledge", 50, 0, 0, 0);
    }
    @Test
    public void getCooperationFromPartyTest() {
        party.addAdventurer(kalenz);
        party.addAdventurer(landar);
        assertEquals(1, party.getCooperationBonus(kalenz));
    }
    @Test
    public void getBoostedStatsFromParty() {
        party.addAdventurer(kalenz);
        party.addAdventurer(landar);
        assertEquals(2, kalenz.getIntelligence());
        assertEquals(2, kalenz.getAccuracy());
        assertEquals(2, kalenz.getDefense());
        assertEquals(1, kalenz.getCooperation());
    }
    @Test
    public void getBoostedStatsFromEquipment() {
        party.addAdventurer(kalenz);
        party.addAdventurer(landar);
        kalenz.addToInventory(staffOfMagic);
        kalenz.equipItem(staffOfMagic);
        assertEquals(32, kalenz.getIntelligence());
        assertEquals(22, kalenz.getAccuracy());
        assertEquals(2, kalenz.getDefense());
        assertEquals(1, kalenz.getCooperation());
    }
    @Test
    public void getBoostedStatsFromPartyMemberWithEquipment() {
        party.addAdventurer(kalenz);
        party.addAdventurer(landar);
        kalenz.addToInventory(staffOfMagic);
        kalenz.equipItem(staffOfMagic);
        landar.addToInventory(staffOfHealing);
        landar.equipItem(staffOfHealing);
        assertEquals(62, kalenz.getIntelligence());
        assertEquals(52, kalenz.getAccuracy());
        assertEquals(32, kalenz.getDefense());
        assertEquals(1, kalenz.getCooperation());
    }
    @Test
    public void getBoostedStatsFromMultipleItemsAndParty() {
        party.addAdventurer(kalenz);
        party.addAdventurer(landar);
        party.addAdventurer(arguilas);
        kalenz.addToInventory(staffOfMagic);
        kalenz.equipItem(staffOfMagic);
        landar.addToInventory(staffOfHealing);
        landar.equipItem(staffOfHealing);
        kalenz.addToInventory(bookOfWisdom);
        kalenz.equipItem(bookOfWisdom);
        assertEquals(113, kalenz.getIntelligence());
        assertEquals(53, kalenz.getAccuracy());
        assertEquals(33, kalenz.getDefense());
        assertEquals(1, kalenz.getCooperation());
    }
}
