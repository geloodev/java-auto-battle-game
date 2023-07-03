package com.geloodev.controllers;

import static spark.Spark.*;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.geloodev.daos.CharacterClassDAO;
import com.geloodev.daos.CharacterDAO;
import com.geloodev.daos.RaceDAO;
import com.geloodev.daos.WeaponDAO;
import com.geloodev.factories.CharacterFactory;
import com.geloodev.models.Character;
import com.geloodev.models.CharacterClass;
import com.geloodev.models.Race;
import com.geloodev.models.Weapon;
import com.geloodev.utils.FreeMarkerUtil;

import freemarker.template.Template;

public class CharacterController {

    private Character character;
    private CharacterDAO characterDAO;
    
    public CharacterController(Character character, CharacterDAO characterDAO) {
        this.character = character;
        this.characterDAO = characterDAO;
    }

    public void list() {
        get("/list", (request, response) -> {
            List<Character> characters = characterDAO.selectAll();
            
            Map<String, Object> map = new HashMap<>();
            map.put("characters", characters);

            Template template = FreeMarkerUtil.getConfiguration().getTemplate("characters/list.ftl");
            StringWriter writer = new StringWriter();
            template.process(map, writer);
            return writer;
        });
    }

    public void createView() {
        get("/create", (request, response) -> {
            RaceDAO raceDAO = new RaceDAO();
            List<Race> races = raceDAO.selectAll();

            CharacterClassDAO characterClassDAO = new CharacterClassDAO();
            List<CharacterClass> characterClasses = characterClassDAO.selectAll();

            WeaponDAO weaponDAO = new WeaponDAO();
            List<Weapon> weapons = weaponDAO.selectAll();
            
            Map<String, Object> map = new HashMap<>();
            map.put("races", races);
            map.put("characterClasses", characterClasses);
            map.put("weapons", weapons);

            Template template = FreeMarkerUtil.getConfiguration().getTemplate("characters/create.ftl");
            StringWriter writer = new StringWriter();
            template.process(map, writer);
            return writer;
        });
    }

    public void create() {
        post("/create", (request, response) -> {
            CharacterFactory factory = new CharacterFactory();
            characterDAO.insert(factory.create(request));
            return "Character created successfully";
        });
    }

    public void update() {
        characterDAO.update(character);
    }

    public void delete() {
        characterDAO.delete(character);
    }
}
