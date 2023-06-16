package com.geloodev.controllers;

import com.geloodev.daos.CharacterDAO;
import com.geloodev.models.Character;
import com.geloodev.models.Player;
import com.geloodev.strategies.character_classes.CharacterClassStrategy;
import com.geloodev.strategies.races.RaceStrategy;
import com.geloodev.strategies.weapons.WeaponStrategy;

public class CharacterController {

    private Character character;
    private CharacterDAO dao;
    
    public CharacterController() {
        character = new Character();
        dao = new CharacterDAO();
    }

    public void create(String name, int strength, int dexterity, int constitution, int intelligence, int winsdom, int charisma, 
                        RaceStrategy raceStrategy, CharacterClassStrategy characterClassStrategy, WeaponStrategy weaponStrategy, 
                        Player player) {

        character.setName(name);
        character.setAttributes(strength, dexterity, constitution, intelligence, winsdom, charisma);
        character.setRace(raceStrategy.setRace());
        character.setCharacterClass(characterClassStrategy.setCharacterClass());
        character.setWeapon(weaponStrategy.setWeapon());
        character.setPlayer(player);

        dao.insert(character);
    }

    public Character get() {
        return dao.selectByName(character.getName());
    }

    public void delete() {
        dao.delete(character);
    }
}
