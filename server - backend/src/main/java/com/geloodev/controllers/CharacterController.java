package com.geloodev.controllers;

import static spark.Spark.*;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.geloodev.daos.CharacterDAO;
import com.geloodev.models.Character;
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
        get("/characters", (request, response) -> {
            List<Character> characters = characterDAO.selectAll();
            
            Map<String, Object> map = new HashMap<>();
            map.put("characters", characters);

            Template template = FreeMarkerUtil.getConfiguration().getTemplate("characters/list.ftl");
            StringWriter writer = new StringWriter();
            template.process(map, writer);
            return writer;
        });
    }

    public void create() {
        characterDAO.insert(character);
    }

    public void update() {
        characterDAO.update(character);
    }

    public void delete() {
        characterDAO.delete(character);
    }
}
