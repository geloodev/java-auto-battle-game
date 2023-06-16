package com.geloodev.strategies.weapons;

import com.geloodev.daos.WeaponDAO;
import com.geloodev.models.Weapon;

public class PistolStrategy implements WeaponStrategy {
    
    public Weapon setWeapon() {
        return new WeaponDAO().selectByName("Pistol");
    }
}
