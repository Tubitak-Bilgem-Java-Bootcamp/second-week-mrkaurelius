package com.adventureincorporated.item;

import lombok.Data;

@Data
public class Inventory {
    public boolean water;
    public boolean food;
    public boolean wood;
    public String weaponName;
    public String armorName;
    public int weaponDamage;
    public int armorDefence;
}
