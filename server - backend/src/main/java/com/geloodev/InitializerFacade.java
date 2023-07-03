package com.geloodev;

import com.geloodev.controllers.CharacterController;
import com.geloodev.factories.CharacterControllerFactory;
import com.geloodev.routes.Routes;
import com.geloodev.utils.FreeMarkerUtil;
import com.geloodev.utils.HibernateUtil;

public class InitializerFacade {
     
    public static void init() {
        FreeMarkerUtil.init();
        HibernateUtil.init();
        CharacterControllerFactory characterControllerFactory = new CharacterControllerFactory();
        CharacterController characterController = characterControllerFactory.create();
        Routes.init(characterController);
    }
}
