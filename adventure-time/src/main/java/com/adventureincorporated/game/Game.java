package com.adventureincorporated.game;

import com.adventureincorporated.location.Location;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.java.Log;


@Setter
@Getter
@ToString
@Log
public class Game 
{
    private Player player;
    private Location location;
    private GameIO io;

    public Game(){
        this.io = new GameIO();
    }

    // Oyun logici nasil isleyecek ?
    public void start(){
        log.info("Starting game");

    }
}
