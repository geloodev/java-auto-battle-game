package com.geloodev;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.*;

import com.geloodev.controllers.CharacterController;
import com.geloodev.daos.CharacterDAO;
import com.geloodev.daos.WeaponDAO;
import com.geloodev.models.Character;
import com.geloodev.models.Weapon;
import com.geloodev.utils.FreeMarkerUtil;
import com.geloodev.utils.HibernateUtil;

import freemarker.template.Template;

public class App {
    
    public static void main(String[] args) throws IOException {
        
        FreeMarkerUtil.init();
        HibernateUtil.init();

        CharacterController characterController = new CharacterController(new Character(), new CharacterDAO());
        characterController.list();
    }

}
