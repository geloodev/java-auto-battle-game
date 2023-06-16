package com.geloodev;

import com.geloodev.controllers.CharacterController;
import com.geloodev.controllers.PlayerController;
import com.geloodev.models.Player;
import com.geloodev.strategies.character_classes.ArcanistStrategy;
import com.geloodev.strategies.character_classes.CharacterClassStrategy;
import com.geloodev.strategies.races.DwarfStrategy;
import com.geloodev.strategies.races.RaceStrategy;
import com.geloodev.strategies.weapons.BattleAxeStrategy;
import com.geloodev.strategies.weapons.WeaponStrategy;

public class Example1 {
    public static void main( String[] args ) {

        String name = "João";
        String email = "joao@gmail.com";
        String password = "joao123";

        PlayerController playerController = new PlayerController();
        playerController.create(name, email, password);



        String name2 = "Personagem do João";
        int strength = 1;
        int dexterity = 1;
        int constitution = 1;
        int  intelligence = 1;
        int winsdom = 1;
        int charisma = 1;
        RaceStrategy racesStrategy = new DwarfStrategy();
        CharacterClassStrategy characterClassStrategy = new ArcanistStrategy();
        WeaponStrategy weaponStrategy = new BattleAxeStrategy();
        Player player = playerController.get();

        CharacterController characterController = new CharacterController();
        characterController.create(name2, strength, dexterity, constitution, intelligence, winsdom, charisma, 
                                    racesStrategy, characterClassStrategy, weaponStrategy, player);
    }
}