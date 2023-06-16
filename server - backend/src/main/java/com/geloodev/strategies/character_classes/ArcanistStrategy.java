package com.geloodev.strategies.character_classes;

import com.geloodev.daos.CharacterClassDAO;
import com.geloodev.models.CharacterClass;

public class ArcanistStrategy implements CharacterClassStrategy {
    
    public CharacterClass setCharacterClass() {
        return new CharacterClassDAO().selectByName("Arcanist");
    }
}
