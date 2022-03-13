package com.adventureincorporated.location;

import com.adventureincorporated.game.Player;

public abstract class Location {
    public Player player;
    public String name;

    // on location method olacak
    // her location girildiginde on location calisacak
    // o location'a girilince ne yapilacagini belirtecek
    public abstract void onLocation();
}

