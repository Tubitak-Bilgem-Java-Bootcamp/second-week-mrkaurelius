package com.adventureincorporated.game;

import com.adventureincorporated.item.Inventory;

import lombok.Data;

// @Setter
// @Getter
// @ToString
// @AllArgsConstructor
@Data
public class Player {
    public Inventory inventory;
    public int damage;
    public int health;
    public int money;
    public int name;
}
