package com.geloodev.strategies.weapons;

import com.geloodev.daos.WeaponDAO;
import com.geloodev.models.Weapon;

public class SwordStrategy implements WeaponStrategy {
    
    public Weapon setWeapon() {
        return new WeaponDAO().selectByName("Sword");
    }
}
