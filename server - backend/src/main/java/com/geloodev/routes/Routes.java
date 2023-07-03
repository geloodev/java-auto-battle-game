package com.geloodev.routes;

import static spark.Spark.*;

import com.geloodev.controllers.CharacterController;

public class Routes {
    
    public static void init(CharacterController characterController) {
        path("/characters", () -> {
            characterController.list();
            characterController.createView();
            characterController.create();
        });
    }
}
