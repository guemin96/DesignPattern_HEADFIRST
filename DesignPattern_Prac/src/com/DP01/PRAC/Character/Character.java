package com.DP01.PRAC.Character;

import com.DP01.PRAC.WeaponBehavior.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public void fight(){
        weaponBehavior.useWeapon();
    }
}
