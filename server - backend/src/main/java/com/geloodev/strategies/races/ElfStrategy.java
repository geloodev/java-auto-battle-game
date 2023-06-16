package com.geloodev.strategies.races;

import com.geloodev.daos.RaceDAO;
import com.geloodev.models.Race;

public class ElfStrategy implements RaceStrategy {
    
    public Race setRace() {
        return new RaceDAO().selectByName("Elf");
    }
}
