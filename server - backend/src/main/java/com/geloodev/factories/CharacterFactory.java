package com.geloodev.factories;

import java.util.UUID;

import com.geloodev.daos.CharacterClassDAO;
import com.geloodev.daos.RaceDAO;
import com.geloodev.daos.WeaponDAO;
import com.geloodev.models.Character;
import com.geloodev.models.CharacterClass;
import com.geloodev.models.Race;
import com.geloodev.models.Weapon;

import spark.Request;

public class CharacterFactory {
    
    public Character create(Request request) {
        String name = request.queryParams("name");
            int strength = Integer.valueOf(request.queryParams("strength"));
            int dexterity = Integer.valueOf(request.queryParams("dexterity"));
            int constitution = Integer.valueOf(request.queryParams("constitution"));
            int intelligence = Integer.valueOf(request.queryParams("intelligence"));
            int winsdom = Integer.valueOf(request.queryParams("winsdom"));
            int charisma = Integer.valueOf(request.queryParams("charisma"));
            UUID raceId = UUID.fromString(request.queryParams("race"));
            UUID characterClassId = UUID.fromString(request.queryParams("characterClass"));
            UUID weaponId = UUID.fromString(request.queryParams("weapon"));

            RaceDAO raceDAO = new RaceDAO();
            Race race = raceDAO.selectById(raceId);

            CharacterClassDAO characterClassDAO = new CharacterClassDAO();
            CharacterClass characterClass = characterClassDAO.selectById(characterClassId);

            WeaponDAO weaponDAO = new WeaponDAO();
            Weapon weapon =  weaponDAO.selectById(weaponId);

            return new Character(name, strength, dexterity, constitution, intelligence, winsdom, charisma, race, characterClass, weapon);
            
    }
}
