package com.geloodev;

import com.geloodev.controllers.CharacterController;
import com.geloodev.controllers.PlayerController;
import com.geloodev.models.Player;
import com.geloodev.strategies.character_classes.CharacterClassStrategy;
import com.geloodev.strategies.character_classes.DruidStrategy;
import com.geloodev.strategies.races.ElfStrategy;
import com.geloodev.strategies.races.RaceStrategy;
import com.geloodev.strategies.weapons.CrossbowStrategy;
import com.geloodev.strategies.weapons.WeaponStrategy;

public class Example2 {
    public static void main( String[] args ) {

        String name = "Maria";
        String email = "maria@gmail.com";
        String password = "maria123";

        PlayerController playerController = new PlayerController();
        playerController.create(name, email, password);



        String name2 = "Personagem de Maria";
        int strength = 2;
        int dexterity = 2;
        int constitution = 2;
        int  intelligence = 2;
        int winsdom = 2;
        int charisma = 2;
        RaceStrategy racesStrategy = new ElfStrategy();
        CharacterClassStrategy characterClassStrategy = new DruidStrategy();
        WeaponStrategy weaponStrategy = new CrossbowStrategy();
        Player player = playerController.get();

        CharacterController characterController = new CharacterController();
        characterController.create(name2, strength, dexterity, constitution, intelligence, winsdom, charisma, 
                                    racesStrategy, characterClassStrategy, weaponStrategy, player);

        
    }
}