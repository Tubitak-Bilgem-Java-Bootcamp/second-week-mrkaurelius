package com.adventureincorporated.item;

import lombok.Data;

@Data
public class Inventory {
    public boolean water;
    public boolean food;
    // Bu typo olabilir mi ?
    public boolean firewoord;
    public String weaponName;
    public String armorName;
    public int weaponDamage;
    public int armorDefence;
}
