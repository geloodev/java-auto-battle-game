package com.geloodev.factories;

import com.geloodev.controllers.CharacterController;
import com.geloodev.daos.CharacterDAO;
import com.geloodev.models.Character;

public class CharacterControllerFactory {
    public CharacterController create() {
        Character character = new Character();
        CharacterDAO dao = new CharacterDAO();
        return new CharacterController(character, dao);
    }
}