package com.adventureincorporated.location;

import java.util.ArrayList;

import com.adventureincorporated.characters.npc.Bear;
import com.adventureincorporated.item.basic.Water;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
public class RiverLocation extends BattleLocation {
    public final String name = "River";
    public Water water;
    public ArrayList<Bear> bears;

    public RiverLocation(ArrayList<Bear> bears){
        this.water = new Water();
        this.bears = bears;
    }

    /**
     * Location properities: battle, loot
     */
    @Override
    public void onLocation() {
        // TODO Auto-generated method stub
        
    }
}
