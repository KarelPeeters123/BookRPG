package model.items;

import model.creatures.Adventurer;
import model.items.equipable.*;

public class Equipment {
    private Adventurer self;
    private Helmet helmet;
    private Body body;
    private Legs legs;
    private Boots boots;
    private Weapon weapon;
    private Shield shield;
    private Gloves gloves;
    private Necklace necklace;
    private Ring ring;
    private Pouch pouch;



    /**
     *
     * @param helmet
     * the new helmet
     * @return the previously worn helmet
     */
    public Equipable equipItem(Helmet helmet) {
        if (helmet == null) {
            throw new IllegalArgumentException("equipped item may not be null");
        }
        Equipable previousItem = this.helmet;
        this.helmet = helmet;
        return previousItem;
    }
    /**
     *
     * @param helmet
     * the helmet to unequip
     * @return the unequipped helmet
     */
    public Equipable unequipItem(Helmet helmet) {
        if (helmet == null) {
            throw new IllegalArgumentException("unequipped item may not be null");
        }
        if (!this.helmet.equals(helmet)) {
            throw new IllegalArgumentException("this item is not currently equipped");
        }
        Equipable previousHelmet = this.helmet;
        this.helmet = null;
        return previousHelmet;
    }

    /**
     *
     * @param body
     * the new body
     * @return the previously worn body
     */
    public Equipable equipItem(Body body) {
        if (body == null) {
            throw new IllegalArgumentException("equipped item may not be null");
        }
        Equipable previousItem = this.body;
        this.body = body;
        return previousItem;
    }
    /**
     *
     * @param body
     * the body to unequip
     * @return the unequipped body
     */
    public Equipable unequipItem(Body body) {
        if (body == null) {
            throw new IllegalArgumentException("unequipped item may not be null");
        }
        if (!this.body.equals(body)) {
            throw new IllegalArgumentException("this item is not currently equipped");
        }
        Equipable previousHelmet = this.body;
        this.body = null;
        return previousHelmet;
    }

    /**
     *
     * @param legs
     * the new legs
     * @return the previously worn legs
     */
    public Equipable equipItem(Legs legs) {
        if (legs == null) {
            throw new IllegalArgumentException("equipped item may not be null");
        }
        Equipable previousItem = this.legs;
        this.legs = legs;
        return previousItem;
    }
    /**
     *
     * @param legs
     * the legs to unequip
     * @return the unequipped legs
     */
    public Equipable unequipItem(Legs legs) {
        if (legs == null) {
            throw new IllegalArgumentException("unequipped item may not be null");
        }
        if (!this.legs.equals(legs)) {
            throw new IllegalArgumentException("this item is not currently equipped");
        }
        Equipable previousHelmet = this.legs;
        this.legs = null;
        return previousHelmet;
    }

    /**
     *
     * @param boots
     * the new boots
     * @return the previously worn boots
     */
    public Equipable equipItem(Boots boots) {
        if (boots == null) {
            throw new IllegalArgumentException("equipped item may not be null");
        }
        Equipable previousItem = this.boots;
        this.boots = boots;
        return previousItem;
    }
    /**
     *
     * @param boots
     * the boots to unequip
     * @return the unequipped boots
     */
    public Equipable unequipItem(Boots boots) {
        if (boots == null) {
            throw new IllegalArgumentException("unequipped item may not be null");
        }
        if (!this.boots.equals(boots)) {
            throw new IllegalArgumentException("this item is not currently equipped");
        }
        Equipable previousHelmet = this.boots;
        this.boots = null;
        return previousHelmet;
    }

    /**
     *
     * @param weapon
     * the new weapon
     * @return the previously worn weapon
     */
    public Equipable equipItem(Weapon weapon) {
        if (weapon == null) {
            throw new IllegalArgumentException("equipped item may not be null");
        }
        Equipable previousItem = this.weapon;
        this.weapon = weapon;
        return previousItem;
    }
    /**
     *
     * @param weapon
     * the weapon to unequip
     * @return the unequipped weapon
     */
    public Equipable unequipItem(Weapon weapon) {
        if (weapon == null) {
            throw new IllegalArgumentException("unequipped item may not be null");
        }
        if (!this.weapon.equals(weapon)) {
            throw new IllegalArgumentException("this item is not currently equipped");
        }
        Equipable previousHelmet = this.weapon;
        this.weapon = null;
        return previousHelmet;
    }

    /**
     *
     * @param shield
     * the new shield
     * @return the previously worn shield
     */
    public Equipable equipItem(Shield shield) {
        if (shield == null) {
            throw new IllegalArgumentException("equipped item may not be null");
        }
        Equipable previousItem = this.shield;
        this.shield = shield;
        return previousItem;
    }
    /**
     *
     * @param shield
     * the shield to unequip
     * @return the unequipped shield
     */
    public Equipable unequipItem(Shield shield) {
        if (shield == null) {
            throw new IllegalArgumentException("unequipped item may not be null");
        }
        if (!this.shield.equals(shield)) {
            throw new IllegalArgumentException("this item is not currently equipped");
        }
        Equipable previousHelmet = this.shield;
        this.shield = null;
        return previousHelmet;
    }

    /**
     *
     * @param gloves
     * the new gloves
     * @return the previously worn gloves
     */
    public Equipable equipItem(Gloves gloves) {
        if (gloves == null) {
            throw new IllegalArgumentException("equipped item may not be null");
        }
        Equipable previousItem = this.gloves;
        this.gloves = gloves;
        return previousItem;
    }
    /**
     *
     * @param gloves
     * the gloves to unequip
     * @return the unequipped gloves
     */
    public Equipable unequipItem(Gloves gloves) {
        if (gloves == null) {
            throw new IllegalArgumentException("unequipped item may not be null");
        }
        if (!this.gloves.equals(gloves)) {
            throw new IllegalArgumentException("this item is not currently equipped");
        }
        Equipable previousHelmet = this.gloves;
        this.gloves = null;
        return previousHelmet;
    }

    /**
     *
     * @param necklace
     * the new necklace
     * @return the previously worn necklace
     */
    public Equipable equipItem(Necklace necklace) {
        if (necklace == null) {
            throw new IllegalArgumentException("equipped item may not be null");
        }
        Equipable previousItem = this.necklace;
        this.necklace = necklace;
        return previousItem;
    }
    /**
     *
     * @param necklace
     * the necklace to unequip
     * @return the unequipped necklace
     */
    public Equipable unequipItem(Necklace necklace) {
        if (necklace == null) {
            throw new IllegalArgumentException("unequipped item may not be null");
        }
        if (!this.necklace.equals(necklace)) {
            throw new IllegalArgumentException("this item is not currently equipped");
        }
        Equipable previousHelmet = this.necklace;
        this.necklace = null;
        return previousHelmet;
    }

    /**
     *
     * @param ring
     * the new ring
     * @return the previously worn ring
     */
    public Equipable equipItem(Ring ring) {
        if (ring == null) {
            throw new IllegalArgumentException("equipped item may not be null");
        }
        Equipable previousItem = this.ring;
        this.ring = ring;
        return previousItem;
    }
    /**
     *
     * @param ring
     * the ring to unequip
     * @return the unequipped ring
     */
    public Equipable unequipItem(Ring ring) {
        if (ring == null) {
            throw new IllegalArgumentException("unequipped item may not be null");
        }
        if (!this.ring.equals(ring)) {
            throw new IllegalArgumentException("this item is not currently equipped");
        }
        Equipable previousHelmet = this.ring;
        this.ring = null;
        return previousHelmet;
    }
    /**
     *
     * @param pouch
     * the new pouch
     * @return the previously worn pouch
     */
    public Equipable equipItem(Pouch pouch) {
        if (pouch == null) {
            throw new IllegalArgumentException("equipped item may not be null");
        }
        Equipable previousItem = this.pouch;
        this.pouch = pouch;
        return previousItem;
    }
    /**
     *
     * @param pouch
     * the pouch to unequip
     * @return the unequipped pouch
     */
    public Equipable unequipItem(Pouch pouch) {
        if (pouch == null) {
            throw new IllegalArgumentException("unequipped item may not be null");
        }
        if (!this.pouch.equals(pouch)) {
            throw new IllegalArgumentException("this item is not currently equipped");
        }
        Equipable previousHelmet = this.pouch;
        this.pouch = null;
        return previousHelmet;
    }

    public Helmet getHelmet() {
        return helmet;
    }

    public Body getBody() {
        return body;
    }

    public Legs getLegs() {
        return legs;
    }

    public Boots getBoots() {
        return boots;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Shield getShield() {
        return shield;
    }

    public Gloves getGloves() {
        return gloves;
    }

    public Necklace getNecklace() {
        return necklace;
    }

    public Ring getRing() {
        return ring;
    }

    public Pouch getPouch() {
        return pouch;
    }
    //    public void unequipHelmet() {
//        this.helmet = null;
//    }
}
