package com.adventureincorporated.location;

import java.util.ArrayList;

import com.adventureincorporated.characters.npc.Zombie;
import com.adventureincorporated.item.basic.Food;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class CaveLocation extends BattleLocation {
    public final String name = "Cave";
    public Food food;
    public ArrayList<Zombie> zombies;

    public CaveLocation(ArrayList<Zombie> zombies) {
        this.food = new Food();
        this.zombies = zombies;
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
    // // TODO Auto-generated method stub

    // }
}