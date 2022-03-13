package com.adventureincorporated.game;

import com.adventureincorporated.location.Location;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;


@AllArgsConstructor
@Log
public class Game 
{
    public Player player;
    public Location location;

    // Oyun logici nasil isleyecek ?
    public void start(){
        log.info("Starting game");

    }
}
