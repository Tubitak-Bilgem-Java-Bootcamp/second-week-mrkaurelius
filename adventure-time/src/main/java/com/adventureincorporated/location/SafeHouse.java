package com.adventureincorporated.location;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class SafeHouse extends NormalLocation {
    public final String name = "Safe House"; 

    /**
     * Location properity health recovery
     * 
     */
    @Override
    public void onLocation() {
        
    }
}
