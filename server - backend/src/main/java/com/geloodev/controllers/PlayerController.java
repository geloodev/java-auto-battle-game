package com.geloodev.controllers;

import com.geloodev.daos.PlayerDAO;
import com.geloodev.models.Player;

public class PlayerController {

    private Player player;
    private PlayerDAO dao;
    
    public PlayerController() {
        player = new Player();
        dao = new PlayerDAO();
    }

    public void create(String name, String email, String password) {
        player.setName(name);
        player.setEmail(email);
        player.setPassword(password);
        dao.insert(player);
    }

    public Player get() {
        return dao.selectByName(player.getName());
    }
}
