package com.adventureincorporated.location;

import java.util.ArrayList;

import com.adventureincorporated.characters.npc.Vampire;
import com.adventureincorporated.item.basic.Wood;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ForestLocation extends BattleLocation {
    public final String name = "Forest"; 
    public Wood wood;
    public ArrayList<Vampire> vampires;

    public ForestLocation(ArrayList<Vampire> vampires) {
        this.wood = new Wood();
        this.vampires = vampires;
    }

    /**
     * Location properities: battle, loot
     */
    @Override
    public void onLocation() {
        // TODO Auto-generated method stub

    }

    // @Override
    // public void combat() {
    //     // TODO Auto-generated method stub

    // }
}