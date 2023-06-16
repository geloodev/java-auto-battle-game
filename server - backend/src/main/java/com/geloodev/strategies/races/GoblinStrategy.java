package com.geloodev.strategies.races;

import com.geloodev.daos.RaceDAO;
import com.geloodev.models.Race;

public class GoblinStrategy implements RaceStrategy {
    
    public Race setRace() {
        return new RaceDAO().selectByName("Goblin");
    }
}
