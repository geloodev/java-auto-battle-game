package com.geloodev.strategies.character_classes;

import com.geloodev.daos.CharacterClassDAO;
import com.geloodev.models.CharacterClass;

public class DruidStrategy implements CharacterClassStrategy {
    
    public CharacterClass setCharacterClass() {
        return new CharacterClassDAO().selectByName("Druid");
    }
}
