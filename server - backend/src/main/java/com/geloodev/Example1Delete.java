package com.geloodev;

import com.geloodev.daos.CharacterDAO;
import com.geloodev.models.Character;

public class Example1Delete {
    public static void main( String[] args ) {

        Character character = new Character();
        CharacterDAO dao = new CharacterDAO();
        dao.delete(character);
    }
}