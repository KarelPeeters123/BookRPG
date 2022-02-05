import model.creatures.Adventurer;
import model.items.Item;
import model.items.equipable.Equipable;
import model.items.equipable.Gloves;
import model.items.equipable.Helmet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EquipmentTest {

    @Test
    public void equipTest() {
        Adventurer adventurer = new Adventurer("Kalenz");
        assertNull(adventurer.getEquipment().getHelmet());
        assertEquals(0, adventurer.getInventory().size());
        Equipable helmet1 = new Helmet("crusader helmet", "a steel helmet worn by crusaders", 500, 200, null);
        Equipable helmet2 = new Helmet("conquistador helmet", "a steel helmet worn by spanish conquistadors", 500, 200, null);
        Equipable gloves = new Gloves("steel gloves", "steel gloves to prevent losing your fingers in combat", 500, 200, null);
        assertThrows(IllegalArgumentException.class,
                () -> {
                    adventurer.equipItem(helmet1);
                }
        );
        adventurer.addToInventory((Item)helmet1);
        adventurer.addToInventory((Item)helmet2);
        adventurer.addToInventory((Item)gloves);
        assertEquals(3, adventurer.getInventory().size());
        adventurer.equipItem(helmet1);
        assertEquals(2, adventurer.getInventory().size());
        assertNotNull(adventurer.getEquipment().getHelmet());
        assertEquals(helmet1, adventurer.getEquipment().getHelmet());
        adventurer.equipItem(helmet2);
        assertEquals(helmet2, adventurer.getEquipment().getHelmet());
        assertEquals(2, adventurer.getInventory().size());
        adventurer.equipItem(gloves);
        assertEquals(gloves, adventurer.getEquipment().getGloves());
        assertEquals(helmet2, adventurer.getEquipment().getHelmet());
        assertEquals(1, adventurer.getInventory().size());

        assertThrows(IllegalArgumentException.class,
                () -> {
                    adventurer.unequipItem(helmet1);
                }
        );
        adventurer.unequipItem(helmet2);
        assertEquals(2, adventurer.getInventory().size());
        assertNull(adventurer.getEquipment().getHelmet());
        assertNotNull(adventurer.getEquipment().getGloves());

    }

}
